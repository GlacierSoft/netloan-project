package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.ReceivablesNotes;
import com.glacier.netloan.entity.borrow.ReceivablesNotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceivablesNotesMapper {
    int countByExample(ReceivablesNotesExample example);

    int deleteByExample(ReceivablesNotesExample example);

    int deleteByPrimaryKey(String receNotesId);

    int insert(ReceivablesNotes record);

    int insertSelective(ReceivablesNotes record);

    List<ReceivablesNotes> selectByExample(ReceivablesNotesExample example);

    ReceivablesNotes selectByPrimaryKey(String receNotesId);

    int updateByExampleSelective(@Param("record") ReceivablesNotes record, @Param("example") ReceivablesNotesExample example);

    int updateByExample(@Param("record") ReceivablesNotes record, @Param("example") ReceivablesNotesExample example);

    int updateByPrimaryKeySelective(ReceivablesNotes record);

    int updateByPrimaryKey(ReceivablesNotes record);
}