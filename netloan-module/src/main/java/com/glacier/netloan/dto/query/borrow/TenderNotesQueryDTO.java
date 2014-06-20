/*
 * @(#)BorrowingLoanQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.dto.query.borrow;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.alibaba.fastjson.annotation.JSONField;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.borrow.TenderNotesExample.Criteria;


/** 
 * @ClassName: RepaymentNotesDetailQueryDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-13下午4:22:33
 */
public class TenderNotesQueryDTO extends TenderNotes{
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createStartTime;

	@JSONField(format="yyyy-MM-dd HH:mm:ss")
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

     	 if(null != this.getLoanTitle() && StringUtils.isNotBlank(this.getLoanTitle())){//标题Like查询
	            queryCriteria.andLoanTitleLike("%" + this.getLoanTitle() + "%");
	        }  
      	 if(null != this.getMemberDisplay() && StringUtils.isNotBlank(this.getMemberDisplay())){//投标人
	            queryCriteria.andMemberDisplayLike("%" + this.getMemberDisplay() + "%");
	        }  
    	 
	    if(null != createStartTime && null != createEndTime){//创建时间段查询
	           queryCriteria.andLoanDateBetween(createStartTime, createEndTime); 
	    }else{
	    	if(null != createStartTime){
	    		queryCriteria.andLoanDateGreaterThanOrEqualTo(createStartTime);
	    	}
	    	if(null != createEndTime){
	    		queryCriteria.andLoanDateLessThanOrEqualTo(createEndTime);
	    	}
	    }
    }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   }
}

