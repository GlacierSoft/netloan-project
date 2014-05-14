package com.glacier.netloan.entity.finance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinancePlatformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinancePlatformExample() {
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

        public Criteria andFinancePlatformIdIsNull() {
            addCriterion("temp_finance_platform.finance_platform_id is null");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdIsNotNull() {
            addCriterion("temp_finance_platform.finance_platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdEqualTo(String value) {
            addCriterion("temp_finance_platform.finance_platform_id =", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdNotEqualTo(String value) {
            addCriterion("temp_finance_platform.finance_platform_id <>", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdGreaterThan(String value) {
            addCriterion("temp_finance_platform.finance_platform_id >", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.finance_platform_id >=", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdLessThan(String value) {
            addCriterion("temp_finance_platform.finance_platform_id <", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.finance_platform_id <=", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdLike(String value) {
            addCriterion("temp_finance_platform.finance_platform_id like", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdNotLike(String value) {
            addCriterion("temp_finance_platform.finance_platform_id not like", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdIn(List<String> values) {
            addCriterion("temp_finance_platform.finance_platform_id in", values, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdNotIn(List<String> values) {
            addCriterion("temp_finance_platform.finance_platform_id not in", values, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.finance_platform_id between", value1, value2, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.finance_platform_id not between", value1, value2, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeIsNull() {
            addCriterion("temp_finance_platform.platform_code is null");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeIsNotNull() {
            addCriterion("temp_finance_platform.platform_code is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_code =", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_code <>", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeGreaterThan(String value) {
            addCriterion("temp_finance_platform.platform_code >", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_code >=", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeLessThan(String value) {
            addCriterion("temp_finance_platform.platform_code <", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_code <=", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeLike(String value) {
            addCriterion("temp_finance_platform.platform_code like", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotLike(String value) {
            addCriterion("temp_finance_platform.platform_code not like", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeIn(List<String> values) {
            addCriterion("temp_finance_platform.platform_code in", values, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotIn(List<String> values) {
            addCriterion("temp_finance_platform.platform_code not in", values, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.platform_code between", value1, value2, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.platform_code not between", value1, value2, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformNameIsNull() {
            addCriterion("temp_finance_platform.platform_name is null");
            return (Criteria) this;
        }

        public Criteria andPlatformNameIsNotNull() {
            addCriterion("temp_finance_platform.platform_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformNameEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_name =", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_name <>", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameGreaterThan(String value) {
            addCriterion("temp_finance_platform.platform_name >", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_name >=", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLessThan(String value) {
            addCriterion("temp_finance_platform.platform_name <", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_name <=", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLike(String value) {
            addCriterion("temp_finance_platform.platform_name like", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotLike(String value) {
            addCriterion("temp_finance_platform.platform_name not like", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameIn(List<String> values) {
            addCriterion("temp_finance_platform.platform_name in", values, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotIn(List<String> values) {
            addCriterion("temp_finance_platform.platform_name not in", values, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.platform_name between", value1, value2, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.platform_name not between", value1, value2, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIsNull() {
            addCriterion("temp_finance_platform.platform_account is null");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIsNotNull() {
            addCriterion("temp_finance_platform.platform_account is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_account =", value, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountNotEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_account <>", value, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountGreaterThan(String value) {
            addCriterion("temp_finance_platform.platform_account >", value, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_account >=", value, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountLessThan(String value) {
            addCriterion("temp_finance_platform.platform_account <", value, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.platform_account <=", value, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountLike(String value) {
            addCriterion("temp_finance_platform.platform_account like", value, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountNotLike(String value) {
            addCriterion("temp_finance_platform.platform_account not like", value, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIn(List<String> values) {
            addCriterion("temp_finance_platform.platform_account in", values, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountNotIn(List<String> values) {
            addCriterion("temp_finance_platform.platform_account not in", values, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.platform_account between", value1, value2, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.platform_account not between", value1, value2, "platformAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyIsNull() {
            addCriterion("temp_finance_platform.platform_money is null");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyIsNotNull() {
            addCriterion("temp_finance_platform.platform_money is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyEqualTo(Float value) {
            addCriterion("temp_finance_platform.platform_money =", value, "platformMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_platform.platform_money <>", value, "platformMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_platform.platform_money >", value, "platformMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_platform.platform_money >=", value, "platformMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyLessThan(Float value) {
            addCriterion("temp_finance_platform.platform_money <", value, "platformMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_platform.platform_money <=", value, "platformMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyIn(List<Float> values) {
            addCriterion("temp_finance_platform.platform_money in", values, "platformMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_platform.platform_money not in", values, "platformMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_platform.platform_money between", value1, value2, "platformMoney");
            return (Criteria) this;
        }

        public Criteria andPlatformMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_platform.platform_money not between", value1, value2, "platformMoney");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_finance_platform.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_finance_platform.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_finance_platform.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_finance_platform.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_finance_platform.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_finance_platform.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_finance_platform.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_finance_platform.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_finance_platform.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_finance_platform.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_finance_platform.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_finance_platform.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_finance_platform.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_finance_platform.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_finance_platform.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_finance_platform.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_finance_platform.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_finance_platform.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_finance_platform.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_finance_platform.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_finance_platform.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_finance_platform.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_finance_platform.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_finance_platform.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_finance_platform.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_finance_platform.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_finance_platform.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_finance_platform.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_platform.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_platform.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_platform.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_platform.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_platform.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_platform.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_platform.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_platform.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_platform.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_platform.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_platform.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_platform.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_platform.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_platform.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_platform.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_platform.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_platform.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_platform.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_platform.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_platform.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_platform.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_platform.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_platform.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_platform.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_platform.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_platform.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_platform.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_platform.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_platform.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_platform.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_platform.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_platform.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_platform.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_platform.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_platform.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_platform.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_platform.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_platform.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_platform.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_platform.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_platform.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_platform.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_platform.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_platform.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_platform.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_platform.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform.update_time not between", value1, value2, "updateTime");
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