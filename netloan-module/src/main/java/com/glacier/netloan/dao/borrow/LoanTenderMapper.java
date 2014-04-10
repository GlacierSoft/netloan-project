package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.LoanTender;
import com.glacier.netloan.entity.borrow.LoanTenderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanTenderMapper {
    int countByExample(LoanTenderExample example);

    int deleteByExample(LoanTenderExample example);

    int deleteByPrimaryKey(String loanTenderId);

    int insert(LoanTender record);

    int insertSelective(LoanTender record);

    List<LoanTender> selectByExample(LoanTenderExample example);

    LoanTender selectByPrimaryKey(String loanTenderId);

    int updateByExampleSelective(@Param("record") LoanTender record, @Param("example") LoanTenderExample example);

    int updateByExample(@Param("record") LoanTender record, @Param("example") LoanTenderExample example);

    int updateByPrimaryKeySelective(LoanTender record);

    int updateByPrimaryKey(LoanTender record);
}