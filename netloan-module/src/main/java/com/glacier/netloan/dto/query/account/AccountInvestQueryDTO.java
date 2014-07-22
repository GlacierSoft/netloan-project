/*
 * @(#)AccountInvestQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */ 
package com.glacier.netloan.dto.query.account;

import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import com.alibaba.fastjson.annotation.JSONField;
import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.entity.account.AccountInvestExample.Criteria;

/***
 * 
 * @ClassName: AccountInvestQueryDTO
 * @Description: TODO(投资统计DTO)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-7-22 上午10:02:57
 */
public class AccountInvestQueryDTO extends AccountInvest {

	// 当日
	private String investToday;

	// 用户选择时间
	private String invest_search;

	private Date invest_Now = new Date();

	// 自定义时间
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date invest_Start;

	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
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

	public void setQueryCondition(Criteria queryCriteria) {
		if (null != invest_search) {
			if (invest_search.equals("investToday")) { 
				queryCriteria.andCreateTimeGreaterThanOrEqualTo(invest_Now); 
			}
			if (invest_search.equals("investMonth")) { 
				Calendar calendar = Calendar.getInstance();
				calendar.set(Calendar.DATE,calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
			    queryCriteria.andCreateTimeBetween(calendar.getTime(),new Date()); 
			}
			if (invest_search.equals("investYear")) { 
				Calendar currCal = Calendar.getInstance();
				int currentYear = currCal.get(Calendar.YEAR); 
				// 当年时间第一天
				Calendar calendar = Calendar.getInstance();
				calendar.clear();
				calendar.set(Calendar.YEAR, currentYear);
				Date currYearFirst = calendar.getTime(); 
				// 当年时间最后一天
				Calendar calendar_two = Calendar.getInstance();
				calendar_two.clear();
				calendar_two.set(Calendar.YEAR, currentYear);
				calendar_two.roll(Calendar.DAY_OF_YEAR, -1);
				Date currYearLast = calendar.getTime();  
				// 时间比较
				queryCriteria.andCreateTimeBetween(currYearFirst, currYearLast); 
			}
		}
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
