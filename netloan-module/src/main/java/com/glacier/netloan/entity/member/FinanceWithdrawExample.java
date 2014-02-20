package com.glacier.netloan.entity.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceWithdrawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinanceWithdrawExample() {
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

        public Criteria andFinanceWithdrawIdIsNull() {
            addCriterion("temp_finance_withdraw.finance_withdraw_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdIsNotNull() {
            addCriterion("temp_finance_withdraw.finance_withdraw_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdEqualTo(String value) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id =", value, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdNotEqualTo(String value) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id <>", value, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdGreaterThan(String value) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id >", value, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id >=", value, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdLessThan(String value) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id <", value, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id <=", value, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdLike(String value) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id like", value, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdNotLike(String value) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id not like", value, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdIn(List<String> values) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id in", values, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdNotIn(List<String> values) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id not in", values, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id between", value1, value2, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andFinanceWithdrawIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.finance_withdraw_id not between", value1, value2, "financeWithdrawId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_finance_withdraw.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_finance_withdraw.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_finance_withdraw.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_finance_withdraw.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_finance_withdraw.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_finance_withdraw.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_finance_withdraw.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_finance_withdraw.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_finance_withdraw.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_finance_withdraw.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIsNull() {
            addCriterion("temp_finance_withdraw.opening_bank is null");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIsNotNull() {
            addCriterion("temp_finance_withdraw.opening_bank is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningBankEqualTo(String value) {
            addCriterion("temp_finance_withdraw.opening_bank =", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotEqualTo(String value) {
            addCriterion("temp_finance_withdraw.opening_bank <>", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankGreaterThan(String value) {
            addCriterion("temp_finance_withdraw.opening_bank >", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.opening_bank >=", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLessThan(String value) {
            addCriterion("temp_finance_withdraw.opening_bank <", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.opening_bank <=", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLike(String value) {
            addCriterion("temp_finance_withdraw.opening_bank like", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotLike(String value) {
            addCriterion("temp_finance_withdraw.opening_bank not like", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIn(List<String> values) {
            addCriterion("temp_finance_withdraw.opening_bank in", values, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotIn(List<String> values) {
            addCriterion("temp_finance_withdraw.opening_bank not in", values, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.opening_bank between", value1, value2, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.opening_bank not between", value1, value2, "openingBank");
            return (Criteria) this;
        }

        public Criteria andSubbranchIsNull() {
            addCriterion("temp_finance_withdraw.subbranch is null");
            return (Criteria) this;
        }

        public Criteria andSubbranchIsNotNull() {
            addCriterion("temp_finance_withdraw.subbranch is not null");
            return (Criteria) this;
        }

        public Criteria andSubbranchEqualTo(String value) {
            addCriterion("temp_finance_withdraw.subbranch =", value, "subbranch");
            return (Criteria) this;
        }

        public Criteria andSubbranchNotEqualTo(String value) {
            addCriterion("temp_finance_withdraw.subbranch <>", value, "subbranch");
            return (Criteria) this;
        }

        public Criteria andSubbranchGreaterThan(String value) {
            addCriterion("temp_finance_withdraw.subbranch >", value, "subbranch");
            return (Criteria) this;
        }

        public Criteria andSubbranchGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.subbranch >=", value, "subbranch");
            return (Criteria) this;
        }

        public Criteria andSubbranchLessThan(String value) {
            addCriterion("temp_finance_withdraw.subbranch <", value, "subbranch");
            return (Criteria) this;
        }

        public Criteria andSubbranchLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.subbranch <=", value, "subbranch");
            return (Criteria) this;
        }

        public Criteria andSubbranchLike(String value) {
            addCriterion("temp_finance_withdraw.subbranch like", value, "subbranch");
            return (Criteria) this;
        }

        public Criteria andSubbranchNotLike(String value) {
            addCriterion("temp_finance_withdraw.subbranch not like", value, "subbranch");
            return (Criteria) this;
        }

        public Criteria andSubbranchIn(List<String> values) {
            addCriterion("temp_finance_withdraw.subbranch in", values, "subbranch");
            return (Criteria) this;
        }

        public Criteria andSubbranchNotIn(List<String> values) {
            addCriterion("temp_finance_withdraw.subbranch not in", values, "subbranch");
            return (Criteria) this;
        }

        public Criteria andSubbranchBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.subbranch between", value1, value2, "subbranch");
            return (Criteria) this;
        }

        public Criteria andSubbranchNotBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.subbranch not between", value1, value2, "subbranch");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("temp_finance_withdraw.card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("temp_finance_withdraw.card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("temp_finance_withdraw.card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("temp_finance_withdraw.card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("temp_finance_withdraw.card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("temp_finance_withdraw.card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("temp_finance_withdraw.card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("temp_finance_withdraw.card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("temp_finance_withdraw.card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("temp_finance_withdraw.card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.card_name not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("temp_finance_withdraw.card_number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("temp_finance_withdraw.card_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("temp_finance_withdraw.card_number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("temp_finance_withdraw.card_number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("temp_finance_withdraw.card_number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.card_number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("temp_finance_withdraw.card_number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.card_number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("temp_finance_withdraw.card_number like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("temp_finance_withdraw.card_number not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("temp_finance_withdraw.card_number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("temp_finance_withdraw.card_number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.card_number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.card_number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountIsNull() {
            addCriterion("temp_finance_withdraw.withdraw_amount is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountIsNotNull() {
            addCriterion("temp_finance_withdraw.withdraw_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_amount =", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountNotEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_amount <>", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountGreaterThan(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_amount >", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_amount >=", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountLessThan(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_amount <", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_amount <=", value, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountIn(List<Float> values) {
            addCriterion("temp_finance_withdraw.withdraw_amount in", values, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountNotIn(List<Float> values) {
            addCriterion("temp_finance_withdraw.withdraw_amount not in", values, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountBetween(Float value1, Float value2) {
            addCriterion("temp_finance_withdraw.withdraw_amount between", value1, value2, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawAmountNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_withdraw.withdraw_amount not between", value1, value2, "withdrawAmount");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyIsNull() {
            addCriterion("temp_finance_withdraw.arrive_money is null");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyIsNotNull() {
            addCriterion("temp_finance_withdraw.arrive_money is not null");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.arrive_money =", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.arrive_money <>", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_withdraw.arrive_money >", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.arrive_money >=", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyLessThan(Float value) {
            addCriterion("temp_finance_withdraw.arrive_money <", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.arrive_money <=", value, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyIn(List<Float> values) {
            addCriterion("temp_finance_withdraw.arrive_money in", values, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_withdraw.arrive_money not in", values, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_withdraw.arrive_money between", value1, value2, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andArriveMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_withdraw.arrive_money not between", value1, value2, "arriveMoney");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeIsNull() {
            addCriterion("temp_finance_withdraw.handling_charge is null");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeIsNotNull() {
            addCriterion("temp_finance_withdraw.handling_charge is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.handling_charge =", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeNotEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.handling_charge <>", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeGreaterThan(Float value) {
            addCriterion("temp_finance_withdraw.handling_charge >", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.handling_charge >=", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeLessThan(Float value) {
            addCriterion("temp_finance_withdraw.handling_charge <", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.handling_charge <=", value, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeIn(List<Float> values) {
            addCriterion("temp_finance_withdraw.handling_charge in", values, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeNotIn(List<Float> values) {
            addCriterion("temp_finance_withdraw.handling_charge not in", values, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeBetween(Float value1, Float value2) {
            addCriterion("temp_finance_withdraw.handling_charge between", value1, value2, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andHandlingChargeNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_withdraw.handling_charge not between", value1, value2, "handlingCharge");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateIsNull() {
            addCriterion("temp_finance_withdraw.withdraw_rate is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateIsNotNull() {
            addCriterion("temp_finance_withdraw.withdraw_rate is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_rate =", value, "withdrawRate");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateNotEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_rate <>", value, "withdrawRate");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateGreaterThan(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_rate >", value, "withdrawRate");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_rate >=", value, "withdrawRate");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateLessThan(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_rate <", value, "withdrawRate");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_withdraw.withdraw_rate <=", value, "withdrawRate");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateIn(List<Float> values) {
            addCriterion("temp_finance_withdraw.withdraw_rate in", values, "withdrawRate");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateNotIn(List<Float> values) {
            addCriterion("temp_finance_withdraw.withdraw_rate not in", values, "withdrawRate");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateBetween(Float value1, Float value2) {
            addCriterion("temp_finance_withdraw.withdraw_rate between", value1, value2, "withdrawRate");
            return (Criteria) this;
        }

        public Criteria andWithdrawRateNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_withdraw.withdraw_rate not between", value1, value2, "withdrawRate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_finance_withdraw.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_finance_withdraw.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_finance_withdraw.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_finance_withdraw.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_finance_withdraw.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_finance_withdraw.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_finance_withdraw.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_finance_withdraw.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_finance_withdraw.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_finance_withdraw.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_finance_withdraw.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_finance_withdraw.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_finance_withdraw.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_finance_withdraw.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_finance_withdraw.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_finance_withdraw.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_finance_withdraw.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_finance_withdraw.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_finance_withdraw.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_finance_withdraw.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_finance_withdraw.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_finance_withdraw.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_finance_withdraw.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_finance_withdraw.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_finance_withdraw.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_finance_withdraw.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_finance_withdraw.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_withdraw.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_withdraw.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_withdraw.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_withdraw.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_withdraw.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_withdraw.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_withdraw.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_withdraw.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_withdraw.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_withdraw.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_withdraw.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_withdraw.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_withdraw.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_withdraw.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_withdraw.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_withdraw.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_withdraw.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_withdraw.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_withdraw.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_withdraw.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_withdraw.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_withdraw.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_withdraw.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_withdraw.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_withdraw.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_withdraw.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_withdraw.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_withdraw.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_withdraw.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_withdraw.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_withdraw.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_withdraw.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_withdraw.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_withdraw.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_withdraw.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_withdraw.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_withdraw.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_withdraw.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_withdraw.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_withdraw.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_withdraw.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_withdraw.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_withdraw.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_withdraw.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_withdraw.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_withdraw.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_withdraw.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_withdraw.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_withdraw.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_withdraw.update_time not between", value1, value2, "updateTime");
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