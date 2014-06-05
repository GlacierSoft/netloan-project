package com.glacier.netloan.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberEstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberEstateExample() {
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
        public Criteria andMemberRealNameLike(String value) {
            addCriterion("temp_member.member_real_name like", value, "memberRealName");
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

        public Criteria andEstateIdIsNull() {
            addCriterion("temp_member_estate.estate_id is null");
            return (Criteria) this;
        }

        public Criteria andEstateIdIsNotNull() {
            addCriterion("temp_member_estate.estate_id is not null");
            return (Criteria) this;
        }

        public Criteria andEstateIdEqualTo(String value) {
            addCriterion("temp_member_estate.estate_id =", value, "estateId");
            return (Criteria) this;
        }

        public Criteria andEstateIdNotEqualTo(String value) {
            addCriterion("temp_member_estate.estate_id <>", value, "estateId");
            return (Criteria) this;
        }

        public Criteria andEstateIdGreaterThan(String value) {
            addCriterion("temp_member_estate.estate_id >", value, "estateId");
            return (Criteria) this;
        }

        public Criteria andEstateIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.estate_id >=", value, "estateId");
            return (Criteria) this;
        }

        public Criteria andEstateIdLessThan(String value) {
            addCriterion("temp_member_estate.estate_id <", value, "estateId");
            return (Criteria) this;
        }

        public Criteria andEstateIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.estate_id <=", value, "estateId");
            return (Criteria) this;
        }

        public Criteria andEstateIdLike(String value) {
            addCriterion("temp_member_estate.estate_id like", value, "estateId");
            return (Criteria) this;
        }

        public Criteria andEstateIdNotLike(String value) {
            addCriterion("temp_member_estate.estate_id not like", value, "estateId");
            return (Criteria) this;
        }

        public Criteria andEstateIdIn(List<String> values) {
            addCriterion("temp_member_estate.estate_id in", values, "estateId");
            return (Criteria) this;
        }

        public Criteria andEstateIdNotIn(List<String> values) {
            addCriterion("temp_member_estate.estate_id not in", values, "estateId");
            return (Criteria) this;
        }

        public Criteria andEstateIdBetween(String value1, String value2) {
            addCriterion("temp_member_estate.estate_id between", value1, value2, "estateId");
            return (Criteria) this;
        }

        public Criteria andEstateIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.estate_id not between", value1, value2, "estateId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_member_estate.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member_estate.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member_estate.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member_estate.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member_estate.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member_estate.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member_estate.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member_estate.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member_estate.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member_estate.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member_estate.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("temp_member_estate.address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("temp_member_estate.address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("temp_member_estate.address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("temp_member_estate.address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("temp_member_estate.address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("temp_member_estate.address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("temp_member_estate.address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("temp_member_estate.address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("temp_member_estate.address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("temp_member_estate.address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("temp_member_estate.address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("temp_member_estate.area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("temp_member_estate.area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Float value) {
            addCriterion("temp_member_estate.area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Float value) {
            addCriterion("temp_member_estate.area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Float value) {
            addCriterion("temp_member_estate.area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_estate.area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Float value) {
            addCriterion("temp_member_estate.area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_estate.area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Float> values) {
            addCriterion("temp_member_estate.area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Float> values) {
            addCriterion("temp_member_estate.area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Float value1, Float value2) {
            addCriterion("temp_member_estate.area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_estate.area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andYearBuiltIsNull() {
            addCriterion("temp_member_estate.year_built is null");
            return (Criteria) this;
        }

        public Criteria andYearBuiltIsNotNull() {
            addCriterion("temp_member_estate.year_built is not null");
            return (Criteria) this;
        }

        public Criteria andYearBuiltEqualTo(Date value) {
            addCriterion("temp_member_estate.year_built =", value, "yearBuilt");
            return (Criteria) this;
        }

        public Criteria andYearBuiltNotEqualTo(Date value) {
            addCriterion("temp_member_estate.year_built <>", value, "yearBuilt");
            return (Criteria) this;
        }

        public Criteria andYearBuiltGreaterThan(Date value) {
            addCriterion("temp_member_estate.year_built >", value, "yearBuilt");
            return (Criteria) this;
        }

        public Criteria andYearBuiltGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.year_built >=", value, "yearBuilt");
            return (Criteria) this;
        }

        public Criteria andYearBuiltLessThan(Date value) {
            addCriterion("temp_member_estate.year_built <", value, "yearBuilt");
            return (Criteria) this;
        }

        public Criteria andYearBuiltLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.year_built <=", value, "yearBuilt");
            return (Criteria) this;
        }

        public Criteria andYearBuiltIn(List<Date> values) {
            addCriterion("temp_member_estate.year_built in", values, "yearBuilt");
            return (Criteria) this;
        }

        public Criteria andYearBuiltNotIn(List<Date> values) {
            addCriterion("temp_member_estate.year_built not in", values, "yearBuilt");
            return (Criteria) this;
        }

        public Criteria andYearBuiltBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.year_built between", value1, value2, "yearBuilt");
            return (Criteria) this;
        }

        public Criteria andYearBuiltNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.year_built not between", value1, value2, "yearBuilt");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesIsNull() {
            addCriterion("temp_member_estate.age_expenses is null");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesIsNotNull() {
            addCriterion("temp_member_estate.age_expenses is not null");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesEqualTo(String value) {
            addCriterion("temp_member_estate.age_expenses =", value, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesNotEqualTo(String value) {
            addCriterion("temp_member_estate.age_expenses <>", value, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesGreaterThan(String value) {
            addCriterion("temp_member_estate.age_expenses >", value, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.age_expenses >=", value, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesLessThan(String value) {
            addCriterion("temp_member_estate.age_expenses <", value, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.age_expenses <=", value, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesLike(String value) {
            addCriterion("temp_member_estate.age_expenses like", value, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesNotLike(String value) {
            addCriterion("temp_member_estate.age_expenses not like", value, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesIn(List<String> values) {
            addCriterion("temp_member_estate.age_expenses in", values, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesNotIn(List<String> values) {
            addCriterion("temp_member_estate.age_expenses not in", values, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesBetween(String value1, String value2) {
            addCriterion("temp_member_estate.age_expenses between", value1, value2, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.age_expenses not between", value1, value2, "ageExpenses");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerIsNull() {
            addCriterion("temp_member_estate.first_owner is null");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerIsNotNull() {
            addCriterion("temp_member_estate.first_owner is not null");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerEqualTo(String value) {
            addCriterion("temp_member_estate.first_owner =", value, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerNotEqualTo(String value) {
            addCriterion("temp_member_estate.first_owner <>", value, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerGreaterThan(String value) {
            addCriterion("temp_member_estate.first_owner >", value, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.first_owner >=", value, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerLessThan(String value) {
            addCriterion("temp_member_estate.first_owner <", value, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.first_owner <=", value, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerLike(String value) {
            addCriterion("temp_member_estate.first_owner like", value, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerNotLike(String value) {
            addCriterion("temp_member_estate.first_owner not like", value, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerIn(List<String> values) {
            addCriterion("temp_member_estate.first_owner in", values, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerNotIn(List<String> values) {
            addCriterion("temp_member_estate.first_owner not in", values, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerBetween(String value1, String value2) {
            addCriterion("temp_member_estate.first_owner between", value1, value2, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andFirstOwnerNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.first_owner not between", value1, value2, "firstOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerIsNull() {
            addCriterion("temp_member_estate.second_owner is null");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerIsNotNull() {
            addCriterion("temp_member_estate.second_owner is not null");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerEqualTo(String value) {
            addCriterion("temp_member_estate.second_owner =", value, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerNotEqualTo(String value) {
            addCriterion("temp_member_estate.second_owner <>", value, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerGreaterThan(String value) {
            addCriterion("temp_member_estate.second_owner >", value, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.second_owner >=", value, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerLessThan(String value) {
            addCriterion("temp_member_estate.second_owner <", value, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.second_owner <=", value, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerLike(String value) {
            addCriterion("temp_member_estate.second_owner like", value, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerNotLike(String value) {
            addCriterion("temp_member_estate.second_owner not like", value, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerIn(List<String> values) {
            addCriterion("temp_member_estate.second_owner in", values, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerNotIn(List<String> values) {
            addCriterion("temp_member_estate.second_owner not in", values, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerBetween(String value1, String value2) {
            addCriterion("temp_member_estate.second_owner between", value1, value2, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andSecondOwnerNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.second_owner not between", value1, value2, "secondOwner");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNull() {
            addCriterion("temp_member_estate.loan_period is null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNotNull() {
            addCriterion("temp_member_estate.loan_period is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodEqualTo(Date value) {
            addCriterion("temp_member_estate.loan_period =", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotEqualTo(Date value) {
            addCriterion("temp_member_estate.loan_period <>", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThan(Date value) {
            addCriterion("temp_member_estate.loan_period >", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.loan_period >=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThan(Date value) {
            addCriterion("temp_member_estate.loan_period <", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.loan_period <=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIn(List<Date> values) {
            addCriterion("temp_member_estate.loan_period in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotIn(List<Date> values) {
            addCriterion("temp_member_estate.loan_period not in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.loan_period between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.loan_period not between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsIsNull() {
            addCriterion("temp_member_estate.month_contributions is null");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsIsNotNull() {
            addCriterion("temp_member_estate.month_contributions is not null");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsEqualTo(Float value) {
            addCriterion("temp_member_estate.month_contributions =", value, "monthContributions");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsNotEqualTo(Float value) {
            addCriterion("temp_member_estate.month_contributions <>", value, "monthContributions");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsGreaterThan(Float value) {
            addCriterion("temp_member_estate.month_contributions >", value, "monthContributions");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_estate.month_contributions >=", value, "monthContributions");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsLessThan(Float value) {
            addCriterion("temp_member_estate.month_contributions <", value, "monthContributions");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_estate.month_contributions <=", value, "monthContributions");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsIn(List<Float> values) {
            addCriterion("temp_member_estate.month_contributions in", values, "monthContributions");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsNotIn(List<Float> values) {
            addCriterion("temp_member_estate.month_contributions not in", values, "monthContributions");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsBetween(Float value1, Float value2) {
            addCriterion("temp_member_estate.month_contributions between", value1, value2, "monthContributions");
            return (Criteria) this;
        }

        public Criteria andMonthContributionsNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_estate.month_contributions not between", value1, value2, "monthContributions");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesIsNull() {
            addCriterion("temp_member_estate.outstand_balances is null");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesIsNotNull() {
            addCriterion("temp_member_estate.outstand_balances is not null");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesEqualTo(Float value) {
            addCriterion("temp_member_estate.outstand_balances =", value, "outstandBalances");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesNotEqualTo(Float value) {
            addCriterion("temp_member_estate.outstand_balances <>", value, "outstandBalances");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesGreaterThan(Float value) {
            addCriterion("temp_member_estate.outstand_balances >", value, "outstandBalances");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_estate.outstand_balances >=", value, "outstandBalances");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesLessThan(Float value) {
            addCriterion("temp_member_estate.outstand_balances <", value, "outstandBalances");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_estate.outstand_balances <=", value, "outstandBalances");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesIn(List<Float> values) {
            addCriterion("temp_member_estate.outstand_balances in", values, "outstandBalances");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesNotIn(List<Float> values) {
            addCriterion("temp_member_estate.outstand_balances not in", values, "outstandBalances");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesBetween(Float value1, Float value2) {
            addCriterion("temp_member_estate.outstand_balances between", value1, value2, "outstandBalances");
            return (Criteria) this;
        }

        public Criteria andOutstandBalancesNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_estate.outstand_balances not between", value1, value2, "outstandBalances");
            return (Criteria) this;
        }

        public Criteria andMortgageBankIsNull() {
            addCriterion("temp_member_estate.mortgage_bank is null");
            return (Criteria) this;
        }

        public Criteria andMortgageBankIsNotNull() {
            addCriterion("temp_member_estate.mortgage_bank is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageBankEqualTo(String value) {
            addCriterion("temp_member_estate.mortgage_bank =", value, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andMortgageBankNotEqualTo(String value) {
            addCriterion("temp_member_estate.mortgage_bank <>", value, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andMortgageBankGreaterThan(String value) {
            addCriterion("temp_member_estate.mortgage_bank >", value, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andMortgageBankGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.mortgage_bank >=", value, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andMortgageBankLessThan(String value) {
            addCriterion("temp_member_estate.mortgage_bank <", value, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andMortgageBankLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.mortgage_bank <=", value, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andMortgageBankLike(String value) {
            addCriterion("temp_member_estate.mortgage_bank like", value, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andMortgageBankNotLike(String value) {
            addCriterion("temp_member_estate.mortgage_bank not like", value, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andMortgageBankIn(List<String> values) {
            addCriterion("temp_member_estate.mortgage_bank in", values, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andMortgageBankNotIn(List<String> values) {
            addCriterion("temp_member_estate.mortgage_bank not in", values, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andMortgageBankBetween(String value1, String value2) {
            addCriterion("temp_member_estate.mortgage_bank between", value1, value2, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andMortgageBankNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.mortgage_bank not between", value1, value2, "mortgageBank");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_member_estate.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_member_estate.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_member_estate.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_member_estate.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_member_estate.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_member_estate.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_member_estate.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_member_estate.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_member_estate.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_member_estate.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_member_estate.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_member_estate.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_member_estate.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_member_estate.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_member_estate.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_member_estate.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_member_estate.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_member_estate.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_member_estate.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_member_estate.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_member_estate.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_member_estate.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_member_estate.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_member_estate.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_member_estate.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_member_estate.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_member_estate.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_member_estate.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_member_estate.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_member_estate.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("temp_member_estate.audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("temp_member_estate.audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("temp_member_estate.audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("temp_member_estate.audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("temp_member_estate.audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("temp_member_estate.audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("temp_member_estate.audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("temp_member_estate.audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("temp_member_estate.audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("temp_member_estate.audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("temp_member_estate.audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_member_estate.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_member_estate.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_member_estate.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_member_estate.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_member_estate.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_member_estate.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_member_estate.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_member_estate.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_member_estate.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_member_estate.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_member_estate.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_member_estate.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_member_estate.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_member_estate.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_member_estate.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_member_estate.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_member_estate.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_member_estate.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_member_estate.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_member_estate.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_member_estate.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_member_estate.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_member_estate.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_member_estate.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_member_estate.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_estate.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_member_estate.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_member_estate.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_member_estate.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_estate.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_member_estate.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_member_estate.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_member_estate.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_member_estate.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_member_estate.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_member_estate.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_member_estate.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_member_estate.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_member_estate.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_member_estate.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_member_estate.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_member_estate.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_member_estate.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_member_estate.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_estate.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_member_estate.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_member_estate.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_member_estate.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_estate.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.update_time not between", value1, value2, "updateTime");
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