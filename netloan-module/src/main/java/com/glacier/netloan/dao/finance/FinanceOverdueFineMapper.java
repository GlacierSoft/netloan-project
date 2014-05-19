package com.glacier.netloan.dao.finance;

import com.glacier.netloan.entity.finance.FinanceOverdueFine;
import com.glacier.netloan.entity.finance.FinanceOverdueFineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceOverdueFineMapper {
    int countByExample(FinanceOverdueFineExample example);

    int deleteByExample(FinanceOverdueFineExample example);

    int deleteByPrimaryKey(String overdueFineId);

    int insert(FinanceOverdueFine record);

    int insertSelective(FinanceOverdueFine record);

    List<FinanceOverdueFine> selectByExample(FinanceOverdueFineExample example);

    FinanceOverdueFine selectByPrimaryKey(String overdueFineId);

    int updateByExampleSelective(@Param("record") FinanceOverdueFine record, @Param("example") FinanceOverdueFineExample example);

    int updateByExample(@Param("record") FinanceOverdueFine record, @Param("example") FinanceOverdueFineExample example);

    int updateByPrimaryKeySelective(FinanceOverdueFine record);

    int updateByPrimaryKey(FinanceOverdueFine record);
}