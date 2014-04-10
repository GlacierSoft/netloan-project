package com.glacier.netloan.entity.borrow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepaymentNotesDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RepaymentNotesDetailExample() {
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

        public Criteria andRepayNotesDetailIdIsNull() {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdIsNotNull() {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id =", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id <>", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdGreaterThan(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id >", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id >=", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLessThan(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id <", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id <=", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLike(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id like", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotLike(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id not like", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id in", values, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id not in", values, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id between", value1, value2, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.repay_notes_detail_id not between", value1, value2, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdIsNull() {
            addCriterion("temp_repayment_notes_detail.repay_notes_id is null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdIsNotNull() {
            addCriterion("temp_repayment_notes_detail.repay_notes_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id =", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdNotEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id <>", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdGreaterThan(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id >", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id >=", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdLessThan(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id <", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id <=", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdLike(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id like", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdNotLike(String value) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id not like", value, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id in", values, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdNotIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id not in", values, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id between", value1, value2, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesIdNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.repay_notes_id not between", value1, value2, "repayNotesId");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodIsNull() {
            addCriterion("temp_repayment_notes_detail.number_period is null");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodIsNotNull() {
            addCriterion("temp_repayment_notes_detail.number_period is not null");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.number_period =", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.number_period <>", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodGreaterThan(Float value) {
            addCriterion("temp_repayment_notes_detail.number_period >", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.number_period >=", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodLessThan(Float value) {
            addCriterion("temp_repayment_notes_detail.number_period <", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.number_period <=", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.number_period in", values, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.number_period not in", values, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.number_period between", value1, value2, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.number_period not between", value1, value2, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateIsNull() {
            addCriterion("temp_repayment_notes_detail.should_pay_date is null");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateIsNotNull() {
            addCriterion("temp_repayment_notes_detail.should_pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.should_pay_date =", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateNotEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.should_pay_date <>", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateGreaterThan(Date value) {
            addCriterion("temp_repayment_notes_detail.should_pay_date >", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.should_pay_date >=", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateLessThan(Date value) {
            addCriterion("temp_repayment_notes_detail.should_pay_date <", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.should_pay_date <=", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateIn(List<Date> values) {
            addCriterion("temp_repayment_notes_detail.should_pay_date in", values, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateNotIn(List<Date> values) {
            addCriterion("temp_repayment_notes_detail.should_pay_date not in", values, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes_detail.should_pay_date between", value1, value2, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes_detail.should_pay_date not between", value1, value2, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateIsNull() {
            addCriterion("temp_repayment_notes_detail.actual_pay_date is null");
            return (Criteria) this;
        }

        public Criteria andActualPayDateIsNotNull() {
            addCriterion("temp_repayment_notes_detail.actual_pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andActualPayDateEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_date =", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateNotEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_date <>", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateGreaterThan(Date value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_date >", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_date >=", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateLessThan(Date value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_date <", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_date <=", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateIn(List<Date> values) {
            addCriterion("temp_repayment_notes_detail.actual_pay_date in", values, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateNotIn(List<Date> values) {
            addCriterion("temp_repayment_notes_detail.actual_pay_date not in", values, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes_detail.actual_pay_date between", value1, value2, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes_detail.actual_pay_date not between", value1, value2, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyIsNull() {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyIsNotNull() {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny =", value, "currentPayMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny <>", value, "currentPayMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyGreaterThan(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny >", value, "currentPayMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny >=", value, "currentPayMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyLessThan(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny <", value, "currentPayMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny <=", value, "currentPayMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny in", values, "currentPayMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny not in", values, "currentPayMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny between", value1, value2, "currentPayMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentPayMoenyNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.current_pay_moeny not between", value1, value2, "currentPayMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalIsNull() {
            addCriterion("temp_repayment_notes_detail.current_pay_principal is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalIsNotNull() {
            addCriterion("temp_repayment_notes_detail.current_pay_principal is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_principal =", value, "currentPayPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_principal <>", value, "currentPayPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalGreaterThan(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_principal >", value, "currentPayPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_principal >=", value, "currentPayPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalLessThan(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_principal <", value, "currentPayPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_principal <=", value, "currentPayPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.current_pay_principal in", values, "currentPayPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.current_pay_principal not in", values, "currentPayPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.current_pay_principal between", value1, value2, "currentPayPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPayPrincipalNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.current_pay_principal not between", value1, value2, "currentPayPrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestIsNull() {
            addCriterion("temp_repayment_notes_detail.current_pay_interest is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestIsNotNull() {
            addCriterion("temp_repayment_notes_detail.current_pay_interest is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_interest =", value, "currentPayInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_interest <>", value, "currentPayInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestGreaterThan(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_interest >", value, "currentPayInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_interest >=", value, "currentPayInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestLessThan(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_interest <", value, "currentPayInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.current_pay_interest <=", value, "currentPayInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.current_pay_interest in", values, "currentPayInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.current_pay_interest not in", values, "currentPayInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.current_pay_interest between", value1, value2, "currentPayInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentPayInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.current_pay_interest not between", value1, value2, "currentPayInterest");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyIsNull() {
            addCriterion("temp_repayment_notes_detail.actual_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyIsNotNull() {
            addCriterion("temp_repayment_notes_detail.actual_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_money =", value, "actualPayMoney");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_money <>", value, "actualPayMoney");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyGreaterThan(Float value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_money >", value, "actualPayMoney");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_money >=", value, "actualPayMoney");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyLessThan(Float value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_money <", value, "actualPayMoney");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.actual_pay_money <=", value, "actualPayMoney");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.actual_pay_money in", values, "actualPayMoney");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.actual_pay_money not in", values, "actualPayMoney");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.actual_pay_money between", value1, value2, "actualPayMoney");
            return (Criteria) this;
        }

        public Criteria andActualPayMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.actual_pay_money not between", value1, value2, "actualPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyIsNull() {
            addCriterion("temp_repayment_notes_detail.also_need_money is null");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyIsNotNull() {
            addCriterion("temp_repayment_notes_detail.also_need_money is not null");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.also_need_money =", value, "alsoNeedMoney");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.also_need_money <>", value, "alsoNeedMoney");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyGreaterThan(Float value) {
            addCriterion("temp_repayment_notes_detail.also_need_money >", value, "alsoNeedMoney");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.also_need_money >=", value, "alsoNeedMoney");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyLessThan(Float value) {
            addCriterion("temp_repayment_notes_detail.also_need_money <", value, "alsoNeedMoney");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.also_need_money <=", value, "alsoNeedMoney");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.also_need_money in", values, "alsoNeedMoney");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.also_need_money not in", values, "alsoNeedMoney");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.also_need_money between", value1, value2, "alsoNeedMoney");
            return (Criteria) this;
        }

        public Criteria andAlsoNeedMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.also_need_money not between", value1, value2, "alsoNeedMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIsNull() {
            addCriterion("temp_repayment_notes_detail.overdue_interest is null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIsNotNull() {
            addCriterion("temp_repayment_notes_detail.overdue_interest is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_interest =", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_interest <>", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThan(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_interest >", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_interest >=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThan(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_interest <", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_interest <=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.overdue_interest in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.overdue_interest not in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.overdue_interest between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.overdue_interest not between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeIsNull() {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee is null");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeIsNotNull() {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee =", value, "overdueUrgeFee");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee <>", value, "overdueUrgeFee");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeGreaterThan(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee >", value, "overdueUrgeFee");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee >=", value, "overdueUrgeFee");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeLessThan(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee <", value, "overdueUrgeFee");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee <=", value, "overdueUrgeFee");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee in", values, "overdueUrgeFee");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee not in", values, "overdueUrgeFee");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee between", value1, value2, "overdueUrgeFee");
            return (Criteria) this;
        }

        public Criteria andOverdueUrgeFeeNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.overdue_urge_fee not between", value1, value2, "overdueUrgeFee");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeIsNull() {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee is null");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeIsNotNull() {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee =", value, "overdueManaFee");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeNotEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee <>", value, "overdueManaFee");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeGreaterThan(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee >", value, "overdueManaFee");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee >=", value, "overdueManaFee");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeLessThan(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee <", value, "overdueManaFee");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeLessThanOrEqualTo(Float value) {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee <=", value, "overdueManaFee");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee in", values, "overdueManaFee");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeNotIn(List<Float> values) {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee not in", values, "overdueManaFee");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee between", value1, value2, "overdueManaFee");
            return (Criteria) this;
        }

        public Criteria andOverdueManaFeeNotBetween(Float value1, Float value2) {
            addCriterion("temp_repayment_notes_detail.overdue_mana_fee not between", value1, value2, "overdueManaFee");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNull() {
            addCriterion("temp_repayment_notes_detail.overdue_days is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNotNull() {
            addCriterion("temp_repayment_notes_detail.overdue_days is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.overdue_days =", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.overdue_days <>", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThan(Date value) {
            addCriterion("temp_repayment_notes_detail.overdue_days >", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.overdue_days >=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThan(Date value) {
            addCriterion("temp_repayment_notes_detail.overdue_days <", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.overdue_days <=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIn(List<Date> values) {
            addCriterion("temp_repayment_notes_detail.overdue_days in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotIn(List<Date> values) {
            addCriterion("temp_repayment_notes_detail.overdue_days not in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes_detail.overdue_days between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes_detail.overdue_days not between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNull() {
            addCriterion("temp_repayment_notes_detail.is_overdue is null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNotNull() {
            addCriterion("temp_repayment_notes_detail.is_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.is_overdue =", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.is_overdue <>", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThan(String value) {
            addCriterion("temp_repayment_notes_detail.is_overdue >", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.is_overdue >=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThan(String value) {
            addCriterion("temp_repayment_notes_detail.is_overdue <", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.is_overdue <=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLike(String value) {
            addCriterion("temp_repayment_notes_detail.is_overdue like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotLike(String value) {
            addCriterion("temp_repayment_notes_detail.is_overdue not like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.is_overdue in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.is_overdue not in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.is_overdue between", value1, value2, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.is_overdue not between", value1, value2, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesIsNull() {
            addCriterion("temp_repayment_notes_detail.is_advances is null");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesIsNotNull() {
            addCriterion("temp_repayment_notes_detail.is_advances is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.is_advances =", value, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesNotEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.is_advances <>", value, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesGreaterThan(String value) {
            addCriterion("temp_repayment_notes_detail.is_advances >", value, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.is_advances >=", value, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesLessThan(String value) {
            addCriterion("temp_repayment_notes_detail.is_advances <", value, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.is_advances <=", value, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesLike(String value) {
            addCriterion("temp_repayment_notes_detail.is_advances like", value, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesNotLike(String value) {
            addCriterion("temp_repayment_notes_detail.is_advances not like", value, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.is_advances in", values, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesNotIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.is_advances not in", values, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.is_advances between", value1, value2, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andIsAdvancesNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.is_advances not between", value1, value2, "isAdvances");
            return (Criteria) this;
        }

        public Criteria andRepayStateIsNull() {
            addCriterion("temp_repayment_notes_detail.repay_state is null");
            return (Criteria) this;
        }

        public Criteria andRepayStateIsNotNull() {
            addCriterion("temp_repayment_notes_detail.repay_state is not null");
            return (Criteria) this;
        }

        public Criteria andRepayStateEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_state =", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_state <>", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateGreaterThan(String value) {
            addCriterion("temp_repayment_notes_detail.repay_state >", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_state >=", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateLessThan(String value) {
            addCriterion("temp_repayment_notes_detail.repay_state <", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.repay_state <=", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateLike(String value) {
            addCriterion("temp_repayment_notes_detail.repay_state like", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotLike(String value) {
            addCriterion("temp_repayment_notes_detail.repay_state not like", value, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.repay_state in", values, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.repay_state not in", values, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.repay_state between", value1, value2, "repayState");
            return (Criteria) this;
        }

        public Criteria andRepayStateNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.repay_state not between", value1, value2, "repayState");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_repayment_notes_detail.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_repayment_notes_detail.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_repayment_notes_detail.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_repayment_notes_detail.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_repayment_notes_detail.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_repayment_notes_detail.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_repayment_notes_detail.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_repayment_notes_detail.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_repayment_notes_detail.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_repayment_notes_detail.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_repayment_notes_detail.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_repayment_notes_detail.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_repayment_notes_detail.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_repayment_notes_detail.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_repayment_notes_detail.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_repayment_notes_detail.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_repayment_notes_detail.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_repayment_notes_detail.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes_detail.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes_detail.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_repayment_notes_detail.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_repayment_notes_detail.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_repayment_notes_detail.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_repayment_notes_detail.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_notes_detail.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_repayment_notes_detail.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_repayment_notes_detail.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_repayment_notes_detail.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_notes_detail.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_repayment_notes_detail.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_repayment_notes_detail.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_repayment_notes_detail.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_repayment_notes_detail.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_notes_detail.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_repayment_notes_detail.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_repayment_notes_detail.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes_detail.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_notes_detail.update_time not between", value1, value2, "updateTime");
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