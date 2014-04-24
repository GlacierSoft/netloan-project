package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.TenderRepaymentExample;
import com.glacier.netloan.entity.borrow.TenderRepaymentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenderRepaymentMapper {
    int countByExample(TenderRepaymentExample example);

    int deleteByExample(TenderRepaymentExample example);

    int deleteByPrimaryKey(TenderRepaymentKey key);

    int insert(TenderRepaymentKey record);

    int insertSelective(TenderRepaymentKey record);

    List<TenderRepaymentKey> selectByExample(TenderRepaymentExample example);

    int updateByExampleSelective(@Param("record") TenderRepaymentKey record, @Param("example") TenderRepaymentExample example);

    int updateByExample(@Param("record") TenderRepaymentKey record, @Param("example") TenderRepaymentExample example);
}