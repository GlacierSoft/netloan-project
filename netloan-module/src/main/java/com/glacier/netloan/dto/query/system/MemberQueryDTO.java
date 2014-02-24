package com.glacier.netloan.dto.query.system;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberExample.Criteria;

/**
 * @ClassName: MemberQueryDTO 
 * @Description: TODO(会员查询DTO) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-22下午5:03:42
 */
public class MemberQueryDTO extends Member{
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
   	 if(null != this.getMemberRealName() && StringUtils.isNotBlank(this.getMemberRealName())){//会员真实名称Like查询
            queryCriteria.andMemberRealNameLike("%" + this.getMemberRealName() + "%");
        }
   	 if(null != this.getStatus() && StringUtils.isNotBlank(this.getStatus())){//状态Like查询
            queryCriteria.andStatusLike("%" + this.getStatus() + "%");
        }
   	 if(null != this.getType() && StringUtils.isNotBlank(this.getType())){//类型Like查询
            queryCriteria.andTypeLike("%" + this.getType() + "%");
        }
     if(null != createStartTime && null != createEndTime){//创建时间段查询
           queryCriteria.andRegistrationTimeBetween(createStartTime, createEndTime); 
     }else{
          if(null != createStartTime){
              queryCriteria.andRegistrationTimeGreaterThanOrEqualTo(createStartTime);
          }
          if(null != createEndTime){
              queryCriteria.andRegistrationTimeLessThanOrEqualTo(createEndTime);
          }
           
       }
   }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   }


}
