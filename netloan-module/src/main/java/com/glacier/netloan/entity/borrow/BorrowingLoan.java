package com.glacier.netloan.entity.borrow;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class BorrowingLoan {
    private String loanId;

    private String loanCode;

    private String memberId;
    
    /**
     * 自定义字段 筹标期限，date类型
     */
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date waitBidDeadlinesDate;
    
    /**
     * 自定义字段
     */
    private String memberDisplay;
    
    /**
     * 自定义字段,会员信用积分
     */
    private Float creditIntegral;
    
    /**
     * 自定义字段,会员信用图标
     */
    private String creditPhoto;

    private String loanTitle;

    private String loanPicture;

    private String loanTenderId;

    /**
     * 自定义字段，借款标的类型
     */
    private String loanTenderDisplay;
    
    private String loanPurposeId;

    private String loanDeadlinesId;

    private String failedReason;

    private String isDayMarked;

    private String isBidReward;

    private Float bidProReward;

    private Float fixedAppReward;

    private String isBidMarked;

    private Float readyRecMoney;

    private String isBidPwd;

    private String bidPwd;

    private Float loanManagementFees;

    private String repaymentTypeId;
    
    /**
     * 自定义字段
     */
    private String repaymentTypeDisplay;

    private Float loanTotal;

    private Float loanApr;

    private String lowestBidMoney;

    private String largestBidMoney;

    private Float lowestSub;

    private Float subTotal;

    private Float alrSubSum;

    private Float alrTenderPro;

    private Float tenderSum;

    private String waitBidDeadlines;

    private String loanDetail;

    private String isAccountFunds;

    private String isLoanFunds;

    private String isCreditAmount;

    private String isBidFunds;

    private String isAutomaticBid;

    private String isRecommend;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date loanDate;

    private String memberIp;

    private String loanState;

    private String remark;

    private String firstAuditState;

    private String firstAuditorId;
    
    /**
     * 自定义字段
     */
    private String firstAuditorDisplay;

    private String firstAdvice;

    private String firstMesNotice;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date firstAuditDate;

    private String secondAuditState;

    private String secondAuditorId;
    
    /**
     * 自定义字段
     */
    private String secondAuditorDisplay;

    private String secondAdvice;

    private String secondMesNotice;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date secondAuditDate;

    private String creater;

    /**
     * 自定义字段
     */
    private String createrDisplay;
    
    private String updater;
    
    /**
     * 自定义字段
     */
    private String updaterDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    
    private Float alrBidMoney;
    

    public Date getWaitBidDeadlinesDate() {
		return waitBidDeadlinesDate;
	}

	public void setWaitBidDeadlinesDate(Date waitBidDeadlinesDate) {
		this.waitBidDeadlinesDate = waitBidDeadlinesDate;
	}

	public Float getAlrBidMoney() {
		return alrBidMoney;
	}

	public void setAlrBidMoney(Float alrBidMoney) {
		this.alrBidMoney = alrBidMoney;
	}

	public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getLoanTitle() {
        return loanTitle;
    }

    public void setLoanTitle(String loanTitle) {
        this.loanTitle = loanTitle;
    }

    public String getLoanPicture() {
        return loanPicture;
    }

    public void setLoanPicture(String loanPicture) {
        this.loanPicture = loanPicture;
    }

    public String getLoanTenderId() {
        return loanTenderId;
    }

    public void setLoanTenderId(String loanTenderId) {
        this.loanTenderId = loanTenderId;
    }

    public String getLoanPurposeId() {
        return loanPurposeId;
    }

    public void setLoanPurposeId(String loanPurposeId) {
        this.loanPurposeId = loanPurposeId;
    }

    public String getLoanDeadlinesId() {
        return loanDeadlinesId;
    }

    public void setLoanDeadlinesId(String loanDeadlinesId) {
        this.loanDeadlinesId = loanDeadlinesId;
    }

    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public String getIsDayMarked() {
        return isDayMarked;
    }

    public void setIsDayMarked(String isDayMarked) {
        this.isDayMarked = isDayMarked;
    }

    public String getIsBidReward() {
        return isBidReward;
    }

    public void setIsBidReward(String isBidReward) {
        this.isBidReward = isBidReward;
    }

    public Float getBidProReward() {
        return bidProReward;
    }

    public void setBidProReward(Float bidProReward) {
        this.bidProReward = bidProReward;
    }

    public Float getFixedAppReward() {
        return fixedAppReward;
    }

    public void setFixedAppReward(Float fixedAppReward) {
        this.fixedAppReward = fixedAppReward;
    }

    public String getIsBidMarked() {
        return isBidMarked;
    }

    public void setIsBidMarked(String isBidMarked) {
        this.isBidMarked = isBidMarked;
    }

    public Float getReadyRecMoney() {
        return readyRecMoney;
    }

    public void setReadyRecMoney(Float readyRecMoney) {
        this.readyRecMoney = readyRecMoney;
    }

    public String getIsBidPwd() {
        return isBidPwd;
    }

    public void setIsBidPwd(String isBidPwd) {
        this.isBidPwd = isBidPwd;
    }

    public String getBidPwd() {
        return bidPwd;
    }

    public void setBidPwd(String bidPwd) {
        this.bidPwd = bidPwd;
    }

    public Float getLoanManagementFees() {
        return loanManagementFees;
    }

    public void setLoanManagementFees(Float loanManagementFees) {
        this.loanManagementFees = loanManagementFees;
    }

    public String getRepaymentTypeId() {
        return repaymentTypeId;
    }

    public void setRepaymentTypeId(String repaymentTypeId) {
        this.repaymentTypeId = repaymentTypeId;
    }

    public Float getLoanTotal() {
        return loanTotal;
    }

    public void setLoanTotal(Float loanTotal) {
        this.loanTotal = loanTotal;
    }

    public Float getLoanApr() {
        return loanApr;
    }

    public void setLoanApr(Float loanApr) {
        this.loanApr = loanApr;
    }

    public String getLowestBidMoney() {
        return lowestBidMoney;
    }

    public void setLowestBidMoney(String lowestBidMoney) {
        this.lowestBidMoney = lowestBidMoney;
    }

    public String getLargestBidMoney() {
        return largestBidMoney;
    }

    public void setLargestBidMoney(String largestBidMoney) {
        this.largestBidMoney = largestBidMoney;
    }

    public Float getLowestSub() {
        return lowestSub;
    }

    public void setLowestSub(Float lowestSub) {
        this.lowestSub = lowestSub;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }

    public Float getAlrSubSum() {
        return alrSubSum;
    }

    public void setAlrSubSum(Float alrSubSum) {
        this.alrSubSum = alrSubSum;
    }

    public Float getAlrTenderPro() {
        return alrTenderPro;
    }

    public void setAlrTenderPro(Float alrTenderPro) {
        this.alrTenderPro = alrTenderPro;
    }

    public Float getTenderSum() {
        return tenderSum;
    }

    public void setTenderSum(Float tenderSum) {
        this.tenderSum = tenderSum;
    }

    public String getWaitBidDeadlines() {
        return waitBidDeadlines;
    }

    public void setWaitBidDeadlines(String waitBidDeadlines) {
        this.waitBidDeadlines = waitBidDeadlines;
    }

    public String getLoanDetail() {
        return loanDetail;
    }

    public void setLoanDetail(String loanDetail) {
        this.loanDetail = loanDetail;
    }

    public String getIsAccountFunds() {
        return isAccountFunds;
    }

    public void setIsAccountFunds(String isAccountFunds) {
        this.isAccountFunds = isAccountFunds;
    }

    public String getIsLoanFunds() {
        return isLoanFunds;
    }

    public void setIsLoanFunds(String isLoanFunds) {
        this.isLoanFunds = isLoanFunds;
    }

    public String getIsCreditAmount() {
        return isCreditAmount;
    }

    public void setIsCreditAmount(String isCreditAmount) {
        this.isCreditAmount = isCreditAmount;
    }

    public String getIsBidFunds() {
        return isBidFunds;
    }

    public void setIsBidFunds(String isBidFunds) {
        this.isBidFunds = isBidFunds;
    }

    public String getIsAutomaticBid() {
        return isAutomaticBid;
    }

    public void setIsAutomaticBid(String isAutomaticBid) {
        this.isAutomaticBid = isAutomaticBid;
    }

    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public String getMemberIp() {
        return memberIp;
    }

    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
    }

    public String getLoanState() {
        return loanState;
    }

    public void setLoanState(String loanState) {
        this.loanState = loanState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFirstAuditState() {
        return firstAuditState;
    }

    public void setFirstAuditState(String firstAuditState) {
        this.firstAuditState = firstAuditState;
    }

    public String getFirstAuditorId() {
        return firstAuditorId;
    }

    public void setFirstAuditorId(String firstAuditorId) {
        this.firstAuditorId = firstAuditorId;
    }

    public String getFirstAdvice() {
        return firstAdvice;
    }

    public void setFirstAdvice(String firstAdvice) {
        this.firstAdvice = firstAdvice;
    }

    public String getFirstMesNotice() {
        return firstMesNotice;
    }

    public void setFirstMesNotice(String firstMesNotice) {
        this.firstMesNotice = firstMesNotice;
    }

    public Date getFirstAuditDate() {
        return firstAuditDate;
    }

    public void setFirstAuditDate(Date firstAuditDate) {
        this.firstAuditDate = firstAuditDate;
    }

    public String getSecondAuditState() {
        return secondAuditState;
    }

    public void setSecondAuditState(String secondAuditState) {
        this.secondAuditState = secondAuditState;
    }

    public String getSecondAuditorId() {
        return secondAuditorId;
    }

    public void setSecondAuditorId(String secondAuditorId) {
        this.secondAuditorId = secondAuditorId;
    }

    public String getSecondAdvice() {
        return secondAdvice;
    }

    public void setSecondAdvice(String secondAdvice) {
        this.secondAdvice = secondAdvice;
    }

    public String getSecondMesNotice() {
        return secondMesNotice;
    }

    public void setSecondMesNotice(String secondMesNotice) {
        this.secondMesNotice = secondMesNotice;
    }

    public Date getSecondAuditDate() {
        return secondAuditDate;
    }

    public void setSecondAuditDate(Date secondAuditDate) {
        this.secondAuditDate = secondAuditDate;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
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
    
    public String getMemberDisplay() {
		return memberDisplay;
	}

	public void setMemberDisplay(String memberDisplay) {
		this.memberDisplay = memberDisplay;
	}

	public String getLoanTenderDisplay() {
		return loanTenderDisplay;
	}

	public void setLoanTenderDisplay(String loanTenderDisplay) {
		this.loanTenderDisplay = loanTenderDisplay;
	}

	public String getFirstAuditorDisplay() {
		return firstAuditorDisplay;
	}

	public void setFirstAuditorDisplay(String firstAuditorDisplay) {
		this.firstAuditorDisplay = firstAuditorDisplay;
	}

	public String getSecondAuditorDisplay() {
		return secondAuditorDisplay;
	}

	public void setSecondAuditorDisplay(String secondAuditorDisplay) {
		this.secondAuditorDisplay = secondAuditorDisplay;
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

	public String getCreditPhoto() {
		return creditPhoto;
	}

	public void setCreditPhoto(String creditPhoto) {
		this.creditPhoto = creditPhoto;
	}

	public Float getCreditIntegral() {
		return creditIntegral;
	}

	public void setCreditIntegral(Float creditIntegral) {
		this.creditIntegral = creditIntegral;
	}

	public String getRepaymentTypeDisplay() {
		return repaymentTypeDisplay;
	}

	public void setRepaymentTypeDisplay(String repaymentTypeDisplay) {
		this.repaymentTypeDisplay = repaymentTypeDisplay;
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
	        BorrowingLoan other = (BorrowingLoan) that;
	        return (this.getLoanId() == null ? other.getLoanId() == null : this.getLoanId().equals(other.getLoanId()))
	            && (this.getLoanCode() == null ? other.getLoanCode() == null : this.getLoanCode().equals(other.getLoanCode()))
	            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
	            && (this.getLoanTitle() == null ? other.getLoanTitle() == null : this.getLoanTitle().equals(other.getLoanTitle()))
	            && (this.getLoanPicture() == null ? other.getLoanPicture() == null : this.getLoanPicture().equals(other.getLoanPicture()))
	            && (this.getLoanTenderId() == null ? other.getLoanTenderId() == null : this.getLoanTenderId().equals(other.getLoanTenderId()))
	            && (this.getLoanPurposeId() == null ? other.getLoanPurposeId() == null : this.getLoanPurposeId().equals(other.getLoanPurposeId()))
	            && (this.getLoanDeadlinesId() == null ? other.getLoanDeadlinesId() == null : this.getLoanDeadlinesId().equals(other.getLoanDeadlinesId()))
	            && (this.getFailedReason() == null ? other.getFailedReason() == null : this.getFailedReason().equals(other.getFailedReason()))
	            && (this.getIsDayMarked() == null ? other.getIsDayMarked() == null : this.getIsDayMarked().equals(other.getIsDayMarked()))
	            && (this.getIsBidReward() == null ? other.getIsBidReward() == null : this.getIsBidReward().equals(other.getIsBidReward()))
	            && (this.getBidProReward() == null ? other.getBidProReward() == null : this.getBidProReward().equals(other.getBidProReward()))
	            && (this.getFixedAppReward() == null ? other.getFixedAppReward() == null : this.getFixedAppReward().equals(other.getFixedAppReward()))
	            && (this.getIsBidMarked() == null ? other.getIsBidMarked() == null : this.getIsBidMarked().equals(other.getIsBidMarked()))
	            && (this.getReadyRecMoney() == null ? other.getReadyRecMoney() == null : this.getReadyRecMoney().equals(other.getReadyRecMoney()))
	            && (this.getIsBidPwd() == null ? other.getIsBidPwd() == null : this.getIsBidPwd().equals(other.getIsBidPwd()))
	            && (this.getBidPwd() == null ? other.getBidPwd() == null : this.getBidPwd().equals(other.getBidPwd()))
	            && (this.getLoanManagementFees() == null ? other.getLoanManagementFees() == null : this.getLoanManagementFees().equals(other.getLoanManagementFees()))
	            && (this.getRepaymentTypeId() == null ? other.getRepaymentTypeId() == null : this.getRepaymentTypeId().equals(other.getRepaymentTypeId()))
	            && (this.getLoanTotal() == null ? other.getLoanTotal() == null : this.getLoanTotal().equals(other.getLoanTotal()))
	            && (this.getLoanApr() == null ? other.getLoanApr() == null : this.getLoanApr().equals(other.getLoanApr()))
	            && (this.getLowestBidMoney() == null ? other.getLowestBidMoney() == null : this.getLowestBidMoney().equals(other.getLowestBidMoney()))
	            && (this.getLargestBidMoney() == null ? other.getLargestBidMoney() == null : this.getLargestBidMoney().equals(other.getLargestBidMoney()))
	            && (this.getLowestSub() == null ? other.getLowestSub() == null : this.getLowestSub().equals(other.getLowestSub()))
	            && (this.getSubTotal() == null ? other.getSubTotal() == null : this.getSubTotal().equals(other.getSubTotal()))
	            && (this.getAlrSubSum() == null ? other.getAlrSubSum() == null : this.getAlrSubSum().equals(other.getAlrSubSum()))
	            && (this.getAlrTenderPro() == null ? other.getAlrTenderPro() == null : this.getAlrTenderPro().equals(other.getAlrTenderPro()))
	            && (this.getTenderSum() == null ? other.getTenderSum() == null : this.getTenderSum().equals(other.getTenderSum()))
	            && (this.getWaitBidDeadlines() == null ? other.getWaitBidDeadlines() == null : this.getWaitBidDeadlines().equals(other.getWaitBidDeadlines()))
	            && (this.getLoanDetail() == null ? other.getLoanDetail() == null : this.getLoanDetail().equals(other.getLoanDetail()))
	            && (this.getIsAccountFunds() == null ? other.getIsAccountFunds() == null : this.getIsAccountFunds().equals(other.getIsAccountFunds()))
	            && (this.getIsLoanFunds() == null ? other.getIsLoanFunds() == null : this.getIsLoanFunds().equals(other.getIsLoanFunds()))
	            && (this.getIsCreditAmount() == null ? other.getIsCreditAmount() == null : this.getIsCreditAmount().equals(other.getIsCreditAmount()))
	            && (this.getIsBidFunds() == null ? other.getIsBidFunds() == null : this.getIsBidFunds().equals(other.getIsBidFunds()))
	            && (this.getIsAutomaticBid() == null ? other.getIsAutomaticBid() == null : this.getIsAutomaticBid().equals(other.getIsAutomaticBid()))
	            && (this.getIsRecommend() == null ? other.getIsRecommend() == null : this.getIsRecommend().equals(other.getIsRecommend()))
	            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
	            && (this.getLoanDate() == null ? other.getLoanDate() == null : this.getLoanDate().equals(other.getLoanDate()))
	            && (this.getMemberIp() == null ? other.getMemberIp() == null : this.getMemberIp().equals(other.getMemberIp()))
	            && (this.getLoanState() == null ? other.getLoanState() == null : this.getLoanState().equals(other.getLoanState()))
	            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
	            && (this.getFirstAuditState() == null ? other.getFirstAuditState() == null : this.getFirstAuditState().equals(other.getFirstAuditState()))
	            && (this.getFirstAuditorId() == null ? other.getFirstAuditorId() == null : this.getFirstAuditorId().equals(other.getFirstAuditorId()))
	            && (this.getFirstAdvice() == null ? other.getFirstAdvice() == null : this.getFirstAdvice().equals(other.getFirstAdvice()))
	            && (this.getFirstMesNotice() == null ? other.getFirstMesNotice() == null : this.getFirstMesNotice().equals(other.getFirstMesNotice()))
	            && (this.getFirstAuditDate() == null ? other.getFirstAuditDate() == null : this.getFirstAuditDate().equals(other.getFirstAuditDate()))
	            && (this.getSecondAuditState() == null ? other.getSecondAuditState() == null : this.getSecondAuditState().equals(other.getSecondAuditState()))
	            && (this.getSecondAuditorId() == null ? other.getSecondAuditorId() == null : this.getSecondAuditorId().equals(other.getSecondAuditorId()))
	            && (this.getSecondAdvice() == null ? other.getSecondAdvice() == null : this.getSecondAdvice().equals(other.getSecondAdvice()))
	            && (this.getSecondMesNotice() == null ? other.getSecondMesNotice() == null : this.getSecondMesNotice().equals(other.getSecondMesNotice()))
	            && (this.getSecondAuditDate() == null ? other.getSecondAuditDate() == null : this.getSecondAuditDate().equals(other.getSecondAuditDate()))
	            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
	            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
	            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
	            && (this.getAlrBidMoney() == null ? other.getAlrBidMoney() == null : this.getAlrBidMoney().equals(other.getAlrBidMoney()));
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((getLoanId() == null) ? 0 : getLoanId().hashCode());
	        result = prime * result + ((getLoanCode() == null) ? 0 : getLoanCode().hashCode());
	        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
	        result = prime * result + ((getLoanTitle() == null) ? 0 : getLoanTitle().hashCode());
	        result = prime * result + ((getLoanPicture() == null) ? 0 : getLoanPicture().hashCode());
	        result = prime * result + ((getLoanTenderId() == null) ? 0 : getLoanTenderId().hashCode());
	        result = prime * result + ((getLoanPurposeId() == null) ? 0 : getLoanPurposeId().hashCode());
	        result = prime * result + ((getLoanDeadlinesId() == null) ? 0 : getLoanDeadlinesId().hashCode());
	        result = prime * result + ((getFailedReason() == null) ? 0 : getFailedReason().hashCode());
	        result = prime * result + ((getIsDayMarked() == null) ? 0 : getIsDayMarked().hashCode());
	        result = prime * result + ((getIsBidReward() == null) ? 0 : getIsBidReward().hashCode());
	        result = prime * result + ((getBidProReward() == null) ? 0 : getBidProReward().hashCode());
	        result = prime * result + ((getFixedAppReward() == null) ? 0 : getFixedAppReward().hashCode());
	        result = prime * result + ((getIsBidMarked() == null) ? 0 : getIsBidMarked().hashCode());
	        result = prime * result + ((getReadyRecMoney() == null) ? 0 : getReadyRecMoney().hashCode());
	        result = prime * result + ((getIsBidPwd() == null) ? 0 : getIsBidPwd().hashCode());
	        result = prime * result + ((getBidPwd() == null) ? 0 : getBidPwd().hashCode());
	        result = prime * result + ((getLoanManagementFees() == null) ? 0 : getLoanManagementFees().hashCode());
	        result = prime * result + ((getRepaymentTypeId() == null) ? 0 : getRepaymentTypeId().hashCode());
	        result = prime * result + ((getLoanTotal() == null) ? 0 : getLoanTotal().hashCode());
	        result = prime * result + ((getLoanApr() == null) ? 0 : getLoanApr().hashCode());
	        result = prime * result + ((getLowestBidMoney() == null) ? 0 : getLowestBidMoney().hashCode());
	        result = prime * result + ((getLargestBidMoney() == null) ? 0 : getLargestBidMoney().hashCode());
	        result = prime * result + ((getLowestSub() == null) ? 0 : getLowestSub().hashCode());
	        result = prime * result + ((getSubTotal() == null) ? 0 : getSubTotal().hashCode());
	        result = prime * result + ((getAlrSubSum() == null) ? 0 : getAlrSubSum().hashCode());
	        result = prime * result + ((getAlrTenderPro() == null) ? 0 : getAlrTenderPro().hashCode());
	        result = prime * result + ((getTenderSum() == null) ? 0 : getTenderSum().hashCode());
	        result = prime * result + ((getWaitBidDeadlines() == null) ? 0 : getWaitBidDeadlines().hashCode());
	        result = prime * result + ((getLoanDetail() == null) ? 0 : getLoanDetail().hashCode());
	        result = prime * result + ((getIsAccountFunds() == null) ? 0 : getIsAccountFunds().hashCode());
	        result = prime * result + ((getIsLoanFunds() == null) ? 0 : getIsLoanFunds().hashCode());
	        result = prime * result + ((getIsCreditAmount() == null) ? 0 : getIsCreditAmount().hashCode());
	        result = prime * result + ((getIsBidFunds() == null) ? 0 : getIsBidFunds().hashCode());
	        result = prime * result + ((getIsAutomaticBid() == null) ? 0 : getIsAutomaticBid().hashCode());
	        result = prime * result + ((getIsRecommend() == null) ? 0 : getIsRecommend().hashCode());
	        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
	        result = prime * result + ((getLoanDate() == null) ? 0 : getLoanDate().hashCode());
	        result = prime * result + ((getMemberIp() == null) ? 0 : getMemberIp().hashCode());
	        result = prime * result + ((getLoanState() == null) ? 0 : getLoanState().hashCode());
	        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
	        result = prime * result + ((getFirstAuditState() == null) ? 0 : getFirstAuditState().hashCode());
	        result = prime * result + ((getFirstAuditorId() == null) ? 0 : getFirstAuditorId().hashCode());
	        result = prime * result + ((getFirstAdvice() == null) ? 0 : getFirstAdvice().hashCode());
	        result = prime * result + ((getFirstMesNotice() == null) ? 0 : getFirstMesNotice().hashCode());
	        result = prime * result + ((getFirstAuditDate() == null) ? 0 : getFirstAuditDate().hashCode());
	        result = prime * result + ((getSecondAuditState() == null) ? 0 : getSecondAuditState().hashCode());
	        result = prime * result + ((getSecondAuditorId() == null) ? 0 : getSecondAuditorId().hashCode());
	        result = prime * result + ((getSecondAdvice() == null) ? 0 : getSecondAdvice().hashCode());
	        result = prime * result + ((getSecondMesNotice() == null) ? 0 : getSecondMesNotice().hashCode());
	        result = prime * result + ((getSecondAuditDate() == null) ? 0 : getSecondAuditDate().hashCode());
	        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
	        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
	        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
	        result = prime * result + ((getAlrBidMoney() == null) ? 0 : getAlrBidMoney().hashCode());
	        return result;
	    }
}