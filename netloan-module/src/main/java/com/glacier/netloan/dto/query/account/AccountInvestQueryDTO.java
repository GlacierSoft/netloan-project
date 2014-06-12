package com.glacier.netloan.dto.query.account;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.entity.account.AccountInvestExample.Criteria;


public class AccountInvestQueryDTO  extends AccountInvest {
   
	   //当日时间
	   @JSONField(format="yyyy-MM-dd HH:mm:ss")
	   private Date invest_today;
	   
	   //当月时间
	   @JSONField(format="yyyy-MM-dd HH:mm:ss")
	   private Date invest_month;
 	
	  //当年时间
	  @JSONField(format="yyyy-MM-dd HH:mm:ss")
	  private Date invest_year;
	  
	  //自定义开始时间
	  @JSONField(format="yyyy-MM-dd HH:mm:ss")
	  private Date invest_Start;
	  
	  //自定义结束时间
	  @JSONField(format="yyyy-MM-dd HH:mm:ss")
	  private Date invest_End;
	  
	  public Date getInvest_today() {
		return invest_today;
	  }


      public void setInvest_today(Date invest_today) {
		this.invest_today = invest_today;
	  }

      public Date getInvest_month() {
		return invest_month;
	  }

      public void setInvest_month(Date invest_month) {
		this.invest_month = invest_month;
	 }
     
      public Date getInvest_year() {
		return invest_year;
	  }
     
      public void setInvest_year(Date invest_year) {
		this.invest_year = invest_year;
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
    	   if(invest_today!=null)
    		   queryCriteria.andCreateTimeEqualTo(invest_today);
    	   if(invest_month!=null)
    		   queryCriteria.andCreateTimeEqualTo(invest_month);
    	   if(invest_year!=null)
    		    queryCriteria.andCreateTimeEqualTo(invest_year);
    	   if(invest_Start!=null&&invest_End!=null){
    		   queryCriteria.andCreateTimeBetween(invest_Start, invest_End);
    	   }else{
    		    if(invest_Start!=null)
    		    	  queryCriteria.andCreateTimeGreaterThan(invest_Start);
    		    else
    		    	  queryCriteria.andCreateTimeLessThanOrEqualTo(invest_End);
    	   }
    }        
	     
}
