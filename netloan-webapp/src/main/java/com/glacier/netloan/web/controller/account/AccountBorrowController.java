package com.glacier.netloan.web.controller.account;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.member.Member;
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
    
    //借款信息导出
    @RequestMapping(value="/exp.json")
    private void expAccountBorrow(JqPager jqPager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String loanState,HttpServletRequest request,HttpServletResponse response) throws IOException{
    	JqGridReturn returnResult=(JqGridReturn) accountBorrowService.listAsGrid(jqPager, borrowingLoanQueryDTO, loanState);
    	List<BorrowingLoan> list=(List<BorrowingLoan>)returnResult.getRows();
    	  HSSFWorkbook wb = accountBorrowService.export(list);   
          response.setContentType("application/vnd.ms-excel");    
          response.setHeader("Content-disposition", "attachment;filename=BorrowingInfo.xls");    
          OutputStream ouputStream = response.getOutputStream();    
          wb.write(ouputStream);    
          ouputStream.flush();    
          ouputStream.close();       	
    }
}
