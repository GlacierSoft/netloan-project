package com.glacier.netloan.dao.finance;

import com.glacier.netloan.entity.finance.FinancePlatformTransaction;
import com.glacier.netloan.entity.finance.FinancePlatformTransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinancePlatformTransactionMapper {
    int countByExample(FinancePlatformTransactionExample example);

    int deleteByExample(FinancePlatformTransactionExample example);

    int deleteByPrimaryKey(String platformTransactionId);

    int insert(FinancePlatformTransaction record);

    int insertSelective(FinancePlatformTransaction record);

    List<FinancePlatformTransaction> selectByExample(FinancePlatformTransactionExample example);

    FinancePlatformTransaction selectByPrimaryKey(String platformTransactionId);

    int updateByExampleSelective(@Param("record") FinancePlatformTransaction record, @Param("example") FinancePlatformTransactionExample example);

    int updateByExample(@Param("record") FinancePlatformTransaction record, @Param("example") FinancePlatformTransactionExample example);

    int updateByPrimaryKeySelective(FinancePlatformTransaction record);

    int updateByPrimaryKey(FinancePlatformTransaction record);
}