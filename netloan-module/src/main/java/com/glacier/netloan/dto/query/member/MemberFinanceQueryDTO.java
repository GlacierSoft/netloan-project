/*
 * @(#)MemberFinanceQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.dto.query.member;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.netloan.entity.member.MemberFinanceExample.Criteria;
import com.glacier.netloan.entity.member.MemberFinance;

/**
 * @ClassName: MemberFinanceQueryDTO 
 * @Description: TODO(会员财务查询QueryDTO) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-25上午9:53:51
 */
public class MemberFinanceQueryDTO extends MemberFinance{
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
   	 if(null != this.getMemberName() && StringUtils.isNotBlank(this.getMemberName())){//会员名称Like查询
            queryCriteria.andMemberNameLike("%" + this.getMemberName() + "%");
        }
   	 if(null != this.getBuyEstate()){//是否购房Enum查询
        queryCriteria.andBuyEstateEqualTo(this.getBuyEstate().toString());
   	 	}
   	 if(null != this.getBuyCar()){//是否购房Enum查询
        queryCriteria.andBuyCarEqualTo(this.getBuyCar().toString());
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
