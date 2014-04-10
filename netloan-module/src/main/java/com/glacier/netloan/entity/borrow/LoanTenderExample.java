package com.glacier.netloan.entity.borrow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanTenderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public LoanTenderExample() {
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

        public Criteria andLoanTenderIdIsNull() {
            addCriterion("temp_loan_tender.loan_tender_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdIsNotNull() {
            addCriterion("temp_loan_tender.loan_tender_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_tender_id =", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_tender_id <>", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdGreaterThan(String value) {
            addCriterion("temp_loan_tender.loan_tender_id >", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_tender_id >=", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdLessThan(String value) {
            addCriterion("temp_loan_tender.loan_tender_id <", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_tender_id <=", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdLike(String value) {
            addCriterion("temp_loan_tender.loan_tender_id like", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotLike(String value) {
            addCriterion("temp_loan_tender.loan_tender_id not like", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdIn(List<String> values) {
            addCriterion("temp_loan_tender.loan_tender_id in", values, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotIn(List<String> values) {
            addCriterion("temp_loan_tender.loan_tender_id not in", values, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.loan_tender_id between", value1, value2, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.loan_tender_id not between", value1, value2, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameIsNull() {
            addCriterion("temp_loan_tender.loanr_tender_name is null");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameIsNotNull() {
            addCriterion("temp_loan_tender.loanr_tender_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameEqualTo(String value) {
            addCriterion("temp_loan_tender.loanr_tender_name =", value, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameNotEqualTo(String value) {
            addCriterion("temp_loan_tender.loanr_tender_name <>", value, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameGreaterThan(String value) {
            addCriterion("temp_loan_tender.loanr_tender_name >", value, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.loanr_tender_name >=", value, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameLessThan(String value) {
            addCriterion("temp_loan_tender.loanr_tender_name <", value, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.loanr_tender_name <=", value, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameLike(String value) {
            addCriterion("temp_loan_tender.loanr_tender_name like", value, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameNotLike(String value) {
            addCriterion("temp_loan_tender.loanr_tender_name not like", value, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameIn(List<String> values) {
            addCriterion("temp_loan_tender.loanr_tender_name in", values, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameNotIn(List<String> values) {
            addCriterion("temp_loan_tender.loanr_tender_name not in", values, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.loanr_tender_name between", value1, value2, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andLoanrTenderNameNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.loanr_tender_name not between", value1, value2, "loanrTenderName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("temp_loan_tender.description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("temp_loan_tender.description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("temp_loan_tender.description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("temp_loan_tender.description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("temp_loan_tender.description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("temp_loan_tender.description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("temp_loan_tender.description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("temp_loan_tender.description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("temp_loan_tender.description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("temp_loan_tender.description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("temp_loan_tender.state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("temp_loan_tender.state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("temp_loan_tender.state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("temp_loan_tender.state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("temp_loan_tender.state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("temp_loan_tender.state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("temp_loan_tender.state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("temp_loan_tender.state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("temp_loan_tender.state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("temp_loan_tender.state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountIsNull() {
            addCriterion("temp_loan_tender.lowest_loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountIsNotNull() {
            addCriterion("temp_loan_tender.lowest_loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_loan_amount =", value, "lowestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_loan_amount <>", value, "lowestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountGreaterThan(Float value) {
            addCriterion("temp_loan_tender.lowest_loan_amount >", value, "lowestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_loan_amount >=", value, "lowestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountLessThan(Float value) {
            addCriterion("temp_loan_tender.lowest_loan_amount <", value, "lowestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_loan_amount <=", value, "lowestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountIn(List<Float> values) {
            addCriterion("temp_loan_tender.lowest_loan_amount in", values, "lowestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.lowest_loan_amount not in", values, "lowestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.lowest_loan_amount between", value1, value2, "lowestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLowestLoanAmountNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.lowest_loan_amount not between", value1, value2, "lowestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountIsNull() {
            addCriterion("temp_loan_tender.largest_loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountIsNotNull() {
            addCriterion("temp_loan_tender.largest_loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_loan_amount =", value, "largestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_loan_amount <>", value, "largestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountGreaterThan(Float value) {
            addCriterion("temp_loan_tender.largest_loan_amount >", value, "largestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_loan_amount >=", value, "largestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountLessThan(Float value) {
            addCriterion("temp_loan_tender.largest_loan_amount <", value, "largestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_loan_amount <=", value, "largestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountIn(List<Float> values) {
            addCriterion("temp_loan_tender.largest_loan_amount in", values, "largestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.largest_loan_amount not in", values, "largestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.largest_loan_amount between", value1, value2, "largestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLargestLoanAmountNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.largest_loan_amount not between", value1, value2, "largestLoanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleIsNull() {
            addCriterion("temp_loan_tender.loan_money_multiple is null");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleIsNotNull() {
            addCriterion("temp_loan_tender.loan_money_multiple is not null");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_money_multiple =", value, "loanMoneyMultiple");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_money_multiple <>", value, "loanMoneyMultiple");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleGreaterThan(Float value) {
            addCriterion("temp_loan_tender.loan_money_multiple >", value, "loanMoneyMultiple");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_money_multiple >=", value, "loanMoneyMultiple");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleLessThan(Float value) {
            addCriterion("temp_loan_tender.loan_money_multiple <", value, "loanMoneyMultiple");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_money_multiple <=", value, "loanMoneyMultiple");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleIn(List<Float> values) {
            addCriterion("temp_loan_tender.loan_money_multiple in", values, "loanMoneyMultiple");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.loan_money_multiple not in", values, "loanMoneyMultiple");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.loan_money_multiple between", value1, value2, "loanMoneyMultiple");
            return (Criteria) this;
        }

        public Criteria andLoanMoneyMultipleNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.loan_money_multiple not between", value1, value2, "loanMoneyMultiple");
            return (Criteria) this;
        }

        public Criteria andLowestAprIsNull() {
            addCriterion("temp_loan_tender.lowest_apr is null");
            return (Criteria) this;
        }

        public Criteria andLowestAprIsNotNull() {
            addCriterion("temp_loan_tender.lowest_apr is not null");
            return (Criteria) this;
        }

        public Criteria andLowestAprEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_apr =", value, "lowestApr");
            return (Criteria) this;
        }

        public Criteria andLowestAprNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_apr <>", value, "lowestApr");
            return (Criteria) this;
        }

        public Criteria andLowestAprGreaterThan(Float value) {
            addCriterion("temp_loan_tender.lowest_apr >", value, "lowestApr");
            return (Criteria) this;
        }

        public Criteria andLowestAprGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_apr >=", value, "lowestApr");
            return (Criteria) this;
        }

        public Criteria andLowestAprLessThan(Float value) {
            addCriterion("temp_loan_tender.lowest_apr <", value, "lowestApr");
            return (Criteria) this;
        }

        public Criteria andLowestAprLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_apr <=", value, "lowestApr");
            return (Criteria) this;
        }

        public Criteria andLowestAprIn(List<Float> values) {
            addCriterion("temp_loan_tender.lowest_apr in", values, "lowestApr");
            return (Criteria) this;
        }

        public Criteria andLowestAprNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.lowest_apr not in", values, "lowestApr");
            return (Criteria) this;
        }

        public Criteria andLowestAprBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.lowest_apr between", value1, value2, "lowestApr");
            return (Criteria) this;
        }

        public Criteria andLowestAprNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.lowest_apr not between", value1, value2, "lowestApr");
            return (Criteria) this;
        }

        public Criteria andLargestAprIsNull() {
            addCriterion("temp_loan_tender.largest_apr is null");
            return (Criteria) this;
        }

        public Criteria andLargestAprIsNotNull() {
            addCriterion("temp_loan_tender.largest_apr is not null");
            return (Criteria) this;
        }

        public Criteria andLargestAprEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_apr =", value, "largestApr");
            return (Criteria) this;
        }

        public Criteria andLargestAprNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_apr <>", value, "largestApr");
            return (Criteria) this;
        }

        public Criteria andLargestAprGreaterThan(Float value) {
            addCriterion("temp_loan_tender.largest_apr >", value, "largestApr");
            return (Criteria) this;
        }

        public Criteria andLargestAprGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_apr >=", value, "largestApr");
            return (Criteria) this;
        }

        public Criteria andLargestAprLessThan(Float value) {
            addCriterion("temp_loan_tender.largest_apr <", value, "largestApr");
            return (Criteria) this;
        }

        public Criteria andLargestAprLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_apr <=", value, "largestApr");
            return (Criteria) this;
        }

        public Criteria andLargestAprIn(List<Float> values) {
            addCriterion("temp_loan_tender.largest_apr in", values, "largestApr");
            return (Criteria) this;
        }

        public Criteria andLargestAprNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.largest_apr not in", values, "largestApr");
            return (Criteria) this;
        }

        public Criteria andLargestAprBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.largest_apr between", value1, value2, "largestApr");
            return (Criteria) this;
        }

        public Criteria andLargestAprNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.largest_apr not between", value1, value2, "largestApr");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonIsNull() {
            addCriterion("temp_loan_tender.loan_deadlines_mon is null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonIsNotNull() {
            addCriterion("temp_loan_tender.loan_deadlines_mon is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_mon =", value, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonNotEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_mon <>", value, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonGreaterThan(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_mon >", value, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_mon >=", value, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonLessThan(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_mon <", value, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_mon <=", value, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonLike(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_mon like", value, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonNotLike(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_mon not like", value, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonIn(List<String> values) {
            addCriterion("temp_loan_tender.loan_deadlines_mon in", values, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonNotIn(List<String> values) {
            addCriterion("temp_loan_tender.loan_deadlines_mon not in", values, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.loan_deadlines_mon between", value1, value2, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesMonNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.loan_deadlines_mon not between", value1, value2, "loanDeadlinesMon");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayIsNull() {
            addCriterion("temp_loan_tender.loan_deadlines_day is null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayIsNotNull() {
            addCriterion("temp_loan_tender.loan_deadlines_day is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_day =", value, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayNotEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_day <>", value, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayGreaterThan(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_day >", value, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_day >=", value, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayLessThan(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_day <", value, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_day <=", value, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayLike(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_day like", value, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayNotLike(String value) {
            addCriterion("temp_loan_tender.loan_deadlines_day not like", value, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayIn(List<String> values) {
            addCriterion("temp_loan_tender.loan_deadlines_day in", values, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayNotIn(List<String> values) {
            addCriterion("temp_loan_tender.loan_deadlines_day not in", values, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.loan_deadlines_day between", value1, value2, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesDayNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.loan_deadlines_day not between", value1, value2, "loanDeadlinesDay");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesIsNull() {
            addCriterion("temp_loan_tender.wait_bid_deadlines is null");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesIsNotNull() {
            addCriterion("temp_loan_tender.wait_bid_deadlines is not null");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesEqualTo(String value) {
            addCriterion("temp_loan_tender.wait_bid_deadlines =", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesNotEqualTo(String value) {
            addCriterion("temp_loan_tender.wait_bid_deadlines <>", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesGreaterThan(String value) {
            addCriterion("temp_loan_tender.wait_bid_deadlines >", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.wait_bid_deadlines >=", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesLessThan(String value) {
            addCriterion("temp_loan_tender.wait_bid_deadlines <", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.wait_bid_deadlines <=", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesLike(String value) {
            addCriterion("temp_loan_tender.wait_bid_deadlines like", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesNotLike(String value) {
            addCriterion("temp_loan_tender.wait_bid_deadlines not like", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesIn(List<String> values) {
            addCriterion("temp_loan_tender.wait_bid_deadlines in", values, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesNotIn(List<String> values) {
            addCriterion("temp_loan_tender.wait_bid_deadlines not in", values, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.wait_bid_deadlines between", value1, value2, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.wait_bid_deadlines not between", value1, value2, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyIsNull() {
            addCriterion("temp_loan_tender.lowest_bid_money is null");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyIsNotNull() {
            addCriterion("temp_loan_tender.lowest_bid_money is not null");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyEqualTo(String value) {
            addCriterion("temp_loan_tender.lowest_bid_money =", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyNotEqualTo(String value) {
            addCriterion("temp_loan_tender.lowest_bid_money <>", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyGreaterThan(String value) {
            addCriterion("temp_loan_tender.lowest_bid_money >", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.lowest_bid_money >=", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyLessThan(String value) {
            addCriterion("temp_loan_tender.lowest_bid_money <", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.lowest_bid_money <=", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyLike(String value) {
            addCriterion("temp_loan_tender.lowest_bid_money like", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyNotLike(String value) {
            addCriterion("temp_loan_tender.lowest_bid_money not like", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyIn(List<String> values) {
            addCriterion("temp_loan_tender.lowest_bid_money in", values, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyNotIn(List<String> values) {
            addCriterion("temp_loan_tender.lowest_bid_money not in", values, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.lowest_bid_money between", value1, value2, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.lowest_bid_money not between", value1, value2, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyIsNull() {
            addCriterion("temp_loan_tender.largest_bid_money is null");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyIsNotNull() {
            addCriterion("temp_loan_tender.largest_bid_money is not null");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyEqualTo(String value) {
            addCriterion("temp_loan_tender.largest_bid_money =", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyNotEqualTo(String value) {
            addCriterion("temp_loan_tender.largest_bid_money <>", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyGreaterThan(String value) {
            addCriterion("temp_loan_tender.largest_bid_money >", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.largest_bid_money >=", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyLessThan(String value) {
            addCriterion("temp_loan_tender.largest_bid_money <", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.largest_bid_money <=", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyLike(String value) {
            addCriterion("temp_loan_tender.largest_bid_money like", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyNotLike(String value) {
            addCriterion("temp_loan_tender.largest_bid_money not like", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyIn(List<String> values) {
            addCriterion("temp_loan_tender.largest_bid_money in", values, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyNotIn(List<String> values) {
            addCriterion("temp_loan_tender.largest_bid_money not in", values, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.largest_bid_money between", value1, value2, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.largest_bid_money not between", value1, value2, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardIsNull() {
            addCriterion("temp_loan_tender.is_bid_reward is null");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardIsNotNull() {
            addCriterion("temp_loan_tender.is_bid_reward is not null");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardEqualTo(String value) {
            addCriterion("temp_loan_tender.is_bid_reward =", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardNotEqualTo(String value) {
            addCriterion("temp_loan_tender.is_bid_reward <>", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardGreaterThan(String value) {
            addCriterion("temp_loan_tender.is_bid_reward >", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.is_bid_reward >=", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardLessThan(String value) {
            addCriterion("temp_loan_tender.is_bid_reward <", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.is_bid_reward <=", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardLike(String value) {
            addCriterion("temp_loan_tender.is_bid_reward like", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardNotLike(String value) {
            addCriterion("temp_loan_tender.is_bid_reward not like", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardIn(List<String> values) {
            addCriterion("temp_loan_tender.is_bid_reward in", values, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardNotIn(List<String> values) {
            addCriterion("temp_loan_tender.is_bid_reward not in", values, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.is_bid_reward between", value1, value2, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.is_bid_reward not between", value1, value2, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdIsNull() {
            addCriterion("temp_loan_tender.is_bid_pwd is null");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdIsNotNull() {
            addCriterion("temp_loan_tender.is_bid_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdEqualTo(String value) {
            addCriterion("temp_loan_tender.is_bid_pwd =", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdNotEqualTo(String value) {
            addCriterion("temp_loan_tender.is_bid_pwd <>", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdGreaterThan(String value) {
            addCriterion("temp_loan_tender.is_bid_pwd >", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.is_bid_pwd >=", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdLessThan(String value) {
            addCriterion("temp_loan_tender.is_bid_pwd <", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.is_bid_pwd <=", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdLike(String value) {
            addCriterion("temp_loan_tender.is_bid_pwd like", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdNotLike(String value) {
            addCriterion("temp_loan_tender.is_bid_pwd not like", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdIn(List<String> values) {
            addCriterion("temp_loan_tender.is_bid_pwd in", values, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdNotIn(List<String> values) {
            addCriterion("temp_loan_tender.is_bid_pwd not in", values, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.is_bid_pwd between", value1, value2, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.is_bid_pwd not between", value1, value2, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProIsNull() {
            addCriterion("temp_loan_tender.lowest_reward_pro is null");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProIsNotNull() {
            addCriterion("temp_loan_tender.lowest_reward_pro is not null");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_pro =", value, "lowestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_pro <>", value, "lowestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProGreaterThan(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_pro >", value, "lowestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_pro >=", value, "lowestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProLessThan(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_pro <", value, "lowestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_pro <=", value, "lowestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProIn(List<Float> values) {
            addCriterion("temp_loan_tender.lowest_reward_pro in", values, "lowestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.lowest_reward_pro not in", values, "lowestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.lowest_reward_pro between", value1, value2, "lowestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLowestRewardProNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.lowest_reward_pro not between", value1, value2, "lowestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProIsNull() {
            addCriterion("temp_loan_tender.largest_reward_pro is null");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProIsNotNull() {
            addCriterion("temp_loan_tender.largest_reward_pro is not null");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_reward_pro =", value, "largestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_reward_pro <>", value, "largestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProGreaterThan(Float value) {
            addCriterion("temp_loan_tender.largest_reward_pro >", value, "largestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_reward_pro >=", value, "largestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProLessThan(Float value) {
            addCriterion("temp_loan_tender.largest_reward_pro <", value, "largestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_reward_pro <=", value, "largestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProIn(List<Float> values) {
            addCriterion("temp_loan_tender.largest_reward_pro in", values, "largestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.largest_reward_pro not in", values, "largestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.largest_reward_pro between", value1, value2, "largestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLargestRewardProNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.largest_reward_pro not between", value1, value2, "largestRewardPro");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyIsNull() {
            addCriterion("temp_loan_tender.lowest_reward_money is null");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyIsNotNull() {
            addCriterion("temp_loan_tender.lowest_reward_money is not null");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_money =", value, "lowestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_money <>", value, "lowestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyGreaterThan(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_money >", value, "lowestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_money >=", value, "lowestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyLessThan(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_money <", value, "lowestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.lowest_reward_money <=", value, "lowestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyIn(List<Float> values) {
            addCriterion("temp_loan_tender.lowest_reward_money in", values, "lowestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.lowest_reward_money not in", values, "lowestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.lowest_reward_money between", value1, value2, "lowestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLowestRewardMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.lowest_reward_money not between", value1, value2, "lowestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyIsNull() {
            addCriterion("temp_loan_tender.largest_reward_money is null");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyIsNotNull() {
            addCriterion("temp_loan_tender.largest_reward_money is not null");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_reward_money =", value, "largestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_reward_money <>", value, "largestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyGreaterThan(Float value) {
            addCriterion("temp_loan_tender.largest_reward_money >", value, "largestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_reward_money >=", value, "largestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyLessThan(Float value) {
            addCriterion("temp_loan_tender.largest_reward_money <", value, "largestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.largest_reward_money <=", value, "largestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyIn(List<Float> values) {
            addCriterion("temp_loan_tender.largest_reward_money in", values, "largestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.largest_reward_money not in", values, "largestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.largest_reward_money between", value1, value2, "largestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andLargestRewardMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.largest_reward_money not between", value1, value2, "largestRewardMoney");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailIsNull() {
            addCriterion("temp_loan_tender.vip_freeze_bail is null");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailIsNotNull() {
            addCriterion("temp_loan_tender.vip_freeze_bail is not null");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailEqualTo(Float value) {
            addCriterion("temp_loan_tender.vip_freeze_bail =", value, "vipFreezeBail");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.vip_freeze_bail <>", value, "vipFreezeBail");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailGreaterThan(Float value) {
            addCriterion("temp_loan_tender.vip_freeze_bail >", value, "vipFreezeBail");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.vip_freeze_bail >=", value, "vipFreezeBail");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailLessThan(Float value) {
            addCriterion("temp_loan_tender.vip_freeze_bail <", value, "vipFreezeBail");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.vip_freeze_bail <=", value, "vipFreezeBail");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailIn(List<Float> values) {
            addCriterion("temp_loan_tender.vip_freeze_bail in", values, "vipFreezeBail");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.vip_freeze_bail not in", values, "vipFreezeBail");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.vip_freeze_bail between", value1, value2, "vipFreezeBail");
            return (Criteria) this;
        }

        public Criteria andVipFreezeBailNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.vip_freeze_bail not between", value1, value2, "vipFreezeBail");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailIsNull() {
            addCriterion("temp_loan_tender.general_freeze_bail is null");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailIsNotNull() {
            addCriterion("temp_loan_tender.general_freeze_bail is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailEqualTo(Float value) {
            addCriterion("temp_loan_tender.general_freeze_bail =", value, "generalFreezeBail");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.general_freeze_bail <>", value, "generalFreezeBail");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailGreaterThan(Float value) {
            addCriterion("temp_loan_tender.general_freeze_bail >", value, "generalFreezeBail");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.general_freeze_bail >=", value, "generalFreezeBail");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailLessThan(Float value) {
            addCriterion("temp_loan_tender.general_freeze_bail <", value, "generalFreezeBail");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.general_freeze_bail <=", value, "generalFreezeBail");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailIn(List<Float> values) {
            addCriterion("temp_loan_tender.general_freeze_bail in", values, "generalFreezeBail");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.general_freeze_bail not in", values, "generalFreezeBail");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.general_freeze_bail between", value1, value2, "generalFreezeBail");
            return (Criteria) this;
        }

        public Criteria andGeneralFreezeBailNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.general_freeze_bail not between", value1, value2, "generalFreezeBail");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthIsNull() {
            addCriterion("temp_loan_tender.adv_over_month is null");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthIsNotNull() {
            addCriterion("temp_loan_tender.adv_over_month is not null");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthEqualTo(Float value) {
            addCriterion("temp_loan_tender.adv_over_month =", value, "advOverMonth");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.adv_over_month <>", value, "advOverMonth");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthGreaterThan(Float value) {
            addCriterion("temp_loan_tender.adv_over_month >", value, "advOverMonth");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.adv_over_month >=", value, "advOverMonth");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthLessThan(Float value) {
            addCriterion("temp_loan_tender.adv_over_month <", value, "advOverMonth");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.adv_over_month <=", value, "advOverMonth");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthIn(List<Float> values) {
            addCriterion("temp_loan_tender.adv_over_month in", values, "advOverMonth");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.adv_over_month not in", values, "advOverMonth");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.adv_over_month between", value1, value2, "advOverMonth");
            return (Criteria) this;
        }

        public Criteria andAdvOverMonthNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.adv_over_month not between", value1, value2, "advOverMonth");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayIsNull() {
            addCriterion("temp_loan_tender.adv_over_day is null");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayIsNotNull() {
            addCriterion("temp_loan_tender.adv_over_day is not null");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayEqualTo(Float value) {
            addCriterion("temp_loan_tender.adv_over_day =", value, "advOverDay");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.adv_over_day <>", value, "advOverDay");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayGreaterThan(Float value) {
            addCriterion("temp_loan_tender.adv_over_day >", value, "advOverDay");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.adv_over_day >=", value, "advOverDay");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayLessThan(Float value) {
            addCriterion("temp_loan_tender.adv_over_day <", value, "advOverDay");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.adv_over_day <=", value, "advOverDay");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayIn(List<Float> values) {
            addCriterion("temp_loan_tender.adv_over_day in", values, "advOverDay");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.adv_over_day not in", values, "advOverDay");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.adv_over_day between", value1, value2, "advOverDay");
            return (Criteria) this;
        }

        public Criteria andAdvOverDayNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.adv_over_day not between", value1, value2, "advOverDay");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthIsNull() {
            addCriterion("temp_loan_tender.loan_mana_fee_month is null");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthIsNotNull() {
            addCriterion("temp_loan_tender.loan_mana_fee_month is not null");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_month =", value, "loanManaFeeMonth");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_month <>", value, "loanManaFeeMonth");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthGreaterThan(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_month >", value, "loanManaFeeMonth");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_month >=", value, "loanManaFeeMonth");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthLessThan(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_month <", value, "loanManaFeeMonth");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_month <=", value, "loanManaFeeMonth");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthIn(List<Float> values) {
            addCriterion("temp_loan_tender.loan_mana_fee_month in", values, "loanManaFeeMonth");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.loan_mana_fee_month not in", values, "loanManaFeeMonth");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.loan_mana_fee_month between", value1, value2, "loanManaFeeMonth");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeMonthNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.loan_mana_fee_month not between", value1, value2, "loanManaFeeMonth");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayIsNull() {
            addCriterion("temp_loan_tender.loan_mana_fee_day is null");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayIsNotNull() {
            addCriterion("temp_loan_tender.loan_mana_fee_day is not null");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_day =", value, "loanManaFeeDay");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_day <>", value, "loanManaFeeDay");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayGreaterThan(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_day >", value, "loanManaFeeDay");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_day >=", value, "loanManaFeeDay");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayLessThan(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_day <", value, "loanManaFeeDay");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.loan_mana_fee_day <=", value, "loanManaFeeDay");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayIn(List<Float> values) {
            addCriterion("temp_loan_tender.loan_mana_fee_day in", values, "loanManaFeeDay");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.loan_mana_fee_day not in", values, "loanManaFeeDay");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.loan_mana_fee_day between", value1, value2, "loanManaFeeDay");
            return (Criteria) this;
        }

        public Criteria andLoanManaFeeDayNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.loan_mana_fee_day not between", value1, value2, "loanManaFeeDay");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsIsNull() {
            addCriterion("temp_loan_tender.limited_periods is null");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsIsNotNull() {
            addCriterion("temp_loan_tender.limited_periods is not null");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsEqualTo(Float value) {
            addCriterion("temp_loan_tender.limited_periods =", value, "limitedPeriods");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.limited_periods <>", value, "limitedPeriods");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsGreaterThan(Float value) {
            addCriterion("temp_loan_tender.limited_periods >", value, "limitedPeriods");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.limited_periods >=", value, "limitedPeriods");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsLessThan(Float value) {
            addCriterion("temp_loan_tender.limited_periods <", value, "limitedPeriods");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.limited_periods <=", value, "limitedPeriods");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsIn(List<Float> values) {
            addCriterion("temp_loan_tender.limited_periods in", values, "limitedPeriods");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.limited_periods not in", values, "limitedPeriods");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.limited_periods between", value1, value2, "limitedPeriods");
            return (Criteria) this;
        }

        public Criteria andLimitedPeriodsNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.limited_periods not between", value1, value2, "limitedPeriods");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeIsNull() {
            addCriterion("temp_loan_tender.over_limited_fee is null");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeIsNotNull() {
            addCriterion("temp_loan_tender.over_limited_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeEqualTo(Float value) {
            addCriterion("temp_loan_tender.over_limited_fee =", value, "overLimitedFee");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeNotEqualTo(Float value) {
            addCriterion("temp_loan_tender.over_limited_fee <>", value, "overLimitedFee");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeGreaterThan(Float value) {
            addCriterion("temp_loan_tender.over_limited_fee >", value, "overLimitedFee");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.over_limited_fee >=", value, "overLimitedFee");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeLessThan(Float value) {
            addCriterion("temp_loan_tender.over_limited_fee <", value, "overLimitedFee");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeLessThanOrEqualTo(Float value) {
            addCriterion("temp_loan_tender.over_limited_fee <=", value, "overLimitedFee");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeIn(List<Float> values) {
            addCriterion("temp_loan_tender.over_limited_fee in", values, "overLimitedFee");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeNotIn(List<Float> values) {
            addCriterion("temp_loan_tender.over_limited_fee not in", values, "overLimitedFee");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.over_limited_fee between", value1, value2, "overLimitedFee");
            return (Criteria) this;
        }

        public Criteria andOverLimitedFeeNotBetween(Float value1, Float value2) {
            addCriterion("temp_loan_tender.over_limited_fee not between", value1, value2, "overLimitedFee");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateIsNull() {
            addCriterion("temp_loan_tender.subscription_state is null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateIsNotNull() {
            addCriterion("temp_loan_tender.subscription_state is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateEqualTo(String value) {
            addCriterion("temp_loan_tender.subscription_state =", value, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateNotEqualTo(String value) {
            addCriterion("temp_loan_tender.subscription_state <>", value, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateGreaterThan(String value) {
            addCriterion("temp_loan_tender.subscription_state >", value, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.subscription_state >=", value, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateLessThan(String value) {
            addCriterion("temp_loan_tender.subscription_state <", value, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.subscription_state <=", value, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateLike(String value) {
            addCriterion("temp_loan_tender.subscription_state like", value, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateNotLike(String value) {
            addCriterion("temp_loan_tender.subscription_state not like", value, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateIn(List<String> values) {
            addCriterion("temp_loan_tender.subscription_state in", values, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateNotIn(List<String> values) {
            addCriterion("temp_loan_tender.subscription_state not in", values, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.subscription_state between", value1, value2, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andSubscriptionStateNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.subscription_state not between", value1, value2, "subscriptionState");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdIsNull() {
            addCriterion("temp_loan_tender.guarantee_agency_id is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdIsNotNull() {
            addCriterion("temp_loan_tender.guarantee_agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdEqualTo(String value) {
            addCriterion("temp_loan_tender.guarantee_agency_id =", value, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdNotEqualTo(String value) {
            addCriterion("temp_loan_tender.guarantee_agency_id <>", value, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdGreaterThan(String value) {
            addCriterion("temp_loan_tender.guarantee_agency_id >", value, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.guarantee_agency_id >=", value, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdLessThan(String value) {
            addCriterion("temp_loan_tender.guarantee_agency_id <", value, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.guarantee_agency_id <=", value, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdLike(String value) {
            addCriterion("temp_loan_tender.guarantee_agency_id like", value, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdNotLike(String value) {
            addCriterion("temp_loan_tender.guarantee_agency_id not like", value, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdIn(List<String> values) {
            addCriterion("temp_loan_tender.guarantee_agency_id in", values, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdNotIn(List<String> values) {
            addCriterion("temp_loan_tender.guarantee_agency_id not in", values, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.guarantee_agency_id between", value1, value2, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIdNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.guarantee_agency_id not between", value1, value2, "guaranteeAgencyId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdIsNull() {
            addCriterion("temp_loan_tender.anti_guarantee_id is null");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdIsNotNull() {
            addCriterion("temp_loan_tender.anti_guarantee_id is not null");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdEqualTo(String value) {
            addCriterion("temp_loan_tender.anti_guarantee_id =", value, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdNotEqualTo(String value) {
            addCriterion("temp_loan_tender.anti_guarantee_id <>", value, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdGreaterThan(String value) {
            addCriterion("temp_loan_tender.anti_guarantee_id >", value, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.anti_guarantee_id >=", value, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdLessThan(String value) {
            addCriterion("temp_loan_tender.anti_guarantee_id <", value, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.anti_guarantee_id <=", value, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdLike(String value) {
            addCriterion("temp_loan_tender.anti_guarantee_id like", value, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdNotLike(String value) {
            addCriterion("temp_loan_tender.anti_guarantee_id not like", value, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdIn(List<String> values) {
            addCriterion("temp_loan_tender.anti_guarantee_id in", values, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdNotIn(List<String> values) {
            addCriterion("temp_loan_tender.anti_guarantee_id not in", values, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.anti_guarantee_id between", value1, value2, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andAntiGuaranteeIdNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.anti_guarantee_id not between", value1, value2, "antiGuaranteeId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_loan_tender.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_loan_tender.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_loan_tender.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_loan_tender.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_loan_tender.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_loan_tender.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_loan_tender.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_loan_tender.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_loan_tender.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_loan_tender.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_loan_tender.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_loan_tender.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_loan_tender.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_loan_tender.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_loan_tender.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_loan_tender.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_loan_tender.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_loan_tender.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_loan_tender.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_loan_tender.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_loan_tender.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_loan_tender.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_loan_tender.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_loan_tender.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_loan_tender.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_loan_tender.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_loan_tender.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_loan_tender.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_loan_tender.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_loan_tender.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_loan_tender.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_loan_tender.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_loan_tender.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_loan_tender.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_loan_tender.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_loan_tender.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_loan_tender.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_loan_tender.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_loan_tender.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_loan_tender.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_loan_tender.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_loan_tender.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_loan_tender.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_loan_tender.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_loan_tender.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_loan_tender.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_loan_tender.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_loan_tender.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_loan_tender.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_loan_tender.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_loan_tender.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_loan_tender.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_loan_tender.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_loan_tender.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_loan_tender.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_loan_tender.update_time not between", value1, value2, "updateTime");
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