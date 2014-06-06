package com.glacier.netloan.web.controller.account;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.service.account.AccountBorrowService;
import com.glacier.netloan.service.borrow.BorrowingLoanService;


@Controller
@RequestMapping(value="/accountBorrow")
public class AccountBorrowController{
    
	@Autowired
    private AccountBorrowService accountBorrowService;// 注入借款业务Bean
	
	// 进入借款列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexAccountBorrow() {
        ModelAndView mav = new ModelAndView("account_mgr/accountBorrow_mgr/accountBorrow");
        return mav;
    }
    
    // 获取表格结构的所有借款数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listAccountBorrowAsGridByMenuId(JqPager jqPager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String loanState) {
        return accountBorrowService.listAsGrid(jqPager, borrowingLoanQueryDTO, loanState);
    }
    
    // 进入借款Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoAccountBorrowDetailPage(String loanId) {
        ModelAndView mav = new ModelAndView("account_mgr/accountBorrow_mgr/accountBorrow_detail");
        if(StringUtils.isNotBlank(loanId)){
            mav.addObject("borrowingLoanData", accountBorrowService.getBorrowingLoan(loanId));
        }
        return mav;
    }
    
    
    
}
