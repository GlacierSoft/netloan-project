package com.glacier.netloan.dao.account;

import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.entity.account.AccountInvestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountInvestMapper {
    int countByExample(AccountInvestExample example);

    int deleteByExample(AccountInvestExample example);

    int deleteByPrimaryKey(String investId);

    int insert(AccountInvest record);

    int insertSelective(AccountInvest record);

    List<AccountInvest> selectByExample(AccountInvestExample example);

    AccountInvest selectByPrimaryKey(String investId);

    int updateByExampleSelective(@Param("record") AccountInvest record, @Param("example") AccountInvestExample example);

    int updateByExample(@Param("record") AccountInvest record, @Param("example") AccountInvestExample example);

    int updateByPrimaryKeySelective(AccountInvest record);

    int updateByPrimaryKey(AccountInvest record);
    
    
    
}