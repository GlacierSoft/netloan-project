package com.glacier.netloan.service.borrow;

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
import com.glacier.netloan.dao.borrow.BorrowingLoanMapper;
import com.glacier.netloan.dao.borrow.RepaymentNotesMapper;
import com.glacier.netloan.dao.finance.FinanceMemberMapper;
import com.glacier.netloan.dao.member.MemberStatisticsMapper;
import com.glacier.netloan.dto.query.borrow.RepaymentNotesQueryDTO;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.RepaymentNotesExample.Criteria;
import com.glacier.netloan.entity.borrow.RepaymentNotes;
import com.glacier.netloan.entity.borrow.RepaymentNotesExample;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: RepaymentNotesService 
 * @Description: TODO(还款记录业务层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-7下午3:14:12
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class RepaymentNotesService {
	@Autowired
	private RepaymentNotesMapper repaymentNotesMapper;
	
	@Autowired
	private BorrowingLoanMapper borrowingLoanMapper;
	
	@Autowired
	private MemberStatisticsMapper memberStatisticsMapper;
	
	@Autowired
	private FinanceMemberMapper financeMemberMapper;
	
	
	/**
	 * @Title: getRepaymentNotes 
	 * @Description: TODO(根据还款记录Id获取还款记录信息) 
	 * @param @param repayNotesId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getRepaymentNotes(String repayNotesId) {
    	RepaymentNotes repaymentNotes = repaymentNotesMapper.selectByPrimaryKey(repayNotesId);
        return repaymentNotes;
    }
    /**
     * @Title: listAsGridWebsite 
     * @Description: TODO(前台还款记录列表) 
     * @param  @param jqPager
     * @param  @param borrowingLoanQueryDTO
     * @param  @param pagetype
     * @param  @param p
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object listAsGridWebsite(JqPager jqPager,int p,String memberId) {
        
        JqGridReturn returnResult = new JqGridReturn();
        RepaymentNotesExample repaymentNotesExample = new RepaymentNotesExample();
        repaymentNotesExample.createCriteria().andMemberIdEqualTo(memberId);//查询相对应的还款人的还款记录
        
        jqPager.setSort("createTime");// 定义排序字段
        jqPager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	repaymentNotesExample.setOrderByClause(jqPager.getOrderBy("temp_repayment_notes_"));
        }
        
        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
        repaymentNotesExample.setLimitStart(startTemp);
        repaymentNotesExample.setLimitEnd(5);
        List<RepaymentNotes>  repaymentNotess = repaymentNotesMapper.selectByExample(repaymentNotesExample); // 查询所有借款列表

        int total = repaymentNotesMapper.countByExample(repaymentNotesExample); // 查询总页数
        returnResult.setRows(repaymentNotess);//设置查询数据
        returnResult.setTotal(total);//设置总条数
        returnResult.setP(p);//设置当前页
        return returnResult;// 返回ExtGrid表
    }
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有还款记录信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager,RepaymentNotesQueryDTO repaymentNotesQueryDTO) {
        
        JqGridReturn returnResult = new JqGridReturn();
        RepaymentNotesExample repaymentNotesExample = new RepaymentNotesExample();
        
        Criteria queryCriteria = repaymentNotesExample.createCriteria();
        repaymentNotesQueryDTO.setQueryCondition(queryCriteria);

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	repaymentNotesExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	repaymentNotesExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	repaymentNotesExample.setOrderByClause(pager.getOrderBy("temp_repayment_notes_"));
        }
        List<RepaymentNotes>  repaymentNotess = repaymentNotesMapper.selectByExample(repaymentNotesExample); // 查询所有还款记录列表
        int total = repaymentNotesMapper.countByExample(repaymentNotesExample); // 查询总页数
        returnResult.setRows(repaymentNotess);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addRepaymentNotes 
     * @Description: TODO(新增还款记录) 
     * @param @param repaymentNotes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RepaymentNotesList_add")
    public Object addRepaymentNotes(RepaymentNotes repaymentNotes) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        float shouldPayMoney = 0f;
        BorrowingLoan borrowingLoanNew = (BorrowingLoan)borrowingLoanMapper.selectByPrimaryKey(repaymentNotes.getLoanId());//重新获取该会员 借款的信息数据
		if(borrowingLoanNew.getRepaymentTypeDisplay().equals("等额本息")){
			float everyMonthMoney = (float) ((borrowingLoanNew.getLoanTotal() * (borrowingLoanNew.getLoanApr()/12) 
											* Math.pow(((1 + borrowingLoanNew.getLoanApr()/12)),Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId())))
											/ (Math.pow(((1 + borrowingLoanNew.getLoanApr()/12)),Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()))-1));
			shouldPayMoney = everyMonthMoney * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId());
		}else if(borrowingLoanNew.getRepaymentTypeDisplay().equals("按月付息，到期还本")){
			float everyMonthInterest = borrowingLoanNew.getLoanTotal() * (borrowingLoanNew.getLoanApr()/12);
			shouldPayMoney = everyMonthInterest * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()) + borrowingLoanNew.getLoanTotal();
		}else if(borrowingLoanNew.getRepaymentTypeDisplay().equals("一次性还款")){
			float everyMonthInterest = borrowingLoanNew.getLoanTotal() * (borrowingLoanNew.getLoanApr()/12);
			shouldPayMoney = everyMonthInterest * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()) + borrowingLoanNew.getLoanTotal();
		}
		//还款记录对象赋值//2014-6-27增加字段
		repaymentNotes.setRepaymentTotal(0f);//设置还款总金额
		repaymentNotes.setShouldPayPrincipal(borrowingLoanNew.getLoanTotal());//设置应还本金
		repaymentNotes.setAlrPayPrincipal(0f);//设置已还本金
		repaymentNotes.setNotPayPrincipal(borrowingLoanNew.getLoanTotal());//设置未还本金
		repaymentNotes.setShouldPayMoney(shouldPayMoney);//设置应还本息
		repaymentNotes.setAlrPayMoney(0f);//设置已还本息
		repaymentNotes.setNotPayMoney(shouldPayMoney);//设置未还本息
		repaymentNotes.setShouldPayInterest(shouldPayMoney-borrowingLoanNew.getLoanTotal());//设置应还利息
		repaymentNotes.setAlrPayInterest(0f);//设置已还利息
		repaymentNotes.setNotPayInterest(shouldPayMoney-borrowingLoanNew.getLoanTotal());//设置未还利息
		repaymentNotes.setLoanId(borrowingLoanNew.getLoanId());//设置借款id--
		repaymentNotes.setMemberId(borrowingLoanNew.getMemberId());//设置还款人id
        repaymentNotes.setRepayNotesId(RandomGUID.getRandomGUID());
        repaymentNotes.setAlrPayMoney(0f);
        repaymentNotes.setAlrOverdueInterest(0f);
        repaymentNotes.setAlrOverdueMana(0f);
        repaymentNotes.setAlrOverdueUrge(0f);
        repaymentNotes.setRepayState("repaying");//设置还款记录表状态为“还款中”
        repaymentNotes.setCreater(pricipalUser.getUserId());
        repaymentNotes.setCreateTime(new Date());
        repaymentNotes.setUpdater(pricipalUser.getUserId());
        repaymentNotes.setUpdateTime(new Date());
        count = repaymentNotesMapper.insert(repaymentNotes);
        if (count == 1) {
        	//更新借款人的会员资金
        	//根据还款人的ID取出还款人的会员资金信息
        	FinanceMember financeMember = financeMemberMapper.selectByMemberId(repaymentNotes.getMemberId());
        	//根据根据还款记录中的借款ID查询出借款的信息
        	BorrowingLoan borrowingLoan = borrowingLoanMapper.selectByPrimaryKey(repaymentNotes.getLoanId());
        	//更新可用余额、代还金额（加上利息）、总金额
        	financeMember.setAmount(financeMember.getAmount()+borrowingLoan.getLoanTotal());//更新总金额(原本总金额+借款总额)
        	financeMember.setUsableMoney(financeMember.getUsableMoney()+borrowingLoan.getLoanTotal());//更新可用余额(原本可用余额+借款总额)
        	financeMember.setRefundMoney(financeMember.getRefundMoney()+shouldPayMoney);//更新待还金额(原本待还金额+本息)
        	
        	financeMemberMapper.updateByPrimaryKey(financeMember);
        	
        	//更新借款的会员统计表信息
          	//根据会员ID查找会员统计的信息
        	MemberStatistics memberStatistics=memberStatisticsMapper.selectByMemberId(borrowingLoan.getMemberId());
        	//根据借款的ID查找借款的信息
        	BorrowingLoan borrowings=borrowingLoanMapper.selectByPrimaryKey(borrowingLoan.getLoanId());
        	//给要更新的会员统计数据赋值
        	memberStatistics.setTotalBorrowings(memberStatistics.getTotalBorrowings()+borrowings.getLoanTotal());//设置借款总额(把借钱的总额和统计的总额相加)
        	memberStatistics.setBorrowSuccess(memberStatistics.getBorrowSuccess()+1);
        	memberStatistics.setWaitAlsoTotal(memberStatistics.getWaitAlsoTotal()+shouldPayMoney);//设置待还总额(本息(本金+利息))
        	memberStatistics.setWaitAlsoPrincipal(memberStatistics.getWaitAlsoPrincipal()+borrowings.getLoanTotal());//设置待还本金
        	memberStatistics.setWaitAlsoInterest(memberStatistics.getWaitAlsoInterest()+(shouldPayMoney-borrowings.getLoanTotal()));//设置待还利息(原有的利息+(本息-本金))
        	memberStatistics.setCreateTime(new Date());
        	
        	//修改统计会员信息
        	memberStatisticsMapper.updateByPrimaryKeySelective(memberStatistics);
        	
            returnResult.setSuccess(true);
            returnResult.setObj(repaymentNotes);
            returnResult.setMsg(" 还款记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，还款记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editRepaymentNotes 
     * @Description: TODO(修改还款记录) 
     * @param @param repaymentNotes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editRepaymentNotes(RepaymentNotes repaymentNotes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        count = repaymentNotesMapper.updateByPrimaryKeySelective(repaymentNotes);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("还款记录信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，还款记录信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delRepaymentNotes 
     * @Description: TODO(删除还款记录) 
     * @param @param repayNotesIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RepaymentNotesList_del")
    public Object delRepaymentNotes(List<String> repayNotesIds, List<String> repaymentNotesTitle) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (repayNotesIds.size() > 0) {
        	RepaymentNotesExample repaymentNotesExample = new RepaymentNotesExample();
        	repaymentNotesExample.createCriteria().andRepayNotesIdIn(repayNotesIds);
            count = repaymentNotesMapper.deleteByExample(repaymentNotesExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了还款记录信息");
            } else {
                returnResult.setMsg("发生未知错误，还款记录信息删除失败");
            }
        }
        return returnResult;
    }
}
