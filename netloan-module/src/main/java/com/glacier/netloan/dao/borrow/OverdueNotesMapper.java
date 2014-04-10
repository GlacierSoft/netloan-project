package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.OverdueNotes;
import com.glacier.netloan.entity.borrow.OverdueNotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OverdueNotesMapper {
    int countByExample(OverdueNotesExample example);

    int deleteByExample(OverdueNotesExample example);

    int deleteByPrimaryKey(String overdueNotesId);

    int insert(OverdueNotes record);

    int insertSelective(OverdueNotes record);

    List<OverdueNotes> selectByExample(OverdueNotesExample example);

    OverdueNotes selectByPrimaryKey(String overdueNotesId);

    int updateByExampleSelective(@Param("record") OverdueNotes record, @Param("example") OverdueNotesExample example);

    int updateByExample(@Param("record") OverdueNotes record, @Param("example") OverdueNotesExample example);

    int updateByPrimaryKeySelective(OverdueNotes record);

    int updateByPrimaryKey(OverdueNotes record);
}