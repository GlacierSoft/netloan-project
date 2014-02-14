package com.glacier.netloan.dao.basicdatas;

import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.basicdatas.ParameterCreditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterCreditMapper {
    int countByExample(ParameterCreditExample example);

    int deleteByExample(ParameterCreditExample example);

    int deleteByPrimaryKey(String creditId);

    int insert(ParameterCredit record);

    int insertSelective(ParameterCredit record);

    List<ParameterCredit> selectByExample(ParameterCreditExample example);

    ParameterCredit selectByPrimaryKey(String creditId);

    int updateByExampleSelective(@Param("record") ParameterCredit record, @Param("example") ParameterCreditExample example);

    int updateByExample(@Param("record") ParameterCredit record, @Param("example") ParameterCreditExample example);

    int updateByPrimaryKeySelective(ParameterCredit record);

    int updateByPrimaryKey(ParameterCredit record);
}