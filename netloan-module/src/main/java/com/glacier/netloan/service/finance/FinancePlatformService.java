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
import com.glacier.netloan.dao.finance.FinancePlatformMapper;
import com.glacier.netloan.entity.finance.FinancePlatform;
import com.glacier.netloan.entity.finance.FinancePlatformExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: FinancePlatformService 
 * @Description: TODO(平台资金记录service层) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinancePlatformService {
	
	@Autowired
	private FinancePlatformMapper financePlatformMapper;

	/**
	 * @Title: getPlatform 
	 * @Description: TODO(根据平台资金记录Id获取平台资金记录信息) 
	 * @param @param financePlatformId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getPlatform(String financePlatformId) {
    	FinancePlatform financePlatform = financePlatformMapper.selectByPrimaryKey(financePlatformId);
        return financePlatform;
    }
    
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有平台资金记录信息) 
     * @param @param pfinancePlatformr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        FinancePlatformExample financePlatformExample = new FinancePlatformExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financePlatformExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financePlatformExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financePlatformExample.setOrderByClause(pager.getOrderBy("temp_finance_platform_"));
        }
        List<FinancePlatform>  financePlatforms = financePlatformMapper.selectByExample(financePlatformExample); // 查询所有平台资金记录列表
        int total = financePlatformMapper.countByExample(financePlatformExample); // 查询总页数
        returnResult.setRows(financePlatforms);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addPlatform 
     * @Description: TODO(新增平台资金记录) 
     * @param @param financePlatform
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addPlatform(FinancePlatform financePlatform) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
       
        financePlatform.setFinancePlatformId(RandomGUID.getRandomGUID());
        financePlatform.setCreater(pricipalUser.getUserId());
        financePlatform.setCreateTime(new Date());
        financePlatform.setUpdater(pricipalUser.getUserId());
        financePlatform.setUpdateTime(new Date());
        count = financePlatformMapper.insert(financePlatform);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("平台资金记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，平台资金记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editPlatform 
     * @Description: TODO(修改平台资金记录) 
     * @param @param financePlatform
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PlatformList_edit")
    public Object editPlatform(FinancePlatform financePlatform) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financePlatform.setUpdater(pricipalUser.getUserId());
        financePlatform.setUpdateTime(new Date());
        count = financePlatformMapper.updateByPrimaryKeySelective(financePlatform);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("平台资金记录信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，平台资金记录信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditPlatform 
     * @Description: TODO(审核平台资金记录信息) 
     * @param @param financePlatform
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PlatformList_audit")
    public Object auditPlatform(FinancePlatform financePlatform) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financePlatform.setAuditor(pricipalUser.getUserId());
        financePlatform.setAuditDate(new Date());
        financePlatform.setUpdater(pricipalUser.getUserId());
        financePlatform.setUpdateTime(new Date());
        count = financePlatformMapper.updateByPrimaryKeySelective(financePlatform);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financePlatform.getPlatformCode() + "] 平台资金记录信息已审核");
        } else {
            returnResult.setMsg("发生未知错误，平台资金记录信息审核失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delPlatform 
     * @Description: TODO(删除平台资金记录) 
     * @param @param financePlatformId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PlatformList_del")
    public Object delPlatform(List<String> financePlatformIds, List<String> platformNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (financePlatformIds.size() > 0) {
        	FinancePlatformExample financePlatformExample = new FinancePlatformExample();
        	financePlatformExample.createCriteria().andFinancePlatformIdIn(financePlatformIds);
            count = financePlatformMapper.deleteByExample(financePlatformExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(platformNames, ",") + " ]平台资金记录");
            } else {
                returnResult.setMsg("发生未知错误，平台资金记录信息删除失败");
            }
        }
        return returnResult;
    }
}