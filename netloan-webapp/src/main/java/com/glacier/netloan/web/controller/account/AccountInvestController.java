package com.glacier.netloan.web.controller.account;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.account.AccountInvestQueryDTO;
import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.service.account.AccountInvestService;

/**
 * @ClassName: AccountInvestController 
 * @Description: TODO(投资统计控制层) 
 * @author junjie.zheng
 * @email 1203807137@QQ.com
 * @date 2014-8-5上午8:57:51
 */

@Controller
@RequestMapping("/accountInvest")
public class AccountInvestController extends AbstractController {
      
	@Autowired
	private AccountInvestService accountInvestService;
	
	//查询显示页
	@RequestMapping(value="/intoCheckQuery.htm")
	public Object intoCheckQuery(String investStr,Date StartTime,Date EndTime,HttpSession session){
		ModelAndView mav=new ModelAndView("account_mgr/accountInvest_mgr/accountInvestQuery");
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
	  @SuppressWarnings("unchecked")
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
	   
	  //柱形图数据绑定
	  @RequestMapping(value="/data.json")
	  @ResponseBody
	  private Object FindAccountInvestData(HttpSession session){
		  List<Map<String,Object>>  data_invest=new ArrayList<Map<String,Object>>();
		  //获取当前年月
		  Calendar calendar=Calendar.getInstance();
		  int year_number=calendar.get(Calendar.YEAR);
		  int month_number=calendar.get(Calendar.MONTH)+1;
		  try{
			  year_number=(Integer) session.getAttribute("year_number");
			  month_number=(Integer) session.getAttribute("month_number");  
		  }catch(Exception e){
			  System.out.println("异常抛出成功!");
		  }
		  @SuppressWarnings("unchecked")
		List<AccountInvest> list_invest=(List<AccountInvest>) accountInvestService.FindAccountInvest(year_number,month_number);
		  //定义变量
		  Float[]  sumUncollected=new Float[list_invest.size()];
		  Float[]  sumReward=new Float[list_invest.size()];
		  Float[]  sumFine=new Float[list_invest.size()];
		  Float[]  sumBorrow=new Float[list_invest.size()];
		  Float[]  sumAdvfee=new Float[list_invest.size()];
		  Float[]  sumInterest=new Float[list_invest.size()];
		  Float[]  sumInterestfee=new Float[list_invest.size()];
		  //变量赋值
		  for(int i=0;i<list_invest.size();i++){
			  sumUncollected[i]=list_invest.get(i).getSumUncollected();
			  sumReward[i]=list_invest.get(i).getSumReward();
			  sumFine[i]=list_invest.get(i).getSumFine();
			  sumBorrow[i]=list_invest.get(i).getSumBorrow();
			  sumAdvfee[i]=list_invest.get(i).getSumAdvfee();
			  sumInterest[i]=list_invest.get(i).getSumInterest();
			  sumInterestfee[i]=list_invest.get(i).getSumInterestfee();
		  }
		  //变量存储
		  for(int i=0;i<6;i++){
			  Map<String,Object> map=new HashMap<String, Object>();
			  if(i==0){
				  map.put("name", "投资成功待收");
				  map.put("data", sumUncollected);
				  data_invest.add(map);
			  }else if(i==1){
				  map.put("name", "投资奖励");
				  map.put("data", sumReward);
				  data_invest.add(map);
			   }else if(i==2){
				   map.put("name", "借款人逾期罚金");
				   map.put("data", sumFine);
				   data_invest.add(map);
			   }else if(i==3){
				   map.put("name", "借款成功");
				   map.put("data", sumBorrow);
				   data_invest.add(map);
			   }else if(i==4){
				   map.put("name", "借款管理费");
				   map.put("data", sumAdvfee);
				   data_invest.add(map);
			   }else if(i==5){
				   map.put("name", "借款利息");
				   map.put("data", sumInterest);
				   data_invest.add(map);
			   }else if(i==5){
				   map.put("name", "借款逾期罚金总额");
				   map.put("data", sumInterestfee);
				   data_invest.add(map);
			   }
			}
		  return data_invest;
      }
	  
	  //X轴日期绑定
	  @RequestMapping(value="/date.json")
	  @ResponseBody
	  private Object FindInvestDate(HttpSession session){
		  List<Map<String,Object>>  data_invest=new ArrayList<Map<String,Object>>();
		  //获取参数
		  //获取当前年月
		  Calendar calendar=Calendar.getInstance();
		  int year_number=calendar.get(Calendar.YEAR);
		  int month_number=calendar.get(Calendar.MONTH)+1;
		  try{
			  year_number=(Integer) session.getAttribute("year_number");
			  month_number=(Integer) session.getAttribute("month_number");  
		  }catch(Exception e){
			  System.out.println("异常抛出成功!");
		  }
		  @SuppressWarnings("unchecked")
		List<AccountInvest> list_invest=(List<AccountInvest>) accountInvestService.FindAccountInvest(year_number,month_number);
		  //时间转化
		  SimpleDateFormat sf=new SimpleDateFormat("MM.dd");
		  String[] str_date=new String[list_invest.size()]; 
		  
		  for(int i=0;i<list_invest.size();i++){
			  str_date[i]=sf.format(list_invest.get(i).getCreateTime());  
		  }
		  Map<String, Object> map_invest=new HashMap<String, Object>();
		  map_invest.put("date", str_date);
		  data_invest.add(map_invest);
		  return data_invest;
	  }
	  
	  //年月数据存储
	  @RequestMapping(value="/yearMonth.json")
	  @ResponseBody
	  private Object FindYeayAndMonth(int year_number,int month_number,HttpSession session){
		  Map<String, Object> map=new HashMap<String, Object>();
		  List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
		  boolean flag=false;
		  //记录查询数
		  int invest_number=0;
		  //获取当前年月
		  Calendar calendar=Calendar.getInstance();
		  int year_now=calendar.get(Calendar.YEAR);
		  int month_now=calendar.get(Calendar.MONTH)+1;
		  if(year_number>0&&month_number>0){
			  	session.setAttribute("year_number",year_number);
			  	session.setAttribute("month_number", month_number);
			  	map.put("year_number", year_number);
			  	map.put("month_number",month_number);
			  	flag=true;
			}else{
			  if(year_number>0){
				  session.setAttribute("year_number",year_number);
				  session.setAttribute("month_number", month_now);
				  map.put("year_number", year_number);
				  map.put("month_number",month_now);
				  flag=true;
			    }
			  if(month_number>0){
				  session.setAttribute("year_number",year_now);
				  session.setAttribute("month_number", month_number);
				  map.put("year_number", year_now);
				  map.put("month_number",month_number);
				  flag=true;
				}
			}
		   if(year_number>0&&month_number>0){
			     invest_number=(Integer) accountInvestService.FindInvestListTest(year_number, month_number);
		   }else{
			   if(year_number>0)
				 invest_number=(Integer) accountInvestService.FindInvestListTest(year_number, month_now);
			   else
				 invest_number=(Integer) accountInvestService.FindInvestListTest(year_now, month_number);
		   }
		   if(invest_number==0) 
		        map.put("msg", "条件内无效，，请重新检索!!!!");
		   else
			     map.put("msg", "");
		    map.put("flag", flag);
		    list.add(map);
		    return list;
	  }
	 
	  //投资统计查询信息导出
	  @RequestMapping(value="/expCheck.json")
	  private void expCheckInvest(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
	        AccountInvest accountInvestDataList=(AccountInvest)session.getAttribute("AccountInvestCheck");
	        List<AccountInvest> list=new ArrayList<AccountInvest>();
	        if(accountInvestDataList==null){
	            AccountInvest accountInvestNull=new AccountInvest();
	            list.add(accountInvestNull);
	        }else{
	        	list.add(accountInvestDataList);	
	        }
	        HSSFWorkbook wb = accountInvestService.export(list);   
	        response.setContentType("application/vnd.ms-excel"); 
	        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");
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
	    
	    //投资统计查询信息导入
		@RequestMapping(value="ExcelIn.json",method=RequestMethod.POST)
		@ResponseBody
		private Object AccountInvestIn(MultipartFile AccountFile, HttpServletRequest request,HttpServletResponse response) throws IOException{
		   boolean flag=true;
           Map<String,Object> map=new HashMap<String,Object>();
           List<Map<String,Object>> list=new ArrayList<Map<String, Object>>();
           try{
        	   String realPath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload"); 
			   FileUtils.copyInputStreamToFile(AccountFile.getInputStream(), new File(realPath, AccountFile.getOriginalFilename()));   
           }catch(Exception e){
        	   flag=false;
        	}
           map.put("data", flag);
           list.add(map);
		   return list;
		}
}	    
	   