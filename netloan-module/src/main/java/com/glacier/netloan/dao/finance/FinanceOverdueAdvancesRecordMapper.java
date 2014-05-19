package com.glacier.netloan.dao.finance;

import com.glacier.netloan.entity.finance.FinanceOverdueAdvancesRecord;
import com.glacier.netloan.entity.finance.FinanceOverdueAdvancesRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceOverdueAdvancesRecordMapper {
    int countByExample(FinanceOverdueAdvancesRecordExample example);

    int deleteByExample(FinanceOverdueAdvancesRecordExample example);

    int deleteByPrimaryKey(String advancesRecordId);

    int insert(FinanceOverdueAdvancesRecord record);

    int insertSelective(FinanceOverdueAdvancesRecord record);

    List<FinanceOverdueAdvancesRecord> selectByExample(FinanceOverdueAdvancesRecordExample example);

    FinanceOverdueAdvancesRecord selectByPrimaryKey(String advancesRecordId);

    int updateByExampleSelective(@Param("record") FinanceOverdueAdvancesRecord record, @Param("example") FinanceOverdueAdvancesRecordExample example);

    int updateByExample(@Param("record") FinanceOverdueAdvancesRecord record, @Param("example") FinanceOverdueAdvancesRecordExample example);

    int updateByPrimaryKeySelective(FinanceOverdueAdvancesRecord record);

    int updateByPrimaryKey(FinanceOverdueAdvancesRecord record);
}