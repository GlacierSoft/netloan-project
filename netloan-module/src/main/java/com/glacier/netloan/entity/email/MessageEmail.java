package com.glacier.netloan.entity.email;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class MessageEmail {
    private String emailId;

    private String emailTitle;

    private String emailText;

    private String emailType;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date sendTime;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createrTime;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }

    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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
        MessageEmail other = (MessageEmail) that;
        return (this.getEmailId() == null ? other.getEmailId() == null : this.getEmailId().equals(other.getEmailId()))
            && (this.getEmailTitle() == null ? other.getEmailTitle() == null : this.getEmailTitle().equals(other.getEmailTitle()))
            && (this.getEmailText() == null ? other.getEmailText() == null : this.getEmailText().equals(other.getEmailText()))
            && (this.getEmailType() == null ? other.getEmailType() == null : this.getEmailType().equals(other.getEmailType()))
            && (this.getSendTime() == null ? other.getSendTime() == null : this.getSendTime().equals(other.getSendTime()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreaterTime() == null ? other.getCreaterTime() == null : this.getCreaterTime().equals(other.getCreaterTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmailId() == null) ? 0 : getEmailId().hashCode());
        result = prime * result + ((getEmailTitle() == null) ? 0 : getEmailTitle().hashCode());
        result = prime * result + ((getEmailText() == null) ? 0 : getEmailText().hashCode());
        result = prime * result + ((getEmailType() == null) ? 0 : getEmailType().hashCode());
        result = prime * result + ((getSendTime() == null) ? 0 : getSendTime().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreaterTime() == null) ? 0 : getCreaterTime().hashCode());
        return result;
    }
}