package com.glacier.netloan.entity.borrow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowingLoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BorrowingLoanExample() {
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
            addCriterion("temp_member.member_real_name like", value, "memberDisplay");
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

        public Criteria andLoanIdIsNull() {
            addCriterion("temp_borrowing_loan.loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(String value) {
            addCriterion("temp_borrowing_loan.loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLike(String value) {
            addCriterion("temp_borrowing_loan.loan_id like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotLike(String value) {
            addCriterion("temp_borrowing_loan.loan_id not like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanCodeIsNull() {
            addCriterion("temp_borrowing_loan.loan_code is null");
            return (Criteria) this;
        }

        public Criteria andLoanCodeIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_code is not null");
            return (Criteria) this;
        }

        public Criteria andLoanCodeEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_code =", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_code <>", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.loan_code >", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_code >=", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeLessThan(String value) {
            addCriterion("temp_borrowing_loan.loan_code <", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_code <=", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeLike(String value) {
            addCriterion("temp_borrowing_loan.loan_code like", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeNotLike(String value) {
            addCriterion("temp_borrowing_loan.loan_code not like", value, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_code in", values, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_code not in", values, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_code between", value1, value2, "loanCode");
            return (Criteria) this;
        }

        public Criteria andLoanCodeNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_code not between", value1, value2, "loanCode");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("temp_borrowing_loan.member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("temp_borrowing_loan.member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("temp_borrowing_loan.member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("temp_borrowing_loan.member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("temp_borrowing_loan.member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("temp_borrowing_loan.member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("temp_borrowing_loan.member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andLoanTitleIsNull() {
            addCriterion("temp_borrowing_loan.loan_title is null");
            return (Criteria) this;
        }

        public Criteria andLoanTitleIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_title is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTitleEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_title =", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_title <>", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.loan_title >", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_title >=", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleLessThan(String value) {
            addCriterion("temp_borrowing_loan.loan_title <", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_title <=", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleLike(String value) {
            addCriterion("temp_borrowing_loan.loan_title like", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleNotLike(String value) {
            addCriterion("temp_borrowing_loan.loan_title not like", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_title in", values, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_title not in", values, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_title between", value1, value2, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_title not between", value1, value2, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanPictureIsNull() {
            addCriterion("temp_borrowing_loan.loan_picture is null");
            return (Criteria) this;
        }

        public Criteria andLoanPictureIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_picture is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPictureEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_picture =", value, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanPictureNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_picture <>", value, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanPictureGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.loan_picture >", value, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanPictureGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_picture >=", value, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanPictureLessThan(String value) {
            addCriterion("temp_borrowing_loan.loan_picture <", value, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanPictureLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_picture <=", value, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanPictureLike(String value) {
            addCriterion("temp_borrowing_loan.loan_picture like", value, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanPictureNotLike(String value) {
            addCriterion("temp_borrowing_loan.loan_picture not like", value, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanPictureIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_picture in", values, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanPictureNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_picture not in", values, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanPictureBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_picture between", value1, value2, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanPictureNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_picture not between", value1, value2, "loanPicture");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdIsNull() {
            addCriterion("temp_borrowing_loan.loan_tender_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_tender_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_tender_id =", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_tender_id <>", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.loan_tender_id >", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_tender_id >=", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdLessThan(String value) {
            addCriterion("temp_borrowing_loan.loan_tender_id <", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_tender_id <=", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdLike(String value) {
            addCriterion("temp_borrowing_loan.loan_tender_id like", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotLike(String value) {
            addCriterion("temp_borrowing_loan.loan_tender_id not like", value, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_tender_id in", values, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_tender_id not in", values, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_tender_id between", value1, value2, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanTenderIdNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_tender_id not between", value1, value2, "loanTenderId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdIsNull() {
            addCriterion("temp_borrowing_loan.loan_purpose_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_purpose_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_purpose_id =", value, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_purpose_id <>", value, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.loan_purpose_id >", value, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_purpose_id >=", value, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdLessThan(String value) {
            addCriterion("temp_borrowing_loan.loan_purpose_id <", value, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_purpose_id <=", value, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdLike(String value) {
            addCriterion("temp_borrowing_loan.loan_purpose_id like", value, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdNotLike(String value) {
            addCriterion("temp_borrowing_loan.loan_purpose_id not like", value, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_purpose_id in", values, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_purpose_id not in", values, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_purpose_id between", value1, value2, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIdNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_purpose_id not between", value1, value2, "loanPurposeId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdIsNull() {
            addCriterion("temp_borrowing_loan.loan_deadlines_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_deadlines_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id =", value, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id <>", value, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id >", value, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id >=", value, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdLessThan(String value) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id <", value, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id <=", value, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdLike(String value) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id like", value, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdNotLike(String value) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id not like", value, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id in", values, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id not in", values, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id between", value1, value2, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlinesIdNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_deadlines_id not between", value1, value2, "loanDeadlinesId");
            return (Criteria) this;
        }

        public Criteria andFailedReasonIsNull() {
            addCriterion("temp_borrowing_loan.failed_reason is null");
            return (Criteria) this;
        }

        public Criteria andFailedReasonIsNotNull() {
            addCriterion("temp_borrowing_loan.failed_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFailedReasonEqualTo(String value) {
            addCriterion("temp_borrowing_loan.failed_reason =", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.failed_reason <>", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.failed_reason >", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.failed_reason >=", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonLessThan(String value) {
            addCriterion("temp_borrowing_loan.failed_reason <", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.failed_reason <=", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonLike(String value) {
            addCriterion("temp_borrowing_loan.failed_reason like", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonNotLike(String value) {
            addCriterion("temp_borrowing_loan.failed_reason not like", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonIn(List<String> values) {
            addCriterion("temp_borrowing_loan.failed_reason in", values, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.failed_reason not in", values, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.failed_reason between", value1, value2, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.failed_reason not between", value1, value2, "failedReason");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedIsNull() {
            addCriterion("temp_borrowing_loan.is_day_marked is null");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedIsNotNull() {
            addCriterion("temp_borrowing_loan.is_day_marked is not null");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_day_marked =", value, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_day_marked <>", value, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.is_day_marked >", value, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_day_marked >=", value, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedLessThan(String value) {
            addCriterion("temp_borrowing_loan.is_day_marked <", value, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_day_marked <=", value, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedLike(String value) {
            addCriterion("temp_borrowing_loan.is_day_marked like", value, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedNotLike(String value) {
            addCriterion("temp_borrowing_loan.is_day_marked not like", value, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_day_marked in", values, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_day_marked not in", values, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_day_marked between", value1, value2, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsDayMarkedNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_day_marked not between", value1, value2, "isDayMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardIsNull() {
            addCriterion("temp_borrowing_loan.is_bid_reward is null");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardIsNotNull() {
            addCriterion("temp_borrowing_loan.is_bid_reward is not null");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_reward =", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_reward <>", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.is_bid_reward >", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_reward >=", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardLessThan(String value) {
            addCriterion("temp_borrowing_loan.is_bid_reward <", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_reward <=", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardLike(String value) {
            addCriterion("temp_borrowing_loan.is_bid_reward like", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardNotLike(String value) {
            addCriterion("temp_borrowing_loan.is_bid_reward not like", value, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_bid_reward in", values, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_bid_reward not in", values, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_bid_reward between", value1, value2, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andIsBidRewardNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_bid_reward not between", value1, value2, "isBidReward");
            return (Criteria) this;
        }

        public Criteria andBidProRewardIsNull() {
            addCriterion("temp_borrowing_loan.bid_pro_reward is null");
            return (Criteria) this;
        }

        public Criteria andBidProRewardIsNotNull() {
            addCriterion("temp_borrowing_loan.bid_pro_reward is not null");
            return (Criteria) this;
        }

        public Criteria andBidProRewardEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.bid_pro_reward =", value, "bidProReward");
            return (Criteria) this;
        }

        public Criteria andBidProRewardNotEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.bid_pro_reward <>", value, "bidProReward");
            return (Criteria) this;
        }

        public Criteria andBidProRewardGreaterThan(Float value) {
            addCriterion("temp_borrowing_loan.bid_pro_reward >", value, "bidProReward");
            return (Criteria) this;
        }

        public Criteria andBidProRewardGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.bid_pro_reward >=", value, "bidProReward");
            return (Criteria) this;
        }

        public Criteria andBidProRewardLessThan(Float value) {
            addCriterion("temp_borrowing_loan.bid_pro_reward <", value, "bidProReward");
            return (Criteria) this;
        }

        public Criteria andBidProRewardLessThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.bid_pro_reward <=", value, "bidProReward");
            return (Criteria) this;
        }

        public Criteria andBidProRewardIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.bid_pro_reward in", values, "bidProReward");
            return (Criteria) this;
        }

        public Criteria andBidProRewardNotIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.bid_pro_reward not in", values, "bidProReward");
            return (Criteria) this;
        }

        public Criteria andBidProRewardBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.bid_pro_reward between", value1, value2, "bidProReward");
            return (Criteria) this;
        }

        public Criteria andBidProRewardNotBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.bid_pro_reward not between", value1, value2, "bidProReward");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardIsNull() {
            addCriterion("temp_borrowing_loan.fixed_app_reward is null");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardIsNotNull() {
            addCriterion("temp_borrowing_loan.fixed_app_reward is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.fixed_app_reward =", value, "fixedAppReward");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardNotEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.fixed_app_reward <>", value, "fixedAppReward");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardGreaterThan(Float value) {
            addCriterion("temp_borrowing_loan.fixed_app_reward >", value, "fixedAppReward");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.fixed_app_reward >=", value, "fixedAppReward");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardLessThan(Float value) {
            addCriterion("temp_borrowing_loan.fixed_app_reward <", value, "fixedAppReward");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardLessThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.fixed_app_reward <=", value, "fixedAppReward");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.fixed_app_reward in", values, "fixedAppReward");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardNotIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.fixed_app_reward not in", values, "fixedAppReward");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.fixed_app_reward between", value1, value2, "fixedAppReward");
            return (Criteria) this;
        }

        public Criteria andFixedAppRewardNotBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.fixed_app_reward not between", value1, value2, "fixedAppReward");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedIsNull() {
            addCriterion("temp_borrowing_loan.is_bid_marked is null");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedIsNotNull() {
            addCriterion("temp_borrowing_loan.is_bid_marked is not null");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_marked =", value, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_marked <>", value, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.is_bid_marked >", value, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_marked >=", value, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedLessThan(String value) {
            addCriterion("temp_borrowing_loan.is_bid_marked <", value, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_marked <=", value, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedLike(String value) {
            addCriterion("temp_borrowing_loan.is_bid_marked like", value, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedNotLike(String value) {
            addCriterion("temp_borrowing_loan.is_bid_marked not like", value, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_bid_marked in", values, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_bid_marked not in", values, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_bid_marked between", value1, value2, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andIsBidMarkedNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_bid_marked not between", value1, value2, "isBidMarked");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyIsNull() {
            addCriterion("temp_borrowing_loan.ready_rec_money is null");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyIsNotNull() {
            addCriterion("temp_borrowing_loan.ready_rec_money is not null");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.ready_rec_money =", value, "readyRecMoney");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyNotEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.ready_rec_money <>", value, "readyRecMoney");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyGreaterThan(Float value) {
            addCriterion("temp_borrowing_loan.ready_rec_money >", value, "readyRecMoney");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.ready_rec_money >=", value, "readyRecMoney");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyLessThan(Float value) {
            addCriterion("temp_borrowing_loan.ready_rec_money <", value, "readyRecMoney");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyLessThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.ready_rec_money <=", value, "readyRecMoney");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.ready_rec_money in", values, "readyRecMoney");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyNotIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.ready_rec_money not in", values, "readyRecMoney");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.ready_rec_money between", value1, value2, "readyRecMoney");
            return (Criteria) this;
        }

        public Criteria andReadyRecMoneyNotBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.ready_rec_money not between", value1, value2, "readyRecMoney");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdIsNull() {
            addCriterion("temp_borrowing_loan.is_bid_pwd is null");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdIsNotNull() {
            addCriterion("temp_borrowing_loan.is_bid_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_pwd =", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_pwd <>", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.is_bid_pwd >", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_pwd >=", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdLessThan(String value) {
            addCriterion("temp_borrowing_loan.is_bid_pwd <", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_pwd <=", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdLike(String value) {
            addCriterion("temp_borrowing_loan.is_bid_pwd like", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdNotLike(String value) {
            addCriterion("temp_borrowing_loan.is_bid_pwd not like", value, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_bid_pwd in", values, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_bid_pwd not in", values, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_bid_pwd between", value1, value2, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andIsBidPwdNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_bid_pwd not between", value1, value2, "isBidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdIsNull() {
            addCriterion("temp_borrowing_loan.bid_pwd is null");
            return (Criteria) this;
        }

        public Criteria andBidPwdIsNotNull() {
            addCriterion("temp_borrowing_loan.bid_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andBidPwdEqualTo(String value) {
            addCriterion("temp_borrowing_loan.bid_pwd =", value, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.bid_pwd <>", value, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.bid_pwd >", value, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.bid_pwd >=", value, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdLessThan(String value) {
            addCriterion("temp_borrowing_loan.bid_pwd <", value, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.bid_pwd <=", value, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdLike(String value) {
            addCriterion("temp_borrowing_loan.bid_pwd like", value, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdNotLike(String value) {
            addCriterion("temp_borrowing_loan.bid_pwd not like", value, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdIn(List<String> values) {
            addCriterion("temp_borrowing_loan.bid_pwd in", values, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.bid_pwd not in", values, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.bid_pwd between", value1, value2, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andBidPwdNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.bid_pwd not between", value1, value2, "bidPwd");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesIsNull() {
            addCriterion("temp_borrowing_loan.loan_management_fees is null");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_management_fees is not null");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_management_fees =", value, "loanManagementFees");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesNotEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_management_fees <>", value, "loanManagementFees");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesGreaterThan(Float value) {
            addCriterion("temp_borrowing_loan.loan_management_fees >", value, "loanManagementFees");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_management_fees >=", value, "loanManagementFees");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesLessThan(Float value) {
            addCriterion("temp_borrowing_loan.loan_management_fees <", value, "loanManagementFees");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesLessThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_management_fees <=", value, "loanManagementFees");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.loan_management_fees in", values, "loanManagementFees");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesNotIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.loan_management_fees not in", values, "loanManagementFees");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.loan_management_fees between", value1, value2, "loanManagementFees");
            return (Criteria) this;
        }

        public Criteria andLoanManagementFeesNotBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.loan_management_fees not between", value1, value2, "loanManagementFees");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdIsNull() {
            addCriterion("temp_borrowing_loan.repayment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdIsNotNull() {
            addCriterion("temp_borrowing_loan.repayment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdEqualTo(String value) {
            addCriterion("temp_borrowing_loan.repayment_type_id =", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.repayment_type_id <>", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.repayment_type_id >", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.repayment_type_id >=", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdLessThan(String value) {
            addCriterion("temp_borrowing_loan.repayment_type_id <", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.repayment_type_id <=", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdLike(String value) {
            addCriterion("temp_borrowing_loan.repayment_type_id like", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotLike(String value) {
            addCriterion("temp_borrowing_loan.repayment_type_id not like", value, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdIn(List<String> values) {
            addCriterion("temp_borrowing_loan.repayment_type_id in", values, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.repayment_type_id not in", values, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.repayment_type_id between", value1, value2, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.repayment_type_id not between", value1, value2, "repaymentTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanTotalIsNull() {
            addCriterion("temp_borrowing_loan.loan_total is null");
            return (Criteria) this;
        }

        public Criteria andLoanTotalIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_total is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTotalEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_total =", value, "loanTotal");
            return (Criteria) this;
        }

        public Criteria andLoanTotalNotEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_total <>", value, "loanTotal");
            return (Criteria) this;
        }

        public Criteria andLoanTotalGreaterThan(Float value) {
            addCriterion("temp_borrowing_loan.loan_total >", value, "loanTotal");
            return (Criteria) this;
        }

        public Criteria andLoanTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_total >=", value, "loanTotal");
            return (Criteria) this;
        }

        public Criteria andLoanTotalLessThan(Float value) {
            addCriterion("temp_borrowing_loan.loan_total <", value, "loanTotal");
            return (Criteria) this;
        }

        public Criteria andLoanTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_total <=", value, "loanTotal");
            return (Criteria) this;
        }

        public Criteria andLoanTotalIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.loan_total in", values, "loanTotal");
            return (Criteria) this;
        }

        public Criteria andLoanTotalNotIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.loan_total not in", values, "loanTotal");
            return (Criteria) this;
        }

        public Criteria andLoanTotalBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.loan_total between", value1, value2, "loanTotal");
            return (Criteria) this;
        }

        public Criteria andLoanTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.loan_total not between", value1, value2, "loanTotal");
            return (Criteria) this;
        }

        public Criteria andLoanAprIsNull() {
            addCriterion("temp_borrowing_loan.loan_apr is null");
            return (Criteria) this;
        }

        public Criteria andLoanAprIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_apr is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAprEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_apr =", value, "loanApr");
            return (Criteria) this;
        }

        public Criteria andLoanAprNotEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_apr <>", value, "loanApr");
            return (Criteria) this;
        }

        public Criteria andLoanAprGreaterThan(Float value) {
            addCriterion("temp_borrowing_loan.loan_apr >", value, "loanApr");
            return (Criteria) this;
        }

        public Criteria andLoanAprGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_apr >=", value, "loanApr");
            return (Criteria) this;
        }

        public Criteria andLoanAprLessThan(Float value) {
            addCriterion("temp_borrowing_loan.loan_apr <", value, "loanApr");
            return (Criteria) this;
        }

        public Criteria andLoanAprLessThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.loan_apr <=", value, "loanApr");
            return (Criteria) this;
        }

        public Criteria andLoanAprIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.loan_apr in", values, "loanApr");
            return (Criteria) this;
        }

        public Criteria andLoanAprNotIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.loan_apr not in", values, "loanApr");
            return (Criteria) this;
        }

        public Criteria andLoanAprBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.loan_apr between", value1, value2, "loanApr");
            return (Criteria) this;
        }

        public Criteria andLoanAprNotBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.loan_apr not between", value1, value2, "loanApr");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyIsNull() {
            addCriterion("temp_borrowing_loan.lowest_bid_money is null");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyIsNotNull() {
            addCriterion("temp_borrowing_loan.lowest_bid_money is not null");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyEqualTo(String value) {
            addCriterion("temp_borrowing_loan.lowest_bid_money =", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.lowest_bid_money <>", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.lowest_bid_money >", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.lowest_bid_money >=", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyLessThan(String value) {
            addCriterion("temp_borrowing_loan.lowest_bid_money <", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.lowest_bid_money <=", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyLike(String value) {
            addCriterion("temp_borrowing_loan.lowest_bid_money like", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyNotLike(String value) {
            addCriterion("temp_borrowing_loan.lowest_bid_money not like", value, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyIn(List<String> values) {
            addCriterion("temp_borrowing_loan.lowest_bid_money in", values, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.lowest_bid_money not in", values, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.lowest_bid_money between", value1, value2, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestBidMoneyNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.lowest_bid_money not between", value1, value2, "lowestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyIsNull() {
            addCriterion("temp_borrowing_loan.largest_bid_money is null");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyIsNotNull() {
            addCriterion("temp_borrowing_loan.largest_bid_money is not null");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyEqualTo(String value) {
            addCriterion("temp_borrowing_loan.largest_bid_money =", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.largest_bid_money <>", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.largest_bid_money >", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.largest_bid_money >=", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyLessThan(String value) {
            addCriterion("temp_borrowing_loan.largest_bid_money <", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.largest_bid_money <=", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyLike(String value) {
            addCriterion("temp_borrowing_loan.largest_bid_money like", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyNotLike(String value) {
            addCriterion("temp_borrowing_loan.largest_bid_money not like", value, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyIn(List<String> values) {
            addCriterion("temp_borrowing_loan.largest_bid_money in", values, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.largest_bid_money not in", values, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.largest_bid_money between", value1, value2, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLargestBidMoneyNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.largest_bid_money not between", value1, value2, "largestBidMoney");
            return (Criteria) this;
        }

        public Criteria andLowestSubIsNull() {
            addCriterion("temp_borrowing_loan.lowest_sub is null");
            return (Criteria) this;
        }

        public Criteria andLowestSubIsNotNull() {
            addCriterion("temp_borrowing_loan.lowest_sub is not null");
            return (Criteria) this;
        }

        public Criteria andLowestSubEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.lowest_sub =", value, "lowestSub");
            return (Criteria) this;
        }

        public Criteria andLowestSubNotEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.lowest_sub <>", value, "lowestSub");
            return (Criteria) this;
        }

        public Criteria andLowestSubGreaterThan(Float value) {
            addCriterion("temp_borrowing_loan.lowest_sub >", value, "lowestSub");
            return (Criteria) this;
        }

        public Criteria andLowestSubGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.lowest_sub >=", value, "lowestSub");
            return (Criteria) this;
        }

        public Criteria andLowestSubLessThan(Float value) {
            addCriterion("temp_borrowing_loan.lowest_sub <", value, "lowestSub");
            return (Criteria) this;
        }

        public Criteria andLowestSubLessThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.lowest_sub <=", value, "lowestSub");
            return (Criteria) this;
        }

        public Criteria andLowestSubIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.lowest_sub in", values, "lowestSub");
            return (Criteria) this;
        }

        public Criteria andLowestSubNotIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.lowest_sub not in", values, "lowestSub");
            return (Criteria) this;
        }

        public Criteria andLowestSubBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.lowest_sub between", value1, value2, "lowestSub");
            return (Criteria) this;
        }

        public Criteria andLowestSubNotBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.lowest_sub not between", value1, value2, "lowestSub");
            return (Criteria) this;
        }

        public Criteria andSubTotalIsNull() {
            addCriterion("temp_borrowing_loan.sub_total is null");
            return (Criteria) this;
        }

        public Criteria andSubTotalIsNotNull() {
            addCriterion("temp_borrowing_loan.sub_total is not null");
            return (Criteria) this;
        }

        public Criteria andSubTotalEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.sub_total =", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalNotEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.sub_total <>", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalGreaterThan(Float value) {
            addCriterion("temp_borrowing_loan.sub_total >", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.sub_total >=", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalLessThan(Float value) {
            addCriterion("temp_borrowing_loan.sub_total <", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalLessThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.sub_total <=", value, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.sub_total in", values, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalNotIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.sub_total not in", values, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.sub_total between", value1, value2, "subTotal");
            return (Criteria) this;
        }

        public Criteria andSubTotalNotBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.sub_total not between", value1, value2, "subTotal");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumIsNull() {
            addCriterion("temp_borrowing_loan.alr_sub_sum is null");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumIsNotNull() {
            addCriterion("temp_borrowing_loan.alr_sub_sum is not null");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.alr_sub_sum =", value, "alrSubSum");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumNotEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.alr_sub_sum <>", value, "alrSubSum");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumGreaterThan(Float value) {
            addCriterion("temp_borrowing_loan.alr_sub_sum >", value, "alrSubSum");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.alr_sub_sum >=", value, "alrSubSum");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumLessThan(Float value) {
            addCriterion("temp_borrowing_loan.alr_sub_sum <", value, "alrSubSum");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumLessThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.alr_sub_sum <=", value, "alrSubSum");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.alr_sub_sum in", values, "alrSubSum");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumNotIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.alr_sub_sum not in", values, "alrSubSum");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.alr_sub_sum between", value1, value2, "alrSubSum");
            return (Criteria) this;
        }

        public Criteria andAlrSubSumNotBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.alr_sub_sum not between", value1, value2, "alrSubSum");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProIsNull() {
            addCriterion("temp_borrowing_loan.alr_tender_pro is null");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProIsNotNull() {
            addCriterion("temp_borrowing_loan.alr_tender_pro is not null");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.alr_tender_pro =", value, "alrTenderPro");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProNotEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.alr_tender_pro <>", value, "alrTenderPro");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProGreaterThan(Float value) {
            addCriterion("temp_borrowing_loan.alr_tender_pro >", value, "alrTenderPro");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.alr_tender_pro >=", value, "alrTenderPro");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProLessThan(Float value) {
            addCriterion("temp_borrowing_loan.alr_tender_pro <", value, "alrTenderPro");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProLessThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.alr_tender_pro <=", value, "alrTenderPro");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.alr_tender_pro in", values, "alrTenderPro");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProNotIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.alr_tender_pro not in", values, "alrTenderPro");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.alr_tender_pro between", value1, value2, "alrTenderPro");
            return (Criteria) this;
        }

        public Criteria andAlrTenderProNotBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.alr_tender_pro not between", value1, value2, "alrTenderPro");
            return (Criteria) this;
        }

        public Criteria andTenderSumIsNull() {
            addCriterion("temp_borrowing_loan.tender_sum is null");
            return (Criteria) this;
        }

        public Criteria andTenderSumIsNotNull() {
            addCriterion("temp_borrowing_loan.tender_sum is not null");
            return (Criteria) this;
        }

        public Criteria andTenderSumEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.tender_sum =", value, "tenderSum");
            return (Criteria) this;
        }

        public Criteria andTenderSumNotEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.tender_sum <>", value, "tenderSum");
            return (Criteria) this;
        }

        public Criteria andTenderSumGreaterThan(Float value) {
            addCriterion("temp_borrowing_loan.tender_sum >", value, "tenderSum");
            return (Criteria) this;
        }

        public Criteria andTenderSumGreaterThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.tender_sum >=", value, "tenderSum");
            return (Criteria) this;
        }

        public Criteria andTenderSumLessThan(Float value) {
            addCriterion("temp_borrowing_loan.tender_sum <", value, "tenderSum");
            return (Criteria) this;
        }

        public Criteria andTenderSumLessThanOrEqualTo(Float value) {
            addCriterion("temp_borrowing_loan.tender_sum <=", value, "tenderSum");
            return (Criteria) this;
        }

        public Criteria andTenderSumIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.tender_sum in", values, "tenderSum");
            return (Criteria) this;
        }

        public Criteria andTenderSumNotIn(List<Float> values) {
            addCriterion("temp_borrowing_loan.tender_sum not in", values, "tenderSum");
            return (Criteria) this;
        }

        public Criteria andTenderSumBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.tender_sum between", value1, value2, "tenderSum");
            return (Criteria) this;
        }

        public Criteria andTenderSumNotBetween(Float value1, Float value2) {
            addCriterion("temp_borrowing_loan.tender_sum not between", value1, value2, "tenderSum");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesIsNull() {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines is null");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesIsNotNull() {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines is not null");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesEqualTo(String value) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines =", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines <>", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines >", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines >=", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesLessThan(String value) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines <", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines <=", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesLike(String value) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines like", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesNotLike(String value) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines not like", value, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesIn(List<String> values) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines in", values, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines not in", values, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines between", value1, value2, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andWaitBidDeadlinesNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.wait_bid_deadlines not between", value1, value2, "waitBidDeadlines");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIsNull() {
            addCriterion("temp_borrowing_loan.loan_detail is null");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_detail is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDetailEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_detail =", value, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andLoanDetailNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_detail <>", value, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andLoanDetailGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.loan_detail >", value, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andLoanDetailGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_detail >=", value, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andLoanDetailLessThan(String value) {
            addCriterion("temp_borrowing_loan.loan_detail <", value, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andLoanDetailLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_detail <=", value, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andLoanDetailLike(String value) {
            addCriterion("temp_borrowing_loan.loan_detail like", value, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andLoanDetailNotLike(String value) {
            addCriterion("temp_borrowing_loan.loan_detail not like", value, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_detail in", values, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andLoanDetailNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_detail not in", values, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andLoanDetailBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_detail between", value1, value2, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andLoanDetailNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_detail not between", value1, value2, "loanDetail");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsIsNull() {
            addCriterion("temp_borrowing_loan.is_account_funds is null");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsIsNotNull() {
            addCriterion("temp_borrowing_loan.is_account_funds is not null");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_account_funds =", value, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_account_funds <>", value, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.is_account_funds >", value, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_account_funds >=", value, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsLessThan(String value) {
            addCriterion("temp_borrowing_loan.is_account_funds <", value, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_account_funds <=", value, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsLike(String value) {
            addCriterion("temp_borrowing_loan.is_account_funds like", value, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsNotLike(String value) {
            addCriterion("temp_borrowing_loan.is_account_funds not like", value, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_account_funds in", values, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_account_funds not in", values, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_account_funds between", value1, value2, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsAccountFundsNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_account_funds not between", value1, value2, "isAccountFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsIsNull() {
            addCriterion("temp_borrowing_loan.is_loan_funds is null");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsIsNotNull() {
            addCriterion("temp_borrowing_loan.is_loan_funds is not null");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_loan_funds =", value, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_loan_funds <>", value, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.is_loan_funds >", value, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_loan_funds >=", value, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsLessThan(String value) {
            addCriterion("temp_borrowing_loan.is_loan_funds <", value, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_loan_funds <=", value, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsLike(String value) {
            addCriterion("temp_borrowing_loan.is_loan_funds like", value, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsNotLike(String value) {
            addCriterion("temp_borrowing_loan.is_loan_funds not like", value, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_loan_funds in", values, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_loan_funds not in", values, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_loan_funds between", value1, value2, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsLoanFundsNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_loan_funds not between", value1, value2, "isLoanFunds");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountIsNull() {
            addCriterion("temp_borrowing_loan.is_credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountIsNotNull() {
            addCriterion("temp_borrowing_loan.is_credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_credit_amount =", value, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_credit_amount <>", value, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.is_credit_amount >", value, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_credit_amount >=", value, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountLessThan(String value) {
            addCriterion("temp_borrowing_loan.is_credit_amount <", value, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_credit_amount <=", value, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountLike(String value) {
            addCriterion("temp_borrowing_loan.is_credit_amount like", value, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountNotLike(String value) {
            addCriterion("temp_borrowing_loan.is_credit_amount not like", value, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_credit_amount in", values, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_credit_amount not in", values, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_credit_amount between", value1, value2, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsCreditAmountNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_credit_amount not between", value1, value2, "isCreditAmount");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsIsNull() {
            addCriterion("temp_borrowing_loan.is_bid_funds is null");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsIsNotNull() {
            addCriterion("temp_borrowing_loan.is_bid_funds is not null");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_funds =", value, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_funds <>", value, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.is_bid_funds >", value, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_funds >=", value, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsLessThan(String value) {
            addCriterion("temp_borrowing_loan.is_bid_funds <", value, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_bid_funds <=", value, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsLike(String value) {
            addCriterion("temp_borrowing_loan.is_bid_funds like", value, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsNotLike(String value) {
            addCriterion("temp_borrowing_loan.is_bid_funds not like", value, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_bid_funds in", values, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_bid_funds not in", values, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_bid_funds between", value1, value2, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsBidFundsNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_bid_funds not between", value1, value2, "isBidFunds");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidIsNull() {
            addCriterion("temp_borrowing_loan.is_automatic_bid is null");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidIsNotNull() {
            addCriterion("temp_borrowing_loan.is_automatic_bid is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_automatic_bid =", value, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_automatic_bid <>", value, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.is_automatic_bid >", value, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_automatic_bid >=", value, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidLessThan(String value) {
            addCriterion("temp_borrowing_loan.is_automatic_bid <", value, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_automatic_bid <=", value, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidLike(String value) {
            addCriterion("temp_borrowing_loan.is_automatic_bid like", value, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidNotLike(String value) {
            addCriterion("temp_borrowing_loan.is_automatic_bid not like", value, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_automatic_bid in", values, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_automatic_bid not in", values, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_automatic_bid between", value1, value2, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsAutomaticBidNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_automatic_bid not between", value1, value2, "isAutomaticBid");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("temp_borrowing_loan.is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("temp_borrowing_loan.is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(String value) {
            addCriterion("temp_borrowing_loan.is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLike(String value) {
            addCriterion("temp_borrowing_loan.is_recommend like", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotLike(String value) {
            addCriterion("temp_borrowing_loan.is_recommend not like", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.is_recommend not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_borrowing_loan.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_borrowing_loan.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_borrowing_loan.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_borrowing_loan.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_borrowing_loan.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_borrowing_loan.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_borrowing_loan.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_borrowing_loan.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNull() {
            addCriterion("temp_borrowing_loan.loan_date is null");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDateEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.loan_date =", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.loan_date <>", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThan(Date value) {
            addCriterion("temp_borrowing_loan.loan_date >", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.loan_date >=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThan(Date value) {
            addCriterion("temp_borrowing_loan.loan_date <", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.loan_date <=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateIn(List<Date> values) {
            addCriterion("temp_borrowing_loan.loan_date in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotIn(List<Date> values) {
            addCriterion("temp_borrowing_loan.loan_date not in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateBetween(Date value1, Date value2) {
            addCriterion("temp_borrowing_loan.loan_date between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_borrowing_loan.loan_date not between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andMemberIpIsNull() {
            addCriterion("temp_borrowing_loan.member_ip is null");
            return (Criteria) this;
        }

        public Criteria andMemberIpIsNotNull() {
            addCriterion("temp_borrowing_loan.member_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIpEqualTo(String value) {
            addCriterion("temp_borrowing_loan.member_ip =", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.member_ip <>", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.member_ip >", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.member_ip >=", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpLessThan(String value) {
            addCriterion("temp_borrowing_loan.member_ip <", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.member_ip <=", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpLike(String value) {
            addCriterion("temp_borrowing_loan.member_ip like", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpNotLike(String value) {
            addCriterion("temp_borrowing_loan.member_ip not like", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpIn(List<String> values) {
            addCriterion("temp_borrowing_loan.member_ip in", values, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.member_ip not in", values, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.member_ip between", value1, value2, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.member_ip not between", value1, value2, "memberIp");
            return (Criteria) this;
        }

        public Criteria andLoanStateIsNull() {
            addCriterion("temp_borrowing_loan.loan_state is null");
            return (Criteria) this;
        }

        public Criteria andLoanStateIsNotNull() {
            addCriterion("temp_borrowing_loan.loan_state is not null");
            return (Criteria) this;
        }

        public Criteria andLoanStateEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_state =", value, "loanState");
            return (Criteria) this;
        }

        public Criteria andLoanStateNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_state <>", value, "loanState");
            return (Criteria) this;
        }

        public Criteria andLoanStateGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.loan_state >", value, "loanState");
            return (Criteria) this;
        }

        public Criteria andLoanStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_state >=", value, "loanState");
            return (Criteria) this;
        }

        public Criteria andLoanStateLessThan(String value) {
            addCriterion("temp_borrowing_loan.loan_state <", value, "loanState");
            return (Criteria) this;
        }

        public Criteria andLoanStateLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.loan_state <=", value, "loanState");
            return (Criteria) this;
        }

        public Criteria andLoanStateLike(String value) {
            addCriterion("temp_borrowing_loan.loan_state like", value, "loanState");
            return (Criteria) this;
        }

        public Criteria andLoanStateNotLike(String value) {
            addCriterion("temp_borrowing_loan.loan_state not like", value, "loanState");
            return (Criteria) this;
        }

        public Criteria andLoanStateIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_state in", values, "loanState");
            return (Criteria) this;
        }

        public Criteria andLoanStateNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.loan_state not in", values, "loanState");
            return (Criteria) this;
        }

        public Criteria andLoanStateBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_state between", value1, value2, "loanState");
            return (Criteria) this;
        }

        public Criteria andLoanStateNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.loan_state not between", value1, value2, "loanState");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_borrowing_loan.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_borrowing_loan.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_borrowing_loan.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_borrowing_loan.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_borrowing_loan.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_borrowing_loan.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_borrowing_loan.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateIsNull() {
            addCriterion("temp_borrowing_loan.first_audit_state is null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateIsNotNull() {
            addCriterion("temp_borrowing_loan.first_audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_audit_state =", value, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_audit_state <>", value, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.first_audit_state >", value, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_audit_state >=", value, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateLessThan(String value) {
            addCriterion("temp_borrowing_loan.first_audit_state <", value, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_audit_state <=", value, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateLike(String value) {
            addCriterion("temp_borrowing_loan.first_audit_state like", value, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateNotLike(String value) {
            addCriterion("temp_borrowing_loan.first_audit_state not like", value, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateIn(List<String> values) {
            addCriterion("temp_borrowing_loan.first_audit_state in", values, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.first_audit_state not in", values, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.first_audit_state between", value1, value2, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.first_audit_state not between", value1, value2, "firstAuditState");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdIsNull() {
            addCriterion("temp_borrowing_loan.first_auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdIsNotNull() {
            addCriterion("temp_borrowing_loan.first_auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_auditor_id =", value, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_auditor_id <>", value, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.first_auditor_id >", value, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_auditor_id >=", value, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdLessThan(String value) {
            addCriterion("temp_borrowing_loan.first_auditor_id <", value, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_auditor_id <=", value, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdLike(String value) {
            addCriterion("temp_borrowing_loan.first_auditor_id like", value, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdNotLike(String value) {
            addCriterion("temp_borrowing_loan.first_auditor_id not like", value, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdIn(List<String> values) {
            addCriterion("temp_borrowing_loan.first_auditor_id in", values, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.first_auditor_id not in", values, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.first_auditor_id between", value1, value2, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditorIdNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.first_auditor_id not between", value1, value2, "firstAuditorId");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceIsNull() {
            addCriterion("temp_borrowing_loan.first_advice is null");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceIsNotNull() {
            addCriterion("temp_borrowing_loan.first_advice is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_advice =", value, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_advice <>", value, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.first_advice >", value, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_advice >=", value, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceLessThan(String value) {
            addCriterion("temp_borrowing_loan.first_advice <", value, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_advice <=", value, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceLike(String value) {
            addCriterion("temp_borrowing_loan.first_advice like", value, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceNotLike(String value) {
            addCriterion("temp_borrowing_loan.first_advice not like", value, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceIn(List<String> values) {
            addCriterion("temp_borrowing_loan.first_advice in", values, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.first_advice not in", values, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.first_advice between", value1, value2, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstAdviceNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.first_advice not between", value1, value2, "firstAdvice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeIsNull() {
            addCriterion("temp_borrowing_loan.first_mes_notice is null");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeIsNotNull() {
            addCriterion("temp_borrowing_loan.first_mes_notice is not null");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_mes_notice =", value, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_mes_notice <>", value, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.first_mes_notice >", value, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_mes_notice >=", value, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeLessThan(String value) {
            addCriterion("temp_borrowing_loan.first_mes_notice <", value, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.first_mes_notice <=", value, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeLike(String value) {
            addCriterion("temp_borrowing_loan.first_mes_notice like", value, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeNotLike(String value) {
            addCriterion("temp_borrowing_loan.first_mes_notice not like", value, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeIn(List<String> values) {
            addCriterion("temp_borrowing_loan.first_mes_notice in", values, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.first_mes_notice not in", values, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.first_mes_notice between", value1, value2, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstMesNoticeNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.first_mes_notice not between", value1, value2, "firstMesNotice");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateIsNull() {
            addCriterion("temp_borrowing_loan.first_audit_date is null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateIsNotNull() {
            addCriterion("temp_borrowing_loan.first_audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.first_audit_date =", value, "firstAuditDate");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateNotEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.first_audit_date <>", value, "firstAuditDate");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateGreaterThan(Date value) {
            addCriterion("temp_borrowing_loan.first_audit_date >", value, "firstAuditDate");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.first_audit_date >=", value, "firstAuditDate");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateLessThan(Date value) {
            addCriterion("temp_borrowing_loan.first_audit_date <", value, "firstAuditDate");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.first_audit_date <=", value, "firstAuditDate");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateIn(List<Date> values) {
            addCriterion("temp_borrowing_loan.first_audit_date in", values, "firstAuditDate");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateNotIn(List<Date> values) {
            addCriterion("temp_borrowing_loan.first_audit_date not in", values, "firstAuditDate");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_borrowing_loan.first_audit_date between", value1, value2, "firstAuditDate");
            return (Criteria) this;
        }

        public Criteria andFirstAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_borrowing_loan.first_audit_date not between", value1, value2, "firstAuditDate");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateIsNull() {
            addCriterion("temp_borrowing_loan.second_audit_state is null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateIsNotNull() {
            addCriterion("temp_borrowing_loan.second_audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_audit_state =", value, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_audit_state <>", value, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.second_audit_state >", value, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_audit_state >=", value, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateLessThan(String value) {
            addCriterion("temp_borrowing_loan.second_audit_state <", value, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_audit_state <=", value, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateLike(String value) {
            addCriterion("temp_borrowing_loan.second_audit_state like", value, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateNotLike(String value) {
            addCriterion("temp_borrowing_loan.second_audit_state not like", value, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateIn(List<String> values) {
            addCriterion("temp_borrowing_loan.second_audit_state in", values, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.second_audit_state not in", values, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.second_audit_state between", value1, value2, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.second_audit_state not between", value1, value2, "secondAuditState");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdIsNull() {
            addCriterion("temp_borrowing_loan.second_auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdIsNotNull() {
            addCriterion("temp_borrowing_loan.second_auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_auditor_id =", value, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_auditor_id <>", value, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.second_auditor_id >", value, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_auditor_id >=", value, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdLessThan(String value) {
            addCriterion("temp_borrowing_loan.second_auditor_id <", value, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_auditor_id <=", value, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdLike(String value) {
            addCriterion("temp_borrowing_loan.second_auditor_id like", value, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdNotLike(String value) {
            addCriterion("temp_borrowing_loan.second_auditor_id not like", value, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdIn(List<String> values) {
            addCriterion("temp_borrowing_loan.second_auditor_id in", values, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.second_auditor_id not in", values, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.second_auditor_id between", value1, value2, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditorIdNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.second_auditor_id not between", value1, value2, "secondAuditorId");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceIsNull() {
            addCriterion("temp_borrowing_loan.second_advice is null");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceIsNotNull() {
            addCriterion("temp_borrowing_loan.second_advice is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_advice =", value, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_advice <>", value, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.second_advice >", value, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_advice >=", value, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceLessThan(String value) {
            addCriterion("temp_borrowing_loan.second_advice <", value, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_advice <=", value, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceLike(String value) {
            addCriterion("temp_borrowing_loan.second_advice like", value, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceNotLike(String value) {
            addCriterion("temp_borrowing_loan.second_advice not like", value, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceIn(List<String> values) {
            addCriterion("temp_borrowing_loan.second_advice in", values, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.second_advice not in", values, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.second_advice between", value1, value2, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondAdviceNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.second_advice not between", value1, value2, "secondAdvice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeIsNull() {
            addCriterion("temp_borrowing_loan.second_mes_notice is null");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeIsNotNull() {
            addCriterion("temp_borrowing_loan.second_mes_notice is not null");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_mes_notice =", value, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_mes_notice <>", value, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.second_mes_notice >", value, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_mes_notice >=", value, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeLessThan(String value) {
            addCriterion("temp_borrowing_loan.second_mes_notice <", value, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.second_mes_notice <=", value, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeLike(String value) {
            addCriterion("temp_borrowing_loan.second_mes_notice like", value, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeNotLike(String value) {
            addCriterion("temp_borrowing_loan.second_mes_notice not like", value, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeIn(List<String> values) {
            addCriterion("temp_borrowing_loan.second_mes_notice in", values, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.second_mes_notice not in", values, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.second_mes_notice between", value1, value2, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondMesNoticeNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.second_mes_notice not between", value1, value2, "secondMesNotice");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateIsNull() {
            addCriterion("temp_borrowing_loan.second_audit_date is null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateIsNotNull() {
            addCriterion("temp_borrowing_loan.second_audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.second_audit_date =", value, "secondAuditDate");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateNotEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.second_audit_date <>", value, "secondAuditDate");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateGreaterThan(Date value) {
            addCriterion("temp_borrowing_loan.second_audit_date >", value, "secondAuditDate");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.second_audit_date >=", value, "secondAuditDate");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateLessThan(Date value) {
            addCriterion("temp_borrowing_loan.second_audit_date <", value, "secondAuditDate");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.second_audit_date <=", value, "secondAuditDate");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateIn(List<Date> values) {
            addCriterion("temp_borrowing_loan.second_audit_date in", values, "secondAuditDate");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateNotIn(List<Date> values) {
            addCriterion("temp_borrowing_loan.second_audit_date not in", values, "secondAuditDate");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_borrowing_loan.second_audit_date between", value1, value2, "secondAuditDate");
            return (Criteria) this;
        }

        public Criteria andSecondAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_borrowing_loan.second_audit_date not between", value1, value2, "secondAuditDate");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_borrowing_loan.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_borrowing_loan.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_borrowing_loan.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_borrowing_loan.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_borrowing_loan.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_borrowing_loan.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_borrowing_loan.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_borrowing_loan.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_borrowing_loan.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_borrowing_loan.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_borrowing_loan.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_borrowing_loan.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_borrowing_loan.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_borrowing_loan.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_borrowing_loan.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_borrowing_loan.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_borrowing_loan.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_borrowing_loan.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_borrowing_loan.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_borrowing_loan.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_borrowing_loan.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_borrowing_loan.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_borrowing_loan.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_borrowing_loan.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_borrowing_loan.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_borrowing_loan.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_borrowing_loan.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_borrowing_loan.update_time not between", value1, value2, "updateTime");
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