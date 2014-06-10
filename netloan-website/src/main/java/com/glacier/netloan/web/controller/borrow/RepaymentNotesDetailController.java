package com.glacier.netloan.web.controller.borrow;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.borrow.BorrowingLoanService;
import com.glacier.netloan.service.borrow.RepaymentNotesDetailService;
import com.glacier.netloan.service.finance.FinanceMemberService;
/**
 * @ClassName: RepaymentNotesDetailDetailController 
 * @Description: TODO(还款记录明细控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-7下午4:27:16
 */
@Controller
@RequestMapping(value = "/repaymentNotesDetail")
public class RepaymentNotesDetailController extends AbstractController{
	@Autowired
	private RepaymentNotesDetailService repaymentNotesDetailService;// 注入还款记录明细业务Bean
	
	@Autowired
	private BorrowingLoanService borrowingLoanService;
	
	@Autowired
	private FinanceMemberService financeMemberService;

	//转到“还款”页面
    @RequestMapping(value = "/conductRepayment.htm")
    public Object conductRepayment(JqPager jqPager, String loanId, String memberId, String repayNotesDetailId){
        ModelAndView mav = new ModelAndView("member_mgr/conductRepayment");
        mav.addObject("borrowingLoan",borrowingLoanService.getBorrowingLoan(loanId));
        mav.addObject("financeMemberDate",financeMemberService.getFinanceMemberByMemberId(memberId));
        mav.addObject("repaymentNotesDetailsData",repaymentNotesDetailService.getRepaymentNotesDetail(repayNotesDetailId));
        return mav;
    }
    
    // 前台页面会员进行还款操作
    @RequestMapping(value = "/repayment.json", method = RequestMethod.POST)
    @ResponseBody
    private Object repaymentRepaymentNotesDetail(String repayNotesDetailId, Member member, String captcha, HttpServletRequest request, HttpSession session) {
        // 核对验证码
        String isCaptcha = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        boolean captchaBoolean = true;
        if (StringUtils.isBlank(captcha) || !isCaptcha.equalsIgnoreCase(captcha)) {
            captchaBoolean = false;
        }
        return repaymentNotesDetailService.repaymentRepaymentNotesDetail(repayNotesDetailId, member, captchaBoolean);
    }
}
