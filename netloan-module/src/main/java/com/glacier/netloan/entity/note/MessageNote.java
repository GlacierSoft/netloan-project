package com.glacier.netloan.entity.note;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class MessageNote {
    private String noteId;

    private String noteTitle;

    private String noteText;

    private String noteType;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date noteTime;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createrTime;

    /**
     * 自定义字段
     * 发送人名称,收件人名称
     */
    private String createrDisplay;
    
    public String getCreaterDisplay() {
		return createrDisplay;
	}

	public void setCreaterDisplay(String createrDisplay) {
		this.createrDisplay = createrDisplay;
	}

	public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getNoteType() {
        return noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

    public Date getNoteTime() {
        return noteTime;
    }

    public void setNoteTime(Date noteTime) {
        this.noteTime = noteTime;
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
        MessageNote other = (MessageNote) that;
        return (this.getNoteId() == null ? other.getNoteId() == null : this.getNoteId().equals(other.getNoteId()))
            && (this.getNoteTitle() == null ? other.getNoteTitle() == null : this.getNoteTitle().equals(other.getNoteTitle()))
            && (this.getNoteText() == null ? other.getNoteText() == null : this.getNoteText().equals(other.getNoteText()))
            && (this.getNoteType() == null ? other.getNoteType() == null : this.getNoteType().equals(other.getNoteType()))
            && (this.getNoteTime() == null ? other.getNoteTime() == null : this.getNoteTime().equals(other.getNoteTime()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreaterTime() == null ? other.getCreaterTime() == null : this.getCreaterTime().equals(other.getCreaterTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNoteId() == null) ? 0 : getNoteId().hashCode());
        result = prime * result + ((getNoteTitle() == null) ? 0 : getNoteTitle().hashCode());
        result = prime * result + ((getNoteText() == null) ? 0 : getNoteText().hashCode());
        result = prime * result + ((getNoteType() == null) ? 0 : getNoteType().hashCode());
        result = prime * result + ((getNoteTime() == null) ? 0 : getNoteTime().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreaterTime() == null) ? 0 : getCreaterTime().hashCode());
        return result;
    }
}