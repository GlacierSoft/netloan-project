package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.FinanceBankCard;
import com.glacier.netloan.entity.member.FinanceBankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceBankCardMapper {
    int countByExample(FinanceBankCardExample example);

    int deleteByExample(FinanceBankCardExample example);

    int deleteByPrimaryKey(String bankCardId);

    int insert(FinanceBankCard record);

    int insertSelective(FinanceBankCard record);

    List<FinanceBankCard> selectByExample(FinanceBankCardExample example);

    FinanceBankCard selectByPrimaryKey(String bankCardId);

    int updateByExampleSelective(@Param("record") FinanceBankCard record, @Param("example") FinanceBankCardExample example);

    int updateByExample(@Param("record") FinanceBankCard record, @Param("example") FinanceBankCardExample example);

    int updateByPrimaryKeySelective(FinanceBankCard record);

    int updateByPrimaryKey(FinanceBankCard record);
}