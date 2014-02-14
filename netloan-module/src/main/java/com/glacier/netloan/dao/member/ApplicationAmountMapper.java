package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.ApplicationAmount;
import com.glacier.netloan.entity.member.ApplicationAmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationAmountMapper {
    int countByExample(ApplicationAmountExample example);

    int deleteByExample(ApplicationAmountExample example);

    int deleteByPrimaryKey(String appAmountId);

    int insert(ApplicationAmount record);

    int insertSelective(ApplicationAmount record);

    List<ApplicationAmount> selectByExample(ApplicationAmountExample example);

    ApplicationAmount selectByPrimaryKey(String appAmountId);

    int updateByExampleSelective(@Param("record") ApplicationAmount record, @Param("example") ApplicationAmountExample example);

    int updateByExample(@Param("record") ApplicationAmount record, @Param("example") ApplicationAmountExample example);

    int updateByPrimaryKeySelective(ApplicationAmount record);

    int updateByPrimaryKey(ApplicationAmount record);
}