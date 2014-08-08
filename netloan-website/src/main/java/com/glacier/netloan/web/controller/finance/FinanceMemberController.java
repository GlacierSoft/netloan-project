/*
 * @(#)FinanceMemberController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.finance;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.finance.FinTransactionQueryDTO;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.finance.FinanceBankCardService;
import com.glacier.netloan.service.finance.FinanceMemberService;
import com.glacier.netloan.service.finance.FinanceRechargeSetService;
import com.glacier.netloan.service.finance.FinanceTransactionService;
import com.glacier.netloan.service.finance.FinanceWithdrawService;
import com.glacier.netloan.service.member.MemberService;

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
    
    @Autowired
    private MemberService memberService; 
    
    //转到“充值提现”页面前作出完善资料的判断
  	@RequestMapping(value = "/judgeCheckRechargeWithdraw.json", method = RequestMethod.POST)
  	@ResponseBody
  	public Object judgeRechargeWithdraw(@RequestParam String memberId){
          return memberService.checkMemberDatum(memberId);
  	}
    
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
            mav.addObject("financeRechargeSetDatas",financeRechargeSetService.listWebsite(pricipalMember.getMemberId()));
            mav.addObject("financeBankCardDatas",bankCardService.getBankCardByMemberId(pricipalMember.getMemberId()));
        }
        return mav;
  	} 
}
