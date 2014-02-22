///*
// * @(#)MemberIntegralService.java
// * @author xichao.dong
// * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
// */
//package com.glacier.netloan.service.member;
//
//import java.util.Date;
//import java.util.List;
//
//import org.apache.commons.lang3.StringUtils;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.subject.Subject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.glacier.basic.util.CollectionsUtil;
//import com.glacier.basic.util.RandomGUID;
//import com.glacier.jqueryui.util.JqGridReturn;
//import com.glacier.jqueryui.util.JqPager;
//import com.glacier.jqueryui.util.JqReturnJson;
//import com.glacier.netloan.dao.member.MemberIntegralMapper;
//import com.glacier.netloan.dao.system.UserMapper;
//import com.glacier.netloan.entity.member.MemberIntegral;
//import com.glacier.netloan.entity.member.MemberIntegralExample;
//import com.glacier.netloan.entity.system.User;
//import com.glacier.netloan.util.MethodLog;
//
///** 
// * @ClassName: MemberIntegralService 
// * @Description: TODO(会员积分业务类) 
// * @author xichao.dong
// * @email 406592176@QQ.com
// * @date 2014-1-21 下午2:22:22  
// */
//@Service
//@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
//public class MemberIntegralService {
//
//	@Autowired
//    private MemberIntegralMapper integralMapper;
//
//	@Autowired
//    private UserMapper userMapper;
//	
//	/**
//	 * @Title: getLink 
//	 * @Description: TODO(根据会员积分Id获取会员积分信息) 
//	 * @param @param memberIntegralId
//	 * @param @return    设定文件 
//	 * @return Object    返回类型 
//	 * @throws
//	 */
//    public Object getLink(String memberIntegralId) {
//    	MemberIntegral memberIntegral = integralMapper.selectByPrimaryKey(memberIntegralId);
//        return memberIntegral;
//    }
//    
//    /**
//     * @Title: listAsGrid 
//     * @Description: TODO(获取所有会员积分信息) 
//     * @param @param pintegralr
//     * @param @return    设定文件 
//     * @return Object    返回类型 
//     * @throws
//     */
//    public Object listAsGrid(JqPager pintegralr) {
//        
//        JqGridReturn returnResult = new JqGridReturn();
//        MemberIntegralExample memberIntegralExample = new MemberIntegralExample();
//
//        if (null != pintegralr.getPage() && null != pintegralr.getRows()) {// 设置排序信息
//        	memberIntegralExample.setLimitStart((pintegralr.getPage() - 1) * pintegralr.getRows());
//        	memberIntegralExample.setLimitEnd(pintegralr.getRows());
//        }
//        if (StringUtils.isNotBlank(pintegralr.getSort()) && StringUtils.isNotBlank(pintegralr.getOrder())) {// 设置排序信息
//        	memberIntegralExample.setOrderByClause(pintegralr.getOrderBy("temp_website_integral_"));
//        }
//        List<MemberIntegral>  memberIntegrals = integralMapper.selectByExample(memberIntegralExample); // 查询所有会员积分列表
//        int total = integralMapper.countByExample(memberIntegralExample); // 查询总页数
//        returnResult.setRows(memberIntegrals);
//        returnResult.setTotal(total);
//        return returnResult;// 返回ExtGrid表
//    }
//
//    /**
//     * @Title: addLink 
//     * @Description: TODO(新增会员积分) 
//     * @param @param integral
//     * @param @return    设定文件 
//     * @return Object    返回类型 
//     * @throws
//     */
//    @Transactional(readOnly = false)
//    @MethodLog(opera = "LinkList_add")
//    public Object addLink(MemberIntegral integral) {
//    	
//        Subject pricipalSubject = SecurityUtils.getSubject();
//        User pricipalUser = (User) pricipalSubject.getPrincipal();
//        
//        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
//        MemberIntegralExample integralExample = new MemberIntegralExample();
//        int count = 0;
//        integral.setMemberIntegralId(RandomGUID.getRandomGUID());
//        integral.setCreater(pricipalUser.getUserId());
//        integral.setCreateTime(new Date());
//        integral.setUpdater(pricipalUser.getUserId());
//        integral.setUpdateTime(new Date())
//        integral.setUpdateTime(new Date());
//        count = integralMapper.insert(integral);
//        if (count == 1) {
//            returnResult.setSuccess(true);
//            returnResult.setMsg("[" + integral.getWebLinkName() + "] 会员积分信息已保存");
//        } else {
//            returnResult.setMsg("发生未知错误，会员积分信息保存失败");
//        }
//        return returnResult;
//    }
//    
//    /**
//     * @Title: editLink 
//     * @Description: TODO(修改会员积分) 
//     * @param @param integral
//     * @param @return    设定文件 
//     * @return Object    返回类型 
//     * @throws
//     */
//    @Transactional(readOnly = false)
//    @MethodLog(opera = "LinkList_edit")
//    public Object editLink(MemberIntegral integral) {
//        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
//        MemberIntegralExample integralExample = new MemberIntegralExample();
//        int count = 0;
//        // 防止会员积分主题重复
//        integralExample.createCriteria().andWebLinkIdNotEqualTo(integral.getWebLinkId()).andWebLinkNameEqualTo(integral.getWebLinkName());
//        count = integralMapper.countByExample(integralExample);// 查找相同主题的会员积分数量
//        if (count > 0) {
//            returnResult.setMsg("会员积分主题重复");
//            return returnResult;
//        }
//        Subject pricipalSubject = SecurityUtils.getSubject();
//        User pricipalUser = (User) pricipalSubject.getPrincipal();
//        integral.setUpdater(pricipalUser.getUserId());
//        integral.setUpdateTime(new Date());
//        count = integralMapper.updateByPrimaryKeySelective(integral);
//        if (count == 1) {
//            returnResult.setSuccess(true);
//            returnResult.setMsg("[" + integral.getWebLinkName() + "] 会员积分信息已修改");
//        } else {
//            returnResult.setMsg("发生未知错误，会员积分信息修改失败");
//        }
//        return returnResult;
//    }
//    
//    /**
//     * @Title: delLink 
//     * @Description: TODO(删除会员积分) 
//     * @param @param memberIntegralIds
//     * @param @param integralNames
//     * @param @return    设定文件 
//     * @return Object    返回类型 
//     * @throws
//     */
//    @Transactional(readOnly = false)
//    @MethodLog(opera = "LinkList_del")
//    public Object delLink(List<String> memberIntegralIds, List<String> webLinkNames) {
//        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
//        int count = 0;
//        if (memberIntegralIds.size() > 0) {
//        	MemberIntegralExample integralExample = new MemberIntegralExample();
//        	integralExample.createCriteria().andWebLinkIdIn(memberIntegralIds);
//            count = integralMapper.deleteByExample(integralExample);
//            if (count > 0) {
//                returnResult.setSuccess(true);
//                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(webLinkNames, ",") + " ]会员积分");
//            } else {
//                returnResult.setMsg("发生未知错误，会员积分信息删除失败");
//            }
//        }
//        return returnResult;
//    }
//}
