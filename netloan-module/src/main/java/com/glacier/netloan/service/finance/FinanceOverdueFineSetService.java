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
import com.glacier.netloan.dao.finance.FinanceOverdueFineMapper;
import com.glacier.netloan.dao.finance.FinanceOverdueFineSetMapper;
import com.glacier.netloan.entity.finance.FinanceOverdueFineExample;
import com.glacier.netloan.entity.finance.FinanceOverdueFineSet;
import com.glacier.netloan.entity.finance.FinanceOverdueFineSetExample; 
import com.glacier.netloan.entity.system.User; 
import com.glacier.netloan.util.MethodLog;

/**
 * 
 * @ClassName:  FinanceOverdueFineSetService
 * @Description: TODO(逾期罚款设置service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-7-15  下午5:28:09
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceOverdueFineSetService {

	@Autowired
	private FinanceOverdueFineSetMapper financeOverdueFineSetMapper;
	
	@Autowired
	private FinanceOverdueFineMapper financeOverdueFineMapper;
 
	/**
	* @Title: getFinanceOverdueFineSetId  
	* @Description: TODO(获取逾期对象)  
	* @param @param overdueFineSetId
	* @param @return    设定文件  
	* @return Object    返回类型  
	* @throws
	 */
	public Object getFinanceOverdueFineSetId(String overdueFineSetId) {
		FinanceOverdueFineSet financeOverdueFineSet = financeOverdueFineSetMapper.selectByPrimaryKey(overdueFineSetId);
		return financeOverdueFineSet;
	}
 
	/**
	 * 
	* @Title: addOverdueFineSet  
	* @Description: TODO(添加逾期罚款数据)  
	* @param @param financeOverdueFineSet
	* @param @return    设定文件  
	* @return Object    返回类型  
	* @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "OverdueFineSet_add")
	public Object addOverdueFineSet(FinanceOverdueFineSet financeOverdueFineSet) {

		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;

		financeOverdueFineSet.setOverdueFineSetId(RandomGUID.getRandomGUID());
		financeOverdueFineSet.setAuditState("authstr");
		financeOverdueFineSet.setAuditor(pricipalUser.getUserId());
		financeOverdueFineSet.setAuditDate(new Date());
		financeOverdueFineSet.setCreater(pricipalUser.getUserId());
		financeOverdueFineSet.setCreateTime(new Date());
		financeOverdueFineSet.setUpdater(pricipalUser.getUserId());
		financeOverdueFineSet.setUpdateTime(new Date());

		count = financeOverdueFineSetMapper.insert(financeOverdueFineSet);

		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("财务逾期垫付罚款设置已保存");
		} else {
			returnResult.setMsg("发生未知错误，逾期垫付罚款设置保存失败!");
		}
		return returnResult;
	}
   
	/**
	 * 
	* @Title: editOverdueFineSet  
	* @Description: TODO(编辑逾期罚款信息)  
	* @param @param financeOverdueFineSet
	* @param @return    设定文件  
	* @return Object    返回类型  
	* @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "OverdueFineSet_edit")
	public Object editOverdueFineSet(FinanceOverdueFineSet financeOverdueFineSet) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();

		financeOverdueFineSet.setUpdater(pricipalUser.getUserId());
		financeOverdueFineSet.setUpdateTime(new Date());

		if ("disable".equals(financeOverdueFineSet.getMemberPrivilege()))
			financeOverdueFineSet.setVipDays(new Float(0)); 
		
		count = financeOverdueFineSetMapper.updateByPrimaryKeySelective(financeOverdueFineSet);
        if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("逾期垫付罚款信息已修改");
		} else {
			returnResult.setMsg("发生未知错误，逾期垫付罚款修改失败");
		}
		return returnResult;
	}
 
	/**
	 * 
	* @Title: delOverdueFineSet  
	* @Description: TODO(批量删除逾期罚款信息)  
	* @param @param overdueFineSetIds
	* @param @return    设定文件  
	* @return Object    返回类型  
	* @throws
	 */
	
	@Transactional(readOnly = false)
	@MethodLog(opera = "OverdueFineSet_del")
	public Object delOverdueFineSet(List<String> overdueFineSetIds) {
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
		if (overdueFineSetIds.size() > 0) {
			//匹配删除信息
			for (int i = 0; i < overdueFineSetIds.size(); i++) {  
                // 相关联表逾期罚款记录
				FinanceOverdueFineExample financeOverdueFineExample = new FinanceOverdueFineExample();
				financeOverdueFineExample.createCriteria().andOverdueFineSetIdEqualTo(overdueFineSetIds.get(i));
				int count = financeOverdueFineMapper.countByExample(financeOverdueFineExample);
                // 判断是否关联
				if (count <= 0) {
					FinanceOverdueFineSetExample financeOverdueFineSetExample = new FinanceOverdueFineSetExample();
					financeOverdueFineSetExample.createCriteria().andOverdueFineSetIdEqualTo(overdueFineSetIds.get(i));
					int number = financeOverdueFineSetMapper.deleteByExample(financeOverdueFineSetExample);
	                    rightNumber += number;// 删除成功数据行数量记录 
                } else { 
                	if(isFlag){ 
						if(count > 0){
							result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) + "】</font>条记录与" + "【逾期罚款记录】存在<font style='color:red;font-weight: bold;'>【"+ count+ "】</font>条依赖关系," + "须删除【逾期罚款记录】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
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

	/**
	 * 
	* @Title: auditOverdueFineSet  
	* @Description: TODO(逾期管理数据审核)  
	* @param @param financeOverdueFineSet
	* @param @return    设定文件  
	* @return Object    返回类型  
	* @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "OverdueFineSet_audit")
	public Object auditOverdueFineSet(FinanceOverdueFineSet financeOverdueFineSet) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		financeOverdueFineSet.setAuditor(pricipalUser.getUserId());
		financeOverdueFineSet.setAuditDate(new Date());
		financeOverdueFineSet.setUpdater(pricipalUser.getUserId());
		financeOverdueFineSet.setUpdateTime(new Date());
		count = financeOverdueFineSetMapper.updateByPrimaryKeySelective(financeOverdueFineSet);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("逾期垫付罚款信息审核操作成功");
		} else {
			returnResult.setMsg("发生未知错误，逾期垫付罚款信息审核操作失败");
		}
		return returnResult;
	}
    /**
     * 
    * @Title: listAsGrid  
    * @Description: TODO(获取逾期数据)  
    * @param @param pager
    * @param @return    设定文件  
    * @return Object    返回类型  
    * @throws
     */
	public Object listAsGrid(JqPager pager) {
		JqGridReturn returnResult = new JqGridReturn();
		FinanceOverdueFineSetExample financeOverdueFineSetExample = new FinanceOverdueFineSetExample();

		if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
			financeOverdueFineSetExample.setLimitStart((pager.getPage() - 1)* pager.getRows());
			financeOverdueFineSetExample.setLimitEnd(pager.getRows());
		}
		if (StringUtils.isNotBlank(pager.getSort())&& StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
			financeOverdueFineSetExample.setOrderByClause(pager.getOrderBy("temp_finance_overdue_fine_set_"));
		}
		List<FinanceOverdueFineSet> financeAdvancesRecord = financeOverdueFineSetMapper.selectByExample(financeOverdueFineSetExample); // 查询所有逾期列表
		int total = financeOverdueFineSetMapper.countByExample(financeOverdueFineSetExample); // 查询总页数

		returnResult.setRows(financeAdvancesRecord);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}
	  
}
