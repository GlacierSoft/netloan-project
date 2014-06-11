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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.service.account.AccountInvestService;
import com.glacier.netloan.service.account.AccountLoginService;
import com.glacier.netloan.service.member.MemberService;




@Controller
@RequestMapping("/accountInvest")
public class AccountInvestController extends AbstractController {
      
	@Autowired
	private AccountInvestService accountInvestService;
	
	 //投资统计信息页
	 @RequestMapping(value="/index.htm")
	 public Object intoAccountInvest(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mode=new ModelAndView("account_mgr/accountInvest_mgr/accountInvest");
	    return mode ;	
	}
	 
	   //投资统计详情页
	    @RequestMapping(value = "/intoDetail.htm")
	    private Object intoAccountInvestDetailPage(String investId) {
	        ModelAndView mav = new ModelAndView("account_mgr/accountInvest_mgr/accountInvest_detail");
	        if(StringUtils.isNotBlank(investId)){
	            mav.addObject("accountInvestData", accountInvestService.getAccountInvest(investId));
	         }
	        return mav;
	    }
	    
	    //获取表格结构的所有菜单数据
	    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
	    @ResponseBody
	    private Object listActionAsGridByMenuId(JqPager jqPager) {
	    	return accountInvestService.listAsGrid(jqPager);
	    }
	    
	    
	    //登录统计信息导出
	    @RequestMapping(value = "/exp.json")
	    private void expAccountLogin(JqPager jqPager, MemberQueryDTO memberQueryDTO, String q,HttpServletRequest request,HttpServletResponse response) throws IOException{
	    	  JqGridReturn returnResult=(JqGridReturn) accountInvestService.listAsGrid(jqPager);
	    	  List<AccountInvest> list=(List<AccountInvest>)returnResult.getRows();
	    	  HSSFWorkbook wb = accountInvestService.export(list);   
	          response.setContentType("application/vnd.ms-excel");    
	          response.setHeader("Content-disposition", "attachment;filename=MemberInfo.xls");    
	          OutputStream ouputStream = response.getOutputStream();    
	          wb.write(ouputStream);    
	          ouputStream.flush();    
	          ouputStream.close();    
	     }
	    
	    
	    
	    
	    
}	    
	   