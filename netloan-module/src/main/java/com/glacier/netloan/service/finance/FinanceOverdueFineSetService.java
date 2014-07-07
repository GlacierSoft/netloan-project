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
import com.glacier.netloan.dao.finance.FinanceOverdueFineSetMapper;
import com.glacier.netloan.entity.finance.FinanceOverdueFineSet;
import com.glacier.netloan.entity.finance.FinanceOverdueFineSetExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceOverdueFineSetService {

	@Autowired
	private FinanceOverdueFineSetMapper financeOverdueFineSetMapper;

	// 获取逾期对象
	public Object getFinanceOverdueFineSetId(String overdueFineSetId) {
		FinanceOverdueFineSet financeOverdueFineSet = financeOverdueFineSetMapper.selectByPrimaryKey(overdueFineSetId);
		return financeOverdueFineSet;
	}

	// 添加逾期罚款数据
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

	// 编辑逾期罚款信息
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

	// 批量删除逾期罚款信息
	@Transactional(readOnly = false)
	@MethodLog(opera = "OverdueFineSet_del")
	public Object delOverdueFineSet(List<String> overdueFineSetIds) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if (overdueFineSetIds.size() > 0) {
			FinanceOverdueFineSetExample financeOverdueFineSetExample = new FinanceOverdueFineSetExample();
			financeOverdueFineSetExample.createCriteria().andOverdueFineSetIdIn(overdueFineSetIds);
			count = financeOverdueFineSetMapper.deleteByExample(financeOverdueFineSetExample);
			if (count > 0) {
				returnResult.setSuccess(true);
				returnResult.setMsg("[" + overdueFineSetIds.size()+ "]条逾期罚款信息删除成功!!");
			} else {
				returnResult.setMsg("发生未知错误,[" + overdueFineSetIds.size()+ "]条逾期垫罚款信息删除失败!!");
			}
		}
		return returnResult;
	}

	// 逾期管理数据审核
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

	// 获取逾期数据
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
