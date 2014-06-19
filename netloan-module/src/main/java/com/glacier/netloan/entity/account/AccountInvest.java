package com.glacier.netloan.entity.account;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class AccountInvest {
    private String investId;

    private Float sumUncollected=(float) 0.00; //投资成功待收金额

    private Float sumReward=(float) 0.00; //投资奖励金额

    private Float sumFine=(float) 0.00;// 借款人逾期罚款金额

    private Float sumBorrow=(float) 0.00;//借款成功金额

    private Float sumAdvfee=(float) 0.00;//借款 管理费总额

    private Float sumInterest=(float) 0.00;//借款利息总额

    private Float sumInterestfee=(float) 0.00;//借款逾期罚息金额

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    
     /**
      * 
      *自定义字段  
      *创建人,更新人
      */
    
    private String createrDisplay;
    
    private  String  updaterDisplay;
    
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

	public String getInvestId() {
        return investId;
    }

    public void setInvestId(String investId) {
        this.investId = investId;
    }

    public Float getSumUncollected() {
        return sumUncollected;
    }

    public void setSumUncollected(Float sumUncollected) {
        this.sumUncollected = sumUncollected;
    }

    public Float getSumReward() {
        return sumReward;
    }

    public void setSumReward(Float sumReward) {
        this.sumReward = sumReward;
    }

    public Float getSumFine() {
        return sumFine;
    }

    public void setSumFine(Float sumFine) {
        this.sumFine = sumFine;
    }

    public Float getSumBorrow() {
        return sumBorrow;
    }

    public void setSumBorrow(Float sumBorrow) {
        this.sumBorrow = sumBorrow;
    }

    public Float getSumAdvfee() {
        return sumAdvfee;
    }

    public void setSumAdvfee(Float sumAdvfee) {
        this.sumAdvfee = sumAdvfee;
    }

    public Float getSumInterest() {
        return sumInterest;
    }

    public void setSumInterest(Float sumInterest) {
        this.sumInterest = sumInterest;
    }

    public Float getSumInterestfee() {
        return sumInterestfee;
    }

    public void setSumInterestfee(Float sumInterestfee) {
        this.sumInterestfee = sumInterestfee;
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
        AccountInvest other = (AccountInvest) that;
        return (this.getInvestId() == null ? other.getInvestId() == null : this.getInvestId().equals(other.getInvestId()))
            && (this.getSumUncollected() == null ? other.getSumUncollected() == null : this.getSumUncollected().equals(other.getSumUncollected()))
            && (this.getSumReward() == null ? other.getSumReward() == null : this.getSumReward().equals(other.getSumReward()))
            && (this.getSumFine() == null ? other.getSumFine() == null : this.getSumFine().equals(other.getSumFine()))
            && (this.getSumBorrow() == null ? other.getSumBorrow() == null : this.getSumBorrow().equals(other.getSumBorrow()))
            && (this.getSumAdvfee() == null ? other.getSumAdvfee() == null : this.getSumAdvfee().equals(other.getSumAdvfee()))
            && (this.getSumInterest() == null ? other.getSumInterest() == null : this.getSumInterest().equals(other.getSumInterest()))
            && (this.getSumInterestfee() == null ? other.getSumInterestfee() == null : this.getSumInterestfee().equals(other.getSumInterestfee()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInvestId() == null) ? 0 : getInvestId().hashCode());
        result = prime * result + ((getSumUncollected() == null) ? 0 : getSumUncollected().hashCode());
        result = prime * result + ((getSumReward() == null) ? 0 : getSumReward().hashCode());
        result = prime * result + ((getSumFine() == null) ? 0 : getSumFine().hashCode());
        result = prime * result + ((getSumBorrow() == null) ? 0 : getSumBorrow().hashCode());
        result = prime * result + ((getSumAdvfee() == null) ? 0 : getSumAdvfee().hashCode());
        result = prime * result + ((getSumInterest() == null) ? 0 : getSumInterest().hashCode());
        result = prime * result + ((getSumInterestfee() == null) ? 0 : getSumInterestfee().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}