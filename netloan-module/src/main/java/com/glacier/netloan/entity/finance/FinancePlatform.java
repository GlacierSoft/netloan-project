package com.glacier.netloan.entity.finance;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinancePlatform {
    private String financePlatformId;

    private String platformCode;

    private String platformName;

    private String platformAccount;

    private Float platformMoney;

    private String auditState;

    private String auditor; 

    private String openingBank;

    private String cardName;

    private String subbranch;

    private String cardNumber;

    private String platformType;

	    /**
     * 自定义字段，审核人的真实姓名
     */
    private String auditorDisplay;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditDate;

    private String auditRemark;
    
    private String remark;

    private String creater;

    /**
     * 自定义字段，创建人的真实姓名
     */
    private String createrDisplay;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;
    
    /**
     * 自定义字段，更新人真实姓名
     */
    private String updaterDisplay;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
	
    public String getFinancePlatformId() {
        return financePlatformId;
    }

    public void setFinancePlatformId(String financePlatformId) {
        this.financePlatformId = financePlatformId;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformAccount() {
        return platformAccount;
    }

    public void setPlatformAccount(String platformAccount) {
        this.platformAccount = platformAccount;
    }

    public Float getPlatformMoney() {
        return platformMoney;
    }

    public void setPlatformMoney(Float platformMoney) {
        this.platformMoney = platformMoney;
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

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getSubbranch() {
        return subbranch;
    }

    public void setSubbranch(String subbranch) {
        this.subbranch = subbranch;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
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
        FinancePlatform other = (FinancePlatform) that;
        return (this.getFinancePlatformId() == null ? other.getFinancePlatformId() == null : this.getFinancePlatformId().equals(other.getFinancePlatformId()))
            && (this.getPlatformCode() == null ? other.getPlatformCode() == null : this.getPlatformCode().equals(other.getPlatformCode()))
            && (this.getPlatformName() == null ? other.getPlatformName() == null : this.getPlatformName().equals(other.getPlatformName()))
            && (this.getPlatformAccount() == null ? other.getPlatformAccount() == null : this.getPlatformAccount().equals(other.getPlatformAccount()))
            && (this.getPlatformMoney() == null ? other.getPlatformMoney() == null : this.getPlatformMoney().equals(other.getPlatformMoney()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getAuditRemark() == null ? other.getAuditRemark() == null : this.getAuditRemark().equals(other.getAuditRemark()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getOpeningBank() == null ? other.getOpeningBank() == null : this.getOpeningBank().equals(other.getOpeningBank()))
            && (this.getCardName() == null ? other.getCardName() == null : this.getCardName().equals(other.getCardName()))
            && (this.getSubbranch() == null ? other.getSubbranch() == null : this.getSubbranch().equals(other.getSubbranch()))
            && (this.getCardNumber() == null ? other.getCardNumber() == null : this.getCardNumber().equals(other.getCardNumber()))
            && (this.getPlatformType() == null ? other.getPlatformType() == null : this.getPlatformType().equals(other.getPlatformType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFinancePlatformId() == null) ? 0 : getFinancePlatformId().hashCode());
        result = prime * result + ((getPlatformCode() == null) ? 0 : getPlatformCode().hashCode());
        result = prime * result + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        result = prime * result + ((getPlatformAccount() == null) ? 0 : getPlatformAccount().hashCode());
        result = prime * result + ((getPlatformMoney() == null) ? 0 : getPlatformMoney().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditRemark() == null) ? 0 : getAuditRemark().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getOpeningBank() == null) ? 0 : getOpeningBank().hashCode());
        result = prime * result + ((getCardName() == null) ? 0 : getCardName().hashCode());
        result = prime * result + ((getSubbranch() == null) ? 0 : getSubbranch().hashCode());
        result = prime * result + ((getCardNumber() == null) ? 0 : getCardNumber().hashCode());
        result = prime * result + ((getPlatformType() == null) ? 0 : getPlatformType().hashCode());
        return result;
    }
}