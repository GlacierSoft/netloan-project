package com.glacier.netloan.dao.system;

import com.glacier.netloan.entity.system.UserSetting;
import com.glacier.netloan.entity.system.UserSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSettingMapper {
    int countByExample(UserSettingExample example);

    int deleteByExample(UserSettingExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserSetting record);

    int insertSelective(UserSetting record);

    List<UserSetting> selectByExample(UserSettingExample example);

    UserSetting selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserSetting record, @Param("example") UserSettingExample example);

    int updateByExample(@Param("record") UserSetting record, @Param("example") UserSettingExample example);

    int updateByPrimaryKeySelective(UserSetting record);

    int updateByPrimaryKey(UserSetting record);
}