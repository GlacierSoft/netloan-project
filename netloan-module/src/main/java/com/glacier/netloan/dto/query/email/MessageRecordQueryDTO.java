/*
 * @(#)FinFinanceMemberQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.dto.query.email;

import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import com.alibaba.fastjson.annotation.JSONField;
import com.glacier.netloan.entity.email.MessageRecord;
import com.glacier.netloan.entity.email.MessageRecordExample.Criteria;

/**
 * @ClassName: FinFinanceMemberQueryDTO
 * @Description: TODO(FinFinanceMemberQueryDTO) 
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-5-22 下午3:16:58
 */
public class MessageRecordQueryDTO extends MessageRecord{
	
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
    
    public void setQueryConditions(Criteria queryCriteria){

    	if(null != this.getRecordMemberDisplay() && StringUtils.isNotBlank(this.getRecordMemberDisplay())){//根据记录明细类型查找
	        queryCriteria.andRecordMemberDisplaylike("%"+ this.getRecordMemberDisplay() +"%");
	    }
    	
    	if(null != this.getRecordSendDisplay() && StringUtils.isNotBlank(this.getRecordSendDisplay())){//审核状态
	        queryCriteria.andRecordSendDisplaylike("%"+ this.getRecordSendDisplay() +"%");
	    }
    	
	    if(null != createStartTime && null != createEndTime){//创建时间段查询
	           queryCriteria.andCreaterTimeBetween(createStartTime, createEndTime); 
	    }else{
	    	if(null != createStartTime){
	    		queryCriteria.andCreaterTimeGreaterThanOrEqualTo(createStartTime);
	    	}
	    	if(null != createEndTime){
	    		queryCriteria.andCreaterTimeLessThanOrEqualTo(createEndTime);
	    	}
	    }
    }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   }
}

