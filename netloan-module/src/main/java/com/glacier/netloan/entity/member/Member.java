package com.glacier.netloan.entity.member;

import java.util.Date;

public class Member {
    private String memberId;

    private String memberName;

    private String memberPassword;

    private String memberRealName;

    private Integer memberAge;

    private String mobileNumber;

    private String sex;

    private String maritalStatus;

    private String cardId;

    private String email;

    private Date registrationTime;

    private Float creditIntegral;

    private Float integral;

    private String status;

    private String type;

    private Date validTime;

    private Date expireTime;

    private String accessory;

    private String educational;

    private String personalDes;

    private String hometown;

    private String liveAddress;

    private String homePhone;

    private String firstContact;

    private String firstContactRelation;

    private String firstContactPhone;

    private String firstContactAddress;

    private String secondContact;

    private String secondContactRelation;

    private String secondContactPhone;

    private String secondContactAddress;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberRealName() {
        return memberRealName;
    }

    public void setMemberRealName(String memberRealName) {
        this.memberRealName = memberRealName;
    }

    public Integer getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Float getCreditIntegral() {
        return creditIntegral;
    }

    public void setCreditIntegral(Float creditIntegral) {
        this.creditIntegral = creditIntegral;
    }

    public Float getIntegral() {
        return integral;
    }

    public void setIntegral(Float integral) {
        this.integral = integral;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getValidTime() {
        return validTime;
    }

    public void setValidTime(Date validTime) {
        this.validTime = validTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational;
    }

    public String getPersonalDes() {
        return personalDes;
    }

    public void setPersonalDes(String personalDes) {
        this.personalDes = personalDes;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getFirstContact() {
        return firstContact;
    }

    public void setFirstContact(String firstContact) {
        this.firstContact = firstContact;
    }

    public String getFirstContactRelation() {
        return firstContactRelation;
    }

    public void setFirstContactRelation(String firstContactRelation) {
        this.firstContactRelation = firstContactRelation;
    }

    public String getFirstContactPhone() {
        return firstContactPhone;
    }

    public void setFirstContactPhone(String firstContactPhone) {
        this.firstContactPhone = firstContactPhone;
    }

    public String getFirstContactAddress() {
        return firstContactAddress;
    }

    public void setFirstContactAddress(String firstContactAddress) {
        this.firstContactAddress = firstContactAddress;
    }

    public String getSecondContact() {
        return secondContact;
    }

    public void setSecondContact(String secondContact) {
        this.secondContact = secondContact;
    }

    public String getSecondContactRelation() {
        return secondContactRelation;
    }

    public void setSecondContactRelation(String secondContactRelation) {
        this.secondContactRelation = secondContactRelation;
    }

    public String getSecondContactPhone() {
        return secondContactPhone;
    }

    public void setSecondContactPhone(String secondContactPhone) {
        this.secondContactPhone = secondContactPhone;
    }

    public String getSecondContactAddress() {
        return secondContactAddress;
    }

    public void setSecondContactAddress(String secondContactAddress) {
        this.secondContactAddress = secondContactAddress;
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
        Member other = (Member) that;
        return (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getMemberPassword() == null ? other.getMemberPassword() == null : this.getMemberPassword().equals(other.getMemberPassword()))
            && (this.getMemberRealName() == null ? other.getMemberRealName() == null : this.getMemberRealName().equals(other.getMemberRealName()))
            && (this.getMemberAge() == null ? other.getMemberAge() == null : this.getMemberAge().equals(other.getMemberAge()))
            && (this.getMobileNumber() == null ? other.getMobileNumber() == null : this.getMobileNumber().equals(other.getMobileNumber()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getMaritalStatus() == null ? other.getMaritalStatus() == null : this.getMaritalStatus().equals(other.getMaritalStatus()))
            && (this.getCardId() == null ? other.getCardId() == null : this.getCardId().equals(other.getCardId()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getRegistrationTime() == null ? other.getRegistrationTime() == null : this.getRegistrationTime().equals(other.getRegistrationTime()))
            && (this.getCreditIntegral() == null ? other.getCreditIntegral() == null : this.getCreditIntegral().equals(other.getCreditIntegral()))
            && (this.getIntegral() == null ? other.getIntegral() == null : this.getIntegral().equals(other.getIntegral()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getValidTime() == null ? other.getValidTime() == null : this.getValidTime().equals(other.getValidTime()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getEducational() == null ? other.getEducational() == null : this.getEducational().equals(other.getEducational()))
            && (this.getPersonalDes() == null ? other.getPersonalDes() == null : this.getPersonalDes().equals(other.getPersonalDes()))
            && (this.getHometown() == null ? other.getHometown() == null : this.getHometown().equals(other.getHometown()))
            && (this.getLiveAddress() == null ? other.getLiveAddress() == null : this.getLiveAddress().equals(other.getLiveAddress()))
            && (this.getHomePhone() == null ? other.getHomePhone() == null : this.getHomePhone().equals(other.getHomePhone()))
            && (this.getFirstContact() == null ? other.getFirstContact() == null : this.getFirstContact().equals(other.getFirstContact()))
            && (this.getFirstContactRelation() == null ? other.getFirstContactRelation() == null : this.getFirstContactRelation().equals(other.getFirstContactRelation()))
            && (this.getFirstContactPhone() == null ? other.getFirstContactPhone() == null : this.getFirstContactPhone().equals(other.getFirstContactPhone()))
            && (this.getFirstContactAddress() == null ? other.getFirstContactAddress() == null : this.getFirstContactAddress().equals(other.getFirstContactAddress()))
            && (this.getSecondContact() == null ? other.getSecondContact() == null : this.getSecondContact().equals(other.getSecondContact()))
            && (this.getSecondContactRelation() == null ? other.getSecondContactRelation() == null : this.getSecondContactRelation().equals(other.getSecondContactRelation()))
            && (this.getSecondContactPhone() == null ? other.getSecondContactPhone() == null : this.getSecondContactPhone().equals(other.getSecondContactPhone()))
            && (this.getSecondContactAddress() == null ? other.getSecondContactAddress() == null : this.getSecondContactAddress().equals(other.getSecondContactAddress()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getMemberPassword() == null) ? 0 : getMemberPassword().hashCode());
        result = prime * result + ((getMemberRealName() == null) ? 0 : getMemberRealName().hashCode());
        result = prime * result + ((getMemberAge() == null) ? 0 : getMemberAge().hashCode());
        result = prime * result + ((getMobileNumber() == null) ? 0 : getMobileNumber().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getMaritalStatus() == null) ? 0 : getMaritalStatus().hashCode());
        result = prime * result + ((getCardId() == null) ? 0 : getCardId().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getRegistrationTime() == null) ? 0 : getRegistrationTime().hashCode());
        result = prime * result + ((getCreditIntegral() == null) ? 0 : getCreditIntegral().hashCode());
        result = prime * result + ((getIntegral() == null) ? 0 : getIntegral().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getValidTime() == null) ? 0 : getValidTime().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getEducational() == null) ? 0 : getEducational().hashCode());
        result = prime * result + ((getPersonalDes() == null) ? 0 : getPersonalDes().hashCode());
        result = prime * result + ((getHometown() == null) ? 0 : getHometown().hashCode());
        result = prime * result + ((getLiveAddress() == null) ? 0 : getLiveAddress().hashCode());
        result = prime * result + ((getHomePhone() == null) ? 0 : getHomePhone().hashCode());
        result = prime * result + ((getFirstContact() == null) ? 0 : getFirstContact().hashCode());
        result = prime * result + ((getFirstContactRelation() == null) ? 0 : getFirstContactRelation().hashCode());
        result = prime * result + ((getFirstContactPhone() == null) ? 0 : getFirstContactPhone().hashCode());
        result = prime * result + ((getFirstContactAddress() == null) ? 0 : getFirstContactAddress().hashCode());
        result = prime * result + ((getSecondContact() == null) ? 0 : getSecondContact().hashCode());
        result = prime * result + ((getSecondContactRelation() == null) ? 0 : getSecondContactRelation().hashCode());
        result = prime * result + ((getSecondContactPhone() == null) ? 0 : getSecondContactPhone().hashCode());
        result = prime * result + ((getSecondContactAddress() == null) ? 0 : getSecondContactAddress().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}