package com.glacier.netloan.service.finance;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dao.finance.FinanceOverdueAdvancesRecordMapper;
import com.glacier.netloan.dao.member.MemberMessageNoticeMapper;
import com.glacier.netloan.dto.query.finance.FinOverdueAdvancesRecordQueryDTO;
import com.glacier.netloan.entity.finance.FinanceOverdueAdvancesRecord;
import com.glacier.netloan.entity.finance.FinanceOverdueAdvancesRecordExample;
import com.glacier.netloan.entity.finance.FinanceOverdueAdvancesRecordExample.Criteria;

/**
 * @ClassName: FinanceBankCardService 
 * @Description: TODO(银行卡service层) 
 * @author JunJieZheng
 * @email 804346249@QQ.com
 * @date 2014-4-4下午2:39:55
 */

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinancesAdvancesRecord {
   
	  @Autowired
	  private FinanceOverdueAdvancesRecordMapper financeAdvancesRecordMapper;
	
	  @Autowired
	  private MemberMessageNoticeMapper memberMessageNoticeMapper;
	   
	  /**
	   * 
	  * @Title: getFinanceAdvancesRecord  
	  * @Description: TODO(获取逾期对象)  
	  * @param @param advancesRecordId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	   */
	  public Object getFinanceAdvancesRecord(String advancesRecordId) {
	    	FinanceOverdueAdvancesRecord financeAdvancesRecord = financeAdvancesRecordMapper.selectByPrimaryKey(advancesRecordId);
	        return financeAdvancesRecord;
	    }
	     
	  /**
	   * 
	  * @Title: listAsGrid  
	  * @Description: TODO(获取逾期数据)  
	  * @param @param overdueAdvancesRecordQueryDTO
	  * @param @param pager
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	   */
	    public Object listAsGrid(FinOverdueAdvancesRecordQueryDTO overdueAdvancesRecordQueryDTO,JqPager pager) {
	        JqGridReturn returnResult = new JqGridReturn();
	        FinanceOverdueAdvancesRecordExample financeAdvancesRecordExample = new FinanceOverdueAdvancesRecordExample();;
	        
	        Criteria queryCriteria = financeAdvancesRecordExample.createCriteria();
	        overdueAdvancesRecordQueryDTO.setQueryConditions(queryCriteria); 
	        
	        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
	        	financeAdvancesRecordExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
	        	financeAdvancesRecordExample.setLimitEnd(pager.getRows());
	        }
	        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
	        	financeAdvancesRecordExample.setOrderByClause(pager.getOrderBy("temp_finance_overdue_advances_record_"));
	        }
	        List<FinanceOverdueAdvancesRecord>  financeAdvancesRecord = financeAdvancesRecordMapper.selectByExample(financeAdvancesRecordExample); // 查询所有逾期列表
	        int total = financeAdvancesRecordMapper.countByExample(financeAdvancesRecordExample); // 查询总页数

	        returnResult.setRows(financeAdvancesRecord);
	        returnResult.setTotal(total);
	        return returnResult;// 返回ExtGrid表
	    }
	    
}
