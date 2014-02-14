package com.glacier.netloan.dao.member;

import com.glacier.netloan.entity.member.BorrowDataAudit;
import com.glacier.netloan.entity.member.BorrowDataAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowDataAuditMapper {
    int countByExample(BorrowDataAuditExample example);

    int deleteByExample(BorrowDataAuditExample example);

    int deleteByPrimaryKey(String borrowDataAuditId);

    int insert(BorrowDataAudit record);

    int insertSelective(BorrowDataAudit record);

    List<BorrowDataAudit> selectByExample(BorrowDataAuditExample example);

    BorrowDataAudit selectByPrimaryKey(String borrowDataAuditId);

    int updateByExampleSelective(@Param("record") BorrowDataAudit record, @Param("example") BorrowDataAuditExample example);

    int updateByExample(@Param("record") BorrowDataAudit record, @Param("example") BorrowDataAuditExample example);

    int updateByPrimaryKeySelective(BorrowDataAudit record);

    int updateByPrimaryKey(BorrowDataAudit record);
}