package com.glacier.netloan.entity.borrow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepaymentTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RepaymentTypeExample() {
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

        public Criteria andRepaymentTypeIdIsNull() {
            addCriterion("temp_repayment_type.repayment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdIsNotNull() {
            addCriterion("temp_repayment_type.repayment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdEqualTo(String value) {
            addCriterion("temp_repayment_type.repayment_type_id =", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotEqualTo(String value) {
            addCriterion("temp_repayment_type.repayment_type_id <>", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdGreaterThan(String value) {
            addCriterion("temp_repayment_type.repayment_type_id >", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.repayment_type_id >=", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdLessThan(String value) {
            addCriterion("temp_repayment_type.repayment_type_id <", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.repayment_type_id <=", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdLike(String value) {
            addCriterion("temp_repayment_type.repayment_type_id like", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotLike(String value) {
            addCriterion("temp_repayment_type.repayment_type_id not like", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdIn(List<String> values) {
            addCriterion("temp_repayment_type.repayment_type_id in", values, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotIn(List<String> values) {
            addCriterion("temp_repayment_type.repayment_type_id not in", values, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.repayment_type_id between", value1, value2, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.repayment_type_id not between", value1, value2, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameIsNull() {
            addCriterion("temp_repayment_type.repayment_typer_name is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameIsNotNull() {
            addCriterion("temp_repayment_type.repayment_typer_name is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameEqualTo(String value) {
            addCriterion("temp_repayment_type.repayment_typer_name =", value, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameNotEqualTo(String value) {
            addCriterion("temp_repayment_type.repayment_typer_name <>", value, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameGreaterThan(String value) {
            addCriterion("temp_repayment_type.repayment_typer_name >", value, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.repayment_typer_name >=", value, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameLessThan(String value) {
            addCriterion("temp_repayment_type.repayment_typer_name <", value, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.repayment_typer_name <=", value, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameLike(String value) {
            addCriterion("temp_repayment_type.repayment_typer_name like", value, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameNotLike(String value) {
            addCriterion("temp_repayment_type.repayment_typer_name not like", value, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameIn(List<String> values) {
            addCriterion("temp_repayment_type.repayment_typer_name in", values, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameNotIn(List<String> values) {
            addCriterion("temp_repayment_type.repayment_typer_name not in", values, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.repayment_typer_name between", value1, value2, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andRepaymentTyperNameNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.repayment_typer_name not between", value1, value2, "repaymentTyperName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoIsNull() {
            addCriterion("temp_repayment_type.algorithm_info is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoIsNotNull() {
            addCriterion("temp_repayment_type.algorithm_info is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoEqualTo(String value) {
            addCriterion("temp_repayment_type.algorithm_info =", value, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoNotEqualTo(String value) {
            addCriterion("temp_repayment_type.algorithm_info <>", value, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoGreaterThan(String value) {
            addCriterion("temp_repayment_type.algorithm_info >", value, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.algorithm_info >=", value, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoLessThan(String value) {
            addCriterion("temp_repayment_type.algorithm_info <", value, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.algorithm_info <=", value, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoLike(String value) {
            addCriterion("temp_repayment_type.algorithm_info like", value, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoNotLike(String value) {
            addCriterion("temp_repayment_type.algorithm_info not like", value, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoIn(List<String> values) {
            addCriterion("temp_repayment_type.algorithm_info in", values, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoNotIn(List<String> values) {
            addCriterion("temp_repayment_type.algorithm_info not in", values, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.algorithm_info between", value1, value2, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andAlgorithmInfoNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.algorithm_info not between", value1, value2, "algorithmInfo");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("temp_repayment_type.state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("temp_repayment_type.state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("temp_repayment_type.state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("temp_repayment_type.state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("temp_repayment_type.state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("temp_repayment_type.state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("temp_repayment_type.state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("temp_repayment_type.state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("temp_repayment_type.state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("temp_repayment_type.state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_repayment_type.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_repayment_type.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_repayment_type.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_repayment_type.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_repayment_type.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_repayment_type.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_repayment_type.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_repayment_type.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_repayment_type.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_repayment_type.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_repayment_type.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_repayment_type.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_repayment_type.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_repayment_type.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_repayment_type.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_repayment_type.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_repayment_type.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_repayment_type.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_repayment_type.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_repayment_type.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_repayment_type.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_repayment_type.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_repayment_type.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_repayment_type.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_repayment_type.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_type.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_repayment_type.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_type.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_repayment_type.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_repayment_type.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_type.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_type.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_repayment_type.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_repayment_type.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_repayment_type.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_repayment_type.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_repayment_type.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_repayment_type.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_repayment_type.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_repayment_type.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_repayment_type.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_repayment_type.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_repayment_type.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_repayment_type.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_repayment_type.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_repayment_type.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_repayment_type.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_repayment_type.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_repayment_type.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_type.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_repayment_type.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_repayment_type.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_repayment_type.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_repayment_type.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_type.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_repayment_type.update_time not between", value1, value2, "updateTime");
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