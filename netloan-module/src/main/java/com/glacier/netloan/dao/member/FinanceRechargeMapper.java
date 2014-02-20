package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.FinanceRecharge;
import com.glacier.netloan.entity.member.FinanceRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceRechargeMapper {
    int countByExample(FinanceRechargeExample example);

    int deleteByExample(FinanceRechargeExample example);

    int deleteByPrimaryKey(String financeRechargeId);

    int insert(FinanceRecharge record);

    int insertSelective(FinanceRecharge record);

    List<FinanceRecharge> selectByExample(FinanceRechargeExample example);

    FinanceRecharge selectByPrimaryKey(String financeRechargeId);

    int updateByExampleSelective(@Param("record") FinanceRecharge record, @Param("example") FinanceRechargeExample example);

    int updateByExample(@Param("record") FinanceRecharge record, @Param("example") FinanceRechargeExample example);

    int updateByPrimaryKeySelective(FinanceRecharge record);

    int updateByPrimaryKey(FinanceRecharge record);
}