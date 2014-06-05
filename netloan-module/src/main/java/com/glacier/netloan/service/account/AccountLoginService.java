package com.glacier.netloan.service.account;


import java.util.List;

import org.apache.commons.lang3.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dao.member.MemberWorkMapper;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;

import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberExample;
import com.glacier.netloan.entity.member.MemberWork;
import com.glacier.netloan.entity.member.MemberExample.Criteria;
import com.glacier.netloan.service.basicdatas.ParameterCreditService;


@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class AccountLoginService {
	 
	  @Autowired
	  private MemberMapper memberMapper;
	  
	  @Autowired
	  private MemberWorkMapper memberWorkMapper;
	  
	  @Autowired
	  private ParameterCreditService parameterCreditService;
	
	  //获取用户登录次数统计
	  public Object listAsGrid(JqPager jqPager, MemberQueryDTO memberQueryDTO, String q) {
	        
	        JqGridReturn returnResult = new JqGridReturn();
	        MemberExample memberExample = new MemberExample();;
	        
	        Criteria queryCriteria = memberExample.createCriteria();
	        memberQueryDTO.setQueryCondition(queryCriteria, q);

	        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	        	memberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	        	memberExample.setLimitEnd(jqPager.getRows());
	        }
	        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	        	memberExample.setOrderByClause(jqPager.getOrderBy("temp_member_"));
	        }
	        List<Member>  members = memberMapper.selectByExample(memberExample); // 查询所有会员列表
	        int total = memberMapper.countByExample(memberExample); // 查询总页数
	        returnResult.setRows(members);
	        returnResult.setTotal(total);
	        return returnResult;// 返回ExtGrid表
	    }
	  
	   //获取用户登录对象
	   public Object getMember(String memberId) {
	    	Member member = memberMapper.selectByPrimaryKey(memberId);
	    	//查询基础信用积分的所有数据
	        List<ParameterCredit> parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
	        //通过嵌套for循环，将会员的信用图标加到会员对象中去
	        	for(ParameterCredit parameterCredit : parameterCredits){
	    			if(member.getCreditIntegral() >= parameterCredit.getCreditBeginIntegral() && member.getCreditIntegral() < parameterCredit.getCreditEndIntegral()){
	    				member.setCreditPhoto(parameterCredit.getCreditPhoto());
	        			break;
	        		}	
	        	}
	        return member;
	    }
	   
	    public Object getMemberWork(String memberId) {
	    	MemberWork memberWork = memberWorkMapper.selectByPrimaryKey(memberId);
	        return memberWork;
	    }
	   
	   
	  
}
