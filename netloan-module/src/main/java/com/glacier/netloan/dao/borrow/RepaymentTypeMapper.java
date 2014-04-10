package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.RepaymentType;
import com.glacier.netloan.entity.borrow.RepaymentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaymentTypeMapper {
    int countByExample(RepaymentTypeExample example);

    int deleteByExample(RepaymentTypeExample example);

    int deleteByPrimaryKey(String repaymentTypeId);

    int insert(RepaymentType record);

    int insertSelective(RepaymentType record);

    List<RepaymentType> selectByExample(RepaymentTypeExample example);

    RepaymentType selectByPrimaryKey(String repaymentTypeId);

    int updateByExampleSelective(@Param("record") RepaymentType record, @Param("example") RepaymentTypeExample example);

    int updateByExample(@Param("record") RepaymentType record, @Param("example") RepaymentTypeExample example);

    int updateByPrimaryKeySelective(RepaymentType record);

    int updateByPrimaryKey(RepaymentType record);
}