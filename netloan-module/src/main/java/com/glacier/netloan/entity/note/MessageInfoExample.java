package com.glacier.netloan.entity.note;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MessageInfoExample() {
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

        public Criteria andInfoIdIsNull() {
            addCriterion("temp_message_info.info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("temp_message_info.info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(String value) {
            addCriterion("temp_message_info.info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(String value) {
            addCriterion("temp_message_info.info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(String value) {
            addCriterion("temp_message_info.info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_info.info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(String value) {
            addCriterion("temp_message_info.info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(String value) {
            addCriterion("temp_message_info.info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLike(String value) {
            addCriterion("temp_message_info.info_id like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotLike(String value) {
            addCriterion("temp_message_info.info_id not like", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<String> values) {
            addCriterion("temp_message_info.info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<String> values) {
            addCriterion("temp_message_info.info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(String value1, String value2) {
            addCriterion("temp_message_info.info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(String value1, String value2) {
            addCriterion("temp_message_info.info_id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoTitleIsNull() {
            addCriterion("temp_message_info.info_title is null");
            return (Criteria) this;
        }

        public Criteria andInfoTitleIsNotNull() {
            addCriterion("temp_message_info.info_title is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTitleEqualTo(String value) {
            addCriterion("temp_message_info.info_title =", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotEqualTo(String value) {
            addCriterion("temp_message_info.info_title <>", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleGreaterThan(String value) {
            addCriterion("temp_message_info.info_title >", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_info.info_title >=", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleLessThan(String value) {
            addCriterion("temp_message_info.info_title <", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleLessThanOrEqualTo(String value) {
            addCriterion("temp_message_info.info_title <=", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleLike(String value) {
            addCriterion("temp_message_info.info_title like", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotLike(String value) {
            addCriterion("temp_message_info.info_title not like", value, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleIn(List<String> values) {
            addCriterion("temp_message_info.info_title in", values, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotIn(List<String> values) {
            addCriterion("temp_message_info.info_title not in", values, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleBetween(String value1, String value2) {
            addCriterion("temp_message_info.info_title between", value1, value2, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoTitleNotBetween(String value1, String value2) {
            addCriterion("temp_message_info.info_title not between", value1, value2, "infoTitle");
            return (Criteria) this;
        }

        public Criteria andInfoSendIsNull() {
            addCriterion("temp_message_info.info_send is null");
            return (Criteria) this;
        }

        public Criteria andInfoSendIsNotNull() {
            addCriterion("temp_message_info.info_send is not null");
            return (Criteria) this;
        }

        public Criteria andInfoSendEqualTo(String value) {
            addCriterion("temp_message_info.info_send =", value, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoSendNotEqualTo(String value) {
            addCriterion("temp_message_info.info_send <>", value, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoSendGreaterThan(String value) {
            addCriterion("temp_message_info.info_send >", value, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoSendGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_info.info_send >=", value, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoSendLessThan(String value) {
            addCriterion("temp_message_info.info_send <", value, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoSendLessThanOrEqualTo(String value) {
            addCriterion("temp_message_info.info_send <=", value, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoSendLike(String value) {
            addCriterion("temp_message_info.info_send like", value, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoSendNotLike(String value) {
            addCriterion("temp_message_info.info_send not like", value, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoSendIn(List<String> values) {
            addCriterion("temp_message_info.info_send in", values, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoSendNotIn(List<String> values) {
            addCriterion("temp_message_info.info_send not in", values, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoSendBetween(String value1, String value2) {
            addCriterion("temp_message_info.info_send between", value1, value2, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoSendNotBetween(String value1, String value2) {
            addCriterion("temp_message_info.info_send not between", value1, value2, "infoSend");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidIsNull() {
            addCriterion("temp_message_info.info_memberid is null");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidIsNotNull() {
            addCriterion("temp_message_info.info_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidEqualTo(String value) {
            addCriterion("temp_message_info.info_memberid =", value, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidNotEqualTo(String value) {
            addCriterion("temp_message_info.info_memberid <>", value, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidGreaterThan(String value) {
            addCriterion("temp_message_info.info_memberid >", value, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_info.info_memberid >=", value, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidLessThan(String value) {
            addCriterion("temp_message_info.info_memberid <", value, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidLessThanOrEqualTo(String value) {
            addCriterion("temp_message_info.info_memberid <=", value, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidLike(String value) {
            addCriterion("temp_message_info.info_memberid like", value, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidNotLike(String value) {
            addCriterion("temp_message_info.info_memberid not like", value, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidIn(List<String> values) {
            addCriterion("temp_message_info.info_memberid in", values, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidNotIn(List<String> values) {
            addCriterion("temp_message_info.info_memberid not in", values, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidBetween(String value1, String value2) {
            addCriterion("temp_message_info.info_memberid between", value1, value2, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andInfoMemberidNotBetween(String value1, String value2) {
            addCriterion("temp_message_info.info_memberid not between", value1, value2, "infoMemberid");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNull() {
            addCriterion("temp_message_info.creater_time is null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNotNull() {
            addCriterion("temp_message_info.creater_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeEqualTo(Date value) {
            addCriterion("temp_message_info.creater_time =", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotEqualTo(Date value) {
            addCriterion("temp_message_info.creater_time <>", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThan(Date value) {
            addCriterion("temp_message_info.creater_time >", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_message_info.creater_time >=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThan(Date value) {
            addCriterion("temp_message_info.creater_time <", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_message_info.creater_time <=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIn(List<Date> values) {
            addCriterion("temp_message_info.creater_time in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotIn(List<Date> values) {
            addCriterion("temp_message_info.creater_time not in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("temp_message_info.creater_time between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_message_info.creater_time not between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNull() {
            addCriterion("temp_message_info.note_id is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("temp_message_info.note_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(String value) {
            addCriterion("temp_message_info.note_id =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(String value) {
            addCriterion("temp_message_info.note_id <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(String value) {
            addCriterion("temp_message_info.note_id >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_info.note_id >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(String value) {
            addCriterion("temp_message_info.note_id <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(String value) {
            addCriterion("temp_message_info.note_id <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLike(String value) {
            addCriterion("temp_message_info.note_id like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotLike(String value) {
            addCriterion("temp_message_info.note_id not like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<String> values) {
            addCriterion("temp_message_info.note_id in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<String> values) {
            addCriterion("temp_message_info.note_id not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(String value1, String value2) {
            addCriterion("temp_message_info.note_id between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(String value1, String value2) {
            addCriterion("temp_message_info.note_id not between", value1, value2, "noteId");
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