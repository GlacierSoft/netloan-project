package com.glacier.netloan.dao.finance;

import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinanceMemberExample;
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
    
    //自定义方法，根据会员Id查找该会员的财务信息
    FinanceMember selectByMemberId(String memberId);

    int updateByExampleSelective(@Param("record") FinanceMember record, @Param("example") FinanceMemberExample example);

    int updateByExample(@Param("record") FinanceMember record, @Param("example") FinanceMemberExample example);

    int updateByPrimaryKeySelective(FinanceMember record);

    int updateByPrimaryKey(FinanceMember record);
}