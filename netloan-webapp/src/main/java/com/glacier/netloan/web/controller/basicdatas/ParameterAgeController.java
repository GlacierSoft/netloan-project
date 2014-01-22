/*
 * @(#)ParameterAgeController.java
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
import com.glacier.netloan.entity.basicdatas.ParameterAge;
import com.glacier.netloan.entity.sysmgr.Role;
import com.glacier.netloan.service.basicdatas.ParameterAgeService;

/** 
 * @ClassName: ParameterAgeController 
 * @Description: TODO(会员年龄别称的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/age")
public class ParameterAgeController extends AbstractController{

    @Autowired
    private ParameterAgeService ageService;// 注入角色业务Bean
    
    // 进入角色列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPage() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/age_mgr/age");
        return mav;
    }
    
    // 进入角色Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoAgeFormPage(String ageId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/age_mgr/age_form");
        if(StringUtils.isNotBlank(ageId)){
            mav.addObject("ageData", ageService.getAge(ageId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(String menuId, JqPager pager) {
        return ageService.listAsGrid(pager);
    }
    
    // 增加角色
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addAge(@Valid ParameterAge age, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return ageService.addAge(age);
    }
    
    // 修改角色
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParameterAge age, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return ageService.editAge(age);
    }
}
