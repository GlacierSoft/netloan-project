/*
 * @(#)ParameteroptgroupValueController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
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
import com.glacier.netloan.entity.basicdatas.ParameterOptgroupValue;
import com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService;

/** 
 * @ClassName: ParameteroptgroupValueController 
 * @Description: TODO(下拉项的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/optgroupValue")
public class ParameterOptgroupValueController extends AbstractController{

    @Autowired
    private ParameterOptgroupValueService optgroupValueService;// 注入下拉项业务Bean
    
    // 进入下拉项列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPoptgroupValue() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/optgroupValue_mgr/optgroupValue");
        return mav;
    }
    

    
    // 进入下拉项Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intooptgroupValueFormPoptgroupValue(String optgroupValueId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/optgroupValue_mgr/optgroupValue_form");
        if(StringUtils.isNotBlank(optgroupValueId)){
            mav.addObject("optgroupValueData", optgroupValueService.getOptgroupValue(optgroupValueId));
        }
        return mav;
    }
    
//    // 获取表格结构的所有菜单数据
//    @RequestMapping(value = "/optgroupValue/list.json", method = RequestMethod.POST)
//    @ResponseBody
//    private Object listActionAsGridByMenuId(String menuId, JqPager pager) {
//        return optgroupValueService.listAsGrid(pager);
//    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/optgroupValue/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listValueAsGridByOptgroupId(String optgroupId,JqPager pager) {
        return optgroupValueService.listAsGrid(optgroupId,pager);
    }
    
    // 增加下拉项
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addoptgroupValue(@Valid ParameterOptgroupValue optgroupValue, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return optgroupValueService.addOptgroupValue(optgroupValue);
    }
    
    // 修改下拉项
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParameterOptgroupValue optgroupValue, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return optgroupValueService.editOptgroupValue(optgroupValue);
    }
    
    // 删除下拉项
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object del(String optgroupValueId) {
    	return optgroupValueService.delOptgroupValue(optgroupValueId);
    }
}
