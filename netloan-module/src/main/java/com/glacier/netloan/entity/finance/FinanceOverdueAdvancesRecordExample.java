package com.glacier.netloan.entity.finance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceOverdueAdvancesRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinanceOverdueAdvancesRecordExample() {
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

        public Criteria andAdvancesRecordIdIsNull() {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id =", value, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id <>", value, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id >", value, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id >=", value, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id <", value, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id <=", value, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id like", value, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id not like", value, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id in", values, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id not in", values, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id between", value1, value2, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andAdvancesRecordIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.advances_record_id not between", value1, value2, "advancesRecordId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdIsNull() {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id is null");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id =", value, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id <>", value, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id >", value, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id >=", value, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id <", value, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id <=", value, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id like", value, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id not like", value, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id in", values, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id not in", values, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id between", value1, value2, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andOverdueAdvancesIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.overdue_advances_id not between", value1, value2, "overdueAdvancesId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdIsNull() {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id =", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id <>", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id >", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id >=", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id <", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id <=", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id like", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id not like", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id in", values, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id not in", values, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id between", value1, value2, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.platform_transaction_id not between", value1, value2, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_finance_overdue_advances_record.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdIsNull() {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id =", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id <>", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id >", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id >=", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id <", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id <=", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id like", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id not like", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id in", values, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id not in", values, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id between", value1, value2, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.repay_notes_detail_id not between", value1, value2, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("temp_finance_overdue_advances_record.member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_type like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.member_type not like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentIsNull() {
            addCriterion("temp_finance_overdue_advances_record.advances_percent is null");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.advances_percent is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent =", value, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent <>", value, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent >", value, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent >=", value, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent <", value, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent <=", value, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent like", value, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent not like", value, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent in", values, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent not in", values, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent between", value1, value2, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesPercentNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.advances_percent not between", value1, value2, "advancesPercent");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyIsNull() {
            addCriterion("temp_finance_overdue_advances_record.advances_money is null");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.advances_money is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_money =", value, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_money <>", value, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_money >", value, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_money >=", value, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_money <", value, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_money <=", value, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_money like", value, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.advances_money not like", value, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.advances_money in", values, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.advances_money not in", values, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.advances_money between", value1, value2, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAdvancesMoneyNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.advances_money not between", value1, value2, "advancesMoney");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_finance_overdue_advances_record.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_finance_overdue_advances_record.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_finance_overdue_advances_record.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_finance_overdue_advances_record.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_finance_overdue_advances_record.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_finance_overdue_advances_record.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_finance_overdue_advances_record.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_advances_record.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_advances_record.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("temp_finance_overdue_advances_record.audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_overdue_advances_record.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_overdue_advances_record.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_overdue_advances_record.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_overdue_advances_record.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_overdue_advances_record.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_overdue_advances_record.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_overdue_advances_record.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_advances_record.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_advances_record.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_overdue_advances_record.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_overdue_advances_record.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_advances_record.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_overdue_advances_record.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_advances_record.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_advances_record.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_overdue_advances_record.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_overdue_advances_record.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_overdue_advances_record.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_overdue_advances_record.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_advances_record.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_overdue_advances_record.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_overdue_advances_record.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_advances_record.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_advances_record.update_time not between", value1, value2, "updateTime");
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