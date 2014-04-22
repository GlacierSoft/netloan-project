package com.glacier.netloan.web.controller.investment;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.service.borrow.BorrowingLoanService;
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
	
	@RequestMapping(value="/index.htm")
	private Object intoInvestment(JqPager jqPager,int p,String loanState,HttpServletRequest request){
		BorrowingLoanQueryDTO borrowingLoanQueryDTO = new BorrowingLoanQueryDTO();
		//获取信息通知列表
		JqGridReturn returnResult = (JqGridReturn) borrowingLoanService.listAsGridWebsite(jqPager, borrowingLoanQueryDTO, loanState, p);
		request.setAttribute("borrowingDatas", returnResult);
		return "investment_mgr/investment";
	}
	
	

}
