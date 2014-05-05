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

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.finance.FinanceRechargeSetMapper;
import com.glacier.netloan.entity.finance.FinanceRechargeSet;
import com.glacier.netloan.entity.finance.FinanceRechargeSetExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: FinanceRechargeSetService 
 * @Description: TODO(会员充值设置service层) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceRechargeSetService {
	
	@Autowired
	private FinanceRechargeSetMapper financeRechargeSetMapper;

	/**
	 * @Title: getRechargeSet 
	 * @Description: TODO(根据会员充值设置Id获取会员充值设置信息) 
	 * @param @param financeRechargeSetId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getRechargeSet(String financeRechargeSetId) {
    	FinanceRechargeSet financeRechargeSet = financeRechargeSetMapper.selectByPrimaryKey(financeRechargeSetId);
        return financeRechargeSet;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员充值设置信息) 
     * @param @param pfinanceRechargeSetr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceRechargeSetExample financeRechargeSetExample = new FinanceRechargeSetExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeRechargeSetExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeRechargeSetExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeRechargeSetExample.setOrderByClause(pager.getOrderBy("temp_finance_recharge_set_"));
        }
        List<FinanceRechargeSet>  financeRechargeSets = financeRechargeSetMapper.selectByExample(financeRechargeSetExample); // 查询所有会员充值设置列表
        int total = financeRechargeSetMapper.countByExample(financeRechargeSetExample); // 查询总页数
        returnResult.setRows(financeRechargeSets);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addRechargeSet 
     * @Description: TODO(新增会员充值设置) 
     * @param @param financeRechargeSet
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeSetList_add")
    public Object addRechargeSet(FinanceRechargeSet financeRechargeSet) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinanceRechargeSetExample financeRechargeSetExample = new FinanceRechargeSetExample();
        int count = 0;
        // 防止会员充值设置名称重复
        financeRechargeSetExample.createCriteria().andRechargeSetNameEqualTo(financeRechargeSet.getRechargeSetName());
        count = financeRechargeSetMapper.countByExample(financeRechargeSetExample);// 查找相同名称的会员充值设置数量
        if (count > 0) {
            returnResult.setMsg("会员充值设置名称重复");
            return returnResult;
        }
        financeRechargeSet.setFinanceRechargeSetId(RandomGUID.getRandomGUID());
        financeRechargeSet.setCreater(pricipalUser.getUserId());
        financeRechargeSet.setCreateTime(new Date());
        financeRechargeSet.setUpdater(pricipalUser.getUserId());
        financeRechargeSet.setUpdateTime(new Date());
        count = financeRechargeSetMapper.insert(financeRechargeSet);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeRechargeSet.getRechargeSetName() + "] 会员充值设置信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员充值设置信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editRechargeSet 
     * @Description: TODO(修改会员充值设置) 
     * @param @param financeRechargeSet
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeSetList_edit")
    public Object editRechargeSet(FinanceRechargeSet financeRechargeSet) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinanceRechargeSetExample financeRechargeSetExample = new FinanceRechargeSetExample();
        int count = 0;
        // 防止会员充值设置名称重复
        financeRechargeSetExample.createCriteria().andFinanceRechargeSetIdNotEqualTo(financeRechargeSet.getFinanceRechargeSetId()).andRechargeSetNameEqualTo(financeRechargeSet.getRechargeSetName());
        count = financeRechargeSetMapper.countByExample(financeRechargeSetExample);// 查找相同名称的会员充值设置数量
        if (count > 0) {
            returnResult.setMsg("会员充值设置名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeRechargeSet.setUpdater(pricipalUser.getUserId());
        financeRechargeSet.setUpdateTime(new Date());
        count = financeRechargeSetMapper.updateByPrimaryKeySelective(financeRechargeSet);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeRechargeSet.getRechargeSetName() + "] 会员充值设置信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员充值设置信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditRechargeSet 
     * @Description: TODO(审核会员充值设置) 
     * @param @param financeRechargeSet
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeSetList_audit")
    public Object auditRechargeSet(FinanceRechargeSet financeRechargeSet) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeRechargeSet.setAuditor(pricipalUser.getUserId());
        financeRechargeSet.setAuditDate(new Date());
        count = financeRechargeSetMapper.updateByPrimaryKeySelective(financeRechargeSet);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeRechargeSet.getRechargeSetName() + "] 会员充值设置信息记录审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，会员充值设置信息记录审核操作失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delRechargeSet 
     * @Description: TODO(删除会员充值设置) 
     * @param @param financeRechargeSetId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeSetList_del")
    public Object delRechargeSet(List<String> financeRechargeSetIds, List<String> rechargeSetNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (financeRechargeSetIds.size() > 0) {
        	FinanceRechargeSetExample financeRechargeSetExample = new FinanceRechargeSetExample();
        	financeRechargeSetExample.createCriteria().andFinanceRechargeSetIdIn(financeRechargeSetIds);
            count = financeRechargeSetMapper.deleteByExample(financeRechargeSetExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(rechargeSetNames, ",") + " ]会员充值设置记录");
            } else {
                returnResult.setMsg("发生未知错误，会员充值设置信息删除失败");
            }
        }
        return returnResult;
    }
}