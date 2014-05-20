package com.glacier.netloan.entity.borrow;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class AttentionBorrowing {
    private String attentionBorrowingId;

    private String loanId;
	
	/**
     * 自定义字段,借款标题
     */
    private String loanTitle;
    
    /**
     * 自定义字段 关注人名称
     */
    private String memberDisplay;
    
    /**
     * 自定义字段,借款人名称
     */
    private String loanMemberDisplay;
    
    /**
     * 自定义字段,借款人id
     */
    private String loanMemberId;
    
    /**
     * 自定义字段,会员信用积分
     */
    private Float creditIntegral;
    
    /**
     * 自定义字段,会员信用图标
     */
    private String creditPhoto;
    
    /**
     * 自定义字段 标的类型名称
     */
    private String loanTenderDisplay;
    
    /**
     * 自定义字段 还款方式
     */
    private String repaymentTypeDisplay;
    
    /**
     * 自定义字段 借款金额
     */
    private Float loanTotal;
    
    /**
     * 自定义字段 年利率
     */
    private Float loanApr;
    
    /**
     * 自定义字段  借款 期限
     */
    private String loanDeadlinesId;
    
    /**
     * 自定义字段 发布时间
     */
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date loanDate;
    
    /**
     * 自定义字段 借款完成百分比
     */
    private Float alrTenderPro;

    private String memberId;

    private String remark;

    /**
     * 自定义字段   创建人名称
     */
    private String createrDisplay;
    
    
    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 自定义字段  更新人名称
     */
    private String updaterDisplay;
    
    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public String getLoanTitle() {
		return loanTitle;
	}

	public void setLoanTitle(String loanTitle) {
		this.loanTitle = loanTitle;
	}

	public String getMemberDisplay() {
		return memberDisplay;
	}

	public void setMemberDisplay(String memberDisplay) {
		this.memberDisplay = memberDisplay;
	}

	public String getLoanMemberDisplay() {
		return loanMemberDisplay;
	}

	public void setLoanMemberDisplay(String loanMemberDisplay) {
		this.loanMemberDisplay = loanMemberDisplay;
	}

	public String getLoanMemberId() {
		return loanMemberId;
	}

	public void setLoanMemberId(String loanMemberId) {
		this.loanMemberId = loanMemberId;
	}

	public Float getCreditIntegral() {
		return creditIntegral;
	}

	public void setCreditIntegral(Float creditIntegral) {
		this.creditIntegral = creditIntegral;
	}

	public String getCreditPhoto() {
		return creditPhoto;
	}

	public void setCreditPhoto(String creditPhoto) {
		this.creditPhoto = creditPhoto;
	}

	public String getLoanTenderDisplay() {
		return loanTenderDisplay;
	}

	public void setLoanTenderDisplay(String loanTenderDisplay) {
		this.loanTenderDisplay = loanTenderDisplay;
	}

	public String getRepaymentTypeDisplay() {
		return repaymentTypeDisplay;
	}

	public void setRepaymentTypeDisplay(String repaymentTypeDisplay) {
		this.repaymentTypeDisplay = repaymentTypeDisplay;
	}

	public Float getLoanTotal() {
		return loanTotal;
	}

	public void setLoanTotal(Float loanTotal) {
		this.loanTotal = loanTotal;
	}

	public Float getLoanApr() {
		return loanApr;
	}

	public void setLoanApr(Float loanApr) {
		this.loanApr = loanApr;
	}

	public String getLoanDeadlinesId() {
		return loanDeadlinesId;
	}

	public void setLoanDeadlinesId(String loanDeadlinesId) {
		this.loanDeadlinesId = loanDeadlinesId;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public Float getAlrTenderPro() {
		return alrTenderPro;
	}

	public void setAlrTenderPro(Float alrTenderPro) {
		this.alrTenderPro = alrTenderPro;
	}

	public String getCreaterDisplay() {
		return createrDisplay;
	}

	public void setCreaterDisplay(String createrDisplay) {
		this.createrDisplay = createrDisplay;
	}

	public String getUpdaterDisplay() {
		return updaterDisplay;
	}

	public void setUpdaterDisplay(String updaterDisplay) {
		this.updaterDisplay = updaterDisplay;
	}

	public String getAttentionBorrowingId() {
        return attentionBorrowingId;
    }

    public void setAttentionBorrowingId(String attentionBorrowingId) {
        this.attentionBorrowingId = attentionBorrowingId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
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

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        AttentionBorrowing other = (AttentionBorrowing) that;
        return (this.getAttentionBorrowingId() == null ? other.getAttentionBorrowingId() == null : this.getAttentionBorrowingId().equals(other.getAttentionBorrowingId()))
            && (this.getLoanId() == null ? other.getLoanId() == null : this.getLoanId().equals(other.getLoanId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAttentionBorrowingId() == null) ? 0 : getAttentionBorrowingId().hashCode());
        result = prime * result + ((getLoanId() == null) ? 0 : getLoanId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}