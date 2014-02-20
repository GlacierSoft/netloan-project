package com.glacier.netloan.entity.member;

import java.util.Date;

public class MemberEstate {
    private String estateId;

    private String memberId;

    private String address;

    private Float area;

    private Date yearBuilt;

    private String ageExpenses;

    private String firstOwner;

    private String secondOwner;

    private Date loanPeriod;

    private Float monthContributions;

    private Float outstandBalances;

    private String mortgageBank;

    private String creater;

    private Date createrTime;

    private String updater;

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

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
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
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreaterTime() == null ? other.getCreaterTime() == null : this.getCreaterTime().equals(other.getCreaterTime()))
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
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreaterTime() == null) ? 0 : getCreaterTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}