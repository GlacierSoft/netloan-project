package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.entity.member.MemberStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberStatisticsMapper {
    int countByExample(MemberStatisticsExample example);

    int deleteByExample(MemberStatisticsExample example);

    int deleteByPrimaryKey(String statisticsId);

    int insert(MemberStatistics record);

    int insertSelective(MemberStatistics record);

    List<MemberStatistics> selectByExample(MemberStatisticsExample example);

    MemberStatistics selectByPrimaryKey(String statisticsId);
    
    // 新增方法，根据所属会员Id查找该会员的统计信息
    MemberStatistics selectByMemberId(String memberId);

    int updateByExampleSelective(@Param("record") MemberStatistics record, @Param("example") MemberStatisticsExample example);

    int updateByExample(@Param("record") MemberStatistics record, @Param("example") MemberStatisticsExample example);

    int updateByPrimaryKeySelective(MemberStatistics record);

    int updateByPrimaryKey(MemberStatistics record);
}