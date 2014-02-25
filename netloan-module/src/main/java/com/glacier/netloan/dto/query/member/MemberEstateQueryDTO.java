/*
 * @(#)MemberEstateQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.dto.query.member;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.netloan.entity.member.MemberEstate;
import com.glacier.netloan.entity.member.MemberEstateExample.Criteria;

/** 
 * @ClassName: MemberEstateQueryDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-2-25 下午3:49:02  
 */
public class MemberEstateQueryDTO extends MemberEstate{
	
	private Date createStartTime;

    private Date createEndTime;

    public Date getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(Date createStartTime) {
        this.createStartTime = createStartTime;
    }

    public Date getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(Date createEndTime) {
        this.createEndTime = createEndTime;
    }
    
    public void setQueryCondition(Criteria queryCriteria){
	   	if(null != this.getMemberRealName() && StringUtils.isNotBlank(this.getMemberRealName())){//会员真实名称Like查询
	        queryCriteria.andMemberRealNameLike("%" + this.getMemberRealName() + "%");
	    }
	   	if(null != this.getAddress() && StringUtils.isNotBlank(this.getAddress())){//根据地址查询
	        queryCriteria.andAddressLike("%" + this.getAddress() + "%");
	    }
	   	if(null != this.getAgeExpenses()){//根据供款情况查询
	        queryCriteria.andAgeExpensesEqualTo(this.getAgeExpenses().toString());
	   	}
	    if(null != createStartTime && null != createEndTime){//创建时间段查询
	           queryCriteria.andCreateTimeBetween(createStartTime, createEndTime); 
	    }else{
	    	if(null != createStartTime){
	    		queryCriteria.andCreateTimeGreaterThanOrEqualTo(createStartTime);
	    	}
	    	if(null != createEndTime){
	    		queryCriteria.andCreateTimeLessThanOrEqualTo(createEndTime);
	    	}
	    }
    }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   }
}
