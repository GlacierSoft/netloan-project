package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.LoanReview;
import com.glacier.netloan.entity.borrow.LoanReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanReviewMapper {
    int countByExample(LoanReviewExample example);

    int deleteByExample(LoanReviewExample example);

    int deleteByPrimaryKey(String loanReviewId);

    int insert(LoanReview record);

    int insertSelective(LoanReview record);

    List<LoanReview> selectByExample(LoanReviewExample example);

    LoanReview selectByPrimaryKey(String loanReviewId);

    int updateByExampleSelective(@Param("record") LoanReview record, @Param("example") LoanReviewExample example);

    int updateByExample(@Param("record") LoanReview record, @Param("example") LoanReviewExample example);

    int updateByPrimaryKeySelective(LoanReview record);

    int updateByPrimaryKey(LoanReview record);
}