package com.glacier.netloan.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberAuthExample() {
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
            addCriterion("temp_member_auth.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member_auth.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member_auth.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member_auth.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member_auth.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member_auth.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member_auth.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member_auth.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member_auth.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member_auth.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member_auth.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andInfoAuthIsNull() {
            addCriterion("temp_member_auth.info_auth is null");
            return (Criteria) this;
        }

        public Criteria andInfoAuthIsNotNull() {
            addCriterion("temp_member_auth.info_auth is not null");
            return (Criteria) this;
        }

        public Criteria andInfoAuthEqualTo(String value) {
            addCriterion("temp_member_auth.info_auth =", value, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuthNotEqualTo(String value) {
            addCriterion("temp_member_auth.info_auth <>", value, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuthGreaterThan(String value) {
            addCriterion("temp_member_auth.info_auth >", value, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.info_auth >=", value, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuthLessThan(String value) {
            addCriterion("temp_member_auth.info_auth <", value, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.info_auth <=", value, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuthLike(String value) {
            addCriterion("temp_member_auth.info_auth like", value, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuthNotLike(String value) {
            addCriterion("temp_member_auth.info_auth not like", value, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuthIn(List<String> values) {
            addCriterion("temp_member_auth.info_auth in", values, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuthNotIn(List<String> values) {
            addCriterion("temp_member_auth.info_auth not in", values, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuthBetween(String value1, String value2) {
            addCriterion("temp_member_auth.info_auth between", value1, value2, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.info_auth not between", value1, value2, "infoAuth");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorIsNull() {
            addCriterion("temp_member_auth.info_auditor is null");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorIsNotNull() {
            addCriterion("temp_member_auth.info_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorEqualTo(String value) {
            addCriterion("temp_member_auth.info_auditor =", value, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorNotEqualTo(String value) {
            addCriterion("temp_member_auth.info_auditor <>", value, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorGreaterThan(String value) {
            addCriterion("temp_member_auth.info_auditor >", value, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.info_auditor >=", value, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorLessThan(String value) {
            addCriterion("temp_member_auth.info_auditor <", value, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.info_auditor <=", value, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorLike(String value) {
            addCriterion("temp_member_auth.info_auditor like", value, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorNotLike(String value) {
            addCriterion("temp_member_auth.info_auditor not like", value, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorIn(List<String> values) {
            addCriterion("temp_member_auth.info_auditor in", values, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorNotIn(List<String> values) {
            addCriterion("temp_member_auth.info_auditor not in", values, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorBetween(String value1, String value2) {
            addCriterion("temp_member_auth.info_auditor between", value1, value2, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.info_auditor not between", value1, value2, "infoAuditor");
            return (Criteria) this;
        }

        public Criteria andInfoTimeIsNull() {
            addCriterion("temp_member_auth.info_time is null");
            return (Criteria) this;
        }

        public Criteria andInfoTimeIsNotNull() {
            addCriterion("temp_member_auth.info_time is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTimeEqualTo(Date value) {
            addCriterion("temp_member_auth.info_time =", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeNotEqualTo(Date value) {
            addCriterion("temp_member_auth.info_time <>", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeGreaterThan(Date value) {
            addCriterion("temp_member_auth.info_time >", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.info_time >=", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeLessThan(Date value) {
            addCriterion("temp_member_auth.info_time <", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.info_time <=", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeIn(List<Date> values) {
            addCriterion("temp_member_auth.info_time in", values, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeNotIn(List<Date> values) {
            addCriterion("temp_member_auth.info_time not in", values, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.info_time between", value1, value2, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.info_time not between", value1, value2, "infoTime");
            return (Criteria) this;
        }

        public Criteria andVipAuthIsNull() {
            addCriterion("temp_member_auth.vip_auth is null");
            return (Criteria) this;
        }

        public Criteria andVipAuthIsNotNull() {
            addCriterion("temp_member_auth.vip_auth is not null");
            return (Criteria) this;
        }

        public Criteria andVipAuthEqualTo(String value) {
            addCriterion("temp_member_auth.vip_auth =", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthNotEqualTo(String value) {
            addCriterion("temp_member_auth.vip_auth <>", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthGreaterThan(String value) {
            addCriterion("temp_member_auth.vip_auth >", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.vip_auth >=", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthLessThan(String value) {
            addCriterion("temp_member_auth.vip_auth <", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.vip_auth <=", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthLike(String value) {
            addCriterion("temp_member_auth.vip_auth like", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthNotLike(String value) {
            addCriterion("temp_member_auth.vip_auth not like", value, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthIn(List<String> values) {
            addCriterion("temp_member_auth.vip_auth in", values, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthNotIn(List<String> values) {
            addCriterion("temp_member_auth.vip_auth not in", values, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthBetween(String value1, String value2) {
            addCriterion("temp_member_auth.vip_auth between", value1, value2, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.vip_auth not between", value1, value2, "vipAuth");
            return (Criteria) this;
        }

        public Criteria andVipAuditorIsNull() {
            addCriterion("temp_member_auth.vip_auditor is null");
            return (Criteria) this;
        }

        public Criteria andVipAuditorIsNotNull() {
            addCriterion("temp_member_auth.vip_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andVipAuditorEqualTo(String value) {
            addCriterion("temp_member_auth.vip_auditor =", value, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipAuditorNotEqualTo(String value) {
            addCriterion("temp_member_auth.vip_auditor <>", value, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipAuditorGreaterThan(String value) {
            addCriterion("temp_member_auth.vip_auditor >", value, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.vip_auditor >=", value, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipAuditorLessThan(String value) {
            addCriterion("temp_member_auth.vip_auditor <", value, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.vip_auditor <=", value, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipAuditorLike(String value) {
            addCriterion("temp_member_auth.vip_auditor like", value, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipAuditorNotLike(String value) {
            addCriterion("temp_member_auth.vip_auditor not like", value, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipAuditorIn(List<String> values) {
            addCriterion("temp_member_auth.vip_auditor in", values, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipAuditorNotIn(List<String> values) {
            addCriterion("temp_member_auth.vip_auditor not in", values, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipAuditorBetween(String value1, String value2) {
            addCriterion("temp_member_auth.vip_auditor between", value1, value2, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.vip_auditor not between", value1, value2, "vipAuditor");
            return (Criteria) this;
        }

        public Criteria andVipTimeIsNull() {
            addCriterion("temp_member_auth.vip_time is null");
            return (Criteria) this;
        }

        public Criteria andVipTimeIsNotNull() {
            addCriterion("temp_member_auth.vip_time is not null");
            return (Criteria) this;
        }

        public Criteria andVipTimeEqualTo(Date value) {
            addCriterion("temp_member_auth.vip_time =", value, "vipTime");
            return (Criteria) this;
        }

        public Criteria andVipTimeNotEqualTo(Date value) {
            addCriterion("temp_member_auth.vip_time <>", value, "vipTime");
            return (Criteria) this;
        }

        public Criteria andVipTimeGreaterThan(Date value) {
            addCriterion("temp_member_auth.vip_time >", value, "vipTime");
            return (Criteria) this;
        }

        public Criteria andVipTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.vip_time >=", value, "vipTime");
            return (Criteria) this;
        }

        public Criteria andVipTimeLessThan(Date value) {
            addCriterion("temp_member_auth.vip_time <", value, "vipTime");
            return (Criteria) this;
        }

        public Criteria andVipTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.vip_time <=", value, "vipTime");
            return (Criteria) this;
        }

        public Criteria andVipTimeIn(List<Date> values) {
            addCriterion("temp_member_auth.vip_time in", values, "vipTime");
            return (Criteria) this;
        }

        public Criteria andVipTimeNotIn(List<Date> values) {
            addCriterion("temp_member_auth.vip_time not in", values, "vipTime");
            return (Criteria) this;
        }

        public Criteria andVipTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.vip_time between", value1, value2, "vipTime");
            return (Criteria) this;
        }

        public Criteria andVipTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.vip_time not between", value1, value2, "vipTime");
            return (Criteria) this;
        }

        public Criteria andEmailAuthIsNull() {
            addCriterion("temp_member_auth.email_auth is null");
            return (Criteria) this;
        }

        public Criteria andEmailAuthIsNotNull() {
            addCriterion("temp_member_auth.email_auth is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAuthEqualTo(String value) {
            addCriterion("temp_member_auth.email_auth =", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthNotEqualTo(String value) {
            addCriterion("temp_member_auth.email_auth <>", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthGreaterThan(String value) {
            addCriterion("temp_member_auth.email_auth >", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.email_auth >=", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthLessThan(String value) {
            addCriterion("temp_member_auth.email_auth <", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.email_auth <=", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthLike(String value) {
            addCriterion("temp_member_auth.email_auth like", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthNotLike(String value) {
            addCriterion("temp_member_auth.email_auth not like", value, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthIn(List<String> values) {
            addCriterion("temp_member_auth.email_auth in", values, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthNotIn(List<String> values) {
            addCriterion("temp_member_auth.email_auth not in", values, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthBetween(String value1, String value2) {
            addCriterion("temp_member_auth.email_auth between", value1, value2, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.email_auth not between", value1, value2, "emailAuth");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorIsNull() {
            addCriterion("temp_member_auth.email_auditor is null");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorIsNotNull() {
            addCriterion("temp_member_auth.email_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorEqualTo(String value) {
            addCriterion("temp_member_auth.email_auditor =", value, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorNotEqualTo(String value) {
            addCriterion("temp_member_auth.email_auditor <>", value, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorGreaterThan(String value) {
            addCriterion("temp_member_auth.email_auditor >", value, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.email_auditor >=", value, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorLessThan(String value) {
            addCriterion("temp_member_auth.email_auditor <", value, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.email_auditor <=", value, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorLike(String value) {
            addCriterion("temp_member_auth.email_auditor like", value, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorNotLike(String value) {
            addCriterion("temp_member_auth.email_auditor not like", value, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorIn(List<String> values) {
            addCriterion("temp_member_auth.email_auditor in", values, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorNotIn(List<String> values) {
            addCriterion("temp_member_auth.email_auditor not in", values, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorBetween(String value1, String value2) {
            addCriterion("temp_member_auth.email_auditor between", value1, value2, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.email_auditor not between", value1, value2, "emailAuditor");
            return (Criteria) this;
        }

        public Criteria andEmailTimeIsNull() {
            addCriterion("temp_member_auth.email_time is null");
            return (Criteria) this;
        }

        public Criteria andEmailTimeIsNotNull() {
            addCriterion("temp_member_auth.email_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTimeEqualTo(Date value) {
            addCriterion("temp_member_auth.email_time =", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeNotEqualTo(Date value) {
            addCriterion("temp_member_auth.email_time <>", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeGreaterThan(Date value) {
            addCriterion("temp_member_auth.email_time >", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.email_time >=", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeLessThan(Date value) {
            addCriterion("temp_member_auth.email_time <", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.email_time <=", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeIn(List<Date> values) {
            addCriterion("temp_member_auth.email_time in", values, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeNotIn(List<Date> values) {
            addCriterion("temp_member_auth.email_time not in", values, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.email_time between", value1, value2, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.email_time not between", value1, value2, "emailTime");
            return (Criteria) this;
        }

        public Criteria andMobileAuthIsNull() {
            addCriterion("temp_member_auth.mobile_auth is null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthIsNotNull() {
            addCriterion("temp_member_auth.mobile_auth is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthEqualTo(String value) {
            addCriterion("temp_member_auth.mobile_auth =", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotEqualTo(String value) {
            addCriterion("temp_member_auth.mobile_auth <>", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthGreaterThan(String value) {
            addCriterion("temp_member_auth.mobile_auth >", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.mobile_auth >=", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthLessThan(String value) {
            addCriterion("temp_member_auth.mobile_auth <", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.mobile_auth <=", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthLike(String value) {
            addCriterion("temp_member_auth.mobile_auth like", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotLike(String value) {
            addCriterion("temp_member_auth.mobile_auth not like", value, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthIn(List<String> values) {
            addCriterion("temp_member_auth.mobile_auth in", values, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotIn(List<String> values) {
            addCriterion("temp_member_auth.mobile_auth not in", values, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthBetween(String value1, String value2) {
            addCriterion("temp_member_auth.mobile_auth between", value1, value2, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.mobile_auth not between", value1, value2, "mobileAuth");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorIsNull() {
            addCriterion("temp_member_auth.mobile_auditor is null");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorIsNotNull() {
            addCriterion("temp_member_auth.mobile_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorEqualTo(String value) {
            addCriterion("temp_member_auth.mobile_auditor =", value, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorNotEqualTo(String value) {
            addCriterion("temp_member_auth.mobile_auditor <>", value, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorGreaterThan(String value) {
            addCriterion("temp_member_auth.mobile_auditor >", value, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.mobile_auditor >=", value, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorLessThan(String value) {
            addCriterion("temp_member_auth.mobile_auditor <", value, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.mobile_auditor <=", value, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorLike(String value) {
            addCriterion("temp_member_auth.mobile_auditor like", value, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorNotLike(String value) {
            addCriterion("temp_member_auth.mobile_auditor not like", value, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorIn(List<String> values) {
            addCriterion("temp_member_auth.mobile_auditor in", values, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorNotIn(List<String> values) {
            addCriterion("temp_member_auth.mobile_auditor not in", values, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorBetween(String value1, String value2) {
            addCriterion("temp_member_auth.mobile_auditor between", value1, value2, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.mobile_auditor not between", value1, value2, "mobileAuditor");
            return (Criteria) this;
        }

        public Criteria andMobileTimeIsNull() {
            addCriterion("temp_member_auth.mobile_time is null");
            return (Criteria) this;
        }

        public Criteria andMobileTimeIsNotNull() {
            addCriterion("temp_member_auth.mobile_time is not null");
            return (Criteria) this;
        }

        public Criteria andMobileTimeEqualTo(Date value) {
            addCriterion("temp_member_auth.mobile_time =", value, "mobileTime");
            return (Criteria) this;
        }

        public Criteria andMobileTimeNotEqualTo(Date value) {
            addCriterion("temp_member_auth.mobile_time <>", value, "mobileTime");
            return (Criteria) this;
        }

        public Criteria andMobileTimeGreaterThan(Date value) {
            addCriterion("temp_member_auth.mobile_time >", value, "mobileTime");
            return (Criteria) this;
        }

        public Criteria andMobileTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.mobile_time >=", value, "mobileTime");
            return (Criteria) this;
        }

        public Criteria andMobileTimeLessThan(Date value) {
            addCriterion("temp_member_auth.mobile_time <", value, "mobileTime");
            return (Criteria) this;
        }

        public Criteria andMobileTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.mobile_time <=", value, "mobileTime");
            return (Criteria) this;
        }

        public Criteria andMobileTimeIn(List<Date> values) {
            addCriterion("temp_member_auth.mobile_time in", values, "mobileTime");
            return (Criteria) this;
        }

        public Criteria andMobileTimeNotIn(List<Date> values) {
            addCriterion("temp_member_auth.mobile_time not in", values, "mobileTime");
            return (Criteria) this;
        }

        public Criteria andMobileTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.mobile_time between", value1, value2, "mobileTime");
            return (Criteria) this;
        }

        public Criteria andMobileTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.mobile_time not between", value1, value2, "mobileTime");
            return (Criteria) this;
        }

        public Criteria andCreditAuthIsNull() {
            addCriterion("temp_member_auth.credit_auth is null");
            return (Criteria) this;
        }

        public Criteria andCreditAuthIsNotNull() {
            addCriterion("temp_member_auth.credit_auth is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAuthEqualTo(String value) {
            addCriterion("temp_member_auth.credit_auth =", value, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuthNotEqualTo(String value) {
            addCriterion("temp_member_auth.credit_auth <>", value, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuthGreaterThan(String value) {
            addCriterion("temp_member_auth.credit_auth >", value, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.credit_auth >=", value, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuthLessThan(String value) {
            addCriterion("temp_member_auth.credit_auth <", value, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.credit_auth <=", value, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuthLike(String value) {
            addCriterion("temp_member_auth.credit_auth like", value, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuthNotLike(String value) {
            addCriterion("temp_member_auth.credit_auth not like", value, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuthIn(List<String> values) {
            addCriterion("temp_member_auth.credit_auth in", values, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuthNotIn(List<String> values) {
            addCriterion("temp_member_auth.credit_auth not in", values, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuthBetween(String value1, String value2) {
            addCriterion("temp_member_auth.credit_auth between", value1, value2, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.credit_auth not between", value1, value2, "creditAuth");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorIsNull() {
            addCriterion("temp_member_auth.credit_auditor is null");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorIsNotNull() {
            addCriterion("temp_member_auth.credit_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorEqualTo(String value) {
            addCriterion("temp_member_auth.credit_auditor =", value, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorNotEqualTo(String value) {
            addCriterion("temp_member_auth.credit_auditor <>", value, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorGreaterThan(String value) {
            addCriterion("temp_member_auth.credit_auditor >", value, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.credit_auditor >=", value, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorLessThan(String value) {
            addCriterion("temp_member_auth.credit_auditor <", value, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.credit_auditor <=", value, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorLike(String value) {
            addCriterion("temp_member_auth.credit_auditor like", value, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorNotLike(String value) {
            addCriterion("temp_member_auth.credit_auditor not like", value, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorIn(List<String> values) {
            addCriterion("temp_member_auth.credit_auditor in", values, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorNotIn(List<String> values) {
            addCriterion("temp_member_auth.credit_auditor not in", values, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorBetween(String value1, String value2) {
            addCriterion("temp_member_auth.credit_auditor between", value1, value2, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.credit_auditor not between", value1, value2, "creditAuditor");
            return (Criteria) this;
        }

        public Criteria andCreditTimeIsNull() {
            addCriterion("temp_member_auth.credit_time is null");
            return (Criteria) this;
        }

        public Criteria andCreditTimeIsNotNull() {
            addCriterion("temp_member_auth.credit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreditTimeEqualTo(Date value) {
            addCriterion("temp_member_auth.credit_time =", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeNotEqualTo(Date value) {
            addCriterion("temp_member_auth.credit_time <>", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeGreaterThan(Date value) {
            addCriterion("temp_member_auth.credit_time >", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.credit_time >=", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeLessThan(Date value) {
            addCriterion("temp_member_auth.credit_time <", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.credit_time <=", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeIn(List<Date> values) {
            addCriterion("temp_member_auth.credit_time in", values, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeNotIn(List<Date> values) {
            addCriterion("temp_member_auth.credit_time not in", values, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.credit_time between", value1, value2, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.credit_time not between", value1, value2, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthIsNull() {
            addCriterion("temp_member_auth.company_auth is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthIsNotNull() {
            addCriterion("temp_member_auth.company_auth is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthEqualTo(String value) {
            addCriterion("temp_member_auth.company_auth =", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthNotEqualTo(String value) {
            addCriterion("temp_member_auth.company_auth <>", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthGreaterThan(String value) {
            addCriterion("temp_member_auth.company_auth >", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.company_auth >=", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthLessThan(String value) {
            addCriterion("temp_member_auth.company_auth <", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.company_auth <=", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthLike(String value) {
            addCriterion("temp_member_auth.company_auth like", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthNotLike(String value) {
            addCriterion("temp_member_auth.company_auth not like", value, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthIn(List<String> values) {
            addCriterion("temp_member_auth.company_auth in", values, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthNotIn(List<String> values) {
            addCriterion("temp_member_auth.company_auth not in", values, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthBetween(String value1, String value2) {
            addCriterion("temp_member_auth.company_auth between", value1, value2, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.company_auth not between", value1, value2, "companyAuth");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorIsNull() {
            addCriterion("temp_member_auth.company_auditor is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorIsNotNull() {
            addCriterion("temp_member_auth.company_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorEqualTo(String value) {
            addCriterion("temp_member_auth.company_auditor =", value, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorNotEqualTo(String value) {
            addCriterion("temp_member_auth.company_auditor <>", value, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorGreaterThan(String value) {
            addCriterion("temp_member_auth.company_auditor >", value, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.company_auditor >=", value, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorLessThan(String value) {
            addCriterion("temp_member_auth.company_auditor <", value, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.company_auditor <=", value, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorLike(String value) {
            addCriterion("temp_member_auth.company_auditor like", value, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorNotLike(String value) {
            addCriterion("temp_member_auth.company_auditor not like", value, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorIn(List<String> values) {
            addCriterion("temp_member_auth.company_auditor in", values, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorNotIn(List<String> values) {
            addCriterion("temp_member_auth.company_auditor not in", values, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorBetween(String value1, String value2) {
            addCriterion("temp_member_auth.company_auditor between", value1, value2, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.company_auditor not between", value1, value2, "companyAuditor");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeIsNull() {
            addCriterion("temp_member_auth.company_time is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeIsNotNull() {
            addCriterion("temp_member_auth.company_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeEqualTo(Date value) {
            addCriterion("temp_member_auth.company_time =", value, "companyTime");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeNotEqualTo(Date value) {
            addCriterion("temp_member_auth.company_time <>", value, "companyTime");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeGreaterThan(Date value) {
            addCriterion("temp_member_auth.company_time >", value, "companyTime");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.company_time >=", value, "companyTime");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeLessThan(Date value) {
            addCriterion("temp_member_auth.company_time <", value, "companyTime");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.company_time <=", value, "companyTime");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeIn(List<Date> values) {
            addCriterion("temp_member_auth.company_time in", values, "companyTime");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeNotIn(List<Date> values) {
            addCriterion("temp_member_auth.company_time not in", values, "companyTime");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.company_time between", value1, value2, "companyTime");
            return (Criteria) this;
        }

        public Criteria andCompanyTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.company_time not between", value1, value2, "companyTime");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthIsNull() {
            addCriterion("temp_member_auth.real_name_auth is null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthIsNotNull() {
            addCriterion("temp_member_auth.real_name_auth is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthEqualTo(String value) {
            addCriterion("temp_member_auth.real_name_auth =", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthNotEqualTo(String value) {
            addCriterion("temp_member_auth.real_name_auth <>", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthGreaterThan(String value) {
            addCriterion("temp_member_auth.real_name_auth >", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.real_name_auth >=", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthLessThan(String value) {
            addCriterion("temp_member_auth.real_name_auth <", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.real_name_auth <=", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthLike(String value) {
            addCriterion("temp_member_auth.real_name_auth like", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthNotLike(String value) {
            addCriterion("temp_member_auth.real_name_auth not like", value, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthIn(List<String> values) {
            addCriterion("temp_member_auth.real_name_auth in", values, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthNotIn(List<String> values) {
            addCriterion("temp_member_auth.real_name_auth not in", values, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthBetween(String value1, String value2) {
            addCriterion("temp_member_auth.real_name_auth between", value1, value2, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.real_name_auth not between", value1, value2, "realNameAuth");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorIsNull() {
            addCriterion("temp_member_auth.real_name_auditor is null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorIsNotNull() {
            addCriterion("temp_member_auth.real_name_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorEqualTo(String value) {
            addCriterion("temp_member_auth.real_name_auditor =", value, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorNotEqualTo(String value) {
            addCriterion("temp_member_auth.real_name_auditor <>", value, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorGreaterThan(String value) {
            addCriterion("temp_member_auth.real_name_auditor >", value, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.real_name_auditor >=", value, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorLessThan(String value) {
            addCriterion("temp_member_auth.real_name_auditor <", value, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.real_name_auditor <=", value, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorLike(String value) {
            addCriterion("temp_member_auth.real_name_auditor like", value, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorNotLike(String value) {
            addCriterion("temp_member_auth.real_name_auditor not like", value, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorIn(List<String> values) {
            addCriterion("temp_member_auth.real_name_auditor in", values, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorNotIn(List<String> values) {
            addCriterion("temp_member_auth.real_name_auditor not in", values, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorBetween(String value1, String value2) {
            addCriterion("temp_member_auth.real_name_auditor between", value1, value2, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.real_name_auditor not between", value1, value2, "realNameAuditor");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeIsNull() {
            addCriterion("temp_member_auth.real_name_time is null");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeIsNotNull() {
            addCriterion("temp_member_auth.real_name_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeEqualTo(Date value) {
            addCriterion("temp_member_auth.real_name_time =", value, "realNameTime");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeNotEqualTo(Date value) {
            addCriterion("temp_member_auth.real_name_time <>", value, "realNameTime");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeGreaterThan(Date value) {
            addCriterion("temp_member_auth.real_name_time >", value, "realNameTime");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.real_name_time >=", value, "realNameTime");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeLessThan(Date value) {
            addCriterion("temp_member_auth.real_name_time <", value, "realNameTime");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.real_name_time <=", value, "realNameTime");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeIn(List<Date> values) {
            addCriterion("temp_member_auth.real_name_time in", values, "realNameTime");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeNotIn(List<Date> values) {
            addCriterion("temp_member_auth.real_name_time not in", values, "realNameTime");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.real_name_time between", value1, value2, "realNameTime");
            return (Criteria) this;
        }

        public Criteria andRealNameTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.real_name_time not between", value1, value2, "realNameTime");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthIsNull() {
            addCriterion("temp_member_auth.id_card_auth is null");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthIsNotNull() {
            addCriterion("temp_member_auth.id_card_auth is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthEqualTo(String value) {
            addCriterion("temp_member_auth.id_card_auth =", value, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthNotEqualTo(String value) {
            addCriterion("temp_member_auth.id_card_auth <>", value, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthGreaterThan(String value) {
            addCriterion("temp_member_auth.id_card_auth >", value, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.id_card_auth >=", value, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthLessThan(String value) {
            addCriterion("temp_member_auth.id_card_auth <", value, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.id_card_auth <=", value, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthLike(String value) {
            addCriterion("temp_member_auth.id_card_auth like", value, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthNotLike(String value) {
            addCriterion("temp_member_auth.id_card_auth not like", value, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthIn(List<String> values) {
            addCriterion("temp_member_auth.id_card_auth in", values, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthNotIn(List<String> values) {
            addCriterion("temp_member_auth.id_card_auth not in", values, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthBetween(String value1, String value2) {
            addCriterion("temp_member_auth.id_card_auth between", value1, value2, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.id_card_auth not between", value1, value2, "idCardAuth");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorIsNull() {
            addCriterion("temp_member_auth.id_card_auditor is null");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorIsNotNull() {
            addCriterion("temp_member_auth.id_card_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorEqualTo(String value) {
            addCriterion("temp_member_auth.id_card_auditor =", value, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorNotEqualTo(String value) {
            addCriterion("temp_member_auth.id_card_auditor <>", value, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorGreaterThan(String value) {
            addCriterion("temp_member_auth.id_card_auditor >", value, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.id_card_auditor >=", value, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorLessThan(String value) {
            addCriterion("temp_member_auth.id_card_auditor <", value, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.id_card_auditor <=", value, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorLike(String value) {
            addCriterion("temp_member_auth.id_card_auditor like", value, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorNotLike(String value) {
            addCriterion("temp_member_auth.id_card_auditor not like", value, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorIn(List<String> values) {
            addCriterion("temp_member_auth.id_card_auditor in", values, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorNotIn(List<String> values) {
            addCriterion("temp_member_auth.id_card_auditor not in", values, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorBetween(String value1, String value2) {
            addCriterion("temp_member_auth.id_card_auditor between", value1, value2, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.id_card_auditor not between", value1, value2, "idCardAuditor");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeIsNull() {
            addCriterion("temp_member_auth.id_card_time is null");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeIsNotNull() {
            addCriterion("temp_member_auth.id_card_time is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeEqualTo(Date value) {
            addCriterion("temp_member_auth.id_card_time =", value, "idCardTime");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeNotEqualTo(Date value) {
            addCriterion("temp_member_auth.id_card_time <>", value, "idCardTime");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeGreaterThan(Date value) {
            addCriterion("temp_member_auth.id_card_time >", value, "idCardTime");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.id_card_time >=", value, "idCardTime");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeLessThan(Date value) {
            addCriterion("temp_member_auth.id_card_time <", value, "idCardTime");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.id_card_time <=", value, "idCardTime");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeIn(List<Date> values) {
            addCriterion("temp_member_auth.id_card_time in", values, "idCardTime");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeNotIn(List<Date> values) {
            addCriterion("temp_member_auth.id_card_time not in", values, "idCardTime");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.id_card_time between", value1, value2, "idCardTime");
            return (Criteria) this;
        }

        public Criteria andIdCardTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.id_card_time not between", value1, value2, "idCardTime");
            return (Criteria) this;
        }

        public Criteria andWorkAuthIsNull() {
            addCriterion("temp_member_auth.work_auth is null");
            return (Criteria) this;
        }

        public Criteria andWorkAuthIsNotNull() {
            addCriterion("temp_member_auth.work_auth is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAuthEqualTo(String value) {
            addCriterion("temp_member_auth.work_auth =", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthNotEqualTo(String value) {
            addCriterion("temp_member_auth.work_auth <>", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthGreaterThan(String value) {
            addCriterion("temp_member_auth.work_auth >", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.work_auth >=", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthLessThan(String value) {
            addCriterion("temp_member_auth.work_auth <", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.work_auth <=", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthLike(String value) {
            addCriterion("temp_member_auth.work_auth like", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthNotLike(String value) {
            addCriterion("temp_member_auth.work_auth not like", value, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthIn(List<String> values) {
            addCriterion("temp_member_auth.work_auth in", values, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthNotIn(List<String> values) {
            addCriterion("temp_member_auth.work_auth not in", values, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthBetween(String value1, String value2) {
            addCriterion("temp_member_auth.work_auth between", value1, value2, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuthNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.work_auth not between", value1, value2, "workAuth");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorIsNull() {
            addCriterion("temp_member_auth.work_auditor is null");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorIsNotNull() {
            addCriterion("temp_member_auth.work_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorEqualTo(String value) {
            addCriterion("temp_member_auth.work_auditor =", value, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorNotEqualTo(String value) {
            addCriterion("temp_member_auth.work_auditor <>", value, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorGreaterThan(String value) {
            addCriterion("temp_member_auth.work_auditor >", value, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.work_auditor >=", value, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorLessThan(String value) {
            addCriterion("temp_member_auth.work_auditor <", value, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_member_auth.work_auditor <=", value, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorLike(String value) {
            addCriterion("temp_member_auth.work_auditor like", value, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorNotLike(String value) {
            addCriterion("temp_member_auth.work_auditor not like", value, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorIn(List<String> values) {
            addCriterion("temp_member_auth.work_auditor in", values, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorNotIn(List<String> values) {
            addCriterion("temp_member_auth.work_auditor not in", values, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorBetween(String value1, String value2) {
            addCriterion("temp_member_auth.work_auditor between", value1, value2, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_member_auth.work_auditor not between", value1, value2, "workAuditor");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("temp_member_auth.work_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("temp_member_auth.work_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(Date value) {
            addCriterion("temp_member_auth.work_time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Date value) {
            addCriterion("temp_member_auth.work_time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Date value) {
            addCriterion("temp_member_auth.work_time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.work_time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Date value) {
            addCriterion("temp_member_auth.work_time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_auth.work_time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Date> values) {
            addCriterion("temp_member_auth.work_time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Date> values) {
            addCriterion("temp_member_auth.work_time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.work_time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_auth.work_time not between", value1, value2, "workTime");
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