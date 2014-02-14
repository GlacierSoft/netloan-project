package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.MemberFinance;
import com.glacier.netloan.entity.member.MemberFinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberFinanceMapper {
    int countByExample(MemberFinanceExample example);

    int deleteByExample(MemberFinanceExample example);

    int deleteByPrimaryKey(String memberFinanceId);

    int insert(MemberFinance record);

    int insertSelective(MemberFinance record);

    List<MemberFinance> selectByExample(MemberFinanceExample example);

    MemberFinance selectByPrimaryKey(String memberFinanceId);

    int updateByExampleSelective(@Param("record") MemberFinance record, @Param("example") MemberFinanceExample example);

    int updateByExample(@Param("record") MemberFinance record, @Param("example") MemberFinanceExample example);

    int updateByPrimaryKeySelective(MemberFinance record);

    int updateByPrimaryKey(MemberFinance record);
}