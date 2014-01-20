package com.glacier.netloan.entity.sysmgr;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OperaLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public OperaLogExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOperalogIdIsNull() {
            addCriterion("temp_operalog.operalog_id is null");
            return (Criteria) this;
        }

        public Criteria andOperalogIdIsNotNull() {
            addCriterion("temp_operalog.operalog_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperalogIdEqualTo(String value) {
            addCriterion("temp_operalog.operalog_id =", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdNotEqualTo(String value) {
            addCriterion("temp_operalog.operalog_id <>", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdGreaterThan(String value) {
            addCriterion("temp_operalog.operalog_id >", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.operalog_id >=", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdLessThan(String value) {
            addCriterion("temp_operalog.operalog_id <", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.operalog_id <=", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdLike(String value) {
            addCriterion("temp_operalog.operalog_id like", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdNotLike(String value) {
            addCriterion("temp_operalog.operalog_id not like", value, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdIn(List<String> values) {
            addCriterion("temp_operalog.operalog_id in", values, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdNotIn(List<String> values) {
            addCriterion("temp_operalog.operalog_id not in", values, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdBetween(String value1, String value2) {
            addCriterion("temp_operalog.operalog_id between", value1, value2, "operalogId");
            return (Criteria) this;
        }

        public Criteria andOperalogIdNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.operalog_id not between", value1, value2, "operalogId");
            return (Criteria) this;
        }

        public Criteria andActionIdIsNull() {
            addCriterion("temp_operalog.action_id is null");
            return (Criteria) this;
        }

        public Criteria andActionIdIsNotNull() {
            addCriterion("temp_operalog.action_id is not null");
            return (Criteria) this;
        }

        public Criteria andActionIdEqualTo(String value) {
            addCriterion("temp_operalog.action_id =", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotEqualTo(String value) {
            addCriterion("temp_operalog.action_id <>", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThan(String value) {
            addCriterion("temp_operalog.action_id >", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.action_id >=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThan(String value) {
            addCriterion("temp_operalog.action_id <", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.action_id <=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLike(String value) {
            addCriterion("temp_operalog.action_id like", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotLike(String value) {
            addCriterion("temp_operalog.action_id not like", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdIn(List<String> values) {
            addCriterion("temp_operalog.action_id in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotIn(List<String> values) {
            addCriterion("temp_operalog.action_id not in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdBetween(String value1, String value2) {
            addCriterion("temp_operalog.action_id between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.action_id not between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("temp_operalog.user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("temp_operalog.user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("temp_operalog.user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("temp_operalog.user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("temp_operalog.user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("temp_operalog.user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("temp_operalog.user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("temp_operalog.user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("temp_operalog.user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("temp_operalog.user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("temp_operalog.user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOperaDescIsNull() {
            addCriterion("temp_operalog.opera_desc is null");
            return (Criteria) this;
        }

        public Criteria andOperaDescIsNotNull() {
            addCriterion("temp_operalog.opera_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOperaDescEqualTo(String value) {
            addCriterion("temp_operalog.opera_desc =", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescNotEqualTo(String value) {
            addCriterion("temp_operalog.opera_desc <>", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescGreaterThan(String value) {
            addCriterion("temp_operalog.opera_desc >", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_desc >=", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescLessThan(String value) {
            addCriterion("temp_operalog.opera_desc <", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_desc <=", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescLike(String value) {
            addCriterion("temp_operalog.opera_desc like", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescNotLike(String value) {
            addCriterion("temp_operalog.opera_desc not like", value, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescIn(List<String> values) {
            addCriterion("temp_operalog.opera_desc in", values, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescNotIn(List<String> values) {
            addCriterion("temp_operalog.opera_desc not in", values, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_desc between", value1, value2, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaDescNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_desc not between", value1, value2, "operaDesc");
            return (Criteria) this;
        }

        public Criteria andOperaIdIsNull() {
            addCriterion("temp_operalog.opera_id is null");
            return (Criteria) this;
        }

        public Criteria andOperaIdIsNotNull() {
            addCriterion("temp_operalog.opera_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperaIdEqualTo(String value) {
            addCriterion("temp_operalog.opera_id =", value, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaIdNotEqualTo(String value) {
            addCriterion("temp_operalog.opera_id <>", value, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaIdGreaterThan(String value) {
            addCriterion("temp_operalog.opera_id >", value, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_id >=", value, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaIdLessThan(String value) {
            addCriterion("temp_operalog.opera_id <", value, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaIdLessThanOrEqualTo(String value) {
            addCriterion("temp_operalog.opera_id <=", value, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaIdLike(String value) {
            addCriterion("temp_operalog.opera_id like", value, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaIdNotLike(String value) {
            addCriterion("temp_operalog.opera_id not like", value, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaIdIn(List<String> values) {
            addCriterion("temp_operalog.opera_id in", values, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaIdNotIn(List<String> values) {
            addCriterion("temp_operalog.opera_id not in", values, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaIdBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_id between", value1, value2, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaIdNotBetween(String value1, String value2) {
            addCriterion("temp_operalog.opera_id not between", value1, value2, "operaId");
            return (Criteria) this;
        }

        public Criteria andOperaTimeIsNull() {
            addCriterion("temp_operalog.opera_time is null");
            return (Criteria) this;
        }

        public Criteria andOperaTimeIsNotNull() {
            addCriterion("temp_operalog.opera_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperaTimeEqualTo(Date value) {
            addCriterionForJDBCDate("temp_operalog.opera_time =", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("temp_operalog.opera_time <>", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("temp_operalog.opera_time >", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("temp_operalog.opera_time >=", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeLessThan(Date value) {
            addCriterionForJDBCDate("temp_operalog.opera_time <", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("temp_operalog.opera_time <=", value, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeIn(List<Date> values) {
            addCriterionForJDBCDate("temp_operalog.opera_time in", values, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("temp_operalog.opera_time not in", values, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("temp_operalog.opera_time between", value1, value2, "operaTime");
            return (Criteria) this;
        }

        public Criteria andOperaTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("temp_operalog.opera_time not between", value1, value2, "operaTime");
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