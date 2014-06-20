/**
 * 
 */
package com.glacier.netloan.dto.query.borrow;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.netloan.entity.borrow.LoanReview; 
import com.glacier.netloan.entity.borrow.LoanReviewExample.Criteria;

/**
 * @ClassName:  LoanReviewNotesQueryDTO
 * @Description: TODO(借款留言条件查询DTO)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-6-19  下午4:38:04
 */
public class LoanReviewNotesQueryDTO extends LoanReview {
	private Date createStartTime;//统计开始时间

    private Date createEndTime;//统计结束时间
 
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
	   	 if(null != this.getLoanTitle() && StringUtils.isNotBlank(this.getLoanTitle())){//会员名称Like查询
	            queryCriteria.andLoanTitleLike("%" + this.getLoanTitle() + "%");
	        }  
	   	 if(null != createStartTime && null != createEndTime){//创建时间段查询
	           queryCriteria.andCreateTimeBetween(createStartTime, createEndTime); 
	     }else{
	          if(null != createStartTime){
	              queryCriteria.andCreateTimeGreaterThanOrEqualTo(createStartTime);
	          }
	          if(null != createEndTime){
	              queryCriteria.andCreateTimeGreaterThanOrEqualTo(createEndTime);
	          }
	           
	       }
   }
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   }
    
}
