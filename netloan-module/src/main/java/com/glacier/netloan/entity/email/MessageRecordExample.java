package com.glacier.netloan.entity.email;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MessageRecordExample() {
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
        public Criteria andRecordMemberDisplaylike(String value) {//根据收件人查询
            addCriterion("temp_member.member_real_name like", value, "recordMemberDisplay");
            return (Criteria) this;
        }
        
        public Criteria andRecordSendDisplaylike(String value) {//根据发件人查询
            addCriterion("temp_creater.user_cn_name like", value, "recordSendDisplay");
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

        public Criteria andRecordIdIsNull() {
            addCriterion("temp_message_record.record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("temp_message_record.record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(String value) {
            addCriterion("temp_message_record.record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(String value) {
            addCriterion("temp_message_record.record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(String value) {
            addCriterion("temp_message_record.record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_record.record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(String value) {
            addCriterion("temp_message_record.record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(String value) {
            addCriterion("temp_message_record.record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLike(String value) {
            addCriterion("temp_message_record.record_id like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotLike(String value) {
            addCriterion("temp_message_record.record_id not like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<String> values) {
            addCriterion("temp_message_record.record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<String> values) {
            addCriterion("temp_message_record.record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(String value1, String value2) {
            addCriterion("temp_message_record.record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(String value1, String value2) {
            addCriterion("temp_message_record.record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordTitleIsNull() {
            addCriterion("temp_message_record.record_title is null");
            return (Criteria) this;
        }

        public Criteria andRecordTitleIsNotNull() {
            addCriterion("temp_message_record.record_title is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTitleEqualTo(String value) {
            addCriterion("temp_message_record.record_title =", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleNotEqualTo(String value) {
            addCriterion("temp_message_record.record_title <>", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleGreaterThan(String value) {
            addCriterion("temp_message_record.record_title >", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_record.record_title >=", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleLessThan(String value) {
            addCriterion("temp_message_record.record_title <", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleLessThanOrEqualTo(String value) {
            addCriterion("temp_message_record.record_title <=", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleLike(String value) {
            addCriterion("temp_message_record.record_title like", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleNotLike(String value) {
            addCriterion("temp_message_record.record_title not like", value, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleIn(List<String> values) {
            addCriterion("temp_message_record.record_title in", values, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleNotIn(List<String> values) {
            addCriterion("temp_message_record.record_title not in", values, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleBetween(String value1, String value2) {
            addCriterion("temp_message_record.record_title between", value1, value2, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordTitleNotBetween(String value1, String value2) {
            addCriterion("temp_message_record.record_title not between", value1, value2, "recordTitle");
            return (Criteria) this;
        }

        public Criteria andRecordSendIsNull() {
            addCriterion("temp_message_record.record_send is null");
            return (Criteria) this;
        }

        public Criteria andRecordSendIsNotNull() {
            addCriterion("temp_message_record.record_send is not null");
            return (Criteria) this;
        }

        public Criteria andRecordSendEqualTo(String value) {
            addCriterion("temp_message_record.record_send =", value, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordSendNotEqualTo(String value) {
            addCriterion("temp_message_record.record_send <>", value, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordSendGreaterThan(String value) {
            addCriterion("temp_message_record.record_send >", value, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordSendGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_record.record_send >=", value, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordSendLessThan(String value) {
            addCriterion("temp_message_record.record_send <", value, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordSendLessThanOrEqualTo(String value) {
            addCriterion("temp_message_record.record_send <=", value, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordSendLike(String value) {
            addCriterion("temp_message_record.record_send like", value, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordSendNotLike(String value) {
            addCriterion("temp_message_record.record_send not like", value, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordSendIn(List<String> values) {
            addCriterion("temp_message_record.record_send in", values, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordSendNotIn(List<String> values) {
            addCriterion("temp_message_record.record_send not in", values, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordSendBetween(String value1, String value2) {
            addCriterion("temp_message_record.record_send between", value1, value2, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordSendNotBetween(String value1, String value2) {
            addCriterion("temp_message_record.record_send not between", value1, value2, "recordSend");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidIsNull() {
            addCriterion("temp_message_record.record_memberid is null");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidIsNotNull() {
            addCriterion("temp_message_record.record_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidEqualTo(String value) {
            addCriterion("temp_message_record.record_memberid =", value, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidNotEqualTo(String value) {
            addCriterion("temp_message_record.record_memberid <>", value, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidGreaterThan(String value) {
            addCriterion("temp_message_record.record_memberid >", value, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_record.record_memberid >=", value, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidLessThan(String value) {
            addCriterion("temp_message_record.record_memberid <", value, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidLessThanOrEqualTo(String value) {
            addCriterion("temp_message_record.record_memberid <=", value, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidLike(String value) {
            addCriterion("temp_message_record.record_memberid like", value, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidNotLike(String value) {
            addCriterion("temp_message_record.record_memberid not like", value, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidIn(List<String> values) {
            addCriterion("temp_message_record.record_memberid in", values, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidNotIn(List<String> values) {
            addCriterion("temp_message_record.record_memberid not in", values, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidBetween(String value1, String value2) {
            addCriterion("temp_message_record.record_memberid between", value1, value2, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andRecordMemberidNotBetween(String value1, String value2) {
            addCriterion("temp_message_record.record_memberid not between", value1, value2, "recordMemberid");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNull() {
            addCriterion("temp_message_record.creater_time is null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNotNull() {
            addCriterion("temp_message_record.creater_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeEqualTo(Date value) {
            addCriterion("temp_message_record.creater_time =", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotEqualTo(Date value) {
            addCriterion("temp_message_record.creater_time <>", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThan(Date value) {
            addCriterion("temp_message_record.creater_time >", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_message_record.creater_time >=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThan(Date value) {
            addCriterion("temp_message_record.creater_time <", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_message_record.creater_time <=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIn(List<Date> values) {
            addCriterion("temp_message_record.creater_time in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotIn(List<Date> values) {
            addCriterion("temp_message_record.creater_time not in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("temp_message_record.creater_time between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_message_record.creater_time not between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andEmailIdIsNull() {
            addCriterion("temp_message_record.email_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailIdIsNotNull() {
            addCriterion("temp_message_record.email_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailIdEqualTo(String value) {
            addCriterion("temp_message_record.email_id =", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotEqualTo(String value) {
            addCriterion("temp_message_record.email_id <>", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThan(String value) {
            addCriterion("temp_message_record.email_id >", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_record.email_id >=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThan(String value) {
            addCriterion("temp_message_record.email_id <", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThanOrEqualTo(String value) {
            addCriterion("temp_message_record.email_id <=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLike(String value) {
            addCriterion("temp_message_record.email_id like", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotLike(String value) {
            addCriterion("temp_message_record.email_id not like", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdIn(List<String> values) {
            addCriterion("temp_message_record.email_id in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotIn(List<String> values) {
            addCriterion("temp_message_record.email_id not in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdBetween(String value1, String value2) {
            addCriterion("temp_message_record.email_id between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotBetween(String value1, String value2) {
            addCriterion("temp_message_record.email_id not between", value1, value2, "emailId");
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