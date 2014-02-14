package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.CreditIntegral;
import com.glacier.netloan.entity.member.CreditIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditIntegralMapper {
    int countByExample(CreditIntegralExample example);

    int deleteByExample(CreditIntegralExample example);

    int deleteByPrimaryKey(String creditIntegralId);

    int insert(CreditIntegral record);

    int insertSelective(CreditIntegral record);

    List<CreditIntegral> selectByExample(CreditIntegralExample example);

    CreditIntegral selectByPrimaryKey(String creditIntegralId);

    int updateByExampleSelective(@Param("record") CreditIntegral record, @Param("example") CreditIntegralExample example);

    int updateByExample(@Param("record") CreditIntegral record, @Param("example") CreditIntegralExample example);

    int updateByPrimaryKeySelective(CreditIntegral record);

    int updateByPrimaryKey(CreditIntegral record);
}