package com.glacier.netloan.entity.finance;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinanceWithdraw {
    private String financeWithdrawId;

    private String withdrawCode;

    private String memberId;
    
    /**
     * 自定义字段，显示充值会员真实姓名
     */
    private String memberDisplay;

    private String openingBank;

    private String subbranch;

    private String cardName;

    private String cardNumber;

    private Float withdrawAmount;

    private Float arriveMoney;

    private Float handlingCharge;

    private Float withdrawRate;

    private String auditState;

    private String auditor;

    /**
     * 自定义字段，显示审核人真实姓名
     */
    private String auditorDisplay;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditDate;

    private String auditRemark;

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

    public String getFinanceWithdrawId() {
        return financeWithdrawId;
    }

    public void setFinanceWithdrawId(String financeWithdrawId) {
        this.financeWithdrawId = financeWithdrawId;
    }

    public String getWithdrawCode() {
        return withdrawCode;
    }

    public void setWithdrawCode(String withdrawCode) {
        this.withdrawCode = withdrawCode;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    public String getSubbranch() {
        return subbranch;
    }

    public void setSubbranch(String subbranch) {
        this.subbranch = subbranch;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Float getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(Float withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public Float getArriveMoney() {
        return arriveMoney;
    }

    public void setArriveMoney(Float arriveMoney) {
        this.arriveMoney = arriveMoney;
    }

    public Float getHandlingCharge() {
        return handlingCharge;
    }

    public void setHandlingCharge(Float handlingCharge) {
        this.handlingCharge = handlingCharge;
    }

    public Float getWithdrawRate() {
        return withdrawRate;
    }

    public void setWithdrawRate(Float withdrawRate) {
        this.withdrawRate = withdrawRate;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
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

    public String getMemberDisplay() {
		return memberDisplay;
	}

	public void setMemberDisplay(String memberDisplay) {
		this.memberDisplay = memberDisplay;
	}

	public String getAuditorDisplay() {
		return auditorDisplay;
	}

	public void setAuditorDisplay(String auditorDisplay) {
		this.auditorDisplay = auditorDisplay;
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
        FinanceWithdraw other = (FinanceWithdraw) that;
        return (this.getFinanceWithdrawId() == null ? other.getFinanceWithdrawId() == null : this.getFinanceWithdrawId().equals(other.getFinanceWithdrawId()))
            && (this.getWithdrawCode() == null ? other.getWithdrawCode() == null : this.getWithdrawCode().equals(other.getWithdrawCode()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getOpeningBank() == null ? other.getOpeningBank() == null : this.getOpeningBank().equals(other.getOpeningBank()))
            && (this.getSubbranch() == null ? other.getSubbranch() == null : this.getSubbranch().equals(other.getSubbranch()))
            && (this.getCardName() == null ? other.getCardName() == null : this.getCardName().equals(other.getCardName()))
            && (this.getCardNumber() == null ? other.getCardNumber() == null : this.getCardNumber().equals(other.getCardNumber()))
            && (this.getWithdrawAmount() == null ? other.getWithdrawAmount() == null : this.getWithdrawAmount().equals(other.getWithdrawAmount()))
            && (this.getArriveMoney() == null ? other.getArriveMoney() == null : this.getArriveMoney().equals(other.getArriveMoney()))
            && (this.getHandlingCharge() == null ? other.getHandlingCharge() == null : this.getHandlingCharge().equals(other.getHandlingCharge()))
            && (this.getWithdrawRate() == null ? other.getWithdrawRate() == null : this.getWithdrawRate().equals(other.getWithdrawRate()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getAuditRemark() == null ? other.getAuditRemark() == null : this.getAuditRemark().equals(other.getAuditRemark()))
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
        result = prime * result + ((getFinanceWithdrawId() == null) ? 0 : getFinanceWithdrawId().hashCode());
        result = prime * result + ((getWithdrawCode() == null) ? 0 : getWithdrawCode().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getOpeningBank() == null) ? 0 : getOpeningBank().hashCode());
        result = prime * result + ((getSubbranch() == null) ? 0 : getSubbranch().hashCode());
        result = prime * result + ((getCardName() == null) ? 0 : getCardName().hashCode());
        result = prime * result + ((getCardNumber() == null) ? 0 : getCardNumber().hashCode());
        result = prime * result + ((getWithdrawAmount() == null) ? 0 : getWithdrawAmount().hashCode());
        result = prime * result + ((getArriveMoney() == null) ? 0 : getArriveMoney().hashCode());
        result = prime * result + ((getHandlingCharge() == null) ? 0 : getHandlingCharge().hashCode());
        result = prime * result + ((getWithdrawRate() == null) ? 0 : getWithdrawRate().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditRemark() == null) ? 0 : getAuditRemark().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}