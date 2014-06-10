package com.glacier.netloan.service.account;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dao.account.AccountInvestMapper;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.entity.account.AccountInvestExample;
import com.glacier.netloan.entity.account.AccountInvestExample.Criteria;
import com.glacier.netloan.entity.member.MemberWork;




@Service
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
public class AccountInvestService {
    
	 @Autowired
	  private AccountInvestMapper accountInvestMapper;
	
	 //会员投资信息统计
	 public Object listAsGrid(JqPager jqPager){
		    JqGridReturn returnResult = new JqGridReturn();
	        AccountInvestExample accountInvestExample = new AccountInvestExample();;
	        
           if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	        	accountInvestExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	        	accountInvestExample.setLimitEnd(jqPager.getRows());
	        }
	        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	        	accountInvestExample.setOrderByClause(jqPager.getOrderBy("temp_member_"));
	        }
	        List<AccountInvest>  members = accountInvestMapper.selectByExample(accountInvestExample); // 查询所有会员列表
	        int total = accountInvestMapper.countByExample(accountInvestExample); // 查询总页数
	        
	        returnResult.setRows(members);
	        returnResult.setTotal(total);
	        return returnResult;// 返回ExtGrid表
	 }
	 
	   //投资信息详情
	 public Object getAccountInvest(String investId) {
	    	AccountInvest accountInvest= accountInvestMapper.selectByPrimaryKey(investId);
	        return accountInvest;
	    }
	 
	 
	 
	 
	   //投资信息导出
	 
	 
} 
