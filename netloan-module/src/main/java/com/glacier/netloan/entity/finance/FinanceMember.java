package com.glacier.netloan.entity.finance;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinanceMember {
    private String financeMemberId;

    private String bankCardId;

    /**
     * 自定义字段，显示银行卡真实姓名
     */
    private String bankCardDisplay;
    
    private String memberId;

    /**
     * 自定义字段，显示充值会员真实姓名
     */
    private String memberDisplay;
    
    private Float usableMoney;

    private Float frozenMoney;

    private Float collectingMoney;

    private Float refundMoney;

    private Float amount;

    private Float rechargeMonthTimes;

    private Float rechargeTimes;

    private Float rechargeMoney;

    private Float withdrawMonthTimes;

    private Float withdrawTimes;

    private Float withdrawMoney;

    private Float borrowerCredit;

    private Float availableCredit;

    private String remark;

    private String creater;
    
    /**
     * 自定义字段，显示审核人真实姓名
     */
    private String createrDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    /**
     * 自定义字段，显示更新人真实姓名
     */
    private String updaterDisplay;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public String getFinanceMemberId() {
        return financeMemberId;
    }

    public void setFinanceMemberId(String financeMemberId) {
        this.financeMemberId = financeMemberId;
    }

    public String getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Float getUsableMoney() {
        return usableMoney;
    }

    public void setUsableMoney(Float usableMoney) {
        this.usableMoney = usableMoney;
    }

    public Float getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(Float frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    public Float getCollectingMoney() {
        return collectingMoney;
    }

    public void setCollectingMoney(Float collectingMoney) {
        this.collectingMoney = collectingMoney;
    }

    public Float getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(Float refundMoney) {
        this.refundMoney = refundMoney;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getRechargeMonthTimes() {
        return rechargeMonthTimes;
    }

    public void setRechargeMonthTimes(Float rechargeMonthTimes) {
        this.rechargeMonthTimes = rechargeMonthTimes;
    }

    public Float getRechargeTimes() {
        return rechargeTimes;
    }

    public void setRechargeTimes(Float rechargeTimes) {
        this.rechargeTimes = rechargeTimes;
    }

    public Float getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(Float rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public Float getWithdrawMonthTimes() {
        return withdrawMonthTimes;
    }

    public void setWithdrawMonthTimes(Float withdrawMonthTimes) {
        this.withdrawMonthTimes = withdrawMonthTimes;
    }

    public Float getWithdrawTimes() {
        return withdrawTimes;
    }

    public void setWithdrawTimes(Float withdrawTimes) {
        this.withdrawTimes = withdrawTimes;
    }

    public Float getWithdrawMoney() {
        return withdrawMoney;
    }

    public void setWithdrawMoney(Float withdrawMoney) {
        this.withdrawMoney = withdrawMoney;
    }

    public Float getBorrowerCredit() {
        return borrowerCredit;
    }

    public void setBorrowerCredit(Float borrowerCredit) {
        this.borrowerCredit = borrowerCredit;
    }

    public Float getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(Float availableCredit) {
        this.availableCredit = availableCredit;
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

    public String getBankCardDisplay() {
		return bankCardDisplay;
	}

	public void setBankCardDisplay(String bankCardDisplay) {
		this.bankCardDisplay = bankCardDisplay;
	}

	public String getMemberDisplay() {
		return memberDisplay;
	}

	public void setMemberDisplay(String memberDisplay) {
		this.memberDisplay = memberDisplay;
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
        FinanceMember other = (FinanceMember) that;
        return (this.getFinanceMemberId() == null ? other.getFinanceMemberId() == null : this.getFinanceMemberId().equals(other.getFinanceMemberId()))
            && (this.getBankCardId() == null ? other.getBankCardId() == null : this.getBankCardId().equals(other.getBankCardId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getUsableMoney() == null ? other.getUsableMoney() == null : this.getUsableMoney().equals(other.getUsableMoney()))
            && (this.getFrozenMoney() == null ? other.getFrozenMoney() == null : this.getFrozenMoney().equals(other.getFrozenMoney()))
            && (this.getCollectingMoney() == null ? other.getCollectingMoney() == null : this.getCollectingMoney().equals(other.getCollectingMoney()))
            && (this.getRefundMoney() == null ? other.getRefundMoney() == null : this.getRefundMoney().equals(other.getRefundMoney()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getRechargeMonthTimes() == null ? other.getRechargeMonthTimes() == null : this.getRechargeMonthTimes().equals(other.getRechargeMonthTimes()))
            && (this.getRechargeTimes() == null ? other.getRechargeTimes() == null : this.getRechargeTimes().equals(other.getRechargeTimes()))
            && (this.getRechargeMoney() == null ? other.getRechargeMoney() == null : this.getRechargeMoney().equals(other.getRechargeMoney()))
            && (this.getWithdrawMonthTimes() == null ? other.getWithdrawMonthTimes() == null : this.getWithdrawMonthTimes().equals(other.getWithdrawMonthTimes()))
            && (this.getWithdrawTimes() == null ? other.getWithdrawTimes() == null : this.getWithdrawTimes().equals(other.getWithdrawTimes()))
            && (this.getWithdrawMoney() == null ? other.getWithdrawMoney() == null : this.getWithdrawMoney().equals(other.getWithdrawMoney()))
            && (this.getBorrowerCredit() == null ? other.getBorrowerCredit() == null : this.getBorrowerCredit().equals(other.getBorrowerCredit()))
            && (this.getAvailableCredit() == null ? other.getAvailableCredit() == null : this.getAvailableCredit().equals(other.getAvailableCredit()))
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
        result = prime * result + ((getFinanceMemberId() == null) ? 0 : getFinanceMemberId().hashCode());
        result = prime * result + ((getBankCardId() == null) ? 0 : getBankCardId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getUsableMoney() == null) ? 0 : getUsableMoney().hashCode());
        result = prime * result + ((getFrozenMoney() == null) ? 0 : getFrozenMoney().hashCode());
        result = prime * result + ((getCollectingMoney() == null) ? 0 : getCollectingMoney().hashCode());
        result = prime * result + ((getRefundMoney() == null) ? 0 : getRefundMoney().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getRechargeMonthTimes() == null) ? 0 : getRechargeMonthTimes().hashCode());
        result = prime * result + ((getRechargeTimes() == null) ? 0 : getRechargeTimes().hashCode());
        result = prime * result + ((getRechargeMoney() == null) ? 0 : getRechargeMoney().hashCode());
        result = prime * result + ((getWithdrawMonthTimes() == null) ? 0 : getWithdrawMonthTimes().hashCode());
        result = prime * result + ((getWithdrawTimes() == null) ? 0 : getWithdrawTimes().hashCode());
        result = prime * result + ((getWithdrawMoney() == null) ? 0 : getWithdrawMoney().hashCode());
        result = prime * result + ((getBorrowerCredit() == null) ? 0 : getBorrowerCredit().hashCode());
        result = prime * result + ((getAvailableCredit() == null) ? 0 : getAvailableCredit().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}