/*
 * @(#)LoanTenderService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.borrow;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import com.glacier.netloan.dao.borrow.LoanTenderMapper;
import com.glacier.netloan.dao.borrow.RepaymentTypeMapper;
import com.glacier.netloan.dao.borrow.TenderRepaymentMapper;
import com.glacier.netloan.entity.borrow.LoanTender;
import com.glacier.netloan.entity.borrow.LoanTenderExample;
import com.glacier.netloan.entity.borrow.RepaymentType;
import com.glacier.netloan.entity.borrow.RepaymentTypeExample;
import com.glacier.netloan.entity.borrow.TenderRepaymentExample;
import com.glacier.netloan.entity.borrow.TenderRepaymentKey;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: LoanTenderService 
 * @Description: TODO(标种类型业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class LoanTenderService {

	@Autowired
    private LoanTenderMapper loanTenderMapper;
	
	@Autowired
	private RepaymentTypeMapper repaymentTypeMapper;
	
	@Autowired
	private TenderRepaymentMapper tenderRepaymentMapper;
	
	/**
	 * @Title: getLoanTender 
	 * @Description: TODO(根据标种类型Id获取标种类型信息) 
	 * @param @param webAdvId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getLoanTender(String loanId) {
    	LoanTender loanTender = loanTenderMapper.selectByPrimaryKey(loanId);
        return loanTender;
    }
    
    /**
     * @Title: getLoanTenderRepay 
     * @Description: TODO(根据标种类型Id查找相关联的还款方式) 
     * @param @param loanId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getLoanTenderRepay(String loanId) {
       	RepaymentTypeExample repaymentTypeExample =new RepaymentTypeExample();
    	List<RepaymentType> repaymentTypes = repaymentTypeMapper.selectByExample(repaymentTypeExample);
    	TenderRepaymentExample tenderRepaymentExample = new TenderRepaymentExample();
    	tenderRepaymentExample.createCriteria().andLoanTenderIdEqualTo(loanId);
    	List<TenderRepaymentKey> tenderRepaymentList = tenderRepaymentMapper.selectByExample(tenderRepaymentExample);
    	Map<String,String> map = new HashMap<String,String>();
    	for (RepaymentType repaymentType : repaymentTypes) {
    		TenderRepaymentKey tenderRepayment = new TenderRepaymentKey();
    		tenderRepayment.setLoanTenderId(loanId);
    		tenderRepayment.setRepaymentTypeId(repaymentType.getRepaymentTypeId());
    		if (tenderRepaymentList.contains(tenderRepayment)) {// 根据标种Id查找已经存在关系的还款方式
    			map.put(repaymentType.getRepaymentTypeId(),repaymentType.getRepaymentTypeName()); 
    		}
    	}
        return map;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有标种类型信息) 
     * @param @param ploanTenderr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        LoanTenderExample loanTenderExample = new LoanTenderExample();

        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	loanTenderExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	loanTenderExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	loanTenderExample.setOrderByClause(jqPager.getOrderBy("temp_loan_tender_"));
        }
        List<LoanTender>  loanTenders = loanTenderMapper.selectByExample(loanTenderExample); // 查询所有标种类型列表
        int total = loanTenderMapper.countByExample(loanTenderExample); // 查询总页数
        returnResult.setRows(loanTenders);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addLoanTender 
     * @Description: TODO(新增标种类型) 
     * @param @param loanTender
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "LoanTenderList_add")
    public Object addLoanTender(LoanTender loanTender) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        LoanTenderExample loanTenderExample = new LoanTenderExample();
        int count = 0;
        // 防止标种类型主题重复
        loanTenderExample.createCriteria().andLoanrTenderNameEqualTo(loanTender.getLoanrTenderName());
        count = loanTenderMapper.countByExample(loanTenderExample);// 查找相同编号的标种类型数量
        if (count > 0) {
            returnResult.setMsg("标种类型编号重复");
            return returnResult;
        }
        loanTender.setLoanTenderId(RandomGUID.getRandomGUID());
        loanTender.setCreater(pricipalUser.getUserId());
        loanTender.setCreateTime(new Date());
        loanTender.setUpdater(pricipalUser.getUserId());
        loanTender.setUpdateTime(new Date());
        count = loanTenderMapper.insert(loanTender);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + loanTender.getLoanrTenderName() + "] 标种类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，标种类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editLoanTender 
     * @Description: TODO(修改标种类型) 
     * @param @param loanTender
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "LoanTenderList_edit")
    public Object editLoanTender(LoanTender loanTender) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        LoanTenderExample loanTenderExample = new LoanTenderExample();
        int count = 0;
        // 防止标种类型主题重复
        loanTenderExample.createCriteria().andLoanTenderIdNotEqualTo(loanTender.getLoanTenderId()).andLoanrTenderNameEqualTo(loanTender.getLoanrTenderName());
        count = loanTenderMapper.countByExample(loanTenderExample);// 查找相同编号的标种类型数量
        if (count > 0) {
            returnResult.setMsg("标种类型编号重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        loanTender.setUpdater(pricipalUser.getUserId());
        loanTender.setUpdateTime(new Date());
        count = loanTenderMapper.updateByPrimaryKeySelective(loanTender);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + loanTender.getLoanrTenderName() + "] 标种类型信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，标种类型信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delLoanTender 
     * @Description: TODO(删除标种类型) 
     * @param @param webAdvIds
     * @param @param advThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "LoanTenderList_del")
    public Object delLoanTender(List<String> loanTenderIds, List<String> loanrTenderNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (loanTenderIds.size() > 0) {
        	LoanTenderExample loanTenderExample = new LoanTenderExample();
        	loanTenderExample.createCriteria().andLoanTenderIdIn(loanTenderIds);
            count = loanTenderMapper.deleteByExample(loanTenderExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(loanrTenderNames, ",") + " ]标种类型");
            } else {
                returnResult.setMsg("发生未知错误，标种类型信息删除失败");
            }
        }
        return returnResult;
    }
    
    /**
     * @Title: getTenderAndRepayment 
     * @Description: TODO(根据标种类型Id获取到还款方式列表) 
     * @param @param loanTenderId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getTenderAndRepayment(String loanTenderId) {
    	RepaymentTypeExample repaymentTypeExample =new RepaymentTypeExample();
    	repaymentTypeExample.createCriteria().andStateEqualTo("open");
    	List<RepaymentType> repaymentTypes = repaymentTypeMapper.selectByExample(repaymentTypeExample);
    	TenderRepaymentExample tenderRepaymentExample = new TenderRepaymentExample();
    	tenderRepaymentExample.createCriteria().andLoanTenderIdEqualTo(loanTenderId);
    	List<TenderRepaymentKey> tenderRepaymentList = tenderRepaymentMapper.selectByExample(tenderRepaymentExample);
    	for (RepaymentType repaymentType : repaymentTypes) {
    		TenderRepaymentKey tenderRepayment = new TenderRepaymentKey();
    		tenderRepayment.setLoanTenderId(loanTenderId);
    		tenderRepayment.setRepaymentTypeId(repaymentType.getRepaymentTypeId());
    		if (tenderRepaymentList.contains(tenderRepayment)) {// 根据标种Id查找已经存在关系的还款方式
    			repaymentType.setChecked(true);
    		}
    	}
    	return repaymentTypes;
    }
    
    /**
     * @Title: saveTenderAndRepayment 
     * @Description: TODO(保存标种类型和还款方式关系) 
     * @param @param loanTenderId
     * @param @param repaymentTypeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "LoanTenderList_assign")
    public Object saveTenderAndRepayment(String loanTenderId, Set<String> repaymentTypeIds) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        TenderRepaymentExample tenderRepaymentExample = new TenderRepaymentExample();
        tenderRepaymentExample.createCriteria().andLoanTenderIdEqualTo(loanTenderId);
        count = tenderRepaymentMapper.deleteByExample(tenderRepaymentExample);// 先把之前存在的关系删除
        if (null != repaymentTypeIds && repaymentTypeIds.size() > 0) {
        	for (String repaymentTypeId : repaymentTypeIds) {
        		TenderRepaymentKey tenderRepayment = new TenderRepaymentKey();
        		tenderRepayment.setLoanTenderId(loanTenderId);
        		tenderRepayment.setRepaymentTypeId(repaymentTypeId);
        		count += tenderRepaymentMapper.insert(tenderRepayment);// 插入标种类型和还款方式中间表数据
        	}
        }
        if (count > 0) {
            returnResult.setSuccess(true);
            returnResult.setMsg("分配还款方式成功");
        } else {
            returnResult.setMsg("系统出现未知错误，分配还款方式失败");
        }
        return returnResult;
    }
}
