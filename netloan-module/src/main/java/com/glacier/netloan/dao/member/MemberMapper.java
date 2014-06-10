package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface MemberMapper {
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
    
    //@Select("SELECT * FROM t_b_sale _sale WHERE _sale.projectId = #{projectId}")
    //List<String> selectSalerByProId(String memberId);
}