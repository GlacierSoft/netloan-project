package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.RepaymentNotesDetail;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaymentNotesDetailMapper {
    int countByExample(RepaymentNotesDetailExample example);

    int deleteByExample(RepaymentNotesDetailExample example);

    int deleteByPrimaryKey(String repayNotesDetailId);

    int insert(RepaymentNotesDetail record);

    int insertSelective(RepaymentNotesDetail record);

    List<RepaymentNotesDetail> selectByExample(RepaymentNotesDetailExample example);

    RepaymentNotesDetail selectByPrimaryKey(String repayNotesDetailId);

    int updateByExampleSelective(@Param("record") RepaymentNotesDetail record, @Param("example") RepaymentNotesDetailExample example);

    int updateByExample(@Param("record") RepaymentNotesDetail record, @Param("example") RepaymentNotesDetailExample example);

    int updateByPrimaryKeySelective(RepaymentNotesDetail record);

    int updateByPrimaryKey(RepaymentNotesDetail record);
}