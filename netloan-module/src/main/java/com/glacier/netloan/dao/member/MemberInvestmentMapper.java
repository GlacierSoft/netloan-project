package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.MemberInvestment;
import com.glacier.netloan.entity.member.MemberInvestmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberInvestmentMapper {
    int countByExample(MemberInvestmentExample example);

    int deleteByExample(MemberInvestmentExample example);

    int deleteByPrimaryKey(String lendId);

    int insert(MemberInvestment record);

    int insertSelective(MemberInvestment record);

    List<MemberInvestment> selectByExample(MemberInvestmentExample example);

    MemberInvestment selectByPrimaryKey(String lendId);

    int updateByExampleSelective(@Param("record") MemberInvestment record, @Param("example") MemberInvestmentExample example);

    int updateByExample(@Param("record") MemberInvestment record, @Param("example") MemberInvestmentExample example);

    int updateByPrimaryKeySelective(MemberInvestment record);

    int updateByPrimaryKey(MemberInvestment record);
}