package com.glacier.netloan.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceRechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinanceRechargeExample() {
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

        public Criteria andFinanceRechargeIdIsNull() {
            addCriterion("temp_finance_recharge.finance_recharge_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdIsNotNull() {
            addCriterion("temp_finance_recharge.finance_recharge_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdEqualTo(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_id =", value, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdNotEqualTo(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_id <>", value, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdGreaterThan(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_id >", value, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_id >=", value, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdLessThan(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_id <", value, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_id <=", value, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdLike(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_id like", value, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdNotLike(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_id not like", value, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdIn(List<String> values) {
            addCriterion("temp_finance_recharge.finance_recharge_id in", values, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdNotIn(List<String> values) {
            addCriterion("temp_finance_recharge.finance_recharge_id not in", values, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.finance_recharge_id between", value1, value2, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.finance_recharge_id not between", value1, value2, "financeRechargeId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_finance_recharge.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_finance_recharge.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_finance_recharge.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_recharge.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_recharge.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_finance_recharge.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_finance_recharge.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_finance_recharge.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_finance_recharge.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_recharge.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdIsNull() {
            addCriterion("temp_finance_recharge.finance_recharge_set_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdIsNotNull() {
            addCriterion("temp_finance_recharge.finance_recharge_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdEqualTo(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id =", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdNotEqualTo(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id <>", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdGreaterThan(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id >", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id >=", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdLessThan(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id <", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id <=", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdLike(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id like", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdNotLike(String value) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id not like", value, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdIn(List<String> values) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id in", values, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdNotIn(List<String> values) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id not in", values, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id between", value1, value2, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andFinanceRechargeSetIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.finance_recharge_set_id not between", value1, value2, "financeRechargeSetId");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNull() {
            addCriterion("temp_finance_recharge.recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNotNull() {
            addCriterion("temp_finance_recharge.recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountEqualTo(Float value) {
            addCriterion("temp_finance_recharge.recharge_amount =", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotEqualTo(Float value) {
            addCriterion("temp_finance_recharge.recharge_amount <>", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThan(Float value) {
            addCriterion("temp_finance_recharge.recharge_amount >", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge.recharge_amount >=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThan(Float value) {
            addCriterion("temp_finance_recharge.recharge_amount <", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge.recharge_amount <=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIn(List<Float> values) {
            addCriterion("temp_finance_recharge.recharge_amount in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotIn(List<Float> values) {
            addCriterion("temp_finance_recharge.recharge_amount not in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge.recharge_amount between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge.recharge_amount not between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeIsNull() {
            addCriterion("temp_finance_recharge.handling_charge is null");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeIsNotNull() {
            addCriterion("temp_finance_recharge.handling_charge is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeEqualTo(Float value) {
            addCriterion("temp_finance_recharge.handling_charge =", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeNotEqualTo(Float value) {
            addCriterion("temp_finance_recharge.handling_charge <>", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeGreaterThan(Float value) {
            addCriterion("temp_finance_recharge.handling_charge >", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge.handling_charge >=", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeLessThan(Float value) {
            addCriterion("temp_finance_recharge.handling_charge <", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge.handling_charge <=", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeIn(List<Float> values) {
            addCriterion("temp_finance_recharge.handling_charge in", values, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeNotIn(List<Float> values) {
            addCriterion("temp_finance_recharge.handling_charge not in", values, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge.handling_charge between", value1, value2, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge.handling_charge not between", value1, value2, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andRechargeRateIsNull() {
            addCriterion("temp_finance_recharge.recharge_rate is null");
            return (Criteria) this;
        }

        public Criteria andRechargeRateIsNotNull() {
            addCriterion("temp_finance_recharge.recharge_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeRateEqualTo(Float value) {
            addCriterion("temp_finance_recharge.recharge_rate =", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateNotEqualTo(Float value) {
            addCriterion("temp_finance_recharge.recharge_rate <>", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateGreaterThan(Float value) {
            addCriterion("temp_finance_recharge.recharge_rate >", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge.recharge_rate >=", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateLessThan(Float value) {
            addCriterion("temp_finance_recharge.recharge_rate <", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge.recharge_rate <=", value, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateIn(List<Float> values) {
            addCriterion("temp_finance_recharge.recharge_rate in", values, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateNotIn(List<Float> values) {
            addCriterion("temp_finance_recharge.recharge_rate not in", values, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge.recharge_rate between", value1, value2, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andRechargeRateNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge.recharge_rate not between", value1, value2, "rechargeRate");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyIsNull() {
            addCriterion("temp_finance_recharge.arrive_money is null");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyIsNotNull() {
            addCriterion("temp_finance_recharge.arrive_money is not null");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyEqualTo(Float value) {
            addCriterion("temp_finance_recharge.arrive_money =", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_recharge.arrive_money <>", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_recharge.arrive_money >", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge.arrive_money >=", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyLessThan(Float value) {
            addCriterion("temp_finance_recharge.arrive_money <", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_recharge.arrive_money <=", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyIn(List<Float> values) {
            addCriterion("temp_finance_recharge.arrive_money in", values, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_recharge.arrive_money not in", values, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge.arrive_money between", value1, value2, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_recharge.arrive_money not between", value1, value2, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_finance_recharge.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_finance_recharge.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_finance_recharge.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_finance_recharge.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_finance_recharge.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_finance_recharge.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_finance_recharge.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_finance_recharge.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_finance_recharge.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_finance_recharge.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_finance_recharge.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_finance_recharge.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_finance_recharge.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_finance_recharge.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_finance_recharge.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_finance_recharge.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_finance_recharge.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_finance_recharge.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_finance_recharge.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_finance_recharge.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_finance_recharge.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_finance_recharge.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_finance_recharge.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_finance_recharge.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_finance_recharge.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_finance_recharge.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_finance_recharge.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_finance_recharge.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_recharge.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_recharge.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_recharge.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_recharge.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_recharge.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_recharge.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_recharge.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_recharge.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_recharge.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_recharge.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_recharge.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_recharge.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_recharge.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_recharge.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_recharge.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_recharge.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_recharge.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_recharge.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_recharge.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_recharge.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_recharge.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_recharge.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_recharge.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_recharge.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_recharge.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_recharge.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_recharge.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_recharge.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_recharge.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_recharge.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_recharge.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_recharge.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_recharge.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_recharge.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_recharge.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_recharge.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_recharge.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_recharge.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_recharge.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_recharge.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_recharge.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_recharge.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_recharge.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_recharge.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_recharge.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_recharge.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_recharge.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_recharge.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_recharge.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_recharge.update_time not between", value1, value2, "updateTime");
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