package com.glacier.netloan.entity.borrow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepaymentNotesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RepaymentNotesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRepayNotesIdIsNull() {
            addCriterion("temp_repayment_notes.repay_notes_id is null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdIsNotNull() {
            addCriterion("temp_repayment_notes.repay_notes_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdEqualTo(String value) {
            addCriterion("temp_repayment_notes.repay_notes_id =", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdNotEqualTo(String value) {
            addCriterion("temp_repayment_notes.repay_notes_id <>", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdGreaterThan(String value) {
            addCriterion("temp_repayment_notes.repay_notes_id >", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.repay_notes_id >=", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdLessThan(String value) {
            addCriterion("temp_repayment_notes.repay_notes_id <", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.repay_notes_id <=", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdLike(String value) {
            addCriterion("temp_repayment_notes.repay_notes_id like", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdNotLike(String value) {
            addCriterion("temp_repayment_notes.repay_notes_id not like", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdIn(List<String> values) {
            addCriterion("temp_repayment_notes.repay_notes_id in", values, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdNotIn(List<String> values) {
            addCriterion("temp_repayment_notes.repay_notes_id not in", values, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.repay_notes_id between", value1, value2, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.repay_notes_id not between", value1, value2, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNull() {
            addCriterion("temp_repayment_notes.loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("temp_repayment_notes.loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(String value) {
            addCriterion("temp_repayment_notes.loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(String value) {
            addCriterion("temp_repayment_notes.loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(String value) {
            addCriterion("temp_repayment_notes.loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(String value) {
            addCriterion("temp_repayment_notes.loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLike(String value) {
            addCriterion("temp_repayment_notes.loan_id like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotLike(String value) {
            addCriterion("temp_repayment_notes.loan_id not like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<String> values) {
            addCriterion("temp_repayment_notes.loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<String> values) {
            addCriterion("temp_repayment_notes.loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_repayment_notes.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_repayment_notes.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_repayment_notes.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_repayment_notes.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_repayment_notes.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_repayment_notes.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_repayment_notes.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_repayment_notes.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_repayment_notes.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_repayment_notes.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalIsNull() {
            addCriterion("temp_repayment_notes.repayment_total is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalIsNotNull() {
            addCriterion("temp_repayment_notes.repayment_total is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalEqualTo(Float value) {
            addCriterion("temp_repayment_notes.repayment_total =", value, "repaymentTotal");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes.repayment_total <>", value, "repaymentTotal");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalGreaterThan(Float value) {
            addCriterion("temp_repayment_notes.repayment_total >", value, "repaymentTotal");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.repayment_total >=", value, "repaymentTotal");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalLessThan(Float value) {
            addCriterion("temp_repayment_notes.repayment_total <", value, "repaymentTotal");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.repayment_total <=", value, "repaymentTotal");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalIn(List<Float> values) {
            addCriterion("temp_repayment_notes.repayment_total in", values, "repaymentTotal");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes.repayment_total not in", values, "repaymentTotal");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.repayment_total between", value1, value2, "repaymentTotal");
            return (Criteria) this;
        }

        public Criteria andRepaymentTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.repayment_total not between", value1, value2, "repaymentTotal");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyIsNull() {
            addCriterion("temp_repayment_notes.should_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyIsNotNull() {
            addCriterion("temp_repayment_notes.should_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyEqualTo(Float value) {
            addCriterion("temp_repayment_notes.should_pay_money =", value, "shouldPayMoney");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes.should_pay_money <>", value, "shouldPayMoney");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyGreaterThan(Float value) {
            addCriterion("temp_repayment_notes.should_pay_money >", value, "shouldPayMoney");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.should_pay_money >=", value, "shouldPayMoney");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyLessThan(Float value) {
            addCriterion("temp_repayment_notes.should_pay_money <", value, "shouldPayMoney");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.should_pay_money <=", value, "shouldPayMoney");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyIn(List<Float> values) {
            addCriterion("temp_repayment_notes.should_pay_money in", values, "shouldPayMoney");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes.should_pay_money not in", values, "shouldPayMoney");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.should_pay_money between", value1, value2, "shouldPayMoney");
            return (Criteria) this;
        }

        public Criteria andShouldPayMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.should_pay_money not between", value1, value2, "shouldPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyIsNull() {
            addCriterion("temp_repayment_notes.alr_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyIsNotNull() {
            addCriterion("temp_repayment_notes.alr_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_pay_money =", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_pay_money <>", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyGreaterThan(Float value) {
            addCriterion("temp_repayment_notes.alr_pay_money >", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_pay_money >=", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyLessThan(Float value) {
            addCriterion("temp_repayment_notes.alr_pay_money <", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_pay_money <=", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyIn(List<Float> values) {
            addCriterion("temp_repayment_notes.alr_pay_money in", values, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes.alr_pay_money not in", values, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.alr_pay_money between", value1, value2, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.alr_pay_money not between", value1, value2, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyIsNull() {
            addCriterion("temp_repayment_notes.not_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyIsNotNull() {
            addCriterion("temp_repayment_notes.not_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyEqualTo(Float value) {
            addCriterion("temp_repayment_notes.not_pay_money =", value, "notPayMoney");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes.not_pay_money <>", value, "notPayMoney");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyGreaterThan(Float value) {
            addCriterion("temp_repayment_notes.not_pay_money >", value, "notPayMoney");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.not_pay_money >=", value, "notPayMoney");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyLessThan(Float value) {
            addCriterion("temp_repayment_notes.not_pay_money <", value, "notPayMoney");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.not_pay_money <=", value, "notPayMoney");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyIn(List<Float> values) {
            addCriterion("temp_repayment_notes.not_pay_money in", values, "notPayMoney");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes.not_pay_money not in", values, "notPayMoney");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.not_pay_money between", value1, value2, "notPayMoney");
            return (Criteria) this;
        }

        public Criteria andNotPayMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.not_pay_money not between", value1, value2, "notPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestIsNull() {
            addCriterion("temp_repayment_notes.alr_overdue_interest is null");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestIsNotNull() {
            addCriterion("temp_repayment_notes.alr_overdue_interest is not null");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_interest =", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_interest <>", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestGreaterThan(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_interest >", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_interest >=", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestLessThan(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_interest <", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_interest <=", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestIn(List<Float> values) {
            addCriterion("temp_repayment_notes.alr_overdue_interest in", values, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes.alr_overdue_interest not in", values, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.alr_overdue_interest between", value1, value2, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.alr_overdue_interest not between", value1, value2, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeIsNull() {
            addCriterion("temp_repayment_notes.alr_overdue_urge is null");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeIsNotNull() {
            addCriterion("temp_repayment_notes.alr_overdue_urge is not null");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_urge =", value, "alrOverdueUrge");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_urge <>", value, "alrOverdueUrge");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeGreaterThan(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_urge >", value, "alrOverdueUrge");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_urge >=", value, "alrOverdueUrge");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeLessThan(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_urge <", value, "alrOverdueUrge");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_urge <=", value, "alrOverdueUrge");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeIn(List<Float> values) {
            addCriterion("temp_repayment_notes.alr_overdue_urge in", values, "alrOverdueUrge");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes.alr_overdue_urge not in", values, "alrOverdueUrge");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.alr_overdue_urge between", value1, value2, "alrOverdueUrge");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueUrgeNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.alr_overdue_urge not between", value1, value2, "alrOverdueUrge");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaIsNull() {
            addCriterion("temp_repayment_notes.alr_overdue_mana is null");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaIsNotNull() {
            addCriterion("temp_repayment_notes.alr_overdue_mana is not null");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_mana =", value, "alrOverdueMana");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_mana <>", value, "alrOverdueMana");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaGreaterThan(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_mana >", value, "alrOverdueMana");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_mana >=", value, "alrOverdueMana");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaLessThan(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_mana <", value, "alrOverdueMana");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes.alr_overdue_mana <=", value, "alrOverdueMana");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaIn(List<Float> values) {
            addCriterion("temp_repayment_notes.alr_overdue_mana in", values, "alrOverdueMana");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes.alr_overdue_mana not in", values, "alrOverdueMana");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.alr_overdue_mana between", value1, value2, "alrOverdueMana");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueManaNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes.alr_overdue_mana not between", value1, value2, "alrOverdueMana");
            return (Criteria) this;
        }

        public Criteria andRepayStateIsNull() {
            addCriterion("temp_repayment_notes.repay_state is null");
            return (Criteria) this;
        }

        public Criteria andRepayStateIsNotNull() {
            addCriterion("temp_repayment_notes.repay_state is not null");
            return (Criteria) this;
        }

        public Criteria andRepayStateEqualTo(String value) {
            addCriterion("temp_repayment_notes.repay_state =", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotEqualTo(String value) {
            addCriterion("temp_repayment_notes.repay_state <>", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateGreaterThan(String value) {
            addCriterion("temp_repayment_notes.repay_state >", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.repay_state >=", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateLessThan(String value) {
            addCriterion("temp_repayment_notes.repay_state <", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.repay_state <=", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateLike(String value) {
            addCriterion("temp_repayment_notes.repay_state like", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotLike(String value) {
            addCriterion("temp_repayment_notes.repay_state not like", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateIn(List<String> values) {
            addCriterion("temp_repayment_notes.repay_state in", values, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotIn(List<String> values) {
            addCriterion("temp_repayment_notes.repay_state not in", values, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.repay_state between", value1, value2, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.repay_state not between", value1, value2, "repayState");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_repayment_notes.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_repayment_notes.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_repayment_notes.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_repayment_notes.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_repayment_notes.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_repayment_notes.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_repayment_notes.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_repayment_notes.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_repayment_notes.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_repayment_notes.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_repayment_notes.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_repayment_notes.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_repayment_notes.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_repayment_notes.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_repayment_notes.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_repayment_notes.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_repayment_notes.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_repayment_notes.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_repayment_notes.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_repayment_notes.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_repayment_notes.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_repayment_notes.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_repayment_notes.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_repayment_notes.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_repayment_notes.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_repayment_notes.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_repayment_notes.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_repayment_notes.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_repayment_notes.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_repayment_notes.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_repayment_notes.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_repayment_notes.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_repayment_notes.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_repayment_notes.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_repayment_notes.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_repayment_notes.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_repayment_notes.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_repayment_notes.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_repayment_notes.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_repayment_notes.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_repayment_notes.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_repayment_notes.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_repayment_notes.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_repayment_notes.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_repayment_notes.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_repayment_notes.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}