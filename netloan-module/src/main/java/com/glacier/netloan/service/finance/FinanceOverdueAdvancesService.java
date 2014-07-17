package com.glacier.netloan.service.finance;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.finance.FinanceOverdueAdvancesMapper;
import com.glacier.netloan.dao.finance.FinanceOverdueAdvancesRecordMapper;
import com.glacier.netloan.entity.finance.FinanceOverdueAdvances;
import com.glacier.netloan.entity.finance.FinanceOverdueAdvancesExample;
import com.glacier.netloan.entity.finance.FinanceOverdueAdvancesRecordExample; 
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceOverdueAdvancesService {
	 
	@Autowired
	private FinanceOverdueAdvancesMapper financeOverdueAdvancesMapper;
 

	@Autowired
	private  FinanceOverdueAdvancesRecordMapper financeOverdueAdvancesRecordMapper;
	  /**
     * @Title: getFinanceOverdueAdvances 
     * @Description: TODO(获取逾期对象) 
     * @param @param overdueAdvancesId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
	public Object getFinanceOverdueAdvances(String overdueAdvancesId) {
		FinanceOverdueAdvances financeOverdueAdvances = financeOverdueAdvancesMapper.selectByPrimaryKey(overdueAdvancesId);
		return financeOverdueAdvances;
	}
 
	  /**
     * @Title: listAsGrid 
     * @Description: TODO(获取逾期数据) 
     * @param @param overdueAdvancesId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
	public Object listAsGrid(JqPager pager) {
		JqGridReturn returnResult = new JqGridReturn();
		FinanceOverdueAdvancesExample financeOverdueAdvancesExample = new FinanceOverdueAdvancesExample();
		
		if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
			financeOverdueAdvancesExample.setLimitStart((pager.getPage() - 1)* pager.getRows());
			financeOverdueAdvancesExample.setLimitEnd(pager.getRows());
		}
		if (StringUtils.isNotBlank(pager.getSort())&& StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
			financeOverdueAdvancesExample.setOrderByClause(pager.getOrderBy("temp_finance_overdue_advances_"));
		}
		List<FinanceOverdueAdvances> financeAdvancesRecord = financeOverdueAdvancesMapper.selectByExample(financeOverdueAdvancesExample); // 查询所有逾期列表
		int total = financeOverdueAdvancesMapper.countByExample(financeOverdueAdvancesExample); // 查询总页数

		returnResult.setRows(financeAdvancesRecord);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}
 
	 /**
     * @Title: addOverdueAdvances 
     * @Description: TODO(添加逾期数据) 
     * @param @param overdueAdvancesId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
	@Transactional(readOnly = false)
	@MethodLog(opera = "OverdueAdvances_add")
	public Object addOverdueAdvances(FinanceOverdueAdvances financeOverdueAdvances) {

		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();

		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0; 
		financeOverdueAdvances.setOverdueAdvancesId(RandomGUID.getRandomGUID());
		financeOverdueAdvances.setOverdueAdvancesName(financeOverdueAdvances.getOverdueAdvancesName());
		financeOverdueAdvances.setAuditor(pricipalUser.getUserId());
		financeOverdueAdvances.setAuditState("authstr");
		financeOverdueAdvances.setAuditDate(new Date());
		financeOverdueAdvances.setCreater(pricipalUser.getUserId());
		financeOverdueAdvances.setCreateTime(new Date());
		financeOverdueAdvances.setUpdater(pricipalUser.getUserId());
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
 
	 /**
     * @Title: editOverdueAdvances 
     * @Description: TODO(编辑逾期数据) 
     * @param @param overdueAdvancesId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
	@Transactional(readOnly = false)
	@MethodLog(opera = "OverdueAdvances_edit")
	public Object editOverdueAdvances(FinanceOverdueAdvances financeOverdueAdvances) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		financeOverdueAdvances.setUpdater(pricipalUser.getUserId());
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
 
	/**
	* 
	* @Title: auditOverdueAdvances  
	* @Description: TODO(逾期管理数据审核)  
	* @param @param financeOverdueAdvances
	* @param @return    设定文件  
	* @return Object    返回类型  
	* @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "OverdueAdvances_audit")
	public Object auditOverdueAdvances(FinanceOverdueAdvances financeOverdueAdvances) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		financeOverdueAdvances.setAuditor(pricipalUser.getUserId());
		financeOverdueAdvances.setAuditDate(new Date());
		financeOverdueAdvances.setUpdater(pricipalUser.getUserId());
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

	
	/**
	 * 
	* @Title: delOverdueAdvances  
	* @Description: TODO(删除逾期垫付设置信息)  
	* @param @param overdueAdvancesIds
	* @param @return    设定文件  
	* @return Object    返回类型  
	* @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "OverdueAdvances_del")
	public Object delOverdueAdvances(List<String> overdueAdvancesIds) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false  
				// 定义删除成功数据行数量
				int rightNumber = 0;
				// 定义返回结果
				String result_str = "";
				//名称记录
				String result_name = "";
				// 定义是否显示提示
				boolean isFlag = true;
				//数据行长度判断
				if (overdueAdvancesIds.size() > 0) {
					//匹配删除信息
					for (int i = 0; i < overdueAdvancesIds.size(); i++) {  
		                // 相关联表逾期垫付记录
						FinanceOverdueAdvancesRecordExample financeOverdueAdvancesRecordExample = new FinanceOverdueAdvancesRecordExample();
						financeOverdueAdvancesRecordExample.createCriteria().andOverdueAdvancesIdEqualTo(overdueAdvancesIds.get(i));
						int count = financeOverdueAdvancesRecordMapper.countByExample(financeOverdueAdvancesRecordExample);
		                // 判断是否关联
						if (count <= 0) {
							FinanceOverdueAdvancesExample financeOverdueAdvancesExample = new FinanceOverdueAdvancesExample();
							financeOverdueAdvancesExample.createCriteria().andOverdueAdvancesIdEqualTo(overdueAdvancesIds.get(i));
							int number = financeOverdueAdvancesMapper.deleteByExample(financeOverdueAdvancesExample);
			                rightNumber += number;// 删除成功数据行数量记录 
		                } else { 
		                	if(isFlag){ 
								if(count > 0){
									result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) + "】</font>条记录与" + "【逾期垫付记录】存在<font style='color:red;font-weight: bold;'>【"+ count+ "】</font>条依赖关系," + "须删除【逾期垫付记录】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
									isFlag = false;
								} 
		                	}  
		               }
					}
				// 删除成功数量大于0即为操作成功,且提示关联信息
				if(rightNumber>0){
					returnResult.setMsg("成功删除<font style='color:red;font-weight: bold;'>【"+result_name.trim() + "】</font>"+ rightNumber+"条数据," +result_str);
					returnResult.setSuccess(true);
				}else{
					returnResult.setMsg(result_str.trim());
					returnResult.setSuccess(false);
				     }
			   }
		return returnResult;
	}
	    
}
