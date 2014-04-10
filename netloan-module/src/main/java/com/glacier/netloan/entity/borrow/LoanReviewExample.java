package com.glacier.netloan.entity.borrow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public LoanReviewExample() {
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

        public Criteria andLoanReviewIdIsNull() {
            addCriterion("temp_loan_review.loan_review_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdIsNotNull() {
            addCriterion("temp_loan_review.loan_review_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdEqualTo(String value) {
            addCriterion("temp_loan_review.loan_review_id =", value, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdNotEqualTo(String value) {
            addCriterion("temp_loan_review.loan_review_id <>", value, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdGreaterThan(String value) {
            addCriterion("temp_loan_review.loan_review_id >", value, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_review.loan_review_id >=", value, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdLessThan(String value) {
            addCriterion("temp_loan_review.loan_review_id <", value, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_review.loan_review_id <=", value, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdLike(String value) {
            addCriterion("temp_loan_review.loan_review_id like", value, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdNotLike(String value) {
            addCriterion("temp_loan_review.loan_review_id not like", value, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdIn(List<String> values) {
            addCriterion("temp_loan_review.loan_review_id in", values, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdNotIn(List<String> values) {
            addCriterion("temp_loan_review.loan_review_id not in", values, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdBetween(String value1, String value2) {
            addCriterion("temp_loan_review.loan_review_id between", value1, value2, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanReviewIdNotBetween(String value1, String value2) {
            addCriterion("temp_loan_review.loan_review_id not between", value1, value2, "loanReviewId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNull() {
            addCriterion("temp_loan_review.loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("temp_loan_review.loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(String value) {
            addCriterion("temp_loan_review.loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(String value) {
            addCriterion("temp_loan_review.loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(String value) {
            addCriterion("temp_loan_review.loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_review.loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(String value) {
            addCriterion("temp_loan_review.loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_review.loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLike(String value) {
            addCriterion("temp_loan_review.loan_id like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotLike(String value) {
            addCriterion("temp_loan_review.loan_id not like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<String> values) {
            addCriterion("temp_loan_review.loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<String> values) {
            addCriterion("temp_loan_review.loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(String value1, String value2) {
            addCriterion("temp_loan_review.loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(String value1, String value2) {
            addCriterion("temp_loan_review.loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andReviewContentIsNull() {
            addCriterion("temp_loan_review.review_content is null");
            return (Criteria) this;
        }

        public Criteria andReviewContentIsNotNull() {
            addCriterion("temp_loan_review.review_content is not null");
            return (Criteria) this;
        }

        public Criteria andReviewContentEqualTo(String value) {
            addCriterion("temp_loan_review.review_content =", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentNotEqualTo(String value) {
            addCriterion("temp_loan_review.review_content <>", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentGreaterThan(String value) {
            addCriterion("temp_loan_review.review_content >", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_review.review_content >=", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentLessThan(String value) {
            addCriterion("temp_loan_review.review_content <", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_review.review_content <=", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentLike(String value) {
            addCriterion("temp_loan_review.review_content like", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentNotLike(String value) {
            addCriterion("temp_loan_review.review_content not like", value, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentIn(List<String> values) {
            addCriterion("temp_loan_review.review_content in", values, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentNotIn(List<String> values) {
            addCriterion("temp_loan_review.review_content not in", values, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentBetween(String value1, String value2) {
            addCriterion("temp_loan_review.review_content between", value1, value2, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andReviewContentNotBetween(String value1, String value2) {
            addCriterion("temp_loan_review.review_content not between", value1, value2, "reviewContent");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_loan_review.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_loan_review.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_loan_review.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_loan_review.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_loan_review.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_review.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_loan_review.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_review.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_loan_review.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_loan_review.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_loan_review.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_loan_review.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_loan_review.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_loan_review.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_loan_review.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_loan_review.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_loan_review.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_loan_review.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_loan_review.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_review.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_loan_review.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_review.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_loan_review.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_loan_review.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_loan_review.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_loan_review.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_loan_review.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_loan_review.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_loan_review.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_loan_review.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_loan_review.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_loan_review.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_loan_review.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_loan_review.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_loan_review.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_loan_review.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_loan_review.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_loan_review.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_loan_review.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_loan_review.create_time not between", value1, value2, "createTime");
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