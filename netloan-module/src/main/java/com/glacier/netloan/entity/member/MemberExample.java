package com.glacier.netloan.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_member.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("temp_member.member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("temp_member.member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("temp_member.member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("temp_member.member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("temp_member.member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("temp_member.member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("temp_member.member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("temp_member.member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("temp_member.member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("temp_member.member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("temp_member.member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("temp_member.member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("temp_member.member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNull() {
            addCriterion("temp_member.member_password is null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNotNull() {
            addCriterion("temp_member.member_password is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordEqualTo(String value) {
            addCriterion("temp_member.member_password =", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotEqualTo(String value) {
            addCriterion("temp_member.member_password <>", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThan(String value) {
            addCriterion("temp_member.member_password >", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.member_password >=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThan(String value) {
            addCriterion("temp_member.member_password <", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThanOrEqualTo(String value) {
            addCriterion("temp_member.member_password <=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLike(String value) {
            addCriterion("temp_member.member_password like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotLike(String value) {
            addCriterion("temp_member.member_password not like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIn(List<String> values) {
            addCriterion("temp_member.member_password in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotIn(List<String> values) {
            addCriterion("temp_member.member_password not in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordBetween(String value1, String value2) {
            addCriterion("temp_member.member_password between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotBetween(String value1, String value2) {
            addCriterion("temp_member.member_password not between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIsNull() {
            addCriterion("temp_member.member_real_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIsNotNull() {
            addCriterion("temp_member.member_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameEqualTo(String value) {
            addCriterion("temp_member.member_real_name =", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotEqualTo(String value) {
            addCriterion("temp_member.member_real_name <>", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameGreaterThan(String value) {
            addCriterion("temp_member.member_real_name >", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.member_real_name >=", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLessThan(String value) {
            addCriterion("temp_member.member_real_name <", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLessThanOrEqualTo(String value) {
            addCriterion("temp_member.member_real_name <=", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLike(String value) {
            addCriterion("temp_member.member_real_name like", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotLike(String value) {
            addCriterion("temp_member.member_real_name not like", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIn(List<String> values) {
            addCriterion("temp_member.member_real_name in", values, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotIn(List<String> values) {
            addCriterion("temp_member.member_real_name not in", values, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameBetween(String value1, String value2) {
            addCriterion("temp_member.member_real_name between", value1, value2, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotBetween(String value1, String value2) {
            addCriterion("temp_member.member_real_name not between", value1, value2, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIsNull() {
            addCriterion("temp_member.member_age is null");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIsNotNull() {
            addCriterion("temp_member.member_age is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAgeEqualTo(Integer value) {
            addCriterion("temp_member.member_age =", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotEqualTo(Integer value) {
            addCriterion("temp_member.member_age <>", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeGreaterThan(Integer value) {
            addCriterion("temp_member.member_age >", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member.member_age >=", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeLessThan(Integer value) {
            addCriterion("temp_member.member_age <", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member.member_age <=", value, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeIn(List<Integer> values) {
            addCriterion("temp_member.member_age in", values, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotIn(List<Integer> values) {
            addCriterion("temp_member.member_age not in", values, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeBetween(Integer value1, Integer value2) {
            addCriterion("temp_member.member_age between", value1, value2, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMemberAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member.member_age not between", value1, value2, "memberAge");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNull() {
            addCriterion("temp_member.mobile_number is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNotNull() {
            addCriterion("temp_member.mobile_number is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberEqualTo(String value) {
            addCriterion("temp_member.mobile_number =", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotEqualTo(String value) {
            addCriterion("temp_member.mobile_number <>", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThan(String value) {
            addCriterion("temp_member.mobile_number >", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.mobile_number >=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThan(String value) {
            addCriterion("temp_member.mobile_number <", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThanOrEqualTo(String value) {
            addCriterion("temp_member.mobile_number <=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLike(String value) {
            addCriterion("temp_member.mobile_number like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotLike(String value) {
            addCriterion("temp_member.mobile_number not like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIn(List<String> values) {
            addCriterion("temp_member.mobile_number in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotIn(List<String> values) {
            addCriterion("temp_member.mobile_number not in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberBetween(String value1, String value2) {
            addCriterion("temp_member.mobile_number between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotBetween(String value1, String value2) {
            addCriterion("temp_member.mobile_number not between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("temp_member.sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("temp_member.sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("temp_member.sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("temp_member.sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("temp_member.sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("temp_member.sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("temp_member.sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("temp_member.sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("temp_member.sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("temp_member.sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("temp_member.sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("temp_member.sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("temp_member.sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("temp_member.marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("temp_member.marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("temp_member.marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("temp_member.marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("temp_member.marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("temp_member.marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_member.marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("temp_member.marital_status like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("temp_member.marital_status not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("temp_member.marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("temp_member.marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("temp_member.marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("temp_member.marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("temp_member.card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("temp_member.card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("temp_member.card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("temp_member.card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("temp_member.card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("temp_member.card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member.card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("temp_member.card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("temp_member.card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("temp_member.card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("temp_member.card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("temp_member.card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("temp_member.card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("temp_member.email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("temp_member.email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("temp_member.email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("temp_member.email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("temp_member.email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("temp_member.email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("temp_member.email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("temp_member.email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("temp_member.email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("temp_member.email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("temp_member.email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("temp_member.email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("temp_member.email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailAuthIsNull() {
            addCriterion("temp_member.email_auth is null");
            return (Criteria) this;
        }

        public Criteria andEmailAuthIsNotNull() {
            addCriterion("temp_member.email_auth is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAuthEqualTo(String value) {
            addCriterion("temp_member.email_auth =", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthNotEqualTo(String value) {
            addCriterion("temp_member.email_auth <>", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthGreaterThan(String value) {
            addCriterion("temp_member.email_auth >", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.email_auth >=", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthLessThan(String value) {
            addCriterion("temp_member.email_auth <", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member.email_auth <=", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthLike(String value) {
            addCriterion("temp_member.email_auth like", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthNotLike(String value) {
            addCriterion("temp_member.email_auth not like", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthIn(List<String> values) {
            addCriterion("temp_member.email_auth in", values, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthNotIn(List<String> values) {
            addCriterion("temp_member.email_auth not in", values, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthBetween(String value1, String value2) {
            addCriterion("temp_member.email_auth between", value1, value2, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member.email_auth not between", value1, value2, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("temp_member.credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("temp_member.credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(String value) {
            addCriterion("temp_member.credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(String value) {
            addCriterion("temp_member.credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(String value) {
            addCriterion("temp_member.credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(String value) {
            addCriterion("temp_member.credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(String value) {
            addCriterion("temp_member.credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLike(String value) {
            addCriterion("temp_member.credit like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotLike(String value) {
            addCriterion("temp_member.credit not like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<String> values) {
            addCriterion("temp_member.credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<String> values) {
            addCriterion("temp_member.credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(String value1, String value2) {
            addCriterion("temp_member.credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(String value1, String value2) {
            addCriterion("temp_member.credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andMobileAuthIsNull() {
            addCriterion("temp_member.mobile_auth is null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthIsNotNull() {
            addCriterion("temp_member.mobile_auth is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthEqualTo(String value) {
            addCriterion("temp_member.mobile_auth =", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotEqualTo(String value) {
            addCriterion("temp_member.mobile_auth <>", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthGreaterThan(String value) {
            addCriterion("temp_member.mobile_auth >", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.mobile_auth >=", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthLessThan(String value) {
            addCriterion("temp_member.mobile_auth <", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member.mobile_auth <=", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthLike(String value) {
            addCriterion("temp_member.mobile_auth like", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotLike(String value) {
            addCriterion("temp_member.mobile_auth not like", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthIn(List<String> values) {
            addCriterion("temp_member.mobile_auth in", values, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotIn(List<String> values) {
            addCriterion("temp_member.mobile_auth not in", values, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthBetween(String value1, String value2) {
            addCriterion("temp_member.mobile_auth between", value1, value2, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member.mobile_auth not between", value1, value2, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthIsNull() {
            addCriterion("temp_member.company_auth is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthIsNotNull() {
            addCriterion("temp_member.company_auth is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthEqualTo(String value) {
            addCriterion("temp_member.company_auth =", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthNotEqualTo(String value) {
            addCriterion("temp_member.company_auth <>", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthGreaterThan(String value) {
            addCriterion("temp_member.company_auth >", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.company_auth >=", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthLessThan(String value) {
            addCriterion("temp_member.company_auth <", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member.company_auth <=", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthLike(String value) {
            addCriterion("temp_member.company_auth like", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthNotLike(String value) {
            addCriterion("temp_member.company_auth not like", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthIn(List<String> values) {
            addCriterion("temp_member.company_auth in", values, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthNotIn(List<String> values) {
            addCriterion("temp_member.company_auth not in", values, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthBetween(String value1, String value2) {
            addCriterion("temp_member.company_auth between", value1, value2, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member.company_auth not between", value1, value2, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthIsNull() {
            addCriterion("temp_member.real_name_auth is null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthIsNotNull() {
            addCriterion("temp_member.real_name_auth is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthEqualTo(String value) {
            addCriterion("temp_member.real_name_auth =", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthNotEqualTo(String value) {
            addCriterion("temp_member.real_name_auth <>", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthGreaterThan(String value) {
            addCriterion("temp_member.real_name_auth >", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.real_name_auth >=", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthLessThan(String value) {
            addCriterion("temp_member.real_name_auth <", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member.real_name_auth <=", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthLike(String value) {
            addCriterion("temp_member.real_name_auth like", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthNotLike(String value) {
            addCriterion("temp_member.real_name_auth not like", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthIn(List<String> values) {
            addCriterion("temp_member.real_name_auth in", values, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthNotIn(List<String> values) {
            addCriterion("temp_member.real_name_auth not in", values, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthBetween(String value1, String value2) {
            addCriterion("temp_member.real_name_auth between", value1, value2, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member.real_name_auth not between", value1, value2, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthIsNull() {
            addCriterion("temp_member.id_auth is null");
            return (Criteria) this;
        }

        public Criteria andIdAuthIsNotNull() {
            addCriterion("temp_member.id_auth is not null");
            return (Criteria) this;
        }

        public Criteria andIdAuthEqualTo(String value) {
            addCriterion("temp_member.id_auth =", value, "idAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthNotEqualTo(String value) {
            addCriterion("temp_member.id_auth <>", value, "idAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthGreaterThan(String value) {
            addCriterion("temp_member.id_auth >", value, "idAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.id_auth >=", value, "idAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthLessThan(String value) {
            addCriterion("temp_member.id_auth <", value, "idAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member.id_auth <=", value, "idAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthLike(String value) {
            addCriterion("temp_member.id_auth like", value, "idAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthNotLike(String value) {
            addCriterion("temp_member.id_auth not like", value, "idAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthIn(List<String> values) {
            addCriterion("temp_member.id_auth in", values, "idAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthNotIn(List<String> values) {
            addCriterion("temp_member.id_auth not in", values, "idAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthBetween(String value1, String value2) {
            addCriterion("temp_member.id_auth between", value1, value2, "idAuth");
            return (Criteria) this;
        }

        public Criteria andIdAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member.id_auth not between", value1, value2, "idAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthIsNull() {
            addCriterion("temp_member.work_auth is null");
            return (Criteria) this;
        }

        public Criteria andWorkAuthIsNotNull() {
            addCriterion("temp_member.work_auth is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAuthEqualTo(String value) {
            addCriterion("temp_member.work_auth =", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthNotEqualTo(String value) {
            addCriterion("temp_member.work_auth <>", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthGreaterThan(String value) {
            addCriterion("temp_member.work_auth >", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.work_auth >=", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthLessThan(String value) {
            addCriterion("temp_member.work_auth <", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member.work_auth <=", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthLike(String value) {
            addCriterion("temp_member.work_auth like", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthNotLike(String value) {
            addCriterion("temp_member.work_auth not like", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthIn(List<String> values) {
            addCriterion("temp_member.work_auth in", values, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthNotIn(List<String> values) {
            addCriterion("temp_member.work_auth not in", values, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthBetween(String value1, String value2) {
            addCriterion("temp_member.work_auth between", value1, value2, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member.work_auth not between", value1, value2, "workAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthIsNull() {
            addCriterion("temp_member.vip_auth is null");
            return (Criteria) this;
        }

        public Criteria andVipAuthIsNotNull() {
            addCriterion("temp_member.vip_auth is not null");
            return (Criteria) this;
        }

        public Criteria andVipAuthEqualTo(String value) {
            addCriterion("temp_member.vip_auth =", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthNotEqualTo(String value) {
            addCriterion("temp_member.vip_auth <>", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthGreaterThan(String value) {
            addCriterion("temp_member.vip_auth >", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.vip_auth >=", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthLessThan(String value) {
            addCriterion("temp_member.vip_auth <", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member.vip_auth <=", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthLike(String value) {
            addCriterion("temp_member.vip_auth like", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthNotLike(String value) {
            addCriterion("temp_member.vip_auth not like", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthIn(List<String> values) {
            addCriterion("temp_member.vip_auth in", values, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthNotIn(List<String> values) {
            addCriterion("temp_member.vip_auth not in", values, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthBetween(String value1, String value2) {
            addCriterion("temp_member.vip_auth between", value1, value2, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member.vip_auth not between", value1, value2, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditIsNull() {
            addCriterion("temp_member.member_profile_audit is null");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditIsNotNull() {
            addCriterion("temp_member.member_profile_audit is not null");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditEqualTo(String value) {
            addCriterion("temp_member.member_profile_audit =", value, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditNotEqualTo(String value) {
            addCriterion("temp_member.member_profile_audit <>", value, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditGreaterThan(String value) {
            addCriterion("temp_member.member_profile_audit >", value, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.member_profile_audit >=", value, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditLessThan(String value) {
            addCriterion("temp_member.member_profile_audit <", value, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditLessThanOrEqualTo(String value) {
            addCriterion("temp_member.member_profile_audit <=", value, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditLike(String value) {
            addCriterion("temp_member.member_profile_audit like", value, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditNotLike(String value) {
            addCriterion("temp_member.member_profile_audit not like", value, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditIn(List<String> values) {
            addCriterion("temp_member.member_profile_audit in", values, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditNotIn(List<String> values) {
            addCriterion("temp_member.member_profile_audit not in", values, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditBetween(String value1, String value2) {
            addCriterion("temp_member.member_profile_audit between", value1, value2, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andMemberProfileAuditNotBetween(String value1, String value2) {
            addCriterion("temp_member.member_profile_audit not between", value1, value2, "memberProfileAudit");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNull() {
            addCriterion("temp_member.registration_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNotNull() {
            addCriterion("temp_member.registration_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeEqualTo(Date value) {
            addCriterion("temp_member.registration_time =", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotEqualTo(Date value) {
            addCriterion("temp_member.registration_time <>", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThan(Date value) {
            addCriterion("temp_member.registration_time >", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member.registration_time >=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThan(Date value) {
            addCriterion("temp_member.registration_time <", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member.registration_time <=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIn(List<Date> values) {
            addCriterion("temp_member.registration_time in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotIn(List<Date> values) {
            addCriterion("temp_member.registration_time not in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member.registration_time between", value1, value2, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member.registration_time not between", value1, value2, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("temp_member.member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("temp_member.member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(String value) {
            addCriterion("temp_member.member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(String value) {
            addCriterion("temp_member.member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(String value) {
            addCriterion("temp_member.member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(String value) {
            addCriterion("temp_member.member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_member.member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLike(String value) {
            addCriterion("temp_member.member_type like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotLike(String value) {
            addCriterion("temp_member.member_type not like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<String> values) {
            addCriterion("temp_member.member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<String> values) {
            addCriterion("temp_member.member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(String value1, String value2) {
            addCriterion("temp_member.member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(String value1, String value2) {
            addCriterion("temp_member.member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeIsNull() {
            addCriterion("temp_member.valid_vip_time is null");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeIsNotNull() {
            addCriterion("temp_member.valid_vip_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeEqualTo(Date value) {
            addCriterion("temp_member.valid_vip_time =", value, "validVipTime");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeNotEqualTo(Date value) {
            addCriterion("temp_member.valid_vip_time <>", value, "validVipTime");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeGreaterThan(Date value) {
            addCriterion("temp_member.valid_vip_time >", value, "validVipTime");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member.valid_vip_time >=", value, "validVipTime");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeLessThan(Date value) {
            addCriterion("temp_member.valid_vip_time <", value, "validVipTime");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member.valid_vip_time <=", value, "validVipTime");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeIn(List<Date> values) {
            addCriterion("temp_member.valid_vip_time in", values, "validVipTime");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeNotIn(List<Date> values) {
            addCriterion("temp_member.valid_vip_time not in", values, "validVipTime");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member.valid_vip_time between", value1, value2, "validVipTime");
            return (Criteria) this;
        }

        public Criteria andValidVipTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member.valid_vip_time not between", value1, value2, "validVipTime");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeIsNull() {
            addCriterion("temp_member.expire_vip_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeIsNotNull() {
            addCriterion("temp_member.expire_vip_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeEqualTo(Date value) {
            addCriterion("temp_member.expire_vip_time =", value, "expireVipTime");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeNotEqualTo(Date value) {
            addCriterion("temp_member.expire_vip_time <>", value, "expireVipTime");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeGreaterThan(Date value) {
            addCriterion("temp_member.expire_vip_time >", value, "expireVipTime");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member.expire_vip_time >=", value, "expireVipTime");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeLessThan(Date value) {
            addCriterion("temp_member.expire_vip_time <", value, "expireVipTime");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member.expire_vip_time <=", value, "expireVipTime");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeIn(List<Date> values) {
            addCriterion("temp_member.expire_vip_time in", values, "expireVipTime");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeNotIn(List<Date> values) {
            addCriterion("temp_member.expire_vip_time not in", values, "expireVipTime");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member.expire_vip_time between", value1, value2, "expireVipTime");
            return (Criteria) this;
        }

        public Criteria andExpireVipTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member.expire_vip_time not between", value1, value2, "expireVipTime");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNull() {
            addCriterion("temp_member.attachment is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNotNull() {
            addCriterion("temp_member.attachment is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentEqualTo(String value) {
            addCriterion("temp_member.attachment =", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotEqualTo(String value) {
            addCriterion("temp_member.attachment <>", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThan(String value) {
            addCriterion("temp_member.attachment >", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.attachment >=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThan(String value) {
            addCriterion("temp_member.attachment <", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThanOrEqualTo(String value) {
            addCriterion("temp_member.attachment <=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLike(String value) {
            addCriterion("temp_member.attachment like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotLike(String value) {
            addCriterion("temp_member.attachment not like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentIn(List<String> values) {
            addCriterion("temp_member.attachment in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotIn(List<String> values) {
            addCriterion("temp_member.attachment not in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentBetween(String value1, String value2) {
            addCriterion("temp_member.attachment between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotBetween(String value1, String value2) {
            addCriterion("temp_member.attachment not between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundIsNull() {
            addCriterion("temp_member.educational_background is null");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundIsNotNull() {
            addCriterion("temp_member.educational_background is not null");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundEqualTo(String value) {
            addCriterion("temp_member.educational_background =", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundNotEqualTo(String value) {
            addCriterion("temp_member.educational_background <>", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundGreaterThan(String value) {
            addCriterion("temp_member.educational_background >", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.educational_background >=", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundLessThan(String value) {
            addCriterion("temp_member.educational_background <", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundLessThanOrEqualTo(String value) {
            addCriterion("temp_member.educational_background <=", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundLike(String value) {
            addCriterion("temp_member.educational_background like", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundNotLike(String value) {
            addCriterion("temp_member.educational_background not like", value, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundIn(List<String> values) {
            addCriterion("temp_member.educational_background in", values, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundNotIn(List<String> values) {
            addCriterion("temp_member.educational_background not in", values, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundBetween(String value1, String value2) {
            addCriterion("temp_member.educational_background between", value1, value2, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andEducationalBackgroundNotBetween(String value1, String value2) {
            addCriterion("temp_member.educational_background not between", value1, value2, "educationalBackground");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("temp_member.salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("temp_member.salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Float value) {
            addCriterion("temp_member.salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Float value) {
            addCriterion("temp_member.salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Float value) {
            addCriterion("temp_member.salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member.salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Float value) {
            addCriterion("temp_member.salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Float value) {
            addCriterion("temp_member.salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Float> values) {
            addCriterion("temp_member.salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Float> values) {
            addCriterion("temp_member.salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Float value1, Float value2) {
            addCriterion("temp_member.salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Float value1, Float value2) {
            addCriterion("temp_member.salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionIsNull() {
            addCriterion("temp_member.personal_description is null");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionIsNotNull() {
            addCriterion("temp_member.personal_description is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionEqualTo(String value) {
            addCriterion("temp_member.personal_description =", value, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionNotEqualTo(String value) {
            addCriterion("temp_member.personal_description <>", value, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionGreaterThan(String value) {
            addCriterion("temp_member.personal_description >", value, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.personal_description >=", value, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionLessThan(String value) {
            addCriterion("temp_member.personal_description <", value, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionLessThanOrEqualTo(String value) {
            addCriterion("temp_member.personal_description <=", value, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionLike(String value) {
            addCriterion("temp_member.personal_description like", value, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionNotLike(String value) {
            addCriterion("temp_member.personal_description not like", value, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionIn(List<String> values) {
            addCriterion("temp_member.personal_description in", values, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionNotIn(List<String> values) {
            addCriterion("temp_member.personal_description not in", values, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionBetween(String value1, String value2) {
            addCriterion("temp_member.personal_description between", value1, value2, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andPersonalDescriptionNotBetween(String value1, String value2) {
            addCriterion("temp_member.personal_description not between", value1, value2, "personalDescription");
            return (Criteria) this;
        }

        public Criteria andHometownIsNull() {
            addCriterion("temp_member.hometown is null");
            return (Criteria) this;
        }

        public Criteria andHometownIsNotNull() {
            addCriterion("temp_member.hometown is not null");
            return (Criteria) this;
        }

        public Criteria andHometownEqualTo(String value) {
            addCriterion("temp_member.hometown =", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotEqualTo(String value) {
            addCriterion("temp_member.hometown <>", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThan(String value) {
            addCriterion("temp_member.hometown >", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.hometown >=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThan(String value) {
            addCriterion("temp_member.hometown <", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThanOrEqualTo(String value) {
            addCriterion("temp_member.hometown <=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLike(String value) {
            addCriterion("temp_member.hometown like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotLike(String value) {
            addCriterion("temp_member.hometown not like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownIn(List<String> values) {
            addCriterion("temp_member.hometown in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotIn(List<String> values) {
            addCriterion("temp_member.hometown not in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownBetween(String value1, String value2) {
            addCriterion("temp_member.hometown between", value1, value2, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotBetween(String value1, String value2) {
            addCriterion("temp_member.hometown not between", value1, value2, "hometown");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNull() {
            addCriterion("temp_member.live_address is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNotNull() {
            addCriterion("temp_member.live_address is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressEqualTo(String value) {
            addCriterion("temp_member.live_address =", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotEqualTo(String value) {
            addCriterion("temp_member.live_address <>", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThan(String value) {
            addCriterion("temp_member.live_address >", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.live_address >=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThan(String value) {
            addCriterion("temp_member.live_address <", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_member.live_address <=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLike(String value) {
            addCriterion("temp_member.live_address like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotLike(String value) {
            addCriterion("temp_member.live_address not like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIn(List<String> values) {
            addCriterion("temp_member.live_address in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotIn(List<String> values) {
            addCriterion("temp_member.live_address not in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressBetween(String value1, String value2) {
            addCriterion("temp_member.live_address between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotBetween(String value1, String value2) {
            addCriterion("temp_member.live_address not between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNull() {
            addCriterion("temp_member.home_phone is null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNotNull() {
            addCriterion("temp_member.home_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneEqualTo(String value) {
            addCriterion("temp_member.home_phone =", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotEqualTo(String value) {
            addCriterion("temp_member.home_phone <>", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThan(String value) {
            addCriterion("temp_member.home_phone >", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.home_phone >=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThan(String value) {
            addCriterion("temp_member.home_phone <", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member.home_phone <=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLike(String value) {
            addCriterion("temp_member.home_phone like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotLike(String value) {
            addCriterion("temp_member.home_phone not like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIn(List<String> values) {
            addCriterion("temp_member.home_phone in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotIn(List<String> values) {
            addCriterion("temp_member.home_phone not in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneBetween(String value1, String value2) {
            addCriterion("temp_member.home_phone between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotBetween(String value1, String value2) {
            addCriterion("temp_member.home_phone not between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactIsNull() {
            addCriterion("temp_member.first_contact is null");
            return (Criteria) this;
        }

        public Criteria andFirstContactIsNotNull() {
            addCriterion("temp_member.first_contact is not null");
            return (Criteria) this;
        }

        public Criteria andFirstContactEqualTo(String value) {
            addCriterion("temp_member.first_contact =", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactNotEqualTo(String value) {
            addCriterion("temp_member.first_contact <>", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactGreaterThan(String value) {
            addCriterion("temp_member.first_contact >", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact >=", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactLessThan(String value) {
            addCriterion("temp_member.first_contact <", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactLessThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact <=", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactLike(String value) {
            addCriterion("temp_member.first_contact like", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactNotLike(String value) {
            addCriterion("temp_member.first_contact not like", value, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactIn(List<String> values) {
            addCriterion("temp_member.first_contact in", values, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactNotIn(List<String> values) {
            addCriterion("temp_member.first_contact not in", values, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact between", value1, value2, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactNotBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact not between", value1, value2, "firstContact");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationIsNull() {
            addCriterion("temp_member.first_contact_relation is null");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationIsNotNull() {
            addCriterion("temp_member.first_contact_relation is not null");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationEqualTo(String value) {
            addCriterion("temp_member.first_contact_relation =", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationNotEqualTo(String value) {
            addCriterion("temp_member.first_contact_relation <>", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationGreaterThan(String value) {
            addCriterion("temp_member.first_contact_relation >", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_relation >=", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationLessThan(String value) {
            addCriterion("temp_member.first_contact_relation <", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationLessThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_relation <=", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationLike(String value) {
            addCriterion("temp_member.first_contact_relation like", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationNotLike(String value) {
            addCriterion("temp_member.first_contact_relation not like", value, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationIn(List<String> values) {
            addCriterion("temp_member.first_contact_relation in", values, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationNotIn(List<String> values) {
            addCriterion("temp_member.first_contact_relation not in", values, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_relation between", value1, value2, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactRelationNotBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_relation not between", value1, value2, "firstContactRelation");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneIsNull() {
            addCriterion("temp_member.first_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneIsNotNull() {
            addCriterion("temp_member.first_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneEqualTo(String value) {
            addCriterion("temp_member.first_contact_phone =", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotEqualTo(String value) {
            addCriterion("temp_member.first_contact_phone <>", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneGreaterThan(String value) {
            addCriterion("temp_member.first_contact_phone >", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_phone >=", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneLessThan(String value) {
            addCriterion("temp_member.first_contact_phone <", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_phone <=", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneLike(String value) {
            addCriterion("temp_member.first_contact_phone like", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotLike(String value) {
            addCriterion("temp_member.first_contact_phone not like", value, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneIn(List<String> values) {
            addCriterion("temp_member.first_contact_phone in", values, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotIn(List<String> values) {
            addCriterion("temp_member.first_contact_phone not in", values, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_phone between", value1, value2, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_phone not between", value1, value2, "firstContactPhone");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressIsNull() {
            addCriterion("temp_member.first_contact_address is null");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressIsNotNull() {
            addCriterion("temp_member.first_contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressEqualTo(String value) {
            addCriterion("temp_member.first_contact_address =", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressNotEqualTo(String value) {
            addCriterion("temp_member.first_contact_address <>", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressGreaterThan(String value) {
            addCriterion("temp_member.first_contact_address >", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_address >=", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressLessThan(String value) {
            addCriterion("temp_member.first_contact_address <", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_member.first_contact_address <=", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressLike(String value) {
            addCriterion("temp_member.first_contact_address like", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressNotLike(String value) {
            addCriterion("temp_member.first_contact_address not like", value, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressIn(List<String> values) {
            addCriterion("temp_member.first_contact_address in", values, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressNotIn(List<String> values) {
            addCriterion("temp_member.first_contact_address not in", values, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_address between", value1, value2, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andFirstContactAddressNotBetween(String value1, String value2) {
            addCriterion("temp_member.first_contact_address not between", value1, value2, "firstContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactIsNull() {
            addCriterion("temp_member.second_contact is null");
            return (Criteria) this;
        }

        public Criteria andSecondContactIsNotNull() {
            addCriterion("temp_member.second_contact is not null");
            return (Criteria) this;
        }

        public Criteria andSecondContactEqualTo(String value) {
            addCriterion("temp_member.second_contact =", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotEqualTo(String value) {
            addCriterion("temp_member.second_contact <>", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactGreaterThan(String value) {
            addCriterion("temp_member.second_contact >", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact >=", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactLessThan(String value) {
            addCriterion("temp_member.second_contact <", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactLessThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact <=", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactLike(String value) {
            addCriterion("temp_member.second_contact like", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotLike(String value) {
            addCriterion("temp_member.second_contact not like", value, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactIn(List<String> values) {
            addCriterion("temp_member.second_contact in", values, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotIn(List<String> values) {
            addCriterion("temp_member.second_contact not in", values, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact between", value1, value2, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactNotBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact not between", value1, value2, "secondContact");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationIsNull() {
            addCriterion("temp_member.second_contact_relation is null");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationIsNotNull() {
            addCriterion("temp_member.second_contact_relation is not null");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationEqualTo(String value) {
            addCriterion("temp_member.second_contact_relation =", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationNotEqualTo(String value) {
            addCriterion("temp_member.second_contact_relation <>", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationGreaterThan(String value) {
            addCriterion("temp_member.second_contact_relation >", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_relation >=", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationLessThan(String value) {
            addCriterion("temp_member.second_contact_relation <", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationLessThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_relation <=", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationLike(String value) {
            addCriterion("temp_member.second_contact_relation like", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationNotLike(String value) {
            addCriterion("temp_member.second_contact_relation not like", value, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationIn(List<String> values) {
            addCriterion("temp_member.second_contact_relation in", values, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationNotIn(List<String> values) {
            addCriterion("temp_member.second_contact_relation not in", values, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_relation between", value1, value2, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactRelationNotBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_relation not between", value1, value2, "secondContactRelation");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneIsNull() {
            addCriterion("temp_member.second_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneIsNotNull() {
            addCriterion("temp_member.second_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneEqualTo(String value) {
            addCriterion("temp_member.second_contact_phone =", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneNotEqualTo(String value) {
            addCriterion("temp_member.second_contact_phone <>", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneGreaterThan(String value) {
            addCriterion("temp_member.second_contact_phone >", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_phone >=", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneLessThan(String value) {
            addCriterion("temp_member.second_contact_phone <", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_phone <=", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneLike(String value) {
            addCriterion("temp_member.second_contact_phone like", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneNotLike(String value) {
            addCriterion("temp_member.second_contact_phone not like", value, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneIn(List<String> values) {
            addCriterion("temp_member.second_contact_phone in", values, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneNotIn(List<String> values) {
            addCriterion("temp_member.second_contact_phone not in", values, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_phone between", value1, value2, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_phone not between", value1, value2, "secondContactPhone");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressIsNull() {
            addCriterion("temp_member.second_contact_address is null");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressIsNotNull() {
            addCriterion("temp_member.second_contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressEqualTo(String value) {
            addCriterion("temp_member.second_contact_address =", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressNotEqualTo(String value) {
            addCriterion("temp_member.second_contact_address <>", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressGreaterThan(String value) {
            addCriterion("temp_member.second_contact_address >", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_address >=", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressLessThan(String value) {
            addCriterion("temp_member.second_contact_address <", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressLessThanOrEqualTo(String value) {
            addCriterion("temp_member.second_contact_address <=", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressLike(String value) {
            addCriterion("temp_member.second_contact_address like", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressNotLike(String value) {
            addCriterion("temp_member.second_contact_address not like", value, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressIn(List<String> values) {
            addCriterion("temp_member.second_contact_address in", values, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressNotIn(List<String> values) {
            addCriterion("temp_member.second_contact_address not in", values, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_address between", value1, value2, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andSecondContactAddressNotBetween(String value1, String value2) {
            addCriterion("temp_member.second_contact_address not between", value1, value2, "secondContactAddress");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("temp_member.unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("temp_member.unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("temp_member.unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("temp_member.unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("temp_member.unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("temp_member.unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("temp_member.unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("temp_member.unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("temp_member.unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("temp_member.unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("temp_member.unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("temp_member.unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("temp_member.unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneIsNull() {
            addCriterion("temp_member.unit_phone is null");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneIsNotNull() {
            addCriterion("temp_member.unit_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneEqualTo(String value) {
            addCriterion("temp_member.unit_phone =", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotEqualTo(String value) {
            addCriterion("temp_member.unit_phone <>", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneGreaterThan(String value) {
            addCriterion("temp_member.unit_phone >", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.unit_phone >=", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneLessThan(String value) {
            addCriterion("temp_member.unit_phone <", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member.unit_phone <=", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneLike(String value) {
            addCriterion("temp_member.unit_phone like", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotLike(String value) {
            addCriterion("temp_member.unit_phone not like", value, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneIn(List<String> values) {
            addCriterion("temp_member.unit_phone in", values, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotIn(List<String> values) {
            addCriterion("temp_member.unit_phone not in", values, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneBetween(String value1, String value2) {
            addCriterion("temp_member.unit_phone between", value1, value2, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_member.unit_phone not between", value1, value2, "unitPhone");
            return (Criteria) this;
        }

        public Criteria andUnitAdressIsNull() {
            addCriterion("temp_member.unit_adress is null");
            return (Criteria) this;
        }

        public Criteria andUnitAdressIsNotNull() {
            addCriterion("temp_member.unit_adress is not null");
            return (Criteria) this;
        }

        public Criteria andUnitAdressEqualTo(String value) {
            addCriterion("temp_member.unit_adress =", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressNotEqualTo(String value) {
            addCriterion("temp_member.unit_adress <>", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressGreaterThan(String value) {
            addCriterion("temp_member.unit_adress >", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.unit_adress >=", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressLessThan(String value) {
            addCriterion("temp_member.unit_adress <", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressLessThanOrEqualTo(String value) {
            addCriterion("temp_member.unit_adress <=", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressLike(String value) {
            addCriterion("temp_member.unit_adress like", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressNotLike(String value) {
            addCriterion("temp_member.unit_adress not like", value, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressIn(List<String> values) {
            addCriterion("temp_member.unit_adress in", values, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressNotIn(List<String> values) {
            addCriterion("temp_member.unit_adress not in", values, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressBetween(String value1, String value2) {
            addCriterion("temp_member.unit_adress between", value1, value2, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andUnitAdressNotBetween(String value1, String value2) {
            addCriterion("temp_member.unit_adress not between", value1, value2, "unitAdress");
            return (Criteria) this;
        }

        public Criteria andWorkAgeIsNull() {
            addCriterion("temp_member.work_age is null");
            return (Criteria) this;
        }

        public Criteria andWorkAgeIsNotNull() {
            addCriterion("temp_member.work_age is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAgeEqualTo(Integer value) {
            addCriterion("temp_member.work_age =", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeNotEqualTo(Integer value) {
            addCriterion("temp_member.work_age <>", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeGreaterThan(Integer value) {
            addCriterion("temp_member.work_age >", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member.work_age >=", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeLessThan(Integer value) {
            addCriterion("temp_member.work_age <", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member.work_age <=", value, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeIn(List<Integer> values) {
            addCriterion("temp_member.work_age in", values, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeNotIn(List<Integer> values) {
            addCriterion("temp_member.work_age not in", values, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeBetween(Integer value1, Integer value2) {
            addCriterion("temp_member.work_age between", value1, value2, "workAge");
            return (Criteria) this;
        }

        public Criteria andWorkAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member.work_age not between", value1, value2, "workAge");
            return (Criteria) this;
        }

        public Criteria andProofPersonIsNull() {
            addCriterion("temp_member.proof_person is null");
            return (Criteria) this;
        }

        public Criteria andProofPersonIsNotNull() {
            addCriterion("temp_member.proof_person is not null");
            return (Criteria) this;
        }

        public Criteria andProofPersonEqualTo(String value) {
            addCriterion("temp_member.proof_person =", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonNotEqualTo(String value) {
            addCriterion("temp_member.proof_person <>", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonGreaterThan(String value) {
            addCriterion("temp_member.proof_person >", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.proof_person >=", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonLessThan(String value) {
            addCriterion("temp_member.proof_person <", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonLessThanOrEqualTo(String value) {
            addCriterion("temp_member.proof_person <=", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonLike(String value) {
            addCriterion("temp_member.proof_person like", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonNotLike(String value) {
            addCriterion("temp_member.proof_person not like", value, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonIn(List<String> values) {
            addCriterion("temp_member.proof_person in", values, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonNotIn(List<String> values) {
            addCriterion("temp_member.proof_person not in", values, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonBetween(String value1, String value2) {
            addCriterion("temp_member.proof_person between", value1, value2, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonNotBetween(String value1, String value2) {
            addCriterion("temp_member.proof_person not between", value1, value2, "proofPerson");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneIsNull() {
            addCriterion("temp_member.proof_person_phone is null");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneIsNotNull() {
            addCriterion("temp_member.proof_person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneEqualTo(String value) {
            addCriterion("temp_member.proof_person_phone =", value, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneNotEqualTo(String value) {
            addCriterion("temp_member.proof_person_phone <>", value, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneGreaterThan(String value) {
            addCriterion("temp_member.proof_person_phone >", value, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.proof_person_phone >=", value, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneLessThan(String value) {
            addCriterion("temp_member.proof_person_phone <", value, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_member.proof_person_phone <=", value, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneLike(String value) {
            addCriterion("temp_member.proof_person_phone like", value, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneNotLike(String value) {
            addCriterion("temp_member.proof_person_phone not like", value, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneIn(List<String> values) {
            addCriterion("temp_member.proof_person_phone in", values, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneNotIn(List<String> values) {
            addCriterion("temp_member.proof_person_phone not in", values, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneBetween(String value1, String value2) {
            addCriterion("temp_member.proof_person_phone between", value1, value2, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andProofPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_member.proof_person_phone not between", value1, value2, "proofPersonPhone");
            return (Criteria) this;
        }

        public Criteria andFreezeIsNull() {
            addCriterion("temp_member.freeze is null");
            return (Criteria) this;
        }

        public Criteria andFreezeIsNotNull() {
            addCriterion("temp_member.freeze is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeEqualTo(String value) {
            addCriterion("temp_member.freeze =", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotEqualTo(String value) {
            addCriterion("temp_member.freeze <>", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeGreaterThan(String value) {
            addCriterion("temp_member.freeze >", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.freeze >=", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLessThan(String value) {
            addCriterion("temp_member.freeze <", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLessThanOrEqualTo(String value) {
            addCriterion("temp_member.freeze <=", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLike(String value) {
            addCriterion("temp_member.freeze like", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotLike(String value) {
            addCriterion("temp_member.freeze not like", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeIn(List<String> values) {
            addCriterion("temp_member.freeze in", values, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotIn(List<String> values) {
            addCriterion("temp_member.freeze not in", values, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeBetween(String value1, String value2) {
            addCriterion("temp_member.freeze between", value1, value2, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotBetween(String value1, String value2) {
            addCriterion("temp_member.freeze not between", value1, value2, "freeze");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("temp_member.customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("temp_member.customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("temp_member.customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("temp_member.customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("temp_member.customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("temp_member.customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_member.customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("temp_member.customer_type like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("temp_member.customer_type not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("temp_member.customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("temp_member.customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("temp_member.customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("temp_member.customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceIsNull() {
            addCriterion("temp_member.customer_service is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceIsNotNull() {
            addCriterion("temp_member.customer_service is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceEqualTo(String value) {
            addCriterion("temp_member.customer_service =", value, "customerService");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNotEqualTo(String value) {
            addCriterion("temp_member.customer_service <>", value, "customerService");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceGreaterThan(String value) {
            addCriterion("temp_member.customer_service >", value, "customerService");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.customer_service >=", value, "customerService");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceLessThan(String value) {
            addCriterion("temp_member.customer_service <", value, "customerService");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceLessThanOrEqualTo(String value) {
            addCriterion("temp_member.customer_service <=", value, "customerService");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceLike(String value) {
            addCriterion("temp_member.customer_service like", value, "customerService");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNotLike(String value) {
            addCriterion("temp_member.customer_service not like", value, "customerService");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceIn(List<String> values) {
            addCriterion("temp_member.customer_service in", values, "customerService");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNotIn(List<String> values) {
            addCriterion("temp_member.customer_service not in", values, "customerService");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceBetween(String value1, String value2) {
            addCriterion("temp_member.customer_service between", value1, value2, "customerService");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceNotBetween(String value1, String value2) {
            addCriterion("temp_member.customer_service not between", value1, value2, "customerService");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsIsNull() {
            addCriterion("temp_member.investment_credits is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsIsNotNull() {
            addCriterion("temp_member.investment_credits is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsEqualTo(Integer value) {
            addCriterion("temp_member.investment_credits =", value, "investmentCredits");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsNotEqualTo(Integer value) {
            addCriterion("temp_member.investment_credits <>", value, "investmentCredits");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsGreaterThan(Integer value) {
            addCriterion("temp_member.investment_credits >", value, "investmentCredits");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member.investment_credits >=", value, "investmentCredits");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsLessThan(Integer value) {
            addCriterion("temp_member.investment_credits <", value, "investmentCredits");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member.investment_credits <=", value, "investmentCredits");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsIn(List<Integer> values) {
            addCriterion("temp_member.investment_credits in", values, "investmentCredits");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsNotIn(List<Integer> values) {
            addCriterion("temp_member.investment_credits not in", values, "investmentCredits");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsBetween(Integer value1, Integer value2) {
            addCriterion("temp_member.investment_credits between", value1, value2, "investmentCredits");
            return (Criteria) this;
        }

        public Criteria andInvestmentCreditsNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member.investment_credits not between", value1, value2, "investmentCredits");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("temp_member.bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("temp_member.bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("temp_member.bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("temp_member.bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("temp_member.bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("temp_member.bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member.bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("temp_member.bank_id like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("temp_member.bank_id not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("temp_member.bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("temp_member.bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("temp_member.bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("temp_member.bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_member.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_member.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_member.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_member.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_member.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_member.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_member.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_member.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_member.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_member.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_member.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_member.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNull() {
            addCriterion("temp_member.creater_time is null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNotNull() {
            addCriterion("temp_member.creater_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeEqualTo(Date value) {
            addCriterion("temp_member.creater_time =", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotEqualTo(Date value) {
            addCriterion("temp_member.creater_time <>", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThan(Date value) {
            addCriterion("temp_member.creater_time >", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member.creater_time >=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThan(Date value) {
            addCriterion("temp_member.creater_time <", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member.creater_time <=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIn(List<Date> values) {
            addCriterion("temp_member.creater_time in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotIn(List<Date> values) {
            addCriterion("temp_member.creater_time not in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member.creater_time between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member.creater_time not between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_member.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_member.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_member.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_member.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_member.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_member.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_member.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_member.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_member.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_member.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_member.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_member.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_member.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_member.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_member.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_member.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_member.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_member.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_member.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_member.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member.update_time not between", value1, value2, "updateTime");
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