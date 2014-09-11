package com.glacier.netloan.entity.note;

import java.util.Date;

public class MessageInfo {
    private String infoId;

    private String infoTitle;

    private String infoSend;

    private String infoMemberid;

    private Date createrTime;

    private String noteId;
    
    
    /**
     * 自定义字段
     * 发送人名称,收件人名称
     */
    private String infoSendDisplay;
    
    private String infoMemberNameDisplay;
    
    private String infoMemberDisplay;
    
    
   public String getInfoSendDisplay() {
		return infoSendDisplay;
	}

	public void setInfoSendDisplay(String infoSendDisplay) {
		this.infoSendDisplay = infoSendDisplay;
	}

	public String getInfoMemberNameDisplay() {
		return infoMemberNameDisplay;
	}

	public void setInfoMemberNameDisplay(String infoMemberNameDisplay) {
		this.infoMemberNameDisplay = infoMemberNameDisplay;
	}

	public String getInfoMemberDisplay() {
		return infoMemberDisplay;
	}

	public void setInfoMemberDisplay(String infoMemberDisplay) {
		this.infoMemberDisplay = infoMemberDisplay;
	}

	public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    public String getInfoSend() {
        return infoSend;
    }

    public void setInfoSend(String infoSend) {
        this.infoSend = infoSend;
    }

    public String getInfoMemberid() {
        return infoMemberid;
    }

    public void setInfoMemberid(String infoMemberid) {
        this.infoMemberid = infoMemberid;
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
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
        MessageInfo other = (MessageInfo) that;
        return (this.getInfoId() == null ? other.getInfoId() == null : this.getInfoId().equals(other.getInfoId()))
            && (this.getInfoTitle() == null ? other.getInfoTitle() == null : this.getInfoTitle().equals(other.getInfoTitle()))
            && (this.getInfoSend() == null ? other.getInfoSend() == null : this.getInfoSend().equals(other.getInfoSend()))
            && (this.getInfoMemberid() == null ? other.getInfoMemberid() == null : this.getInfoMemberid().equals(other.getInfoMemberid()))
            && (this.getCreaterTime() == null ? other.getCreaterTime() == null : this.getCreaterTime().equals(other.getCreaterTime()))
            && (this.getNoteId() == null ? other.getNoteId() == null : this.getNoteId().equals(other.getNoteId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInfoId() == null) ? 0 : getInfoId().hashCode());
        result = prime * result + ((getInfoTitle() == null) ? 0 : getInfoTitle().hashCode());
        result = prime * result + ((getInfoSend() == null) ? 0 : getInfoSend().hashCode());
        result = prime * result + ((getInfoMemberid() == null) ? 0 : getInfoMemberid().hashCode());
        result = prime * result + ((getCreaterTime() == null) ? 0 : getCreaterTime().hashCode());
        result = prime * result + ((getNoteId() == null) ? 0 : getNoteId().hashCode());
        return result;
    }
}