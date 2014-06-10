package com.glacier.netloan.service.borrow;

import java.util.Calendar;
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
import com.glacier.netloan.dao.borrow.RepaymentNotesDetailMapper;
import com.glacier.netloan.dao.borrow.RepaymentNotesMapper;
import com.glacier.netloan.dao.finance.FinanceMemberMapper;
import com.glacier.netloan.dao.finance.FinanceTransactionMapper;
import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.borrow.RepaymentNotesDetailQueryDTO;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.RepaymentNotes;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetail;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetailExample;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetailExample.Criteria;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: RepaymentNotesDetailDetailService 
 * @Description: TODO(还款记录明细业务层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-7下午4:03:07
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class RepaymentNotesDetailService {
	@Autowired
	private RepaymentNotesDetailMapper repaymentNotesDetailMapper;
	
	@Autowired
	private BorrowingLoanMapper borrowingLoanMapper;
	
	@Autowired
	private RepaymentNotesMapper repaymentNotesMapper;
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private FinanceMemberMapper financeMemberMapper;
	
	@Autowired
	private FinanceTransactionMapper financeTransactionMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * @Title: getRepaymentNotesDetail 
	 * @Description: TODO(根据还款记录明细Id获取还款记录明细信息) 
	 * @param @param repayNotesDetailId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getRepaymentNotesDetail(String repayNotesDetailId) {
    	RepaymentNotesDetail repaymentNotesDetail = repaymentNotesDetailMapper.selectByPrimaryKey(repayNotesDetailId);
        return repaymentNotesDetail;
    }
    
    /**
     * @Title: listByRepDetailLoadIdOrMemberId 
     * @Description: TODO(根据借款Id和会员Id来查找相对应的还款明细信息列表，用于前台的会员中心--正在还款的借款--还款明细列表) 
     * @param  @param jqPager
     * @param  @param p
     * @param  @param loanId
     * @param  @param memberId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object listByRepDetailLoadIdOrMemberId(JqPager jqPager, int p, String loanId, String memberId) {
        
        JqGridReturn returnResult = new JqGridReturn();
        RepaymentNotesDetailExample repaymentNotesDetailExample = new RepaymentNotesDetailExample();
        if(null != memberId && StringUtils.isNotBlank(memberId)){
            repaymentNotesDetailExample.createCriteria().andMemberIdEqualTo(memberId);//查询相对应的还款人的还款记录明细
        }
        if(null != loanId && StringUtils.isNotBlank(loanId)){
            RepaymentNotes repaymentNotes = repaymentNotesMapper.selectByPrimaryLoanId(loanId);//根据借款Id查找出对应的还款信息记录
            if(null != repaymentNotes.getRepayNotesId() && StringUtils.isNotBlank(repaymentNotes.getRepayNotesId())){
                repaymentNotesDetailExample.createCriteria().andRepayNotesIdEqualTo(repaymentNotes.getRepayNotesId());//根据还款信息记录Id查找出对应的还款记录明细
            }
        }
        jqPager.setSort("createTime");// 定义排序字段
        jqPager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            repaymentNotesDetailExample.setOrderByClause(jqPager.getOrderBy("temp_repayment_notes_detail_"));
        }
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        repaymentNotesDetailExample.setLimitStart(startTemp);
        repaymentNotesDetailExample.setLimitEnd(10);
        List<RepaymentNotesDetail>  repaymentNotesDetails = repaymentNotesDetailMapper.selectByExample(repaymentNotesDetailExample); // 查询所有借款列表

        int total = repaymentNotesDetailMapper.countByExample(repaymentNotesDetailExample); // 查询总页数
        returnResult.setRows(repaymentNotesDetails);//设置查询数据
        returnResult.setTotal(total);//设置总条数
        returnResult.setP(p);//设置当前页
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: listAsGridWebsite 
     * @Description: TODO(前台还款记录明细列表) 
     * @param  @param jqPager
     * @param  @param borrowingLoanQueryDTO
     * @param  @param pagetype
     * @param  @param p
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object listAsGridWebsite(JqPager jqPager,int p,String repayNotesId,String memberId) {
        
        JqGridReturn returnResult = new JqGridReturn();
        RepaymentNotesDetailExample repaymentNotesDetailExample = new RepaymentNotesDetailExample();
        if(null != memberId && StringUtils.isNotBlank(memberId)){
        	repaymentNotesDetailExample.createCriteria().andMemberIdEqualTo(memberId);//查询相对应的还款人的还款记录明细
        }
        if(null != repayNotesId && StringUtils.isNotBlank(repayNotesId)){
        	repaymentNotesDetailExample.createCriteria().andRepayNotesIdEqualTo(repayNotesId);//查询相对应的还款人的还款记录的还款明细
        }

        jqPager.setSort("createTime");// 定义排序字段
        jqPager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	repaymentNotesDetailExample.setOrderByClause(jqPager.getOrderBy("temp_repayment_notes_detail_"));
        }
        
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        repaymentNotesDetailExample.setLimitStart(startTemp);
        repaymentNotesDetailExample.setLimitEnd(10);
        List<RepaymentNotesDetail>  repaymentNotesDetails = repaymentNotesDetailMapper.selectByExample(repaymentNotesDetailExample); // 查询所有借款列表

        int total = repaymentNotesDetailMapper.countByExample(repaymentNotesDetailExample); // 查询总页数
        returnResult.setRows(repaymentNotesDetails);//设置查询数据
        returnResult.setTotal(total);//设置总条数
        returnResult.setP(p);//设置当前页
        return returnResult;// 返回ExtGrid表
    }
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有还款记录明细信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager,RepaymentNotesDetailQueryDTO repaymentNotesDetailQueryDTO) {
        
        JqGridReturn returnResult = new JqGridReturn();
        RepaymentNotesDetailExample repaymentNotesDetailExample = new RepaymentNotesDetailExample();
        
        Criteria queryCriteria = repaymentNotesDetailExample.createCriteria();
        repaymentNotesDetailQueryDTO.setQueryCondition(queryCriteria);

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	repaymentNotesDetailExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	repaymentNotesDetailExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	repaymentNotesDetailExample.setOrderByClause(pager.getOrderBy("temp_repayment_notes_detail_"));
        }
        List<RepaymentNotesDetail>  repaymentNotesDetails = repaymentNotesDetailMapper.selectByExample(repaymentNotesDetailExample); // 查询所有还款记录明细列表
        int total = repaymentNotesDetailMapper.countByExample(repaymentNotesDetailExample); // 查询总页数
        returnResult.setRows(repaymentNotesDetails);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addRepaymentNotesDetail 
     * @Description: TODO(新增还款记录明细) 
     * @param @param repaymentNotesDetail
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RepaymentNotesDetailList_add")
    public Object addRepaymentNotesDetail(RepaymentNotesDetail repaymentNotesDetail,RepaymentNotes repaymentNotesNew) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        BorrowingLoan borrowingLoanNew = (BorrowingLoan) borrowingLoanMapper.selectByPrimaryKey(repaymentNotesNew.getLoanId());
        
        for(int i = 0;i < Integer.parseInt(borrowingLoanNew.getLoanDeadlinesId());i++){
        	repaymentNotesDetail.setNumberPeriod((float) (i+1));//设置当前是第几期
        	Calendar c = Calendar.getInstance();//日历对象
 	        c.setTime(new Date());//获取当前时间
 	        c.add(Calendar.MONTH, i+1);//在当前时间上加一个月
        	repaymentNotesDetail.setShouldPayDate(c.getTime());//设置应还款日期
        	//满标进行二次审核时，同时生成还款记录和还款记录明细和收款记录和收款记录明细等数据
    		if(borrowingLoanNew.getRepaymentTypeDisplay().equals("等额本息")){
    			float everyMonthMoney = (float) ((borrowingLoanNew.getLoanTotal() * (borrowingLoanNew.getLoanApr()/12) 
													* Math.pow(((1 + borrowingLoanNew.getLoanApr()/12)),Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId())))
													/ (Math.pow(((1 + borrowingLoanNew.getLoanApr()/12)),Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()))-1));
    			float everyMonthPrincipal = (float) ((borrowingLoanNew.getLoanTotal() * (borrowingLoanNew.getLoanApr()/12) 
    					* Math.pow(((1 + borrowingLoanNew.getLoanApr()/12)),i))
    					/ (Math.pow(((1 + borrowingLoanNew.getLoanApr()/12)),Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()))-1));
    			repaymentNotesDetail.setCurrentPayMoeny(everyMonthMoney);//设置当期应还本息
    			repaymentNotesDetail.setCurrentPayPrincipal(everyMonthPrincipal);//设置当期应还本金
    			repaymentNotesDetail.setCurrentPayInterest(everyMonthMoney-everyMonthPrincipal);//设置当期应还利息
    		}else if(borrowingLoanNew.getRepaymentTypeDisplay().equals("按月付息，到期还本")){
    			float everyMonthInterest = borrowingLoanNew.getLoanTotal() * (borrowingLoanNew.getLoanApr()/12);
    			if(Integer.parseInt(borrowingLoanNew.getLoanDeadlinesId()) == i+1){//判断是否是最后一期
    				float shouldPayMoney = everyMonthInterest + borrowingLoanNew.getLoanTotal();
    				repaymentNotesDetail.setCurrentPayMoeny(shouldPayMoney);//设置当期应还本息
    				repaymentNotesDetail.setCurrentPayPrincipal(borrowingLoanNew.getLoanTotal());//设置当期应还本金
        			repaymentNotesDetail.setCurrentPayInterest(everyMonthInterest);//设置当期应还利息
    			}else{
    				repaymentNotesDetail.setCurrentPayMoeny(everyMonthInterest);//设置当期应还本息
    				repaymentNotesDetail.setCurrentPayPrincipal(0f);//设置当期应还本金
        			repaymentNotesDetail.setCurrentPayInterest(everyMonthInterest);//设置当期应还利息
    			}
    		}else if(borrowingLoanNew.getRepaymentTypeDisplay().equals("一次性还款")){
    			if(Integer.parseInt(borrowingLoanNew.getLoanDeadlinesId()) == i+1){//判断是否是最后一期
    				float everyMonthInterest = borrowingLoanNew.getLoanTotal() * (borrowingLoanNew.getLoanApr()/12);
        			float shouldPayMoney = everyMonthInterest * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()) + borrowingLoanNew.getLoanTotal();
    				repaymentNotesDetail.setCurrentPayMoeny(shouldPayMoney);//设置当期应还本息
    				repaymentNotesDetail.setCurrentPayPrincipal(borrowingLoanNew.getLoanTotal());//设置当期应还本金
        			repaymentNotesDetail.setCurrentPayInterest(everyMonthInterest);//设置当期应还利息
    			}else{
    				repaymentNotesDetail.setCurrentPayMoeny(0f);//设置当期应还本息
    				repaymentNotesDetail.setCurrentPayPrincipal(0f);//设置当期应还本金
        			repaymentNotesDetail.setCurrentPayInterest(0f);//设置当期应还利息
    			}
    		}
    		repaymentNotesDetail.setRepayNotesDetailId(RandomGUID.getRandomGUID());
    		repaymentNotesDetail.setMemberId(borrowingLoanNew.getMemberId());
            repaymentNotesDetail.setActualPayMoney(0f);
            repaymentNotesDetail.setAlsoNeedMoney(0f);
            repaymentNotesDetail.setOverdueDays("0");
            repaymentNotesDetail.setOverdueInterest(0f);
            repaymentNotesDetail.setOverdueManaFee(0f);
            repaymentNotesDetail.setOverdueUrgeFee(0f);
            repaymentNotesDetail.setIsAdvances("no");//设置是否网站代还
            repaymentNotesDetail.setIsOverdue("no");//设置是否逾期
            repaymentNotesDetail.setRepayState("notRepay");//设置还款记录明细表状态为“还款中”
            repaymentNotesDetail.setCreater(pricipalUser.getUserId());
            repaymentNotesDetail.setCreateTime(new Date());
            repaymentNotesDetail.setUpdater(pricipalUser.getUserId());
            repaymentNotesDetail.setUpdateTime(new Date());
            count = repaymentNotesDetailMapper.insert(repaymentNotesDetail);
        }
        
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg(" 还款记录明细信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，还款记录明细信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editRepaymentNotesDetail 
     * @Description: TODO(修改还款记录明细) 
     * @param @param repaymentNotesDetail
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editRepaymentNotesDetail(RepaymentNotesDetail repaymentNotesDetail) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        count = repaymentNotesDetailMapper.updateByPrimaryKeySelective(repaymentNotesDetail);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("还款记录明细信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，还款记录明细信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: repaymentRepaymentNotesDetail 
     * @Description: TODO(前台页面-会员进行还款) 
     * @param  @param repaymentNotesDetail
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    @Transactional(readOnly = false)
    public Object repaymentRepaymentNotesDetail(String repayNotesDetailId, Member member, boolean captchaBoolean) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        // 验证会员真正的交易密码是否等于输入的交易密码
        Member memberTemp = new Member();
        memberTemp = memberMapper.selectByPrimaryKey(member.getMemberId());// 根据前台返回的会员Id，查询出该会员的信息
        if (null != member.getTradersPassword() && StringUtils.isNotBlank(member.getTradersPassword())) {
            if (!member.getTradersPassword().equals(memberTemp.getTradersPassword())) {// 判断前台的交易密码是否正确
                returnResult.setMsg("交易密码错误，请重新输入");
                return returnResult;
            }
        }
        // 防止验证码错误
        if (!captchaBoolean) {
            returnResult.setMsg("验证码错误，请重新输入");
            return returnResult;
        }
        int count = 0;
        RepaymentNotesDetail repaymentNotesDetail = repaymentNotesDetailMapper.selectByPrimaryKey(repayNotesDetailId);// 根据还款明细Id查找出对应的还款明细信息记录
        repaymentNotesDetail.setRepayState("alreadRepay");
        count = repaymentNotesDetailMapper.updateByPrimaryKeySelective(repaymentNotesDetail);
        if (count == 1) {
            // 还款明细信息修改成功后，系统自动更新该会员的财务信息
            FinanceMember financeMember = financeMemberMapper.selectByMemberId(member.getMemberId());// 根据会员Id查找出该会员的财务会员信息记录
            financeMember.setAmount(financeMember.getAmount() - repaymentNotesDetail.getAlsoNeedMoney());// 现在的会员帐号总余额=之前的会员帐号余额-需还总额
            financeMember.setUsableMoney(financeMember.getUsableMoney() - repaymentNotesDetail.getAlsoNeedMoney());// 现在的会员帐号可用余额=之前的会员帐号可用余额-需还总额
            financeMember.setRefundMoney(financeMember.getRefundMoney() - repaymentNotesDetail.getAlsoNeedMoney());// 现在的会员帐号待还金额=之前的会员帐号待还金额-需还总额
            count = financeMemberMapper.updateByPrimaryKeySelective(financeMember);
            if (count == 1) {
                // 系统成功自动更新该会员的财务信息后，再自动生成一条会员资金记录明细信息
                // 查找出超级管理员的用户信息
                UserExample userExample = new UserExample();
                userExample.createCriteria().andUsernameEqualTo("admin");
                List<User> users = userMapper.selectByExample(userExample);
                User pricipalUser = users.get(0);
                // 向会员资金记录明细进行赋值
                FinanceTransaction financeTransaction = new FinanceTransaction();
                financeTransaction.setTransactionId(RandomGUID.getRandomGUID());
                financeTransaction.setFinanceMemberId(financeMember.getFinanceMemberId());
                financeTransaction.setMemberId(member.getMemberId());
                financeTransaction.setTransactionTarget("系统管理员");
                financeTransaction.setTransactionType("还款扣除金额");
                financeTransaction.setEarningMoney((float) 0);
                financeTransaction.setExpendMoney(repaymentNotesDetail.getAlsoNeedMoney());
                financeTransaction.setUsableMoney(financeMember.getUsableMoney());
                financeTransaction.setFrozenMoney(financeMember.getFrozenMoney());
                financeTransaction.setCollectingMoney(financeMember.getCollectingMoney());
                financeTransaction.setRefundMoney(financeMember.getRefundMoney());
                financeTransaction.setAmount(financeMember.getAmount());
                financeTransaction.setRemark("会员还款成功后，系统自动生成的会员资金记录明细信息");
                financeTransaction.setCreater(pricipalUser.getUserId());
                financeTransaction.setCreateTime(new Date());
                financeTransaction.setUpdater(pricipalUser.getUserId());
                financeTransaction.setUpdateTime(new Date());
                count = financeTransactionMapper.insert(financeTransaction);
                if (count == 1) {
                    returnResult.setSuccess(true);
                    returnResult.setMsg("还款操作成功"); 
                }
            }
        } else {
            returnResult.setMsg("发生未知错误，还款操作失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delRepaymentNotesDetail 
     * @Description: TODO(删除还款记录明细) 
     * @param @param repayNotesDetailIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RepaymentNotesDetailList_del")
    public Object delRepaymentNotesDetail(List<String> repayNotesDetailIds, List<String> repaymentNotesDetailTitle) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (repayNotesDetailIds.size() > 0) {
        	RepaymentNotesDetailExample repaymentNotesDetailExample = new RepaymentNotesDetailExample();
        	repaymentNotesDetailExample.createCriteria().andRepayNotesIdIn(repayNotesDetailIds);
            count = repaymentNotesDetailMapper.deleteByExample(repaymentNotesDetailExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了还款记录明细信息");
            } else {
                returnResult.setMsg("发生未知错误，还款记录明细信息删除失败");
            }
        }
        return returnResult;
    }
}
