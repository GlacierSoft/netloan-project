package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.TenderRepayment;
import com.glacier.netloan.entity.borrow.TenderRepaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenderRepaymentMapper {
    int countByExample(TenderRepaymentExample example);

    int deleteByExample(TenderRepaymentExample example);

    int deleteByPrimaryKey(String tenderRepaymentId);

    int insert(TenderRepayment record);

    int insertSelective(TenderRepayment record);

    List<TenderRepayment> selectByExample(TenderRepaymentExample example);

    TenderRepayment selectByPrimaryKey(String tenderRepaymentId);

    int updateByExampleSelective(@Param("record") TenderRepayment record, @Param("example") TenderRepaymentExample example);

    int updateByExample(@Param("record") TenderRepayment record, @Param("example") TenderRepaymentExample example);

    int updateByPrimaryKeySelective(TenderRepayment record);

    int updateByPrimaryKey(TenderRepayment record);
}