package com.glacier.netloan.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationAmountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ApplicationAmountExample() {
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

        public Criteria andAppAmountIdIsNull() {
            addCriterion("temp_application_amount.app_amount_id is null");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdIsNotNull() {
            addCriterion("temp_application_amount.app_amount_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdEqualTo(String value) {
            addCriterion("temp_application_amount.app_amount_id =", value, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdNotEqualTo(String value) {
            addCriterion("temp_application_amount.app_amount_id <>", value, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdGreaterThan(String value) {
            addCriterion("temp_application_amount.app_amount_id >", value, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.app_amount_id >=", value, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdLessThan(String value) {
            addCriterion("temp_application_amount.app_amount_id <", value, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdLessThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.app_amount_id <=", value, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdLike(String value) {
            addCriterion("temp_application_amount.app_amount_id like", value, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdNotLike(String value) {
            addCriterion("temp_application_amount.app_amount_id not like", value, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdIn(List<String> values) {
            addCriterion("temp_application_amount.app_amount_id in", values, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdNotIn(List<String> values) {
            addCriterion("temp_application_amount.app_amount_id not in", values, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdBetween(String value1, String value2) {
            addCriterion("temp_application_amount.app_amount_id between", value1, value2, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andAppAmountIdNotBetween(String value1, String value2) {
            addCriterion("temp_application_amount.app_amount_id not between", value1, value2, "appAmountId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_application_amount.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_application_amount.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_application_amount.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_application_amount.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_application_amount.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_application_amount.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_application_amount.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_application_amount.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_application_amount.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_application_amount.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_application_amount.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_application_amount.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNull() {
            addCriterion("temp_application_amount.app_type is null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNotNull() {
            addCriterion("temp_application_amount.app_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppTypeEqualTo(String value) {
            addCriterion("temp_application_amount.app_type =", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotEqualTo(String value) {
            addCriterion("temp_application_amount.app_type <>", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThan(String value) {
            addCriterion("temp_application_amount.app_type >", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.app_type >=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThan(String value) {
            addCriterion("temp_application_amount.app_type <", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.app_type <=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLike(String value) {
            addCriterion("temp_application_amount.app_type like", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotLike(String value) {
            addCriterion("temp_application_amount.app_type not like", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeIn(List<String> values) {
            addCriterion("temp_application_amount.app_type in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotIn(List<String> values) {
            addCriterion("temp_application_amount.app_type not in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeBetween(String value1, String value2) {
            addCriterion("temp_application_amount.app_type between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotBetween(String value1, String value2) {
            addCriterion("temp_application_amount.app_type not between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIsNull() {
            addCriterion("temp_application_amount.original_amount is null");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIsNotNull() {
            addCriterion("temp_application_amount.original_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountEqualTo(Float value) {
            addCriterion("temp_application_amount.original_amount =", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotEqualTo(Float value) {
            addCriterion("temp_application_amount.original_amount <>", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountGreaterThan(Float value) {
            addCriterion("temp_application_amount.original_amount >", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_application_amount.original_amount >=", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountLessThan(Float value) {
            addCriterion("temp_application_amount.original_amount <", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountLessThanOrEqualTo(Float value) {
            addCriterion("temp_application_amount.original_amount <=", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIn(List<Float> values) {
            addCriterion("temp_application_amount.original_amount in", values, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotIn(List<Float> values) {
            addCriterion("temp_application_amount.original_amount not in", values, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountBetween(Float value1, Float value2) {
            addCriterion("temp_application_amount.original_amount between", value1, value2, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotBetween(Float value1, Float value2) {
            addCriterion("temp_application_amount.original_amount not between", value1, value2, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andAppMoneyIsNull() {
            addCriterion("temp_application_amount.app_money is null");
            return (Criteria) this;
        }

        public Criteria andAppMoneyIsNotNull() {
            addCriterion("temp_application_amount.app_money is not null");
            return (Criteria) this;
        }

        public Criteria andAppMoneyEqualTo(Float value) {
            addCriterion("temp_application_amount.app_money =", value, "appMoney");
            return (Criteria) this;
        }

        public Criteria andAppMoneyNotEqualTo(Float value) {
            addCriterion("temp_application_amount.app_money <>", value, "appMoney");
            return (Criteria) this;
        }

        public Criteria andAppMoneyGreaterThan(Float value) {
            addCriterion("temp_application_amount.app_money >", value, "appMoney");
            return (Criteria) this;
        }

        public Criteria andAppMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_application_amount.app_money >=", value, "appMoney");
            return (Criteria) this;
        }

        public Criteria andAppMoneyLessThan(Float value) {
            addCriterion("temp_application_amount.app_money <", value, "appMoney");
            return (Criteria) this;
        }

        public Criteria andAppMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_application_amount.app_money <=", value, "appMoney");
            return (Criteria) this;
        }

        public Criteria andAppMoneyIn(List<Float> values) {
            addCriterion("temp_application_amount.app_money in", values, "appMoney");
            return (Criteria) this;
        }

        public Criteria andAppMoneyNotIn(List<Float> values) {
            addCriterion("temp_application_amount.app_money not in", values, "appMoney");
            return (Criteria) this;
        }

        public Criteria andAppMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_application_amount.app_money between", value1, value2, "appMoney");
            return (Criteria) this;
        }

        public Criteria andAppMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_application_amount.app_money not between", value1, value2, "appMoney");
            return (Criteria) this;
        }

        public Criteria andAppExplanationIsNull() {
            addCriterion("temp_application_amount.app_explanation is null");
            return (Criteria) this;
        }

        public Criteria andAppExplanationIsNotNull() {
            addCriterion("temp_application_amount.app_explanation is not null");
            return (Criteria) this;
        }

        public Criteria andAppExplanationEqualTo(String value) {
            addCriterion("temp_application_amount.app_explanation =", value, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAppExplanationNotEqualTo(String value) {
            addCriterion("temp_application_amount.app_explanation <>", value, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAppExplanationGreaterThan(String value) {
            addCriterion("temp_application_amount.app_explanation >", value, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAppExplanationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.app_explanation >=", value, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAppExplanationLessThan(String value) {
            addCriterion("temp_application_amount.app_explanation <", value, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAppExplanationLessThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.app_explanation <=", value, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAppExplanationLike(String value) {
            addCriterion("temp_application_amount.app_explanation like", value, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAppExplanationNotLike(String value) {
            addCriterion("temp_application_amount.app_explanation not like", value, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAppExplanationIn(List<String> values) {
            addCriterion("temp_application_amount.app_explanation in", values, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAppExplanationNotIn(List<String> values) {
            addCriterion("temp_application_amount.app_explanation not in", values, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAppExplanationBetween(String value1, String value2) {
            addCriterion("temp_application_amount.app_explanation between", value1, value2, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAppExplanationNotBetween(String value1, String value2) {
            addCriterion("temp_application_amount.app_explanation not between", value1, value2, "appExplanation");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountIsNull() {
            addCriterion("temp_application_amount.authorized_amount is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountIsNotNull() {
            addCriterion("temp_application_amount.authorized_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountEqualTo(String value) {
            addCriterion("temp_application_amount.authorized_amount =", value, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountNotEqualTo(String value) {
            addCriterion("temp_application_amount.authorized_amount <>", value, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountGreaterThan(String value) {
            addCriterion("temp_application_amount.authorized_amount >", value, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountGreaterThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.authorized_amount >=", value, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountLessThan(String value) {
            addCriterion("temp_application_amount.authorized_amount <", value, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountLessThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.authorized_amount <=", value, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountLike(String value) {
            addCriterion("temp_application_amount.authorized_amount like", value, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountNotLike(String value) {
            addCriterion("temp_application_amount.authorized_amount not like", value, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountIn(List<String> values) {
            addCriterion("temp_application_amount.authorized_amount in", values, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountNotIn(List<String> values) {
            addCriterion("temp_application_amount.authorized_amount not in", values, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountBetween(String value1, String value2) {
            addCriterion("temp_application_amount.authorized_amount between", value1, value2, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuthorizedAmountNotBetween(String value1, String value2) {
            addCriterion("temp_application_amount.authorized_amount not between", value1, value2, "authorizedAmount");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_application_amount.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_application_amount.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_application_amount.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_application_amount.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_application_amount.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_application_amount.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_application_amount.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_application_amount.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_application_amount.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_application_amount.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_application_amount.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_application_amount.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationIsNull() {
            addCriterion("temp_application_amount.process_explanation is null");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationIsNotNull() {
            addCriterion("temp_application_amount.process_explanation is not null");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationEqualTo(String value) {
            addCriterion("temp_application_amount.process_explanation =", value, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationNotEqualTo(String value) {
            addCriterion("temp_application_amount.process_explanation <>", value, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationGreaterThan(String value) {
            addCriterion("temp_application_amount.process_explanation >", value, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.process_explanation >=", value, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationLessThan(String value) {
            addCriterion("temp_application_amount.process_explanation <", value, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationLessThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.process_explanation <=", value, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationLike(String value) {
            addCriterion("temp_application_amount.process_explanation like", value, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationNotLike(String value) {
            addCriterion("temp_application_amount.process_explanation not like", value, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationIn(List<String> values) {
            addCriterion("temp_application_amount.process_explanation in", values, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationNotIn(List<String> values) {
            addCriterion("temp_application_amount.process_explanation not in", values, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationBetween(String value1, String value2) {
            addCriterion("temp_application_amount.process_explanation between", value1, value2, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andProcessExplanationNotBetween(String value1, String value2) {
            addCriterion("temp_application_amount.process_explanation not between", value1, value2, "processExplanation");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNull() {
            addCriterion("temp_application_amount.app_date is null");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNotNull() {
            addCriterion("temp_application_amount.app_date is not null");
            return (Criteria) this;
        }

        public Criteria andAppDateEqualTo(Date value) {
            addCriterion("temp_application_amount.app_date =", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotEqualTo(Date value) {
            addCriterion("temp_application_amount.app_date <>", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThan(Date value) {
            addCriterion("temp_application_amount.app_date >", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_application_amount.app_date >=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThan(Date value) {
            addCriterion("temp_application_amount.app_date <", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_application_amount.app_date <=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateIn(List<Date> values) {
            addCriterion("temp_application_amount.app_date in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotIn(List<Date> values) {
            addCriterion("temp_application_amount.app_date not in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateBetween(Date value1, Date value2) {
            addCriterion("temp_application_amount.app_date between", value1, value2, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_application_amount.app_date not between", value1, value2, "appDate");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNull() {
            addCriterion("temp_application_amount.auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNotNull() {
            addCriterion("temp_application_amount.auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdEqualTo(String value) {
            addCriterion("temp_application_amount.auditor_id =", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotEqualTo(String value) {
            addCriterion("temp_application_amount.auditor_id <>", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThan(String value) {
            addCriterion("temp_application_amount.auditor_id >", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.auditor_id >=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThan(String value) {
            addCriterion("temp_application_amount.auditor_id <", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.auditor_id <=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLike(String value) {
            addCriterion("temp_application_amount.auditor_id like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotLike(String value) {
            addCriterion("temp_application_amount.auditor_id not like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIn(List<String> values) {
            addCriterion("temp_application_amount.auditor_id in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotIn(List<String> values) {
            addCriterion("temp_application_amount.auditor_id not in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdBetween(String value1, String value2) {
            addCriterion("temp_application_amount.auditor_id between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotBetween(String value1, String value2) {
            addCriterion("temp_application_amount.auditor_id not between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_application_amount.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_application_amount.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_application_amount.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_application_amount.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_application_amount.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_application_amount.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_application_amount.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_application_amount.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_application_amount.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_application_amount.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_application_amount.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_application_amount.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_application_amount.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_application_amount.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_application_amount.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_application_amount.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_application_amount.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_application_amount.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_application_amount.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_application_amount.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_application_amount.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_application_amount.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_application_amount.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_application_amount.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_application_amount.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_application_amount.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_application_amount.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_application_amount.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_application_amount.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_application_amount.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_application_amount.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_application_amount.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_application_amount.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_application_amount.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_application_amount.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_application_amount.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_application_amount.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_application_amount.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_application_amount.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_application_amount.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_application_amount.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_application_amount.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_application_amount.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_application_amount.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_application_amount.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_application_amount.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_application_amount.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_application_amount.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_application_amount.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_application_amount.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_application_amount.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_application_amount.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_application_amount.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_application_amount.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_application_amount.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_application_amount.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_application_amount.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_application_amount.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_application_amount.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_application_amount.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_application_amount.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_application_amount.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_application_amount.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_application_amount.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_application_amount.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_application_amount.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_application_amount.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_application_amount.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_application_amount.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_application_amount.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_application_amount.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_application_amount.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_application_amount.update_time not between", value1, value2, "updateTime");
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