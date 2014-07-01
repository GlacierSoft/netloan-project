package com.glacier.netloan.entity.finance;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinanceWithdrawSet {
    private String financeWithdrawSetId;

    private Float withdrawSetMinimum;

    private Float withdrawSetMaximum;

    private Float withdrawRate;

    private String memberType;

    private Float value;

    private String feeWay;

    private String auditState;
    /**
     * 自定义字段，显示审核人名
     */
    private String auditorDisplay;
	
    private String auditor;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date auditDate;

    private String auditRemark;
    /**
     * 自定义字段，显示创建人姓名
     */
    private String createrDisplay;
    private String creater;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")  
    private Date createTime;
    /**
     * 自定义字段，显示更新人姓名
     */
    private String updaterDisplay; 
    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")  
    private Date updateTime;

    private String remark;

    public String getFinanceWithdrawSetId() {
        return financeWithdrawSetId;
    }

    public void setFinanceWithdrawSetId(String financeWithdrawSetId) {
        this.financeWithdrawSetId = financeWithdrawSetId;
    }

    public Float getWithdrawSetMinimum() {
        return withdrawSetMinimum;
    }

    public void setWithdrawSetMinimum(Float withdrawSetMinimum) {
        this.withdrawSetMinimum = withdrawSetMinimum;
    }

    public Float getWithdrawSetMaximum() {
        return withdrawSetMaximum;
    }

    public void setWithdrawSetMaximum(Float withdrawSetMaximum) {
        this.withdrawSetMaximum = withdrawSetMaximum;
    }

    public Float getWithdrawRate() {
        return withdrawRate;
    }

    public void setWithdrawRate(Float withdrawRate) {
        this.withdrawRate = withdrawRate;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getFeeWay() {
        return feeWay;
    }

    public void setFeeWay(String feeWay) {
        this.feeWay = feeWay;
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

	public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        FinanceWithdrawSet other = (FinanceWithdrawSet) that;
        return (this.getFinanceWithdrawSetId() == null ? other.getFinanceWithdrawSetId() == null : this.getFinanceWithdrawSetId().equals(other.getFinanceWithdrawSetId()))
            && (this.getWithdrawSetMinimum() == null ? other.getWithdrawSetMinimum() == null : this.getWithdrawSetMinimum().equals(other.getWithdrawSetMinimum()))
            && (this.getWithdrawSetMaximum() == null ? other.getWithdrawSetMaximum() == null : this.getWithdrawSetMaximum().equals(other.getWithdrawSetMaximum()))
            && (this.getWithdrawRate() == null ? other.getWithdrawRate() == null : this.getWithdrawRate().equals(other.getWithdrawRate()))
            && (this.getMemberType() == null ? other.getMemberType() == null : this.getMemberType().equals(other.getMemberType()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getFeeWay() == null ? other.getFeeWay() == null : this.getFeeWay().equals(other.getFeeWay()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getAuditRemark() == null ? other.getAuditRemark() == null : this.getAuditRemark().equals(other.getAuditRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFinanceWithdrawSetId() == null) ? 0 : getFinanceWithdrawSetId().hashCode());
        result = prime * result + ((getWithdrawSetMinimum() == null) ? 0 : getWithdrawSetMinimum().hashCode());
        result = prime * result + ((getWithdrawSetMaximum() == null) ? 0 : getWithdrawSetMaximum().hashCode());
        result = prime * result + ((getWithdrawRate() == null) ? 0 : getWithdrawRate().hashCode());
        result = prime * result + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getFeeWay() == null) ? 0 : getFeeWay().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditRemark() == null) ? 0 : getAuditRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}