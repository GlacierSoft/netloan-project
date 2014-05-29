package com.glacier.netloan.service.finance;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dao.finance.FinanceOverdueFineSetMapper;
import com.glacier.netloan.entity.finance.FinanceOverdueFineSet;
import com.glacier.netloan.entity.finance.FinanceOverdueFineSetExample;

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceOverdueFineSetService {
	 
	  @Autowired
	  private FinanceOverdueFineSetMapper financeOverdueFineSetMapper;
	
	 //获取逾期对象
	  public Object getFinanceOverdueFineSetId(String overdueFineSetId) {
		  FinanceOverdueFineSet financeOverdueAdvances =financeOverdueFineSetMapper.selectByPrimaryKey(overdueFineSetId);
	        return financeOverdueAdvances;
	    }
	    
	   //获取逾期数据
	    public Object listAsGrid(JqPager pager) {
	        JqGridReturn returnResult = new JqGridReturn();
	        FinanceOverdueFineSetExample financeOverdueFineSetExample = new FinanceOverdueFineSetExample();;

	        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
	        	financeOverdueFineSetExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
	        	financeOverdueFineSetExample.setLimitEnd(pager.getRows());
	        }
	        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
	        	financeOverdueFineSetExample.setOrderByClause(pager.getOrderBy("temp_finance_overdue_fine_set_"));
	        }
	        List<FinanceOverdueFineSet>  financeAdvancesRecord = financeOverdueFineSetMapper.selectByExample(financeOverdueFineSetExample); // 查询所有逾期列表
	        int total = financeOverdueFineSetMapper.countByExample(financeOverdueFineSetExample); // 查询总页数

	        returnResult.setRows(financeAdvancesRecord);
	        returnResult.setTotal(total);
	        return returnResult;// 返回ExtGrid表
	    }
	  
	  
	  
	  
}
