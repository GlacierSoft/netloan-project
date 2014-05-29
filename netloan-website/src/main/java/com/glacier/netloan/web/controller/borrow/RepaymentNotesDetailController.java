package com.glacier.netloan.web.controller.borrow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.service.borrow.BorrowingLoanService;
import com.glacier.netloan.service.borrow.RepaymentNotesDetailService;
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

	//转到“还款”页面
    @RequestMapping(value = "/conductRepayment.htm")
    public Object conductRepayment(JqPager jqPager, String loanId, String memberId){
        ModelAndView mav = new ModelAndView("member_mgr/conductRepayment");
        mav.addObject("borrowingLoan",borrowingLoanService.getBorrowingLoan(loanId));
        return mav;
    }
    
}
