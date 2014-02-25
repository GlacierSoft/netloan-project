package com.glacier.netloan.service.member;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dao.member.MemberFinanceMapper;
import com.glacier.netloan.dto.query.member.MemberFinanceQueryDTO;
import com.glacier.netloan.entity.member.MemberFinance;
import com.glacier.netloan.entity.member.MemberFinanceExample;
import com.glacier.netloan.entity.member.MemberFinanceExample.Criteria;

@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class MemberFinanceService {
	
	@Autowired
	private MemberFinanceMapper memberFinanceMapper;
	
	/**
	 * @Title: getMemberFinance
	 * @Description: TODO(根据会员财务记录Id获取会员财务记录信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberFinance(String memberId) {
    	MemberFinance memberFinance = memberFinanceMapper.selectByPrimaryKey(memberId);
        return memberFinance;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员财务记录信息) 
     * @param @param pintegralr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(MemberFinanceQueryDTO memberFinanceQueryDTO,JqPager pintegralr) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberFinanceExample memberFinanceExample = new MemberFinanceExample();
        
        Criteria queryCriteria = memberFinanceExample.createCriteria();
        memberFinanceQueryDTO.setQueryCondition(queryCriteria);

        if (null != pintegralr.getPage() && null != pintegralr.getRows()) {// 设置排序信息
        	memberFinanceExample.setLimitStart((pintegralr.getPage() - 1) * pintegralr.getRows());
        	memberFinanceExample.setLimitEnd(pintegralr.getRows());
        }
        if (StringUtils.isNotBlank(pintegralr.getSort()) && StringUtils.isNotBlank(pintegralr.getOrder())) {// 设置排序信息
        	memberFinanceExample.setOrderByClause(pintegralr.getOrderBy("temp_member_finance_"));
        }
        List<MemberFinance>  memberFinances = memberFinanceMapper.selectByExample(memberFinanceExample); // 查询所有会员积分列表
        int total = memberFinanceMapper.countByExample(memberFinanceExample); // 查询总页数
        returnResult.setRows(memberFinances);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

}
