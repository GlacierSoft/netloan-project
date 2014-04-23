package com.glacier.netloan.web.controller.investment;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.service.borrow.BorrowingLoanService;
import com.glacier.netloan.service.member.MemberService;
/**
 * @ClassName: TenderNotesController 
 * @Description: TODO(投标记录的Controller) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-4-21下午4:47:50
 */
@Controller
@RequestMapping(value="investment")
public class TenderNotesController {
	
	@Autowired
    private BorrowingLoanService borrowingLoanService;// 注入借款业务Bean
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/index.htm")
	private Object intoInvestment(JqPager jqPager,int p,BorrowingLoanQueryDTO borrowingLoanQueryDTO,String pagetype,HttpServletRequest request){
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
		return "investment_mgr/investment";
	}
	
	@RequestMapping(value = "/investmentdetail.htm")
	private Object investmentdetail(String loanId,String memberId,HttpServletRequest request){
		request.setAttribute("borrowingMember", memberService.getMember(memberId));
		request.setAttribute("borrowingLoan", borrowingLoanService.getBorrowingLoan(loanId));
		return "investment_mgr/investmentdetail";
	}
	

}
