package com.glacier.netloan.dao.finance;

import com.glacier.netloan.entity.finance.FinancePlatform;
import com.glacier.netloan.entity.finance.FinancePlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinancePlatformMapper {
    int countByExample(FinancePlatformExample example);

    int deleteByExample(FinancePlatformExample example);

    int deleteByPrimaryKey(String financePlatformId);

    int insert(FinancePlatform record);

    int insertSelective(FinancePlatform record);

    List<FinancePlatform> selectByExample(FinancePlatformExample example);

    FinancePlatform selectByPrimaryKey(String financePlatformId);

    int updateByExampleSelective(@Param("record") FinancePlatform record, @Param("example") FinancePlatformExample example);

    int updateByExample(@Param("record") FinancePlatform record, @Param("example") FinancePlatformExample example);

    int updateByPrimaryKeySelective(FinancePlatform record);

    int updateByPrimaryKey(FinancePlatform record);
}