package com.glacier.netloan.dto.query.account;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.alibaba.fastjson.annotation.JSONField;
import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.entity.account.AccountInvestExample.Criteria;


public class AccountInvestQueryDTO  extends AccountInvest {
   
	 //当日
	private String investToday; 
	   
	//用户选择时间
	private String invest_search;
	  
	private Date invest_Now=new Date();
	
	//自定义时间 
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date invest_Start;
	   
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date invest_End;
	   
	public String getInvest_search() {
		return invest_search;
	}

	public void setInvest_search(String invest_search) {
		this.invest_search = invest_search;
	}

	public String getInvestToday() {
		return investToday;
	 }

	public void setInvestToday(String investToday) {
		this.investToday = investToday;
	}

    public Date getInvest_Start() {
		return invest_Start;
	  }
	
	  public void setInvest_Start(Date invest_Start) {
	 	this.invest_Start = invest_Start;
	  }
	
	  public Date getInvest_End() {
		return invest_End;
	  }

	public void setInvest_End(Date invest_End) {
		this.invest_End = invest_End;
	}

	public void setQueryCondition(Criteria queryCriteria){
		 if(null!=invest_search){
		   if(invest_search.equals("investToday")){
			   System.out.println("----------------->当前时间:"+invest_Now+"  ");
			   queryCriteria.andCreateTimeGreaterThanOrEqualTo(invest_Now);
		       System.out.println("----------------->判断结束");
		   }if(invest_search.equals("investMonth")){
			   
			   Calendar calendar = Calendar.getInstance();  
			   calendar.set(Calendar.DATE,calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
			   System.out.println("------------------->当月第一时间:"+calendar.getTime());
			   queryCriteria.andCreateTimeBetween(calendar.getTime(), new Date());
		       System.out.println("------------------->月份判断完毕:");
		   
		   }if(invest_search.equals("investYear")){
			    
			    Calendar currCal=Calendar.getInstance();    
		        int currentYear = currCal.get(Calendar.YEAR); 
			   
			   //当年时间第一天
			    Calendar calendar = Calendar.getInstance();  
		        calendar.clear();  
		        calendar.set(Calendar.YEAR, currentYear);  
		        Date currYearFirst = calendar.getTime();
		        
		        //当年时间最后一天
		        Calendar calendar_two = Calendar.getInstance();  
		        calendar_two.clear();  
		        calendar_two.set(Calendar.YEAR, currentYear);  
		        calendar_two.roll(Calendar.DAY_OF_YEAR, -1);  
		        Date currYearLast = calendar.getTime();  
		        
		        //时间测试
		        System.out.println("---------------->当年第一天日期:"+currYearFirst);
		        System.out.println("---------------->当年最后一天日期:"+currYearLast);
		        
		        //时间比较
		        queryCriteria.andCreateTimeBetween(currYearFirst, currYearLast);
		        
		     }
		 }
	}
	
	 @Override
	  public String toString() {
	       return ReflectionToStringBuilder.toString(this);
	  }
	   
}