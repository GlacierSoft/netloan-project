/*
 * @(#)BorrowingLoanService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
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

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.borrow.BorrowingLoanMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.BorrowingLoanExample;
import com.glacier.netloan.entity.borrow.BorrowingLoanExample.Criteria;
import com.glacier.netloan.entity.borrow.ReceivablesNotes;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetail;
import com.glacier.netloan.entity.borrow.RepaymentNotes;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetail;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.entity.member.MemberMessageNotice;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.service.basicdatas.ParameterCreditService;
import com.glacier.netloan.service.finance.FinanceMemberService;
import com.glacier.netloan.service.finance.FinanceTransactionService;
import com.glacier.netloan.service.member.MemberMessageNoticeService;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: BorrowingLoanService 
 * @Description: TODO(借款业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class BorrowingLoanService {

	@Autowired
    private BorrowingLoanMapper borrowingLoanMapper;

	@Autowired
    private UserMapper userMapper;
	
	@Autowired
	private ParameterCreditService parameterCreditService;
	
	@Autowired
	private RepaymentNotesService repaymentNotesService;
	
	@Autowired
	private RepaymentNotesDetailService repaymentNotesDetailService;
	
	@Autowired
	private MemberMessageNoticeService memberMessageNoticeService;
	
	@Autowired
	private ReceivablesNotesDetailService receivablesNotesDetailService;
	
	@Autowired
	private ReceivablesNotesService receivablesNotesService;
	
	@Autowired
	private FinanceTransactionService financeTransactionService;
	
	@Autowired
	private FinanceMemberService financeMemberService;
	
	/**
	 * @Title: getBorrowingLoan 
	 * @Description: TODO(根据借款Id获取借款信息) 
	 * @param @param loanId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getBorrowingLoan(String loanId) {
    	BorrowingLoan borrowingLoan = borrowingLoanMapper.selectByPrimaryKey(loanId);
        return borrowingLoan;
    }
    /**
     * @Title: listAsGridWebsite 
     * @Description: TODO(前台会员借款列表) 
     * @param  @param jqPager
     * @param  @param borrowingLoanQueryDTO
     * @param  @param loanState
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object listAsGridWebsite(JqPager jqPager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String pagetype,int p) {
        
        JqGridReturn returnResult = new JqGridReturn();
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        
        Criteria queryCriteria = borrowingLoanExample.createCriteria();
        borrowingLoanQueryDTO.setQueryCondition(queryCriteria);
        
        //根据前台传来的pagetype参数类型，相对应的进行排序
        if(null == pagetype || "".equals(pagetype.trim())){
        	jqPager.setSort("createTime");// 定义排序字段
            jqPager.setOrder("DESC");// 升序还是降序
        }else{
        	if(pagetype.trim().equals("riseloanTotal")){
            	jqPager.setSort("loanTotal");// 定义排序字段
                jqPager.setOrder("ASC");// 升序还是降序
            }else if(pagetype.trim().equals("downloanTotal")){
            	jqPager.setSort("loanTotal");// 定义排序字段
                jqPager.setOrder("DESC");// 升序还是降序
            }else if(pagetype.trim().equals("risecredit")){
            	jqPager.setSort("creditIntegral");// 定义排序字段
                jqPager.setOrder("ASC");// 升序还是降序
            }else if(pagetype.trim().equals("downcredit")){
            	jqPager.setSort("creditIntegral");// 定义排序字段
                jqPager.setOrder("DESC");// 升序还是降序
            }else if(pagetype.trim().equals("riseloanApr")){
            	jqPager.setSort("loanApr");// 定义排序字段
                jqPager.setOrder("ASC");// 升序还是降序
            }else if(pagetype.trim().equals("downloanApr")){
            	jqPager.setSort("loanApr");// 定义排序字段
                jqPager.setOrder("DESC");// 升序还是降序
            }
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	borrowingLoanExample.setOrderByClause(jqPager.getOrderBy("temp_borrowing_loan_"));
        }
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        borrowingLoanExample.setLimitStart(startTemp);
        borrowingLoanExample.setLimitEnd(10);
        List<BorrowingLoan>  borrowingLoans = borrowingLoanMapper.selectByExample(borrowingLoanExample); // 查询所有借款列表
        //查询基础信用积分的所有数据
        List<ParameterCredit> parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
        List<BorrowingLoan> allborrowingLoans = new ArrayList<BorrowingLoan>();//定义一个空的借款列表
        //通过嵌套for循环，将会员的信用图标加到借款对象中去
        for(BorrowingLoan borrowingLoan : borrowingLoans){
        	for(ParameterCredit parameterCredit : parameterCredits){
    			if(borrowingLoan.getCreditIntegral() >= parameterCredit.getCreditBeginIntegral() && borrowingLoan.getCreditIntegral() < parameterCredit.getCreditEndIntegral()){
        			borrowingLoan.setCreditPhoto(parameterCredit.getCreditPhoto());
        			break;
        		}	
        	}
        	allborrowingLoans.add(borrowingLoan);
        }
        int total = borrowingLoanMapper.countByExample(borrowingLoanExample); // 查询总页数
        returnResult.setRows(allborrowingLoans);//设置查询数据
        returnResult.setTotal(total);//设置总条数
        returnResult.setP(p);//设置当前页
        return returnResult;// 返回ExtGrid表
    }
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有借款信息) 
     * @param @param pborrowingLoanr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String loanState) {
        
        JqGridReturn returnResult = new JqGridReturn();
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        
        Criteria queryCriteria = borrowingLoanExample.createCriteria();
        borrowingLoanQueryDTO.setQueryCondition(queryCriteria);
        
        if (null != loanState && StringUtils.isNotBlank(loanState)) {
        	borrowingLoanExample.createCriteria().andLoanStateEqualTo(loanState);
        }

        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	borrowingLoanExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	borrowingLoanExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	borrowingLoanExample.setOrderByClause(jqPager.getOrderBy("temp_borrowing_loan_"));
        }
        List<BorrowingLoan>  borrowingLoans = borrowingLoanMapper.selectByExample(borrowingLoanExample); // 查询所有借款列表
        int total = borrowingLoanMapper.countByExample(borrowingLoanExample); // 查询总页数
        returnResult.setRows(borrowingLoans);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addBorrowingLoan 
     * @Description: TODO(新增借款) 
     * @param @param borrowingLoan
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addBorrowingLoan(BorrowingLoan borrowingLoan, String memberId, boolean captchaBoolean) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        // 防止验证码错误
        if (!captchaBoolean) {
        	returnResult.setMsg("验证码错误，请重新输入");
            return returnResult;
        }
        int count = 0;
        // 防止借款主题重复
        borrowingLoanExample.createCriteria().andLoanCodeEqualTo(borrowingLoan.getLoanCode());
        count = borrowingLoanMapper.countByExample(borrowingLoanExample);// 查找相同编号的借款数量
        if (count > 0) {
            returnResult.setMsg("借款编号重复");
            return returnResult;
        }
        borrowingLoan.setLoanId(RandomGUID.getRandomGUID());
        borrowingLoan.setMemberId(memberId);
        borrowingLoan.setLoanState("firstAudit");
        borrowingLoan.setCreater(memberId);
        borrowingLoan.setCreateTime(new Date());
//        borrowingLoan.setUpdater(memberId);
//        borrowingLoan.setUpdateTime(new Date());
        count = borrowingLoanMapper.insert(borrowingLoan);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + borrowingLoan.getLoanCode() + "] 借款信息已保存,请等待管理员进行审核");
        } else {
            returnResult.setMsg("发生未知错误，借款信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editBorrowingLoan 
     * @Description: TODO(修改借款) 
     * @param @param borrowingLoan
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editBorrowingLoan(BorrowingLoan borrowingLoan) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        int count = 0;
        borrowingLoan.setUpdateTime(new Date());
        count = borrowingLoanMapper.updateByPrimaryKeySelective(borrowingLoan);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + borrowingLoan.getLoanCode() + "] 借款信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，借款信息修改失败");
        }
        return returnResult;
    }
    /**
     * @Title: editBorrowingLoan 
     * @Description: TODO(修改借款) 
     * @param @param borrowingLoan
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editBorrowingLoan(BorrowingLoan borrowingLoan,TenderNotes tenderNotes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        int count = 0;
        if(borrowingLoan.getSubTotal() == 0.0){
			if(borrowingLoan.getAlrBidMoney() == null){
				float alrTenderPro = tenderNotes.getTenderMoney()/borrowingLoan.getLoanTotal();
				borrowingLoan.setAlrTenderPro(alrTenderPro);//更新投标比例
			}else{
				float alrTenderPro = (borrowingLoan.getAlrBidMoney()+tenderNotes.getTenderMoney())/borrowingLoan.getLoanTotal();
				borrowingLoan.setAlrTenderPro(alrTenderPro);//更新投标比例	
			}
			borrowingLoan.setAlrBidMoney(borrowingLoan.getAlrBidMoney()+tenderNotes.getTenderMoney());//更新已投标的金额
		}else{
			float alrSubSum = 0f;
			if(borrowingLoan.getAlrSubSum() == null){
				alrSubSum = tenderNotes.getSubSum();//更新已投份数
			}else{
				alrSubSum = borrowingLoan.getAlrSubSum()+tenderNotes.getSubSum();//更新已投份数
			}
			borrowingLoan.setAlrSubSum(alrSubSum);//更新借款数据中的已认购份数
			borrowingLoan.setAlrTenderPro(alrSubSum/borrowingLoan.getSubTotal());//更新投标比例
		}
		if(borrowingLoan.getTenderSum() == null){
			borrowingLoan.setTenderSum(1f);
		}else{
			borrowingLoan.setTenderSum(borrowingLoan.getTenderSum()+1);//更新借款数据中的投标数量
		}
		if(borrowingLoan.getAlrTenderPro() == 1.0){
			borrowingLoan.setLoanState("secondAuditor");	
		}
        borrowingLoan.setUpdateTime(new Date());
        count = borrowingLoanMapper.updateByPrimaryKeySelective(borrowingLoan);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + borrowingLoan.getLoanCode() + "] 借款信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，借款信息修改失败");
        }
        return returnResult;
    }
    /**
     * @Title: firstAuditBorrowingLoan 
     * @Description: TODO(借款进行初审) 
     * @param @param borrowingLoan
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "BorrowingLoanList_firstAudit")
    public Object firstAuditBorrowingLoan(BorrowingLoan borrowingLoan) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        //借款初次审核站内信通知
        MemberMessageNotice  memberMessageNotice = new MemberMessageNotice();
        memberMessageNotice.setTitle("借款标题为："+borrowingLoanMapper.selectByPrimaryKey(borrowingLoan.getLoanId()).getLoanTitle()+",初次审核通知");
        memberMessageNotice.setContent(borrowingLoan.getSecondMesNotice());
        memberMessageNotice.setAddressee(borrowingLoan.getMemberId());
        memberMessageNoticeService.addMemberMessageNotice(memberMessageNotice);
        
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        borrowingLoan.setFirstAuditorId(pricipalUser.getUserId());
        borrowingLoan.setFirstAuditDate(new Date());
        borrowingLoan.setUpdater(pricipalUser.getUserId());
        borrowingLoan.setUpdateTime(new Date());
        if ("".equals(borrowingLoan.getFailedReason()) && StringUtils.isBlank(borrowingLoan.getFailedReason())) {
        	borrowingLoan.setFailedReason(null);
        }
        if ("".equals(borrowingLoan.getIsDayMarked()) && StringUtils.isBlank(borrowingLoan.getIsDayMarked())) {
        	borrowingLoan.setIsDayMarked(null);
        }
        if ("".equals(borrowingLoan.getIsBidReward()) && StringUtils.isBlank(borrowingLoan.getIsBidReward())) {
        	borrowingLoan.setIsBidReward(null);
        }
        if ("".equals(borrowingLoan.getIsBidMarked()) && StringUtils.isBlank(borrowingLoan.getIsBidMarked())) {
        	borrowingLoan.setIsBidMarked(null);
        }
        if ("".equals(borrowingLoan.getIsBidPwd()) && StringUtils.isBlank(borrowingLoan.getIsBidPwd())) {
        	borrowingLoan.setIsBidPwd(null);
        }
        if ("firstSucess".equals(borrowingLoan.getFirstAuditState())) {//初审通过，借款状态改为招标中
        	borrowingLoan.setLoanState("tendering");
        }
        count = borrowingLoanMapper.updateByPrimaryKeySelective(borrowingLoan);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + borrowingLoan.getLoanCode() + "] 初审借款信息成功");
        } else {
            returnResult.setMsg("发生未知错误，初审借款信息失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: secondAuditBorrowingLoan 
     * @Description: TODO(借款进行复审) 
     * @param @param borrowingLoan
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "BorrowingLoanList_secondAudit")
    public Object secondAuditBorrowingLoan(BorrowingLoan borrowingLoanNew) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        BorrowingLoan borrowingLoan = this.borrowingLoanMapper.selectByPrimaryKey(borrowingLoanNew.getLoanId());
        int count = 0;
        //满标审核站内信通知
        MemberMessageNotice  memberMessageNotice = new MemberMessageNotice();
        memberMessageNotice.setTitle("借款标题为："+borrowingLoanMapper.selectByPrimaryKey(borrowingLoan.getLoanId()).getLoanTitle()+",满标审核通知");
        memberMessageNotice.setContent(borrowingLoan.getSecondMesNotice());
        memberMessageNotice.setAddressee(borrowingLoan.getMemberId());
        memberMessageNoticeService.addMemberMessageNotice(memberMessageNotice);
        
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        borrowingLoan.setSecondAuditorId(pricipalUser.getUserId());
        borrowingLoan.setSecondAuditDate(new Date());
        borrowingLoan.setUpdater(pricipalUser.getUserId());
        borrowingLoan.setUpdateTime(new Date());
        if ("".equals(borrowingLoan.getFailedReason()) && StringUtils.isBlank(borrowingLoan.getFailedReason())) {
        	borrowingLoan.setFailedReason(null);
        }
        if ("".equals(borrowingLoan.getIsDayMarked()) && StringUtils.isBlank(borrowingLoan.getIsDayMarked())) {
        	borrowingLoan.setIsDayMarked(null);
        }
        if ("".equals(borrowingLoan.getIsBidReward()) && StringUtils.isBlank(borrowingLoan.getIsBidReward())) {
        	borrowingLoan.setIsBidReward(null);
        }
        if ("".equals(borrowingLoan.getIsBidMarked()) && StringUtils.isBlank(borrowingLoan.getIsBidMarked())) {
        	borrowingLoan.setIsBidMarked(null);
        }
        if ("".equals(borrowingLoan.getIsBidPwd()) && StringUtils.isBlank(borrowingLoan.getIsBidPwd())) {
        	borrowingLoan.setIsBidPwd(null);
        }
        if ("secondSucess".equals(borrowingLoan.getSecondAuditState())) {//复审通过，借款状态改为还款中
        	//满标进行二次审核时，同时生成还款记录和还款记录明细和收款记录和收款记录明细，记录明细，改变会员资金等数据
        	//添加还款记录信息
            RepaymentNotes repaymentNotes = new RepaymentNotes();
          	repaymentNotes.setLoanId(borrowingLoan.getLoanId());
          	JqReturnJson returnResultRepaymentNotes = (JqReturnJson) repaymentNotesService.addRepaymentNotes(repaymentNotes);
          	RepaymentNotes repaymentNotesNew = (RepaymentNotes) returnResultRepaymentNotes.getObj();
          	//添加还款记录明细信息
          	RepaymentNotesDetail repaymentNotesDetail = new RepaymentNotesDetail();
          	repaymentNotesDetail.setRepayNotesId(repaymentNotesNew.getRepayNotesId());
          	repaymentNotesDetailService.addRepaymentNotesDetail(repaymentNotesDetail,repaymentNotesNew);
          	//添加收款记录信息
          	ReceivablesNotes receivablesNotes = new ReceivablesNotes();
          	JqReturnJson returnResultReceivablesNotes = (JqReturnJson)receivablesNotesService.addReceivablesNotes(receivablesNotes, borrowingLoan);
          	ReceivablesNotes receivablesNotesNew = (ReceivablesNotes) returnResultReceivablesNotes.getObj();
          	//添加收款记录明细信息
          	ReceivablesNotesDetail receivablesNotesDetail = new ReceivablesNotesDetail();
          	JqReturnJson returnResultreceivablesNotesDetail = (JqReturnJson) receivablesNotesDetailService.addReceivablesNotesDetail(receivablesNotesDetail, borrowingLoan, receivablesNotesNew);
          	//添加借款记录明细
          	FinanceTransaction financeTransaction = new FinanceTransaction();
            //获取会员资金记录信息
          	FinanceMember financeMember = (FinanceMember) financeMemberService.getMemberByMemberId(borrowingLoan.getMemberId());
          	financeTransaction.setFinanceMemberId(financeMember.getFinanceMemberId());//设置会员资金信息
          	financeTransaction.setMemberId(borrowingLoan.getMemberId());//设置会员id
          	List<String> memberNames = (List<String>) returnResultreceivablesNotesDetail.getObj();
          	financeTransaction.setTransactionTarget(CollectionsUtil.convertToString(memberNames, ","));//设置交易对象
          	financeTransaction.setTransactionType("借款");//设置交易类型
          	financeTransaction.setEarningMoney(borrowingLoan.getLoanTotal());//设置收入金额
          	financeTransaction.setExpendMoney(0f);//设置支出金额
          	financeTransaction.setUsableMoney(borrowingLoan.getLoanTotal() - borrowingLoan.getLoanTotal() * borrowingLoan.getLoanManagementFees());//设置可用金额
          	financeTransaction.setFrozenMoney(0f);//设置冻结金额
          	financeTransaction.setCollectingMoney(0f);//设置代收金额
          	financeTransaction.setRefundMoney(0f);//设置待还金额
          	financeTransaction.setAmount(borrowingLoan.getLoanTotal());//设置总金额
          	financeTransactionService.addTransaction(financeTransaction);//调用添加记录明细方法
          	//添加系统账户收取管理费记录明细
          	financeTransaction.setTransactionTarget("系统账户");
          	financeTransaction.setTransactionType("借款管理费");//设置交易类型
          	financeTransaction.setEarningMoney(borrowingLoan.getLoanTotal() * borrowingLoan.getLoanManagementFees());//设置收入金额
          	financeTransaction.setUsableMoney(borrowingLoan.getLoanTotal() * borrowingLoan.getLoanManagementFees());//设置可用金额
          	financeTransaction.setAmount(borrowingLoan.getLoanTotal() * borrowingLoan.getLoanManagementFees());//设置总金额
          	financeTransactionService.addTransaction(financeTransaction);//调用添加记录明细方法
          	//更新借款的会员资金信息
          	financeMember.setUsableMoney(financeMember.getUsableMoney() + borrowingLoan.getLoanTotal() -  borrowingLoan.getLoanTotal() * borrowingLoan.getLoanManagementFees());
          	financeMember.setAmount(financeMember.getAmount() +  borrowingLoan.getLoanTotal() - borrowingLoan.getLoanTotal() * borrowingLoan.getLoanManagementFees());
          	financeMemberService.editMember(financeMember);
          	
        	borrowingLoan.setLoanState("repaymenting");
        }
        count = borrowingLoanMapper.updateByPrimaryKeySelective(borrowingLoan);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + borrowingLoan.getLoanCode() + "] 复审借款信息成功");
        } else {
            returnResult.setMsg("发生未知错误，复审借款信息失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delBorrowingLoan 
     * @Description: TODO(删除借款) 
     * @param @param loanIds
     * @param @param loanCodes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "BorrowingLoanList_del")
    public Object delBorrowingLoan(List<String> loanIds, List<String> loanCodes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (loanIds.size() > 0) {
        	BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        	borrowingLoanExample.createCriteria().andLoanIdIn(loanIds);
            count = borrowingLoanMapper.deleteByExample(borrowingLoanExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(loanCodes, ",") + " ]借款");
            } else {
                returnResult.setMsg("发生未知错误，借款信息删除失败");
            }
        }
        return returnResult;
    }
}
