/*
 * @(#)RepaymentTypeController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.borrow;

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
import com.glacier.netloan.entity.borrow.RepaymentType;
import com.glacier.netloan.service.borrow.RepaymentTypeService;

/** 
 * @ClassName: RepaymentTypeController 
 * @Description: TODO(还款方式的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/repaymentType")
public class RepaymentTypeController extends AbstractController{

    @Autowired
    private RepaymentTypeService repaymentTypeService;// 注入还款方式业务Bean
    
    // 进入还款方式列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPrepaymentType() {
        ModelAndView mav = new ModelAndView("borrow_mgr/repaymentType_mgr/repaymentType");
        return mav;
    }
    
    // 进入还款方式Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoRepaymentTypeFormPrepaymentType(String repaymentTypeId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/repaymentType_mgr/repaymentType_form");
        if(StringUtils.isNotBlank(repaymentTypeId)){
            mav.addObject("repaymentTypeData", repaymentTypeService.getRepaymentType(repaymentTypeId));
        }
        return mav;
    }
    
    // 进入还款方式Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoRepaymentTypeDetailPage(String repaymentTypeId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/repaymentType_mgr/repaymentType_detail");
        if(StringUtils.isNotBlank(repaymentTypeId)){
            mav.addObject("repaymentTypeData", repaymentTypeService.getRepaymentType(repaymentTypeId));
        }
        return mav;
    }
    
    // 获取表格结构的所有还款方式数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listRepaymentTypeAsGridByMenuId(JqPager jqPager) {
        return repaymentTypeService.listAsGrid(jqPager);
    }
    
    // 增加还款方式
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addRepaymentType(@Valid RepaymentType repaymentType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return repaymentTypeService.addRepaymentType(repaymentType);
    }
    
    // 修改还款方式
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRepaymentType(@Valid RepaymentType repaymentType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return repaymentTypeService.editRepaymentType(repaymentType);
    }
    
    // 批量删除还款方式
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delRepaymentType(@RequestParam List<String> repaymentTypeIds,@RequestParam List<String> repaymentTypeNames) {
    	return repaymentTypeService.delRepaymentType(repaymentTypeIds, repaymentTypeNames);
    }
}
