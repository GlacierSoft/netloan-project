package com.glacier.netloan.dao.sysmgr;

import com.glacier.netloan.entity.sysmgr.LoginLog;
import com.glacier.netloan.entity.sysmgr.LoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginLogMapper {
    int countByExample(LoginLogExample example);

    int deleteByExample(LoginLogExample example);

    int deleteByPrimaryKey(String loginlogId);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    List<LoginLog> selectByExample(LoginLogExample example);

    LoginLog selectByPrimaryKey(String loginlogId);

    int updateByExampleSelective(@Param("record") LoginLog record, @Param("example") LoginLogExample example);

    int updateByExample(@Param("record") LoginLog record, @Param("example") LoginLogExample example);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}