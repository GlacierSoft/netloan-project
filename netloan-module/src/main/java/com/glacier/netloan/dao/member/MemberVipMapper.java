package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.MemberVip;
import com.glacier.netloan.entity.member.MemberVipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberVipMapper {
    int countByExample(MemberVipExample example);

    int deleteByExample(MemberVipExample example);

    int deleteByPrimaryKey(String vipId);

    int insert(MemberVip record);

    int insertSelective(MemberVip record);

    List<MemberVip> selectByExample(MemberVipExample example);

    MemberVip selectByPrimaryKey(String vipId);

    int updateByExampleSelective(@Param("record") MemberVip record, @Param("example") MemberVipExample example);

    int updateByExample(@Param("record") MemberVip record, @Param("example") MemberVipExample example);

    int updateByPrimaryKeySelective(MemberVip record);

    int updateByPrimaryKey(MemberVip record);
}