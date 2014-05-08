package com.glacier.netloan.web.controller.investment;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glacier.basic.util.JackJson;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.RepaymentNotes;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.service.borrow.BorrowingLoanService;
import com.glacier.netloan.service.borrow.LoanReviewService;
import com.glacier.netloan.service.borrow.LoanTenderService;
import com.glacier.netloan.service.borrow.RepaymentNotesDetailService;
import com.glacier.netloan.service.borrow.RepaymentNotesService;
import com.glacier.netloan.service.borrow.RepaymentTypeService;
import com.glacier.netloan.service.borrow.TenderNotesService;
import com.glacier.netloan.service.member.MemberAuthService;
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
	
	@Autowired
	private MemberAuthService memberAuthService;
	
	@Autowired
	private LoanTenderService loanTenderService;
	
	@Autowired
	private RepaymentTypeService repaymentTypeService;
	
	@Autowired
	private LoanReviewService loanReviewService;
	
	@Autowired
	private TenderNotesService tenderNotesService;
	
	@Autowired
	private RepaymentNotesService repaymentNotesService;
	
	@Autowired
	private RepaymentNotesDetailService repaymentNotesDetailService;
	
	@RequestMapping(value="/index.htm")
	private Object intoInvestment(JqPager jqPager,int p,BorrowingLoanQueryDTO borrowingLoanQueryDTO,String pagetype,HttpServletRequest request){
		//获取信息通知列表
		JqGridReturn returnResult = (JqGridReturn) borrowingLoanService.listAsGridWebsite(jqPager, borrowingLoanQueryDTO, pagetype, p);
		JqPager jqPagerLoanTender = new JqPager();
		JqPager jqPagerRepaymentType = new JqPager();
		JqGridReturn returnLoanTender = (JqGridReturn)loanTenderService.listAsGrid(jqPagerLoanTender);
		JqGridReturn returnRepaymentType = (JqGridReturn)repaymentTypeService.listAsGrid(jqPagerRepaymentType);
		request.setAttribute("borrowingDatas", returnResult);
		request.setAttribute("borrowingLoanQueryDTO", borrowingLoanQueryDTO);
		request.setAttribute("borrowTypes",JackJson.fromObjectToJson(borrowingLoanQueryDTO.getBorrowTypes()));
		request.setAttribute("returnLoanTender", returnLoanTender);
		request.setAttribute("returnRepaymentType", returnRepaymentType);
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
	/**
	 * @Title: investmentdetail 
	 * @Description: TODO(进入标的详情页面) 
	 * @param  @param loanId
	 * @param  @param memberId
	 * @param  @param request
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 * 和LoanReviewController的addLoanReview和loanReviewPage相关
	 */
	@RequestMapping(value = "/investmentdetail.htm")
	private Object investmentdetail(JqPager jqPager,int p,String loanId,String memberId,HttpServletRequest request){
		request.setAttribute("borrowingMember", memberService.getMember(memberId));//获取该会员 信息数据
		request.setAttribute("borrowingMemberWork", memberService.getMemberWork(memberId));//获取该会员 信息数据
		request.setAttribute("borrowingLoan", borrowingLoanService.getBorrowingLoan(loanId));//获取该会员 借款的信息数据
		request.setAttribute("memberAuthWithBLOBs", memberAuthService.getMemberAuth(memberId));//获取该会员 的认证数据
		request.setAttribute("loanReviewDatas", loanReviewService.listAsGridWebsite(jqPager, 1,loanId));//获取借款留言列表
		request.setAttribute("tenderNotesDatas", tenderNotesService.listAsGridWebsite(jqPager, p,loanId));//获取投标记录列表
		return "investment_mgr/investmentdetail";
	}
	/**
	 * @Title: confirmInvestment 
	 * @Description: TODO(进入确认投标页面) 
	 * @param  @param loanId
	 * @param  @param memberId
	 * @param  @param request
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	@RequestMapping(value = "/confirmInvestment.htm")
	private Object confirmInvestment(String loanId,String memberId,HttpServletRequest request){
		request.setAttribute("borrowingMember", memberService.getMember(memberId));//获取该会员 信息数据
		request.setAttribute("borrowingMemberWork", memberService.getMemberWork(memberId));//获取该会员 信息数据
		request.setAttribute("borrowingLoan", borrowingLoanService.getBorrowingLoan(loanId));//获取该会员 借款的信息数据
		return "investment_mgr/confirmInvestment";
	}
	/**
	 * @Title: addInvestment 
	 * @Description: TODO(添加投标记录) 
	 * @param  @param tenderNotes
	 * @param  @param request
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 * 和TenderNotesController的investmentdetail相关
	 */
	@RequestMapping(value = "/addInvestment.htm")
	private Object addInvestment(TenderNotes tenderNotes,HttpServletRequest request){
		tenderNotesService.addTenderNotes(tenderNotes);//添加投标记录
		BorrowingLoan borrowingLoan = (BorrowingLoan) borrowingLoanService.getBorrowingLoan(tenderNotes.getLoanId());//获取所投标的借款数据
		borrowingLoanService.editBorrowingLoan(borrowingLoan,tenderNotes);//更新借款中相对应的数据
		
		
		request.setAttribute("borrowingMember", memberService.getMember(tenderNotes.getMemberId()));//获取该会员 信息数据
		request.setAttribute("borrowingMemberWork", memberService.getMemberWork(tenderNotes.getMemberId()));//获取该会员 信息数据
		request.setAttribute("borrowingLoan", borrowingLoanService.getBorrowingLoan(tenderNotes.getLoanId()));//获取该会员 借款的信息数据
		request.setAttribute("memberAuthWithBLOBs", memberAuthService.getMemberAuth(tenderNotes.getMemberId()));//获取该会员 的认证数据
		JqPager jqPager = new JqPager();
		request.setAttribute("loanReviewDatas", loanReviewService.listAsGridWebsite(jqPager, 1,tenderNotes.getLoanId()));//获取借款留言列表
		request.setAttribute("tenderNotesDatas", tenderNotesService.listAsGridWebsite(jqPager, 1,tenderNotes.getLoanId()));//获取投标记录列表
		return "investment_mgr/investmentdetail";
	}
}
