/*
 * @(#)FinanceWithdrawController.java
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
import com.glacier.netloan.dto.query.finance.FinWithdrawQueryDTO;
import com.glacier.netloan.entity.finance.FinanceWithdraw;
import com.glacier.netloan.service.finance.FinanceWithdrawService;

/** 
 * @ClassName: FinanceWithdrawController 
 * @Description: TODO(会员提现记录的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/withdraw")
public class FinanceWithdrawController extends AbstractController{

    @Autowired
    private FinanceWithdrawService financeWithdrawService;// 注入会员提现记录业务Bean
    
    // 进入会员提现记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPfinanceWithdraw() {
        ModelAndView mav = new ModelAndView("finance_mgr/withdraw_mgr/withdraw");
        return mav;
    }
    
    // 进入会员提现记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoWithdrawDetailPage(String financeWithdrawId) {
        ModelAndView mav = new ModelAndView("finance_mgr/withdraw_mgr/withdraw_detail");
        if(StringUtils.isNotBlank(financeWithdrawId)){
            mav.addObject("withdrawData", financeWithdrawService.getWithdraw(financeWithdrawId));
        }
        return mav;
    }
    
    // 进入会员提现audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditWithdraw(String financeWithdrawId) {
        ModelAndView mav = new ModelAndView("finance_mgr/withdraw_mgr/withdraw_audit");
        if(StringUtils.isNotBlank(financeWithdrawId)){
            mav.addObject("withdrawData", financeWithdrawService.getWithdraw(financeWithdrawId));
        }
        return mav;
    }
    
    // 审核会员提现记录
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditWithdraw(@Valid FinanceWithdraw financeWithdraw, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financeWithdrawService.auditWithdraw(financeWithdraw);
    }
    
    // 获取表格结构的所有会员提现记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listWithdrawAsGridByMenuId(FinWithdrawQueryDTO withdrawQueryDTO,JqPager pfinanceWithdrawr) {
        return financeWithdrawService.listAsGrid(withdrawQueryDTO,pfinanceWithdrawr);
    }
    
    // 批量删除会员提现记录
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delWithdraw(@RequestParam List<String> financeWithdrawIds,@RequestParam List<String> withdrawCodes) {
    	return financeWithdrawService.delWithdraw(financeWithdrawIds, withdrawCodes);
    }
}
