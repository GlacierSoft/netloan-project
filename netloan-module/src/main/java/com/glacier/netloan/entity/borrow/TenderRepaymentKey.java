package com.glacier.netloan.entity.borrow;

public class TenderRepaymentKey {
    private String repaymentTypeId;

    private String loanTenderId;

    public String getRepaymentTypeId() {
        return repaymentTypeId;
    }

    public void setRepaymentTypeId(String repaymentTypeId) {
        this.repaymentTypeId = repaymentTypeId;
    }

    public String getLoanTenderId() {
        return loanTenderId;
    }

    public void setLoanTenderId(String loanTenderId) {
        this.loanTenderId = loanTenderId;
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
        TenderRepaymentKey other = (TenderRepaymentKey) that;
        return (this.getRepaymentTypeId() == null ? other.getRepaymentTypeId() == null : this.getRepaymentTypeId().equals(other.getRepaymentTypeId()))
            && (this.getLoanTenderId() == null ? other.getLoanTenderId() == null : this.getLoanTenderId().equals(other.getLoanTenderId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRepaymentTypeId() == null) ? 0 : getRepaymentTypeId().hashCode());
        result = prime * result + ((getLoanTenderId() == null) ? 0 : getLoanTenderId().hashCode());
        return result;
    }
}