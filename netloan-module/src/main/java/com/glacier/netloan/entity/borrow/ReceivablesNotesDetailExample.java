package com.glacier.netloan.entity.borrow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceivablesNotesDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ReceivablesNotesDetailExample() {
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

        public Criteria andReceNotesDetailIdIsNull() {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdIsNotNull() {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id =", value, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdNotEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id <>", value, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdGreaterThan(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id >", value, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id >=", value, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdLessThan(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id <", value, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id <=", value, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdLike(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id like", value, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdNotLike(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id not like", value, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id in", values, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdNotIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id not in", values, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id between", value1, value2, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesDetailIdNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.rece_notes_detail_id not between", value1, value2, "receNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdIsNull() {
            addCriterion("temp_receivables_notes_detail.rece_notes_id is null");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdIsNotNull() {
            addCriterion("temp_receivables_notes_detail.rece_notes_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id =", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdNotEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id <>", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdGreaterThan(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id >", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id >=", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdLessThan(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id <", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id <=", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdLike(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id like", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdNotLike(String value) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id not like", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id in", values, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdNotIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id not in", values, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id between", value1, value2, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.rece_notes_id not between", value1, value2, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyIsNull() {
            addCriterion("temp_receivables_notes_detail.alr_rece_money is null");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyIsNotNull() {
            addCriterion("temp_receivables_notes_detail.alr_rece_money is not null");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_rece_money =", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_rece_money <>", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyGreaterThan(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_rece_money >", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_rece_money >=", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyLessThan(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_rece_money <", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_rece_money <=", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.alr_rece_money in", values, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.alr_rece_money not in", values, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.alr_rece_money between", value1, value2, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.alr_rece_money not between", value1, value2, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodIsNull() {
            addCriterion("temp_receivables_notes_detail.number_period is null");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodIsNotNull() {
            addCriterion("temp_receivables_notes_detail.number_period is not null");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.number_period =", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodNotEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.number_period <>", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodGreaterThan(String value) {
            addCriterion("temp_receivables_notes_detail.number_period >", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.number_period >=", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodLessThan(String value) {
            addCriterion("temp_receivables_notes_detail.number_period <", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.number_period <=", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodLike(String value) {
            addCriterion("temp_receivables_notes_detail.number_period like", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodNotLike(String value) {
            addCriterion("temp_receivables_notes_detail.number_period not like", value, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.number_period in", values, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodNotIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.number_period not in", values, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.number_period between", value1, value2, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andNumberPeriodNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.number_period not between", value1, value2, "numberPeriod");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateIsNull() {
            addCriterion("temp_receivables_notes_detail.should_pay_date is null");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateIsNotNull() {
            addCriterion("temp_receivables_notes_detail.should_pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.should_pay_date =", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateNotEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.should_pay_date <>", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateGreaterThan(Date value) {
            addCriterion("temp_receivables_notes_detail.should_pay_date >", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.should_pay_date >=", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateLessThan(Date value) {
            addCriterion("temp_receivables_notes_detail.should_pay_date <", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.should_pay_date <=", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateIn(List<Date> values) {
            addCriterion("temp_receivables_notes_detail.should_pay_date in", values, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateNotIn(List<Date> values) {
            addCriterion("temp_receivables_notes_detail.should_pay_date not in", values, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes_detail.should_pay_date between", value1, value2, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes_detail.should_pay_date not between", value1, value2, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateIsNull() {
            addCriterion("temp_receivables_notes_detail.actual_pay_date is null");
            return (Criteria) this;
        }

        public Criteria andActualPayDateIsNotNull() {
            addCriterion("temp_receivables_notes_detail.actual_pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andActualPayDateEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.actual_pay_date =", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateNotEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.actual_pay_date <>", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateGreaterThan(Date value) {
            addCriterion("temp_receivables_notes_detail.actual_pay_date >", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.actual_pay_date >=", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateLessThan(Date value) {
            addCriterion("temp_receivables_notes_detail.actual_pay_date <", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.actual_pay_date <=", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateIn(List<Date> values) {
            addCriterion("temp_receivables_notes_detail.actual_pay_date in", values, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateNotIn(List<Date> values) {
            addCriterion("temp_receivables_notes_detail.actual_pay_date not in", values, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes_detail.actual_pay_date between", value1, value2, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes_detail.actual_pay_date not between", value1, value2, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyIsNull() {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny is null");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyIsNotNull() {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny =", value, "currentReceMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny <>", value, "currentReceMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyGreaterThan(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny >", value, "currentReceMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny >=", value, "currentReceMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyLessThan(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny <", value, "currentReceMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny <=", value, "currentReceMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny in", values, "currentReceMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny not in", values, "currentReceMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny between", value1, value2, "currentReceMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentReceMoenyNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.current_rece_moeny not between", value1, value2, "currentReceMoeny");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalIsNull() {
            addCriterion("temp_receivables_notes_detail.current_rece_principal is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalIsNotNull() {
            addCriterion("temp_receivables_notes_detail.current_rece_principal is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_principal =", value, "currentRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_principal <>", value, "currentRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalGreaterThan(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_principal >", value, "currentRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_principal >=", value, "currentRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalLessThan(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_principal <", value, "currentRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_principal <=", value, "currentRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.current_rece_principal in", values, "currentRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.current_rece_principal not in", values, "currentRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.current_rece_principal between", value1, value2, "currentRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentRecePrincipalNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.current_rece_principal not between", value1, value2, "currentRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestIsNull() {
            addCriterion("temp_receivables_notes_detail.current_rece_interest is null");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestIsNotNull() {
            addCriterion("temp_receivables_notes_detail.current_rece_interest is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_interest =", value, "currentReceInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_interest <>", value, "currentReceInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestGreaterThan(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_interest >", value, "currentReceInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_interest >=", value, "currentReceInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestLessThan(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_interest <", value, "currentReceInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.current_rece_interest <=", value, "currentReceInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.current_rece_interest in", values, "currentReceInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.current_rece_interest not in", values, "currentReceInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.current_rece_interest between", value1, value2, "currentReceInterest");
            return (Criteria) this;
        }

        public Criteria andCurrentReceInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.current_rece_interest not between", value1, value2, "currentReceInterest");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalIsNull() {
            addCriterion("temp_receivables_notes_detail.surplus_principal is null");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalIsNotNull() {
            addCriterion("temp_receivables_notes_detail.surplus_principal is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.surplus_principal =", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.surplus_principal <>", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalGreaterThan(Float value) {
            addCriterion("temp_receivables_notes_detail.surplus_principal >", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.surplus_principal >=", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalLessThan(Float value) {
            addCriterion("temp_receivables_notes_detail.surplus_principal <", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.surplus_principal <=", value, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.surplus_principal in", values, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.surplus_principal not in", values, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.surplus_principal between", value1, value2, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andSurplusPrincipalNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.surplus_principal not between", value1, value2, "surplusPrincipal");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeIsNull() {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee is null");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeIsNotNull() {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee =", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee <>", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeGreaterThan(Float value) {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee >", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee >=", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeLessThan(Float value) {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee <", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee <=", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee in", values, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee not in", values, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee between", value1, value2, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.interest_mana_fee not between", value1, value2, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNull() {
            addCriterion("temp_receivables_notes_detail.is_overdue is null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNotNull() {
            addCriterion("temp_receivables_notes_detail.is_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.is_overdue =", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.is_overdue <>", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThan(String value) {
            addCriterion("temp_receivables_notes_detail.is_overdue >", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.is_overdue >=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThan(String value) {
            addCriterion("temp_receivables_notes_detail.is_overdue <", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.is_overdue <=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLike(String value) {
            addCriterion("temp_receivables_notes_detail.is_overdue like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotLike(String value) {
            addCriterion("temp_receivables_notes_detail.is_overdue not like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.is_overdue in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.is_overdue not in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.is_overdue between", value1, value2, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.is_overdue not between", value1, value2, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIsNull() {
            addCriterion("temp_receivables_notes_detail.overdue_interest is null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIsNotNull() {
            addCriterion("temp_receivables_notes_detail.overdue_interest is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.overdue_interest =", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.overdue_interest <>", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThan(Float value) {
            addCriterion("temp_receivables_notes_detail.overdue_interest >", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.overdue_interest >=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThan(Float value) {
            addCriterion("temp_receivables_notes_detail.overdue_interest <", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.overdue_interest <=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.overdue_interest in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.overdue_interest not in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.overdue_interest between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.overdue_interest not between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyIsNull() {
            addCriterion("temp_receivables_notes_detail.alr_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyIsNotNull() {
            addCriterion("temp_receivables_notes_detail.alr_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_pay_money =", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_pay_money <>", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyGreaterThan(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_pay_money >", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_pay_money >=", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyLessThan(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_pay_money <", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.alr_pay_money <=", value, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.alr_pay_money in", values, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.alr_pay_money not in", values, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.alr_pay_money between", value1, value2, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andAlrPayMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.alr_pay_money not between", value1, value2, "alrPayMoney");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("temp_receivables_notes_detail.income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("temp_receivables_notes_detail.income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Float value) {
            addCriterion("temp_receivables_notes_detail.income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Float value) {
            addCriterion("temp_receivables_notes_detail.income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes_detail.income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes_detail.income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes_detail.income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andReceStateIsNull() {
            addCriterion("temp_receivables_notes_detail.rece_state is null");
            return (Criteria) this;
        }

        public Criteria andReceStateIsNotNull() {
            addCriterion("temp_receivables_notes_detail.rece_state is not null");
            return (Criteria) this;
        }

        public Criteria andReceStateEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_state =", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateNotEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_state <>", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateGreaterThan(String value) {
            addCriterion("temp_receivables_notes_detail.rece_state >", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_state >=", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateLessThan(String value) {
            addCriterion("temp_receivables_notes_detail.rece_state <", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.rece_state <=", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateLike(String value) {
            addCriterion("temp_receivables_notes_detail.rece_state like", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateNotLike(String value) {
            addCriterion("temp_receivables_notes_detail.rece_state not like", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.rece_state in", values, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateNotIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.rece_state not in", values, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.rece_state between", value1, value2, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.rece_state not between", value1, value2, "receState");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_receivables_notes_detail.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_receivables_notes_detail.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_receivables_notes_detail.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_receivables_notes_detail.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_receivables_notes_detail.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_receivables_notes_detail.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_receivables_notes_detail.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_receivables_notes_detail.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_receivables_notes_detail.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_receivables_notes_detail.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_receivables_notes_detail.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_receivables_notes_detail.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_receivables_notes_detail.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_receivables_notes_detail.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_receivables_notes_detail.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_receivables_notes_detail.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_receivables_notes_detail.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_receivables_notes_detail.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes_detail.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes_detail.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_receivables_notes_detail.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_receivables_notes_detail.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_receivables_notes_detail.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_receivables_notes_detail.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes_detail.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_receivables_notes_detail.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_receivables_notes_detail.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_receivables_notes_detail.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes_detail.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_receivables_notes_detail.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_receivables_notes_detail.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_receivables_notes_detail.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_receivables_notes_detail.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes_detail.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_receivables_notes_detail.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_receivables_notes_detail.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes_detail.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes_detail.update_time not between", value1, value2, "updateTime");
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