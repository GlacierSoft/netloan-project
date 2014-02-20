package com.glacier.netloan.entity.finance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceRechargeSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinanceRechargeSetExample() {
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

        public Criteria andFinanceRechargeSetIdIsNull() {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdIsNotNull() {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id =", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdNotEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id <>", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdGreaterThan(String value) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id >", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id >=", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdLessThan(String value) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id <", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id <=", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdLike(String value) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id like", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdNotLike(String value) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id not like", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id in", values, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdNotIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id not in", values, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id between", value1, value2, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.finance_recharge_set_id not between", value1, value2, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameIsNull() {
            addCriterion("temp_finance_recharge_set.recharge_set_name is null");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameIsNotNull() {
            addCriterion("temp_finance_recharge_set.recharge_set_name is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.recharge_set_name =", value, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameNotEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.recharge_set_name <>", value, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameGreaterThan(String value) {
            addCriterion("temp_finance_recharge_set.recharge_set_name >", value, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.recharge_set_name >=", value, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameLessThan(String value) {
            addCriterion("temp_finance_recharge_set.recharge_set_name <", value, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.recharge_set_name <=", value, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameLike(String value) {
            addCriterion("temp_finance_recharge_set.recharge_set_name like", value, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameNotLike(String value) {
            addCriterion("temp_finance_recharge_set.recharge_set_name not like", value, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.recharge_set_name in", values, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameNotIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.recharge_set_name not in", values, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.recharge_set_name between", value1, value2, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeSetNameNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.recharge_set_name not between", value1, value2, "rechargeSetName");
            return (Criteria) this;
        }

        public Criteria andRechargeRateIsNull() {
            addCriterion("temp_finance_recharge_set.recharge_rate is null");
            return (Criteria) this;
        }

        public Criteria andRechargeRateIsNotNull() {
            addCriterion("temp_finance_recharge_set.recharge_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeRateEqualTo(Float value) {
            addCriterion("temp_finance_recharge_set.recharge_rate =", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateNotEqualTo(Float value) {
            addCriterion("temp_finance_recharge_set.recharge_rate <>", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateGreaterThan(Float value) {
            addCriterion("temp_finance_recharge_set.recharge_rate >", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge_set.recharge_rate >=", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateLessThan(Float value) {
            addCriterion("temp_finance_recharge_set.recharge_rate <", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge_set.recharge_rate <=", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateIn(List<Float> values) {
            addCriterion("temp_finance_recharge_set.recharge_rate in", values, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateNotIn(List<Float> values) {
            addCriterion("temp_finance_recharge_set.recharge_rate not in", values, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge_set.recharge_rate between", value1, value2, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge_set.recharge_rate not between", value1, value2, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("temp_finance_recharge_set.member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("temp_finance_recharge_set.member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(String value) {
            addCriterion("temp_finance_recharge_set.member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(String value) {
            addCriterion("temp_finance_recharge_set.member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLike(String value) {
            addCriterion("temp_finance_recharge_set.member_type like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotLike(String value) {
            addCriterion("temp_finance_recharge_set.member_type not like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("temp_finance_recharge_set.value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("temp_finance_recharge_set.value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Float value) {
            addCriterion("temp_finance_recharge_set.value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Float value) {
            addCriterion("temp_finance_recharge_set.value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Float value) {
            addCriterion("temp_finance_recharge_set.value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge_set.value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Float value) {
            addCriterion("temp_finance_recharge_set.value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge_set.value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Float> values) {
            addCriterion("temp_finance_recharge_set.value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Float> values) {
            addCriterion("temp_finance_recharge_set.value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge_set.value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge_set.value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andFeeWayIsNull() {
            addCriterion("temp_finance_recharge_set.fee_way is null");
            return (Criteria) this;
        }

        public Criteria andFeeWayIsNotNull() {
            addCriterion("temp_finance_recharge_set.fee_way is not null");
            return (Criteria) this;
        }

        public Criteria andFeeWayEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.fee_way =", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayNotEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.fee_way <>", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayGreaterThan(String value) {
            addCriterion("temp_finance_recharge_set.fee_way >", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.fee_way >=", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayLessThan(String value) {
            addCriterion("temp_finance_recharge_set.fee_way <", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.fee_way <=", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayLike(String value) {
            addCriterion("temp_finance_recharge_set.fee_way like", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayNotLike(String value) {
            addCriterion("temp_finance_recharge_set.fee_way not like", value, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.fee_way in", values, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayNotIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.fee_way not in", values, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.fee_way between", value1, value2, "feeWay");
            return (Criteria) this;
        }

        public Criteria andFeeWayNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.fee_way not between", value1, value2, "feeWay");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_finance_recharge_set.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_finance_recharge_set.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_finance_recharge_set.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_finance_recharge_set.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_finance_recharge_set.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_finance_recharge_set.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_finance_recharge_set.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_finance_recharge_set.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_finance_recharge_set.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_finance_recharge_set.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_finance_recharge_set.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_finance_recharge_set.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge_set.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge_set.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_recharge_set.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_recharge_set.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_recharge_set.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_recharge_set.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_recharge_set.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_recharge_set.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_recharge_set.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_recharge_set.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_recharge_set.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_recharge_set.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_recharge_set.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_recharge_set.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_recharge_set.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_recharge_set.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_recharge_set.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_recharge_set.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_recharge_set.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_recharge_set.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge_set.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge_set.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_recharge_set.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_recharge_set.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_recharge_set.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_recharge_set.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge_set.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_recharge_set.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_recharge_set.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_recharge_set.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge_set.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_recharge_set.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_recharge_set.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_recharge_set.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_recharge_set.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge_set.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_recharge_set.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_recharge_set.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge_set.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge_set.update_time not between", value1, value2, "updateTime");
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