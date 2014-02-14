package com.glacier.netloan.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberInvestmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MemberInvestmentExample() {
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

        public Criteria andLendIdIsNull() {
            addCriterion("temp_member_investment.lend_id is null");
            return (Criteria) this;
        }

        public Criteria andLendIdIsNotNull() {
            addCriterion("temp_member_investment.lend_id is not null");
            return (Criteria) this;
        }

        public Criteria andLendIdEqualTo(String value) {
            addCriterion("temp_member_investment.lend_id =", value, "lendId");
            return (Criteria) this;
        }

        public Criteria andLendIdNotEqualTo(String value) {
            addCriterion("temp_member_investment.lend_id <>", value, "lendId");
            return (Criteria) this;
        }

        public Criteria andLendIdGreaterThan(String value) {
            addCriterion("temp_member_investment.lend_id >", value, "lendId");
            return (Criteria) this;
        }

        public Criteria andLendIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_investment.lend_id >=", value, "lendId");
            return (Criteria) this;
        }

        public Criteria andLendIdLessThan(String value) {
            addCriterion("temp_member_investment.lend_id <", value, "lendId");
            return (Criteria) this;
        }

        public Criteria andLendIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_investment.lend_id <=", value, "lendId");
            return (Criteria) this;
        }

        public Criteria andLendIdLike(String value) {
            addCriterion("temp_member_investment.lend_id like", value, "lendId");
            return (Criteria) this;
        }

        public Criteria andLendIdNotLike(String value) {
            addCriterion("temp_member_investment.lend_id not like", value, "lendId");
            return (Criteria) this;
        }

        public Criteria andLendIdIn(List<String> values) {
            addCriterion("temp_member_investment.lend_id in", values, "lendId");
            return (Criteria) this;
        }

        public Criteria andLendIdNotIn(List<String> values) {
            addCriterion("temp_member_investment.lend_id not in", values, "lendId");
            return (Criteria) this;
        }

        public Criteria andLendIdBetween(String value1, String value2) {
            addCriterion("temp_member_investment.lend_id between", value1, value2, "lendId");
            return (Criteria) this;
        }

        public Criteria andLendIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_investment.lend_id not between", value1, value2, "lendId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_member_investment.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_member_investment.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_member_investment.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_member_investment.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_member_investment.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_investment.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_member_investment.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_member_investment.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_member_investment.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_member_investment.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_member_investment.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_member_investment.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_member_investment.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_member_investment.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsIsNull() {
            addCriterion("temp_member_investment.total_borrowings is null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsIsNotNull() {
            addCriterion("temp_member_investment.total_borrowings is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsEqualTo(Float value) {
            addCriterion("temp_member_investment.total_borrowings =", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsNotEqualTo(Float value) {
            addCriterion("temp_member_investment.total_borrowings <>", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsGreaterThan(Float value) {
            addCriterion("temp_member_investment.total_borrowings >", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.total_borrowings >=", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsLessThan(Float value) {
            addCriterion("temp_member_investment.total_borrowings <", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.total_borrowings <=", value, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsIn(List<Float> values) {
            addCriterion("temp_member_investment.total_borrowings in", values, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsNotIn(List<Float> values) {
            addCriterion("temp_member_investment.total_borrowings not in", values, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.total_borrowings between", value1, value2, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowingsNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.total_borrowings not between", value1, value2, "totalBorrowings");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitIsNull() {
            addCriterion("temp_member_investment.cumulative_loss_profit is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitIsNotNull() {
            addCriterion("temp_member_investment.cumulative_loss_profit is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitEqualTo(Float value) {
            addCriterion("temp_member_investment.cumulative_loss_profit =", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitNotEqualTo(Float value) {
            addCriterion("temp_member_investment.cumulative_loss_profit <>", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitGreaterThan(Float value) {
            addCriterion("temp_member_investment.cumulative_loss_profit >", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.cumulative_loss_profit >=", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitLessThan(Float value) {
            addCriterion("temp_member_investment.cumulative_loss_profit <", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.cumulative_loss_profit <=", value, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitIn(List<Float> values) {
            addCriterion("temp_member_investment.cumulative_loss_profit in", values, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitNotIn(List<Float> values) {
            addCriterion("temp_member_investment.cumulative_loss_profit not in", values, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.cumulative_loss_profit between", value1, value2, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andCumulativeLossProfitNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.cumulative_loss_profit not between", value1, value2, "cumulativeLossProfit");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalIsNull() {
            addCriterion("temp_member_investment.already_total is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalIsNotNull() {
            addCriterion("temp_member_investment.already_total is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalEqualTo(Float value) {
            addCriterion("temp_member_investment.already_total =", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalNotEqualTo(Float value) {
            addCriterion("temp_member_investment.already_total <>", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalGreaterThan(Float value) {
            addCriterion("temp_member_investment.already_total >", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.already_total >=", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalLessThan(Float value) {
            addCriterion("temp_member_investment.already_total <", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.already_total <=", value, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalIn(List<Float> values) {
            addCriterion("temp_member_investment.already_total in", values, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalNotIn(List<Float> values) {
            addCriterion("temp_member_investment.already_total not in", values, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.already_total between", value1, value2, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.already_total not between", value1, value2, "alreadyTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalIsNull() {
            addCriterion("temp_member_investment.wait_also_total is null");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalIsNotNull() {
            addCriterion("temp_member_investment.wait_also_total is not null");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalEqualTo(Float value) {
            addCriterion("temp_member_investment.wait_also_total =", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalNotEqualTo(Float value) {
            addCriterion("temp_member_investment.wait_also_total <>", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalGreaterThan(Float value) {
            addCriterion("temp_member_investment.wait_also_total >", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.wait_also_total >=", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalLessThan(Float value) {
            addCriterion("temp_member_investment.wait_also_total <", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.wait_also_total <=", value, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalIn(List<Float> values) {
            addCriterion("temp_member_investment.wait_also_total in", values, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalNotIn(List<Float> values) {
            addCriterion("temp_member_investment.wait_also_total not in", values, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.wait_also_total between", value1, value2, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andWaitAlsoTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.wait_also_total not between", value1, value2, "waitAlsoTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessIsNull() {
            addCriterion("temp_member_investment.borrow_success is null");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessIsNotNull() {
            addCriterion("temp_member_investment.borrow_success is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessEqualTo(Integer value) {
            addCriterion("temp_member_investment.borrow_success =", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessNotEqualTo(Integer value) {
            addCriterion("temp_member_investment.borrow_success <>", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessGreaterThan(Integer value) {
            addCriterion("temp_member_investment.borrow_success >", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.borrow_success >=", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessLessThan(Integer value) {
            addCriterion("temp_member_investment.borrow_success <", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.borrow_success <=", value, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessIn(List<Integer> values) {
            addCriterion("temp_member_investment.borrow_success in", values, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessNotIn(List<Integer> values) {
            addCriterion("temp_member_investment.borrow_success not in", values, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.borrow_success between", value1, value2, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andBorrowSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.borrow_success not between", value1, value2, "borrowSuccess");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentIsNull() {
            addCriterion("temp_member_investment.normal_repayment is null");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentIsNotNull() {
            addCriterion("temp_member_investment.normal_repayment is not null");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentEqualTo(Integer value) {
            addCriterion("temp_member_investment.normal_repayment =", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentNotEqualTo(Integer value) {
            addCriterion("temp_member_investment.normal_repayment <>", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentGreaterThan(Integer value) {
            addCriterion("temp_member_investment.normal_repayment >", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.normal_repayment >=", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentLessThan(Integer value) {
            addCriterion("temp_member_investment.normal_repayment <", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.normal_repayment <=", value, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentIn(List<Integer> values) {
            addCriterion("temp_member_investment.normal_repayment in", values, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentNotIn(List<Integer> values) {
            addCriterion("temp_member_investment.normal_repayment not in", values, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.normal_repayment between", value1, value2, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andNormalRepaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.normal_repayment not between", value1, value2, "normalRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentIsNull() {
            addCriterion("temp_member_investment.advance_repayment is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentIsNotNull() {
            addCriterion("temp_member_investment.advance_repayment is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentEqualTo(Integer value) {
            addCriterion("temp_member_investment.advance_repayment =", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentNotEqualTo(Integer value) {
            addCriterion("temp_member_investment.advance_repayment <>", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentGreaterThan(Integer value) {
            addCriterion("temp_member_investment.advance_repayment >", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.advance_repayment >=", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentLessThan(Integer value) {
            addCriterion("temp_member_investment.advance_repayment <", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.advance_repayment <=", value, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentIn(List<Integer> values) {
            addCriterion("temp_member_investment.advance_repayment in", values, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentNotIn(List<Integer> values) {
            addCriterion("temp_member_investment.advance_repayment not in", values, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.advance_repayment between", value1, value2, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andAdvanceRepaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.advance_repayment not between", value1, value2, "advanceRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentIsNull() {
            addCriterion("temp_member_investment.late_repayment is null");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentIsNotNull() {
            addCriterion("temp_member_investment.late_repayment is not null");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentEqualTo(Integer value) {
            addCriterion("temp_member_investment.late_repayment =", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentNotEqualTo(Integer value) {
            addCriterion("temp_member_investment.late_repayment <>", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentGreaterThan(Integer value) {
            addCriterion("temp_member_investment.late_repayment >", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.late_repayment >=", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentLessThan(Integer value) {
            addCriterion("temp_member_investment.late_repayment <", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.late_repayment <=", value, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentIn(List<Integer> values) {
            addCriterion("temp_member_investment.late_repayment in", values, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentNotIn(List<Integer> values) {
            addCriterion("temp_member_investment.late_repayment not in", values, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.late_repayment between", value1, value2, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateRepaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.late_repayment not between", value1, value2, "lateRepayment");
            return (Criteria) this;
        }

        public Criteria andLateIsNull() {
            addCriterion("temp_member_investment.late is null");
            return (Criteria) this;
        }

        public Criteria andLateIsNotNull() {
            addCriterion("temp_member_investment.late is not null");
            return (Criteria) this;
        }

        public Criteria andLateEqualTo(Integer value) {
            addCriterion("temp_member_investment.late =", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotEqualTo(Integer value) {
            addCriterion("temp_member_investment.late <>", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThan(Integer value) {
            addCriterion("temp_member_investment.late >", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.late >=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThan(Integer value) {
            addCriterion("temp_member_investment.late <", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.late <=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateIn(List<Integer> values) {
            addCriterion("temp_member_investment.late in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotIn(List<Integer> values) {
            addCriterion("temp_member_investment.late not in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.late between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.late not between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteIsNull() {
            addCriterion("temp_member_investment.website_substitute is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteIsNotNull() {
            addCriterion("temp_member_investment.website_substitute is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteEqualTo(Integer value) {
            addCriterion("temp_member_investment.website_substitute =", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteNotEqualTo(Integer value) {
            addCriterion("temp_member_investment.website_substitute <>", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteGreaterThan(Integer value) {
            addCriterion("temp_member_investment.website_substitute >", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.website_substitute >=", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteLessThan(Integer value) {
            addCriterion("temp_member_investment.website_substitute <", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteLessThanOrEqualTo(Integer value) {
            addCriterion("temp_member_investment.website_substitute <=", value, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteIn(List<Integer> values) {
            addCriterion("temp_member_investment.website_substitute in", values, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteNotIn(List<Integer> values) {
            addCriterion("temp_member_investment.website_substitute not in", values, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.website_substitute between", value1, value2, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andWebsiteSubstituteNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_member_investment.website_substitute not between", value1, value2, "websiteSubstitute");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalIsNull() {
            addCriterion("temp_member_investment.investment_total is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalIsNotNull() {
            addCriterion("temp_member_investment.investment_total is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalEqualTo(Float value) {
            addCriterion("temp_member_investment.investment_total =", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalNotEqualTo(Float value) {
            addCriterion("temp_member_investment.investment_total <>", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalGreaterThan(Float value) {
            addCriterion("temp_member_investment.investment_total >", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.investment_total >=", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalLessThan(Float value) {
            addCriterion("temp_member_investment.investment_total <", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.investment_total <=", value, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalIn(List<Float> values) {
            addCriterion("temp_member_investment.investment_total in", values, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalNotIn(List<Float> values) {
            addCriterion("temp_member_investment.investment_total not in", values, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.investment_total between", value1, value2, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andInvestmentTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.investment_total not between", value1, value2, "investmentTotal");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsIsNull() {
            addCriterion("temp_member_investment.tender_awards is null");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsIsNotNull() {
            addCriterion("temp_member_investment.tender_awards is not null");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsEqualTo(Float value) {
            addCriterion("temp_member_investment.tender_awards =", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsNotEqualTo(Float value) {
            addCriterion("temp_member_investment.tender_awards <>", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsGreaterThan(Float value) {
            addCriterion("temp_member_investment.tender_awards >", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.tender_awards >=", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsLessThan(Float value) {
            addCriterion("temp_member_investment.tender_awards <", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.tender_awards <=", value, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsIn(List<Float> values) {
            addCriterion("temp_member_investment.tender_awards in", values, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsNotIn(List<Float> values) {
            addCriterion("temp_member_investment.tender_awards not in", values, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.tender_awards between", value1, value2, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andTenderAwardsNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.tender_awards not between", value1, value2, "tenderAwards");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalIsNull() {
            addCriterion("temp_member_investment.already_income_total is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalIsNotNull() {
            addCriterion("temp_member_investment.already_income_total is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalEqualTo(Float value) {
            addCriterion("temp_member_investment.already_income_total =", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalNotEqualTo(Float value) {
            addCriterion("temp_member_investment.already_income_total <>", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalGreaterThan(Float value) {
            addCriterion("temp_member_investment.already_income_total >", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.already_income_total >=", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalLessThan(Float value) {
            addCriterion("temp_member_investment.already_income_total <", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.already_income_total <=", value, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalIn(List<Float> values) {
            addCriterion("temp_member_investment.already_income_total in", values, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalNotIn(List<Float> values) {
            addCriterion("temp_member_investment.already_income_total not in", values, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.already_income_total between", value1, value2, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andAlreadyIncomeTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.already_income_total not between", value1, value2, "alreadyIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalIsNull() {
            addCriterion("temp_member_investment.wait_income_total is null");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalIsNotNull() {
            addCriterion("temp_member_investment.wait_income_total is not null");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalEqualTo(Float value) {
            addCriterion("temp_member_investment.wait_income_total =", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalNotEqualTo(Float value) {
            addCriterion("temp_member_investment.wait_income_total <>", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalGreaterThan(Float value) {
            addCriterion("temp_member_investment.wait_income_total >", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.wait_income_total >=", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalLessThan(Float value) {
            addCriterion("temp_member_investment.wait_income_total <", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.wait_income_total <=", value, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalIn(List<Float> values) {
            addCriterion("temp_member_investment.wait_income_total in", values, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalNotIn(List<Float> values) {
            addCriterion("temp_member_investment.wait_income_total not in", values, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.wait_income_total between", value1, value2, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andWaitIncomeTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.wait_income_total not between", value1, value2, "waitIncomeTotal");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsIsNull() {
            addCriterion("temp_member_investment.promotion_awards is null");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsIsNotNull() {
            addCriterion("temp_member_investment.promotion_awards is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsEqualTo(Float value) {
            addCriterion("temp_member_investment.promotion_awards =", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsNotEqualTo(Float value) {
            addCriterion("temp_member_investment.promotion_awards <>", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsGreaterThan(Float value) {
            addCriterion("temp_member_investment.promotion_awards >", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.promotion_awards >=", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsLessThan(Float value) {
            addCriterion("temp_member_investment.promotion_awards <", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.promotion_awards <=", value, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsIn(List<Float> values) {
            addCriterion("temp_member_investment.promotion_awards in", values, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsNotIn(List<Float> values) {
            addCriterion("temp_member_investment.promotion_awards not in", values, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.promotion_awards between", value1, value2, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andPromotionAwardsNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.promotion_awards not between", value1, value2, "promotionAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsIsNull() {
            addCriterion("temp_member_investment.upline_delta_awards is null");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsIsNotNull() {
            addCriterion("temp_member_investment.upline_delta_awards is not null");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsEqualTo(Float value) {
            addCriterion("temp_member_investment.upline_delta_awards =", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsNotEqualTo(Float value) {
            addCriterion("temp_member_investment.upline_delta_awards <>", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsGreaterThan(Float value) {
            addCriterion("temp_member_investment.upline_delta_awards >", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.upline_delta_awards >=", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsLessThan(Float value) {
            addCriterion("temp_member_investment.upline_delta_awards <", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.upline_delta_awards <=", value, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsIn(List<Float> values) {
            addCriterion("temp_member_investment.upline_delta_awards in", values, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsNotIn(List<Float> values) {
            addCriterion("temp_member_investment.upline_delta_awards not in", values, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.upline_delta_awards between", value1, value2, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andUplineDeltaAwardsNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.upline_delta_awards not between", value1, value2, "uplineDeltaAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsIsNull() {
            addCriterion("temp_member_investment.continue_awards is null");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsIsNotNull() {
            addCriterion("temp_member_investment.continue_awards is not null");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsEqualTo(Float value) {
            addCriterion("temp_member_investment.continue_awards =", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsNotEqualTo(Float value) {
            addCriterion("temp_member_investment.continue_awards <>", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsGreaterThan(Float value) {
            addCriterion("temp_member_investment.continue_awards >", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.continue_awards >=", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsLessThan(Float value) {
            addCriterion("temp_member_investment.continue_awards <", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsLessThanOrEqualTo(Float value) {
            addCriterion("temp_member_investment.continue_awards <=", value, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsIn(List<Float> values) {
            addCriterion("temp_member_investment.continue_awards in", values, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsNotIn(List<Float> values) {
            addCriterion("temp_member_investment.continue_awards not in", values, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.continue_awards between", value1, value2, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andContinueAwardsNotBetween(Float value1, Float value2) {
            addCriterion("temp_member_investment.continue_awards not between", value1, value2, "continueAwards");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_member_investment.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_member_investment.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_member_investment.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_member_investment.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_member_investment.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_investment.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_member_investment.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_investment.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_member_investment.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_member_investment.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_member_investment.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_member_investment.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_member_investment.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_investment.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNull() {
            addCriterion("temp_member_investment.creater_time is null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNotNull() {
            addCriterion("temp_member_investment.creater_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeEqualTo(Date value) {
            addCriterion("temp_member_investment.creater_time =", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotEqualTo(Date value) {
            addCriterion("temp_member_investment.creater_time <>", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThan(Date value) {
            addCriterion("temp_member_investment.creater_time >", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_investment.creater_time >=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThan(Date value) {
            addCriterion("temp_member_investment.creater_time <", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_investment.creater_time <=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIn(List<Date> values) {
            addCriterion("temp_member_investment.creater_time in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotIn(List<Date> values) {
            addCriterion("temp_member_investment.creater_time not in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_investment.creater_time between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_investment.creater_time not between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_member_investment.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_member_investment.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_member_investment.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_member_investment.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_member_investment.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_member_investment.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_member_investment.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_member_investment.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_member_investment.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_member_investment.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_member_investment.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_member_investment.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_member_investment.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_member_investment.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_member_investment.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_member_investment.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_member_investment.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_member_investment.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_member_investment.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_member_investment.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_member_investment.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_member_investment.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_member_investment.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_member_investment.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_member_investment.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_member_investment.update_time not between", value1, value2, "updateTime");
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