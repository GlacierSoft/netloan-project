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
        //扩展会员名称查询
        public Criteria andMemberNameLike(String value) {
            addCriterion("temp_member.member_name like", value, "memberName");
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

        public Criteria andAveIncomeDesIsNull() {
            addCriterion("temp_member_finance.ave_income_des is null");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesIsNotNull() {
            addCriterion("temp_member_finance.ave_income_des is not null");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesEqualTo(String value) {
            addCriterion("temp_member_finance.ave_income_des =", value, "aveIncomeDes");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesNotEqualTo(String value) {
            addCriterion("temp_member_finance.ave_income_des <>", value, "aveIncomeDes");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesGreaterThan(String value) {
            addCriterion("temp_member_finance.ave_income_des >", value, "aveIncomeDes");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.ave_income_des >=", value, "aveIncomeDes");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesLessThan(String value) {
            addCriterion("temp_member_finance.ave_income_des <", value, "aveIncomeDes");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.ave_income_des <=", value, "aveIncomeDes");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesLike(String value) {
            addCriterion("temp_member_finance.ave_income_des like", value, "aveIncomeDes");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesNotLike(String value) {
            addCriterion("temp_member_finance.ave_income_des not like", value, "aveIncomeDes");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesIn(List<String> values) {
            addCriterion("temp_member_finance.ave_income_des in", values, "aveIncomeDes");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesNotIn(List<String> values) {
            addCriterion("temp_member_finance.ave_income_des not in", values, "aveIncomeDes");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesBetween(String value1, String value2) {
            addCriterion("temp_member_finance.ave_income_des between", value1, value2, "aveIncomeDes");
            return (Criteria) this;
        }

        public Criteria andAveIncomeDesNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.ave_income_des not between", value1, value2, "aveIncomeDes");
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

        public Criteria andAgeExpensesDesIsNull() {
            addCriterion("temp_member_finance.age_expenses_des is null");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesIsNotNull() {
            addCriterion("temp_member_finance.age_expenses_des is not null");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesEqualTo(String value) {
            addCriterion("temp_member_finance.age_expenses_des =", value, "ageExpensesDes");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesNotEqualTo(String value) {
            addCriterion("temp_member_finance.age_expenses_des <>", value, "ageExpensesDes");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesGreaterThan(String value) {
            addCriterion("temp_member_finance.age_expenses_des >", value, "ageExpensesDes");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.age_expenses_des >=", value, "ageExpensesDes");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesLessThan(String value) {
            addCriterion("temp_member_finance.age_expenses_des <", value, "ageExpensesDes");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.age_expenses_des <=", value, "ageExpensesDes");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesLike(String value) {
            addCriterion("temp_member_finance.age_expenses_des like", value, "ageExpensesDes");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesNotLike(String value) {
            addCriterion("temp_member_finance.age_expenses_des not like", value, "ageExpensesDes");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesIn(List<String> values) {
            addCriterion("temp_member_finance.age_expenses_des in", values, "ageExpensesDes");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesNotIn(List<String> values) {
            addCriterion("temp_member_finance.age_expenses_des not in", values, "ageExpensesDes");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesBetween(String value1, String value2) {
            addCriterion("temp_member_finance.age_expenses_des between", value1, value2, "ageExpensesDes");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDesNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.age_expenses_des not between", value1, value2, "ageExpensesDes");
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

        public Criteria andBuyCarIsNull() {
            addCriterion("temp_member_finance.buy_car is null");
            return (Criteria) this;
        }

        public Criteria andBuyCarIsNotNull() {
            addCriterion("temp_member_finance.buy_car is not null");
            return (Criteria) this;
        }

        public Criteria andBuyCarEqualTo(String value) {
            addCriterion("temp_member_finance.buy_car =", value, "buyCar");
            return (Criteria) this;
        }

        public Criteria andBuyCarNotEqualTo(String value) {
            addCriterion("temp_member_finance.buy_car <>", value, "buyCar");
            return (Criteria) this;
        }

        public Criteria andBuyCarGreaterThan(String value) {
            addCriterion("temp_member_finance.buy_car >", value, "buyCar");
            return (Criteria) this;
        }

        public Criteria andBuyCarGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.buy_car >=", value, "buyCar");
            return (Criteria) this;
        }

        public Criteria andBuyCarLessThan(String value) {
            addCriterion("temp_member_finance.buy_car <", value, "buyCar");
            return (Criteria) this;
        }

        public Criteria andBuyCarLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.buy_car <=", value, "buyCar");
            return (Criteria) this;
        }

        public Criteria andBuyCarLike(String value) {
            addCriterion("temp_member_finance.buy_car like", value, "buyCar");
            return (Criteria) this;
        }

        public Criteria andBuyCarNotLike(String value) {
            addCriterion("temp_member_finance.buy_car not like", value, "buyCar");
            return (Criteria) this;
        }

        public Criteria andBuyCarIn(List<String> values) {
            addCriterion("temp_member_finance.buy_car in", values, "buyCar");
            return (Criteria) this;
        }

        public Criteria andBuyCarNotIn(List<String> values) {
            addCriterion("temp_member_finance.buy_car not in", values, "buyCar");
            return (Criteria) this;
        }

        public Criteria andBuyCarBetween(String value1, String value2) {
            addCriterion("temp_member_finance.buy_car between", value1, value2, "buyCar");
            return (Criteria) this;
        }

        public Criteria andBuyCarNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.buy_car not between", value1, value2, "buyCar");
            return (Criteria) this;
        }

        public Criteria andCarValueIsNull() {
            addCriterion("temp_member_finance.car_value is null");
            return (Criteria) this;
        }

        public Criteria andCarValueIsNotNull() {
            addCriterion("temp_member_finance.car_value is not null");
            return (Criteria) this;
        }

        public Criteria andCarValueEqualTo(Float value) {
            addCriterion("temp_member_finance.car_value =", value, "carValue");
            return (Criteria) this;
        }

        public Criteria andCarValueNotEqualTo(Float value) {
            addCriterion("temp_member_finance.car_value <>", value, "carValue");
            return (Criteria) this;
        }

        public Criteria andCarValueGreaterThan(Float value) {
            addCriterion("temp_member_finance.car_value >", value, "carValue");
            return (Criteria) this;
        }

        public Criteria andCarValueGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_finance.car_value >=", value, "carValue");
            return (Criteria) this;
        }

        public Criteria andCarValueLessThan(Float value) {
            addCriterion("temp_member_finance.car_value <", value, "carValue");
            return (Criteria) this;
        }

        public Criteria andCarValueLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_finance.car_value <=", value, "carValue");
            return (Criteria) this;
        }

        public Criteria andCarValueIn(List<Float> values) {
            addCriterion("temp_member_finance.car_value in", values, "carValue");
            return (Criteria) this;
        }

        public Criteria andCarValueNotIn(List<Float> values) {
            addCriterion("temp_member_finance.car_value not in", values, "carValue");
            return (Criteria) this;
        }

        public Criteria andCarValueBetween(Float value1, Float value2) {
            addCriterion("temp_member_finance.car_value between", value1, value2, "carValue");
            return (Criteria) this;
        }

        public Criteria andCarValueNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_finance.car_value not between", value1, value2, "carValue");
            return (Criteria) this;
        }

        public Criteria andCarAuthIsNull() {
            addCriterion("temp_member_finance.car_auth is null");
            return (Criteria) this;
        }

        public Criteria andCarAuthIsNotNull() {
            addCriterion("temp_member_finance.car_auth is not null");
            return (Criteria) this;
        }

        public Criteria andCarAuthEqualTo(String value) {
            addCriterion("temp_member_finance.car_auth =", value, "carAuth");
            return (Criteria) this;
        }

        public Criteria andCarAuthNotEqualTo(String value) {
            addCriterion("temp_member_finance.car_auth <>", value, "carAuth");
            return (Criteria) this;
        }

        public Criteria andCarAuthGreaterThan(String value) {
            addCriterion("temp_member_finance.car_auth >", value, "carAuth");
            return (Criteria) this;
        }

        public Criteria andCarAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.car_auth >=", value, "carAuth");
            return (Criteria) this;
        }

        public Criteria andCarAuthLessThan(String value) {
            addCriterion("temp_member_finance.car_auth <", value, "carAuth");
            return (Criteria) this;
        }

        public Criteria andCarAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.car_auth <=", value, "carAuth");
            return (Criteria) this;
        }

        public Criteria andCarAuthLike(String value) {
            addCriterion("temp_member_finance.car_auth like", value, "carAuth");
            return (Criteria) this;
        }

        public Criteria andCarAuthNotLike(String value) {
            addCriterion("temp_member_finance.car_auth not like", value, "carAuth");
            return (Criteria) this;
        }

        public Criteria andCarAuthIn(List<String> values) {
            addCriterion("temp_member_finance.car_auth in", values, "carAuth");
            return (Criteria) this;
        }

        public Criteria andCarAuthNotIn(List<String> values) {
            addCriterion("temp_member_finance.car_auth not in", values, "carAuth");
            return (Criteria) this;
        }

        public Criteria andCarAuthBetween(String value1, String value2) {
            addCriterion("temp_member_finance.car_auth between", value1, value2, "carAuth");
            return (Criteria) this;
        }

        public Criteria andCarAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.car_auth not between", value1, value2, "carAuth");
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

        public Criteria andFirstUnitedPhoneEqualTo(String value) {
            addCriterion("temp_member_finance.first_united_phone =", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneNotEqualTo(String value) {
            addCriterion("temp_member_finance.first_united_phone <>", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneGreaterThan(String value) {
            addCriterion("temp_member_finance.first_united_phone >", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.first_united_phone >=", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneLessThan(String value) {
            addCriterion("temp_member_finance.first_united_phone <", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.first_united_phone <=", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneLike(String value) {
            addCriterion("temp_member_finance.first_united_phone like", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneNotLike(String value) {
            addCriterion("temp_member_finance.first_united_phone not like", value, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneIn(List<String> values) {
            addCriterion("temp_member_finance.first_united_phone in", values, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneNotIn(List<String> values) {
            addCriterion("temp_member_finance.first_united_phone not in", values, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneBetween(String value1, String value2) {
            addCriterion("temp_member_finance.first_united_phone between", value1, value2, "firstUnitedPhone");
            return (Criteria) this;
        }

        public Criteria andFirstUnitedPhoneNotBetween(String value1, String value2) {
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

        public Criteria andSecondPhoneEqualTo(String value) {
            addCriterion("temp_member_finance.second_phone =", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNotEqualTo(String value) {
            addCriterion("temp_member_finance.second_phone <>", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneGreaterThan(String value) {
            addCriterion("temp_member_finance.second_phone >", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.second_phone >=", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneLessThan(String value) {
            addCriterion("temp_member_finance.second_phone <", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member_finance.second_phone <=", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneLike(String value) {
            addCriterion("temp_member_finance.second_phone like", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNotLike(String value) {
            addCriterion("temp_member_finance.second_phone not like", value, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneIn(List<String> values) {
            addCriterion("temp_member_finance.second_phone in", values, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNotIn(List<String> values) {
            addCriterion("temp_member_finance.second_phone not in", values, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneBetween(String value1, String value2) {
            addCriterion("temp_member_finance.second_phone between", value1, value2, "secondPhone");
            return (Criteria) this;
        }

        public Criteria andSecondPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_member_finance.second_phone not between", value1, value2, "secondPhone");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_member_finance.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_member_finance.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_member_finance.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_finance.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_member_finance.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_finance.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_member_finance.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_finance.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_member_finance.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_finance.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_finance.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_finance.create_time not between", value1, value2, "createTime");
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