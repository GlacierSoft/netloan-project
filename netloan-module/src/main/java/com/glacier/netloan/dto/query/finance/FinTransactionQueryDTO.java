/*
 * @(#)FinTransactionQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.dto.query.finance;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.alibaba.fastjson.annotation.JSONField;
import com.glacier.netloan.entity.finance.FinanceTransactionExample.Criteria;
import com.glacier.netloan.entity.finance.FinanceTransaction;
 
/**
 * @ClassName: FinTransactionQueryDTO 
 * @Description: TODO(FinTransactionQueryDTO) 
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-5-22 下午3:16:58
 */
public class FinTransactionQueryDTO extends FinanceTransaction{
	
    @JSONField(format="yyyy-MM-dd")
	private Date createStartTime;

    @JSONField(format="yyyy-MM-dd")
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
    
    public void setQueryCondition(Criteria queryCriteria, String memberId){
        
        if(null != memberId && StringUtils.isNotBlank(memberId)){//根据所属会员ID进行查找
            queryCriteria.andMemberIdEqualTo(memberId);
        }
        
    	if(null != this.getTransactionType() && StringUtils.isNotBlank(this.getTransactionType())){//根据记录明细类型查找
	        queryCriteria.andTransactionTypeLike("%" + this.getTransactionType() + "%");
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

