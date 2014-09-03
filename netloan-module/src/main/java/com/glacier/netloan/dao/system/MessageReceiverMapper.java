package com.glacier.netloan.dao.system;

import com.glacier.netloan.entity.system.MessageReceiver;
import com.glacier.netloan.entity.system.MessageReceiverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageReceiverMapper {
    int countByExample(MessageReceiverExample example);

    int deleteByExample(MessageReceiverExample example);

    int insert(MessageReceiver record);

    int insertSelective(MessageReceiver record);

    List<MessageReceiver> selectByExample(MessageReceiverExample example);

    int updateByExampleSelective(@Param("record") MessageReceiver record, @Param("example") MessageReceiverExample example);

    int updateByExample(@Param("record") MessageReceiver record, @Param("example") MessageReceiverExample example);
}