/**
 * @Title: CommonController.java 
 * @Package com.glacier.netloan.web.controller 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-1-16 上午10:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-1-16
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.netloan.web.controller.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.netloan.service.borrow.BorrowingLoanService;
import com.glacier.netloan.service.finance.FinanceBankCardService;
import com.glacier.netloan.service.finance.FinanceRechargeService;
import com.glacier.netloan.service.finance.FinanceWithdrawService;
import com.glacier.netloan.service.member.MemberApplyAmountService;

/**
 * @ClassName: CommonController
 * @Description: TODO(公用控制器)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-1-16 上午10:50:38
 */
@Controller
@RequestMapping(value="/index")
public class indexController {
    
    @Autowired
    private BorrowingLoanService borrowingLoanService;
    
    @Autowired
    private FinanceRechargeService financeRechargeService;
    
    @Autowired
    private FinanceWithdrawService financeWithdrawService;
    
    @Autowired
    private FinanceBankCardService financeBankCardService;
    
    @Autowired
    private MemberApplyAmountService memberApplyAmountService;
    
    @RequestMapping(value = "/center", method = RequestMethod.GET)
    public Object intoIndex() {
        
        ModelAndView mav = new ModelAndView("layout/center");
        mav.addObject("borrowingLoanNumFirstAudit", borrowingLoanService.getBorrowingLoanNumByLoanState("FirstAudit"));//查询初审中的借款记录条数
        mav.addObject("borrowingLoanNumSecondAuditor", borrowingLoanService.getBorrowingLoanNumByLoanState("SecondAuditors"));//查询复审中的借款记录条数
        
        
        mav.addObject("financeRechargeNumAuthstr", financeRechargeService.getFinanceRechargeNumByAuditState("Authstr"));//查询审核中的会员充值记录条数
        mav.addObject("financeWithdrawNumAuthstr", financeWithdrawService.getFinanceWithdrawNumByAuditState("Authstr"));//查询审核中的会员提现记录条数
        mav.addObject("bankCardNumAuthstr", financeBankCardService.getBankCardNumByBankCardAuths("authstr"));//查询审核中的会员银行卡记录条数
        mav.addObject("applyAmountNumAuthstr", memberApplyAmountService.getApplyAmountNumByAuditState("Authstr"));//查询审核中的会员额度申请记录条数
        return mav;
    }
}
