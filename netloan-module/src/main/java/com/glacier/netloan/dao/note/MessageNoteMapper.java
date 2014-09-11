package com.glacier.netloan.dao.note;

import com.glacier.netloan.entity.note.MessageNote;
import com.glacier.netloan.entity.note.MessageNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageNoteMapper {
    int countByExample(MessageNoteExample example);

    int deleteByExample(MessageNoteExample example);

    int deleteByPrimaryKey(String noteId);

    int insert(MessageNote record);

    int insertSelective(MessageNote record);

    List<MessageNote> selectByExample(MessageNoteExample example);

    MessageNote selectByPrimaryKey(String noteId);

    int updateByExampleSelective(@Param("record") MessageNote record, @Param("example") MessageNoteExample example);

    int updateByExample(@Param("record") MessageNote record, @Param("example") MessageNoteExample example);

    int updateByPrimaryKeySelective(MessageNote record);

    int updateByPrimaryKey(MessageNote record);
}