package com.glacier.netloan.web.controller.borrow;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.entity.borrow.LoanReview;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.borrow.BorrowingLoanService;
import com.glacier.netloan.service.borrow.LoanReviewService;
import com.glacier.netloan.service.borrow.LoanTenderService;
import com.glacier.netloan.service.borrow.RepaymentTypeService;
import com.glacier.netloan.service.borrow.TenderNotesService;
import com.glacier.netloan.service.member.MemberAuthService;
import com.glacier.netloan.service.member.MemberService;
/**
 * @ClassName: LoanReviewController 
 * @Description: TODO(借款留言Controller) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-5上午10:24:41
 */
@Controller
@RequestMapping(value="/loanReview")
public class LoanReviewController {
	
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
	
	/**
	 * @Title: investmentdetail 
	 * @Description: TODO(添加借款留言，刷新标的详情页面) 
	 * @param  @param loanId
	 * @param  @param memberId
	 * @param  @param request
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 * 和TenderNotesController的investmentdetail相关
	 */
	@RequestMapping(value = "/addLoanReviewWebsite.htm")
	private Object addLoanReviewWebsite(JqPager jqPager,Member member,String captcha,LoanReview loanReview,HttpServletRequest request){
		String captchaReal = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		if(!captcha.equalsIgnoreCase(captchaReal)){
			 //throw new IncorrectCaptchaException("验证码错误！");
			 request.setAttribute("reviewContent", loanReview.getReviewContent());
			 request.setAttribute("errorCaptcha", "验证码错误，请重新输入！");
		}else{
			loanReviewService.addLoanReview(loanReview);//添加借款留言
		}
		request.setAttribute("borrowingMember", memberService.getMember(member.getMemberId()));//获取改会员 信息数据
		request.setAttribute("borrowingMemberWork", memberService.getMemberWork(member.getMemberId()));//获取改会员 信息数据
		request.setAttribute("borrowingLoan", borrowingLoanService.getBorrowingLoan(loanReview.getLoanId()));//获取改会员 借款的信息数据
		request.setAttribute("memberAuthWithBLOBs", memberAuthService.getMemberAuth(member.getMemberId()));//获取改会员 的认证数据
		request.setAttribute("loanReviewDatas", loanReviewService.listAsGridWebsite(jqPager, 1, loanReview.getLoanId()));//获取借款留言列表
		request.setAttribute("tenderNotesDatas", tenderNotesService.listAsGridWebsite(jqPager, 1,loanReview.getLoanId()));//获取投标记录列表
		return "investment_mgr/investmentdetail";
	}
	/**
	 * @Title: loanReviewPage 
	 * @Description: TODO(借款留言的分页列表) 
	 * @param  @param jqPager
	 * @param  @param p
	 * @param  @param loanId
	 * @param  @param memberId
	 * @param  @param request
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 * 和TenderNotesController的investmentdetail相关
	 */
	@RequestMapping(value = "/loanReviewPage.htm")
	private Object loanReviewPage(JqPager jqPager,int p,String loanId,String memberId,HttpServletRequest request){
		request.setAttribute("borrowingMember", memberService.getMember(memberId));//获取该会员 信息数据
		request.setAttribute("borrowingMemberWork", memberService.getMemberWork(memberId));//获取该会员 信息数据
		request.setAttribute("borrowingLoan", borrowingLoanService.getBorrowingLoan(loanId));//获取该会员 借款的信息数据
		request.setAttribute("memberAuthWithBLOBs", memberAuthService.getMemberAuth(memberId));//获取该会员 的认证数据
		request.setAttribute("loanReviewDatas", loanReviewService.listAsGridWebsite(jqPager, p,loanId));//获取借款留言列表
		request.setAttribute("tenderNotesDatas", tenderNotesService.listAsGridWebsite(jqPager, 1,loanId));//获取投标记录列表
		return "investment_mgr/investmentdetail";
	}

}
