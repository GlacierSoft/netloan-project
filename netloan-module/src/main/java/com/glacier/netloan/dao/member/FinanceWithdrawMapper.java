package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.FinanceWithdraw;
import com.glacier.netloan.entity.member.FinanceWithdrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceWithdrawMapper {
    int countByExample(FinanceWithdrawExample example);

    int deleteByExample(FinanceWithdrawExample example);

    int deleteByPrimaryKey(String financeWithdrawId);

    int insert(FinanceWithdraw record);

    int insertSelective(FinanceWithdraw record);

    List<FinanceWithdraw> selectByExample(FinanceWithdrawExample example);

    FinanceWithdraw selectByPrimaryKey(String financeWithdrawId);

    int updateByExampleSelective(@Param("record") FinanceWithdraw record, @Param("example") FinanceWithdrawExample example);

    int updateByExample(@Param("record") FinanceWithdraw record, @Param("example") FinanceWithdrawExample example);

    int updateByPrimaryKeySelective(FinanceWithdraw record);

    int updateByPrimaryKey(FinanceWithdraw record);
}