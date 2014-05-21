package com.glacier.netloan.service.finance;

import java.text.SimpleDateFormat;
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
import com.glacier.netloan.dao.finance.FinanceRechargeMapper;
import com.glacier.netloan.dao.finance.FinanceRechargeSetMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.entity.finance.FinanceRecharge;
import com.glacier.netloan.entity.finance.FinanceRechargeExample;
import com.glacier.netloan.entity.finance.FinanceRechargeSet;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
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
	
	@Autowired
	private FinanceRechargeSetMapper financeRechargeSetMapper;

	@Autowired
	private UserMapper userMapper;
	
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

    /**
     * @Title: addRecharge 
     * @Description: TODO(新增会员充值记录) 
     * @param @param financeRecharge
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addRecharge(FinanceRecharge financeRecharge) {
    	
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
  		Member pricipalMember = (Member) pricipalSubject.getPrincipal();
  		
  		UserExample userExample = new UserExample();
  		userExample.createCriteria().andUsernameEqualTo("admin");
  		List<User> users = userMapper.selectByExample(userExample);
  		
        financeRecharge.setFinanceRechargeId(RandomGUID.getRandomGUID());
        // 赋值于充值记录的充值流水号
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        financeRecharge.setRechargeCode("充值"+ "_" + dateFormat.format(new Date()));
        financeRecharge.setAuditState("authstr");
        
        // 获取该充值设置的取费方式进行计算该充值的费率和手续费
        FinanceRechargeSet rechargeSet = new FinanceRechargeSet();
        rechargeSet = financeRechargeSetMapper.selectByPrimaryKey(financeRecharge.getFinanceRechargeSetId());
        String feeWay = rechargeSet.getFeeWay();
        if (null != feeWay && StringUtils.isNotBlank(feeWay)) {
        	 if ("directcost".equals(feeWay)) {//直接收费
        		 financeRecharge.setRechargeRate(rechargeSet.getValue());//费率或者取值即为充值设置的取值
        		 financeRecharge.setHandlingCharge(rechargeSet.getValue());//手续费即为充值设置的取值
             }else {//比例收费
            	 financeRecharge.setRechargeRate(rechargeSet.getRechargeRate());//费率或者取值即为充值设置的费率
            	 financeRecharge.setHandlingCharge(financeRecharge.getRechargeAmount()*rechargeSet.getRechargeRate());//手续费=总额*费率
             }
        }
        financeRecharge.setArriveMoney(financeRecharge.getRechargeAmount()-financeRecharge.getHandlingCharge());//到帐金额=总金额-手续费
        
        //进行充值设置类型判断，如果是线上充值，系统自动进行审核，如果是线下充值，则需要人工手动进行审核
    	if (null != rechargeSet.getRechargeType() && StringUtils.isNotBlank(rechargeSet.getRechargeType())) {
    		if ("onLine".equals(rechargeSet.getRechargeType())) {
    			financeRecharge.setAuditState("pass");
    			financeRecharge.setAuditRemark("系统自动审核通过");
    			financeRecharge.setAuditor(users.get(0).getUserId());
    			financeRecharge.setAuditDate(new Date());
    			financeRecharge.setUpdater(users.get(0).getUserId());
    	        financeRecharge.setUpdateTime(new Date());
    		}
    	}
    	financeRecharge.setCreater(pricipalMember.getMemberId());
        financeRecharge.setCreateTime(new Date());
        int count = financeRechargeMapper.insert(financeRecharge);
        if (count == 1) {
        	
        	//判断如果该充值记录通过审核，系统则会自动生成一条会员资金记录明细信息、平台资金记录明细信息，同时还会自动更新该会员的资金记录信息和平台的资金记录信息
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeRecharge.getRechargeCode() + "] 会员充值记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员充值记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditRecharge 
     * @Description: TODO(审核会员充值记录) 
     * @param @param financeRecharge
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeList_audit")
    public Object auditRecharge(FinanceRecharge financeRecharge) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
  		User pricipalUser = (User) pricipalSubject.getPrincipal();
  		financeRecharge.setAuditDate(new Date());
  		financeRecharge.setAuditor(pricipalUser.getUserId());
  		financeRecharge.setUpdateTime(new Date());
  		financeRecharge.setUpdater(pricipalUser.getUserId());
  		int count = financeRechargeMapper.updateByPrimaryKeySelective(financeRecharge);
  		if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeRecharge.getRechargeCode() + "] 会员充值记录信息已审核");
        } else {
            returnResult.setMsg("发生未知错误，会员充值记录信息审核失败");
        }
    	return returnResult;
    }
    
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