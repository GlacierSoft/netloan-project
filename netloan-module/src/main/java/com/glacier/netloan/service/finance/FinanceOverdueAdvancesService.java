package com.glacier.netloan.service.finance;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.quartz.utils.FindbugsSuppressWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.finance.FinanceOverdueAdvancesMapper;
import com.glacier.netloan.entity.finance.FinanceOverdueAdvancesExample;
import com.glacier.netloan.entity.finance.FinanceOverdueAdvances;
import com.glacier.netloan.entity.finance.FinanceRechargeSet;
import com.glacier.netloan.entity.finance.FinanceRechargeSetExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceOverdueAdvancesService {
	 
	  @Autowired
	  private FinanceOverdueAdvancesMapper financeOverdueAdvancesMapper;
	private FinanceOverdueAdvancesMapper financeRechargeSetMapper;
	
	 //获取逾期对象
	  public Object getFinanceOverdueAdvances(String overdueAdvancesId) {
	    	FinanceOverdueAdvances financeOverdueAdvances =financeOverdueAdvancesMapper.selectByPrimaryKey(overdueAdvancesId);
	        return financeOverdueAdvances;
	    }
	  
	  //获取逾期数据
	    public Object listAsGrid(JqPager pager) {
	        JqGridReturn returnResult = new JqGridReturn();
	        FinanceOverdueAdvancesExample financeOverdueAdvancesExample = new FinanceOverdueAdvancesExample();;

	        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
	        	financeOverdueAdvancesExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
	        	financeOverdueAdvancesExample.setLimitEnd(pager.getRows());
	        }
	        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
	        	financeOverdueAdvancesExample.setOrderByClause(pager.getOrderBy("temp_finance_overdue_advances_"));
	        }
	        List<FinanceOverdueAdvances>  financeAdvancesRecord = financeOverdueAdvancesMapper.selectByExample(financeOverdueAdvancesExample); // 查询所有逾期列表
	        int total = financeOverdueAdvancesMapper.countByExample(financeOverdueAdvancesExample); // 查询总页数

	        returnResult.setRows(financeAdvancesRecord);
	        returnResult.setTotal(total);
	        return returnResult;// 返回ExtGrid表
	    }
	  
	  
	    //添加逾期数据
	    @Transactional(readOnly = false)
	    @MethodLog(opera = "OverdueAdvances_add")
	    public Object addOverdueAdvances(FinanceOverdueAdvances financeOverdueAdvances) {
	    	
	        Subject pricipalSubject = SecurityUtils.getSubject();
	        User pricipalUser = (User) pricipalSubject.getPrincipal();
	        
	        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	        int count = 0;
	      
	        financeOverdueAdvances.setOverdueAdvancesId(RandomGUID.getRandomGUID());
	        financeOverdueAdvances.setAuditor(pricipalUser.getUsername());
	        financeOverdueAdvances.setAuditState("authstr");
	        financeOverdueAdvances.setAuditDate(new Date());
	        financeOverdueAdvances.setCreater(pricipalUser.getUsername());
	        financeOverdueAdvances.setCreateTime(new Date());
	        financeOverdueAdvances.setUpdater(pricipalUser.getUsername());
	        financeOverdueAdvances.setUpdateTime(new Date());
	        financeOverdueAdvances.setUpdateTime(new Date());
	        
	        count = financeOverdueAdvancesMapper.insert(financeOverdueAdvances);
	        
	        if (count == 1) {
	            returnResult.setSuccess(true);
	            returnResult.setMsg("财务逾期垫付信息已保存");
	        } else {
	            returnResult.setMsg("发生未知错误，逾期管理信息保存失败!");
	        }
	        return returnResult;
	    }
	    
	    //编辑逾期数据
	    @Transactional(readOnly = false)
	    @MethodLog(opera = "OverdueAdvances_edit")
	    public Object editOverdueAdvances(FinanceOverdueAdvances financeOverdueAdvances) {
	        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	      
	        int count = 0;
	       
	        Subject pricipalSubject = SecurityUtils.getSubject();
	        User pricipalUser = (User) pricipalSubject.getPrincipal();
	        
	        financeOverdueAdvances.setUpdater(pricipalUser.getUsername());
	        financeOverdueAdvances.setUpdateTime(new Date());
	        count = financeOverdueAdvancesMapper.updateByPrimaryKeySelective(financeOverdueAdvances);
	        
	        if (count == 1) {
	            returnResult.setSuccess(true);
	            returnResult.setMsg("逾期垫付管理信息已修改");
	        } else {
	            returnResult.setMsg("发生未知错误，修改失败");
	        }
	        return returnResult;
	    }
	    
	    //逾期管理数据审核
	    @Transactional(readOnly = false)
	    @MethodLog(opera ="OverdueAdvances_audit")
	    public Object auditOverdueAdvances(FinanceOverdueAdvances financeOverdueAdvances) {
	        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	        int count = 0;
	        Subject pricipalSubject = SecurityUtils.getSubject();
	        User pricipalUser = (User) pricipalSubject.getPrincipal();
	        financeOverdueAdvances.setAuditor(pricipalUser.getUsername());
	        financeOverdueAdvances.setAuditDate(new Date());
	        financeOverdueAdvances.setUpdater(pricipalUser.getUsername());
	        financeOverdueAdvances.setUpdateTime(new Date());
	        count = financeOverdueAdvancesMapper.updateByPrimaryKeySelective(financeOverdueAdvances);
	        if (count == 1) {
	            returnResult.setSuccess(true);
	            returnResult.setMsg("逾期垫付管理信息审核操作成功");
	        } else {
	            returnResult.setMsg("发生未知错误，逾期垫付管理信息审核操作失败");
	        }
	        return returnResult;
	    }
	    
	    
	    
	    
	  //删除逾期垫付信息delOverdueAdvances
	    @Transactional(readOnly = false)
	    @MethodLog(opera = "OverdueAdvances_del")
	    public Object delOverdueAdvances(List<String> overdueAdvancesIds) {
	        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	        int count = 0;
	        if (overdueAdvancesIds.size() > 0) {
	        	FinanceOverdueAdvancesExample financeOverdueAdvancesExample = new FinanceOverdueAdvancesExample();
	        	financeOverdueAdvancesExample.createCriteria().andOverdueAdvancesIdIn(overdueAdvancesIds);
	            count = financeOverdueAdvancesMapper.deleteByExample(financeOverdueAdvancesExample);
	            if (count > 0) {
	                returnResult.setSuccess(true);
	                returnResult.setMsg("你成功删除了逾期垫付信息!!");
	            } else {
	                returnResult.setMsg("发生未知错误，逾期垫付信息删除失败");
	            }
	        }
	        return returnResult;
	    }
	    
}
