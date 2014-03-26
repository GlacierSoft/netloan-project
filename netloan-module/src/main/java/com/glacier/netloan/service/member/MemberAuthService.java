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

import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.member.MemberAuthMapper;
import com.glacier.netloan.dao.member.MemberCreditIntegralMapper;
import com.glacier.netloan.dao.member.MemberIntegralMapper;
import com.glacier.netloan.dto.query.member.MemberAuthQueryDTO;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberAuth;
import com.glacier.netloan.entity.member.MemberAuthExample;
import com.glacier.netloan.entity.member.MemberCreditIntegral;
import com.glacier.netloan.entity.member.MemberAuthExample.Criteria;
import com.glacier.netloan.entity.member.MemberAuthWithBLOBs;
import com.glacier.netloan.entity.member.MemberIntegral;
import com.glacier.netloan.entity.system.User;

@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class MemberAuthService {
	
	@Autowired
	private MemberAuthMapper memberAuthMapper;
	
	@Autowired
	private MemberCreditIntegralMapper memberCreditIntegralMapper;
	
	/**
	 * @Title: getMemberAuth 
	 * @Description: TODO(根据会员认证Id获取会员认证信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberAuth(String memberId) {
    	MemberAuth memberAuth = memberAuthMapper.selectByPrimaryKey(memberId);
        return memberAuth;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员认证信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
   	public Object listAsGrid(MemberAuthQueryDTO memberAuthQueryDTO,JqPager pager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberAuthExample memberAuthExample = new MemberAuthExample();;
        
        Criteria queryCriteria = memberAuthExample.createCriteria();
        memberAuthQueryDTO.setQueryCondition(queryCriteria);

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	memberAuthExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	memberAuthExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	memberAuthExample.setOrderByClause(pager.getOrderBy("temp_member_auth_"));
        }
        List<MemberAuth>  memberAuths = memberAuthMapper.selectByExample(memberAuthExample); // 查询所有会员认证列表
        int total = memberAuthMapper.countByExample(memberAuthExample); // 查询总页数
        returnResult.setRows(memberAuths);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
   	
   	/**
   	 * @Title: editMemberAuth 
   	 * @Description: TODO(修改会员认证) 
   	 * @param  @param memberAuth
   	 * @param  @return设定文件
   	 * @return Object  返回类型
   	 * @throws 
   	 *
   	 */
/*   	@Transactional(readOnly = false)
	public Object editMemberAuth(MemberAuthWithBLOBs memberAuthWithBLOBs) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;

		Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        memberAuthWithBLOBs.setInfoTime(new Date());
        memberAuthWithBLOBs.setInfoAuditor(pricipalUser.getUserId());
     
        count = memberAuthMapper.updateByPrimaryKeySelective(memberAuthWithBLOBs);
        
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + memberAuthWithBLOBs.getMemberName() + "]会员认证信息审核成功");
        } else {
            returnResult.setMsg("发生未知错误，会员认证信息审核失败");
        }
        
		return returnResult;
	}*/
   	@Transactional(readOnly = false)
	public Object editMemberAuthAndAddCredit(MemberAuthWithBLOBs memberAuthWithBLOBs,MemberCreditIntegral memberCreditIntegral) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		int creditCount = 0;

		Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        //新增会员信用积分。
        String creditIntegralId = RandomGUID.getRandomGUID();
        memberCreditIntegral.setCreditIntegralId(creditIntegralId);
        memberCreditIntegral.setCreater(pricipalUser.getUserId());
        memberCreditIntegral.setCreateTime(new Date());
        memberCreditIntegral.setUpdater(pricipalUser.getUserId());
        memberCreditIntegral.setUpdateTime(new Date());
        
        creditCount = memberCreditIntegralMapper.insert(memberCreditIntegral);
        
        String IntegralType = memberCreditIntegral.getIntegralType();
        if(IntegralType.equals("infoAuth")){
        	memberAuthWithBLOBs.setInfoTime(new Date());
            memberAuthWithBLOBs.setInfoAuditor(pricipalUser.getUserId());
        }else if(IntegralType.equals("vipAuth")){
        	memberAuthWithBLOBs.setVipAuditor(pricipalUser.getUserId());
        	memberAuthWithBLOBs.setVipTime(new Date());
        }else if(IntegralType.equals("emailAuth")){
        	memberAuthWithBLOBs.setEmailAuditor(pricipalUser.getUserId());
        	memberAuthWithBLOBs.setEmailTime(new Date());
        }else if(IntegralType.equals("mobileAuth")){
        	memberAuthWithBLOBs.setMobileAuditor(pricipalUser.getUserId());
        	memberAuthWithBLOBs.setMobileTime(new Date());
        }else if(IntegralType.equals("creditAuth")){
        	memberAuthWithBLOBs.setCreditAuditor(pricipalUser.getUserId());
        	memberAuthWithBLOBs.setCreditTime(new Date());
        }else if(IntegralType.equals("companyAuth")){
        	memberAuthWithBLOBs.setCompanyAuditor(pricipalUser.getUserId());
        	memberAuthWithBLOBs.setCompanyTime(new Date());
        }else if(IntegralType.equals("realNameAuth")){
        	memberAuthWithBLOBs.setRealNameAuditor(pricipalUser.getUserId());
        	memberAuthWithBLOBs.setRealNameTime(new Date());
        }else if(IntegralType.equals("idCardAuth")){
        	memberAuthWithBLOBs.setIdCardAuditor(pricipalUser.getUserId());
        	memberAuthWithBLOBs.setIdCardTime(new Date());
        }else if(IntegralType.equals("workAuth")){
        	memberAuthWithBLOBs.setWorkAuditor(pricipalUser.getUserId());
        	memberAuthWithBLOBs.setWorkTime(new Date());
        }
        //修改会员认证
        count = memberAuthMapper.updateByPrimaryKeySelective(memberAuthWithBLOBs);
        
        if (count == 1 && creditCount == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + memberAuthWithBLOBs.getMemberName() + "]会员认证信息审核成功");
        } else {
            returnResult.setMsg("发生未知错误，会员认证信息审核失败");
        }
        
		return returnResult;
	}
   	/**
   	 * @Title: editMemberAuthReception 
   	 * @Description: TODO(前台修改会员认证) 
   	 * @param  @param memberAuth
   	 * @param  @return设定文件
   	 * @return Object  返回类型
   	 * @throws 
   	 *
   	 */
   	@Transactional(readOnly = false)
	public Object editMemberAuthReception(MemberAuthWithBLOBs memberAuthWithBLOBs) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;

		Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        
        memberAuthWithBLOBs.setInfoTime(new Date());
        memberAuthWithBLOBs.setInfoAuditor(pricipalMember.getMemberId());
     
        count = memberAuthMapper.updateByPrimaryKeySelective(memberAuthWithBLOBs);
        
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setObj(memberAuthWithBLOBs);
            returnResult.setMsg("[" + memberAuthWithBLOBs.getMemberName() + "]会员认证资料已上传");
        } else {
            returnResult.setMsg("发生未知错误，会员认证资料已上传");
        }
        
		return returnResult;
	}
   
}
