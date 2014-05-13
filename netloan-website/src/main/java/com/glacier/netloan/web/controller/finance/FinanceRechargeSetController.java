/*
 * @(#)FinanceRechargeSetController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.finance;

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
import com.glacier.netloan.entity.finance.FinanceRechargeSet;
import com.glacier.netloan.service.finance.FinanceRechargeSetService;

/** 
 * @ClassName: FinanceRechargeSetController 
 * @Description: TODO(会员充值设置的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/rechargeSet")
public class FinanceRechargeSetController extends AbstractController{

    @Autowired
    private FinanceRechargeSetService financeRechargeSetService;// 注入会员充值设置业务Bean
    
    // 进入会员充值设置列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPfinanceRechargeSet() {
        ModelAndView mav = new ModelAndView("finance_mgr/rechargeSet_mgr/rechargeSet");
        return mav;
    }
    
    // 进入会员充值设置Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoRechargeSetFormPfinanceRechargeSet(String financeRechargeSetId) {
        ModelAndView mav = new ModelAndView("finance_mgr/rechargeSet_mgr/rechargeSet_form");
        if(StringUtils.isNotBlank(financeRechargeSetId)){
            mav.addObject("rechargeSetData", financeRechargeSetService.getRechargeSet(financeRechargeSetId));
        }
        return mav;
    }
    
    // 进入会员充值设置audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditRechargeSet(String financeRechargeSetId) {
        ModelAndView mav = new ModelAndView("finance_mgr/rechargeSet_mgr/rechargeSet_audit");
        if(StringUtils.isNotBlank(financeRechargeSetId)){
            mav.addObject("rechargeSetData", financeRechargeSetService.getRechargeSet(financeRechargeSetId));
        }
        return mav;
    }
    
    // 进入会员充值设置Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoRechargeSetDetailPage(String financeRechargeSetId) {
        ModelAndView mav = new ModelAndView("finance_mgr/rechargeSet_mgr/rechargeSet_detail");
        if(StringUtils.isNotBlank(financeRechargeSetId)){
            mav.addObject("rechargeSetData", financeRechargeSetService.getRechargeSet(financeRechargeSetId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员充值设置数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listRechargeSetAsGridByMenuId(JqPager pfinanceRechargeSetr) {
        return financeRechargeSetService.listAsGrid(pfinanceRechargeSetr);
    }
    
    // 增加会员充值设置
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addRechargeSet(@Valid FinanceRechargeSet financeRechargeSet, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financeRechargeSetService.addRechargeSet(financeRechargeSet);
    }
    
    // 修改会员充值设置
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRechargeSet(@Valid FinanceRechargeSet financeRechargeSet, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financeRechargeSetService.editRechargeSet(financeRechargeSet);
    }
    
    // 审核会员充值设置
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditRechargeSet(@Valid FinanceRechargeSet financeRechargeSet, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financeRechargeSetService.auditRechargeSet(financeRechargeSet);
    }
    
    // 批量删除会员充值设置
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delRechargeSet(@RequestParam List<String> financeRechargeSetIds,@RequestParam List<String> rechargeSetNames) {
    	return financeRechargeSetService.delRechargeSet(financeRechargeSetIds, rechargeSetNames);
    }
}
