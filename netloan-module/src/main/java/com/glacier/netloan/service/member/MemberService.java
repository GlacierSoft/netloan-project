package com.glacier.netloan.service.member;

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
import com.glacier.netloan.dao.member.MemberAuthMapper;
import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dao.member.MemberWorkMapper;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberAuthExample;
import com.glacier.netloan.entity.member.MemberAuthWithBLOBs;
import com.glacier.netloan.entity.member.MemberExample;
import com.glacier.netloan.entity.member.MemberExample.Criteria;
import com.glacier.netloan.entity.member.MemberWork;
import com.glacier.netloan.entity.member.MemberWorkExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: MemberService 
 * @Description: TODO(会员表业务类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-20下午5:23:09
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private MemberWorkMapper memberWorkMapper;
	
	@Autowired
	private MemberAuthMapper memberAuthMapper;
	
	/**
	 * @Title: getMember 
	 * @Description: TODO(根据会员Id获取会员信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMember(String memberId) {
    	Member member = memberMapper.selectByPrimaryKey(memberId);
        return member;
    }
    /**
	 * @Title: getMemberWork 
	 * @Description: TODO(根据会员Id获取会员工作信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberWork(String memberId) {
    	MemberWork memberWork = memberWorkMapper.selectByPrimaryKey(memberId);
        return memberWork;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(MemberQueryDTO memberQueryDTO,JqPager pager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberExample memberExample = new MemberExample();;
        
        Criteria queryCriteria = memberExample.createCriteria();
        memberQueryDTO.setQueryCondition(queryCriteria);

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	memberExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	memberExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	memberExample.setOrderByClause(pager.getOrderBy("temp_member_"));
        }
        List<Member>  members = memberMapper.selectByExample(memberExample); // 查询所有会员列表
        int total = memberMapper.countByExample(memberExample); // 查询总页数
        returnResult.setRows(members);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addMemberandWorkandAuth 
     * @Description: TODO(新增会员,工作，认证) 
     * @param @param member
     * @param @param memberWork
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_add")
    public Object addMemberandWorkandAuth(Member member,MemberWork memberWork) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        MemberExample memberExample = new MemberExample();
        int count = 0;
        int countWork = 0;
        String memberId = RandomGUID.getRandomGUID();
        // 防止会员名称重复
        memberExample.createCriteria().andMemberNameEqualTo(member.getMemberName());
        count = memberMapper.countByExample(memberExample);// 查找相同名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员名称重复");
            return returnResult;
        }
        //增加会员信息
        if(member.getFirstContactRelation() == null || member.getFirstContactRelation().equals("")){
        	member.setFirstContactRelation("family");
        }
        if(member.getSecondContactRelation() == null || member.getSecondContactRelation().equals("")){
        	member.setSecondContactRelation("family");
        }
        
        member.setMemberId(memberId);
        member.setIntegral((float) 0);
        member.setCreditIntegral((float) 0);
        member.setRegistrationTime(new Date());
        member.setCreater(pricipalUser.getUserId());
        member.setCreateTime(new Date());
        member.setUpdater(pricipalUser.getUserId());
        member.setUpdateTime(new Date());
        count = memberMapper.insert(member);
        
        //增加会员工作信息
        memberWork.setMemberId(memberId);
        countWork = memberWorkMapper.insert(memberWork);
        
        //生成会员认证表信息
        MemberAuthWithBLOBs memberAuthWithBLOBs = new MemberAuthWithBLOBs();
        memberAuthWithBLOBs.setMemberId(memberId);
        memberAuthWithBLOBs.setInfoName("基本信息认证");
        memberAuthWithBLOBs.setInfoAuth("noapply");
        memberAuthWithBLOBs.setVipName("VIP认证");
        memberAuthWithBLOBs.setVipAuth("noapply");
        memberAuthWithBLOBs.setEmailName("邮箱认证");
        memberAuthWithBLOBs.setEmailAuth("noapply");
        memberAuthWithBLOBs.setMobileName("手机认证");
        memberAuthWithBLOBs.setMobileAuth("noapply");
        memberAuthWithBLOBs.setCreditName("信用认证");
        memberAuthWithBLOBs.setCreditAuth("noapply");
        memberAuthWithBLOBs.setCompanyName("企业认证");
        memberAuthWithBLOBs.setCompanyAuth("noapply");
        memberAuthWithBLOBs.setRealName("真实姓名认证");
        memberAuthWithBLOBs.setRealNameAuth("noapply");
        memberAuthWithBLOBs.setIdCardName("身份证认证");
        memberAuthWithBLOBs.setIdCardAuth("noapply");
        memberAuthWithBLOBs.setWorkName("工作认证");
        memberAuthWithBLOBs.setWorkAuth("noapply");
        memberAuthMapper.insert(memberAuthWithBLOBs);
        
        if (count == 1 && countWork == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + member.getMemberName() + "] 会员信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editMemberandWork 
     * @Description: TODO(修改会员，工作) 
     * @param @param member
     * @param @param memberWork
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_edit")
    public Object editMemberandWork(Member member,MemberWork memberWork) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        MemberExample memberExample = new MemberExample();
        int count = 0;
        int countWork = 0;
        // 防止会员名称重复
        memberExample.createCriteria().andMemberIdNotEqualTo(member.getMemberId()).andMemberNameEqualTo(member.getMemberName());
        count = memberMapper.countByExample(memberExample);// 查找相同名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员名称重复");
            return returnResult;
        }
        
        //会员表的修改
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        member.setUpdater(pricipalUser.getUserId());
        member.setUpdateTime(new Date());
        count = memberMapper.updateByPrimaryKeySelective(member);
        
        //工作表的修改
        countWork = memberWorkMapper.updateByPrimaryKeySelective(memberWork);

        if (count == 1 && countWork == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + member.getMemberName() + "] 会员信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delMemberandWorkandAuth 
     * @Description: TODO(删除会员，工作，认证) 
     * @param @param memberIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_del")
    public Object delMemberandWorkandAuth(List<String> memberIds, List<String> memberNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        int countWork = 0;
        int countAuth = 0;
        if (memberIds.size() > 0) {
        	
            //工作表的删除
            MemberWorkExample memberWorkExample = new MemberWorkExample();
            memberWorkExample.createCriteria().andMemberIdIn(memberIds);
            countWork = memberWorkMapper.deleteByExample(memberWorkExample);
            
            //会员认证表的删除
            MemberAuthExample memberAuthExample = new MemberAuthExample();
            memberAuthExample.createCriteria().andMemberIdIn(memberIds);
            countAuth = memberAuthMapper.deleteByExample(memberAuthExample);
            
            //会员表的删除
        	MemberExample memberExample = new MemberExample();
        	memberExample.createCriteria().andMemberIdIn(memberIds);
            count = memberMapper.deleteByExample(memberExample);
            
            if (count > 0 && countWork >0 && countAuth > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(memberNames, ",") + " ]操作");
            } else {
                returnResult.setMsg("发生未知错误，会员信息删除失败");
            }
        }
        return returnResult;
    }

}
