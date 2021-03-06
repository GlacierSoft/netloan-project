package com.glacier.netloan.dao.system;

import com.glacier.netloan.entity.system.Panel;
import com.glacier.netloan.entity.system.PanelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PanelMapper {
    int countByExample(PanelExample example);

    int deleteByExample(PanelExample example);

    int deleteByPrimaryKey(String panelId);

    int insert(Panel record);

    int insertSelective(Panel record);

    List<Panel> selectByExample(PanelExample example);

    Panel selectByPrimaryKey(String panelId);

    int updateByExampleSelective(@Param("record") Panel record, @Param("example") PanelExample example);

    int updateByExample(@Param("record") Panel record, @Param("example") PanelExample example);

    int updateByPrimaryKeySelective(Panel record);

    int updateByPrimaryKey(Panel record);
}