package com.glacier.netloan.entity.member;

import java.util.Date;

public class MemberAuth {
    private String memberId;

    private String infoAuth;

    private String infoAuditor;

    private Date infoTime;

    private String vipAuth;

    private String vipAuditor;

    private Date vipTime;

    private String emailAuth;

    private String emailAuditor;

    private Date emailTime;

    private String mobileAuth;

    private String mobileAuditor;

    private Date mobileTime;

    private String creditAuth;

    private String creditAuditor;

    private Date creditTime;

    private String companyAuth;

    private String companyAuditor;

    private Date companyTime;

    private String realNameAuth;

    private String realNameAuditor;

    private Date realNameTime;

    private String idCardAuth;

    private String idCardAuditor;

    private Date idCardTime;

    private String workAuth;

    private String workAuditor;

    private Date workTime;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getInfoAuth() {
        return infoAuth;
    }

    public void setInfoAuth(String infoAuth) {
        this.infoAuth = infoAuth;
    }

    public String getInfoAuditor() {
        return infoAuditor;
    }

    public void setInfoAuditor(String infoAuditor) {
        this.infoAuditor = infoAuditor;
    }

    public Date getInfoTime() {
        return infoTime;
    }

    public void setInfoTime(Date infoTime) {
        this.infoTime = infoTime;
    }

    public String getVipAuth() {
        return vipAuth;
    }

    public void setVipAuth(String vipAuth) {
        this.vipAuth = vipAuth;
    }

    public String getVipAuditor() {
        return vipAuditor;
    }

    public void setVipAuditor(String vipAuditor) {
        this.vipAuditor = vipAuditor;
    }

    public Date getVipTime() {
        return vipTime;
    }

    public void setVipTime(Date vipTime) {
        this.vipTime = vipTime;
    }

    public String getEmailAuth() {
        return emailAuth;
    }

    public void setEmailAuth(String emailAuth) {
        this.emailAuth = emailAuth;
    }

    public String getEmailAuditor() {
        return emailAuditor;
    }

    public void setEmailAuditor(String emailAuditor) {
        this.emailAuditor = emailAuditor;
    }

    public Date getEmailTime() {
        return emailTime;
    }

    public void setEmailTime(Date emailTime) {
        this.emailTime = emailTime;
    }

    public String getMobileAuth() {
        return mobileAuth;
    }

    public void setMobileAuth(String mobileAuth) {
        this.mobileAuth = mobileAuth;
    }

    public String getMobileAuditor() {
        return mobileAuditor;
    }

    public void setMobileAuditor(String mobileAuditor) {
        this.mobileAuditor = mobileAuditor;
    }

    public Date getMobileTime() {
        return mobileTime;
    }

    public void setMobileTime(Date mobileTime) {
        this.mobileTime = mobileTime;
    }

    public String getCreditAuth() {
        return creditAuth;
    }

    public void setCreditAuth(String creditAuth) {
        this.creditAuth = creditAuth;
    }

    public String getCreditAuditor() {
        return creditAuditor;
    }

    public void setCreditAuditor(String creditAuditor) {
        this.creditAuditor = creditAuditor;
    }

    public Date getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Date creditTime) {
        this.creditTime = creditTime;
    }

    public String getCompanyAuth() {
        return companyAuth;
    }

    public void setCompanyAuth(String companyAuth) {
        this.companyAuth = companyAuth;
    }

    public String getCompanyAuditor() {
        return companyAuditor;
    }

    public void setCompanyAuditor(String companyAuditor) {
        this.companyAuditor = companyAuditor;
    }

    public Date getCompanyTime() {
        return companyTime;
    }

    public void setCompanyTime(Date companyTime) {
        this.companyTime = companyTime;
    }

    public String getRealNameAuth() {
        return realNameAuth;
    }

    public void setRealNameAuth(String realNameAuth) {
        this.realNameAuth = realNameAuth;
    }

    public String getRealNameAuditor() {
        return realNameAuditor;
    }

    public void setRealNameAuditor(String realNameAuditor) {
        this.realNameAuditor = realNameAuditor;
    }

    public Date getRealNameTime() {
        return realNameTime;
    }

    public void setRealNameTime(Date realNameTime) {
        this.realNameTime = realNameTime;
    }

    public String getIdCardAuth() {
        return idCardAuth;
    }

    public void setIdCardAuth(String idCardAuth) {
        this.idCardAuth = idCardAuth;
    }

    public String getIdCardAuditor() {
        return idCardAuditor;
    }

    public void setIdCardAuditor(String idCardAuditor) {
        this.idCardAuditor = idCardAuditor;
    }

    public Date getIdCardTime() {
        return idCardTime;
    }

    public void setIdCardTime(Date idCardTime) {
        this.idCardTime = idCardTime;
    }

    public String getWorkAuth() {
        return workAuth;
    }

    public void setWorkAuth(String workAuth) {
        this.workAuth = workAuth;
    }

    public String getWorkAuditor() {
        return workAuditor;
    }

    public void setWorkAuditor(String workAuditor) {
        this.workAuditor = workAuditor;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
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
        MemberAuth other = (MemberAuth) that;
        return (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getInfoAuth() == null ? other.getInfoAuth() == null : this.getInfoAuth().equals(other.getInfoAuth()))
            && (this.getInfoAuditor() == null ? other.getInfoAuditor() == null : this.getInfoAuditor().equals(other.getInfoAuditor()))
            && (this.getInfoTime() == null ? other.getInfoTime() == null : this.getInfoTime().equals(other.getInfoTime()))
            && (this.getVipAuth() == null ? other.getVipAuth() == null : this.getVipAuth().equals(other.getVipAuth()))
            && (this.getVipAuditor() == null ? other.getVipAuditor() == null : this.getVipAuditor().equals(other.getVipAuditor()))
            && (this.getVipTime() == null ? other.getVipTime() == null : this.getVipTime().equals(other.getVipTime()))
            && (this.getEmailAuth() == null ? other.getEmailAuth() == null : this.getEmailAuth().equals(other.getEmailAuth()))
            && (this.getEmailAuditor() == null ? other.getEmailAuditor() == null : this.getEmailAuditor().equals(other.getEmailAuditor()))
            && (this.getEmailTime() == null ? other.getEmailTime() == null : this.getEmailTime().equals(other.getEmailTime()))
            && (this.getMobileAuth() == null ? other.getMobileAuth() == null : this.getMobileAuth().equals(other.getMobileAuth()))
            && (this.getMobileAuditor() == null ? other.getMobileAuditor() == null : this.getMobileAuditor().equals(other.getMobileAuditor()))
            && (this.getMobileTime() == null ? other.getMobileTime() == null : this.getMobileTime().equals(other.getMobileTime()))
            && (this.getCreditAuth() == null ? other.getCreditAuth() == null : this.getCreditAuth().equals(other.getCreditAuth()))
            && (this.getCreditAuditor() == null ? other.getCreditAuditor() == null : this.getCreditAuditor().equals(other.getCreditAuditor()))
            && (this.getCreditTime() == null ? other.getCreditTime() == null : this.getCreditTime().equals(other.getCreditTime()))
            && (this.getCompanyAuth() == null ? other.getCompanyAuth() == null : this.getCompanyAuth().equals(other.getCompanyAuth()))
            && (this.getCompanyAuditor() == null ? other.getCompanyAuditor() == null : this.getCompanyAuditor().equals(other.getCompanyAuditor()))
            && (this.getCompanyTime() == null ? other.getCompanyTime() == null : this.getCompanyTime().equals(other.getCompanyTime()))
            && (this.getRealNameAuth() == null ? other.getRealNameAuth() == null : this.getRealNameAuth().equals(other.getRealNameAuth()))
            && (this.getRealNameAuditor() == null ? other.getRealNameAuditor() == null : this.getRealNameAuditor().equals(other.getRealNameAuditor()))
            && (this.getRealNameTime() == null ? other.getRealNameTime() == null : this.getRealNameTime().equals(other.getRealNameTime()))
            && (this.getIdCardAuth() == null ? other.getIdCardAuth() == null : this.getIdCardAuth().equals(other.getIdCardAuth()))
            && (this.getIdCardAuditor() == null ? other.getIdCardAuditor() == null : this.getIdCardAuditor().equals(other.getIdCardAuditor()))
            && (this.getIdCardTime() == null ? other.getIdCardTime() == null : this.getIdCardTime().equals(other.getIdCardTime()))
            && (this.getWorkAuth() == null ? other.getWorkAuth() == null : this.getWorkAuth().equals(other.getWorkAuth()))
            && (this.getWorkAuditor() == null ? other.getWorkAuditor() == null : this.getWorkAuditor().equals(other.getWorkAuditor()))
            && (this.getWorkTime() == null ? other.getWorkTime() == null : this.getWorkTime().equals(other.getWorkTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getInfoAuth() == null) ? 0 : getInfoAuth().hashCode());
        result = prime * result + ((getInfoAuditor() == null) ? 0 : getInfoAuditor().hashCode());
        result = prime * result + ((getInfoTime() == null) ? 0 : getInfoTime().hashCode());
        result = prime * result + ((getVipAuth() == null) ? 0 : getVipAuth().hashCode());
        result = prime * result + ((getVipAuditor() == null) ? 0 : getVipAuditor().hashCode());
        result = prime * result + ((getVipTime() == null) ? 0 : getVipTime().hashCode());
        result = prime * result + ((getEmailAuth() == null) ? 0 : getEmailAuth().hashCode());
        result = prime * result + ((getEmailAuditor() == null) ? 0 : getEmailAuditor().hashCode());
        result = prime * result + ((getEmailTime() == null) ? 0 : getEmailTime().hashCode());
        result = prime * result + ((getMobileAuth() == null) ? 0 : getMobileAuth().hashCode());
        result = prime * result + ((getMobileAuditor() == null) ? 0 : getMobileAuditor().hashCode());
        result = prime * result + ((getMobileTime() == null) ? 0 : getMobileTime().hashCode());
        result = prime * result + ((getCreditAuth() == null) ? 0 : getCreditAuth().hashCode());
        result = prime * result + ((getCreditAuditor() == null) ? 0 : getCreditAuditor().hashCode());
        result = prime * result + ((getCreditTime() == null) ? 0 : getCreditTime().hashCode());
        result = prime * result + ((getCompanyAuth() == null) ? 0 : getCompanyAuth().hashCode());
        result = prime * result + ((getCompanyAuditor() == null) ? 0 : getCompanyAuditor().hashCode());
        result = prime * result + ((getCompanyTime() == null) ? 0 : getCompanyTime().hashCode());
        result = prime * result + ((getRealNameAuth() == null) ? 0 : getRealNameAuth().hashCode());
        result = prime * result + ((getRealNameAuditor() == null) ? 0 : getRealNameAuditor().hashCode());
        result = prime * result + ((getRealNameTime() == null) ? 0 : getRealNameTime().hashCode());
        result = prime * result + ((getIdCardAuth() == null) ? 0 : getIdCardAuth().hashCode());
        result = prime * result + ((getIdCardAuditor() == null) ? 0 : getIdCardAuditor().hashCode());
        result = prime * result + ((getIdCardTime() == null) ? 0 : getIdCardTime().hashCode());
        result = prime * result + ((getWorkAuth() == null) ? 0 : getWorkAuth().hashCode());
        result = prime * result + ((getWorkAuditor() == null) ? 0 : getWorkAuditor().hashCode());
        result = prime * result + ((getWorkTime() == null) ? 0 : getWorkTime().hashCode());
        return result;
    }
}