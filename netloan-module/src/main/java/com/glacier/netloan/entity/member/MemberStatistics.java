package com.glacier.netloan.entity.member;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class MemberStatistics {
    private String statisticsId;

    private String memberId;
	
	/**
     * 自定义字段，显示会员真实名字
     */
    private String memberRealName;

    private Float totalBorrowings;

    private Float cumulativeLossProfit;

    private Float alreadyTotal;

    private Float waitAlsoTotal;

    private Float alreadyIncomeTotal;

    private Float waitIncomeTotal;

    private Float alreadyPrincipal;

    private Float waitAlsoPrincipal;

    private Float alreadyInterest;

    private Float waitAlsoInterest;

    private Float alreadyIncomePrincipal;

    private Float waitIncomePrincipal;

    private Float alreadyIncomeInterest;

    private Float waitIncomeInterest;

    private Float overdueFineAmount;

    private Float overdueInterestAmount;

    private Float loanManagementAmount;

    private Float loanInterestAmount;

    private Integer normalRepayment;

    private Integer advanceRepayment;

    private Integer lateRepayment;

    private Integer late;

    private Integer websiteSubstitute;

    private Float investmentTotal;

    private Float tenderAwards;

    private Float promotionAwards;

    private Integer borrowSuccess;

    private Float uplineDeltaAwards;

    private Float continueAwards;

    private String creater;

	@JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date createTime;

    private String updater;

	@JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date updateTime;

    public String getStatisticsId() {
        return statisticsId;
    }

    public void setStatisticsId(String statisticsId) {
        this.statisticsId = statisticsId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberRealName() {
        return memberRealName;
    }

    public void setMemberRealName(String memberRealName) {
        this.memberRealName = memberRealName;
    }

    public Float getTotalBorrowings() {
        return totalBorrowings;
    }

    public void setTotalBorrowings(Float totalBorrowings) {
        this.totalBorrowings = totalBorrowings;
    }

    public Float getCumulativeLossProfit() {
        return cumulativeLossProfit;
    }

    public void setCumulativeLossProfit(Float cumulativeLossProfit) {
        this.cumulativeLossProfit = cumulativeLossProfit;
    }

    public Float getAlreadyTotal() {
        return alreadyTotal;
    }

    public void setAlreadyTotal(Float alreadyTotal) {
        this.alreadyTotal = alreadyTotal;
    }

    public Float getWaitAlsoTotal() {
        return waitAlsoTotal;
    }

    public void setWaitAlsoTotal(Float waitAlsoTotal) {
        this.waitAlsoTotal = waitAlsoTotal;
    }

    public Float getAlreadyIncomeTotal() {
        return alreadyIncomeTotal;
    }

    public void setAlreadyIncomeTotal(Float alreadyIncomeTotal) {
        this.alreadyIncomeTotal = alreadyIncomeTotal;
    }

    public Float getWaitIncomeTotal() {
        return waitIncomeTotal;
    }

    public void setWaitIncomeTotal(Float waitIncomeTotal) {
        this.waitIncomeTotal = waitIncomeTotal;
    }

    public Float getAlreadyPrincipal() {
        return alreadyPrincipal;
    }

    public void setAlreadyPrincipal(Float alreadyPrincipal) {
        this.alreadyPrincipal = alreadyPrincipal;
    }

    public Float getWaitAlsoPrincipal() {
        return waitAlsoPrincipal;
    }

    public void setWaitAlsoPrincipal(Float waitAlsoPrincipal) {
        this.waitAlsoPrincipal = waitAlsoPrincipal;
    }

    public Float getAlreadyInterest() {
        return alreadyInterest;
    }

    public void setAlreadyInterest(Float alreadyInterest) {
        this.alreadyInterest = alreadyInterest;
    }

    public Float getWaitAlsoInterest() {
        return waitAlsoInterest;
    }

    public void setWaitAlsoInterest(Float waitAlsoInterest) {
        this.waitAlsoInterest = waitAlsoInterest;
    }

    public Float getAlreadyIncomePrincipal() {
        return alreadyIncomePrincipal;
    }

    public void setAlreadyIncomePrincipal(Float alreadyIncomePrincipal) {
        this.alreadyIncomePrincipal = alreadyIncomePrincipal;
    }

    public Float getWaitIncomePrincipal() {
        return waitIncomePrincipal;
    }

    public void setWaitIncomePrincipal(Float waitIncomePrincipal) {
        this.waitIncomePrincipal = waitIncomePrincipal;
    }

    public Float getAlreadyIncomeInterest() {
        return alreadyIncomeInterest;
    }

    public void setAlreadyIncomeInterest(Float alreadyIncomeInterest) {
        this.alreadyIncomeInterest = alreadyIncomeInterest;
    }

    public Float getWaitIncomeInterest() {
        return waitIncomeInterest;
    }

    public void setWaitIncomeInterest(Float waitIncomeInterest) {
        this.waitIncomeInterest = waitIncomeInterest;
    }

    public Float getOverdueFineAmount() {
        return overdueFineAmount;
    }

    public void setOverdueFineAmount(Float overdueFineAmount) {
        this.overdueFineAmount = overdueFineAmount;
    }

    public Float getOverdueInterestAmount() {
        return overdueInterestAmount;
    }

    public void setOverdueInterestAmount(Float overdueInterestAmount) {
        this.overdueInterestAmount = overdueInterestAmount;
    }

    public Float getLoanManagementAmount() {
        return loanManagementAmount;
    }

    public void setLoanManagementAmount(Float loanManagementAmount) {
        this.loanManagementAmount = loanManagementAmount;
    }

    public Float getLoanInterestAmount() {
        return loanInterestAmount;
    }

    public void setLoanInterestAmount(Float loanInterestAmount) {
        this.loanInterestAmount = loanInterestAmount;
    }

    public Integer getNormalRepayment() {
        return normalRepayment;
    }

    public void setNormalRepayment(Integer normalRepayment) {
        this.normalRepayment = normalRepayment;
    }

    public Integer getAdvanceRepayment() {
        return advanceRepayment;
    }

    public void setAdvanceRepayment(Integer advanceRepayment) {
        this.advanceRepayment = advanceRepayment;
    }

    public Integer getLateRepayment() {
        return lateRepayment;
    }

    public void setLateRepayment(Integer lateRepayment) {
        this.lateRepayment = lateRepayment;
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getWebsiteSubstitute() {
        return websiteSubstitute;
    }

    public void setWebsiteSubstitute(Integer websiteSubstitute) {
        this.websiteSubstitute = websiteSubstitute;
    }

    public Float getInvestmentTotal() {
        return investmentTotal;
    }

    public void setInvestmentTotal(Float investmentTotal) {
        this.investmentTotal = investmentTotal;
    }

    public Float getTenderAwards() {
        return tenderAwards;
    }

    public void setTenderAwards(Float tenderAwards) {
        this.tenderAwards = tenderAwards;
    }

    public Float getPromotionAwards() {
        return promotionAwards;
    }

    public void setPromotionAwards(Float promotionAwards) {
        this.promotionAwards = promotionAwards;
    }

    public Integer getBorrowSuccess() {
        return borrowSuccess;
    }

    public void setBorrowSuccess(Integer borrowSuccess) {
        this.borrowSuccess = borrowSuccess;
    }

    public Float getUplineDeltaAwards() {
        return uplineDeltaAwards;
    }

    public void setUplineDeltaAwards(Float uplineDeltaAwards) {
        this.uplineDeltaAwards = uplineDeltaAwards;
    }

    public Float getContinueAwards() {
        return continueAwards;
    }

    public void setContinueAwards(Float continueAwards) {
        this.continueAwards = continueAwards;
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
        MemberStatistics other = (MemberStatistics) that;
        return (this.getStatisticsId() == null ? other.getStatisticsId() == null : this.getStatisticsId().equals(other.getStatisticsId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getTotalBorrowings() == null ? other.getTotalBorrowings() == null : this.getTotalBorrowings().equals(other.getTotalBorrowings()))
            && (this.getCumulativeLossProfit() == null ? other.getCumulativeLossProfit() == null : this.getCumulativeLossProfit().equals(other.getCumulativeLossProfit()))
            && (this.getAlreadyTotal() == null ? other.getAlreadyTotal() == null : this.getAlreadyTotal().equals(other.getAlreadyTotal()))
            && (this.getWaitAlsoTotal() == null ? other.getWaitAlsoTotal() == null : this.getWaitAlsoTotal().equals(other.getWaitAlsoTotal()))
            && (this.getAlreadyIncomeTotal() == null ? other.getAlreadyIncomeTotal() == null : this.getAlreadyIncomeTotal().equals(other.getAlreadyIncomeTotal()))
            && (this.getWaitIncomeTotal() == null ? other.getWaitIncomeTotal() == null : this.getWaitIncomeTotal().equals(other.getWaitIncomeTotal()))
            && (this.getAlreadyPrincipal() == null ? other.getAlreadyPrincipal() == null : this.getAlreadyPrincipal().equals(other.getAlreadyPrincipal()))
            && (this.getWaitAlsoPrincipal() == null ? other.getWaitAlsoPrincipal() == null : this.getWaitAlsoPrincipal().equals(other.getWaitAlsoPrincipal()))
            && (this.getAlreadyInterest() == null ? other.getAlreadyInterest() == null : this.getAlreadyInterest().equals(other.getAlreadyInterest()))
            && (this.getWaitAlsoInterest() == null ? other.getWaitAlsoInterest() == null : this.getWaitAlsoInterest().equals(other.getWaitAlsoInterest()))
            && (this.getAlreadyIncomePrincipal() == null ? other.getAlreadyIncomePrincipal() == null : this.getAlreadyIncomePrincipal().equals(other.getAlreadyIncomePrincipal()))
            && (this.getWaitIncomePrincipal() == null ? other.getWaitIncomePrincipal() == null : this.getWaitIncomePrincipal().equals(other.getWaitIncomePrincipal()))
            && (this.getAlreadyIncomeInterest() == null ? other.getAlreadyIncomeInterest() == null : this.getAlreadyIncomeInterest().equals(other.getAlreadyIncomeInterest()))
            && (this.getWaitIncomeInterest() == null ? other.getWaitIncomeInterest() == null : this.getWaitIncomeInterest().equals(other.getWaitIncomeInterest()))
            && (this.getOverdueFineAmount() == null ? other.getOverdueFineAmount() == null : this.getOverdueFineAmount().equals(other.getOverdueFineAmount()))
            && (this.getOverdueInterestAmount() == null ? other.getOverdueInterestAmount() == null : this.getOverdueInterestAmount().equals(other.getOverdueInterestAmount()))
            && (this.getLoanManagementAmount() == null ? other.getLoanManagementAmount() == null : this.getLoanManagementAmount().equals(other.getLoanManagementAmount()))
            && (this.getLoanInterestAmount() == null ? other.getLoanInterestAmount() == null : this.getLoanInterestAmount().equals(other.getLoanInterestAmount()))
            && (this.getNormalRepayment() == null ? other.getNormalRepayment() == null : this.getNormalRepayment().equals(other.getNormalRepayment()))
            && (this.getAdvanceRepayment() == null ? other.getAdvanceRepayment() == null : this.getAdvanceRepayment().equals(other.getAdvanceRepayment()))
            && (this.getLateRepayment() == null ? other.getLateRepayment() == null : this.getLateRepayment().equals(other.getLateRepayment()))
            && (this.getLate() == null ? other.getLate() == null : this.getLate().equals(other.getLate()))
            && (this.getWebsiteSubstitute() == null ? other.getWebsiteSubstitute() == null : this.getWebsiteSubstitute().equals(other.getWebsiteSubstitute()))
            && (this.getInvestmentTotal() == null ? other.getInvestmentTotal() == null : this.getInvestmentTotal().equals(other.getInvestmentTotal()))
            && (this.getTenderAwards() == null ? other.getTenderAwards() == null : this.getTenderAwards().equals(other.getTenderAwards()))
            && (this.getPromotionAwards() == null ? other.getPromotionAwards() == null : this.getPromotionAwards().equals(other.getPromotionAwards()))
            && (this.getBorrowSuccess() == null ? other.getBorrowSuccess() == null : this.getBorrowSuccess().equals(other.getBorrowSuccess()))
            && (this.getUplineDeltaAwards() == null ? other.getUplineDeltaAwards() == null : this.getUplineDeltaAwards().equals(other.getUplineDeltaAwards()))
            && (this.getContinueAwards() == null ? other.getContinueAwards() == null : this.getContinueAwards().equals(other.getContinueAwards()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStatisticsId() == null) ? 0 : getStatisticsId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getTotalBorrowings() == null) ? 0 : getTotalBorrowings().hashCode());
        result = prime * result + ((getCumulativeLossProfit() == null) ? 0 : getCumulativeLossProfit().hashCode());
        result = prime * result + ((getAlreadyTotal() == null) ? 0 : getAlreadyTotal().hashCode());
        result = prime * result + ((getWaitAlsoTotal() == null) ? 0 : getWaitAlsoTotal().hashCode());
        result = prime * result + ((getAlreadyIncomeTotal() == null) ? 0 : getAlreadyIncomeTotal().hashCode());
        result = prime * result + ((getWaitIncomeTotal() == null) ? 0 : getWaitIncomeTotal().hashCode());
        result = prime * result + ((getAlreadyPrincipal() == null) ? 0 : getAlreadyPrincipal().hashCode());
        result = prime * result + ((getWaitAlsoPrincipal() == null) ? 0 : getWaitAlsoPrincipal().hashCode());
        result = prime * result + ((getAlreadyInterest() == null) ? 0 : getAlreadyInterest().hashCode());
        result = prime * result + ((getWaitAlsoInterest() == null) ? 0 : getWaitAlsoInterest().hashCode());
        result = prime * result + ((getAlreadyIncomePrincipal() == null) ? 0 : getAlreadyIncomePrincipal().hashCode());
        result = prime * result + ((getWaitIncomePrincipal() == null) ? 0 : getWaitIncomePrincipal().hashCode());
        result = prime * result + ((getAlreadyIncomeInterest() == null) ? 0 : getAlreadyIncomeInterest().hashCode());
        result = prime * result + ((getWaitIncomeInterest() == null) ? 0 : getWaitIncomeInterest().hashCode());
        result = prime * result + ((getOverdueFineAmount() == null) ? 0 : getOverdueFineAmount().hashCode());
        result = prime * result + ((getOverdueInterestAmount() == null) ? 0 : getOverdueInterestAmount().hashCode());
        result = prime * result + ((getLoanManagementAmount() == null) ? 0 : getLoanManagementAmount().hashCode());
        result = prime * result + ((getLoanInterestAmount() == null) ? 0 : getLoanInterestAmount().hashCode());
        result = prime * result + ((getNormalRepayment() == null) ? 0 : getNormalRepayment().hashCode());
        result = prime * result + ((getAdvanceRepayment() == null) ? 0 : getAdvanceRepayment().hashCode());
        result = prime * result + ((getLateRepayment() == null) ? 0 : getLateRepayment().hashCode());
        result = prime * result + ((getLate() == null) ? 0 : getLate().hashCode());
        result = prime * result + ((getWebsiteSubstitute() == null) ? 0 : getWebsiteSubstitute().hashCode());
        result = prime * result + ((getInvestmentTotal() == null) ? 0 : getInvestmentTotal().hashCode());
        result = prime * result + ((getTenderAwards() == null) ? 0 : getTenderAwards().hashCode());
        result = prime * result + ((getPromotionAwards() == null) ? 0 : getPromotionAwards().hashCode());
        result = prime * result + ((getBorrowSuccess() == null) ? 0 : getBorrowSuccess().hashCode());
        result = prime * result + ((getUplineDeltaAwards() == null) ? 0 : getUplineDeltaAwards().hashCode());
        result = prime * result + ((getContinueAwards() == null) ? 0 : getContinueAwards().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}