package com.glacier.netloan.entity.borrow;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class LoanReview {
    private String loanReviewId;

    private String loanId;
    
    /**
     * 自定义字段,借款标题
     */
    private String loanTitle;

    private String reviewContent;

    private String remark;

    
    /**
     * 自定义字段,留言人名称
     */
    private String memberDisplay;
    
    /**
     * 自定义字段,留言人头像
     */
    private String memberPhoto;
    
    private String creater;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public String getMemberDisplay() {
		return memberDisplay;
	}

	public void setMemberDisplay(String memberDisplay) {
		this.memberDisplay = memberDisplay;
	}

	public String getMemberPhoto() {
		return memberPhoto;
	}

	public void setMemberPhoto(String memberPhoto) {
		this.memberPhoto = memberPhoto;
	}

	public String getLoanTitle() {
		return loanTitle;
	}

	public void setLoanTitle(String loanTitle) {
		this.loanTitle = loanTitle;
	}

	public String getLoanReviewId() {
        return loanReviewId;
    }

    public void setLoanReviewId(String loanReviewId) {
        this.loanReviewId = loanReviewId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LoanReview other = (LoanReview) that;
        return (this.getLoanReviewId() == null ? other.getLoanReviewId() == null : this.getLoanReviewId().equals(other.getLoanReviewId()))
            && (this.getLoanId() == null ? other.getLoanId() == null : this.getLoanId().equals(other.getLoanId()))
            && (this.getReviewContent() == null ? other.getReviewContent() == null : this.getReviewContent().equals(other.getReviewContent()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoanReviewId() == null) ? 0 : getLoanReviewId().hashCode());
        result = prime * result + ((getLoanId() == null) ? 0 : getLoanId().hashCode());
        result = prime * result + ((getReviewContent() == null) ? 0 : getReviewContent().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}