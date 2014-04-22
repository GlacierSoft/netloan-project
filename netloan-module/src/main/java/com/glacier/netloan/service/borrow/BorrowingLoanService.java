/*
 * @(#)BorrowingLoanService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.borrow;

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
import com.glacier.netloan.dao.borrow.BorrowingLoanMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.BorrowingLoanExample;
import com.glacier.netloan.entity.borrow.BorrowingLoanExample.Criteria;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: BorrowingLoanService 
 * @Description: TODO(借款业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class BorrowingLoanService {

	@Autowired
    private BorrowingLoanMapper borrowingLoanMapper;

	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getBorrowingLoan 
	 * @Description: TODO(根据借款Id获取借款信息) 
	 * @param @param loanId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getBorrowingLoan(String loanId) {
    	BorrowingLoan borrowingLoan = borrowingLoanMapper.selectByPrimaryKey(loanId);
        return borrowingLoan;
    }
    /**
     * @Title: listAsGridWebsite 
     * @Description: TODO(前台会员借款列表) 
     * @param  @param jqPager
     * @param  @param borrowingLoanQueryDTO
     * @param  @param loanState
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object listAsGridWebsite(JqPager jqPager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String loanState,int p) {
        
        JqGridReturn returnResult = new JqGridReturn();
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        
        Criteria queryCriteria = borrowingLoanExample.createCriteria();
        borrowingLoanQueryDTO.setQueryCondition(queryCriteria);
        
        jqPager.setSort("createTime");// 定义排序字段
        jqPager.setOrder("DESC");// 升序还是降序
        System.out.println("aa  "+loanState);
        if (null != loanState && StringUtils.isNotBlank(loanState)) {
        	borrowingLoanExample.createCriteria().andLoanStateEqualTo(loanState);
        	System.out.println("cc  "+loanState);
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	borrowingLoanExample.setOrderByClause(jqPager.getOrderBy("temp_borrowing_loan_"));
        }
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        borrowingLoanExample.setLimitStart(startTemp);
        borrowingLoanExample.setLimitEnd(10);
        List<BorrowingLoan>  borrowingLoans = borrowingLoanMapper.selectByExample(borrowingLoanExample); // 查询所有借款列表
        int total = borrowingLoanMapper.countByExample(borrowingLoanExample); // 查询总页数
        returnResult.setRows(borrowingLoans);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有借款信息) 
     * @param @param pborrowingLoanr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String loanState) {
        
        JqGridReturn returnResult = new JqGridReturn();
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        
        Criteria queryCriteria = borrowingLoanExample.createCriteria();
        borrowingLoanQueryDTO.setQueryCondition(queryCriteria);
        
        if (null != loanState && StringUtils.isNotBlank(loanState)) {
        	borrowingLoanExample.createCriteria().andLoanStateEqualTo(loanState);
        }

        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	borrowingLoanExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	borrowingLoanExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	borrowingLoanExample.setOrderByClause(jqPager.getOrderBy("temp_borrowing_loan_"));
        }
        List<BorrowingLoan>  borrowingLoans = borrowingLoanMapper.selectByExample(borrowingLoanExample); // 查询所有借款列表
        int total = borrowingLoanMapper.countByExample(borrowingLoanExample); // 查询总页数
        returnResult.setRows(borrowingLoans);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addBorrowingLoan 
     * @Description: TODO(新增借款) 
     * @param @param borrowingLoan
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addBorrowingLoan(BorrowingLoan borrowingLoan, String memberId) {
    	
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        int count = 0;
        // 防止借款主题重复
        borrowingLoanExample.createCriteria().andLoanCodeEqualTo(borrowingLoan.getLoanCode());
        count = borrowingLoanMapper.countByExample(borrowingLoanExample);// 查找相同编号的借款数量
        if (count > 0) {
            returnResult.setMsg("借款编号重复");
            return returnResult;
        }
        borrowingLoan.setLoanId(RandomGUID.getRandomGUID());
        borrowingLoan.setMemberId(memberId);
        borrowingLoan.setLoanTenderId("2587bd0ecc859e35f2874f2aff0d4852");
        borrowingLoan.setCreater(memberId);
        borrowingLoan.setCreateTime(new Date());
        borrowingLoan.setUpdater(memberId);
        borrowingLoan.setUpdateTime(new Date());
        count = borrowingLoanMapper.insert(borrowingLoan);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + borrowingLoan.getLoanCode() + "] 借款信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，借款信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editBorrowingLoan 
     * @Description: TODO(修改借款) 
     * @param @param borrowingLoan
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "BorrowingLoanList_edit")
    public Object editBorrowingLoan(BorrowingLoan borrowingLoan) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        int count = 0;
        // 防止借款主题重复
        borrowingLoanExample.createCriteria().andLoanIdNotEqualTo(borrowingLoan.getLoanId()).andLoanCodeEqualTo(borrowingLoan.getLoanCode());
        count = borrowingLoanMapper.countByExample(borrowingLoanExample);// 查找相同编号的借款数量
        if (count > 0) {
            returnResult.setMsg("借款编号重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        borrowingLoan.setUpdater(pricipalUser.getUserId());
        borrowingLoan.setUpdateTime(new Date());
        count = borrowingLoanMapper.updateByPrimaryKeySelective(borrowingLoan);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + borrowingLoan.getLoanCode() + "] 借款信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，借款信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: firstAuditBorrowingLoan 
     * @Description: TODO(借款进行初审) 
     * @param @param borrowingLoan
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "BorrowingLoanList_firstAudit")
    public Object firstAuditBorrowingLoan(BorrowingLoan borrowingLoan) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        borrowingLoan.setFirstAuditorId(pricipalUser.getUserId());
        borrowingLoan.setFirstAuditDate(new Date());
        borrowingLoan.setUpdater(pricipalUser.getUserId());
        borrowingLoan.setUpdateTime(new Date());
        if ("".equals(borrowingLoan.getFailedReason()) && StringUtils.isBlank(borrowingLoan.getFailedReason())) {
        	borrowingLoan.setFailedReason(null);
        }
        if ("".equals(borrowingLoan.getIsDayMarked()) && StringUtils.isBlank(borrowingLoan.getIsDayMarked())) {
        	borrowingLoan.setIsDayMarked(null);
        }
        if ("".equals(borrowingLoan.getIsBidReward()) && StringUtils.isBlank(borrowingLoan.getIsBidReward())) {
        	borrowingLoan.setIsBidReward(null);
        }
        if ("".equals(borrowingLoan.getIsBidMarked()) && StringUtils.isBlank(borrowingLoan.getIsBidMarked())) {
        	borrowingLoan.setIsBidMarked(null);
        }
        if ("".equals(borrowingLoan.getIsBidPwd()) && StringUtils.isBlank(borrowingLoan.getIsBidPwd())) {
        	borrowingLoan.setIsBidPwd(null);
        }
        if ("firstSucess".equals(borrowingLoan.getFirstAuditState())) {
        	borrowingLoan.setLoanState("secondAuditor");
        }
        count = borrowingLoanMapper.updateByPrimaryKeySelective(borrowingLoan);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + borrowingLoan.getLoanCode() + "] 初审借款信息成功");
        } else {
            returnResult.setMsg("发生未知错误，初审借款信息失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: secondAuditBorrowingLoan 
     * @Description: TODO(借款进行复审) 
     * @param @param borrowingLoan
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "BorrowingLoanList_secondAudit")
    public Object secondAuditBorrowingLoan(BorrowingLoan borrowingLoan) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        borrowingLoan.setSecondAuditorId(pricipalUser.getUserId());
        borrowingLoan.setSecondAuditDate(new Date());
        borrowingLoan.setUpdater(pricipalUser.getUserId());
        borrowingLoan.setUpdateTime(new Date());
        if ("".equals(borrowingLoan.getFailedReason()) && StringUtils.isBlank(borrowingLoan.getFailedReason())) {
        	borrowingLoan.setFailedReason(null);
        }
        if ("".equals(borrowingLoan.getIsDayMarked()) && StringUtils.isBlank(borrowingLoan.getIsDayMarked())) {
        	borrowingLoan.setIsDayMarked(null);
        }
        if ("".equals(borrowingLoan.getIsBidReward()) && StringUtils.isBlank(borrowingLoan.getIsBidReward())) {
        	borrowingLoan.setIsBidReward(null);
        }
        if ("".equals(borrowingLoan.getIsBidMarked()) && StringUtils.isBlank(borrowingLoan.getIsBidMarked())) {
        	borrowingLoan.setIsBidMarked(null);
        }
        if ("".equals(borrowingLoan.getIsBidPwd()) && StringUtils.isBlank(borrowingLoan.getIsBidPwd())) {
        	borrowingLoan.setIsBidPwd(null);
        }
        if ("secondSucess".equals(borrowingLoan.getSecondAuditState())) {
        	borrowingLoan.setLoanState("tendering");
        }
        count = borrowingLoanMapper.updateByPrimaryKeySelective(borrowingLoan);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + borrowingLoan.getLoanCode() + "] 复审借款信息成功");
        } else {
            returnResult.setMsg("发生未知错误，复审借款信息失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delBorrowingLoan 
     * @Description: TODO(删除借款) 
     * @param @param loanIds
     * @param @param loanCodes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "BorrowingLoanList_del")
    public Object delBorrowingLoan(List<String> loanIds, List<String> loanCodes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (loanIds.size() > 0) {
        	BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        	borrowingLoanExample.createCriteria().andLoanIdIn(loanIds);
            count = borrowingLoanMapper.deleteByExample(borrowingLoanExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(loanCodes, ",") + " ]借款");
            } else {
                returnResult.setMsg("发生未知错误，借款信息删除失败");
            }
        }
        return returnResult;
    }
}
