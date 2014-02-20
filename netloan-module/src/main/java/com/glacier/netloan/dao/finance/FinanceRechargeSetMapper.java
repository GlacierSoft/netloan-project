package com.glacier.netloan.dao.finance;

import com.glacier.netloan.entity.finance.FinanceRechargeSet;
import com.glacier.netloan.entity.finance.FinanceRechargeSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceRechargeSetMapper {
    int countByExample(FinanceRechargeSetExample example);

    int deleteByExample(FinanceRechargeSetExample example);

    int deleteByPrimaryKey(String financeRechargeSetId);

    int insert(FinanceRechargeSet record);

    int insertSelective(FinanceRechargeSet record);

    List<FinanceRechargeSet> selectByExample(FinanceRechargeSetExample example);

    FinanceRechargeSet selectByPrimaryKey(String financeRechargeSetId);

    int updateByExampleSelective(@Param("record") FinanceRechargeSet record, @Param("example") FinanceRechargeSetExample example);

    int updateByExample(@Param("record") FinanceRechargeSet record, @Param("example") FinanceRechargeSetExample example);

    int updateByPrimaryKeySelective(FinanceRechargeSet record);

    int updateByPrimaryKey(FinanceRechargeSet record);
}