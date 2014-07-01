package com.glacier.netloan.dao.finance;

import com.glacier.netloan.entity.finance.FinanceWithdrawSet;
import com.glacier.netloan.entity.finance.FinanceWithdrawSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceWithdrawSetMapper {
    int countByExample(FinanceWithdrawSetExample example);

    int deleteByExample(FinanceWithdrawSetExample example);

    int deleteByPrimaryKey(String financeWithdrawSetId);

    int insert(FinanceWithdrawSet record);

    int insertSelective(FinanceWithdrawSet record);

    List<FinanceWithdrawSet> selectByExample(FinanceWithdrawSetExample example);

    FinanceWithdrawSet selectByPrimaryKey(String financeWithdrawSetId);

    int updateByExampleSelective(@Param("record") FinanceWithdrawSet record, @Param("example") FinanceWithdrawSetExample example);

    int updateByExample(@Param("record") FinanceWithdrawSet record, @Param("example") FinanceWithdrawSetExample example);

    int updateByPrimaryKeySelective(FinanceWithdrawSet record);

    int updateByPrimaryKey(FinanceWithdrawSet record);
}