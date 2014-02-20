package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.MemberAuth;
import com.glacier.netloan.entity.member.MemberAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberAuthMapper {
    int countByExample(MemberAuthExample example);

    int deleteByExample(MemberAuthExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(MemberAuth record);

    int insertSelective(MemberAuth record);

    List<MemberAuth> selectByExample(MemberAuthExample example);

    MemberAuth selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") MemberAuth record, @Param("example") MemberAuthExample example);

    int updateByExample(@Param("record") MemberAuth record, @Param("example") MemberAuthExample example);

    int updateByPrimaryKeySelective(MemberAuth record);

    int updateByPrimaryKey(MemberAuth record);
}