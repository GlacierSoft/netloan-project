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
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.account.AccountInvestQueryDTO;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.service.account.AccountInvestService;
import com.glacier.netloan.service.account.AccountLoginService;
import com.glacier.netloan.service.member.MemberService;

/**
 * 
 * 会员投标统计信息
 * ***/


@Controller
@RequestMapping("/accountInvest")
public class AccountInvestController extends AbstractController {
      
	@Autowired
	private AccountInvestService accountInvestService;
	
	//查询显示页
	@RequestMapping(value="/intoCheckQuery.htm")
	public Object intoCheckQuery(String investStr,Date StartTime,Date EndTime,HttpSession session){
		ModelAndView mav=new ModelAndView("account_mgr/accountInvest_mgr/accountInvestQuery");
   //System.out.println("这是 Controler开始时间为:"+StartTime+"  结束时间为:"+EndTime);
		session.setAttribute("investStr", investStr);
		session.setAttribute("StartTime", StartTime);
		session.setAttribute("EndTime", EndTime);
		if(investStr!=null){
			 AccountInvest AccountInvestCheck=(AccountInvest)accountInvestService.getAccountInvestQuery(investStr,StartTime,EndTime);
		     mav.addObject("accountInvestQueryData",AccountInvestCheck);
		     session.setAttribute("AccountInvestCheck", AccountInvestCheck);
		 }
		 return mav;
	}
	
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
	  private Object listActionAsGridByMenuId(JqPager jqPager,AccountInvestQueryDTO accountInvestQueryDTO ) {
	    	return accountInvestService.listAsGrid(jqPager,accountInvestQueryDTO);
	   }
	    
	    
	    //投资统计信息导出
	   @RequestMapping(value = "/exp.json")
	   private void expAccountInvest(JqPager jqPager, AccountInvestQueryDTO accountInvestQueryDTO, String q,HttpServletRequest request,HttpServletResponse response) throws IOException{
	    	  JqGridReturn returnResult=(JqGridReturn) accountInvestService.listAsGrid(jqPager,accountInvestQueryDTO);
	    	  List<AccountInvest> list=(List<AccountInvest>)returnResult.getRows();
	    	  HSSFWorkbook wb = accountInvestService.export(list);   
	          response.setContentType("application/vnd.ms-excel");    
	          SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");
	          String filename="AccountInvest_"+sf.format(new Date());
	          response.setHeader("Content-disposition", "attachment;filename="+filename+".xls");    
	          OutputStream ouputStream = response.getOutputStream();    
	          wb.write(ouputStream);    
	          ouputStream.flush();    
	          ouputStream.close();  
	    	
	   }
	    
	    
	    //投资统计查询信息导出
	    @RequestMapping(value="/expCheck.json")
	    private void expCheckInvest(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
	        AccountInvest accountInvestDataList=(AccountInvest)session.getAttribute("AccountInvestCheck");
	        //System.out.println("我从Session中获取得对象值为:"+accountInvestDataList);
	        List<AccountInvest> list=new ArrayList<AccountInvest>();
	        if(accountInvestDataList==null){
	            AccountInvest accountInvestNull=new AccountInvest();
	            list.add(accountInvestNull);
	        }else{
	        	list.add(accountInvestDataList);	
	        }
	        //System.out.println("我是没问题的那 !!我的数据长度是:"+list.size());
	        HSSFWorkbook wb = accountInvestService.export(list);   
	        response.setContentType("application/vnd.ms-excel"); 
	        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");//yyyy-MM-dd HH:mm:ss
	        String radioname=(String)session.getAttribute("investStr");
	        Date StartTime=(Date)session.getAttribute("StartTime");
	        Date EndTime=(Date)session.getAttribute("EndTime");
	        String str_one =sf.format(new Date());//命名名称
	        //获取Radio值
	        if("investToday".equals(radioname))
	        	str_one="Today_"+sf.format(new Date());
	        else if("investMonth".equals(radioname))
	        	str_one="Month_"+sf.format(new Date());
	        else if("investYear".equals(radioname))
	        	str_one="Year_"+sf.format(new Date());
	        if(StartTime!=null&&EndTime!=null)
	            str_one=sf.format(StartTime)+"_"+sf.format(EndTime);
	         else if(StartTime!=null&&EndTime==null)
	        	str_one=sf.format(StartTime)+"_"+sf.format(new Date());
	        else if(EndTime!=null&&StartTime==null)
	        	 str_one=sf.format(EndTime)+"_"+sf.format(new Date());
	        response.setHeader("Content-disposition", "attachment;filename="+str_one+".xls");    
	        OutputStream ouputStream = response.getOutputStream();    
	        wb.write(ouputStream);    
	        ouputStream.flush();    
	        ouputStream.close();  
	    }
	    
	    
}	    
	   