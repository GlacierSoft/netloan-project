package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.BorrowingLoanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowingLoanMapper {
    int countByExample(BorrowingLoanExample example);

    int deleteByExample(BorrowingLoanExample example);

    int deleteByPrimaryKey(String loanId);

    int insert(BorrowingLoan record);

    int insertSelective(BorrowingLoan record);

    List<BorrowingLoan> selectByExample(BorrowingLoanExample example);

    BorrowingLoan selectByPrimaryKey(String loanId);

    int updateByExampleSelective(@Param("record") BorrowingLoan record, @Param("example") BorrowingLoanExample example);

    int updateByExample(@Param("record") BorrowingLoan record, @Param("example") BorrowingLoanExample example);

    int updateByPrimaryKeySelective(BorrowingLoan record);

    int updateByPrimaryKey(BorrowingLoan record);
}