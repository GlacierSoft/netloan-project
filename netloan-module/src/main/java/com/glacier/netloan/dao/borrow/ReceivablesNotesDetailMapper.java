package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.ReceivablesNotesDetail;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceivablesNotesDetailMapper {
    int countByExample(ReceivablesNotesDetailExample example);

    int deleteByExample(ReceivablesNotesDetailExample example);

    int deleteByPrimaryKey(String receNotesDetailId);

    int insert(ReceivablesNotesDetail record);

    int insertSelective(ReceivablesNotesDetail record);

    List<ReceivablesNotesDetail> selectByExample(ReceivablesNotesDetailExample example);

    ReceivablesNotesDetail selectByPrimaryKey(String receNotesDetailId);

    int updateByExampleSelective(@Param("record") ReceivablesNotesDetail record, @Param("example") ReceivablesNotesDetailExample example);

    int updateByExample(@Param("record") ReceivablesNotesDetail record, @Param("example") ReceivablesNotesDetailExample example);

    int updateByPrimaryKeySelective(ReceivablesNotesDetail record);

    int updateByPrimaryKey(ReceivablesNotesDetail record);
}