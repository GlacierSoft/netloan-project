package com.glacier.netloan.entity.system;

import java.util.ArrayList;
import java.util.List;

public class MessageReceiverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MessageReceiverExample() {
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

        public Criteria andMsgReceIdIsNull() {
            addCriterion("temp_message_receiver.msg_rece_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdIsNotNull() {
            addCriterion("temp_message_receiver.msg_rece_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdEqualTo(String value) {
            addCriterion("temp_message_receiver.msg_rece_id =", value, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdNotEqualTo(String value) {
            addCriterion("temp_message_receiver.msg_rece_id <>", value, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdGreaterThan(String value) {
            addCriterion("temp_message_receiver.msg_rece_id >", value, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_receiver.msg_rece_id >=", value, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdLessThan(String value) {
            addCriterion("temp_message_receiver.msg_rece_id <", value, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdLessThanOrEqualTo(String value) {
            addCriterion("temp_message_receiver.msg_rece_id <=", value, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdLike(String value) {
            addCriterion("temp_message_receiver.msg_rece_id like", value, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdNotLike(String value) {
            addCriterion("temp_message_receiver.msg_rece_id not like", value, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdIn(List<String> values) {
            addCriterion("temp_message_receiver.msg_rece_id in", values, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdNotIn(List<String> values) {
            addCriterion("temp_message_receiver.msg_rece_id not in", values, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdBetween(String value1, String value2) {
            addCriterion("temp_message_receiver.msg_rece_id between", value1, value2, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andMsgReceIdNotBetween(String value1, String value2) {
            addCriterion("temp_message_receiver.msg_rece_id not between", value1, value2, "msgReceId");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNull() {
            addCriterion("temp_message_receiver.recipient is null");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNotNull() {
            addCriterion("temp_message_receiver.recipient is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientEqualTo(String value) {
            addCriterion("temp_message_receiver.recipient =", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotEqualTo(String value) {
            addCriterion("temp_message_receiver.recipient <>", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThan(String value) {
            addCriterion("temp_message_receiver.recipient >", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_receiver.recipient >=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThan(String value) {
            addCriterion("temp_message_receiver.recipient <", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThanOrEqualTo(String value) {
            addCriterion("temp_message_receiver.recipient <=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLike(String value) {
            addCriterion("temp_message_receiver.recipient like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotLike(String value) {
            addCriterion("temp_message_receiver.recipient not like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientIn(List<String> values) {
            addCriterion("temp_message_receiver.recipient in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotIn(List<String> values) {
            addCriterion("temp_message_receiver.recipient not in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientBetween(String value1, String value2) {
            addCriterion("temp_message_receiver.recipient between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotBetween(String value1, String value2) {
            addCriterion("temp_message_receiver.recipient not between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andReadStatusIsNull() {
            addCriterion("temp_message_receiver.read_status is null");
            return (Criteria) this;
        }

        public Criteria andReadStatusIsNotNull() {
            addCriterion("temp_message_receiver.read_status is not null");
            return (Criteria) this;
        }

        public Criteria andReadStatusEqualTo(Boolean value) {
            addCriterion("temp_message_receiver.read_status =", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotEqualTo(Boolean value) {
            addCriterion("temp_message_receiver.read_status <>", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusGreaterThan(Boolean value) {
            addCriterion("temp_message_receiver.read_status >", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("temp_message_receiver.read_status >=", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusLessThan(Boolean value) {
            addCriterion("temp_message_receiver.read_status <", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("temp_message_receiver.read_status <=", value, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusIn(List<Boolean> values) {
            addCriterion("temp_message_receiver.read_status in", values, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotIn(List<Boolean> values) {
            addCriterion("temp_message_receiver.read_status not in", values, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("temp_message_receiver.read_status between", value1, value2, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReadStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("temp_message_receiver.read_status not between", value1, value2, "readStatus");
            return (Criteria) this;
        }

        public Criteria andReplyMsgIsNull() {
            addCriterion("temp_message_receiver.reply_msg is null");
            return (Criteria) this;
        }

        public Criteria andReplyMsgIsNotNull() {
            addCriterion("temp_message_receiver.reply_msg is not null");
            return (Criteria) this;
        }

        public Criteria andReplyMsgEqualTo(String value) {
            addCriterion("temp_message_receiver.reply_msg =", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgNotEqualTo(String value) {
            addCriterion("temp_message_receiver.reply_msg <>", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgGreaterThan(String value) {
            addCriterion("temp_message_receiver.reply_msg >", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgGreaterThanOrEqualTo(String value) {
            addCriterion("temp_message_receiver.reply_msg >=", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgLessThan(String value) {
            addCriterion("temp_message_receiver.reply_msg <", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgLessThanOrEqualTo(String value) {
            addCriterion("temp_message_receiver.reply_msg <=", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgLike(String value) {
            addCriterion("temp_message_receiver.reply_msg like", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgNotLike(String value) {
            addCriterion("temp_message_receiver.reply_msg not like", value, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgIn(List<String> values) {
            addCriterion("temp_message_receiver.reply_msg in", values, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgNotIn(List<String> values) {
            addCriterion("temp_message_receiver.reply_msg not in", values, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgBetween(String value1, String value2) {
            addCriterion("temp_message_receiver.reply_msg between", value1, value2, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andReplyMsgNotBetween(String value1, String value2) {
            addCriterion("temp_message_receiver.reply_msg not between", value1, value2, "replyMsg");
            return (Criteria) this;
        }

        public Criteria andRecipientDelIsNull() {
            addCriterion("temp_message_receiver.recipient_del is null");
            return (Criteria) this;
        }

        public Criteria andRecipientDelIsNotNull() {
            addCriterion("temp_message_receiver.recipient_del is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientDelEqualTo(Boolean value) {
            addCriterion("temp_message_receiver.recipient_del =", value, "recipientDel");
            return (Criteria) this;
        }

        public Criteria andRecipientDelNotEqualTo(Boolean value) {
            addCriterion("temp_message_receiver.recipient_del <>", value, "recipientDel");
            return (Criteria) this;
        }

        public Criteria andRecipientDelGreaterThan(Boolean value) {
            addCriterion("temp_message_receiver.recipient_del >", value, "recipientDel");
            return (Criteria) this;
        }

        public Criteria andRecipientDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("temp_message_receiver.recipient_del >=", value, "recipientDel");
            return (Criteria) this;
        }

        public Criteria andRecipientDelLessThan(Boolean value) {
            addCriterion("temp_message_receiver.recipient_del <", value, "recipientDel");
            return (Criteria) this;
        }

        public Criteria andRecipientDelLessThanOrEqualTo(Boolean value) {
            addCriterion("temp_message_receiver.recipient_del <=", value, "recipientDel");
            return (Criteria) this;
        }

        public Criteria andRecipientDelIn(List<Boolean> values) {
            addCriterion("temp_message_receiver.recipient_del in", values, "recipientDel");
            return (Criteria) this;
        }

        public Criteria andRecipientDelNotIn(List<Boolean> values) {
            addCriterion("temp_message_receiver.recipient_del not in", values, "recipientDel");
            return (Criteria) this;
        }

        public Criteria andRecipientDelBetween(Boolean value1, Boolean value2) {
            addCriterion("temp_message_receiver.recipient_del between", value1, value2, "recipientDel");
            return (Criteria) this;
        }

        public Criteria andRecipientDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("temp_message_receiver.recipient_del not between", value1, value2, "recipientDel");
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