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
import com.glacier.netloan.dao.finance.FinanceWithdrawMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.entity.finance.FinanceWithdraw;
import com.glacier.netloan.entity.finance.FinanceWithdrawExample;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: FinanceWithdrawService 
 * @Description: TODO(会员提现记录service层) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceWithdrawService {
	
	@Autowired
	private FinanceWithdrawMapper financeWithdrawMapper;

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * @Title: getWithdraw 
	 * @Description: TODO(根据会员提现记录Id获取会员提现记录信息) 
	 * @param @param financeWithdrawId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getWithdraw(String financeWithdrawId) {
    	FinanceWithdraw financeWithdraw = financeWithdrawMapper.selectByPrimaryKey(financeWithdrawId);
        return financeWithdraw;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员提现记录信息) 
     * @param @param pfinanceWithdrawr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceWithdrawExample financeWithdrawExample = new FinanceWithdrawExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeWithdrawExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeWithdrawExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeWithdrawExample.setOrderByClause(pager.getOrderBy("temp_finance_withdraw_"));
        }
        List<FinanceWithdraw>  financeWithdraws = financeWithdrawMapper.selectByExample(financeWithdrawExample); // 查询所有会员提现记录列表
        int total = financeWithdrawMapper.countByExample(financeWithdrawExample); // 查询总页数
        returnResult.setRows(financeWithdraws);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    public Object listAsWebsite(JqPager pager, String memberId, int p) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceWithdrawExample financeWithdrawExample = new FinanceWithdrawExample();

        if(StringUtils.isNotBlank(memberId) && null != memberId){
        	financeWithdrawExample.createCriteria().andMemberIdEqualTo(memberId);
        }
        
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeWithdrawExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeWithdrawExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeWithdrawExample.setOrderByClause(pager.getOrderBy("temp_finance_withdraw_"));
        }
        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
        financeWithdrawExample.setLimitStart(startTemp);
        financeWithdrawExample.setLimitEnd(5);
        List<FinanceWithdraw>  financeWithdraws = financeWithdrawMapper.selectByExample(financeWithdrawExample); // 查询所有会员提现记录列表
        int total = financeWithdrawMapper.countByExample(financeWithdrawExample); // 查询总页数
        returnResult.setRows(financeWithdraws);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addWithdraw 
     * @Description: TODO(新增会员提现记录) 
     * @param @param financeWithdraw
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addWithdraw(FinanceWithdraw financeWithdraw) {
    	
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
  		Member pricipalMember = (Member) pricipalSubject.getPrincipal();
  		
  		UserExample userExample = new UserExample();
  		userExample.createCriteria().andUsernameEqualTo("admin");
  		List<User> users = userMapper.selectByExample(userExample);
  		
        int count = 0;
        financeWithdraw.setFinanceWithdrawId(RandomGUID.getRandomGUID());
        // 赋值于提现记录的提现流水号
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        financeWithdraw.setWithdrawCode("提现"+ "_" + dateFormat.format(new Date()));
        financeWithdraw.setAuditState("authstr");
        financeWithdraw.setCreater(pricipalMember.getMemberId());
        financeWithdraw.setCreateTime(new Date());
        financeWithdraw.setUpdater(users.get(0).getUserId());
        financeWithdraw.setUpdateTime(new Date());
        count = financeWithdrawMapper.insert(financeWithdraw);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeWithdraw.getWithdrawCode() + "] 会员提现记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员提现记录信息保存失败");
        }
        return returnResult;
    }
    
/*    
    *//**
     * @Title: editWithdraw 
     * @Description: TODO(修改会员提现记录) 
     * @param @param financeWithdraw
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     *//*
    @Transactional(readOnly = false)
    @MethodLog(opera = "WithdrawList_edit")
    public Object editWithdraw(FinanceWithdraw financeWithdraw) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinanceWithdrawExample financeWithdrawExample = new FinanceWithdrawExample();
        int count = 0;
        // 防止会员提现记录名称重复
        financeWithdrawExample.createCriteria().andFinanceWithdrawIdNotEqualTo(financeWithdraw.getFinanceWithdrawId()).andWithdrawNameEqualTo(financeWithdraw.getWithdrawName());
        count = financeWithdrawMapper.countByExample(financeWithdrawExample);// 查找相同名称的会员提现记录数量
        if (count > 0) {
            returnResult.setMsg("会员提现记录名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeWithdraw.setUpdater(pricipalUser.getUserId());
        financeWithdraw.setUpdateTime(new Date());
        count = financeWithdrawMapper.updateByPrimaryKeySelective(financeWithdraw);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeWithdraw.getWithdrawName() + "] 会员提现记录信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员提现记录信息修改失败");
        }
        return returnResult;
    }*/
    
    /**
     * @Title: auditWithdraw 
     * @Description: TODO(审核会员提现记录信息) 
     * @param @param financeWithdraw
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WithdrawList_audit")
    public Object auditWithdraw(FinanceWithdraw financeWithdraw) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeWithdraw.setAuditor(pricipalUser.getUserId());
        financeWithdraw.setAuditDate(new Date());
        financeWithdraw.setUpdater(pricipalUser.getUserId());
        financeWithdraw.setUpdateTime(new Date());
        count = financeWithdrawMapper.updateByPrimaryKeySelective(financeWithdraw);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeWithdraw.getWithdrawCode() + "] 会员提现记录信息已审核");
        } else {
            returnResult.setMsg("发生未知错误，会员提现记录信息审核失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delWithdraw 
     * @Description: TODO(删除会员提现记录) 
     * @param @param financeWithdrawId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WithdrawList_del")
    public Object delWithdraw(List<String> financeWithdrawIds, List<String> withdrawCodes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (financeWithdrawIds.size() > 0) {
        	FinanceWithdrawExample financeWithdrawExample = new FinanceWithdrawExample();
        	financeWithdrawExample.createCriteria().andFinanceWithdrawIdIn(financeWithdrawIds);
            count = financeWithdrawMapper.deleteByExample(financeWithdrawExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(withdrawCodes, ",") + " ]会员提现记录记录");
            } else {
                returnResult.setMsg("发生未知错误，会员提现记录信息删除失败");
            }
        }
        return returnResult;
    }
    
    /**
     * @Title: getFinanceWithdrawNumByAuditState 
     * @Description: TODO(根据会员提现记录状态查找出该提现记录的条数) 
     * @param  @param AuditState
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getFinanceWithdrawNumByAuditState(String AuditState) {
        FinanceWithdrawExample financeWithdrawExample = new FinanceWithdrawExample();
        financeWithdrawExample.createCriteria().andAuditStateEqualTo(AuditState);
        int financeWithdrawNum = financeWithdrawMapper.countByExample(financeWithdrawExample);
        return financeWithdrawNum;
    }
}