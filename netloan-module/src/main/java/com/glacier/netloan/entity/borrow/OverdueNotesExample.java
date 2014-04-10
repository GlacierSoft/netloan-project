package com.glacier.netloan.entity.borrow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OverdueNotesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public OverdueNotesExample() {
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

        public Criteria andOverdueNotesIdIsNull() {
            addCriterion("temp_overdue_notes.overdue_notes_id is null");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdIsNotNull() {
            addCriterion("temp_overdue_notes.overdue_notes_id is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdEqualTo(String value) {
            addCriterion("temp_overdue_notes.overdue_notes_id =", value, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdNotEqualTo(String value) {
            addCriterion("temp_overdue_notes.overdue_notes_id <>", value, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdGreaterThan(String value) {
            addCriterion("temp_overdue_notes.overdue_notes_id >", value, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.overdue_notes_id >=", value, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdLessThan(String value) {
            addCriterion("temp_overdue_notes.overdue_notes_id <", value, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdLessThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.overdue_notes_id <=", value, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdLike(String value) {
            addCriterion("temp_overdue_notes.overdue_notes_id like", value, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdNotLike(String value) {
            addCriterion("temp_overdue_notes.overdue_notes_id not like", value, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdIn(List<String> values) {
            addCriterion("temp_overdue_notes.overdue_notes_id in", values, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdNotIn(List<String> values) {
            addCriterion("temp_overdue_notes.overdue_notes_id not in", values, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.overdue_notes_id between", value1, value2, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andOverdueNotesIdNotBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.overdue_notes_id not between", value1, value2, "overdueNotesId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdIsNull() {
            addCriterion("temp_overdue_notes.repay_notes_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdIsNotNull() {
            addCriterion("temp_overdue_notes.repay_notes_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdEqualTo(String value) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id =", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotEqualTo(String value) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id <>", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdGreaterThan(String value) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id >", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id >=", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLessThan(String value) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id <", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLessThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id <=", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdLike(String value) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id like", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotLike(String value) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id not like", value, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdIn(List<String> values) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id in", values, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotIn(List<String> values) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id not in", values, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id between", value1, value2, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andRepayNotesDetailIdNotBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.repay_notes_detail_id not between", value1, value2, "repayNotesDetailId");
            return (Criteria) this;
        }

        public Criteria andOverdueResultIsNull() {
            addCriterion("temp_overdue_notes.overdue_result is null");
            return (Criteria) this;
        }

        public Criteria andOverdueResultIsNotNull() {
            addCriterion("temp_overdue_notes.overdue_result is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueResultEqualTo(String value) {
            addCriterion("temp_overdue_notes.overdue_result =", value, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andOverdueResultNotEqualTo(String value) {
            addCriterion("temp_overdue_notes.overdue_result <>", value, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andOverdueResultGreaterThan(String value) {
            addCriterion("temp_overdue_notes.overdue_result >", value, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andOverdueResultGreaterThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.overdue_result >=", value, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andOverdueResultLessThan(String value) {
            addCriterion("temp_overdue_notes.overdue_result <", value, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andOverdueResultLessThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.overdue_result <=", value, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andOverdueResultLike(String value) {
            addCriterion("temp_overdue_notes.overdue_result like", value, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andOverdueResultNotLike(String value) {
            addCriterion("temp_overdue_notes.overdue_result not like", value, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andOverdueResultIn(List<String> values) {
            addCriterion("temp_overdue_notes.overdue_result in", values, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andOverdueResultNotIn(List<String> values) {
            addCriterion("temp_overdue_notes.overdue_result not in", values, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andOverdueResultBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.overdue_result between", value1, value2, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andOverdueResultNotBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.overdue_result not between", value1, value2, "overdueResult");
            return (Criteria) this;
        }

        public Criteria andNameRemarkIsNull() {
            addCriterion("temp_overdue_notes.name_remark is null");
            return (Criteria) this;
        }

        public Criteria andNameRemarkIsNotNull() {
            addCriterion("temp_overdue_notes.name_remark is not null");
            return (Criteria) this;
        }

        public Criteria andNameRemarkEqualTo(String value) {
            addCriterion("temp_overdue_notes.name_remark =", value, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andNameRemarkNotEqualTo(String value) {
            addCriterion("temp_overdue_notes.name_remark <>", value, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andNameRemarkGreaterThan(String value) {
            addCriterion("temp_overdue_notes.name_remark >", value, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andNameRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.name_remark >=", value, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andNameRemarkLessThan(String value) {
            addCriterion("temp_overdue_notes.name_remark <", value, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andNameRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.name_remark <=", value, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andNameRemarkLike(String value) {
            addCriterion("temp_overdue_notes.name_remark like", value, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andNameRemarkNotLike(String value) {
            addCriterion("temp_overdue_notes.name_remark not like", value, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andNameRemarkIn(List<String> values) {
            addCriterion("temp_overdue_notes.name_remark in", values, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andNameRemarkNotIn(List<String> values) {
            addCriterion("temp_overdue_notes.name_remark not in", values, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andNameRemarkBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.name_remark between", value1, value2, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andNameRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.name_remark not between", value1, value2, "nameRemark");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_overdue_notes.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_overdue_notes.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_overdue_notes.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_overdue_notes.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_overdue_notes.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_overdue_notes.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_overdue_notes.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_overdue_notes.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_overdue_notes.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_overdue_notes.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_overdue_notes.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_overdue_notes.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_overdue_notes.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_overdue_notes.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_overdue_notes.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_overdue_notes.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_overdue_notes.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_overdue_notes.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_overdue_notes.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_overdue_notes.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_overdue_notes.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_overdue_notes.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_overdue_notes.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_overdue_notes.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_overdue_notes.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_overdue_notes.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_overdue_notes.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_overdue_notes.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_overdue_notes.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_overdue_notes.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_overdue_notes.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_overdue_notes.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_overdue_notes.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_overdue_notes.create_time not between", value1, value2, "createTime");
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