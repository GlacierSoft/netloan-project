package com.glacier.netloan.dao.finance;

import com.glacier.netloan.entity.finance.FinanceOverdueFineSet;
import com.glacier.netloan.entity.finance.FinanceOverdueFineSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceOverdueFineSetMapper {
    int countByExample(FinanceOverdueFineSetExample example);

    int deleteByExample(FinanceOverdueFineSetExample example);

    int deleteByPrimaryKey(String overdueFineSetId);

    int insert(FinanceOverdueFineSet record);

    int insertSelective(FinanceOverdueFineSet record);

    List<FinanceOverdueFineSet> selectByExample(FinanceOverdueFineSetExample example);

    FinanceOverdueFineSet selectByPrimaryKey(String overdueFineSetId);

    int updateByExampleSelective(@Param("record") FinanceOverdueFineSet record, @Param("example") FinanceOverdueFineSetExample example);

    int updateByExample(@Param("record") FinanceOverdueFineSet record, @Param("example") FinanceOverdueFineSetExample example);

    int updateByPrimaryKeySelective(FinanceOverdueFineSet record);

    int updateByPrimaryKey(FinanceOverdueFineSet record);
}