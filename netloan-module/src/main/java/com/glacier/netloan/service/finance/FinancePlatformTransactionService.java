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
import com.glacier.netloan.dao.finance.FinancePlatformTransactionMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.entity.finance.FinancePlatformTransaction;
import com.glacier.netloan.entity.finance.FinancePlatformTransactionExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: FinancePlatformTransactionService 
 * @Description: TODO(平台资金记录service层) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinancePlatformTransactionService {
	
	@Autowired
	private FinancePlatformTransactionMapper financePlatformTransactionMapper;
	
	@Autowired
	private UserMapper userMapper;

	/**
	 * @Title: getTransaction 
	 * @Description: TODO(根据平台资金记录Id获取平台资金记录信息) 
	 * @param @param transactionId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getTransaction(String transactionId) {
    	FinancePlatformTransaction financePlatformTransaction = financePlatformTransactionMapper.selectByPrimaryKey(transactionId);
        return financePlatformTransaction;
    }
    
//    public Object getFinTraList(String memberId){
//    	FinancePlatformTransactionExample financePlatformTransactionExample = new FinancePlatformTransactionExample();
//    	financePlatformTransactionExample.createCriteria().andMemberIdEqualTo(memberId);
//    	List<FinancePlatformTransaction> FinTraList = financePlatformTransactionMapper.selectByExample(financePlatformTransactionExample);
//    	return FinTraList;
//    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有平台资金记录信息) 
     * @param @param pfinancePlatformTransactionr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        FinancePlatformTransactionExample financePlatformTransactionExample = new FinancePlatformTransactionExample();
        
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financePlatformTransactionExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financePlatformTransactionExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financePlatformTransactionExample.setOrderByClause(pager.getOrderBy("temp_finance_platform_transaction_"));
        }
        List<FinancePlatformTransaction>  financePlatformTransactions = financePlatformTransactionMapper.selectByExample(financePlatformTransactionExample); // 查询所有平台资金记录列表
        int total = financePlatformTransactionMapper.countByExample(financePlatformTransactionExample); // 查询总页数
        returnResult.setRows(financePlatformTransactions);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: listAsWebsite 
     * @Description: TODO(前台获取平台资金明细记录) 
     * @param @param pager
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsWebsite(JqPager pager, String memberId, int p) {

        JqGridReturn returnResult = new JqGridReturn();
        FinancePlatformTransactionExample financePlatformTransactionExample = new FinancePlatformTransactionExample();
        
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financePlatformTransactionExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financePlatformTransactionExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financePlatformTransactionExample.setOrderByClause(pager.getOrderBy("temp_finance_transaction_"));
        }
        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
        financePlatformTransactionExample.setLimitStart(startTemp);
        financePlatformTransactionExample.setLimitEnd(5);
        List<FinancePlatformTransaction>  financePlatformTransactions = financePlatformTransactionMapper.selectByExample(financePlatformTransactionExample); // 查询所有平台资金记录列表
        int total = financePlatformTransactionMapper.countByExample(financePlatformTransactionExample); // 查询总页数
        returnResult.setRows(financePlatformTransactions);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: addTransaction 
     * @Description: TODO(新增平台资金记录) 
     * @param @param financePlatformTransaction
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "TransactionList_add")
    public Object addTransaction(FinancePlatformTransaction financePlatformTransaction) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        
        financePlatformTransaction.setPlatformTransactionId(RandomGUID.getRandomGUID());
        financePlatformTransaction.setCreater(pricipalUser.getUserId());
        financePlatformTransaction.setCreateTime(new Date());
        financePlatformTransaction.setUpdater(pricipalUser.getUserId());
        financePlatformTransaction.setUpdateTime(new Date());
        count = financePlatformTransactionMapper.insert(financePlatformTransaction);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("平台资金记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，平台资金记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: addTransactionWebsite 
     * @Description: TODO(前台添加资金记录明细) 
     * @param  @param financePlatformTransaction
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    public Object addTransactionWebsite(FinancePlatformTransaction financePlatformTransaction) {
    	
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo("admin");
        List<User> users = userMapper.selectByExample(userExample);
        User pricipalUser = users.get(0);
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        
        financePlatformTransaction.setPlatformTransactionId(RandomGUID.getRandomGUID());
        financePlatformTransaction.setCreater(pricipalUser.getUserId());
        financePlatformTransaction.setCreateTime(new Date());
        financePlatformTransaction.setUpdater(pricipalUser.getUserId());
        financePlatformTransaction.setUpdateTime(new Date());
        count = financePlatformTransactionMapper.insert(financePlatformTransaction);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("平台资金记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，平台资金记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editTransaction 
     * @Description: TODO(修改平台资金记录) 
     * @param @param financePlatformTransaction
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    /*@Transactional(readOnly = false)
    @MethodLog(opera = "TransactionList_edit")
    public Object editTransaction(FinancePlatformTransaction financePlatformTransaction) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinancePlatformTransactionExample financePlatformTransactionExample = new FinancePlatformTransactionExample();
        int count = 0;
        // 防止平台资金记录名称重复
        financePlatformTransactionExample.createCriteria().andFinancePlatformTransactionIdNotEqualTo(financePlatformTransaction.getFinancePlatformTransactionId()).andTransactionNameEqualTo(financePlatformTransaction.getTransactionName());
        count = financePlatformTransactionMapper.countByExample(financePlatformTransactionExample);// 查找相同名称的平台资金记录数量
        if (count > 0) {
            returnResult.setMsg("平台资金记录名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financePlatformTransaction.setUpdater(pricipalUser.getUserId());
        financePlatformTransaction.setUpdateTime(new Date());
        count = financePlatformTransactionMapper.updateByPrimaryKeySelective(financePlatformTransaction);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financePlatformTransaction.getTransactionName() + "] 平台资金记录信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，平台资金记录信息修改失败");
        }
        return returnResult;
    }*/
    
    /**
     * @Title: delTransaction 
     * @Description: TODO(删除平台资金记录) 
     * @param @param transactionId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "TransactionList_del")
    public Object delTransaction(List<String> transactionIds, List<String> transactionCodes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (transactionIds.size() > 0) {
        	FinancePlatformTransactionExample financePlatformTransactionExample = new FinancePlatformTransactionExample();
        	financePlatformTransactionExample.createCriteria().andPlatformTransactionIdIn(transactionIds);
            count = financePlatformTransactionMapper.deleteByExample(financePlatformTransactionExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(transactionCodes, ",") + " ]平台资金记录记录");
            } else {
                returnResult.setMsg("发生未知错误，平台资金记录信息删除失败");
            }
        }
        return returnResult;
    }
}