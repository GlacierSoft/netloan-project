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
import com.glacier.netloan.dao.finance.FinanceMemberMapper;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinanceMemberExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: FinanceMemberService 
 * @Description: TODO(会员资金记录service层) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceMemberService {
	
	@Autowired
	private FinanceMemberMapper financeMemberMapper;

	/**
	 * @Title: getMember 
	 * @Description: TODO(根据会员资金记录Id获取会员资金记录信息) 
	 * @param @param financeMemberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMember(String financeMemberId) {
    	FinanceMember financeMember = financeMemberMapper.selectByPrimaryKey(financeMemberId);
        return financeMember;
    }
    /**
	 * @Title: getMemberByMemberId 
	 * @Description: TODO(根据会员Id获取会员资金记录信息) 
	 * @param @param financeMemberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberByMemberId(String memberId) {
    	FinanceMemberExample financeMemberExample = new FinanceMemberExample();
    	financeMemberExample.createCriteria().andMemberIdEqualTo(memberId);
    	List<FinanceMember>  financeMembers = financeMemberMapper.selectByExample(financeMemberExample); 
        return financeMembers.get(0);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员资金记录信息) 
     * @param @param pfinanceMemberr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceMemberExample financeMemberExample = new FinanceMemberExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeMemberExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeMemberExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeMemberExample.setOrderByClause(pager.getOrderBy("temp_finance_member_"));
        }
        List<FinanceMember>  financeMembers = financeMemberMapper.selectByExample(financeMemberExample); // 查询所有会员资金记录列表
        int total = financeMemberMapper.countByExample(financeMemberExample); // 查询总页数
        returnResult.setRows(financeMembers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addMember 
     * @Description: TODO(新增会员资金记录) 
     * @param @param financeMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addMember(FinanceMember financeMember) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
       
        financeMember.setFinanceMemberId(RandomGUID.getRandomGUID());
        financeMember.setCreater(pricipalUser.getUserId());
        financeMember.setCreateTime(new Date());
        financeMember.setUpdater(pricipalUser.getUserId());
        financeMember.setUpdateTime(new Date());
        count = financeMemberMapper.insert(financeMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员资金记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员资金记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editMember 
     * @Description: TODO(修改会员资金记录) 
     * @param @param financeMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_edit")
    public Object editMember(FinanceMember financeMember) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeMember.setUpdater(pricipalUser.getUserId());
        financeMember.setUpdateTime(new Date());
        count = financeMemberMapper.updateByPrimaryKeySelective(financeMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员资金记录信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员资金记录信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditMember 
     * @Description: TODO(审核会员资金记录信息) 
     * @param @param financeMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_audit")
    public Object auditMember(FinanceMember financeMember) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeMember.setUpdater(pricipalUser.getUserId());
        financeMember.setUpdateTime(new Date());
        count = financeMemberMapper.updateByPrimaryKeySelective(financeMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeMember.getMemberId() + "] 会员资金记录信息已审核");
        } else {
            returnResult.setMsg("发生未知错误，会员资金记录信息审核失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delMember 
     * @Description: TODO(删除会员资金记录) 
     * @param @param financeMemberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_del")
    public Object delMember(List<String> financeMemberIds, List<String> memberCodes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (financeMemberIds.size() > 0) {
        	FinanceMemberExample financeMemberExample = new FinanceMemberExample();
        	financeMemberExample.createCriteria().andFinanceMemberIdIn(financeMemberIds);
            count = financeMemberMapper.deleteByExample(financeMemberExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(memberCodes, ",") + " ]会员资金记录");
            } else {
                returnResult.setMsg("发生未知错误，会员资金记录信息删除失败");
            }
        }
        return returnResult;
    }
}