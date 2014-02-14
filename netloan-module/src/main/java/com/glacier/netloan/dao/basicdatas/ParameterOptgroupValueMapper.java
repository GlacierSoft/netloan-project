package com.glacier.netloan.dao.basicdatas;

import com.glacier.netloan.entity.basicdatas.ParameterOptgroupValue;
import com.glacier.netloan.entity.basicdatas.ParameterOptgroupValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterOptgroupValueMapper {
    int countByExample(ParameterOptgroupValueExample example);

    int deleteByExample(ParameterOptgroupValueExample example);

    int deleteByPrimaryKey(String optgroupValueId);

    int insert(ParameterOptgroupValue record);

    int insertSelective(ParameterOptgroupValue record);

    List<ParameterOptgroupValue> selectByExample(ParameterOptgroupValueExample example);

    ParameterOptgroupValue selectByPrimaryKey(String optgroupValueId);

    int updateByExampleSelective(@Param("record") ParameterOptgroupValue record, @Param("example") ParameterOptgroupValueExample example);

    int updateByExample(@Param("record") ParameterOptgroupValue record, @Param("example") ParameterOptgroupValueExample example);

    int updateByPrimaryKeySelective(ParameterOptgroupValue record);

    int updateByPrimaryKey(ParameterOptgroupValue record);
}