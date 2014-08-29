package com.glacier.netloan.dao.email;

import com.glacier.netloan.entity.email.MessageEmail;
import com.glacier.netloan.entity.email.MessageEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageEmailMapper {
    int countByExample(MessageEmailExample example);

    int deleteByExample(MessageEmailExample example);

    int deleteByPrimaryKey(String emailId);

    int insert(MessageEmail record);

    int insertSelective(MessageEmail record);

    List<MessageEmail> selectByExample(MessageEmailExample example);

    MessageEmail selectByPrimaryKey(String emailId);

    int updateByExampleSelective(@Param("record") MessageEmail record, @Param("example") MessageEmailExample example);

    int updateByExample(@Param("record") MessageEmail record, @Param("example") MessageEmailExample example);

    int updateByPrimaryKeySelective(MessageEmail record);

    int updateByPrimaryKey(MessageEmail record);
}