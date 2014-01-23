package com.glacier.netloan.web.controller.basicdatas;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.entity.basicdatas.ParameterIntegral;
import com.glacier.netloan.service.basicdatas.ParameterIntegralService;

/**
 * 
 * @ClassName: ParameterIntegralController 
 * @Description: TODO(会员积分级别的控制类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-1-22下午3:55:03
 */
@Controller()
@RequestMapping(value="/integral")
public class ParameterIntegralController extends AbstractController{

	@Autowired
	private ParameterIntegralService parameterIntegralService;// 注入会员信用等级业务Bean
	
    // 进入会员等级业务列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPage() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/integral_mgr/integral");
        return mav;
    }
    
    // 进入角色Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoIntegralFormPage(String integralId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/integral_mgr/integral_form");
        if(StringUtils.isNotBlank(integralId)){
            mav.addObject("integralData", parameterIntegralService.getIntegral(integralId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员信用等级数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listIntegralAsGridByMenuId(String menuId, JqPager pager) {
        return parameterIntegralService.listAsGrid(pager);
    }
    // 增加会员信用等级
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addIntegral(@Valid ParameterIntegral parameterIntegral, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parameterIntegralService.addParameterIntegral(parameterIntegral);
    }
    
    // 修改会员信用等级
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editIntegral(@Valid ParameterIntegral parameterIntegral, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parameterIntegralService.editParameterIntegral(parameterIntegral);
    }
    // 删除会员信用等级
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    private Object delIntegral(String integralId) {
        return parameterIntegralService.delIntegral(integralId);
    }
}
