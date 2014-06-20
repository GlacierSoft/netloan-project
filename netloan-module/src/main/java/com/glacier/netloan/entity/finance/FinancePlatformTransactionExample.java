package com.glacier.netloan.entity.finance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.glacier.netloan.entity.finance.FinanceTransactionExample.Criteria;

public class FinancePlatformTransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FinancePlatformTransactionExample() {
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
  		    addCriterion("temp_finance_platform.platform_name like", value, "financePlatformDisplay");
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

        public Criteria andPlatformTransactionIdIsNull() {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdIsNotNull() {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id =", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdNotEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id <>", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdGreaterThan(String value) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id >", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id >=", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdLessThan(String value) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id <", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id <=", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdLike(String value) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id like", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdNotLike(String value) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id not like", value, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id in", values, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdNotIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id not in", values, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id between", value1, value2, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andPlatformTransactionIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.platform_transaction_id not between", value1, value2, "platformTransactionId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdIsNull() {
            addCriterion("temp_finance_platform_transaction.finance_platform_id is null");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdIsNotNull() {
            addCriterion("temp_finance_platform_transaction.finance_platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id =", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdNotEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id <>", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdGreaterThan(String value) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id >", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id >=", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdLessThan(String value) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id <", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id <=", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdLike(String value) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id like", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdNotLike(String value) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id not like", value, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id in", values, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdNotIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id not in", values, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id between", value1, value2, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andFinancePlatformIdNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.finance_platform_id not between", value1, value2, "financePlatformId");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetIsNull() {
            addCriterion("temp_finance_platform_transaction.transaction_target is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetIsNotNull() {
            addCriterion("temp_finance_platform_transaction.transaction_target is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_target =", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetNotEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_target <>", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetGreaterThan(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_target >", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_target >=", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetLessThan(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_target <", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_target <=", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetLike(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_target like", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetNotLike(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_target not like", value, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.transaction_target in", values, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetNotIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.transaction_target not in", values, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.transaction_target between", value1, value2, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTargetNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.transaction_target not between", value1, value2, "transactionTarget");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNull() {
            addCriterion("temp_finance_platform_transaction.transaction_type is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNotNull() {
            addCriterion("temp_finance_platform_transaction.transaction_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_type =", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_type <>", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThan(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_type >", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_type >=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThan(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_type <", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_type <=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLike(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_type like", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotLike(String value) {
            addCriterion("temp_finance_platform_transaction.transaction_type not like", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.transaction_type in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.transaction_type not in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.transaction_type between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.transaction_type not between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyIsNull() {
            addCriterion("temp_finance_platform_transaction.earning_money is null");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyIsNotNull() {
            addCriterion("temp_finance_platform_transaction.earning_money is not null");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.earning_money =", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.earning_money <>", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_platform_transaction.earning_money >", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.earning_money >=", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyLessThan(Float value) {
            addCriterion("temp_finance_platform_transaction.earning_money <", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.earning_money <=", value, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyIn(List<Float> values) {
            addCriterion("temp_finance_platform_transaction.earning_money in", values, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_platform_transaction.earning_money not in", values, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_platform_transaction.earning_money between", value1, value2, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andEarningMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_platform_transaction.earning_money not between", value1, value2, "earningMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyIsNull() {
            addCriterion("temp_finance_platform_transaction.expend_money is null");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyIsNotNull() {
            addCriterion("temp_finance_platform_transaction.expend_money is not null");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.expend_money =", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyNotEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.expend_money <>", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyGreaterThan(Float value) {
            addCriterion("temp_finance_platform_transaction.expend_money >", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.expend_money >=", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyLessThan(Float value) {
            addCriterion("temp_finance_platform_transaction.expend_money <", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.expend_money <=", value, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyIn(List<Float> values) {
            addCriterion("temp_finance_platform_transaction.expend_money in", values, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyNotIn(List<Float> values) {
            addCriterion("temp_finance_platform_transaction.expend_money not in", values, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_finance_platform_transaction.expend_money between", value1, value2, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andExpendMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_platform_transaction.expend_money not between", value1, value2, "expendMoney");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("temp_finance_platform_transaction.amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("temp_finance_platform_transaction.amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Float value) {
            addCriterion("temp_finance_platform_transaction.amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Float value) {
            addCriterion("temp_finance_platform_transaction.amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Float value) {
            addCriterion("temp_finance_platform_transaction.amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Float> values) {
            addCriterion("temp_finance_platform_transaction.amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Float> values) {
            addCriterion("temp_finance_platform_transaction.amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Float value1, Float value2) {
            addCriterion("temp_finance_platform_transaction.amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Float value1, Float value2) {
            addCriterion("temp_finance_platform_transaction.amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_finance_platform_transaction.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_finance_platform_transaction.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_finance_platform_transaction.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_finance_platform_transaction.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_finance_platform_transaction.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_finance_platform_transaction.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_finance_platform_transaction.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_finance_platform_transaction.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_finance_platform_transaction.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_finance_platform_transaction.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_finance_platform_transaction.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_finance_platform_transaction.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_finance_platform_transaction.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_finance_platform_transaction.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_finance_platform_transaction.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_platform_transaction.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_platform_transaction.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform_transaction.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_finance_platform_transaction.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform_transaction.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_finance_platform_transaction.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_platform_transaction.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform_transaction.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform_transaction.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_finance_platform_transaction.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_finance_platform_transaction.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_finance_platform_transaction.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_finance_platform_transaction.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_finance_platform_transaction.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_finance_platform_transaction.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_finance_platform_transaction.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_finance_platform_transaction.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_finance_platform_transaction.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_finance_platform_transaction.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_finance_platform_transaction.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_finance_platform_transaction.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_finance_platform_transaction.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_finance_platform_transaction.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform_transaction.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_finance_platform_transaction.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_finance_platform_transaction.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_finance_platform_transaction.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_finance_platform_transaction.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform_transaction.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_finance_platform_transaction.update_time not between", value1, value2, "updateTime");
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