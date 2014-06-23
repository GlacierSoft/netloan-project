package com.glacier.netloan.entity.finance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.glacier.netloan.entity.finance.FinanceBankCardExample.Criteria;

public class FinanceMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinanceMemberExample() {
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
        public Criteria andMemberRealNamelike(String value) {
            addCriterion("temp_member.member_real_name like", value, "memberDisplay");
            return (Criteria) this;
        }
        
        public Criteria andBankCardDisplaylike(String value) {
            addCriterion("temp_bank_card.opening_bank =", value, "bankCardDisplay");
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

        public Criteria andFinanceMemberIdIsNull() {
            addCriterion("temp_finance_member.finance_member_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdIsNotNull() {
            addCriterion("temp_finance_member.finance_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdEqualTo(String value) {
            addCriterion("temp_finance_member.finance_member_id =", value, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_member.finance_member_id <>", value, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_member.finance_member_id >", value, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.finance_member_id >=", value, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdLessThan(String value) {
            addCriterion("temp_finance_member.finance_member_id <", value, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.finance_member_id <=", value, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdLike(String value) {
            addCriterion("temp_finance_member.finance_member_id like", value, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdNotLike(String value) {
            addCriterion("temp_finance_member.finance_member_id not like", value, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdIn(List<String> values) {
            addCriterion("temp_finance_member.finance_member_id in", values, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_member.finance_member_id not in", values, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_member.finance_member_id between", value1, value2, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andFinanceMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member.finance_member_id not between", value1, value2, "financeMemberId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdIsNull() {
            addCriterion("temp_finance_member.bank_card_id is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIdIsNotNull() {
            addCriterion("temp_finance_member.bank_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardIdEqualTo(String value) {
            addCriterion("temp_finance_member.bank_card_id =", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotEqualTo(String value) {
            addCriterion("temp_finance_member.bank_card_id <>", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThan(String value) {
            addCriterion("temp_finance_member.bank_card_id >", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.bank_card_id >=", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThan(String value) {
            addCriterion("temp_finance_member.bank_card_id <", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.bank_card_id <=", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdLike(String value) {
            addCriterion("temp_finance_member.bank_card_id like", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotLike(String value) {
            addCriterion("temp_finance_member.bank_card_id not like", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdIn(List<String> values) {
            addCriterion("temp_finance_member.bank_card_id in", values, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotIn(List<String> values) {
            addCriterion("temp_finance_member.bank_card_id not in", values, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdBetween(String value1, String value2) {
            addCriterion("temp_finance_member.bank_card_id between", value1, value2, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member.bank_card_id not between", value1, value2, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_finance_member.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_finance_member.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_finance_member.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_member.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_member.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_finance_member.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_finance_member.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_finance_member.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_finance_member.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_member.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_member.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyIsNull() {
            addCriterion("temp_finance_member.usable_money is null");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyIsNotNull() {
            addCriterion("temp_finance_member.usable_money is not null");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyEqualTo(Float value) {
            addCriterion("temp_finance_member.usable_money =", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_member.usable_money <>", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_member.usable_money >", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.usable_money >=", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyLessThan(Float value) {
            addCriterion("temp_finance_member.usable_money <", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.usable_money <=", value, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyIn(List<Float> values) {
            addCriterion("temp_finance_member.usable_money in", values, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_member.usable_money not in", values, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.usable_money between", value1, value2, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andUsableMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.usable_money not between", value1, value2, "usableMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIsNull() {
            addCriterion("temp_finance_member.frozen_money is null");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIsNotNull() {
            addCriterion("temp_finance_member.frozen_money is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyEqualTo(Float value) {
            addCriterion("temp_finance_member.frozen_money =", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_member.frozen_money <>", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_member.frozen_money >", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.frozen_money >=", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyLessThan(Float value) {
            addCriterion("temp_finance_member.frozen_money <", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.frozen_money <=", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIn(List<Float> values) {
            addCriterion("temp_finance_member.frozen_money in", values, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_member.frozen_money not in", values, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.frozen_money between", value1, value2, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.frozen_money not between", value1, value2, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyIsNull() {
            addCriterion("temp_finance_member.collecting_money is null");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyIsNotNull() {
            addCriterion("temp_finance_member.collecting_money is not null");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyEqualTo(Float value) {
            addCriterion("temp_finance_member.collecting_money =", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_member.collecting_money <>", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_member.collecting_money >", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.collecting_money >=", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyLessThan(Float value) {
            addCriterion("temp_finance_member.collecting_money <", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.collecting_money <=", value, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyIn(List<Float> values) {
            addCriterion("temp_finance_member.collecting_money in", values, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_member.collecting_money not in", values, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.collecting_money between", value1, value2, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andCollectingMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.collecting_money not between", value1, value2, "collectingMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNull() {
            addCriterion("temp_finance_member.refund_money is null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNotNull() {
            addCriterion("temp_finance_member.refund_money is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyEqualTo(Float value) {
            addCriterion("temp_finance_member.refund_money =", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_member.refund_money <>", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_member.refund_money >", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.refund_money >=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThan(Float value) {
            addCriterion("temp_finance_member.refund_money <", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.refund_money <=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIn(List<Float> values) {
            addCriterion("temp_finance_member.refund_money in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_member.refund_money not in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.refund_money between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.refund_money not between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("temp_finance_member.amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("temp_finance_member.amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Float value) {
            addCriterion("temp_finance_member.amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Float value) {
            addCriterion("temp_finance_member.amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Float value) {
            addCriterion("temp_finance_member.amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Float value) {
            addCriterion("temp_finance_member.amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Float> values) {
            addCriterion("temp_finance_member.amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Float> values) {
            addCriterion("temp_finance_member.amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesIsNull() {
            addCriterion("temp_finance_member.recharge_month_times is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesIsNotNull() {
            addCriterion("temp_finance_member.recharge_month_times is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_month_times =", value, "rechargeMonthTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesNotEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_month_times <>", value, "rechargeMonthTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesGreaterThan(Float value) {
            addCriterion("temp_finance_member.recharge_month_times >", value, "rechargeMonthTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_month_times >=", value, "rechargeMonthTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesLessThan(Float value) {
            addCriterion("temp_finance_member.recharge_month_times <", value, "rechargeMonthTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_month_times <=", value, "rechargeMonthTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesIn(List<Float> values) {
            addCriterion("temp_finance_member.recharge_month_times in", values, "rechargeMonthTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesNotIn(List<Float> values) {
            addCriterion("temp_finance_member.recharge_month_times not in", values, "rechargeMonthTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.recharge_month_times between", value1, value2, "rechargeMonthTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeMonthTimesNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.recharge_month_times not between", value1, value2, "rechargeMonthTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesIsNull() {
            addCriterion("temp_finance_member.recharge_times is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesIsNotNull() {
            addCriterion("temp_finance_member.recharge_times is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_times =", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesNotEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_times <>", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesGreaterThan(Float value) {
            addCriterion("temp_finance_member.recharge_times >", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_times >=", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesLessThan(Float value) {
            addCriterion("temp_finance_member.recharge_times <", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_times <=", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesIn(List<Float> values) {
            addCriterion("temp_finance_member.recharge_times in", values, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesNotIn(List<Float> values) {
            addCriterion("temp_finance_member.recharge_times not in", values, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.recharge_times between", value1, value2, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.recharge_times not between", value1, value2, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("temp_finance_member.recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("temp_finance_member.recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_member.recharge_money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(Float value) {
            addCriterion("temp_finance_member.recharge_money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.recharge_money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<Float> values) {
            addCriterion("temp_finance_member.recharge_money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_member.recharge_money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.recharge_money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.recharge_money not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesIsNull() {
            addCriterion("temp_finance_member.withdraw_month_times is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesIsNotNull() {
            addCriterion("temp_finance_member.withdraw_month_times is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_month_times =", value, "withdrawMonthTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesNotEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_month_times <>", value, "withdrawMonthTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesGreaterThan(Float value) {
            addCriterion("temp_finance_member.withdraw_month_times >", value, "withdrawMonthTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_month_times >=", value, "withdrawMonthTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesLessThan(Float value) {
            addCriterion("temp_finance_member.withdraw_month_times <", value, "withdrawMonthTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_month_times <=", value, "withdrawMonthTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesIn(List<Float> values) {
            addCriterion("temp_finance_member.withdraw_month_times in", values, "withdrawMonthTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesNotIn(List<Float> values) {
            addCriterion("temp_finance_member.withdraw_month_times not in", values, "withdrawMonthTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.withdraw_month_times between", value1, value2, "withdrawMonthTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawMonthTimesNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.withdraw_month_times not between", value1, value2, "withdrawMonthTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesIsNull() {
            addCriterion("temp_finance_member.withdraw_times is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesIsNotNull() {
            addCriterion("temp_finance_member.withdraw_times is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_times =", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesNotEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_times <>", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesGreaterThan(Float value) {
            addCriterion("temp_finance_member.withdraw_times >", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_times >=", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesLessThan(Float value) {
            addCriterion("temp_finance_member.withdraw_times <", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_times <=", value, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesIn(List<Float> values) {
            addCriterion("temp_finance_member.withdraw_times in", values, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesNotIn(List<Float> values) {
            addCriterion("temp_finance_member.withdraw_times not in", values, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.withdraw_times between", value1, value2, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimesNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.withdraw_times not between", value1, value2, "withdrawTimes");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyIsNull() {
            addCriterion("temp_finance_member.withdraw_money is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyIsNotNull() {
            addCriterion("temp_finance_member.withdraw_money is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_money =", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_money <>", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_member.withdraw_money >", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_money >=", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyLessThan(Float value) {
            addCriterion("temp_finance_member.withdraw_money <", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.withdraw_money <=", value, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyIn(List<Float> values) {
            addCriterion("temp_finance_member.withdraw_money in", values, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_member.withdraw_money not in", values, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.withdraw_money between", value1, value2, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.withdraw_money not between", value1, value2, "withdrawMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditIsNull() {
            addCriterion("temp_finance_member.borrower_credit is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditIsNotNull() {
            addCriterion("temp_finance_member.borrower_credit is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditEqualTo(Float value) {
            addCriterion("temp_finance_member.borrower_credit =", value, "borrowerCredit");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditNotEqualTo(Float value) {
            addCriterion("temp_finance_member.borrower_credit <>", value, "borrowerCredit");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditGreaterThan(Float value) {
            addCriterion("temp_finance_member.borrower_credit >", value, "borrowerCredit");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.borrower_credit >=", value, "borrowerCredit");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditLessThan(Float value) {
            addCriterion("temp_finance_member.borrower_credit <", value, "borrowerCredit");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.borrower_credit <=", value, "borrowerCredit");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditIn(List<Float> values) {
            addCriterion("temp_finance_member.borrower_credit in", values, "borrowerCredit");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditNotIn(List<Float> values) {
            addCriterion("temp_finance_member.borrower_credit not in", values, "borrowerCredit");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.borrower_credit between", value1, value2, "borrowerCredit");
            return (Criteria) this;
        }

        public Criteria andBorrowerCreditNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.borrower_credit not between", value1, value2, "borrowerCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditIsNull() {
            addCriterion("temp_finance_member.available_credit is null");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditIsNotNull() {
            addCriterion("temp_finance_member.available_credit is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditEqualTo(Float value) {
            addCriterion("temp_finance_member.available_credit =", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditNotEqualTo(Float value) {
            addCriterion("temp_finance_member.available_credit <>", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditGreaterThan(Float value) {
            addCriterion("temp_finance_member.available_credit >", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.available_credit >=", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditLessThan(Float value) {
            addCriterion("temp_finance_member.available_credit <", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_member.available_credit <=", value, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditIn(List<Float> values) {
            addCriterion("temp_finance_member.available_credit in", values, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditNotIn(List<Float> values) {
            addCriterion("temp_finance_member.available_credit not in", values, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.available_credit between", value1, value2, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andAvailableCreditNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_member.available_credit not between", value1, value2, "availableCredit");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_member.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_member.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_member.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_member.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_member.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_member.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_member.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_member.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_member.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_member.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_member.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_member.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_member.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_member.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_member.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_member.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_member.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_member.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_member.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_member.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_member.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_member.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_member.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_member.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_member.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_member.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_member.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_member.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_member.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_member.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_member.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_member.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_member.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_member.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_member.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_member.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_member.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_member.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_member.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_member.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_member.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_member.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_member.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_member.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_member.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_member.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_member.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_member.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_member.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_member.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_member.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_member.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_member.update_time not between", value1, value2, "updateTime");
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