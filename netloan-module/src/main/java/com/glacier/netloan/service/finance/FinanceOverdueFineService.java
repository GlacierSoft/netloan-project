package com.glacier.netloan.service.finance;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dao.finance.FinanceOverdueFineMapper;
import com.glacier.netloan.dto.query.finance.FinOverdueFineQueryDTO;
import com.glacier.netloan.entity.finance.FinanceOverdueFine;
import com.glacier.netloan.entity.finance.FinanceOverdueFineExample;
import com.glacier.netloan.entity.finance.FinanceOverdueFineExample.Criteria;

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceOverdueFineService {
	 
	 @Autowired
	 private FinanceOverdueFineMapper financeOverdueFineMapper;
	
	 //获取逾期对象
	 public Object getFinanceOverdueFineId(String overdueFineId) {
		  FinanceOverdueFine financeOverdueAdvances =financeOverdueFineMapper.selectByPrimaryKey(overdueFineId);
	        return financeOverdueAdvances;
	  }
	    
	 //获取逾期数据
	 public Object listAsGrid(FinOverdueFineQueryDTO overdueFineQueryDTO,JqPager pager) {
	        JqGridReturn returnResult = new JqGridReturn();
	        FinanceOverdueFineExample financeOverdueFineExample = new FinanceOverdueFineExample();;
	        
	        Criteria queryCriteria = financeOverdueFineExample.createCriteria();
	        overdueFineQueryDTO.setQueryConditions(queryCriteria);

	        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
	        	financeOverdueFineExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
	        	financeOverdueFineExample.setLimitEnd(pager.getRows());
	        }
	        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
	        	financeOverdueFineExample.setOrderByClause(pager.getOrderBy("temp_finance_overdue_fine_"));
	        }
	        List<FinanceOverdueFine>  financeAdvancesRecord = financeOverdueFineMapper.selectByExample(financeOverdueFineExample); // 查询所有逾期列表
	        int total = financeOverdueFineMapper.countByExample(financeOverdueFineExample); // 查询总页数

	        returnResult.setRows(financeAdvancesRecord);
	        returnResult.setTotal(total);
	        return returnResult;// 返回ExtGrid表
	    }
}
