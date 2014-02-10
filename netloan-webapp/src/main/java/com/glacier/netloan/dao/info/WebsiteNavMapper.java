package com.glacier.netloan.dao.info;

import com.glacier.netloan.entity.info.WebsiteNav;
import com.glacier.netloan.entity.info.WebsiteNavExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteNavMapper {
    int countByExample(WebsiteNavExample example);

    int deleteByExample(WebsiteNavExample example);

    int deleteByPrimaryKey(String webNavId);

    int insert(WebsiteNav record);

    int insertSelective(WebsiteNav record);

    List<WebsiteNav> selectByExample(WebsiteNavExample example);

    WebsiteNav selectByPrimaryKey(String webNavId);

    int updateByExampleSelective(@Param("record") WebsiteNav record, @Param("example") WebsiteNavExample example);

    int updateByExample(@Param("record") WebsiteNav record, @Param("example") WebsiteNavExample example);

    int updateByPrimaryKeySelective(WebsiteNav record);

    int updateByPrimaryKey(WebsiteNav record);
}