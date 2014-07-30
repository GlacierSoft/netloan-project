/*
 * @(#)MemberApplyAmountService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.member;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.member.MemberApplyAmountMapper;
import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dao.member.MemberMessageNoticeMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.member.MemberApplyAmountQueryDTO;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberApplyAmount;
import com.glacier.netloan.entity.member.MemberApplyAmountExample;
import com.glacier.netloan.entity.member.MemberApplyAmountExample.Criteria;
import com.glacier.netloan.entity.member.MemberMessageNotice;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: MemberApplyAmountService 
 * @Description: TODO(会员申请额度业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MemberApplyAmountService {

	@Autowired
    private MemberApplyAmountMapper applyAmountMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private MemberMessageNoticeMapper memberMessageNoticeMapper;
	
	@Autowired
	private MemberMapper memberMapper;
	
	//对申请额度的添加公共方法
	public int insertMemberApplyAmount(MemberApplyAmount applyAmount){
        Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
		
		UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo("admin");
        List<User> users = userMapper.selectByExample(userExample);
        
        //对申请额度赋值
        applyAmount.setApplyAmountId(RandomGUID.getRandomGUID());
        applyAmount.setMemberId(pricipalMember.getMemberId());
        applyAmount.setOriginalAmount(pricipalMember.getCreditamount());
        applyAmount.setAuditState("authstr");
        applyAmount.setApplyDate(new Date());
        applyAmount.setCreater(users.get(0).getUserId());
        applyAmount.setCreateTime(new Date());
        applyAmount.setUpdater(users.get(0).getUserId());
        applyAmount.setUpdateTime(new Date());
        
		return applyAmountMapper.insert(applyAmount);
	}
	
	/**
	 * @Title: addApplyAmountReception 
	 * @Description: TODO(前台会员申请额度功能) 
	 * @param  @param applyAmount
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	@Transactional(readOnly = false)
    public Object addApplyAmountReception(MemberApplyAmount applyAmount) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        
        //先取出该会员所关联的申请额度数据(List集合)
        MemberApplyAmountExample memberApplyAmountExample = new MemberApplyAmountExample();
        memberApplyAmountExample.createCriteria().andMemberIdEqualTo(pricipalMember.getMemberId());
        List<MemberApplyAmount> memberApplyAmountList = applyAmountMapper.selectByExample(memberApplyAmountExample);
        
        //判断memberApplyAmountList集合中数据是否大于0
        if(memberApplyAmountList.size()>0){//已经申请过额度
        	//判断最后一次申请额度离现在是否有30天
            MemberApplyAmount memberApplyAmount = applyAmountMapper.selectMaxCreatTime(pricipalMember.getMemberId());
            Date lastCreateTime = memberApplyAmount.getCreateTime();
            Date nowDate = new Date();
            long between = 0;
            between = nowDate.getTime() - lastCreateTime.getTime();
            long day = between / (24 * 60 * 60 * 1000);
            //如果申请额度时间大于30天就进入此方法
            if(day >30){
            	int count = 0;
    	        count = insertMemberApplyAmount(applyAmount);//调用增加申请额度方法
    	        if (count == 1) {
    	            returnResult.setSuccess(true);
    	            returnResult.setMsg("申请额度信息已提交审核");
    	        } else {
    	            returnResult.setMsg("发生未知错误，申请额度信息提交审核失败");
    	        }
            }else{//如果申请额度时间小于30天，则不能再申请
            	returnResult.setMsg("一个月内不能重复申请额度");
            }
        }else {//数据等于0表示改用户从没申请过额度
        	int count = 0;
	        count = insertMemberApplyAmount(applyAmount);//调用增加申请额度方法
	        if (count == 1) {
	            returnResult.setSuccess(true);
	            returnResult.setMsg("申请额度信息已提交审核");
	        } else {
	            returnResult.setMsg("发生未知错误，申请额度信息提交审核失败");
	        }
		}
        
        return returnResult;
    }
	
	/**
   	 * @Title: addMessageNotice 
   	 * @Description: TODO(对审核认证后添加相对应的信息通知) 
   	 * @param  @param memberMessageNotice
   	 * @param  @return设定文件
   	 * @return int  返回类型
   	 * @throws 
   	 *
   	 */
   	public int addMessageNotice(MemberMessageNotice memberMessageNotice,String memberId){
   		//获取当前登录用户
   		Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        //为信息通知对象设置值
   		memberMessageNotice.setMessageNoticeId(RandomGUID.getRandomGUID());
   		memberMessageNotice.setSender(pricipalUser.getUserId());
   		memberMessageNotice.setAddressee(memberId);
        memberMessageNotice.setSendtime(new Date());
        memberMessageNotice.setLetterstatus("unread");
        memberMessageNotice.setLettertype("system");
        memberMessageNotice.setCreater(pricipalUser.getUserId());
        memberMessageNotice.setCreateTime(new Date());
        memberMessageNotice.setUpdater(pricipalUser.getUserId());
        memberMessageNotice.setUpdateTime(new Date());
        int count = memberMessageNoticeMapper.insert(memberMessageNotice);
        return count;
   	}
   	/**
   	 * @Title: listAsWebsite 
   	 * @Description: TODO(前台的分页功能) 
   	 * @param  @param pager
   	 * @param  @param p
   	 * @param  @return设定文件
   	 * @return Object  返回类型
   	 * @throws 
   	 *
   	 */
	public Object listAsWebsite(JqPager pager, int p) {
    	JqGridReturn returnResult = new JqGridReturn();
    	MemberApplyAmountExample memberApplyAmountExample = new MemberApplyAmountExample();
    	//获取当前登录用户
    	Subject pricipalSubject = SecurityUtils.getSubject();
    	Member pricipalMember = (Member) pricipalSubject.getPrincipal();
    	//查询所属会员个人的额度申请列表
    	memberApplyAmountExample.createCriteria().andMemberIdEqualTo(pricipalMember.getMemberId());
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	memberApplyAmountExample.setOrderByClause(pager.getOrderBy("temp_member_apply_amount_"));
        }
        int showPageNum = 5;
        int startTemp = ((p-1)*showPageNum);//根据前台返回的页数进行设置
        memberApplyAmountExample.setLimitStart(startTemp);
        memberApplyAmountExample.setLimitEnd(showPageNum);
        List<MemberApplyAmount>  memberApplyAmounts = applyAmountMapper.selectByExample(memberApplyAmountExample); // 查询所有公告列表
        
        int total = applyAmountMapper.countByExample(memberApplyAmountExample); // 查询总页数
        returnResult.setRows(memberApplyAmounts);
        returnResult.setTotal(total);
        returnResult.setP(p);
        Map<String,Object> integralMap = new HashMap<String,Object>();
        integralMap.put("returnResult", returnResult);
        return integralMap;// 返回ExtGrid表
    }

	/**
	 * @Title: getApplyAmount
	 * @Description: TODO(根据会员申请额度Id获取会员申请额度信息) 
	 * @param @param memberApplyAmountId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getApplyAmount(String applyAmountId) {
    	MemberApplyAmount memberApplyAmount = applyAmountMapper.selectByPrimaryKey(applyAmountId);
        return memberApplyAmount;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员申请额度信息) 
     * @param @param papplyAmountr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(MemberApplyAmountQueryDTO memberApplyAmountQueryDTO, JqPager applyAmount) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberApplyAmountExample memberApplyAmountExample = new MemberApplyAmountExample();

        Criteria queryCriteria = memberApplyAmountExample.createCriteria();
        memberApplyAmountQueryDTO.setQueryCondition(queryCriteria);
        
        if (null != applyAmount.getPage() && null != applyAmount.getRows()) {// 设置排序信息
        	memberApplyAmountExample.setLimitStart((applyAmount.getPage() - 1) * applyAmount.getRows());
        	memberApplyAmountExample.setLimitEnd(applyAmount.getRows());
        }
        if (StringUtils.isNotBlank(applyAmount.getSort()) && StringUtils.isNotBlank(applyAmount.getOrder())) {// 设置排序信息
        	memberApplyAmountExample.setOrderByClause(applyAmount.getOrderBy("temp_member_apply_amount_"));
        }
        List<MemberApplyAmount>  memberApplyAmounts = applyAmountMapper.selectByExample(memberApplyAmountExample); // 查询所有会员积分列表
        int total = applyAmountMapper.countByExample(memberApplyAmountExample); // 查询总页数
        returnResult.setRows(memberApplyAmounts);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addApplyAmount 
     * @Description: TODO(新增会员申请额度) 
     * @param @param applyAmount
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ApplyAmountList_add")
    public Object addApplyAmount(MemberApplyAmount applyAmount) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        applyAmount.setApplyAmountId(RandomGUID.getRandomGUID());
        applyAmount.setCreater(pricipalUser.getUserId());
        applyAmount.setCreateTime(new Date());
        applyAmount.setUpdater(pricipalUser.getUserId());
        applyAmount.setUpdateTime(new Date());
        count = applyAmountMapper.insert(applyAmount);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("申请额度信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，申请额度信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditApplyAmount 
     * @Description: TODO(审核会员审核额度) 
     * @param @param applyAmount
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ApplyAmounts_audit")
    public Object auditApplyAmount(MemberApplyAmount applyAmount) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    
        Subject pricipalSubject = SecurityUtils.getSubject();// 查找当前系统登录用户
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        applyAmount.setUpdater(pricipalUser.getUserId());// 更新人为当前系统登录用户
        applyAmount.setUpdateTime(new Date());// 更新时间为当前系统时间
        applyAmount.setAuditorId(pricipalUser.getUserId());// 审核人为当前系统登录用户
        applyAmount.setAuditDate(new Date());// 审核时间为当前系统时间
        if(applyAmount.getAuditState().equals("authstr")||applyAmount.getAuditState().equals("noapply")){
        	returnResult.setMsg("无效的操作，请选择审核状态！");
        	return returnResult;
        } 
        MemberApplyAmount mem=applyAmountMapper.selectByPrimaryKey(applyAmount.getApplyAmountId());
        if(mem.getAuditState().equals("authstr")==false){ //如果数据库的该条记录状态不是审核中的，就说明该记录已经审核了，不能继续操作
        	returnResult.setMsg("该申请记录已进行过审核操作");
        	return returnResult;
        } 
        //审核额度不能大于申请额度
        if(applyAmount.getAuthorizedAmount()>applyAmount.getApplyMoney()){
        	returnResult.setMsg("审核额度不能大于申请额度！");
        	return returnResult;
        } 
        if (StringUtils.isNotBlank(applyAmount.getAuditState())) {// 如果审核状态为非“通过”，则审核金额为零
        	if (!applyAmount.getAuditState().equals("pass")) {
        		applyAmount.setAuthorizedAmount((float) 0.00);
        	}
        } 
        int count = 0;
        count = applyAmountMapper.updateByPrimaryKeySelective(applyAmount); 
        //创建信息通知对象
        MemberMessageNotice memberMessageNotice = new MemberMessageNotice();
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员审核额度成功");
            Member member = (Member) memberMapper.selectByPrimaryKey(applyAmount.getMemberId());
            member.setCreditamount(applyAmount.getAuthorizedAmount());
            memberMapper.updateByPrimaryKeySelective(member);
            if(applyAmount.getAuditState().equals("pass")){
  				memberMessageNotice.setTitle("会员申请额度审核通知");
  	  			memberMessageNotice.setContent("您的申请额度金额为["+applyAmount.getApplyMoney()+"]，审核状态:[通过],通过金额为["+applyAmount.getAuthorizedAmount()+"]");
  			}else if(applyAmount.getAuditState().equals("failure")){
  				memberMessageNotice.setTitle("会员申请额度审核通知");
  	  			memberMessageNotice.setContent("您的申请额度金额为["+applyAmount.getApplyMoney()+"]，审核状态:[不通过]");
  			}
  			this.addMessageNotice(memberMessageNotice,applyAmount.getMemberId());
        } else {
            returnResult.setMsg("发生未知错误，会员审核额度失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: getApplyAmountNumByAuditState 
     * @Description: TODO(根据会员申请额度状态查找该状态下的记录条数) 
     * @param  @param auditState
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getApplyAmountNumByAuditState(String auditState) {
        MemberApplyAmountExample memberApplyAmountExample = new MemberApplyAmountExample();
        memberApplyAmountExample.createCriteria().andAuditStateEqualTo(auditState);
        int applyAmountNum = applyAmountMapper.countByExample(memberApplyAmountExample);
        return applyAmountNum;
    }
}
