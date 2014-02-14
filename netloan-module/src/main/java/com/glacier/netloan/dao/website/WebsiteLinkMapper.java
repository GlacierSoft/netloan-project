package com.glacier.netloan.dao.website;

import com.glacier.netloan.entity.website.WebsiteLink;
import com.glacier.netloan.entity.website.WebsiteLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteLinkMapper {
    int countByExample(WebsiteLinkExample example);

    int deleteByExample(WebsiteLinkExample example);

    int deleteByPrimaryKey(String webLinkId);

    int insert(WebsiteLink record);

    int insertSelective(WebsiteLink record);

    List<WebsiteLink> selectByExample(WebsiteLinkExample example);

    WebsiteLink selectByPrimaryKey(String webLinkId);

    int updateByExampleSelective(@Param("record") WebsiteLink record, @Param("example") WebsiteLinkExample example);

    int updateByExample(@Param("record") WebsiteLink record, @Param("example") WebsiteLinkExample example);

    int updateByPrimaryKeySelective(WebsiteLink record);

    int updateByPrimaryKey(WebsiteLink record);
}