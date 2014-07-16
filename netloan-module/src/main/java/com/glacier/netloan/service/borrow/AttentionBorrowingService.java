package com.glacier.netloan.service.borrow;

import java.util.ArrayList;
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
import com.glacier.netloan.dao.borrow.AttentionBorrowingMapper;
import com.glacier.netloan.dao.borrow.BorrowingLoanMapper;
import com.glacier.netloan.dto.query.borrow.AttentionBorrowingQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.borrow.AttentionBorrowing;
import com.glacier.netloan.entity.borrow.AttentionBorrowingExample; 
import com.glacier.netloan.entity.borrow.AttentionBorrowingExample.Criteria;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.basicdatas.ParameterCreditService;

/**
 * @ClassName: AttentionBorrowingService 
 * @Description: TODO(关注借款业务层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-20下午5:28:30
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class AttentionBorrowingService {
	@Autowired
	private AttentionBorrowingMapper attentionBorrowingMapper;
	
	@Autowired
	private BorrowingLoanMapper borrowingLoanMapper;
	
	@Autowired
	private ParameterCreditService parameterCreditService;
	
	/**
	 * @Title: getAttentionBorrowing 
	 * @Description: TODO(根据关注借款Id获取关注借款信息) 
	 * @param @param attentionBorrowingId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getAttentionBorrowing(String attentionBorrowingId) {
    	AttentionBorrowing attentionBorrowing = attentionBorrowingMapper.selectByPrimaryKey(attentionBorrowingId);
        return attentionBorrowing;
    }
    /**
     * @Title: listAsGridWebsite 
     * @Description: TODO(前台关注借款列表) 
     * @param  @param jqPager
     * @param  @param borrowingLoanQueryDTO
     * @param  @param pagetype
     * @param  @param p
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @SuppressWarnings("unchecked")
	public Object listAsGridWebsite(AttentionBorrowingQueryDTO attentionBorrowingQueryDTO,JqPager jqPager,int p,String memberId) {
        
        JqGridReturn returnResult = new JqGridReturn();
        AttentionBorrowingExample attentionBorrowingExample = new AttentionBorrowingExample();
        Criteria queryCriteria = attentionBorrowingExample.createCriteria();
        
        attentionBorrowingQueryDTO.setQueryCondition(queryCriteria);//根据dto,进行查询
        
        if(memberId != null){
        	queryCriteria.andMemberIdEqualTo(memberId);//查询相对应的还款人的关注借款
        } 
        jqPager.setSort("createTime");// 定义排序字段
        jqPager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	attentionBorrowingExample.setOrderByClause(jqPager.getOrderBy("temp_attention_borrowing_"));
        } 
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        attentionBorrowingExample.setLimitStart(startTemp);
        attentionBorrowingExample.setLimitEnd(10);
        List<AttentionBorrowing>  attentionBorrowings = attentionBorrowingMapper.selectByExample(attentionBorrowingExample); // 查询所有借款列表
        //查询基础信用积分的所有数据
        List<ParameterCredit> parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
        List<AttentionBorrowing> allAttentionBorrowings = new ArrayList<AttentionBorrowing>();//定义一个空的收款列表
        //通过嵌套for循环，将会员的信用图标加到关注借款对象中去
        for(AttentionBorrowing attentionBorrowing : attentionBorrowings){
        	for(ParameterCredit parameterCredit : parameterCredits){
    			if(attentionBorrowing.getCreditIntegral() >= parameterCredit.getCreditBeginIntegral() && attentionBorrowing.getCreditIntegral() < parameterCredit.getCreditEndIntegral()){
    				attentionBorrowing.setCreditPhoto(parameterCredit.getCreditPhoto());
        			break;
        		}	
        	}
        	allAttentionBorrowings.add(attentionBorrowing);
        } 
        int total = attentionBorrowingMapper.countByExample(attentionBorrowingExample); // 查询总页数
        returnResult.setRows(allAttentionBorrowings);//设置查询数据
        returnResult.setTotal(total);//设置总条数
        returnResult.setP(p);//设置当前页
        return returnResult;// 返回ExtGrid表
    }
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有关注借款信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager,AttentionBorrowingQueryDTO attentionBorrowingQueryDTO) {
        
        JqGridReturn returnResult = new JqGridReturn();
        AttentionBorrowingExample attentionBorrowingExample = new AttentionBorrowingExample();
        
        Criteria queryCriteria = attentionBorrowingExample.createCriteria();
        attentionBorrowingQueryDTO.setQueryCondition(queryCriteria);

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	attentionBorrowingExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	attentionBorrowingExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	attentionBorrowingExample.setOrderByClause(pager.getOrderBy("temp_attention_borrowing_"));
        }
        List<AttentionBorrowing>  attentionBorrowings = attentionBorrowingMapper.selectByExample(attentionBorrowingExample); // 查询所有关注借款列表
        int total = attentionBorrowingMapper.countByExample(attentionBorrowingExample); // 查询总页数
        returnResult.setRows(attentionBorrowings);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addAttentionBorrowing 
     * @Description: TODO(新增关注借款) 
     * @param @param attentionBorrowing
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addAttentionBorrowing(AttentionBorrowing attentionBorrowing) {
    	
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        
        AttentionBorrowingExample attentionBorrowingExample = new AttentionBorrowingExample();
        attentionBorrowingExample.createCriteria().andLoanIdEqualTo(attentionBorrowing.getLoanId())
        										.andMemberIdEqualTo(attentionBorrowing.getMemberId());
        count = attentionBorrowingMapper.countByExample(attentionBorrowingExample);// 查询是否已经关注此借款
        if (count > 0) {
            returnResult.setMsg("您已经关注此借款！");
            return returnResult;
        }
        
        attentionBorrowing.setAttentionBorrowingId(RandomGUID.getRandomGUID());
        attentionBorrowing.setCreater(pricipalMember.getMemberId());
        attentionBorrowing.setCreateTime(new Date());
        attentionBorrowing.setUpdater(pricipalMember.getMemberId());
        attentionBorrowing.setUpdateTime(new Date());
        count = attentionBorrowingMapper.insert(attentionBorrowing);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setObj(attentionBorrowing);
            returnResult.setMsg("关注借款信息成功");
        } else {
            returnResult.setMsg("发生未知错误，关注借款信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editAttentionBorrowing 
     * @Description: TODO(修改关注借款) 
     * @param @param attentionBorrowing
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editAttentionBorrowing(AttentionBorrowing attentionBorrowing) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        count = attentionBorrowingMapper.updateByPrimaryKeySelective(attentionBorrowing);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("关注借款信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，关注借款信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delAttentionBorrowing 
     * @Description: TODO(删除关注借款) 
     * @param @param attentionBorrowingIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delAttentionBorrowing(String attentionBorrowingId, String loanTitle) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (attentionBorrowingId != null) {
        	AttentionBorrowingExample attentionBorrowingExample = new AttentionBorrowingExample();
        	attentionBorrowingExample.createCriteria().andAttentionBorrowingIdEqualTo(attentionBorrowingId);
            count = attentionBorrowingMapper.deleteByExample(attentionBorrowingExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了关注借款信息");
            } else {
                returnResult.setMsg("发生未知错误，关注借款信息删除失败");
            }
        }
        return returnResult;
    }
}
