package com.glacier.netloan.entity.finance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 

public class FinanceOverdueFineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinanceOverdueFineExample() {
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

        //扩展查询条件
        public Criteria andMemberRealNamelike(String value) {
            addCriterion("temp_member.member_real_name like", value, "memberRealName");
            return (Criteria) this;
        }
        
        //扩展查询条件
        public Criteria andOverdueFineSetDisplaylike(String value) {
            addCriterion("temp_finance_overdue_fine_set.overdue_fine_set_name like", value, "overdueFineSetDisplay");
            return (Criteria) this;
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

        public Criteria andOverdueFineIdIsNull() {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id is null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdIsNotNull() {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id =", value, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id <>", value, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdGreaterThan(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id >", value, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id >=", value, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdLessThan(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id <", value, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id <=", value, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdLike(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id like", value, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdNotLike(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id not like", value, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id in", values, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id not in", values, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id between", value1, value2, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_id not between", value1, value2, "overdueFineId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdIsNull() {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id is null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdIsNotNull() {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id =", value, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id <>", value, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdGreaterThan(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id >", value, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id >=", value, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdLessThan(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id <", value, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id <=", value, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdLike(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id like", value, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdNotLike(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id not like", value, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id in", values, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id not in", values, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id between", value1, value2, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_id not between", value1, value2, "overdueFineSetId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameIsNull() {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name is null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameIsNotNull() {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name =", value, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name <>", value, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameGreaterThan(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name >", value, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name >=", value, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameLessThan(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name <", value, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name <=", value, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameLike(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name like", value, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameNotLike(String value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name not like", value, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name in", values, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name not in", values, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name between", value1, value2, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andOverdueFineSetNameNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_set_name not between", value1, value2, "overdueFineSetName");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_finance_overdue_fine.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_finance_overdue_fine.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_overdue_fine.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_finance_overdue_fine.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_finance_overdue_fine.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_finance_overdue_fine.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdIsNull() {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdIsNotNull() {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id =", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id <>", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdGreaterThan(String value) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id >", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id >=", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLessThan(String value) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id <", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id <=", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLike(String value) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id like", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotLike(String value) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id not like", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id in", values, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id not in", values, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id between", value1, value2, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.repay_notes_detail_id not between", value1, value2, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyIsNull() {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money is null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyIsNotNull() {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyEqualTo(Float value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money =", value, "overdueFineMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money <>", value, "overdueFineMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money >", value, "overdueFineMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money >=", value, "overdueFineMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyLessThan(Float value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money <", value, "overdueFineMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money <=", value, "overdueFineMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyIn(List<Float> values) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money in", values, "overdueFineMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money not in", values, "overdueFineMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money between", value1, value2, "overdueFineMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueFineMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_overdue_fine.overdue_fine_money not between", value1, value2, "overdueFineMoney");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateIsNull() {
            addCriterion("temp_finance_overdue_fine.should_pay_date is null");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateIsNotNull() {
            addCriterion("temp_finance_overdue_fine.should_pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.should_pay_date =", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateNotEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.should_pay_date <>", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateGreaterThan(Date value) {
            addCriterion("temp_finance_overdue_fine.should_pay_date >", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.should_pay_date >=", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateLessThan(Date value) {
            addCriterion("temp_finance_overdue_fine.should_pay_date <", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.should_pay_date <=", value, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateIn(List<Date> values) {
            addCriterion("temp_finance_overdue_fine.should_pay_date in", values, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateNotIn(List<Date> values) {
            addCriterion("temp_finance_overdue_fine.should_pay_date not in", values, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_fine.should_pay_date between", value1, value2, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andShouldPayDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_fine.should_pay_date not between", value1, value2, "shouldPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateIsNull() {
            addCriterion("temp_finance_overdue_fine.actual_pay_date is null");
            return (Criteria) this;
        }

        public Criteria andActualPayDateIsNotNull() {
            addCriterion("temp_finance_overdue_fine.actual_pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andActualPayDateEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.actual_pay_date =", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateNotEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.actual_pay_date <>", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateGreaterThan(Date value) {
            addCriterion("temp_finance_overdue_fine.actual_pay_date >", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.actual_pay_date >=", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateLessThan(Date value) {
            addCriterion("temp_finance_overdue_fine.actual_pay_date <", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.actual_pay_date <=", value, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateIn(List<Date> values) {
            addCriterion("temp_finance_overdue_fine.actual_pay_date in", values, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateNotIn(List<Date> values) {
            addCriterion("temp_finance_overdue_fine.actual_pay_date not in", values, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_fine.actual_pay_date between", value1, value2, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andActualPayDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_fine.actual_pay_date not between", value1, value2, "actualPayDate");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_finance_overdue_fine.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_finance_overdue_fine.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_finance_overdue_fine.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_finance_overdue_fine.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_finance_overdue_fine.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_finance_overdue_fine.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_finance_overdue_fine.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_finance_overdue_fine.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_finance_overdue_fine.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_finance_overdue_fine.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_finance_overdue_fine.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_finance_overdue_fine.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_finance_overdue_fine.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_finance_overdue_fine.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_finance_overdue_fine.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_finance_overdue_fine.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_finance_overdue_fine.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_finance_overdue_fine.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_fine.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_fine.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("temp_finance_overdue_fine.audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("temp_finance_overdue_fine.audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("temp_finance_overdue_fine.audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("temp_finance_overdue_fine.audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("temp_finance_overdue_fine.audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("temp_finance_overdue_fine.audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_overdue_fine.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_overdue_fine.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_overdue_fine.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_overdue_fine.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_overdue_fine.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_overdue_fine.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_overdue_fine.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_overdue_fine.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_overdue_fine.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_overdue_fine.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_overdue_fine.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_overdue_fine.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_overdue_fine.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_overdue_fine.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_overdue_fine.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_overdue_fine.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_overdue_fine.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_overdue_fine.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_fine.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_fine.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_overdue_fine.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_overdue_fine.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_overdue_fine.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_overdue_fine.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_overdue_fine.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_overdue_fine.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_overdue_fine.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_overdue_fine.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_overdue_fine.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_overdue_fine.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_overdue_fine.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_overdue_fine.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_overdue_fine.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_overdue_fine.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_overdue_fine.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_overdue_fine.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_fine.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_overdue_fine.update_time not between", value1, value2, "updateTime");
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