package com.glacier.netloan.entity.email;

import java.util.Date;

public class MessageRecord {
    private String recordId;

    private String recordTitle;

    private String recordSend;

    private String recordMemberid;

    private Date createrTime;

    private String emailId;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getRecordTitle() {
        return recordTitle;
    }

    public void setRecordTitle(String recordTitle) {
        this.recordTitle = recordTitle;
    }

    public String getRecordSend() {
        return recordSend;
    }

    public void setRecordSend(String recordSend) {
        this.recordSend = recordSend;
    }

    public String getRecordMemberid() {
        return recordMemberid;
    }

    public void setRecordMemberid(String recordMemberid) {
        this.recordMemberid = recordMemberid;
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
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
        MessageRecord other = (MessageRecord) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getRecordTitle() == null ? other.getRecordTitle() == null : this.getRecordTitle().equals(other.getRecordTitle()))
            && (this.getRecordSend() == null ? other.getRecordSend() == null : this.getRecordSend().equals(other.getRecordSend()))
            && (this.getRecordMemberid() == null ? other.getRecordMemberid() == null : this.getRecordMemberid().equals(other.getRecordMemberid()))
            && (this.getCreaterTime() == null ? other.getCreaterTime() == null : this.getCreaterTime().equals(other.getCreaterTime()))
            && (this.getEmailId() == null ? other.getEmailId() == null : this.getEmailId().equals(other.getEmailId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getRecordTitle() == null) ? 0 : getRecordTitle().hashCode());
        result = prime * result + ((getRecordSend() == null) ? 0 : getRecordSend().hashCode());
        result = prime * result + ((getRecordMemberid() == null) ? 0 : getRecordMemberid().hashCode());
        result = prime * result + ((getCreaterTime() == null) ? 0 : getCreaterTime().hashCode());
        result = prime * result + ((getEmailId() == null) ? 0 : getEmailId().hashCode());
        return result;
    }
}