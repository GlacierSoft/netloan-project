package com.glacier.netloan.entity.account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountInvestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public AccountInvestExample() {
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

        public Criteria andInvestIdIsNull() {
            addCriterion("temp_account_invest.invest_id is null");
            return (Criteria) this;
        }

        public Criteria andInvestIdIsNotNull() {
            addCriterion("temp_account_invest.invest_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvestIdEqualTo(String value) {
            addCriterion("temp_account_invest.invest_id =", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdNotEqualTo(String value) {
            addCriterion("temp_account_invest.invest_id <>", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdGreaterThan(String value) {
            addCriterion("temp_account_invest.invest_id >", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_account_invest.invest_id >=", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdLessThan(String value) {
            addCriterion("temp_account_invest.invest_id <", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdLessThanOrEqualTo(String value) {
            addCriterion("temp_account_invest.invest_id <=", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdLike(String value) {
            addCriterion("temp_account_invest.invest_id like", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdNotLike(String value) {
            addCriterion("temp_account_invest.invest_id not like", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdIn(List<String> values) {
            addCriterion("temp_account_invest.invest_id in", values, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdNotIn(List<String> values) {
            addCriterion("temp_account_invest.invest_id not in", values, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdBetween(String value1, String value2) {
            addCriterion("temp_account_invest.invest_id between", value1, value2, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdNotBetween(String value1, String value2) {
            addCriterion("temp_account_invest.invest_id not between", value1, value2, "investId");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedIsNull() {
            addCriterion("temp_account_invest.sum_uncollected is null");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedIsNotNull() {
            addCriterion("temp_account_invest.sum_uncollected is not null");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_uncollected =", value, "sumUncollected");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedNotEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_uncollected <>", value, "sumUncollected");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedGreaterThan(Float value) {
            addCriterion("temp_account_invest.sum_uncollected >", value, "sumUncollected");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_uncollected >=", value, "sumUncollected");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedLessThan(Float value) {
            addCriterion("temp_account_invest.sum_uncollected <", value, "sumUncollected");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedLessThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_uncollected <=", value, "sumUncollected");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_uncollected in", values, "sumUncollected");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedNotIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_uncollected not in", values, "sumUncollected");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_uncollected between", value1, value2, "sumUncollected");
            return (Criteria) this;
        }

        public Criteria andSumUncollectedNotBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_uncollected not between", value1, value2, "sumUncollected");
            return (Criteria) this;
        }

        public Criteria andSumRewardIsNull() {
            addCriterion("temp_account_invest.sum_reward is null");
            return (Criteria) this;
        }

        public Criteria andSumRewardIsNotNull() {
            addCriterion("temp_account_invest.sum_reward is not null");
            return (Criteria) this;
        }

        public Criteria andSumRewardEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_reward =", value, "sumReward");
            return (Criteria) this;
        }

        public Criteria andSumRewardNotEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_reward <>", value, "sumReward");
            return (Criteria) this;
        }

        public Criteria andSumRewardGreaterThan(Float value) {
            addCriterion("temp_account_invest.sum_reward >", value, "sumReward");
            return (Criteria) this;
        }

        public Criteria andSumRewardGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_reward >=", value, "sumReward");
            return (Criteria) this;
        }

        public Criteria andSumRewardLessThan(Float value) {
            addCriterion("temp_account_invest.sum_reward <", value, "sumReward");
            return (Criteria) this;
        }

        public Criteria andSumRewardLessThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_reward <=", value, "sumReward");
            return (Criteria) this;
        }

        public Criteria andSumRewardIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_reward in", values, "sumReward");
            return (Criteria) this;
        }

        public Criteria andSumRewardNotIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_reward not in", values, "sumReward");
            return (Criteria) this;
        }

        public Criteria andSumRewardBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_reward between", value1, value2, "sumReward");
            return (Criteria) this;
        }

        public Criteria andSumRewardNotBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_reward not between", value1, value2, "sumReward");
            return (Criteria) this;
        }

        public Criteria andSumFineIsNull() {
            addCriterion("temp_account_invest.sum_fine is null");
            return (Criteria) this;
        }

        public Criteria andSumFineIsNotNull() {
            addCriterion("temp_account_invest.sum_fine is not null");
            return (Criteria) this;
        }

        public Criteria andSumFineEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_fine =", value, "sumFine");
            return (Criteria) this;
        }

        public Criteria andSumFineNotEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_fine <>", value, "sumFine");
            return (Criteria) this;
        }

        public Criteria andSumFineGreaterThan(Float value) {
            addCriterion("temp_account_invest.sum_fine >", value, "sumFine");
            return (Criteria) this;
        }

        public Criteria andSumFineGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_fine >=", value, "sumFine");
            return (Criteria) this;
        }

        public Criteria andSumFineLessThan(Float value) {
            addCriterion("temp_account_invest.sum_fine <", value, "sumFine");
            return (Criteria) this;
        }

        public Criteria andSumFineLessThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_fine <=", value, "sumFine");
            return (Criteria) this;
        }

        public Criteria andSumFineIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_fine in", values, "sumFine");
            return (Criteria) this;
        }

        public Criteria andSumFineNotIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_fine not in", values, "sumFine");
            return (Criteria) this;
        }

        public Criteria andSumFineBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_fine between", value1, value2, "sumFine");
            return (Criteria) this;
        }

        public Criteria andSumFineNotBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_fine not between", value1, value2, "sumFine");
            return (Criteria) this;
        }

        public Criteria andSumBorrowIsNull() {
            addCriterion("temp_account_invest.sum_borrow is null");
            return (Criteria) this;
        }

        public Criteria andSumBorrowIsNotNull() {
            addCriterion("temp_account_invest.sum_borrow is not null");
            return (Criteria) this;
        }

        public Criteria andSumBorrowEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_borrow =", value, "sumBorrow");
            return (Criteria) this;
        }

        public Criteria andSumBorrowNotEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_borrow <>", value, "sumBorrow");
            return (Criteria) this;
        }

        public Criteria andSumBorrowGreaterThan(Float value) {
            addCriterion("temp_account_invest.sum_borrow >", value, "sumBorrow");
            return (Criteria) this;
        }

        public Criteria andSumBorrowGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_borrow >=", value, "sumBorrow");
            return (Criteria) this;
        }

        public Criteria andSumBorrowLessThan(Float value) {
            addCriterion("temp_account_invest.sum_borrow <", value, "sumBorrow");
            return (Criteria) this;
        }

        public Criteria andSumBorrowLessThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_borrow <=", value, "sumBorrow");
            return (Criteria) this;
        }

        public Criteria andSumBorrowIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_borrow in", values, "sumBorrow");
            return (Criteria) this;
        }

        public Criteria andSumBorrowNotIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_borrow not in", values, "sumBorrow");
            return (Criteria) this;
        }

        public Criteria andSumBorrowBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_borrow between", value1, value2, "sumBorrow");
            return (Criteria) this;
        }

        public Criteria andSumBorrowNotBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_borrow not between", value1, value2, "sumBorrow");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeIsNull() {
            addCriterion("temp_account_invest.sum_advfee is null");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeIsNotNull() {
            addCriterion("temp_account_invest.sum_advfee is not null");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_advfee =", value, "sumAdvfee");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeNotEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_advfee <>", value, "sumAdvfee");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeGreaterThan(Float value) {
            addCriterion("temp_account_invest.sum_advfee >", value, "sumAdvfee");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_advfee >=", value, "sumAdvfee");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeLessThan(Float value) {
            addCriterion("temp_account_invest.sum_advfee <", value, "sumAdvfee");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeLessThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_advfee <=", value, "sumAdvfee");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_advfee in", values, "sumAdvfee");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeNotIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_advfee not in", values, "sumAdvfee");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_advfee between", value1, value2, "sumAdvfee");
            return (Criteria) this;
        }

        public Criteria andSumAdvfeeNotBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_advfee not between", value1, value2, "sumAdvfee");
            return (Criteria) this;
        }

        public Criteria andSumInterestIsNull() {
            addCriterion("temp_account_invest.sum_interest is null");
            return (Criteria) this;
        }

        public Criteria andSumInterestIsNotNull() {
            addCriterion("temp_account_invest.sum_interest is not null");
            return (Criteria) this;
        }

        public Criteria andSumInterestEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_interest =", value, "sumInterest");
            return (Criteria) this;
        }

        public Criteria andSumInterestNotEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_interest <>", value, "sumInterest");
            return (Criteria) this;
        }

        public Criteria andSumInterestGreaterThan(Float value) {
            addCriterion("temp_account_invest.sum_interest >", value, "sumInterest");
            return (Criteria) this;
        }

        public Criteria andSumInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_interest >=", value, "sumInterest");
            return (Criteria) this;
        }

        public Criteria andSumInterestLessThan(Float value) {
            addCriterion("temp_account_invest.sum_interest <", value, "sumInterest");
            return (Criteria) this;
        }

        public Criteria andSumInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_interest <=", value, "sumInterest");
            return (Criteria) this;
        }

        public Criteria andSumInterestIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_interest in", values, "sumInterest");
            return (Criteria) this;
        }

        public Criteria andSumInterestNotIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_interest not in", values, "sumInterest");
            return (Criteria) this;
        }

        public Criteria andSumInterestBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_interest between", value1, value2, "sumInterest");
            return (Criteria) this;
        }

        public Criteria andSumInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_interest not between", value1, value2, "sumInterest");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeIsNull() {
            addCriterion("temp_account_invest.sum_interestfee is null");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeIsNotNull() {
            addCriterion("temp_account_invest.sum_interestfee is not null");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_interestfee =", value, "sumInterestfee");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeNotEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_interestfee <>", value, "sumInterestfee");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeGreaterThan(Float value) {
            addCriterion("temp_account_invest.sum_interestfee >", value, "sumInterestfee");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_interestfee >=", value, "sumInterestfee");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeLessThan(Float value) {
            addCriterion("temp_account_invest.sum_interestfee <", value, "sumInterestfee");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeLessThanOrEqualTo(Float value) {
            addCriterion("temp_account_invest.sum_interestfee <=", value, "sumInterestfee");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_interestfee in", values, "sumInterestfee");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeNotIn(List<Float> values) {
            addCriterion("temp_account_invest.sum_interestfee not in", values, "sumInterestfee");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_interestfee between", value1, value2, "sumInterestfee");
            return (Criteria) this;
        }

        public Criteria andSumInterestfeeNotBetween(Float value1, Float value2) {
            addCriterion("temp_account_invest.sum_interestfee not between", value1, value2, "sumInterestfee");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_account_invest.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_account_invest.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_account_invest.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_account_invest.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_account_invest.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_account_invest.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_account_invest.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_account_invest.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_account_invest.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_account_invest.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_account_invest.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_account_invest.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_account_invest.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_account_invest.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_account_invest.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_account_invest.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_account_invest.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_account_invest.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_account_invest.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_account_invest.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_account_invest.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_account_invest.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_account_invest.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_account_invest.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_account_invest.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_account_invest.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_account_invest.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_account_invest.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_account_invest.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_account_invest.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_account_invest.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_account_invest.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_account_invest.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_account_invest.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_account_invest.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_account_invest.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_account_invest.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_account_invest.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_account_invest.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_account_invest.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_account_invest.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_account_invest.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_account_invest.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_account_invest.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_account_invest.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_account_invest.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_account_invest.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_account_invest.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_account_invest.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_account_invest.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_account_invest.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_account_invest.update_time not between", value1, value2, "updateTime");
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