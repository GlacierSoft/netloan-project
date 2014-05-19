package com.glacier.netloan.dao.finance;

import com.glacier.netloan.entity.finance.FinanceOverdueAdvances;
import com.glacier.netloan.entity.finance.FinanceOverdueAdvancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceOverdueAdvancesMapper {
    int countByExample(FinanceOverdueAdvancesExample example);

    int deleteByExample(FinanceOverdueAdvancesExample example);

    int deleteByPrimaryKey(String overdueAdvancesId);

    int insert(FinanceOverdueAdvances record);

    int insertSelective(FinanceOverdueAdvances record);

    List<FinanceOverdueAdvances> selectByExample(FinanceOverdueAdvancesExample example);

    FinanceOverdueAdvances selectByPrimaryKey(String overdueAdvancesId);

    int updateByExampleSelective(@Param("record") FinanceOverdueAdvances record, @Param("example") FinanceOverdueAdvancesExample example);

    int updateByExample(@Param("record") FinanceOverdueAdvances record, @Param("example") FinanceOverdueAdvancesExample example);

    int updateByPrimaryKeySelective(FinanceOverdueAdvances record);

    int updateByPrimaryKey(FinanceOverdueAdvances record);
}