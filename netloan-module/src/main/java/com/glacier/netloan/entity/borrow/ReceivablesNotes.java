package com.glacier.netloan.entity.borrow;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ReceivablesNotes {
    private String receNotesId;

    private String tenderNotesId;

    /**
     * 自定义字段,收款人名称
     */
    private String memberDisplay;
    
    /**
     * 自定义字段,借款标题
     */
    private String loanTitle;
    
    /**
     * 自定义字段,借款人名称
     */
    private String loanMemberDisplay;
    
    /**
     * 自定义字段,借款id
     */
    private String loanId;
    
    /**
     * 自定义字段,借款人id
     */
    private String loanMemberId;
    
    /**
     * 自定义字段 标的类型名称
     */
    private String loanTenderDisplay;
    
    /**
     * 自定义字段 借款状态
     */
    private String loanState;
    
    /**
     * 自定义字段 年利率
     */
    private Float loanApr;
    
    /**
     * 自定义字段  借款 期限
     */
    private String loanDeadlinesId;
    
    /**
     * 自定义字段 最小认购单位(元)
     */
    private Float lowestSub;
    
    /**
     * 自定义字段 认购总份数
     */
    private Float subTotal;
    
    /**
     * 自定义字段 投标份数
     */
    private Float subSum;

    /**
     * 自定义字段 投标金额
     */
    private Float tenderMoney;
    
    /**
     * 自定义字段,会员信用积分
     */
    private Float creditIntegral;
    
    /**
     * 自定义字段,会员信用图标
     */
    private String creditPhoto;
    
    private String memberId;

    private Float receivablesTotal;

    private Float shouldReceMoney;

    private Float alrReceMoney;

    private Float notReceMoney;

    private Float alrOverdueInterest;

    private String receState;

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

    public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getLoanTitle() {
		return loanTitle;
	}

	public void setLoanTitle(String loanTitle) {
		this.loanTitle = loanTitle;
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

	public String getLoanTenderDisplay() {
		return loanTenderDisplay;
	}

	public void setLoanTenderDisplay(String loanTenderDisplay) {
		this.loanTenderDisplay = loanTenderDisplay;
	}

	public String getLoanState() {
		return loanState;
	}

	public void setLoanState(String loanState) {
		this.loanState = loanState;
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

	public Float getLowestSub() {
		return lowestSub;
	}

	public void setLowestSub(Float lowestSub) {
		this.lowestSub = lowestSub;
	}

	public Float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Float subTotal) {
		this.subTotal = subTotal;
	}

	public Float getSubSum() {
		return subSum;
	}

	public void setSubSum(Float subSum) {
		this.subSum = subSum;
	}

	public Float getTenderMoney() {
		return tenderMoney;
	}

	public void setTenderMoney(Float tenderMoney) {
		this.tenderMoney = tenderMoney;
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

	public String getMemberDisplay() {
		return memberDisplay;
	}

	public void setMemberDisplay(String memberDisplay) {
		this.memberDisplay = memberDisplay;
	}

	public String getReceNotesId() {
        return receNotesId;
    }

    public void setReceNotesId(String receNotesId) {
        this.receNotesId = receNotesId;
    }

    public String getTenderNotesId() {
        return tenderNotesId;
    }

    public void setTenderNotesId(String tenderNotesId) {
        this.tenderNotesId = tenderNotesId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Float getReceivablesTotal() {
        return receivablesTotal;
    }

    public void setReceivablesTotal(Float receivablesTotal) {
        this.receivablesTotal = receivablesTotal;
    }

    public Float getShouldReceMoney() {
        return shouldReceMoney;
    }

    public void setShouldReceMoney(Float shouldReceMoney) {
        this.shouldReceMoney = shouldReceMoney;
    }

    public Float getAlrReceMoney() {
        return alrReceMoney;
    }

    public void setAlrReceMoney(Float alrReceMoney) {
        this.alrReceMoney = alrReceMoney;
    }

    public Float getNotReceMoney() {
        return notReceMoney;
    }

    public void setNotReceMoney(Float notReceMoney) {
        this.notReceMoney = notReceMoney;
    }

    public Float getAlrOverdueInterest() {
        return alrOverdueInterest;
    }

    public void setAlrOverdueInterest(Float alrOverdueInterest) {
        this.alrOverdueInterest = alrOverdueInterest;
    }

    public String getReceState() {
        return receState;
    }

    public void setReceState(String receState) {
        this.receState = receState;
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
        ReceivablesNotes other = (ReceivablesNotes) that;
        return (this.getReceNotesId() == null ? other.getReceNotesId() == null : this.getReceNotesId().equals(other.getReceNotesId()))
            && (this.getTenderNotesId() == null ? other.getTenderNotesId() == null : this.getTenderNotesId().equals(other.getTenderNotesId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getReceivablesTotal() == null ? other.getReceivablesTotal() == null : this.getReceivablesTotal().equals(other.getReceivablesTotal()))
            && (this.getShouldReceMoney() == null ? other.getShouldReceMoney() == null : this.getShouldReceMoney().equals(other.getShouldReceMoney()))
            && (this.getAlrReceMoney() == null ? other.getAlrReceMoney() == null : this.getAlrReceMoney().equals(other.getAlrReceMoney()))
            && (this.getNotReceMoney() == null ? other.getNotReceMoney() == null : this.getNotReceMoney().equals(other.getNotReceMoney()))
            && (this.getAlrOverdueInterest() == null ? other.getAlrOverdueInterest() == null : this.getAlrOverdueInterest().equals(other.getAlrOverdueInterest()))
            && (this.getReceState() == null ? other.getReceState() == null : this.getReceState().equals(other.getReceState()))
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
        result = prime * result + ((getReceNotesId() == null) ? 0 : getReceNotesId().hashCode());
        result = prime * result + ((getTenderNotesId() == null) ? 0 : getTenderNotesId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getReceivablesTotal() == null) ? 0 : getReceivablesTotal().hashCode());
        result = prime * result + ((getShouldReceMoney() == null) ? 0 : getShouldReceMoney().hashCode());
        result = prime * result + ((getAlrReceMoney() == null) ? 0 : getAlrReceMoney().hashCode());
        result = prime * result + ((getNotReceMoney() == null) ? 0 : getNotReceMoney().hashCode());
        result = prime * result + ((getAlrOverdueInterest() == null) ? 0 : getAlrOverdueInterest().hashCode());
        result = prime * result + ((getReceState() == null) ? 0 : getReceState().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}