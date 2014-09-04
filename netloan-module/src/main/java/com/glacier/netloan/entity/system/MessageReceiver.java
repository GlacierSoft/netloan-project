package com.glacier.netloan.entity.system;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class MessageReceiver {
    private String msgReceId;

    private String recipient;
      
    //自定义字段，接收人
    private String recipientName;
    
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date receiveSendtime;
    
    private Boolean readStatus;

    private String replyMsg;

    private Boolean recipientDel;

    public String getMsgReceId() {
        return msgReceId;
    }

    public Date getReceiveSendtime() {
		return receiveSendtime;
	}

	public void setReceiveSendtime(Date receiveSendtime) {
		this.receiveSendtime = receiveSendtime;
	}

	public void setMsgReceId(String msgReceId) {
        this.msgReceId = msgReceId;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Boolean getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Boolean readStatus) {
        this.readStatus = readStatus;
    }

    public String getReplyMsg() {
        return replyMsg;
    }

    public void setReplyMsg(String replyMsg) {
        this.replyMsg = replyMsg;
    }

    public Boolean getRecipientDel() {
        return recipientDel;
    }

    public void setRecipientDel(Boolean recipientDel) {
        this.recipientDel = recipientDel;
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
        MessageReceiver other = (MessageReceiver) that;
        return (this.getMsgReceId() == null ? other.getMsgReceId() == null : this.getMsgReceId().equals(other.getMsgReceId()))
            && (this.getRecipient() == null ? other.getRecipient() == null : this.getRecipient().equals(other.getRecipient()))
            && (this.getReadStatus() == null ? other.getReadStatus() == null : this.getReadStatus().equals(other.getReadStatus()))
            && (this.getReplyMsg() == null ? other.getReplyMsg() == null : this.getReplyMsg().equals(other.getReplyMsg()))
            && (this.getRecipientDel() == null ? other.getRecipientDel() == null : this.getRecipientDel().equals(other.getRecipientDel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMsgReceId() == null) ? 0 : getMsgReceId().hashCode());
        result = prime * result + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        result = prime * result + ((getReadStatus() == null) ? 0 : getReadStatus().hashCode());
        result = prime * result + ((getReplyMsg() == null) ? 0 : getReplyMsg().hashCode());
        result = prime * result + ((getRecipientDel() == null) ? 0 : getRecipientDel().hashCode());
        return result;
    }
}