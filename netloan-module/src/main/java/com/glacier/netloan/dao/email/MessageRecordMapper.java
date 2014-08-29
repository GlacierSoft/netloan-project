package com.glacier.netloan.dao.email;

import com.glacier.netloan.entity.email.MessageRecord;
import com.glacier.netloan.entity.email.MessageRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageRecordMapper {
    int countByExample(MessageRecordExample example);

    int deleteByExample(MessageRecordExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(MessageRecord record);

    int insertSelective(MessageRecord record);

    List<MessageRecord> selectByExample(MessageRecordExample example);

    MessageRecord selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") MessageRecord record, @Param("example") MessageRecordExample example);

    int updateByExample(@Param("record") MessageRecord record, @Param("example") MessageRecordExample example);

    int updateByPrimaryKeySelective(MessageRecord record);

    int updateByPrimaryKey(MessageRecord record);
}