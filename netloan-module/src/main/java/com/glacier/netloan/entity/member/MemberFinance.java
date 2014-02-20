package com.glacier.netloan.entity.member;

import java.util.Date;

public class MemberFinance {
    private String memberId;

    private Float aveIncome;

    private String aveIncomeDes;

    private Float aveExpenses;

    private String ageExpensesDes;

    private String buyEstate;

    private String housingConditions;

    private Float estateValue;

    private String buyCat;

    private Float catValue;

    private String catAuth;

    private String companyName;

    private String companiesCapitalCon;

    private String otherAssetsDescribed;

    private String firstUnited;

    private String firstUnitedContact;

    private String firstUnitedPhone;

    private String secondUnited;

    private String secondContact;

    private String secondPhone;

    private String estateAuth;

    private String creater;

    private Date createrTime;

    private String updater;

    private Date updateTime;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Float getAveIncome() {
        return aveIncome;
    }

    public void setAveIncome(Float aveIncome) {
        this.aveIncome = aveIncome;
    }

    public String getAveIncomeDes() {
        return aveIncomeDes;
    }

    public void setAveIncomeDes(String aveIncomeDes) {
        this.aveIncomeDes = aveIncomeDes;
    }

    public Float getAveExpenses() {
        return aveExpenses;
    }

    public void setAveExpenses(Float aveExpenses) {
        this.aveExpenses = aveExpenses;
    }

    public String getAgeExpensesDes() {
        return ageExpensesDes;
    }

    public void setAgeExpensesDes(String ageExpensesDes) {
        this.ageExpensesDes = ageExpensesDes;
    }

    public String getBuyEstate() {
        return buyEstate;
    }

    public void setBuyEstate(String buyEstate) {
        this.buyEstate = buyEstate;
    }

    public String getHousingConditions() {
        return housingConditions;
    }

    public void setHousingConditions(String housingConditions) {
        this.housingConditions = housingConditions;
    }

    public Float getEstateValue() {
        return estateValue;
    }

    public void setEstateValue(Float estateValue) {
        this.estateValue = estateValue;
    }

    public String getBuyCat() {
        return buyCat;
    }

    public void setBuyCat(String buyCat) {
        this.buyCat = buyCat;
    }

    public Float getCatValue() {
        return catValue;
    }

    public void setCatValue(Float catValue) {
        this.catValue = catValue;
    }

    public String getCatAuth() {
        return catAuth;
    }

    public void setCatAuth(String catAuth) {
        this.catAuth = catAuth;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompaniesCapitalCon() {
        return companiesCapitalCon;
    }

    public void setCompaniesCapitalCon(String companiesCapitalCon) {
        this.companiesCapitalCon = companiesCapitalCon;
    }

    public String getOtherAssetsDescribed() {
        return otherAssetsDescribed;
    }

    public void setOtherAssetsDescribed(String otherAssetsDescribed) {
        this.otherAssetsDescribed = otherAssetsDescribed;
    }

    public String getFirstUnited() {
        return firstUnited;
    }

    public void setFirstUnited(String firstUnited) {
        this.firstUnited = firstUnited;
    }

    public String getFirstUnitedContact() {
        return firstUnitedContact;
    }

    public void setFirstUnitedContact(String firstUnitedContact) {
        this.firstUnitedContact = firstUnitedContact;
    }

    public String getFirstUnitedPhone() {
        return firstUnitedPhone;
    }

    public void setFirstUnitedPhone(String firstUnitedPhone) {
        this.firstUnitedPhone = firstUnitedPhone;
    }

    public String getSecondUnited() {
        return secondUnited;
    }

    public void setSecondUnited(String secondUnited) {
        this.secondUnited = secondUnited;
    }

    public String getSecondContact() {
        return secondContact;
    }

    public void setSecondContact(String secondContact) {
        this.secondContact = secondContact;
    }

    public String getSecondPhone() {
        return secondPhone;
    }

    public void setSecondPhone(String secondPhone) {
        this.secondPhone = secondPhone;
    }

    public String getEstateAuth() {
        return estateAuth;
    }

    public void setEstateAuth(String estateAuth) {
        this.estateAuth = estateAuth;
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
        MemberFinance other = (MemberFinance) that;
        return (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getAveIncome() == null ? other.getAveIncome() == null : this.getAveIncome().equals(other.getAveIncome()))
            && (this.getAveIncomeDes() == null ? other.getAveIncomeDes() == null : this.getAveIncomeDes().equals(other.getAveIncomeDes()))
            && (this.getAveExpenses() == null ? other.getAveExpenses() == null : this.getAveExpenses().equals(other.getAveExpenses()))
            && (this.getAgeExpensesDes() == null ? other.getAgeExpensesDes() == null : this.getAgeExpensesDes().equals(other.getAgeExpensesDes()))
            && (this.getBuyEstate() == null ? other.getBuyEstate() == null : this.getBuyEstate().equals(other.getBuyEstate()))
            && (this.getHousingConditions() == null ? other.getHousingConditions() == null : this.getHousingConditions().equals(other.getHousingConditions()))
            && (this.getEstateValue() == null ? other.getEstateValue() == null : this.getEstateValue().equals(other.getEstateValue()))
            && (this.getBuyCat() == null ? other.getBuyCat() == null : this.getBuyCat().equals(other.getBuyCat()))
            && (this.getCatValue() == null ? other.getCatValue() == null : this.getCatValue().equals(other.getCatValue()))
            && (this.getCatAuth() == null ? other.getCatAuth() == null : this.getCatAuth().equals(other.getCatAuth()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getCompaniesCapitalCon() == null ? other.getCompaniesCapitalCon() == null : this.getCompaniesCapitalCon().equals(other.getCompaniesCapitalCon()))
            && (this.getOtherAssetsDescribed() == null ? other.getOtherAssetsDescribed() == null : this.getOtherAssetsDescribed().equals(other.getOtherAssetsDescribed()))
            && (this.getFirstUnited() == null ? other.getFirstUnited() == null : this.getFirstUnited().equals(other.getFirstUnited()))
            && (this.getFirstUnitedContact() == null ? other.getFirstUnitedContact() == null : this.getFirstUnitedContact().equals(other.getFirstUnitedContact()))
            && (this.getFirstUnitedPhone() == null ? other.getFirstUnitedPhone() == null : this.getFirstUnitedPhone().equals(other.getFirstUnitedPhone()))
            && (this.getSecondUnited() == null ? other.getSecondUnited() == null : this.getSecondUnited().equals(other.getSecondUnited()))
            && (this.getSecondContact() == null ? other.getSecondContact() == null : this.getSecondContact().equals(other.getSecondContact()))
            && (this.getSecondPhone() == null ? other.getSecondPhone() == null : this.getSecondPhone().equals(other.getSecondPhone()))
            && (this.getEstateAuth() == null ? other.getEstateAuth() == null : this.getEstateAuth().equals(other.getEstateAuth()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreaterTime() == null ? other.getCreaterTime() == null : this.getCreaterTime().equals(other.getCreaterTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getAveIncome() == null) ? 0 : getAveIncome().hashCode());
        result = prime * result + ((getAveIncomeDes() == null) ? 0 : getAveIncomeDes().hashCode());
        result = prime * result + ((getAveExpenses() == null) ? 0 : getAveExpenses().hashCode());
        result = prime * result + ((getAgeExpensesDes() == null) ? 0 : getAgeExpensesDes().hashCode());
        result = prime * result + ((getBuyEstate() == null) ? 0 : getBuyEstate().hashCode());
        result = prime * result + ((getHousingConditions() == null) ? 0 : getHousingConditions().hashCode());
        result = prime * result + ((getEstateValue() == null) ? 0 : getEstateValue().hashCode());
        result = prime * result + ((getBuyCat() == null) ? 0 : getBuyCat().hashCode());
        result = prime * result + ((getCatValue() == null) ? 0 : getCatValue().hashCode());
        result = prime * result + ((getCatAuth() == null) ? 0 : getCatAuth().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getCompaniesCapitalCon() == null) ? 0 : getCompaniesCapitalCon().hashCode());
        result = prime * result + ((getOtherAssetsDescribed() == null) ? 0 : getOtherAssetsDescribed().hashCode());
        result = prime * result + ((getFirstUnited() == null) ? 0 : getFirstUnited().hashCode());
        result = prime * result + ((getFirstUnitedContact() == null) ? 0 : getFirstUnitedContact().hashCode());
        result = prime * result + ((getFirstUnitedPhone() == null) ? 0 : getFirstUnitedPhone().hashCode());
        result = prime * result + ((getSecondUnited() == null) ? 0 : getSecondUnited().hashCode());
        result = prime * result + ((getSecondContact() == null) ? 0 : getSecondContact().hashCode());
        result = prime * result + ((getSecondPhone() == null) ? 0 : getSecondPhone().hashCode());
        result = prime * result + ((getEstateAuth() == null) ? 0 : getEstateAuth().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreaterTime() == null) ? 0 : getCreaterTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}