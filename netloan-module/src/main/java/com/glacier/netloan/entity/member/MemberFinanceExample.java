package com.glacier.netloan.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberFinanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberFinanceExample() {
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

        public Criteria andMemberFinanceIdIsNull() {
            addCriterion("temp_member_finance.member_finance_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdIsNotNull() {
            addCriterion("temp_member_finance.member_finance_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdEqualTo(String value) {
            addCriterion("temp_member_finance.member_finance_id =", value, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdNotEqualTo(String value) {
            addCriterion("temp_member_finance.member_finance_id <>", value, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdGreaterThan(String value) {
            addCriterion("temp_member_finance.member_finance_id >", value, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.member_finance_id >=", value, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdLessThan(String value) {
            addCriterion("temp_member_finance.member_finance_id <", value, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.member_finance_id <=", value, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdLike(String value) {
            addCriterion("temp_member_finance.member_finance_id like", value, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdNotLike(String value) {
            addCriterion("temp_member_finance.member_finance_id not like", value, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdIn(List<String> values) {
            addCriterion("temp_member_finance.member_finance_id in", values, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdNotIn(List<String> values) {
            addCriterion("temp_member_finance.member_finance_id not in", values, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdBetween(String value1, String value2) {
            addCriterion("temp_member_finance.member_finance_id between", value1, value2, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberFinanceIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.member_finance_id not between", value1, value2, "memberFinanceId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdIsNull() {
            addCriterion("temp_member_finance.member_estate_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdIsNotNull() {
            addCriterion("temp_member_finance.member_estate_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdEqualTo(String value) {
            addCriterion("temp_member_finance.member_estate_id =", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdNotEqualTo(String value) {
            addCriterion("temp_member_finance.member_estate_id <>", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdGreaterThan(String value) {
            addCriterion("temp_member_finance.member_estate_id >", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.member_estate_id >=", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdLessThan(String value) {
            addCriterion("temp_member_finance.member_estate_id <", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.member_estate_id <=", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdLike(String value) {
            addCriterion("temp_member_finance.member_estate_id like", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdNotLike(String value) {
            addCriterion("temp_member_finance.member_estate_id not like", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdIn(List<String> values) {
            addCriterion("temp_member_finance.member_estate_id in", values, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdNotIn(List<String> values) {
            addCriterion("temp_member_finance.member_estate_id not in", values, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdBetween(String value1, String value2) {
            addCriterion("temp_member_finance.member_estate_id between", value1, value2, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.member_estate_id not between", value1, value2, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_member_finance.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member_finance.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member_finance.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member_finance.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member_finance.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member_finance.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member_finance.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member_finance.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member_finance.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member_finance.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member_finance.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andAveIncomeIsNull() {
            addCriterion("temp_member_finance.ave_income is null");
            return (Criteria) this;
        }

        public Criteria andAveIncomeIsNotNull() {
            addCriterion("temp_member_finance.ave_income is not null");
            return (Criteria) this;
        }

        public Criteria andAveIncomeEqualTo(Float value) {
            addCriterion("temp_member_finance.ave_income =", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeNotEqualTo(Float value) {
            addCriterion("temp_member_finance.ave_income <>", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeGreaterThan(Float value) {
            addCriterion("temp_member_finance.ave_income >", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_finance.ave_income >=", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeLessThan(Float value) {
            addCriterion("temp_member_finance.ave_income <", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_finance.ave_income <=", value, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeIn(List<Float> values) {
            addCriterion("temp_member_finance.ave_income in", values, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeNotIn(List<Float> values) {
            addCriterion("temp_member_finance.ave_income not in", values, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeBetween(Float value1, Float value2) {
            addCriterion("temp_member_finance.ave_income between", value1, value2, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_finance.ave_income not between", value1, value2, "aveIncome");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionIsNull() {
            addCriterion("temp_member_finance.ave_income_description is null");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionIsNotNull() {
            addCriterion("temp_member_finance.ave_income_description is not null");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionEqualTo(String value) {
            addCriterion("temp_member_finance.ave_income_description =", value, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionNotEqualTo(String value) {
            addCriterion("temp_member_finance.ave_income_description <>", value, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionGreaterThan(String value) {
            addCriterion("temp_member_finance.ave_income_description >", value, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.ave_income_description >=", value, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionLessThan(String value) {
            addCriterion("temp_member_finance.ave_income_description <", value, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.ave_income_description <=", value, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionLike(String value) {
            addCriterion("temp_member_finance.ave_income_description like", value, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionNotLike(String value) {
            addCriterion("temp_member_finance.ave_income_description not like", value, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionIn(List<String> values) {
            addCriterion("temp_member_finance.ave_income_description in", values, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionNotIn(List<String> values) {
            addCriterion("temp_member_finance.ave_income_description not in", values, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionBetween(String value1, String value2) {
            addCriterion("temp_member_finance.ave_income_description between", value1, value2, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDescriptionNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.ave_income_description not between", value1, value2, "aveIncomeDescription");
            return (Criteria) this;
        }

        public Criteria andAveExpensesIsNull() {
            addCriterion("temp_member_finance.ave_expenses is null");
            return (Criteria) this;
        }

        public Criteria andAveExpensesIsNotNull() {
            addCriterion("temp_member_finance.ave_expenses is not null");
            return (Criteria) this;
        }

        public Criteria andAveExpensesEqualTo(Float value) {
            addCriterion("temp_member_finance.ave_expenses =", value, "aveExpenses");
            return (Criteria) this;
        }

        public Criteria andAveExpensesNotEqualTo(Float value) {
            addCriterion("temp_member_finance.ave_expenses <>", value, "aveExpenses");
            return (Criteria) this;
        }

        public Criteria andAveExpensesGreaterThan(Float value) {
            addCriterion("temp_member_finance.ave_expenses >", value, "aveExpenses");
            return (Criteria) this;
        }

        public Criteria andAveExpensesGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_finance.ave_expenses >=", value, "aveExpenses");
            return (Criteria) this;
        }

        public Criteria andAveExpensesLessThan(Float value) {
            addCriterion("temp_member_finance.ave_expenses <", value, "aveExpenses");
            return (Criteria) this;
        }

        public Criteria andAveExpensesLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_finance.ave_expenses <=", value, "aveExpenses");
            return (Criteria) this;
        }

        public Criteria andAveExpensesIn(List<Float> values) {
            addCriterion("temp_member_finance.ave_expenses in", values, "aveExpenses");
            return (Criteria) this;
        }

        public Criteria andAveExpensesNotIn(List<Float> values) {
            addCriterion("temp_member_finance.ave_expenses not in", values, "aveExpenses");
            return (Criteria) this;
        }

        public Criteria andAveExpensesBetween(Float value1, Float value2) {
            addCriterion("temp_member_finance.ave_expenses between", value1, value2, "aveExpenses");
            return (Criteria) this;
        }

        public Criteria andAveExpensesNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_finance.ave_expenses not between", value1, value2, "aveExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionIsNull() {
            addCriterion("temp_member_finance.age_expenses_description is null");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionIsNotNull() {
            addCriterion("temp_member_finance.age_expenses_description is not null");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionEqualTo(String value) {
            addCriterion("temp_member_finance.age_expenses_description =", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionNotEqualTo(String value) {
            addCriterion("temp_member_finance.age_expenses_description <>", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionGreaterThan(String value) {
            addCriterion("temp_member_finance.age_expenses_description >", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.age_expenses_description >=", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionLessThan(String value) {
            addCriterion("temp_member_finance.age_expenses_description <", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.age_expenses_description <=", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionLike(String value) {
            addCriterion("temp_member_finance.age_expenses_description like", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionNotLike(String value) {
            addCriterion("temp_member_finance.age_expenses_description not like", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionIn(List<String> values) {
            addCriterion("temp_member_finance.age_expenses_description in", values, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionNotIn(List<String> values) {
            addCriterion("temp_member_finance.age_expenses_description not in", values, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionBetween(String value1, String value2) {
            addCriterion("temp_member_finance.age_expenses_description between", value1, value2, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.age_expenses_description not between", value1, value2, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andBuyEstateIsNull() {
            addCriterion("temp_member_finance.buy_estate is null");
            return (Criteria) this;
        }

        public Criteria andBuyEstateIsNotNull() {
            addCriterion("temp_member_finance.buy_estate is not null");
            return (Criteria) this;
        }

        public Criteria andBuyEstateEqualTo(String value) {
            addCriterion("temp_member_finance.buy_estate =", value, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andBuyEstateNotEqualTo(String value) {
            addCriterion("temp_member_finance.buy_estate <>", value, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andBuyEstateGreaterThan(String value) {
            addCriterion("temp_member_finance.buy_estate >", value, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andBuyEstateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.buy_estate >=", value, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andBuyEstateLessThan(String value) {
            addCriterion("temp_member_finance.buy_estate <", value, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andBuyEstateLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.buy_estate <=", value, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andBuyEstateLike(String value) {
            addCriterion("temp_member_finance.buy_estate like", value, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andBuyEstateNotLike(String value) {
            addCriterion("temp_member_finance.buy_estate not like", value, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andBuyEstateIn(List<String> values) {
            addCriterion("temp_member_finance.buy_estate in", values, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andBuyEstateNotIn(List<String> values) {
            addCriterion("temp_member_finance.buy_estate not in", values, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andBuyEstateBetween(String value1, String value2) {
            addCriterion("temp_member_finance.buy_estate between", value1, value2, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andBuyEstateNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.buy_estate not between", value1, value2, "buyEstate");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsIsNull() {
            addCriterion("temp_member_finance.housing_conditions is null");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsIsNotNull() {
            addCriterion("temp_member_finance.housing_conditions is not null");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsEqualTo(String value) {
            addCriterion("temp_member_finance.housing_conditions =", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsNotEqualTo(String value) {
            addCriterion("temp_member_finance.housing_conditions <>", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsGreaterThan(String value) {
            addCriterion("temp_member_finance.housing_conditions >", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.housing_conditions >=", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsLessThan(String value) {
            addCriterion("temp_member_finance.housing_conditions <", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.housing_conditions <=", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsLike(String value) {
            addCriterion("temp_member_finance.housing_conditions like", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsNotLike(String value) {
            addCriterion("temp_member_finance.housing_conditions not like", value, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsIn(List<String> values) {
            addCriterion("temp_member_finance.housing_conditions in", values, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsNotIn(List<String> values) {
            addCriterion("temp_member_finance.housing_conditions not in", values, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsBetween(String value1, String value2) {
            addCriterion("temp_member_finance.housing_conditions between", value1, value2, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andHousingConditionsNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.housing_conditions not between", value1, value2, "housingConditions");
            return (Criteria) this;
        }

        public Criteria andEstateValueIsNull() {
            addCriterion("temp_member_finance.estate_value is null");
            return (Criteria) this;
        }

        public Criteria andEstateValueIsNotNull() {
            addCriterion("temp_member_finance.estate_value is not null");
            return (Criteria) this;
        }

        public Criteria andEstateValueEqualTo(Float value) {
            addCriterion("temp_member_finance.estate_value =", value, "estateValue");
            return (Criteria) this;
        }

        public Criteria andEstateValueNotEqualTo(Float value) {
            addCriterion("temp_member_finance.estate_value <>", value, "estateValue");
            return (Criteria) this;
        }

        public Criteria andEstateValueGreaterThan(Float value) {
            addCriterion("temp_member_finance.estate_value >", value, "estateValue");
            return (Criteria) this;
        }

        public Criteria andEstateValueGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_finance.estate_value >=", value, "estateValue");
            return (Criteria) this;
        }

        public Criteria andEstateValueLessThan(Float value) {
            addCriterion("temp_member_finance.estate_value <", value, "estateValue");
            return (Criteria) this;
        }

        public Criteria andEstateValueLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_finance.estate_value <=", value, "estateValue");
            return (Criteria) this;
        }

        public Criteria andEstateValueIn(List<Float> values) {
            addCriterion("temp_member_finance.estate_value in", values, "estateValue");
            return (Criteria) this;
        }

        public Criteria andEstateValueNotIn(List<Float> values) {
            addCriterion("temp_member_finance.estate_value not in", values, "estateValue");
            return (Criteria) this;
        }

        public Criteria andEstateValueBetween(Float value1, Float value2) {
            addCriterion("temp_member_finance.estate_value between", value1, value2, "estateValue");
            return (Criteria) this;
        }

        public Criteria andEstateValueNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_finance.estate_value not between", value1, value2, "estateValue");
            return (Criteria) this;
        }

        public Criteria andBuyCatIsNull() {
            addCriterion("temp_member_finance.buy_cat is null");
            return (Criteria) this;
        }

        public Criteria andBuyCatIsNotNull() {
            addCriterion("temp_member_finance.buy_cat is not null");
            return (Criteria) this;
        }

        public Criteria andBuyCatEqualTo(String value) {
            addCriterion("temp_member_finance.buy_cat =", value, "buyCat");
            return (Criteria) this;
        }

        public Criteria andBuyCatNotEqualTo(String value) {
            addCriterion("temp_member_finance.buy_cat <>", value, "buyCat");
            return (Criteria) this;
        }

        public Criteria andBuyCatGreaterThan(String value) {
            addCriterion("temp_member_finance.buy_cat >", value, "buyCat");
            return (Criteria) this;
        }

        public Criteria andBuyCatGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.buy_cat >=", value, "buyCat");
            return (Criteria) this;
        }

        public Criteria andBuyCatLessThan(String value) {
            addCriterion("temp_member_finance.buy_cat <", value, "buyCat");
            return (Criteria) this;
        }

        public Criteria andBuyCatLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.buy_cat <=", value, "buyCat");
            return (Criteria) this;
        }

        public Criteria andBuyCatLike(String value) {
            addCriterion("temp_member_finance.buy_cat like", value, "buyCat");
            return (Criteria) this;
        }

        public Criteria andBuyCatNotLike(String value) {
            addCriterion("temp_member_finance.buy_cat not like", value, "buyCat");
            return (Criteria) this;
        }

        public Criteria andBuyCatIn(List<String> values) {
            addCriterion("temp_member_finance.buy_cat in", values, "buyCat");
            return (Criteria) this;
        }

        public Criteria andBuyCatNotIn(List<String> values) {
            addCriterion("temp_member_finance.buy_cat not in", values, "buyCat");
            return (Criteria) this;
        }

        public Criteria andBuyCatBetween(String value1, String value2) {
            addCriterion("temp_member_finance.buy_cat between", value1, value2, "buyCat");
            return (Criteria) this;
        }

        public Criteria andBuyCatNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.buy_cat not between", value1, value2, "buyCat");
            return (Criteria) this;
        }

        public Criteria andCatValueIsNull() {
            addCriterion("temp_member_finance.cat_value is null");
            return (Criteria) this;
        }

        public Criteria andCatValueIsNotNull() {
            addCriterion("temp_member_finance.cat_value is not null");
            return (Criteria) this;
        }

        public Criteria andCatValueEqualTo(Float value) {
            addCriterion("temp_member_finance.cat_value =", value, "catValue");
            return (Criteria) this;
        }

        public Criteria andCatValueNotEqualTo(Float value) {
            addCriterion("temp_member_finance.cat_value <>", value, "catValue");
            return (Criteria) this;
        }

        public Criteria andCatValueGreaterThan(Float value) {
            addCriterion("temp_member_finance.cat_value >", value, "catValue");
            return (Criteria) this;
        }

        public Criteria andCatValueGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_finance.cat_value >=", value, "catValue");
            return (Criteria) this;
        }

        public Criteria andCatValueLessThan(Float value) {
            addCriterion("temp_member_finance.cat_value <", value, "catValue");
            return (Criteria) this;
        }

        public Criteria andCatValueLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_finance.cat_value <=", value, "catValue");
            return (Criteria) this;
        }

        public Criteria andCatValueIn(List<Float> values) {
            addCriterion("temp_member_finance.cat_value in", values, "catValue");
            return (Criteria) this;
        }

        public Criteria andCatValueNotIn(List<Float> values) {
            addCriterion("temp_member_finance.cat_value not in", values, "catValue");
            return (Criteria) this;
        }

        public Criteria andCatValueBetween(Float value1, Float value2) {
            addCriterion("temp_member_finance.cat_value between", value1, value2, "catValue");
            return (Criteria) this;
        }

        public Criteria andCatValueNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_finance.cat_value not between", value1, value2, "catValue");
            return (Criteria) this;
        }

        public Criteria andCatAuthIsNull() {
            addCriterion("temp_member_finance.cat_auth is null");
            return (Criteria) this;
        }

        public Criteria andCatAuthIsNotNull() {
            addCriterion("temp_member_finance.cat_auth is not null");
            return (Criteria) this;
        }

        public Criteria andCatAuthEqualTo(String value) {
            addCriterion("temp_member_finance.cat_auth =", value, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCatAuthNotEqualTo(String value) {
            addCriterion("temp_member_finance.cat_auth <>", value, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCatAuthGreaterThan(String value) {
            addCriterion("temp_member_finance.cat_auth >", value, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCatAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.cat_auth >=", value, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCatAuthLessThan(String value) {
            addCriterion("temp_member_finance.cat_auth <", value, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCatAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.cat_auth <=", value, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCatAuthLike(String value) {
            addCriterion("temp_member_finance.cat_auth like", value, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCatAuthNotLike(String value) {
            addCriterion("temp_member_finance.cat_auth not like", value, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCatAuthIn(List<String> values) {
            addCriterion("temp_member_finance.cat_auth in", values, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCatAuthNotIn(List<String> values) {
            addCriterion("temp_member_finance.cat_auth not in", values, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCatAuthBetween(String value1, String value2) {
            addCriterion("temp_member_finance.cat_auth between", value1, value2, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCatAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.cat_auth not between", value1, value2, "catAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("temp_member_finance.company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("temp_member_finance.company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("temp_member_finance.company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("temp_member_finance.company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("temp_member_finance.company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("temp_member_finance.company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("temp_member_finance.company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("temp_member_finance.company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("temp_member_finance.company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("temp_member_finance.company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("temp_member_finance.company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConIsNull() {
            addCriterion("temp_member_finance.companies_capital_con is null");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConIsNotNull() {
            addCriterion("temp_member_finance.companies_capital_con is not null");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConEqualTo(String value) {
            addCriterion("temp_member_finance.companies_capital_con =", value, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConNotEqualTo(String value) {
            addCriterion("temp_member_finance.companies_capital_con <>", value, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConGreaterThan(String value) {
            addCriterion("temp_member_finance.companies_capital_con >", value, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.companies_capital_con >=", value, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConLessThan(String value) {
            addCriterion("temp_member_finance.companies_capital_con <", value, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.companies_capital_con <=", value, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConLike(String value) {
            addCriterion("temp_member_finance.companies_capital_con like", value, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConNotLike(String value) {
            addCriterion("temp_member_finance.companies_capital_con not like", value, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConIn(List<String> values) {
            addCriterion("temp_member_finance.companies_capital_con in", values, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConNotIn(List<String> values) {
            addCriterion("temp_member_finance.companies_capital_con not in", values, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConBetween(String value1, String value2) {
            addCriterion("temp_member_finance.companies_capital_con between", value1, value2, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andCompaniesCapitalConNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.companies_capital_con not between", value1, value2, "companiesCapitalCon");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedIsNull() {
            addCriterion("temp_member_finance.other_assets_described is null");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedIsNotNull() {
            addCriterion("temp_member_finance.other_assets_described is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedEqualTo(String value) {
            addCriterion("temp_member_finance.other_assets_described =", value, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedNotEqualTo(String value) {
            addCriterion("temp_member_finance.other_assets_described <>", value, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedGreaterThan(String value) {
            addCriterion("temp_member_finance.other_assets_described >", value, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.other_assets_described >=", value, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedLessThan(String value) {
            addCriterion("temp_member_finance.other_assets_described <", value, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.other_assets_described <=", value, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedLike(String value) {
            addCriterion("temp_member_finance.other_assets_described like", value, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedNotLike(String value) {
            addCriterion("temp_member_finance.other_assets_described not like", value, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedIn(List<String> values) {
            addCriterion("temp_member_finance.other_assets_described in", values, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedNotIn(List<String> values) {
            addCriterion("temp_member_finance.other_assets_described not in", values, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedBetween(String value1, String value2) {
            addCriterion("temp_member_finance.other_assets_described between", value1, value2, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andOtherAssetsDescribedNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.other_assets_described not between", value1, value2, "otherAssetsDescribed");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedIsNull() {
            addCriterion("temp_member_finance.first_united is null");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedIsNotNull() {
            addCriterion("temp_member_finance.first_united is not null");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedEqualTo(String value) {
            addCriterion("temp_member_finance.first_united =", value, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedNotEqualTo(String value) {
            addCriterion("temp_member_finance.first_united <>", value, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedGreaterThan(String value) {
            addCriterion("temp_member_finance.first_united >", value, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.first_united >=", value, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedLessThan(String value) {
            addCriterion("temp_member_finance.first_united <", value, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.first_united <=", value, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedLike(String value) {
            addCriterion("temp_member_finance.first_united like", value, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedNotLike(String value) {
            addCriterion("temp_member_finance.first_united not like", value, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedIn(List<String> values) {
            addCriterion("temp_member_finance.first_united in", values, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedNotIn(List<String> values) {
            addCriterion("temp_member_finance.first_united not in", values, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedBetween(String value1, String value2) {
            addCriterion("temp_member_finance.first_united between", value1, value2, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.first_united not between", value1, value2, "firstUnited");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactIsNull() {
            addCriterion("temp_member_finance.first_united_contact is null");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactIsNotNull() {
            addCriterion("temp_member_finance.first_united_contact is not null");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactEqualTo(String value) {
            addCriterion("temp_member_finance.first_united_contact =", value, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactNotEqualTo(String value) {
            addCriterion("temp_member_finance.first_united_contact <>", value, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactGreaterThan(String value) {
            addCriterion("temp_member_finance.first_united_contact >", value, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.first_united_contact >=", value, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactLessThan(String value) {
            addCriterion("temp_member_finance.first_united_contact <", value, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.first_united_contact <=", value, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactLike(String value) {
            addCriterion("temp_member_finance.first_united_contact like", value, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactNotLike(String value) {
            addCriterion("temp_member_finance.first_united_contact not like", value, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactIn(List<String> values) {
            addCriterion("temp_member_finance.first_united_contact in", values, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactNotIn(List<String> values) {
            addCriterion("temp_member_finance.first_united_contact not in", values, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactBetween(String value1, String value2) {
            addCriterion("temp_member_finance.first_united_contact between", value1, value2, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedContactNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.first_united_contact not between", value1, value2, "firstUnitedContact");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneIsNull() {
            addCriterion("temp_member_finance.first_united_phone is null");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneIsNotNull() {
            addCriterion("temp_member_finance.first_united_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneEqualTo(Integer value) {
            addCriterion("temp_member_finance.first_united_phone =", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneNotEqualTo(Integer value) {
            addCriterion("temp_member_finance.first_united_phone <>", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneGreaterThan(Integer value) {
            addCriterion("temp_member_finance.first_united_phone >", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_finance.first_united_phone >=", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneLessThan(Integer value) {
            addCriterion("temp_member_finance.first_united_phone <", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_finance.first_united_phone <=", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneIn(List<Integer> values) {
            addCriterion("temp_member_finance.first_united_phone in", values, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneNotIn(List<Integer> values) {
            addCriterion("temp_member_finance.first_united_phone not in", values, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_finance.first_united_phone between", value1, value2, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_finance.first_united_phone not between", value1, value2, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedIsNull() {
            addCriterion("temp_member_finance.second_united is null");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedIsNotNull() {
            addCriterion("temp_member_finance.second_united is not null");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedEqualTo(String value) {
            addCriterion("temp_member_finance.second_united =", value, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedNotEqualTo(String value) {
            addCriterion("temp_member_finance.second_united <>", value, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedGreaterThan(String value) {
            addCriterion("temp_member_finance.second_united >", value, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.second_united >=", value, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedLessThan(String value) {
            addCriterion("temp_member_finance.second_united <", value, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.second_united <=", value, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedLike(String value) {
            addCriterion("temp_member_finance.second_united like", value, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedNotLike(String value) {
            addCriterion("temp_member_finance.second_united not like", value, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedIn(List<String> values) {
            addCriterion("temp_member_finance.second_united in", values, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedNotIn(List<String> values) {
            addCriterion("temp_member_finance.second_united not in", values, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedBetween(String value1, String value2) {
            addCriterion("temp_member_finance.second_united between", value1, value2, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondUnitedNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.second_united not between", value1, value2, "secondUnited");
            return (Criteria) this;
        }

        public Criteria andSecondContactIsNull() {
            addCriterion("temp_member_finance.second_contact is null");
            return (Criteria) this;
        }

        public Criteria andSecondContactIsNotNull() {
            addCriterion("temp_member_finance.second_contact is not null");
            return (Criteria) this;
        }

        public Criteria andSecondContactEqualTo(String value) {
            addCriterion("temp_member_finance.second_contact =", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotEqualTo(String value) {
            addCriterion("temp_member_finance.second_contact <>", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactGreaterThan(String value) {
            addCriterion("temp_member_finance.second_contact >", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.second_contact >=", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactLessThan(String value) {
            addCriterion("temp_member_finance.second_contact <", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.second_contact <=", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactLike(String value) {
            addCriterion("temp_member_finance.second_contact like", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotLike(String value) {
            addCriterion("temp_member_finance.second_contact not like", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactIn(List<String> values) {
            addCriterion("temp_member_finance.second_contact in", values, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotIn(List<String> values) {
            addCriterion("temp_member_finance.second_contact not in", values, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactBetween(String value1, String value2) {
            addCriterion("temp_member_finance.second_contact between", value1, value2, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.second_contact not between", value1, value2, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneIsNull() {
            addCriterion("temp_member_finance.second_phone is null");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneIsNotNull() {
            addCriterion("temp_member_finance.second_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneEqualTo(Integer value) {
            addCriterion("temp_member_finance.second_phone =", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNotEqualTo(Integer value) {
            addCriterion("temp_member_finance.second_phone <>", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneGreaterThan(Integer value) {
            addCriterion("temp_member_finance.second_phone >", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_finance.second_phone >=", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneLessThan(Integer value) {
            addCriterion("temp_member_finance.second_phone <", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_finance.second_phone <=", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneIn(List<Integer> values) {
            addCriterion("temp_member_finance.second_phone in", values, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNotIn(List<Integer> values) {
            addCriterion("temp_member_finance.second_phone not in", values, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_finance.second_phone between", value1, value2, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_finance.second_phone not between", value1, value2, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_member_finance.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_member_finance.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_member_finance.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_member_finance.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_member_finance.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_member_finance.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_member_finance.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_member_finance.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_member_finance.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_member_finance.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_member_finance.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNull() {
            addCriterion("temp_member_finance.creater_time is null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNotNull() {
            addCriterion("temp_member_finance.creater_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeEqualTo(Date value) {
            addCriterion("temp_member_finance.creater_time =", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotEqualTo(Date value) {
            addCriterion("temp_member_finance.creater_time <>", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThan(Date value) {
            addCriterion("temp_member_finance.creater_time >", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_finance.creater_time >=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThan(Date value) {
            addCriterion("temp_member_finance.creater_time <", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_finance.creater_time <=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIn(List<Date> values) {
            addCriterion("temp_member_finance.creater_time in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotIn(List<Date> values) {
            addCriterion("temp_member_finance.creater_time not in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_finance.creater_time between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_finance.creater_time not between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_member_finance.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_member_finance.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_member_finance.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_member_finance.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_member_finance.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_member_finance.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_member_finance.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_member_finance.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_member_finance.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_member_finance.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_member_finance.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_member_finance.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_member_finance.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_member_finance.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_finance.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_member_finance.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_finance.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_member_finance.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_finance.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_member_finance.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_finance.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_finance.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_finance.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andEstateAuthIsNull() {
            addCriterion("temp_member_finance.estate_auth is null");
            return (Criteria) this;
        }

        public Criteria andEstateAuthIsNotNull() {
            addCriterion("temp_member_finance.estate_auth is not null");
            return (Criteria) this;
        }

        public Criteria andEstateAuthEqualTo(String value) {
            addCriterion("temp_member_finance.estate_auth =", value, "estateAuth");
            return (Criteria) this;
        }

        public Criteria andEstateAuthNotEqualTo(String value) {
            addCriterion("temp_member_finance.estate_auth <>", value, "estateAuth");
            return (Criteria) this;
        }

        public Criteria andEstateAuthGreaterThan(String value) {
            addCriterion("temp_member_finance.estate_auth >", value, "estateAuth");
            return (Criteria) this;
        }

        public Criteria andEstateAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.estate_auth >=", value, "estateAuth");
            return (Criteria) this;
        }

        public Criteria andEstateAuthLessThan(String value) {
            addCriterion("temp_member_finance.estate_auth <", value, "estateAuth");
            return (Criteria) this;
        }

        public Criteria andEstateAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.estate_auth <=", value, "estateAuth");
            return (Criteria) this;
        }

        public Criteria andEstateAuthLike(String value) {
            addCriterion("temp_member_finance.estate_auth like", value, "estateAuth");
            return (Criteria) this;
        }

        public Criteria andEstateAuthNotLike(String value) {
            addCriterion("temp_member_finance.estate_auth not like", value, "estateAuth");
            return (Criteria) this;
        }

        public Criteria andEstateAuthIn(List<String> values) {
            addCriterion("temp_member_finance.estate_auth in", values, "estateAuth");
            return (Criteria) this;
        }

        public Criteria andEstateAuthNotIn(List<String> values) {
            addCriterion("temp_member_finance.estate_auth not in", values, "estateAuth");
            return (Criteria) this;
        }

        public Criteria andEstateAuthBetween(String value1, String value2) {
            addCriterion("temp_member_finance.estate_auth between", value1, value2, "estateAuth");
            return (Criteria) this;
        }

        public Criteria andEstateAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.estate_auth not between", value1, value2, "estateAuth");
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