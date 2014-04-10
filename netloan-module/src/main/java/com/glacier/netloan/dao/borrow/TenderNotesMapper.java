package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.borrow.TenderNotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TenderNotesMapper {
    int countByExample(TenderNotesExample example);

    int deleteByExample(TenderNotesExample example);

    int deleteByPrimaryKey(String tenderNotesId);

    int insert(TenderNotes record);

    int insertSelective(TenderNotes record);

    List<TenderNotes> selectByExample(TenderNotesExample example);

    TenderNotes selectByPrimaryKey(String tenderNotesId);

    int updateByExampleSelective(@Param("record") TenderNotes record, @Param("example") TenderNotesExample example);

    int updateByExample(@Param("record") TenderNotes record, @Param("example") TenderNotesExample example);

    int updateByPrimaryKeySelective(TenderNotes record);

    int updateByPrimaryKey(TenderNotes record);
}