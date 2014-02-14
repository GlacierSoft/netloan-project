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

        public Criteria andMemberEstateIdIsNull() {
            addCriterion("temp_member_estate.member_estate_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdIsNotNull() {
            addCriterion("temp_member_estate.member_estate_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdEqualTo(String value) {
            addCriterion("temp_member_estate.member_estate_id =", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdNotEqualTo(String value) {
            addCriterion("temp_member_estate.member_estate_id <>", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdGreaterThan(String value) {
            addCriterion("temp_member_estate.member_estate_id >", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.member_estate_id >=", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdLessThan(String value) {
            addCriterion("temp_member_estate.member_estate_id <", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.member_estate_id <=", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdLike(String value) {
            addCriterion("temp_member_estate.member_estate_id like", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdNotLike(String value) {
            addCriterion("temp_member_estate.member_estate_id not like", value, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdIn(List<String> values) {
            addCriterion("temp_member_estate.member_estate_id in", values, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdNotIn(List<String> values) {
            addCriterion("temp_member_estate.member_estate_id not in", values, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdBetween(String value1, String value2) {
            addCriterion("temp_member_estate.member_estate_id between", value1, value2, "memberEstateId");
            return (Criteria) this;
        }

        public Criteria andMemberEstateIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.member_estate_id not between", value1, value2, "memberEstateId");
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

        public Criteria andHomeAddressIsNull() {
            addCriterion("temp_member_estate.home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("temp_member_estate.home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("temp_member_estate.home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("temp_member_estate.home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("temp_member_estate.home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("temp_member_estate.home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("temp_member_estate.home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("temp_member_estate.home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("temp_member_estate.home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("temp_member_estate.home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("temp_member_estate.home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.home_address not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andGfaIsNull() {
            addCriterion("temp_member_estate.gfa is null");
            return (Criteria) this;
        }

        public Criteria andGfaIsNotNull() {
            addCriterion("temp_member_estate.gfa is not null");
            return (Criteria) this;
        }

        public Criteria andGfaEqualTo(Integer value) {
            addCriterion("temp_member_estate.gfa =", value, "gfa");
            return (Criteria) this;
        }

        public Criteria andGfaNotEqualTo(Integer value) {
            addCriterion("temp_member_estate.gfa <>", value, "gfa");
            return (Criteria) this;
        }

        public Criteria andGfaGreaterThan(Integer value) {
            addCriterion("temp_member_estate.gfa >", value, "gfa");
            return (Criteria) this;
        }

        public Criteria andGfaGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_estate.gfa >=", value, "gfa");
            return (Criteria) this;
        }

        public Criteria andGfaLessThan(Integer value) {
            addCriterion("temp_member_estate.gfa <", value, "gfa");
            return (Criteria) this;
        }

        public Criteria andGfaLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_estate.gfa <=", value, "gfa");
            return (Criteria) this;
        }

        public Criteria andGfaIn(List<Integer> values) {
            addCriterion("temp_member_estate.gfa in", values, "gfa");
            return (Criteria) this;
        }

        public Criteria andGfaNotIn(List<Integer> values) {
            addCriterion("temp_member_estate.gfa not in", values, "gfa");
            return (Criteria) this;
        }

        public Criteria andGfaBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_estate.gfa between", value1, value2, "gfa");
            return (Criteria) this;
        }

        public Criteria andGfaNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_estate.gfa not between", value1, value2, "gfa");
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

        public Criteria andAgeExpensesDescriptionIsNull() {
            addCriterion("temp_member_estate.age_expenses_description is null");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionIsNotNull() {
            addCriterion("temp_member_estate.age_expenses_description is not null");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionEqualTo(String value) {
            addCriterion("temp_member_estate.age_expenses_description =", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionNotEqualTo(String value) {
            addCriterion("temp_member_estate.age_expenses_description <>", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionGreaterThan(String value) {
            addCriterion("temp_member_estate.age_expenses_description >", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.age_expenses_description >=", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionLessThan(String value) {
            addCriterion("temp_member_estate.age_expenses_description <", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionLessThanOrEqualTo(String value) {
            addCriterion("temp_member_estate.age_expenses_description <=", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionLike(String value) {
            addCriterion("temp_member_estate.age_expenses_description like", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionNotLike(String value) {
            addCriterion("temp_member_estate.age_expenses_description not like", value, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionIn(List<String> values) {
            addCriterion("temp_member_estate.age_expenses_description in", values, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionNotIn(List<String> values) {
            addCriterion("temp_member_estate.age_expenses_description not in", values, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionBetween(String value1, String value2) {
            addCriterion("temp_member_estate.age_expenses_description between", value1, value2, "ageExpensesDescription");
            return (Criteria) this;
        }

        public Criteria andAgeExpensesDescriptionNotBetween(String value1, String value2) {
            addCriterion("temp_member_estate.age_expenses_description not between", value1, value2, "ageExpensesDescription");
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

        public Criteria andCreaterTimeIsNull() {
            addCriterion("temp_member_estate.creater_time is null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNotNull() {
            addCriterion("temp_member_estate.creater_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeEqualTo(Date value) {
            addCriterion("temp_member_estate.creater_time =", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotEqualTo(Date value) {
            addCriterion("temp_member_estate.creater_time <>", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThan(Date value) {
            addCriterion("temp_member_estate.creater_time >", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.creater_time >=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThan(Date value) {
            addCriterion("temp_member_estate.creater_time <", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_estate.creater_time <=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIn(List<Date> values) {
            addCriterion("temp_member_estate.creater_time in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotIn(List<Date> values) {
            addCriterion("temp_member_estate.creater_time not in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.creater_time between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_estate.creater_time not between", value1, value2, "createrTime");
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