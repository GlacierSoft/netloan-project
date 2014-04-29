/*
 * @(#)BorrowingLoanController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.borrow;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
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
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.service.borrow.BorrowingLoanService;
import com.glacier.netloan.service.borrow.LoanTenderService;
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
    private Object addBorrowingLoan(@Valid BorrowingLoan borrowingLoan, BindingResult bindingResult, String memberId) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return borrowingLoanService.addBorrowingLoan(borrowingLoan, memberId);
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
		return "borrow_mgr/enteringLiuZhuan";
	}
	
	//转到“抵押标申请页面”页面
	@RequestMapping(value = "/enteringDiYa.htm")
	public Object enteringDiYa(){
		return "borrow_mgr/enteringDiYa";
	}
	
	//转到“信用标申请页面”页面
	@RequestMapping(value = "/enteringXinYong.htm")
	public Object enteringXinYong(){
		return "borrow_mgr/enteringXinYong";
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
	public Object memberBorrow(JqPager jqPager,int p,BorrowingLoanQueryDTO borrowingLoanQueryDTO,String pagetype,HttpServletRequest request){
		//获取信息通知列表
		JqGridReturn returnResult = (JqGridReturn) borrowingLoanService.listAsGridWebsite(jqPager, borrowingLoanQueryDTO, pagetype, p);
		request.setAttribute("borrowingDatas", returnResult);
		request.setAttribute("borrowingLoanQueryDTO", borrowingLoanQueryDTO);
		if(null != pagetype){
			if(pagetype.trim().equals("riseloanTotal")){
				request.setAttribute("loanTotal", "downloanTotal");
	        }else if(pagetype.trim().equals("downloanTotal")){
	        	request.setAttribute("loanTotal", "riseloanTotal");
	        }else if(pagetype.trim().equals("risecredit")){
	        	request.setAttribute("credit", "downcredit");
	        }else if(pagetype.trim().equals("downcredit")){
	        	request.setAttribute("credit", "risecredit");
	        }else if(pagetype.trim().equals("riseloanApr")){
	        	request.setAttribute("loanApr", "downlloanApr");
	        }else if(pagetype.trim().equals("downloanApr")){
	        	request.setAttribute("loanApr", "riseloanApr");
	        }
		}
		String website = "member_mgr/memberBorrow";
		if ("repaymenting".equals(borrowingLoanQueryDTO.getLoanState())){
			website = "member_mgr/memberRepayment";
		}
		return website;
	}
	
	//转到会员中心的我要借款的“借款统计”页面
	@RequestMapping(value = "/memberStatistics.htm")
	public Object memberStatistics(String memberId){
		ModelAndView mav = new ModelAndView("member_mgr/memberStatistics");
		mav.addObject("memberStatisticsDate",memberStatisticsService.getStatisticsByMember(memberId));
		return mav;
	}
}
