package com.glacier.netloan.entity.borrow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceivablesNotesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ReceivablesNotesExample() {
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
        public Criteria andMemberDisplayLike(String value) {
            addCriterion("temp_member.member_name like", value, "memberDisplay");
            return (Criteria) this;
        }
        
        /*自定义查询条件*/
        public Criteria andLoanStateEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_state =", value, "loanState");
            return (Criteria) this;
        }
        /*自定义查询条件*/
        public Criteria andLoanStateIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_state in", values, "loanState");
            return (Criteria) this;
        }
        
        /*自定义查询条件*/
        public Criteria andLoanTitleLike(String value) {
            addCriterion("temp_borrowing_loan.loan_title like", value, "loanTitle");
            return (Criteria) this;
        }
        
        /*自定义查询条件*/
        public Criteria andLoanIdEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_id =", value, "loanId");
            return (Criteria) this;
        }
        
        /*自定义查询条件*/
        public Criteria andLoanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.loan_date >=", value, "loanDate");
            return (Criteria) this;
        }
        /*自定义查询条件*/
        public Criteria andLoanDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.loan_date <=", value, "loanDate");
            return (Criteria) this;
        }
        /*自定义查询条件*/
        public Criteria andLoanDateBetween(Date value1, Date value2) {
            addCriterion("temp_borrowing_loan.loan_date between", value1, value2, "loanDate");
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

        public Criteria andReceNotesIdIsNull() {
            addCriterion("temp_receivables_notes.rece_notes_id is null");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdIsNotNull() {
            addCriterion("temp_receivables_notes.rece_notes_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdEqualTo(String value) {
            addCriterion("temp_receivables_notes.rece_notes_id =", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdNotEqualTo(String value) {
            addCriterion("temp_receivables_notes.rece_notes_id <>", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdGreaterThan(String value) {
            addCriterion("temp_receivables_notes.rece_notes_id >", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.rece_notes_id >=", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdLessThan(String value) {
            addCriterion("temp_receivables_notes.rece_notes_id <", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.rece_notes_id <=", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdLike(String value) {
            addCriterion("temp_receivables_notes.rece_notes_id like", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdNotLike(String value) {
            addCriterion("temp_receivables_notes.rece_notes_id not like", value, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdIn(List<String> values) {
            addCriterion("temp_receivables_notes.rece_notes_id in", values, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdNotIn(List<String> values) {
            addCriterion("temp_receivables_notes.rece_notes_id not in", values, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.rece_notes_id between", value1, value2, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andReceNotesIdNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.rece_notes_id not between", value1, value2, "receNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdIsNull() {
            addCriterion("temp_receivables_notes.tender_notes_id is null");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdIsNotNull() {
            addCriterion("temp_receivables_notes.tender_notes_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdEqualTo(String value) {
            addCriterion("temp_receivables_notes.tender_notes_id =", value, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdNotEqualTo(String value) {
            addCriterion("temp_receivables_notes.tender_notes_id <>", value, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdGreaterThan(String value) {
            addCriterion("temp_receivables_notes.tender_notes_id >", value, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.tender_notes_id >=", value, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdLessThan(String value) {
            addCriterion("temp_receivables_notes.tender_notes_id <", value, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.tender_notes_id <=", value, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdLike(String value) {
            addCriterion("temp_receivables_notes.tender_notes_id like", value, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdNotLike(String value) {
            addCriterion("temp_receivables_notes.tender_notes_id not like", value, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdIn(List<String> values) {
            addCriterion("temp_receivables_notes.tender_notes_id in", values, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdNotIn(List<String> values) {
            addCriterion("temp_receivables_notes.tender_notes_id not in", values, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.tender_notes_id between", value1, value2, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andTenderNotesIdNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.tender_notes_id not between", value1, value2, "tenderNotesId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_receivables_notes.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_receivables_notes.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_receivables_notes.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_receivables_notes.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_receivables_notes.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_receivables_notes.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_receivables_notes.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_receivables_notes.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_receivables_notes.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_receivables_notes.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalIsNull() {
            addCriterion("temp_receivables_notes.receivables_total is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalIsNotNull() {
            addCriterion("temp_receivables_notes.receivables_total is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalEqualTo(Float value) {
            addCriterion("temp_receivables_notes.receivables_total =", value, "receivablesTotal");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.receivables_total <>", value, "receivablesTotal");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.receivables_total >", value, "receivablesTotal");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.receivables_total >=", value, "receivablesTotal");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalLessThan(Float value) {
            addCriterion("temp_receivables_notes.receivables_total <", value, "receivablesTotal");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.receivables_total <=", value, "receivablesTotal");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalIn(List<Float> values) {
            addCriterion("temp_receivables_notes.receivables_total in", values, "receivablesTotal");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.receivables_total not in", values, "receivablesTotal");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.receivables_total between", value1, value2, "receivablesTotal");
            return (Criteria) this;
        }

        public Criteria andReceivablesTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.receivables_total not between", value1, value2, "receivablesTotal");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyIsNull() {
            addCriterion("temp_receivables_notes.should_rece_money is null");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyIsNotNull() {
            addCriterion("temp_receivables_notes.should_rece_money is not null");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_money =", value, "shouldReceMoney");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_money <>", value, "shouldReceMoney");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.should_rece_money >", value, "shouldReceMoney");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_money >=", value, "shouldReceMoney");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyLessThan(Float value) {
            addCriterion("temp_receivables_notes.should_rece_money <", value, "shouldReceMoney");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_money <=", value, "shouldReceMoney");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyIn(List<Float> values) {
            addCriterion("temp_receivables_notes.should_rece_money in", values, "shouldReceMoney");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.should_rece_money not in", values, "shouldReceMoney");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.should_rece_money between", value1, value2, "shouldReceMoney");
            return (Criteria) this;
        }

        public Criteria andShouldReceMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.should_rece_money not between", value1, value2, "shouldReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyIsNull() {
            addCriterion("temp_receivables_notes.alr_rece_money is null");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyIsNotNull() {
            addCriterion("temp_receivables_notes.alr_rece_money is not null");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_money =", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_money <>", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_money >", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_money >=", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyLessThan(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_money <", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_money <=", value, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyIn(List<Float> values) {
            addCriterion("temp_receivables_notes.alr_rece_money in", values, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.alr_rece_money not in", values, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.alr_rece_money between", value1, value2, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andAlrReceMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.alr_rece_money not between", value1, value2, "alrReceMoney");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyIsNull() {
            addCriterion("temp_receivables_notes.not_rece_money is null");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyIsNotNull() {
            addCriterion("temp_receivables_notes.not_rece_money is not null");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_money =", value, "notReceMoney");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_money <>", value, "notReceMoney");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.not_rece_money >", value, "notReceMoney");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_money >=", value, "notReceMoney");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyLessThan(Float value) {
            addCriterion("temp_receivables_notes.not_rece_money <", value, "notReceMoney");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_money <=", value, "notReceMoney");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyIn(List<Float> values) {
            addCriterion("temp_receivables_notes.not_rece_money in", values, "notReceMoney");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.not_rece_money not in", values, "notReceMoney");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.not_rece_money between", value1, value2, "notReceMoney");
            return (Criteria) this;
        }

        public Criteria andNotReceMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.not_rece_money not between", value1, value2, "notReceMoney");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalIsNull() {
            addCriterion("temp_receivables_notes.should_rece_principal is null");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalIsNotNull() {
            addCriterion("temp_receivables_notes.should_rece_principal is not null");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_principal =", value, "shouldRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_principal <>", value, "shouldRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.should_rece_principal >", value, "shouldRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_principal >=", value, "shouldRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalLessThan(Float value) {
            addCriterion("temp_receivables_notes.should_rece_principal <", value, "shouldRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_principal <=", value, "shouldRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalIn(List<Float> values) {
            addCriterion("temp_receivables_notes.should_rece_principal in", values, "shouldRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.should_rece_principal not in", values, "shouldRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.should_rece_principal between", value1, value2, "shouldRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldRecePrincipalNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.should_rece_principal not between", value1, value2, "shouldRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalIsNull() {
            addCriterion("temp_receivables_notes.alr_rece_principal is null");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalIsNotNull() {
            addCriterion("temp_receivables_notes.alr_rece_principal is not null");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_principal =", value, "alrRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_principal <>", value, "alrRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_principal >", value, "alrRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_principal >=", value, "alrRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalLessThan(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_principal <", value, "alrRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_principal <=", value, "alrRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalIn(List<Float> values) {
            addCriterion("temp_receivables_notes.alr_rece_principal in", values, "alrRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.alr_rece_principal not in", values, "alrRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.alr_rece_principal between", value1, value2, "alrRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andAlrRecePrincipalNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.alr_rece_principal not between", value1, value2, "alrRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalIsNull() {
            addCriterion("temp_receivables_notes.not_rece_principal is null");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalIsNotNull() {
            addCriterion("temp_receivables_notes.not_rece_principal is not null");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_principal =", value, "notRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_principal <>", value, "notRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.not_rece_principal >", value, "notRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_principal >=", value, "notRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalLessThan(Float value) {
            addCriterion("temp_receivables_notes.not_rece_principal <", value, "notRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_principal <=", value, "notRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalIn(List<Float> values) {
            addCriterion("temp_receivables_notes.not_rece_principal in", values, "notRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.not_rece_principal not in", values, "notRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.not_rece_principal between", value1, value2, "notRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andNotRecePrincipalNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.not_rece_principal not between", value1, value2, "notRecePrincipal");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestIsNull() {
            addCriterion("temp_receivables_notes.should_rece_interest is null");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestIsNotNull() {
            addCriterion("temp_receivables_notes.should_rece_interest is not null");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_interest =", value, "shouldReceInterest");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_interest <>", value, "shouldReceInterest");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.should_rece_interest >", value, "shouldReceInterest");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_interest >=", value, "shouldReceInterest");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestLessThan(Float value) {
            addCriterion("temp_receivables_notes.should_rece_interest <", value, "shouldReceInterest");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.should_rece_interest <=", value, "shouldReceInterest");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestIn(List<Float> values) {
            addCriterion("temp_receivables_notes.should_rece_interest in", values, "shouldReceInterest");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.should_rece_interest not in", values, "shouldReceInterest");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.should_rece_interest between", value1, value2, "shouldReceInterest");
            return (Criteria) this;
        }

        public Criteria andShouldReceInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.should_rece_interest not between", value1, value2, "shouldReceInterest");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestIsNull() {
            addCriterion("temp_receivables_notes.alr_rece_interest is null");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestIsNotNull() {
            addCriterion("temp_receivables_notes.alr_rece_interest is not null");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_interest =", value, "alrReceInterest");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_interest <>", value, "alrReceInterest");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_interest >", value, "alrReceInterest");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_interest >=", value, "alrReceInterest");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestLessThan(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_interest <", value, "alrReceInterest");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_rece_interest <=", value, "alrReceInterest");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestIn(List<Float> values) {
            addCriterion("temp_receivables_notes.alr_rece_interest in", values, "alrReceInterest");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.alr_rece_interest not in", values, "alrReceInterest");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.alr_rece_interest between", value1, value2, "alrReceInterest");
            return (Criteria) this;
        }

        public Criteria andAlrReceInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.alr_rece_interest not between", value1, value2, "alrReceInterest");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestIsNull() {
            addCriterion("temp_receivables_notes.not_rece_interest is null");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestIsNotNull() {
            addCriterion("temp_receivables_notes.not_rece_interest is not null");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_interest =", value, "notReceInterest");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_interest <>", value, "notReceInterest");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.not_rece_interest >", value, "notReceInterest");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_interest >=", value, "notReceInterest");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestLessThan(Float value) {
            addCriterion("temp_receivables_notes.not_rece_interest <", value, "notReceInterest");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.not_rece_interest <=", value, "notReceInterest");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestIn(List<Float> values) {
            addCriterion("temp_receivables_notes.not_rece_interest in", values, "notReceInterest");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.not_rece_interest not in", values, "notReceInterest");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.not_rece_interest between", value1, value2, "notReceInterest");
            return (Criteria) this;
        }

        public Criteria andNotReceInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.not_rece_interest not between", value1, value2, "notReceInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestIsNull() {
            addCriterion("temp_receivables_notes.alr_overdue_interest is null");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestIsNotNull() {
            addCriterion("temp_receivables_notes.alr_overdue_interest is not null");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_overdue_interest =", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_overdue_interest <>", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.alr_overdue_interest >", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_overdue_interest >=", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestLessThan(Float value) {
            addCriterion("temp_receivables_notes.alr_overdue_interest <", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.alr_overdue_interest <=", value, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestIn(List<Float> values) {
            addCriterion("temp_receivables_notes.alr_overdue_interest in", values, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.alr_overdue_interest not in", values, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.alr_overdue_interest between", value1, value2, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andAlrOverdueInterestNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.alr_overdue_interest not between", value1, value2, "alrOverdueInterest");
            return (Criteria) this;
        }

        public Criteria andReceStateIsNull() {
            addCriterion("temp_receivables_notes.rece_state is null");
            return (Criteria) this;
        }

        public Criteria andReceStateIsNotNull() {
            addCriterion("temp_receivables_notes.rece_state is not null");
            return (Criteria) this;
        }

        public Criteria andReceStateEqualTo(String value) {
            addCriterion("temp_receivables_notes.rece_state =", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateNotEqualTo(String value) {
            addCriterion("temp_receivables_notes.rece_state <>", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateGreaterThan(String value) {
            addCriterion("temp_receivables_notes.rece_state >", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.rece_state >=", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateLessThan(String value) {
            addCriterion("temp_receivables_notes.rece_state <", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.rece_state <=", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateLike(String value) {
            addCriterion("temp_receivables_notes.rece_state like", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateNotLike(String value) {
            addCriterion("temp_receivables_notes.rece_state not like", value, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateIn(List<String> values) {
            addCriterion("temp_receivables_notes.rece_state in", values, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateNotIn(List<String> values) {
            addCriterion("temp_receivables_notes.rece_state not in", values, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.rece_state between", value1, value2, "receState");
            return (Criteria) this;
        }

        public Criteria andReceStateNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.rece_state not between", value1, value2, "receState");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_receivables_notes.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_receivables_notes.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_receivables_notes.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_receivables_notes.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_receivables_notes.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_receivables_notes.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_receivables_notes.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_receivables_notes.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_receivables_notes.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_receivables_notes.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_receivables_notes.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_receivables_notes.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_receivables_notes.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_receivables_notes.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_receivables_notes.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_receivables_notes.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_receivables_notes.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_receivables_notes.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_receivables_notes.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_receivables_notes.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_receivables_notes.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_receivables_notes.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_receivables_notes.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_receivables_notes.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_receivables_notes.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_receivables_notes.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_receivables_notes.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_receivables_notes.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_receivables_notes.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_receivables_notes.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_receivables_notes.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_receivables_notes.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_receivables_notes.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_receivables_notes.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_receivables_notes.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_receivables_notes.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_receivables_notes.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_receivables_notes.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_receivables_notes.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_receivables_notes.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_receivables_notes.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_receivables_notes.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_receivables_notes.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_receivables_notes.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_receivables_notes.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_receivables_notes.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_receivables_notes.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_receivables_notes.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_receivables_notes.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_receivables_notes.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeIsNull() {
            addCriterion("temp_receivables_notes.interest_mana_fee is null");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeIsNotNull() {
            addCriterion("temp_receivables_notes.interest_mana_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeEqualTo(Float value) {
            addCriterion("temp_receivables_notes.interest_mana_fee =", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.interest_mana_fee <>", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.interest_mana_fee >", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.interest_mana_fee >=", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeLessThan(Float value) {
            addCriterion("temp_receivables_notes.interest_mana_fee <", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.interest_mana_fee <=", value, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeIn(List<Float> values) {
            addCriterion("temp_receivables_notes.interest_mana_fee in", values, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.interest_mana_fee not in", values, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.interest_mana_fee between", value1, value2, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andInterestManaFeeNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.interest_mana_fee not between", value1, value2, "interestManaFee");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("temp_receivables_notes.income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("temp_receivables_notes.income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Float value) {
            addCriterion("temp_receivables_notes.income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Float value) {
            addCriterion("temp_receivables_notes.income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Float value) {
            addCriterion("temp_receivables_notes.income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Float value) {
            addCriterion("temp_receivables_notes.income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Float value) {
            addCriterion("temp_receivables_notes.income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Float> values) {
            addCriterion("temp_receivables_notes.income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Float> values) {
            addCriterion("temp_receivables_notes.income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Float value1, Float value2) {
            addCriterion("temp_receivables_notes.income not between", value1, value2, "income");
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