package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.MemberApplyAmount;
import com.glacier.netloan.entity.member.MemberApplyAmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberApplyAmountMapper {
    int countByExample(MemberApplyAmountExample example);

    int deleteByExample(MemberApplyAmountExample example);

    int deleteByPrimaryKey(String applyAmountId);

    int insert(MemberApplyAmount record);

    int insertSelective(MemberApplyAmount record);

    List<MemberApplyAmount> selectByExample(MemberApplyAmountExample example);

    MemberApplyAmount selectByPrimaryKey(String applyAmountId);

    int updateByExampleSelective(@Param("record") MemberApplyAmount record, @Param("example") MemberApplyAmountExample example);

    int updateByExample(@Param("record") MemberApplyAmount record, @Param("example") MemberApplyAmountExample example);

    int updateByPrimaryKeySelective(MemberApplyAmount record);

    int updateByPrimaryKey(MemberApplyAmount record);
    
    MemberApplyAmount selectMaxCreatTime(String memberId);
    
}