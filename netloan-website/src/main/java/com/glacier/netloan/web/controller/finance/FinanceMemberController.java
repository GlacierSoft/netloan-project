/*
 * @(#)FinanceMemberController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.finance;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
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
import com.glacier.netloan.dto.query.finance.FinFinanceMemberQueryDTO;
import com.glacier.netloan.dto.query.finance.FinTransactionQueryDTO;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.finance.FinanceBankCardService;
import com.glacier.netloan.service.finance.FinanceMemberService;
import com.glacier.netloan.service.finance.FinanceRechargeSetService;
import com.glacier.netloan.service.finance.FinanceTransactionService;
import com.glacier.netloan.service.finance.FinanceWithdrawService;

/** 
 * @ClassName: FinanceMemberController 
 * @Description: TODO(会员资金记录的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/financeMember")
public class FinanceMemberController extends AbstractController{

    @Autowired
    private FinanceMemberService financeMemberService;// 注入会员资金记录业务Bean
    
    @Autowired
    private FinanceTransactionService financeTransactionService;// 注入会员资金记录明细业务Bean
    
    @Autowired
    private FinanceWithdrawService financeWithdrawService;// 注入会员提现业务Bean
    
    @Autowired
    private FinanceRechargeSetService financeRechargeSetService;// 注入会员充值设置业务Bean
    
    @Autowired
    private FinanceBankCardService bankCardService;
    
    //转到“充值提现”页面
  	@RequestMapping(value = "/rechargeWithdraw.htm")
  	public Object rechargeWithdraw(JqPager pager,FinTransactionQueryDTO finTransactionQueryDTO, int p){
  		ModelAndView mav = new ModelAndView("member_mgr/rechargeWithdraw");
  		Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
  		Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        if(StringUtils.isNotBlank(pricipalMember.getMemberId())){
            mav.addObject("financeMemberData", financeMemberService.getFinanceMemberByMemberId(pricipalMember.getMemberId()));
            mav.addObject("financeTransactionDatas",financeTransactionService.listAsWebsite(pager, finTransactionQueryDTO, pricipalMember.getMemberId(), p));
            mav.addObject("financeWithdrawDatas",financeWithdrawService.listAsWebsite(pager, pricipalMember.getMemberId(), p));
            mav.addObject("financeRechargeSetDatas",financeRechargeSetService.listWebsite());
            mav.addObject("financeBankCardDatas",bankCardService.getBankCardByMemberId(pricipalMember.getMemberId()));
        }
        return mav;
  	}
  	
    // 进入会员资金记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPfinanceMember() {
        ModelAndView mav = new ModelAndView("finance_mgr/financeMember_mgr/financeMember");
        return mav;
    }
    
    // 进入会员资金记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberDetailPage(String financeMemberId) {
        ModelAndView mav = new ModelAndView("finance_mgr/financeMember_mgr/financeMember_detail");
        if(StringUtils.isNotBlank(financeMemberId)){
            mav.addObject("financeMemberData", financeMemberService.getFinanceMember(financeMemberId));
        }
        return mav;
    }
    
    // 进入会员资金audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditMember(String financeMemberId) {
        ModelAndView mav = new ModelAndView("finance_mgr/financeMember_mgr/financeMember_audit");
        if(StringUtils.isNotBlank(financeMemberId)){
            mav.addObject("financeMemberData", financeMemberService.getFinanceMember(financeMemberId));
        }
        return mav;
    }
    
    // 审核会员资金记录
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditMember(@Valid FinanceMember financeMember, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financeMemberService.auditMember(financeMember);
    }
    
    // 获取表格结构的所有会员资金记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listMemberAsGridByMenuId(FinFinanceMemberQueryDTO financeMemberQueryDTO,JqPager pager) {
        return financeMemberService.listAsGrid(financeMemberQueryDTO,pager);
    }
    
    // 批量删除会员资金记录
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delMember(@RequestParam List<String> financeMemberIds,@RequestParam List<String> memberCodes) {
    	return financeMemberService.delMember(financeMemberIds, memberCodes);
    }
}
