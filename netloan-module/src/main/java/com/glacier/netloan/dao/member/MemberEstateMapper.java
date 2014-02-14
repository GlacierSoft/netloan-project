package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.MemberEstate;
import com.glacier.netloan.entity.member.MemberEstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberEstateMapper {
    int countByExample(MemberEstateExample example);

    int deleteByExample(MemberEstateExample example);

    int deleteByPrimaryKey(String memberEstateId);

    int insert(MemberEstate record);

    int insertSelective(MemberEstate record);

    List<MemberEstate> selectByExample(MemberEstateExample example);

    MemberEstate selectByPrimaryKey(String memberEstateId);

    int updateByExampleSelective(@Param("record") MemberEstate record, @Param("example") MemberEstateExample example);

    int updateByExample(@Param("record") MemberEstate record, @Param("example") MemberEstateExample example);

    int updateByPrimaryKeySelective(MemberEstate record);

    int updateByPrimaryKey(MemberEstate record);
}