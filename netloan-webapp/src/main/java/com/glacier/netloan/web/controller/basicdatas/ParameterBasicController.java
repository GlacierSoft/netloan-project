/*
 * @(#)ParameterBasicController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.basicdatas;

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
import com.glacier.netloan.entity.basicdatas.ParameterBasic;
import com.glacier.netloan.service.basicdatas.ParameterBasicService;

/**
 * @ClassName: ParameterBasicController 
 * @Description: TODO(基础参数控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-12下午4:44:13
 */
@Controller
@RequestMapping(value = "/parameterBasic")
public class ParameterBasicController extends AbstractController{

    @Autowired
    private ParameterBasicService parameterBasicService;// 注入基础参数业务Bean
    
    // 进入基础参数列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPparameterBasic() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/parameterBasic_mgr/parameterBasic");
        return mav;
    }
    
    // 进入基础参数Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoCreditTypeFormPparameterBasic(String basicId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/parameterBasic_mgr/parameterBasic_form");
        if(StringUtils.isNotBlank(basicId)){
            mav.addObject("parameterBasicData", parameterBasicService.getParameterBasic(basicId));
        }
        return mav;
    }
    
    // 进入基础参数Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoCreditTypeDetailPage(String basicId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/parameterBasic_mgr/parameterBasic_detail");
        if(StringUtils.isNotBlank(basicId)){
            mav.addObject("parameterBasicData", parameterBasicService.getParameterBasic(basicId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pager) {
        return parameterBasicService.listAsGrid(pager);
    }
    
    // 增加基础参数
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addCreditType(@Valid ParameterBasic parameterBasic, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parameterBasicService.addParameterBasic(parameterBasic);
    }
    
    // 修改基础参数
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParameterBasic parameterBasic, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parameterBasicService.editParameterBasic(parameterBasic);
    }
    
    // 批量删除基础参数
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delCreditTypes(@RequestParam List<String> basicIds,@RequestParam List<String> basicTitles) {
    	return parameterBasicService.delParameterBasics(basicIds, basicTitles);
    }
}
