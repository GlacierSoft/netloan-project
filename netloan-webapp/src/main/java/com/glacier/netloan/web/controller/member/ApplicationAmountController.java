package com.glacier.netloan.web.controller.member;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.entity.member.ApplicationAmount;
import com.glacier.netloan.service.member.ApplicationAmountService;

/**
 * @ClassName: ApplicationAmount 
 * @Description: TODO(申请额度控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-19下午5:46:24
 */
@Controller
@RequestMapping(value = "amount")
public class ApplicationAmountController extends AbstractController{

	@Autowired
	private ApplicationAmountService applicationAmountService;// 注入申请额度业务Bean
	
	// 进入申请额度列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPamount() {
        ModelAndView mav = new ModelAndView("member_mgr/amount_mgr/amount");
        return mav;
    }
    
    // 进入申请额度Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoApplicationAmountFormPamount(String appAmountId) {
        ModelAndView mav = new ModelAndView("member_mgr/amount_mgr/amount_form");
        if(StringUtils.isNotBlank(appAmountId)){
            mav.addObject("amountData", applicationAmountService.getApplicationAmount(appAmountId));
        }
        return mav;
    }
    
    // 进入申请额度Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoApplicationAmountDetailPage(String appAmountId) {
        ModelAndView mav = new ModelAndView("member_mgr/amount_mgr/amount_detail");
        if(StringUtils.isNotBlank(appAmountId)){
            mav.addObject("amountData", applicationAmountService.getApplicationAmount(appAmountId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer) {
        return applicationAmountService.listAsGrid(pservicer);
    }
    
    // 增加申请额度
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addApplicationAmount(@Valid ApplicationAmount amount, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return applicationAmountService.addApplicationAmount(amount);
    }
    
    // 修改申请额度
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editApplicationAmount(@Valid ApplicationAmount amount, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return applicationAmountService.editApplicationAmount(amount);
    }
    
    // 批量删除申请额度
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delApplicationAmount(@RequestParam List<String> appAmountIds,@RequestParam List<String> memberIds) {
    	return applicationAmountService.delApplicationAmount(appAmountIds, memberIds);
    }
}
