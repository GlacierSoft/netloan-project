package com.glacier.netloan.entity.member;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class MemberEstate {
    private String estateId;

    private String memberId;

    /**
     * 自定义字段，显示会员真实名字
     */
    private String memberRealName;
    
    private String address;

    private Float area;

    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date yearBuilt;

    private String ageExpenses;

    private String firstOwner;

    private String secondOwner;

    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date loanPeriod;

    private Float monthContributions;

    private Float outstandBalances;

    private String mortgageBank;
    
    private String auditState;

    private String auditor;
    
    /**
     * 自定义字段,显示审核人的真实名字
     */
    private String auditorDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date auditDate;

    private String auditRemark;

    private String remark;

    private String creater;

    /**
     * 自定义字段,显示创建人真实名字
     */
    private String createrDisplay;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date createTime;

    private String updater;

    /**
     * 自定义字段，显示更新人真实名字
     */
    private String updaterDisplay;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date updateTime;

    public String getEstateId() {
        return estateId;
    }

    public void setEstateId(String estateId) {
        this.estateId = estateId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Date getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(Date yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getAgeExpenses() {
        return ageExpenses;
    }

    public void setAgeExpenses(String ageExpenses) {
        this.ageExpenses = ageExpenses;
    }

    public String getFirstOwner() {
        return firstOwner;
    }

    public void setFirstOwner(String firstOwner) {
        this.firstOwner = firstOwner;
    }

    public String getSecondOwner() {
        return secondOwner;
    }

    public void setSecondOwner(String secondOwner) {
        this.secondOwner = secondOwner;
    }

    public Date getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Date loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public Float getMonthContributions() {
        return monthContributions;
    }

    public void setMonthContributions(Float monthContributions) {
        this.monthContributions = monthContributions;
    }

    public Float getOutstandBalances() {
        return outstandBalances;
    }

    public void setOutstandBalances(Float outstandBalances) {
        this.outstandBalances = outstandBalances;
    }

    public String getMortgageBank() {
        return mortgageBank;
    }

    public void setMortgageBank(String mortgageBank) {
        this.mortgageBank = mortgageBank;
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

    public String getAuditorDisplay() {
        return auditorDisplay;
    }

    public void setAuditorDisplay(String auditorDisplay) {
        this.auditorDisplay = auditorDisplay;
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

    public String getMemberRealName() {
		return memberRealName;
	}

	public void setMemberRealName(String memberRealName) {
		this.memberRealName = memberRealName;
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
        MemberEstate other = (MemberEstate) that;
        return (this.getEstateId() == null ? other.getEstateId() == null : this.getEstateId().equals(other.getEstateId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getYearBuilt() == null ? other.getYearBuilt() == null : this.getYearBuilt().equals(other.getYearBuilt()))
            && (this.getAgeExpenses() == null ? other.getAgeExpenses() == null : this.getAgeExpenses().equals(other.getAgeExpenses()))
            && (this.getFirstOwner() == null ? other.getFirstOwner() == null : this.getFirstOwner().equals(other.getFirstOwner()))
            && (this.getSecondOwner() == null ? other.getSecondOwner() == null : this.getSecondOwner().equals(other.getSecondOwner()))
            && (this.getLoanPeriod() == null ? other.getLoanPeriod() == null : this.getLoanPeriod().equals(other.getLoanPeriod()))
            && (this.getMonthContributions() == null ? other.getMonthContributions() == null : this.getMonthContributions().equals(other.getMonthContributions()))
            && (this.getOutstandBalances() == null ? other.getOutstandBalances() == null : this.getOutstandBalances().equals(other.getOutstandBalances()))
            && (this.getMortgageBank() == null ? other.getMortgageBank() == null : this.getMortgageBank().equals(other.getMortgageBank()))
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
        result = prime * result + ((getEstateId() == null) ? 0 : getEstateId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getYearBuilt() == null) ? 0 : getYearBuilt().hashCode());
        result = prime * result + ((getAgeExpenses() == null) ? 0 : getAgeExpenses().hashCode());
        result = prime * result + ((getFirstOwner() == null) ? 0 : getFirstOwner().hashCode());
        result = prime * result + ((getSecondOwner() == null) ? 0 : getSecondOwner().hashCode());
        result = prime * result + ((getLoanPeriod() == null) ? 0 : getLoanPeriod().hashCode());
        result = prime * result + ((getMonthContributions() == null) ? 0 : getMonthContributions().hashCode());
        result = prime * result + ((getOutstandBalances() == null) ? 0 : getOutstandBalances().hashCode());
        result = prime * result + ((getMortgageBank() == null) ? 0 : getMortgageBank().hashCode());
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