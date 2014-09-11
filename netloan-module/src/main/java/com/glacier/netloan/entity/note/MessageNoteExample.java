package com.glacier.netloan.entity.note;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageNoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MessageNoteExample() {
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

        public Criteria andNoteIdIsNull() {
            addCriterion("temp_message_note.note_id is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("temp_message_note.note_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(String value) {
            addCriterion("temp_message_note.note_id =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(String value) {
            addCriterion("temp_message_note.note_id <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(String value) {
            addCriterion("temp_message_note.note_id >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_note.note_id >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(String value) {
            addCriterion("temp_message_note.note_id <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(String value) {
            addCriterion("temp_message_note.note_id <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLike(String value) {
            addCriterion("temp_message_note.note_id like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotLike(String value) {
            addCriterion("temp_message_note.note_id not like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<String> values) {
            addCriterion("temp_message_note.note_id in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<String> values) {
            addCriterion("temp_message_note.note_id not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(String value1, String value2) {
            addCriterion("temp_message_note.note_id between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(String value1, String value2) {
            addCriterion("temp_message_note.note_id not between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIsNull() {
            addCriterion("temp_message_note.note_title is null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIsNotNull() {
            addCriterion("temp_message_note.note_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleEqualTo(String value) {
            addCriterion("temp_message_note.note_title =", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotEqualTo(String value) {
            addCriterion("temp_message_note.note_title <>", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThan(String value) {
            addCriterion("temp_message_note.note_title >", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_note.note_title >=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThan(String value) {
            addCriterion("temp_message_note.note_title <", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThanOrEqualTo(String value) {
            addCriterion("temp_message_note.note_title <=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLike(String value) {
            addCriterion("temp_message_note.note_title like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotLike(String value) {
            addCriterion("temp_message_note.note_title not like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIn(List<String> values) {
            addCriterion("temp_message_note.note_title in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotIn(List<String> values) {
            addCriterion("temp_message_note.note_title not in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleBetween(String value1, String value2) {
            addCriterion("temp_message_note.note_title between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotBetween(String value1, String value2) {
            addCriterion("temp_message_note.note_title not between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTextIsNull() {
            addCriterion("temp_message_note.note_text is null");
            return (Criteria) this;
        }

        public Criteria andNoteTextIsNotNull() {
            addCriterion("temp_message_note.note_text is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTextEqualTo(String value) {
            addCriterion("temp_message_note.note_text =", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextNotEqualTo(String value) {
            addCriterion("temp_message_note.note_text <>", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextGreaterThan(String value) {
            addCriterion("temp_message_note.note_text >", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_note.note_text >=", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextLessThan(String value) {
            addCriterion("temp_message_note.note_text <", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextLessThanOrEqualTo(String value) {
            addCriterion("temp_message_note.note_text <=", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextLike(String value) {
            addCriterion("temp_message_note.note_text like", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextNotLike(String value) {
            addCriterion("temp_message_note.note_text not like", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextIn(List<String> values) {
            addCriterion("temp_message_note.note_text in", values, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextNotIn(List<String> values) {
            addCriterion("temp_message_note.note_text not in", values, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextBetween(String value1, String value2) {
            addCriterion("temp_message_note.note_text between", value1, value2, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextNotBetween(String value1, String value2) {
            addCriterion("temp_message_note.note_text not between", value1, value2, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIsNull() {
            addCriterion("temp_message_note.note_type is null");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIsNotNull() {
            addCriterion("temp_message_note.note_type is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTypeEqualTo(String value) {
            addCriterion("temp_message_note.note_type =", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotEqualTo(String value) {
            addCriterion("temp_message_note.note_type <>", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeGreaterThan(String value) {
            addCriterion("temp_message_note.note_type >", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_note.note_type >=", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeLessThan(String value) {
            addCriterion("temp_message_note.note_type <", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_message_note.note_type <=", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeLike(String value) {
            addCriterion("temp_message_note.note_type like", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotLike(String value) {
            addCriterion("temp_message_note.note_type not like", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIn(List<String> values) {
            addCriterion("temp_message_note.note_type in", values, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotIn(List<String> values) {
            addCriterion("temp_message_note.note_type not in", values, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeBetween(String value1, String value2) {
            addCriterion("temp_message_note.note_type between", value1, value2, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotBetween(String value1, String value2) {
            addCriterion("temp_message_note.note_type not between", value1, value2, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIsNull() {
            addCriterion("temp_message_note.note_time is null");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIsNotNull() {
            addCriterion("temp_message_note.note_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTimeEqualTo(Date value) {
            addCriterion("temp_message_note.note_time =", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotEqualTo(Date value) {
            addCriterion("temp_message_note.note_time <>", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeGreaterThan(Date value) {
            addCriterion("temp_message_note.note_time >", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_message_note.note_time >=", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeLessThan(Date value) {
            addCriterion("temp_message_note.note_time <", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_message_note.note_time <=", value, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeIn(List<Date> values) {
            addCriterion("temp_message_note.note_time in", values, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotIn(List<Date> values) {
            addCriterion("temp_message_note.note_time not in", values, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeBetween(Date value1, Date value2) {
            addCriterion("temp_message_note.note_time between", value1, value2, "noteTime");
            return (Criteria) this;
        }

        public Criteria andNoteTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_message_note.note_time not between", value1, value2, "noteTime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_message_note.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_message_note.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_message_note.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_message_note.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_message_note.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_note.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_message_note.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_message_note.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_message_note.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_message_note.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_message_note.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_message_note.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_message_note.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_message_note.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNull() {
            addCriterion("temp_message_note.creater_time is null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNotNull() {
            addCriterion("temp_message_note.creater_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeEqualTo(Date value) {
            addCriterion("temp_message_note.creater_time =", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotEqualTo(Date value) {
            addCriterion("temp_message_note.creater_time <>", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThan(Date value) {
            addCriterion("temp_message_note.creater_time >", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_message_note.creater_time >=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThan(Date value) {
            addCriterion("temp_message_note.creater_time <", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_message_note.creater_time <=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIn(List<Date> values) {
            addCriterion("temp_message_note.creater_time in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotIn(List<Date> values) {
            addCriterion("temp_message_note.creater_time not in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("temp_message_note.creater_time between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_message_note.creater_time not between", value1, value2, "createrTime");
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