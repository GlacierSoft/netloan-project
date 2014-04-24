package com.glacier.netloan.entity.borrow;

import java.util.ArrayList;
import java.util.List;

public class TenderRepaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public TenderRepaymentExample() {
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

        public Criteria andRepaymentTypeIdIsNull() {
            addCriterion("temp_tender_repayment.repayment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdIsNotNull() {
            addCriterion("temp_tender_repayment.repayment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdEqualTo(String value) {
            addCriterion("temp_tender_repayment.repayment_type_id =", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotEqualTo(String value) {
            addCriterion("temp_tender_repayment.repayment_type_id <>", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdGreaterThan(String value) {
            addCriterion("temp_tender_repayment.repayment_type_id >", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_tender_repayment.repayment_type_id >=", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdLessThan(String value) {
            addCriterion("temp_tender_repayment.repayment_type_id <", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_tender_repayment.repayment_type_id <=", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdLike(String value) {
            addCriterion("temp_tender_repayment.repayment_type_id like", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotLike(String value) {
            addCriterion("temp_tender_repayment.repayment_type_id not like", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdIn(List<String> values) {
            addCriterion("temp_tender_repayment.repayment_type_id in", values, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotIn(List<String> values) {
            addCriterion("temp_tender_repayment.repayment_type_id not in", values, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdBetween(String value1, String value2) {
            addCriterion("temp_tender_repayment.repayment_type_id between", value1, value2, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_tender_repayment.repayment_type_id not between", value1, value2, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdIsNull() {
            addCriterion("temp_tender_repayment.loan_tender_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdIsNotNull() {
            addCriterion("temp_tender_repayment.loan_tender_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdEqualTo(String value) {
            addCriterion("temp_tender_repayment.loan_tender_id =", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotEqualTo(String value) {
            addCriterion("temp_tender_repayment.loan_tender_id <>", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdGreaterThan(String value) {
            addCriterion("temp_tender_repayment.loan_tender_id >", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_tender_repayment.loan_tender_id >=", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdLessThan(String value) {
            addCriterion("temp_tender_repayment.loan_tender_id <", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdLessThanOrEqualTo(String value) {
            addCriterion("temp_tender_repayment.loan_tender_id <=", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdLike(String value) {
            addCriterion("temp_tender_repayment.loan_tender_id like", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotLike(String value) {
            addCriterion("temp_tender_repayment.loan_tender_id not like", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdIn(List<String> values) {
            addCriterion("temp_tender_repayment.loan_tender_id in", values, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotIn(List<String> values) {
            addCriterion("temp_tender_repayment.loan_tender_id not in", values, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdBetween(String value1, String value2) {
            addCriterion("temp_tender_repayment.loan_tender_id between", value1, value2, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotBetween(String value1, String value2) {
            addCriterion("temp_tender_repayment.loan_tender_id not between", value1, value2, "loanTenderId");
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