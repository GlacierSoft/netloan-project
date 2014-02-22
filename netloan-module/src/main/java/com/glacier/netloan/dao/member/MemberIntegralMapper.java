package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.MemberIntegral;
import com.glacier.netloan.entity.member.MemberIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberIntegralMapper {
    int countByExample(MemberIntegralExample example);

    int deleteByExample(MemberIntegralExample example);

    int deleteByPrimaryKey(String memberIntegralId);

    int insert(MemberIntegral record);

    int insertSelective(MemberIntegral record);

    List<MemberIntegral> selectByExample(MemberIntegralExample example);

    MemberIntegral selectByPrimaryKey(String memberIntegralId);

    int updateByExampleSelective(@Param("record") MemberIntegral record, @Param("example") MemberIntegralExample example);

    int updateByExample(@Param("record") MemberIntegral record, @Param("example") MemberIntegralExample example);

    int updateByPrimaryKeySelective(MemberIntegral record);

    int updateByPrimaryKey(MemberIntegral record);
}