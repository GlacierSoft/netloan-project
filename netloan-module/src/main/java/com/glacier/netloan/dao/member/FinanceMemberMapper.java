package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.FinanceMember;
import com.glacier.netloan.entity.member.FinanceMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceMemberMapper {
    int countByExample(FinanceMemberExample example);

    int deleteByExample(FinanceMemberExample example);

    int deleteByPrimaryKey(String financeMemberId);

    int insert(FinanceMember record);

    int insertSelective(FinanceMember record);

    List<FinanceMember> selectByExample(FinanceMemberExample example);

    FinanceMember selectByPrimaryKey(String financeMemberId);

    int updateByExampleSelective(@Param("record") FinanceMember record, @Param("example") FinanceMemberExample example);

    int updateByExample(@Param("record") FinanceMember record, @Param("example") FinanceMemberExample example);

    int updateByPrimaryKeySelective(FinanceMember record);

    int updateByPrimaryKey(FinanceMember record);
}