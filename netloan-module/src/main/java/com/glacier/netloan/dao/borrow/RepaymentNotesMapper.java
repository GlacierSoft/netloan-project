package com.glacier.netloan.dao.borrow;

import com.glacier.netloan.entity.borrow.RepaymentNotes;
import com.glacier.netloan.entity.borrow.RepaymentNotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaymentNotesMapper {
    int countByExample(RepaymentNotesExample example);

    int deleteByExample(RepaymentNotesExample example);

    int deleteByPrimaryKey(String repayNotesId);

    int insert(RepaymentNotes record);

    int insertSelective(RepaymentNotes record);

    List<RepaymentNotes> selectByExample(RepaymentNotesExample example);

    RepaymentNotes selectByPrimaryKey(String repayNotesId);
    
    /*
     *自定义方法，根据借款Id查找还款记录信息 
     */
    RepaymentNotes selectByPrimaryLoanId(String loanId);

    int updateByExampleSelective(@Param("record") RepaymentNotes record, @Param("example") RepaymentNotesExample example);

    int updateByExample(@Param("record") RepaymentNotes record, @Param("example") RepaymentNotesExample example);

    int updateByPrimaryKeySelective(RepaymentNotes record);

    int updateByPrimaryKey(RepaymentNotes record);
}