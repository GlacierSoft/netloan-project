package com.glacier.netloan.web.controller.account;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import com.glacier.netloan.service.account.AccountBorrowService;

/**
 * @ClassName: AccountBorrowController 
 * @Description: TODO(借款统计控制层) 
 * @author junjie.zheng
 * @email 1203807137@QQ.com
 * @date 2014-8-5上午8:57:51
 */

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
    private Object listAccountBorrowAsGridByMenuId(JqPager jqPager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String loanState,HttpSession session) {
        JqGridReturn returnResult=(JqGridReturn) accountBorrowService.listAsGrid(jqPager, borrowingLoanQueryDTO, loanState);
    	 if(returnResult!=null){
    	  List<BorrowingLoan> list=(List<BorrowingLoan>)returnResult.getRows();	
    	  session.setAttribute("List", list);
    	 }
        return  returnResult;
    }
    
	// 进入借款Detail信息页面
	@RequestMapping(value = "/intoDetail.htm")
	private Object intoAccountBorrowDetailPage(String loanId) {
		ModelAndView mav = new ModelAndView("account_mgr/accountBorrow_mgr/accountBorrow_detail");
		if (StringUtils.isNotBlank(loanId)) {
			mav.addObject("borrowingLoanData",
					accountBorrowService.getBorrowingLoan(loanId));
		}
		return mav;
	}
    
    //借款信息导出
    @RequestMapping(value="/exp.json")
    private void expAccountBorrow(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
    	  List<BorrowingLoan> list=(List<BorrowingLoan>)session.getAttribute("List");
    	  HSSFWorkbook wb =null;
    	  if(list.size()>0&&list!=null){
    		  wb = accountBorrowService.export(list);   
    	  }else{
    		  List<BorrowingLoan> list_null=new ArrayList<BorrowingLoan>();
    		  BorrowingLoan borrowingLoan=new BorrowingLoan();
    		  borrowingLoan.setMemberDisplay("Null");
    		  borrowingLoan.setLoanTitle("Null");
    		  borrowingLoan.setLoanTotal(new Float(0.00));
    		  borrowingLoan.setLoanTenderDisplay("Null");
    		  borrowingLoan.setLoanDate(new Date());
    		  borrowingLoan.setLoanPurposeId("Null");
    		  borrowingLoan.setLoanDeadlinesId("Null");
    		  list_null.add(borrowingLoan);
    		  wb=accountBorrowService.export(list_null);
    	  }
    	  response.setContentType("application/vnd.ms-excel"); 
          SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");//日期格式设置
          String fileName="AccountBorrow_"+sf.format(new Date());//文件名称
          response.setHeader("Content-disposition", "attachment;filename="+fileName+".xls");    
          OutputStream ouputStream = response.getOutputStream();    
          wb.write(ouputStream);    
          ouputStream.flush();    
          ouputStream.close();       	
    }
}
