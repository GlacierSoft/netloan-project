package com.glacier.netloan.dto.query.account;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.alibaba.fastjson.annotation.JSONField;
import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.entity.account.AccountInvestExample.Criteria;


public class AccountInvestQueryDTO  extends AccountInvest {
   
	   //当日时间
	   @JSONField(format="yyyy-MM-dd HH:mm:ss")
	   private Date invest_search;
	   
	   //自定义时间 
	   @JSONField(format="yyyy-MM-dd HH:mm:ss")
	   private Date invest_Start;
	   
	   @JSONField(format="yyyy-MM-dd HH:mm:ss")
	   private Date invest_End;
	   
	   public Date getInvest_search() {
		return invest_search;
	   }

	   public void setInvest_search(Date invest_search) {
		this.invest_search = invest_search;
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
		  if(invest_search!=null){
			  System.out.println("------------------我是查询类，我是没问题的，看下面---------->");
			  System.out.println("当日时间---------->:"+invest_search);
			  queryCriteria.andCreateTimeEqualTo(invest_search);
		      System.out.println("------------------------------Ok----->结束");
		  }
		   if(invest_Start!=null&&invest_Start!=null){
			  queryCriteria.andCreateTimeBetween(invest_Start, invest_Start);
		  }
	}
	
	 
	 @Override
	  public String toString() {
	       return ReflectionToStringBuilder.toString(this);
	  }
	   
}
