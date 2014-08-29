package com.glacier.netloan.entity.email;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageEmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MessageEmailExample() {
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

        public Criteria andEmailIdIsNull() {
            addCriterion("temp_message_email.email_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailIdIsNotNull() {
            addCriterion("temp_message_email.email_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailIdEqualTo(String value) {
            addCriterion("temp_message_email.email_id =", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotEqualTo(String value) {
            addCriterion("temp_message_email.email_id <>", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThan(String value) {
            addCriterion("temp_message_email.email_id >", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_email.email_id >=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThan(String value) {
            addCriterion("temp_message_email.email_id <", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThanOrEqualTo(String value) {
            addCriterion("temp_message_email.email_id <=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLike(String value) {
            addCriterion("temp_message_email.email_id like", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotLike(String value) {
            addCriterion("temp_message_email.email_id not like", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdIn(List<String> values) {
            addCriterion("temp_message_email.email_id in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotIn(List<String> values) {
            addCriterion("temp_message_email.email_id not in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdBetween(String value1, String value2) {
            addCriterion("temp_message_email.email_id between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotBetween(String value1, String value2) {
            addCriterion("temp_message_email.email_id not between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIsNull() {
            addCriterion("temp_message_email.email_title is null");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIsNotNull() {
            addCriterion("temp_message_email.email_title is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTitleEqualTo(String value) {
            addCriterion("temp_message_email.email_title =", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotEqualTo(String value) {
            addCriterion("temp_message_email.email_title <>", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleGreaterThan(String value) {
            addCriterion("temp_message_email.email_title >", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_email.email_title >=", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLessThan(String value) {
            addCriterion("temp_message_email.email_title <", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLessThanOrEqualTo(String value) {
            addCriterion("temp_message_email.email_title <=", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLike(String value) {
            addCriterion("temp_message_email.email_title like", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotLike(String value) {
            addCriterion("temp_message_email.email_title not like", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIn(List<String> values) {
            addCriterion("temp_message_email.email_title in", values, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotIn(List<String> values) {
            addCriterion("temp_message_email.email_title not in", values, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleBetween(String value1, String value2) {
            addCriterion("temp_message_email.email_title between", value1, value2, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotBetween(String value1, String value2) {
            addCriterion("temp_message_email.email_title not between", value1, value2, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTextIsNull() {
            addCriterion("temp_message_email.email_text is null");
            return (Criteria) this;
        }

        public Criteria andEmailTextIsNotNull() {
            addCriterion("temp_message_email.email_text is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTextEqualTo(String value) {
            addCriterion("temp_message_email.email_text =", value, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTextNotEqualTo(String value) {
            addCriterion("temp_message_email.email_text <>", value, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTextGreaterThan(String value) {
            addCriterion("temp_message_email.email_text >", value, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTextGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_email.email_text >=", value, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTextLessThan(String value) {
            addCriterion("temp_message_email.email_text <", value, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTextLessThanOrEqualTo(String value) {
            addCriterion("temp_message_email.email_text <=", value, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTextLike(String value) {
            addCriterion("temp_message_email.email_text like", value, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTextNotLike(String value) {
            addCriterion("temp_message_email.email_text not like", value, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTextIn(List<String> values) {
            addCriterion("temp_message_email.email_text in", values, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTextNotIn(List<String> values) {
            addCriterion("temp_message_email.email_text not in", values, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTextBetween(String value1, String value2) {
            addCriterion("temp_message_email.email_text between", value1, value2, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTextNotBetween(String value1, String value2) {
            addCriterion("temp_message_email.email_text not between", value1, value2, "emailText");
            return (Criteria) this;
        }

        public Criteria andEmailTypeIsNull() {
            addCriterion("temp_message_email.email_type is null");
            return (Criteria) this;
        }

        public Criteria andEmailTypeIsNotNull() {
            addCriterion("temp_message_email.email_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTypeEqualTo(String value) {
            addCriterion("temp_message_email.email_type =", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotEqualTo(String value) {
            addCriterion("temp_message_email.email_type <>", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeGreaterThan(String value) {
            addCriterion("temp_message_email.email_type >", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_email.email_type >=", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeLessThan(String value) {
            addCriterion("temp_message_email.email_type <", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_message_email.email_type <=", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeLike(String value) {
            addCriterion("temp_message_email.email_type like", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotLike(String value) {
            addCriterion("temp_message_email.email_type not like", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeIn(List<String> values) {
            addCriterion("temp_message_email.email_type in", values, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotIn(List<String> values) {
            addCriterion("temp_message_email.email_type not in", values, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeBetween(String value1, String value2) {
            addCriterion("temp_message_email.email_type between", value1, value2, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotBetween(String value1, String value2) {
            addCriterion("temp_message_email.email_type not between", value1, value2, "emailType");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("temp_message_email.send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("temp_message_email.send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("temp_message_email.send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("temp_message_email.send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("temp_message_email.send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_message_email.send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("temp_message_email.send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_message_email.send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("temp_message_email.send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("temp_message_email.send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("temp_message_email.send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_message_email.send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_message_email.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_message_email.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_message_email.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_message_email.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_message_email.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_email.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_message_email.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_message_email.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_message_email.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_message_email.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_message_email.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_message_email.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_message_email.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_message_email.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNull() {
            addCriterion("temp_message_email.creater_time is null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNotNull() {
            addCriterion("temp_message_email.creater_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeEqualTo(Date value) {
            addCriterion("temp_message_email.creater_time =", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotEqualTo(Date value) {
            addCriterion("temp_message_email.creater_time <>", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThan(Date value) {
            addCriterion("temp_message_email.creater_time >", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_message_email.creater_time >=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThan(Date value) {
            addCriterion("temp_message_email.creater_time <", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_message_email.creater_time <=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIn(List<Date> values) {
            addCriterion("temp_message_email.creater_time in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotIn(List<Date> values) {
            addCriterion("temp_message_email.creater_time not in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("temp_message_email.creater_time between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_message_email.creater_time not between", value1, value2, "createrTime");
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