package com.glacier.netloan.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.glacier.netloan.entity.member.MemberIntegralExample.Criteria;

public class MemberStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberStatisticsExample() {
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

        public Criteria andStatisticsIdIsNull() {
            addCriterion("temp_member_statistics.statistics_id is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdIsNotNull() {
            addCriterion("temp_member_statistics.statistics_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdEqualTo(String value) {
            addCriterion("temp_member_statistics.statistics_id =", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotEqualTo(String value) {
            addCriterion("temp_member_statistics.statistics_id <>", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdGreaterThan(String value) {
            addCriterion("temp_member_statistics.statistics_id >", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_statistics.statistics_id >=", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdLessThan(String value) {
            addCriterion("temp_member_statistics.statistics_id <", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_statistics.statistics_id <=", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdLike(String value) {
            addCriterion("temp_member_statistics.statistics_id like", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotLike(String value) {
            addCriterion("temp_member_statistics.statistics_id not like", value, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdIn(List<String> values) {
            addCriterion("temp_member_statistics.statistics_id in", values, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotIn(List<String> values) {
            addCriterion("temp_member_statistics.statistics_id not in", values, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdBetween(String value1, String value2) {
            addCriterion("temp_member_statistics.statistics_id between", value1, value2, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andStatisticsIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_statistics.statistics_id not between", value1, value2, "statisticsId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_member_statistics.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member_statistics.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member_statistics.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member_statistics.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member_statistics.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_statistics.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member_statistics.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_statistics.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member_statistics.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member_statistics.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member_statistics.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member_statistics.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member_statistics.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_statistics.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsIsNull() {
            addCriterion("temp_member_statistics.total_borrowings is null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsIsNotNull() {
            addCriterion("temp_member_statistics.total_borrowings is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsEqualTo(Float value) {
            addCriterion("temp_member_statistics.total_borrowings =", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.total_borrowings <>", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsGreaterThan(Float value) {
            addCriterion("temp_member_statistics.total_borrowings >", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.total_borrowings >=", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsLessThan(Float value) {
            addCriterion("temp_member_statistics.total_borrowings <", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.total_borrowings <=", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsIn(List<Float> values) {
            addCriterion("temp_member_statistics.total_borrowings in", values, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.total_borrowings not in", values, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.total_borrowings between", value1, value2, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.total_borrowings not between", value1, value2, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitIsNull() {
            addCriterion("temp_member_statistics.cumulative_loss_profit is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitIsNotNull() {
            addCriterion("temp_member_statistics.cumulative_loss_profit is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitEqualTo(Float value) {
            addCriterion("temp_member_statistics.cumulative_loss_profit =", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.cumulative_loss_profit <>", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitGreaterThan(Float value) {
            addCriterion("temp_member_statistics.cumulative_loss_profit >", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.cumulative_loss_profit >=", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitLessThan(Float value) {
            addCriterion("temp_member_statistics.cumulative_loss_profit <", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.cumulative_loss_profit <=", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitIn(List<Float> values) {
            addCriterion("temp_member_statistics.cumulative_loss_profit in", values, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.cumulative_loss_profit not in", values, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.cumulative_loss_profit between", value1, value2, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.cumulative_loss_profit not between", value1, value2, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalIsNull() {
            addCriterion("temp_member_statistics.already_total is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalIsNotNull() {
            addCriterion("temp_member_statistics.already_total is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_total =", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_total <>", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalGreaterThan(Float value) {
            addCriterion("temp_member_statistics.already_total >", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_total >=", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalLessThan(Float value) {
            addCriterion("temp_member_statistics.already_total <", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_total <=", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_total in", values, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_total not in", values, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_total between", value1, value2, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_total not between", value1, value2, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalIsNull() {
            addCriterion("temp_member_statistics.wait_also_total is null");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalIsNotNull() {
            addCriterion("temp_member_statistics.wait_also_total is not null");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_total =", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_total <>", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalGreaterThan(Float value) {
            addCriterion("temp_member_statistics.wait_also_total >", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_total >=", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalLessThan(Float value) {
            addCriterion("temp_member_statistics.wait_also_total <", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_total <=", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_also_total in", values, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_also_total not in", values, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_also_total between", value1, value2, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_also_total not between", value1, value2, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalIsNull() {
            addCriterion("temp_member_statistics.already_income_total is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalIsNotNull() {
            addCriterion("temp_member_statistics.already_income_total is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_total =", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_total <>", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalGreaterThan(Float value) {
            addCriterion("temp_member_statistics.already_income_total >", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_total >=", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalLessThan(Float value) {
            addCriterion("temp_member_statistics.already_income_total <", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_total <=", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_income_total in", values, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_income_total not in", values, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_income_total between", value1, value2, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_income_total not between", value1, value2, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalIsNull() {
            addCriterion("temp_member_statistics.wait_income_total is null");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalIsNotNull() {
            addCriterion("temp_member_statistics.wait_income_total is not null");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_total =", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_total <>", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalGreaterThan(Float value) {
            addCriterion("temp_member_statistics.wait_income_total >", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_total >=", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalLessThan(Float value) {
            addCriterion("temp_member_statistics.wait_income_total <", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_total <=", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_income_total in", values, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_income_total not in", values, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_income_total between", value1, value2, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_income_total not between", value1, value2, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalIsNull() {
            addCriterion("temp_member_statistics.already_principal is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalIsNotNull() {
            addCriterion("temp_member_statistics.already_principal is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_principal =", value, "alreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_principal <>", value, "alreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalGreaterThan(Float value) {
            addCriterion("temp_member_statistics.already_principal >", value, "alreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_principal >=", value, "alreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalLessThan(Float value) {
            addCriterion("temp_member_statistics.already_principal <", value, "alreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_principal <=", value, "alreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_principal in", values, "alreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_principal not in", values, "alreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_principal between", value1, value2, "alreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyPrincipalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_principal not between", value1, value2, "alreadyPrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalIsNull() {
            addCriterion("temp_member_statistics.wait_also_principal is null");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalIsNotNull() {
            addCriterion("temp_member_statistics.wait_also_principal is not null");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_principal =", value, "waitAlsoPrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_principal <>", value, "waitAlsoPrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalGreaterThan(Float value) {
            addCriterion("temp_member_statistics.wait_also_principal >", value, "waitAlsoPrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_principal >=", value, "waitAlsoPrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalLessThan(Float value) {
            addCriterion("temp_member_statistics.wait_also_principal <", value, "waitAlsoPrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_principal <=", value, "waitAlsoPrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_also_principal in", values, "waitAlsoPrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_also_principal not in", values, "waitAlsoPrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_also_principal between", value1, value2, "waitAlsoPrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoPrincipalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_also_principal not between", value1, value2, "waitAlsoPrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestIsNull() {
            addCriterion("temp_member_statistics.already_interest is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestIsNotNull() {
            addCriterion("temp_member_statistics.already_interest is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_interest =", value, "alreadyInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_interest <>", value, "alreadyInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestGreaterThan(Float value) {
            addCriterion("temp_member_statistics.already_interest >", value, "alreadyInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_interest >=", value, "alreadyInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestLessThan(Float value) {
            addCriterion("temp_member_statistics.already_interest <", value, "alreadyInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_interest <=", value, "alreadyInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_interest in", values, "alreadyInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_interest not in", values, "alreadyInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_interest between", value1, value2, "alreadyInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_interest not between", value1, value2, "alreadyInterest");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestIsNull() {
            addCriterion("temp_member_statistics.wait_also_interest is null");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestIsNotNull() {
            addCriterion("temp_member_statistics.wait_also_interest is not null");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_interest =", value, "waitAlsoInterest");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_interest <>", value, "waitAlsoInterest");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestGreaterThan(Float value) {
            addCriterion("temp_member_statistics.wait_also_interest >", value, "waitAlsoInterest");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_interest >=", value, "waitAlsoInterest");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestLessThan(Float value) {
            addCriterion("temp_member_statistics.wait_also_interest <", value, "waitAlsoInterest");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_also_interest <=", value, "waitAlsoInterest");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_also_interest in", values, "waitAlsoInterest");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_also_interest not in", values, "waitAlsoInterest");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_also_interest between", value1, value2, "waitAlsoInterest");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_also_interest not between", value1, value2, "waitAlsoInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalIsNull() {
            addCriterion("temp_member_statistics.already_income_principal is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalIsNotNull() {
            addCriterion("temp_member_statistics.already_income_principal is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_principal =", value, "alreadyIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_principal <>", value, "alreadyIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalGreaterThan(Float value) {
            addCriterion("temp_member_statistics.already_income_principal >", value, "alreadyIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_principal >=", value, "alreadyIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalLessThan(Float value) {
            addCriterion("temp_member_statistics.already_income_principal <", value, "alreadyIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_principal <=", value, "alreadyIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_income_principal in", values, "alreadyIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_income_principal not in", values, "alreadyIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_income_principal between", value1, value2, "alreadyIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomePrincipalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_income_principal not between", value1, value2, "alreadyIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalIsNull() {
            addCriterion("temp_member_statistics.wait_income_principal is null");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalIsNotNull() {
            addCriterion("temp_member_statistics.wait_income_principal is not null");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_principal =", value, "waitIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_principal <>", value, "waitIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalGreaterThan(Float value) {
            addCriterion("temp_member_statistics.wait_income_principal >", value, "waitIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_principal >=", value, "waitIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalLessThan(Float value) {
            addCriterion("temp_member_statistics.wait_income_principal <", value, "waitIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_principal <=", value, "waitIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_income_principal in", values, "waitIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_income_principal not in", values, "waitIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_income_principal between", value1, value2, "waitIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomePrincipalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_income_principal not between", value1, value2, "waitIncomePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestIsNull() {
            addCriterion("temp_member_statistics.already_income_interest is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestIsNotNull() {
            addCriterion("temp_member_statistics.already_income_interest is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_interest =", value, "alreadyIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_interest <>", value, "alreadyIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestGreaterThan(Float value) {
            addCriterion("temp_member_statistics.already_income_interest >", value, "alreadyIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_interest >=", value, "alreadyIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestLessThan(Float value) {
            addCriterion("temp_member_statistics.already_income_interest <", value, "alreadyIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.already_income_interest <=", value, "alreadyIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_income_interest in", values, "alreadyIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.already_income_interest not in", values, "alreadyIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_income_interest between", value1, value2, "alreadyIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.already_income_interest not between", value1, value2, "alreadyIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestIsNull() {
            addCriterion("temp_member_statistics.wait_income_interest is null");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestIsNotNull() {
            addCriterion("temp_member_statistics.wait_income_interest is not null");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_interest =", value, "waitIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_interest <>", value, "waitIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestGreaterThan(Float value) {
            addCriterion("temp_member_statistics.wait_income_interest >", value, "waitIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_interest >=", value, "waitIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestLessThan(Float value) {
            addCriterion("temp_member_statistics.wait_income_interest <", value, "waitIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.wait_income_interest <=", value, "waitIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_income_interest in", values, "waitIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.wait_income_interest not in", values, "waitIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_income_interest between", value1, value2, "waitIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.wait_income_interest not between", value1, value2, "waitIncomeInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountIsNull() {
            addCriterion("temp_member_statistics.overdue_fine_amount is null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountIsNotNull() {
            addCriterion("temp_member_statistics.overdue_fine_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountEqualTo(Float value) {
            addCriterion("temp_member_statistics.overdue_fine_amount =", value, "overdueFineAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.overdue_fine_amount <>", value, "overdueFineAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountGreaterThan(Float value) {
            addCriterion("temp_member_statistics.overdue_fine_amount >", value, "overdueFineAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.overdue_fine_amount >=", value, "overdueFineAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountLessThan(Float value) {
            addCriterion("temp_member_statistics.overdue_fine_amount <", value, "overdueFineAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.overdue_fine_amount <=", value, "overdueFineAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountIn(List<Float> values) {
            addCriterion("temp_member_statistics.overdue_fine_amount in", values, "overdueFineAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.overdue_fine_amount not in", values, "overdueFineAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.overdue_fine_amount between", value1, value2, "overdueFineAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueFineAmountNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.overdue_fine_amount not between", value1, value2, "overdueFineAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountIsNull() {
            addCriterion("temp_member_statistics.overdue_interest_amount is null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountIsNotNull() {
            addCriterion("temp_member_statistics.overdue_interest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountEqualTo(Float value) {
            addCriterion("temp_member_statistics.overdue_interest_amount =", value, "overdueInterestAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.overdue_interest_amount <>", value, "overdueInterestAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountGreaterThan(Float value) {
            addCriterion("temp_member_statistics.overdue_interest_amount >", value, "overdueInterestAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.overdue_interest_amount >=", value, "overdueInterestAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountLessThan(Float value) {
            addCriterion("temp_member_statistics.overdue_interest_amount <", value, "overdueInterestAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.overdue_interest_amount <=", value, "overdueInterestAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountIn(List<Float> values) {
            addCriterion("temp_member_statistics.overdue_interest_amount in", values, "overdueInterestAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.overdue_interest_amount not in", values, "overdueInterestAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.overdue_interest_amount between", value1, value2, "overdueInterestAmount");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestAmountNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.overdue_interest_amount not between", value1, value2, "overdueInterestAmount");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountIsNull() {
            addCriterion("temp_member_statistics.loan_management_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountIsNotNull() {
            addCriterion("temp_member_statistics.loan_management_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountEqualTo(Float value) {
            addCriterion("temp_member_statistics.loan_management_amount =", value, "loanManagementAmount");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.loan_management_amount <>", value, "loanManagementAmount");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountGreaterThan(Float value) {
            addCriterion("temp_member_statistics.loan_management_amount >", value, "loanManagementAmount");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.loan_management_amount >=", value, "loanManagementAmount");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountLessThan(Float value) {
            addCriterion("temp_member_statistics.loan_management_amount <", value, "loanManagementAmount");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.loan_management_amount <=", value, "loanManagementAmount");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountIn(List<Float> values) {
            addCriterion("temp_member_statistics.loan_management_amount in", values, "loanManagementAmount");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.loan_management_amount not in", values, "loanManagementAmount");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.loan_management_amount between", value1, value2, "loanManagementAmount");
            return (Criteria) this;
        }

        public Criteria andLoanManagementAmountNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.loan_management_amount not between", value1, value2, "loanManagementAmount");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountIsNull() {
            addCriterion("temp_member_statistics.loan_interest_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountIsNotNull() {
            addCriterion("temp_member_statistics.loan_interest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountEqualTo(Float value) {
            addCriterion("temp_member_statistics.loan_interest_amount =", value, "loanInterestAmount");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.loan_interest_amount <>", value, "loanInterestAmount");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountGreaterThan(Float value) {
            addCriterion("temp_member_statistics.loan_interest_amount >", value, "loanInterestAmount");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.loan_interest_amount >=", value, "loanInterestAmount");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountLessThan(Float value) {
            addCriterion("temp_member_statistics.loan_interest_amount <", value, "loanInterestAmount");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.loan_interest_amount <=", value, "loanInterestAmount");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountIn(List<Float> values) {
            addCriterion("temp_member_statistics.loan_interest_amount in", values, "loanInterestAmount");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.loan_interest_amount not in", values, "loanInterestAmount");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.loan_interest_amount between", value1, value2, "loanInterestAmount");
            return (Criteria) this;
        }

        public Criteria andLoanInterestAmountNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.loan_interest_amount not between", value1, value2, "loanInterestAmount");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentIsNull() {
            addCriterion("temp_member_statistics.normal_repayment is null");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentIsNotNull() {
            addCriterion("temp_member_statistics.normal_repayment is not null");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentEqualTo(Integer value) {
            addCriterion("temp_member_statistics.normal_repayment =", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentNotEqualTo(Integer value) {
            addCriterion("temp_member_statistics.normal_repayment <>", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentGreaterThan(Integer value) {
            addCriterion("temp_member_statistics.normal_repayment >", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.normal_repayment >=", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentLessThan(Integer value) {
            addCriterion("temp_member_statistics.normal_repayment <", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.normal_repayment <=", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentIn(List<Integer> values) {
            addCriterion("temp_member_statistics.normal_repayment in", values, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentNotIn(List<Integer> values) {
            addCriterion("temp_member_statistics.normal_repayment not in", values, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.normal_repayment between", value1, value2, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.normal_repayment not between", value1, value2, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentIsNull() {
            addCriterion("temp_member_statistics.advance_repayment is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentIsNotNull() {
            addCriterion("temp_member_statistics.advance_repayment is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentEqualTo(Integer value) {
            addCriterion("temp_member_statistics.advance_repayment =", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentNotEqualTo(Integer value) {
            addCriterion("temp_member_statistics.advance_repayment <>", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentGreaterThan(Integer value) {
            addCriterion("temp_member_statistics.advance_repayment >", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.advance_repayment >=", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentLessThan(Integer value) {
            addCriterion("temp_member_statistics.advance_repayment <", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.advance_repayment <=", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentIn(List<Integer> values) {
            addCriterion("temp_member_statistics.advance_repayment in", values, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentNotIn(List<Integer> values) {
            addCriterion("temp_member_statistics.advance_repayment not in", values, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.advance_repayment between", value1, value2, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.advance_repayment not between", value1, value2, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentIsNull() {
            addCriterion("temp_member_statistics.late_repayment is null");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentIsNotNull() {
            addCriterion("temp_member_statistics.late_repayment is not null");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentEqualTo(Integer value) {
            addCriterion("temp_member_statistics.late_repayment =", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentNotEqualTo(Integer value) {
            addCriterion("temp_member_statistics.late_repayment <>", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentGreaterThan(Integer value) {
            addCriterion("temp_member_statistics.late_repayment >", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.late_repayment >=", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentLessThan(Integer value) {
            addCriterion("temp_member_statistics.late_repayment <", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.late_repayment <=", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentIn(List<Integer> values) {
            addCriterion("temp_member_statistics.late_repayment in", values, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentNotIn(List<Integer> values) {
            addCriterion("temp_member_statistics.late_repayment not in", values, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.late_repayment between", value1, value2, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.late_repayment not between", value1, value2, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateIsNull() {
            addCriterion("temp_member_statistics.late is null");
            return (Criteria) this;
        }

        public Criteria andLateIsNotNull() {
            addCriterion("temp_member_statistics.late is not null");
            return (Criteria) this;
        }

        public Criteria andLateEqualTo(Integer value) {
            addCriterion("temp_member_statistics.late =", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotEqualTo(Integer value) {
            addCriterion("temp_member_statistics.late <>", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThan(Integer value) {
            addCriterion("temp_member_statistics.late >", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.late >=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThan(Integer value) {
            addCriterion("temp_member_statistics.late <", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.late <=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateIn(List<Integer> values) {
            addCriterion("temp_member_statistics.late in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotIn(List<Integer> values) {
            addCriterion("temp_member_statistics.late not in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.late between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.late not between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteIsNull() {
            addCriterion("temp_member_statistics.website_substitute is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteIsNotNull() {
            addCriterion("temp_member_statistics.website_substitute is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteEqualTo(Integer value) {
            addCriterion("temp_member_statistics.website_substitute =", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteNotEqualTo(Integer value) {
            addCriterion("temp_member_statistics.website_substitute <>", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteGreaterThan(Integer value) {
            addCriterion("temp_member_statistics.website_substitute >", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.website_substitute >=", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteLessThan(Integer value) {
            addCriterion("temp_member_statistics.website_substitute <", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.website_substitute <=", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteIn(List<Integer> values) {
            addCriterion("temp_member_statistics.website_substitute in", values, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteNotIn(List<Integer> values) {
            addCriterion("temp_member_statistics.website_substitute not in", values, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.website_substitute between", value1, value2, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.website_substitute not between", value1, value2, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalIsNull() {
            addCriterion("temp_member_statistics.investment_total is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalIsNotNull() {
            addCriterion("temp_member_statistics.investment_total is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalEqualTo(Float value) {
            addCriterion("temp_member_statistics.investment_total =", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.investment_total <>", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalGreaterThan(Float value) {
            addCriterion("temp_member_statistics.investment_total >", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.investment_total >=", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalLessThan(Float value) {
            addCriterion("temp_member_statistics.investment_total <", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.investment_total <=", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalIn(List<Float> values) {
            addCriterion("temp_member_statistics.investment_total in", values, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.investment_total not in", values, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.investment_total between", value1, value2, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.investment_total not between", value1, value2, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsIsNull() {
            addCriterion("temp_member_statistics.tender_awards is null");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsIsNotNull() {
            addCriterion("temp_member_statistics.tender_awards is not null");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsEqualTo(Float value) {
            addCriterion("temp_member_statistics.tender_awards =", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.tender_awards <>", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsGreaterThan(Float value) {
            addCriterion("temp_member_statistics.tender_awards >", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.tender_awards >=", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsLessThan(Float value) {
            addCriterion("temp_member_statistics.tender_awards <", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.tender_awards <=", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsIn(List<Float> values) {
            addCriterion("temp_member_statistics.tender_awards in", values, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.tender_awards not in", values, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.tender_awards between", value1, value2, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.tender_awards not between", value1, value2, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsIsNull() {
            addCriterion("temp_member_statistics.promotion_awards is null");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsIsNotNull() {
            addCriterion("temp_member_statistics.promotion_awards is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsEqualTo(Float value) {
            addCriterion("temp_member_statistics.promotion_awards =", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.promotion_awards <>", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsGreaterThan(Float value) {
            addCriterion("temp_member_statistics.promotion_awards >", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.promotion_awards >=", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsLessThan(Float value) {
            addCriterion("temp_member_statistics.promotion_awards <", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.promotion_awards <=", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsIn(List<Float> values) {
            addCriterion("temp_member_statistics.promotion_awards in", values, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.promotion_awards not in", values, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.promotion_awards between", value1, value2, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.promotion_awards not between", value1, value2, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessIsNull() {
            addCriterion("temp_member_statistics.borrow_success is null");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessIsNotNull() {
            addCriterion("temp_member_statistics.borrow_success is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessEqualTo(Integer value) {
            addCriterion("temp_member_statistics.borrow_success =", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessNotEqualTo(Integer value) {
            addCriterion("temp_member_statistics.borrow_success <>", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessGreaterThan(Integer value) {
            addCriterion("temp_member_statistics.borrow_success >", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.borrow_success >=", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessLessThan(Integer value) {
            addCriterion("temp_member_statistics.borrow_success <", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_statistics.borrow_success <=", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessIn(List<Integer> values) {
            addCriterion("temp_member_statistics.borrow_success in", values, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessNotIn(List<Integer> values) {
            addCriterion("temp_member_statistics.borrow_success not in", values, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.borrow_success between", value1, value2, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_statistics.borrow_success not between", value1, value2, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsIsNull() {
            addCriterion("temp_member_statistics.upline_delta_awards is null");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsIsNotNull() {
            addCriterion("temp_member_statistics.upline_delta_awards is not null");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsEqualTo(Float value) {
            addCriterion("temp_member_statistics.upline_delta_awards =", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.upline_delta_awards <>", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsGreaterThan(Float value) {
            addCriterion("temp_member_statistics.upline_delta_awards >", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.upline_delta_awards >=", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsLessThan(Float value) {
            addCriterion("temp_member_statistics.upline_delta_awards <", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.upline_delta_awards <=", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsIn(List<Float> values) {
            addCriterion("temp_member_statistics.upline_delta_awards in", values, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.upline_delta_awards not in", values, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.upline_delta_awards between", value1, value2, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.upline_delta_awards not between", value1, value2, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsIsNull() {
            addCriterion("temp_member_statistics.continue_awards is null");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsIsNotNull() {
            addCriterion("temp_member_statistics.continue_awards is not null");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsEqualTo(Float value) {
            addCriterion("temp_member_statistics.continue_awards =", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsNotEqualTo(Float value) {
            addCriterion("temp_member_statistics.continue_awards <>", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsGreaterThan(Float value) {
            addCriterion("temp_member_statistics.continue_awards >", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.continue_awards >=", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsLessThan(Float value) {
            addCriterion("temp_member_statistics.continue_awards <", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_statistics.continue_awards <=", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsIn(List<Float> values) {
            addCriterion("temp_member_statistics.continue_awards in", values, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsNotIn(List<Float> values) {
            addCriterion("temp_member_statistics.continue_awards not in", values, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.continue_awards between", value1, value2, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_statistics.continue_awards not between", value1, value2, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_member_statistics.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_member_statistics.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_member_statistics.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_member_statistics.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_member_statistics.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_statistics.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_member_statistics.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_statistics.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_member_statistics.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_member_statistics.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_member_statistics.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_member_statistics.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_member_statistics.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_statistics.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_member_statistics.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_member_statistics.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_member_statistics.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_statistics.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_member_statistics.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_statistics.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_member_statistics.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_statistics.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_member_statistics.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_statistics.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_statistics.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_statistics.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_member_statistics.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_member_statistics.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_member_statistics.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_member_statistics.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_member_statistics.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_statistics.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_member_statistics.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_statistics.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_member_statistics.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_member_statistics.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_member_statistics.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_member_statistics.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_member_statistics.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_statistics.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_member_statistics.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_member_statistics.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_member_statistics.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_statistics.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_member_statistics.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_statistics.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_member_statistics.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_statistics.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_member_statistics.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_statistics.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_statistics.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_statistics.update_time not between", value1, value2, "updateTime");
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