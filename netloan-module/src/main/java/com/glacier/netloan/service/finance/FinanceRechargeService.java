package com.glacier.netloan.service.finance;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.finance.FinanceRechargeMapper;
import com.glacier.netloan.entity.finance.FinanceRecharge;
import com.glacier.netloan.entity.finance.FinanceRechargeExample;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: FinanceRechargeService 
 * @Description: TODO(会员充值记录service层) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceRechargeService {
	
	@Autowired
	private FinanceRechargeMapper financeRechargeMapper;

	/**
	 * @Title: getRecharge 
	 * @Description: TODO(根据会员充值记录Id获取会员充值记录信息) 
	 * @param @param financeRechargeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getRecharge(String financeRechargeId) {
    	FinanceRecharge financeRecharge = financeRechargeMapper.selectByPrimaryKey(financeRechargeId);
        return financeRecharge;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员充值记录信息) 
     * @param @param pfinanceRecharger
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceRechargeExample financeRechargeExample = new FinanceRechargeExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeRechargeExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeRechargeExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeRechargeExample.setOrderByClause(pager.getOrderBy("temp_finance_recharge_"));
        }
        List<FinanceRecharge>  financeRecharges = financeRechargeMapper.selectByExample(financeRechargeExample); // 查询所有会员充值记录列表
        int total = financeRechargeMapper.countByExample(financeRechargeExample); // 查询总页数
        returnResult.setRows(financeRecharges);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
/*
    *//**
     * @Title: addRecharge 
     * @Description: TODO(新增会员充值记录) 
     * @param @param financeRecharge
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     *//*
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeList_add")
    public Object addRecharge(FinanceRecharge financeRecharge) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinanceRechargeExample financeRechargeExample = new FinanceRechargeExample();
        int count = 0;
        // 防止会员充值记录名称重复
        financeRechargeExample.createCriteria().andRechargeNameEqualTo(financeRecharge.getRechargeName());
        count = financeRechargeMapper.countByExample(financeRechargeExample);// 查找相同名称的会员充值记录数量
        if (count > 0) {
            returnResult.setMsg("会员充值记录名称重复");
            return returnResult;
        }
        financeRecharge.setFinanceRechargeId(RandomGUID.getRandomGUID());
        financeRecharge.setCreater(pricipalUser.getUserId());
        financeRecharge.setCreateTime(new Date());
        financeRecharge.setUpdater(pricipalUser.getUserId());
        financeRecharge.setUpdateTime(new Date());
        count = financeRechargeMapper.insert(financeRecharge);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeRecharge.getRechargeName() + "] 会员充值记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员充值记录信息保存失败");
        }
        return returnResult;
    }
    
    *//**
     * @Title: editRecharge 
     * @Description: TODO(修改会员充值记录) 
     * @param @param financeRecharge
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     *//*
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeList_edit")
    public Object editRecharge(FinanceRecharge financeRecharge) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinanceRechargeExample financeRechargeExample = new FinanceRechargeExample();
        int count = 0;
        // 防止会员充值记录名称重复
        financeRechargeExample.createCriteria().andFinanceRechargeIdNotEqualTo(financeRecharge.getFinanceRechargeId()).andRechargeNameEqualTo(financeRecharge.getRechargeName());
        count = financeRechargeMapper.countByExample(financeRechargeExample);// 查找相同名称的会员充值记录数量
        if (count > 0) {
            returnResult.setMsg("会员充值记录名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeRecharge.setUpdater(pricipalUser.getUserId());
        financeRecharge.setUpdateTime(new Date());
        count = financeRechargeMapper.updateByPrimaryKeySelective(financeRecharge);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeRecharge.getRechargeName() + "] 会员充值记录信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员充值记录信息修改失败");
        }
        return returnResult;
    }*/
    
    /**
     * @Title: delRecharge 
     * @Description: TODO(删除会员充值记录) 
     * @param @param financeRechargeId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeList_del")
    public Object delRecharge(List<String> financeRechargeIds, List<String> rechargeNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (financeRechargeIds.size() > 0) {
        	FinanceRechargeExample financeRechargeExample = new FinanceRechargeExample();
        	financeRechargeExample.createCriteria().andFinanceRechargeIdIn(financeRechargeIds);
            count = financeRechargeMapper.deleteByExample(financeRechargeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(rechargeNames, ",") + " ]会员充值记录记录");
            } else {
                returnResult.setMsg("发生未知错误，会员充值记录信息删除失败");
            }
        }
        return returnResult;
    }
}