package com.glacier.netloan.dao.basicdatas;

import com.glacier.netloan.entity.basicdatas.ParameterBasic;
import com.glacier.netloan.entity.basicdatas.ParameterBasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterBasicMapper {
    int countByExample(ParameterBasicExample example);

    int deleteByExample(ParameterBasicExample example);

    int deleteByPrimaryKey(String basicId);

    int insert(ParameterBasic record);

    int insertSelective(ParameterBasic record);

    List<ParameterBasic> selectByExample(ParameterBasicExample example);

    ParameterBasic selectByPrimaryKey(String basicId);

    int updateByExampleSelective(@Param("record") ParameterBasic record, @Param("example") ParameterBasicExample example);

    int updateByExample(@Param("record") ParameterBasic record, @Param("example") ParameterBasicExample example);

    int updateByPrimaryKeySelective(ParameterBasic record);

    int updateByPrimaryKey(ParameterBasic record);
}