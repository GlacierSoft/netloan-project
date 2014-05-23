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
import com.glacier.netloan.dao.finance.FinanceTransactionMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.finance.FinTransactionQueryDTO;
import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.entity.finance.FinanceTransactionExample;
import com.glacier.netloan.entity.finance.FinanceTransactionExample.Criteria;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: FinanceTransactionService 
 * @Description: TODO(会员资金记录service层) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceTransactionService {
	
	@Autowired
	private FinanceTransactionMapper financeTransactionMapper;
	
	@Autowired
	private UserMapper userMapper;

	/**
	 * @Title: getTransaction 
	 * @Description: TODO(根据会员资金记录Id获取会员资金记录信息) 
	 * @param @param transactionId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getTransaction(String transactionId) {
    	FinanceTransaction financeTransaction = financeTransactionMapper.selectByPrimaryKey(transactionId);
        return financeTransaction;
    }
    
//    public Object getFinTraList(String memberId){
//    	FinanceTransactionExample financeTransactionExample = new FinanceTransactionExample();
//    	financeTransactionExample.createCriteria().andMemberIdEqualTo(memberId);
//    	List<FinanceTransaction> FinTraList = financeTransactionMapper.selectByExample(financeTransactionExample);
//    	return FinTraList;
//    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员资金记录信息) 
     * @param @param pfinanceTransactionr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceTransactionExample financeTransactionExample = new FinanceTransactionExample();
        
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeTransactionExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeTransactionExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeTransactionExample.setOrderByClause(pager.getOrderBy("temp_finance_transaction_"));
        }
        List<FinanceTransaction>  financeTransactions = financeTransactionMapper.selectByExample(financeTransactionExample); // 查询所有会员资金记录列表
        int total = financeTransactionMapper.countByExample(financeTransactionExample); // 查询总页数
        returnResult.setRows(financeTransactions);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: listAsWebsite 
     * @Description: TODO(前台获取会员资金明细记录) 
     * @param @param pager
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsWebsite(JqPager pager, FinTransactionQueryDTO finTransactionQueryDTO, String memberId, int p) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceTransactionExample financeTransactionExample = new FinanceTransactionExample();
        Criteria criteria = financeTransactionExample.createCriteria();
        finTransactionQueryDTO.setQueryCondition(criteria);//前台条件查询
        if(StringUtils.isNotBlank(memberId) && null != memberId){
        	financeTransactionExample.createCriteria().andMemberIdEqualTo(memberId);
        }
        
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeTransactionExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeTransactionExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeTransactionExample.setOrderByClause(pager.getOrderBy("temp_finance_transaction_"));
        }
        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
        financeTransactionExample.setLimitStart(startTemp);
        financeTransactionExample.setLimitEnd(5);
        List<FinanceTransaction>  financeTransactions = financeTransactionMapper.selectByExample(financeTransactionExample); // 查询所有会员资金记录列表
        int total = financeTransactionMapper.countByExample(financeTransactionExample); // 查询总页数
        returnResult.setRows(financeTransactions);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: addTransaction 
     * @Description: TODO(新增会员资金记录) 
     * @param @param financeTransaction
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "TransactionList_add")
    public Object addTransaction(FinanceTransaction financeTransaction) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        
        financeTransaction.setTransactionId(RandomGUID.getRandomGUID());
        financeTransaction.setCreater(pricipalUser.getUserId());
        financeTransaction.setCreateTime(new Date());
        financeTransaction.setUpdater(pricipalUser.getUserId());
        financeTransaction.setUpdateTime(new Date());
        count = financeTransactionMapper.insert(financeTransaction);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员资金记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员资金记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: addTransactionWebsite 
     * @Description: TODO(前台添加资金记录明细) 
     * @param  @param financeTransaction
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    public Object addTransactionWebsite(FinanceTransaction financeTransaction) {
    	
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo("admin");
        List<User> users = userMapper.selectByExample(userExample);
        User pricipalUser = users.get(0);
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        
        financeTransaction.setTransactionId(RandomGUID.getRandomGUID());
        financeTransaction.setCreater(pricipalUser.getUserId());
        financeTransaction.setCreateTime(new Date());
        financeTransaction.setUpdater(pricipalUser.getUserId());
        financeTransaction.setUpdateTime(new Date());
        count = financeTransactionMapper.insert(financeTransaction);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员资金记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员资金记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editTransaction 
     * @Description: TODO(修改会员资金记录) 
     * @param @param financeTransaction
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    /*@Transactional(readOnly = false)
    @MethodLog(opera = "TransactionList_edit")
    public Object editTransaction(FinanceTransaction financeTransaction) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinanceTransactionExample financeTransactionExample = new FinanceTransactionExample();
        int count = 0;
        // 防止会员资金记录名称重复
        financeTransactionExample.createCriteria().andFinanceTransactionIdNotEqualTo(financeTransaction.getFinanceTransactionId()).andTransactionNameEqualTo(financeTransaction.getTransactionName());
        count = financeTransactionMapper.countByExample(financeTransactionExample);// 查找相同名称的会员资金记录数量
        if (count > 0) {
            returnResult.setMsg("会员资金记录名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeTransaction.setUpdater(pricipalUser.getUserId());
        financeTransaction.setUpdateTime(new Date());
        count = financeTransactionMapper.updateByPrimaryKeySelective(financeTransaction);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeTransaction.getTransactionName() + "] 会员资金记录信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员资金记录信息修改失败");
        }
        return returnResult;
    }*/
    
    /**
     * @Title: delTransaction 
     * @Description: TODO(删除会员资金记录) 
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
        	FinanceTransactionExample financeTransactionExample = new FinanceTransactionExample();
        	financeTransactionExample.createCriteria().andTransactionIdIn(transactionIds);
            count = financeTransactionMapper.deleteByExample(financeTransactionExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(transactionCodes, ",") + " ]会员资金记录记录");
            } else {
                returnResult.setMsg("发生未知错误，会员资金记录信息删除失败");
            }
        }
        return returnResult;
    }
}