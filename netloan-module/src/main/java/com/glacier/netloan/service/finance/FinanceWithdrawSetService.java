package com.glacier.netloan.service.finance;

import java.util.ArrayList;
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
import com.glacier.netloan.dao.finance.FinanceWithdrawSetMapper;
import com.glacier.netloan.entity.finance.FinanceWithdrawSet;
import com.glacier.netloan.entity.finance.FinanceWithdrawSetExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName:  FinanceWithdrawSetService
 * @Description: TODO(会员提现设置)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-6-30  下午4:46:00
 */

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceWithdrawSetService {
	
	@Autowired
	private FinanceWithdrawSetMapper financeWithdrawSetMapper;

	/**
	 * @Title: getWithdrawSet 
	 * @Description: TODO(根据会员提现设置Id获取会员提现设置信息) 
	 * @param @param financeWithdrawSetId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getWithdrawSet(String financeWithdrawSetId) {
    	FinanceWithdrawSet financeWithdrawSet = financeWithdrawSetMapper.selectByPrimaryKey(financeWithdrawSetId);
        return financeWithdrawSet;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员提现设置信息) 
     * @param @param pfinanceWithdrawSetr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceWithdrawSetExample financeWithdrawSetExample = new FinanceWithdrawSetExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeWithdrawSetExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeWithdrawSetExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeWithdrawSetExample.setOrderByClause(pager.getOrderBy("temp_finance_withdraw_set_"));
        }
        List<FinanceWithdrawSet>  financeWithdrawSets = financeWithdrawSetMapper.selectByExample(financeWithdrawSetExample); // 查询所有会员充值设置列表
        int total = financeWithdrawSetMapper.countByExample(financeWithdrawSetExample); // 查询总页数
        returnResult.setRows(financeWithdrawSets);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addWithdrawSet 
     * @Description: TODO(新增会员提现设置) 
     * @param @param financeWithdrawSet
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WithdrawSetList_add")
    public Object addWithdrawSet(FinanceWithdrawSet financeWithdrawSet) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        if(financeWithdrawSet.getWithdrawSetMinimum()>financeWithdrawSet.getWithdrawSetMaximum()){
        	returnResult.setMsg("最大金额不能低于最小金额");
            return returnResult;
        } 
        FinanceWithdrawSetExample financeWithdrawSetExample = new FinanceWithdrawSetExample();
        int count = 0;
        // 防止会员提现两个等次最小金额和最大金额重复
        financeWithdrawSetExample.createCriteria().andWithdrawSetMinimumBetween(financeWithdrawSet.getWithdrawSetMinimum(), financeWithdrawSet.getWithdrawSetMaximum());
        count = financeWithdrawSetMapper.countByExample(financeWithdrawSetExample);// 查找相同最小提现值，和最大提现值一样的提现档次
        if (count > 0) {
            returnResult.setMsg("会员提现设置重复");
            return returnResult;
        }
        financeWithdrawSet.setFinanceWithdrawSetId(RandomGUID.getRandomGUID());
        financeWithdrawSet.setCreater(pricipalUser.getUserId());
        financeWithdrawSet.setAuditState("authstr");
        financeWithdrawSet.setCreateTime(new Date());
        financeWithdrawSet.setUpdater(pricipalUser.getUserId());
        financeWithdrawSet.setUpdateTime(new Date());
        count = financeWithdrawSetMapper.insert(financeWithdrawSet);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("新增会员提现设置信息记录操作成功");
        } else {
            returnResult.setMsg("发生未知错误，会员提现设置信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editWithdrawSet 
     * @Description: TODO(修改会员提现设置) 
     * @param @param financeWithdrawSet
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WithdrawSetList_edit")
    public Object editWithdrawSet(FinanceWithdrawSet financeWithdrawSet) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        if(financeWithdrawSet.getWithdrawSetMinimum()>financeWithdrawSet.getWithdrawSetMaximum()){
        	returnResult.setMsg("最大金额不能低于最小金额");
            return returnResult;
        } 
        FinanceWithdrawSetExample financeWithdrawSetExample = new FinanceWithdrawSetExample();
        int count = 0;
        //在一个范围内，且不等于自己本身的数据找出来，
        financeWithdrawSetExample.createCriteria().andWithdrawSetMinimumBetween(financeWithdrawSet.getWithdrawSetMinimum(), financeWithdrawSet.getWithdrawSetMaximum())
        		.andFinanceWithdrawSetIdNotEqualTo(financeWithdrawSet.getFinanceWithdrawSetId());
        List<FinanceWithdrawSet>  list=new ArrayList<FinanceWithdrawSet>();
        list = financeWithdrawSetMapper.selectByExample(financeWithdrawSetExample);// 查找相同最小提现值，和最大提现值一样的提现档次
        if (list.size() > 0) {
            returnResult.setMsg("会员提现设置重复");
            return returnResult; 
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeWithdrawSet.setUpdater(pricipalUser.getUserId());
        financeWithdrawSet.setUpdateTime(new Date());
        count = financeWithdrawSetMapper.updateByPrimaryKeySelective(financeWithdrawSet);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员提现设置信息记录修改操作成功");
         } else {
            returnResult.setMsg("发生未知错误，会员提现设置信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditWithdrawSet 
     * @Description: TODO(审核会员提现设置) 
     * @param @param financeWithdrawSet
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WithdrawSetList_audit")
    public Object auditWithdrawSet(FinanceWithdrawSet financeWithdrawSet) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeWithdrawSet.setAuditor(pricipalUser.getUserId());
        financeWithdrawSet.setAuditDate(new Date());
        count = financeWithdrawSetMapper.updateByPrimaryKeySelective(financeWithdrawSet);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员提现设置信息记录审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，会员充值设置信息记录审核操作失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delWithdrawSet 
     * @Description: TODO(删除会员提现设置) 
     * @param @param financeWithdrawSetId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WithdrawSetList_del")
    public Object delWithdrawSet(List<String> financeWithdrawSetIds) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (financeWithdrawSetIds.size() > 0) {
        	FinanceWithdrawSetExample financeWithdrawSetExample = new FinanceWithdrawSetExample();
        	financeWithdrawSetExample.createCriteria().andFinanceWithdrawSetIdIn(financeWithdrawSetIds);
            count = financeWithdrawSetMapper.deleteByExample(financeWithdrawSetExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了会员提现设置记录");
            } else {
                returnResult.setMsg("发生未知错误，会员提现设置信息删除失败");
            }
        }
        return returnResult;
    }

}
