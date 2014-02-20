package com.glacier.netloan.dao.finance;

import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.entity.finance.FinanceTransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceTransactionMapper {
    int countByExample(FinanceTransactionExample example);

    int deleteByExample(FinanceTransactionExample example);

    int deleteByPrimaryKey(String transactionId);

    int insert(FinanceTransaction record);

    int insertSelective(FinanceTransaction record);

    List<FinanceTransaction> selectByExample(FinanceTransactionExample example);

    FinanceTransaction selectByPrimaryKey(String transactionId);

    int updateByExampleSelective(@Param("record") FinanceTransaction record, @Param("example") FinanceTransactionExample example);

    int updateByExample(@Param("record") FinanceTransaction record, @Param("example") FinanceTransactionExample example);

    int updateByPrimaryKeySelective(FinanceTransaction record);

    int updateByPrimaryKey(FinanceTransaction record);
}