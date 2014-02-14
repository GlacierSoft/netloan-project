package com.glacier.netloan.dao.basicdatas;

import com.glacier.netloan.entity.basicdatas.ParameterIntegral;
import com.glacier.netloan.entity.basicdatas.ParameterIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterIntegralMapper {
    int countByExample(ParameterIntegralExample example);

    int deleteByExample(ParameterIntegralExample example);

    int deleteByPrimaryKey(String integralId);

    int insert(ParameterIntegral record);

    int insertSelective(ParameterIntegral record);

    List<ParameterIntegral> selectByExample(ParameterIntegralExample example);

    ParameterIntegral selectByPrimaryKey(String integralId);

    int updateByExampleSelective(@Param("record") ParameterIntegral record, @Param("example") ParameterIntegralExample example);

    int updateByExample(@Param("record") ParameterIntegral record, @Param("example") ParameterIntegralExample example);

    int updateByPrimaryKeySelective(ParameterIntegral record);

    int updateByPrimaryKey(ParameterIntegral record);
}