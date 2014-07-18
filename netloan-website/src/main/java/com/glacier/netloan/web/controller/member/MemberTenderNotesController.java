/*
 * @(#)memberCreditIntegralController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.member;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dao.borrow.ReceivablesNotesMapper;
import com.glacier.netloan.dao.borrow.RepaymentNotesMapper;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.ReceivablesNotes;
import com.glacier.netloan.entity.borrow.ReceivablesNotesExample;
import com.glacier.netloan.entity.borrow.RepaymentNotes;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetail;
import com.glacier.netloan.entity.borrow.RepaymentNotesExample;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.borrow.BorrowingLoanService;
import com.glacier.netloan.service.borrow.ReceivablesNotesService;
import com.glacier.netloan.service.borrow.RepaymentNotesDetailService;
import com.glacier.netloan.service.borrow.RepaymentNotesService;
import com.glacier.netloan.service.borrow.TenderNotesService;
import com.glacier.netloan.service.member.MemberCreditIntegralService;
import com.glacier.netloan.service.member.MemberService;

/** 
 * @ClassName: memberTenderNotesController 
 * @Description: TODO(前台我的投标的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/memberTenderNotes")
public class MemberTenderNotesController extends AbstractController{

	@Autowired
	private TenderNotesService tenderNotesService;
	
	@Autowired
	private BorrowingLoanService borrowingLoanService;
	
	@Autowired
	private RepaymentNotesService repaymentNotesService;
	
	@Autowired
	private RepaymentNotesDetailService repaymentNotesDetailService;
	
	@Autowired
	private ReceivablesNotesService ReceivablesNotesService;
	
	@Autowired
	private MemberService memberService;
    
	
    // 进入查看协议书的详细信息页面
    @RequestMapping(value = "/agreement.htm")
    private Object intoIndexCreditIntegral(String memberId,String loanId) {
        ModelAndView mav = new ModelAndView("member_mgr/agreement");
        //查找出借款人的信息
        BorrowingLoan borrowingLoan = (BorrowingLoan) borrowingLoanService.getBorrowingLoan(loanId);
        mav.addObject("borrowingLoan", borrowingLoan);
        //----------------------------------收款人操作-------------------------------------------------
        mav.addObject("receivablesNotesList", ReceivablesNotesService.getReceivablesNotesList(loanId));
        //查找借款人的信息
        mav.addObject("member", memberService.getMember(borrowingLoan.getMemberId()));
        //----------------------------------还款人操作-------------------------------------------------
        //根据相关借款的查找出还款记录
        List<RepaymentNotes> repaymentNotesList = (List<RepaymentNotes>) repaymentNotesService.getRepaymentNotesLoan(loanId);
        mav.addObject("repaymentNotes", repaymentNotesList);
        //根据相关还款记录ID查找出还款记录明细信息中第一期的信息
        mav.addObject("repaymentNotesStartTime", repaymentNotesDetailService.getRepaymentNotesDetailStart(repaymentNotesList.get(0).getRepayNotesId()));
        //根据相关还款记录ID查找出还款记录明细信息中最后一期的信息
        mav.addObject("repaymentNotesEndTime", repaymentNotesDetailService.getRepaymentNotesDetailEnd(repaymentNotesList.get(0).getRepayNotesId(),Integer.parseInt(borrowingLoan.getLoanDeadlinesId())));
        //根据还款记录明细Id获取所有关联此ID的还款记录明细信息
        mav.addObject("repaymentNotesList", repaymentNotesDetailService.getRepaymentNotesDetailList(repaymentNotesList.get(0).getRepayNotesId()));
        return mav;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
