/*
 * @(#)BorrowingLoanController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.borrow;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.service.borrow.BorrowingLoanService;
import com.glacier.netloan.service.borrow.LoanTenderService;
import com.glacier.netloan.service.borrow.RepaymentNotesDetailService;
import com.glacier.netloan.service.member.MemberStatisticsService;

/** 
 * @ClassName: BorrowingLoanController 
 * @Description: TODO(借款的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/borrowingLoan")
public class BorrowingLoanController extends AbstractController{

    @Autowired
    private BorrowingLoanService borrowingLoanService;// 注入借款业务Bean
    
    @Autowired
    private LoanTenderService loanTenderService;
    
    @Autowired
    private MemberStatisticsService memberStatisticsService;
    
    @Autowired
    private RepaymentNotesDetailService repaymentNotesDetailService;
    
    // 进入借款列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPborrowingLoan() {
        ModelAndView mav = new ModelAndView("borrow_mgr/borrowingLoan_mgr/borrowingLoan");
        return mav;
    }
    
    // 进入借款Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoBorrowingLoanFormPborrowingLoan(String loanId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/borrowingLoan_mgr/borrowingLoan_form");
        if(StringUtils.isNotBlank(loanId)){
            mav.addObject("borrowingLoanData", borrowingLoanService.getBorrowingLoan(loanId));
        }
        return mav;
    }
    
    // 进入借款Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoBorrowingLoanDetailPage(String loanId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/borrowingLoan_mgr/borrowingLoan_detail");
        if(StringUtils.isNotBlank(loanId)){
            mav.addObject("borrowingLoanData", borrowingLoanService.getBorrowingLoan(loanId));
        }
        return mav;
    }
    
    // 获取表格结构的所有借款数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listBorrowingLoanAsGridByMenuId(JqPager jqPager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String loanState) {
        return borrowingLoanService.listAsGrid(jqPager, borrowingLoanQueryDTO, loanState);
    }
    
    // 增加借款
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addBorrowingLoan(@Valid BorrowingLoan borrowingLoan, BindingResult bindingResult, String captcha,HttpServletRequest request, HttpSession session) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        String isCaptcha = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        boolean captchaBoolean = true;
        if (StringUtils.isBlank(captcha) || !isCaptcha.equalsIgnoreCase(captcha)) {
        	captchaBoolean = false;
        }
        return borrowingLoanService.addBorrowingLoan(borrowingLoan, captchaBoolean);
    }
    
    // 修改借款
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editBorrowingLoan(@Valid BorrowingLoan borrowingLoan, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return borrowingLoanService.editBorrowingLoan(borrowingLoan);
    }
    
    // 批量删除借款
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delAdv(@RequestParam List<String> loanIds,@RequestParam List<String> loanCodes) {
    	return borrowingLoanService.delBorrowingLoan(loanIds, loanCodes);
    }
    
	//转到“流转标申请页面”页面
	@RequestMapping(value = "/enteringLiuZhuan.htm")
	public Object enteringLiuZhuan(){
	    ModelAndView mav = new ModelAndView("borrow_mgr/enteringLiuZhuan");
        mav.addObject("loanTenderDate",loanTenderService.getLoanTender("2587bd0ecc859e35f2874f2aff0d4852"));
        //根据标种类型Id查找相关联的还款方式
        mav.addObject("loanTenderRepayDate",loanTenderService.getLoanTenderRepay("2587bd0ecc859e35f2874f2aff0d4852"));
        return mav;
	}
	
	//转到“抵押标申请页面”页面
	@RequestMapping(value = "/enteringDiYa.htm")
	public Object enteringDiYa(){
        ModelAndView mav = new ModelAndView("borrow_mgr/enteringDiYa");
        mav.addObject("loanTenderDate",loanTenderService.getLoanTender("aa09e227a4a40cb6cb15703b98522672"));
        //根据标种类型Id查找相关联的还款方式
        mav.addObject("loanTenderRepayDate",loanTenderService.getLoanTenderRepay("aa09e227a4a40cb6cb15703b98522672"));
        return mav;
	}
	
	//转到“信用标申请页面”页面
	@RequestMapping(value = "/enteringXinYong.htm")
	public Object enteringXinYong(){
	    ModelAndView mav = new ModelAndView("borrow_mgr/enteringXinYong");
        mav.addObject("loanTenderDate",loanTenderService.getLoanTender("1c362eac7ec315aa47ab84360d4e390d"));
        //根据标种类型Id查找相关联的还款方式
        mav.addObject("loanTenderRepayDate",loanTenderService.getLoanTenderRepay("1c362eac7ec315aa47ab84360d4e390d"));
        return mav;
	}
	
	//转到“净值标申请页面”页面
	@RequestMapping(value = "/enteringJingZhi.htm")
	public Object enteringJingZhi(){
		ModelAndView mav = new ModelAndView("borrow_mgr/enteringJingZhi");
		mav.addObject("loanTenderDate",loanTenderService.getLoanTender("9788195653f335695256551b82fcbac6"));
		//根据标种类型Id查找相关联的还款方式
		mav.addObject("loanTenderRepayDate",loanTenderService.getLoanTenderRepay("9788195653f335695256551b82fcbac6"));
		return mav;
	}
	
	//转到会员中心的我要借款的“借款列表”和“还款管理”页面
	@RequestMapping(value = "/memberBorrow.htm")
	public Object memberBorrow(JqPager jqPager, int p, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String pagetype){
	    
		String website = "member_mgr/memberBorrow";
		if ("repaymenting".equals(borrowingLoanQueryDTO.getLoanState()) || "completed".equals(borrowingLoanQueryDTO.getLoanState())){
			website = "member_mgr/memberRepayment";
		}
		ModelAndView mav = new ModelAndView(website);
		if ("firstAudit".equals(borrowingLoanQueryDTO.getLoanState())) {
		    mav.addObject("buttonState","firstAudit");
		} else if ("tendering".equals(borrowingLoanQueryDTO.getLoanState())) {
		    mav.addObject("buttonState","tendering");
		} else if ("repaymenting".equals(borrowingLoanQueryDTO.getLoanState())) {
            mav.addObject("buttonState","repaymenting");
        } else if ("completed".equals(borrowingLoanQueryDTO.getLoanState())) {
            mav.addObject("buttonState","completed");
        }
		mav.addObject("borrowingDatas",borrowingLoanService.listAsGridWebsite(jqPager, borrowingLoanQueryDTO, pagetype, p));
		return mav;
	}
	
	//转到"会员中心"-"我要借款"-"正在还款的借款"-"还款明细"的页面
    @RequestMapping(value = "/memberRepaymentDetail.htm")
    public Object memberRepaymentDetail(JqPager jqPager, int p, String loanId, String memberId){
        ModelAndView mav = new ModelAndView("member_mgr/memberRepaymentDetail");
        mav.addObject("borrowingLoan",borrowingLoanService.getBorrowingLoan(loanId));
        mav.addObject("repaymentNotesDetailsDatas",repaymentNotesDetailService.listByRepDetailLoadIdOrMemberId(jqPager, p, loanId, memberId));
        return mav;
    }
	
	//转到会员中心的我要借款的“借款统计”页面
	@RequestMapping(value = "/memberStatistics.htm")
	public Object memberStatistics(String memberId){
		ModelAndView mav = new ModelAndView("member_mgr/memberStatistics");
		mav.addObject("memberStatisticsDate",memberStatisticsService.getStatisticsByMember(memberId));
		return mav;
	}
}
