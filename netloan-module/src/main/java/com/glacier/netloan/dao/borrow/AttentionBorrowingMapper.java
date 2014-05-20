package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.AttentionBorrowing;
import com.glacier.netloan.entity.borrow.AttentionBorrowingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttentionBorrowingMapper {
    int countByExample(AttentionBorrowingExample example);

    int deleteByExample(AttentionBorrowingExample example);

    int deleteByPrimaryKey(String attentionborrowingid);

    int insert(AttentionBorrowing record);

    int insertSelective(AttentionBorrowing record);

    List<AttentionBorrowing> selectByExample(AttentionBorrowingExample example);

    AttentionBorrowing selectByPrimaryKey(String attentionborrowingid);

    int updateByExampleSelective(@Param("record") AttentionBorrowing record, @Param("example") AttentionBorrowingExample example);

    int updateByExample(@Param("record") AttentionBorrowing record, @Param("example") AttentionBorrowingExample example);

    int updateByPrimaryKeySelective(AttentionBorrowing record);

    int updateByPrimaryKey(AttentionBorrowing record);
}