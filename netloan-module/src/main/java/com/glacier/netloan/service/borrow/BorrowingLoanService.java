/*
 * @(#)BorrowingLoanService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.borrow;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.borrow.BorrowingLoanMapper;
import com.glacier.netloan.dao.borrow.TenderNotesMapper;
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
import com.glacier.netloan.entity.borrow.TenderNotesExample;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.entity.member.MemberMessageNotice;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
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
	
	@Autowired
	private TenderNotesMapper tenderNotesMapper;
	
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
    	Calendar c = Calendar.getInstance();
    	if(borrowingLoan.getFirstAuditDate() != null){
    		c.setTime(borrowingLoan.getFirstAuditDate());//获取初审通过时间
    	    c.add(Calendar.DAY_OF_MONTH, Integer.valueOf(borrowingLoan.getWaitBidDeadlines()));//在初审通过时间，加上筹标期限
    	    c.set(Calendar.HOUR_OF_DAY, 23);//将当天小时设置到23时
			c.set(Calendar.MINUTE, 59);//将当天分钟设置到59分
			c.set(Calendar.SECOND, 59);//将当天秒数设置到59秒
    	    borrowingLoan.setWaitBidDeadlinesDate(c.getTime());
    	}
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
    public Object addBorrowingLoan(BorrowingLoan borrowingLoan, boolean captchaBoolean) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        // 防止验证码错误
        if (!captchaBoolean) {
        	returnResult.setMsg("验证码错误，请重新输入");
            return returnResult;
        }
        int count = 0;
        // 防止同一个会员发布相同借款标题的借款信息
        borrowingLoanExample.createCriteria().andLoanTitleEqualTo(borrowingLoan.getLoanTitle()).andMemberIdEqualTo(borrowingLoan.getMemberId());
        count = borrowingLoanMapper.countByExample(borrowingLoanExample);// 查找同一个会员相同标题的借款数量
        if (count > 0) {
            returnResult.setMsg("您发布的借款标题重复，请重新输入");
            return returnResult;
        }
        
        borrowingLoan.setLoanId(RandomGUID.getRandomGUID());//初始化一些借款信息
        // 赋值于借款记录的借款编号
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        borrowingLoan.setLoanCode("借款"+ "_" + dateFormat.format(new Date()));
        
        if (!"".equals(borrowingLoan.getBidProReward()) && null != borrowingLoan.getBidProReward()) {// 投标金额比例奖励转换为百分比格式
            borrowingLoan.setBidProReward(borrowingLoan.getBidProReward()/100);
        } else {
            borrowingLoan.setBidProReward((float) 0);
        }
        if ("".equals(borrowingLoan.getFixedAppReward()) || null == borrowingLoan.getFixedAppReward()) {// 投标金额固定奖励
            borrowingLoan.setFixedAppReward((float) 0);
        }
        if (!"".equals(borrowingLoan.getLoanApr()) && null != borrowingLoan.getLoanApr()) {
            borrowingLoan.setLoanApr(borrowingLoan.getLoanApr()/100);
        }
        
        borrowingLoan.setLoanState("firstAudit");
        borrowingLoan.setIsBidMarked("yes");
        borrowingLoan.setIsAccountFunds("yes");
        borrowingLoan.setIsLoanFunds("yes");
        borrowingLoan.setIsCreditAmount("yes");
        borrowingLoan.setIsBidFunds("yes");
        borrowingLoan.setIsAutomaticBid("yes");
        borrowingLoan.setIsRecommend("yes");

        UserExample userExample = new UserExample();//查找出超级管理员信息
        userExample.createCriteria().andUsernameEqualTo("admin");
        List<User> users = userMapper.selectByExample(userExample);
        
        borrowingLoan.setCreater(borrowingLoan.getMemberId());
        borrowingLoan.setCreateTime(new Date());
        borrowingLoan.setLoanDate(new Date());
        borrowingLoan.setUpdater(users.get(0).getUserId());
        borrowingLoan.setUpdateTime(new Date());
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
        memberMessageNotice.setTitle("借款标题为："+borrowingLoan.getLoanTitle()+",满标审核通知");
        memberMessageNotice.setContent(borrowingLoanNew.getSecondMesNotice());
        memberMessageNotice.setAddressee(borrowingLoanNew.getMemberId());
        memberMessageNoticeService.addMemberMessageNotice(memberMessageNotice);
        
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        borrowingLoanNew.setSecondAuditorId(pricipalUser.getUserId());
        borrowingLoanNew.setSecondAuditDate(new Date());
        borrowingLoanNew.setUpdater(pricipalUser.getUserId());
        borrowingLoanNew.setUpdateTime(new Date());
        if ("".equals(borrowingLoanNew.getFailedReason()) && StringUtils.isBlank(borrowingLoanNew.getFailedReason())) {
        	borrowingLoanNew.setFailedReason(null);
        }
        if ("".equals(borrowingLoanNew.getIsDayMarked()) && StringUtils.isBlank(borrowingLoanNew.getIsDayMarked())) {
        	borrowingLoanNew.setIsDayMarked(null);
        }
        if ("".equals(borrowingLoanNew.getIsBidReward()) && StringUtils.isBlank(borrowingLoanNew.getIsBidReward())) {
        	borrowingLoanNew.setIsBidReward(null);
        }
        if ("".equals(borrowingLoanNew.getIsBidMarked()) && StringUtils.isBlank(borrowingLoanNew.getIsBidMarked())) {
        	borrowingLoanNew.setIsBidMarked(null);
        }
        if ("".equals(borrowingLoanNew.getIsBidPwd()) && StringUtils.isBlank(borrowingLoanNew.getIsBidPwd())) {
        	borrowingLoanNew.setIsBidPwd(null);
        }
        if ("secondSucess".equals(borrowingLoanNew.getSecondAuditState())) {//复审通过，借款状态改为还款中
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
          	 //添加会员资金记录明细
          	FinanceTransaction financeTransaction = new FinanceTransaction();
            //获取会员资金记录信息
          	FinanceMember financeMember = (FinanceMember) financeMemberService.getMemberByMemberId(borrowingLoan.getMemberId());
          	financeTransaction.setFinanceMemberId(financeMember.getFinanceMemberId());//设置会员资金信息
          	financeTransaction.setMemberId(borrowingLoan.getMemberId());//设置会员id
          	List<String> memberNames = (List<String>) returnResultreceivablesNotesDetail.getObj();
          	financeTransaction.setTransactionTarget(CollectionsUtil.convertToString(memberNames, ","));//设置交易对象
          	financeTransaction.setTransactionType("借款成功");//设置交易类型
          	financeTransaction.setRemark("借款["+borrowingLoan.getLoanTitle()+"]复审通过,借款成功筹到资金["+borrowingLoan.getLoanTotal()+"]元");//设置备注
          	financeTransaction.setEarningMoney(borrowingLoan.getLoanTotal());//设置收入金额
          	financeTransaction.setExpendMoney(0f);//设置支出金额
          	//financeTransaction.setUsableMoney(borrowingLoan.getLoanTotal() - borrowingLoan.getLoanTotal() * borrowingLoan.getLoanManagementFees());//设置可用金额
          	financeTransaction.setUsableMoney(borrowingLoan.getLoanTotal() + financeMember.getUsableMoney());//设置可用金额
          	financeTransaction.setFrozenMoney(financeMember.getFrozenMoney());//设置冻结金额
          	financeTransaction.setCollectingMoney(financeMember.getCollectingMoney());//设置代收金额
          	financeTransaction.setRefundMoney(financeMember.getRefundMoney());//设置待还金额
          	financeTransaction.setAmount(borrowingLoan.getLoanTotal()+financeMember.getAmount());//设置总金额
          	financeTransactionService.addTransaction(financeTransaction);//调用添加记录明细方法
          	//添加系统账户收取管理费记录明细
          	/*financeTransaction.setTransactionTarget("系统账户");
          	financeTransaction.setTransactionType("借款管理费");//设置交易类型
          	financeTransaction.setEarningMoney(borrowingLoan.getLoanTotal() * borrowingLoan.getLoanManagementFees());//设置收入金额
          	financeTransaction.setUsableMoney(borrowingLoan.getLoanTotal() * borrowingLoan.getLoanManagementFees());//设置可用金额
          	financeTransaction.setAmount(borrowingLoan.getLoanTotal() * borrowingLoan.getLoanManagementFees());//设置总金额
          	financeTransactionService.addTransaction(financeTransaction);//调用添加记录明细方法
          	 */          	
          	//更新借款的会员资金信息
          	financeMember.setUsableMoney(financeMember.getUsableMoney() + borrowingLoan.getLoanTotal());//设置会员资金可用金额
          	financeMember.setAmount(financeMember.getAmount() +  borrowingLoan.getLoanTotal());//设置会员资金总金额
          	financeMemberService.editMember(financeMember);
          	//判断借款是否设置投标奖励
          	if(borrowingLoan.getIsBidReward().equals("yes")){
          		if(borrowingLoan.getFixedAppReward() != 0.0){//按固定金额分摊奖励
          			//添加会员资金记录明细
                  	FinanceMember financeMemberNew = (FinanceMember) financeMemberService.getMemberByMemberId(borrowingLoan.getMemberId());//获取会员资金记录信息
                  	financeTransaction.setFinanceMemberId(financeMemberNew.getFinanceMemberId());//设置会员资金信息
                  	financeTransaction.setMemberId(borrowingLoan.getMemberId());//设置会员id
                  	List<String> memberNamesNew = (List<String>) returnResultreceivablesNotesDetail.getObj();
                  	financeTransaction.setTransactionTarget(CollectionsUtil.convertToString(memberNamesNew, ","));//设置交易对象
                  	financeTransaction.setTransactionType("扣除借款奖励");//设置交易类型
                  	financeTransaction.setRemark("扣除借款奖励["+borrowingLoan.getFixedAppReward()+"]元");//设置备注
                  	financeTransaction.setEarningMoney(0f);//设置收入金额
                  	financeTransaction.setExpendMoney(borrowingLoan.getFixedAppReward());//设置支出金额
                  	financeTransaction.setUsableMoney(financeMemberNew.getUsableMoney() - borrowingLoan.getFixedAppReward());//设置可用金额
                  	financeTransaction.setFrozenMoney(financeMemberNew.getFrozenMoney());//设置冻结金额
                  	financeTransaction.setCollectingMoney(financeMemberNew.getCollectingMoney());//设置代收金额
                  	financeTransaction.setRefundMoney(financeMemberNew.getRefundMoney());//设置待还金额
                  	financeTransaction.setAmount(financeMemberNew.getAmount() - borrowingLoan.getFixedAppReward());//设置总金额
                  	financeTransactionService.addTransaction(financeTransaction);//调用添加记录明细方法
                  	//更新借款的会员资金信息
                  	financeMemberNew.setUsableMoney(financeMemberNew.getUsableMoney() - borrowingLoan.getFixedAppReward());//设置会员资金可用金额
                  	financeMemberNew.setAmount(financeMemberNew.getAmount() -  borrowingLoan.getFixedAppReward());//设置会员资金总金额
                  	financeMemberService.editMember(financeMemberNew);
          		}else if(borrowingLoan.getBidProReward() != 0.0){//判断是按投标金额比例奖励
          			//添加会员资金记录明细
                  	FinanceMember financeMemberNew = (FinanceMember) financeMemberService.getMemberByMemberId(borrowingLoan.getMemberId());//获取会员资金记录信息
                  	financeTransaction.setFinanceMemberId(financeMemberNew.getFinanceMemberId());//设置会员资金信息
                  	financeTransaction.setMemberId(borrowingLoan.getMemberId());//设置会员id
                  	List<String> memberNamesNew = (List<String>) returnResultreceivablesNotesDetail.getObj();
                  	financeTransaction.setTransactionTarget(CollectionsUtil.convertToString(memberNamesNew, ","));//设置交易对象
                  	financeTransaction.setTransactionType("扣除借款奖励");//设置交易类型
                  	financeTransaction.setRemark("扣除借款奖励["+borrowingLoan.getBidProReward()*borrowingLoan.getLoanTotal()+"]元");//设置备注
                  	financeTransaction.setEarningMoney(0f);//设置收入金额
                  	financeTransaction.setExpendMoney(borrowingLoan.getBidProReward()*borrowingLoan.getLoanTotal());//设置支出金额
                  	financeTransaction.setUsableMoney(financeMemberNew.getUsableMoney() - borrowingLoan.getBidProReward()*borrowingLoan.getLoanTotal());//设置可用金额
                  	financeTransaction.setFrozenMoney(financeMemberNew.getFrozenMoney());//设置冻结金额
                  	financeTransaction.setCollectingMoney(financeMemberNew.getCollectingMoney());//设置代收金额
                  	financeTransaction.setRefundMoney(financeMemberNew.getRefundMoney());//设置待还金额
                  	financeTransaction.setAmount(financeMemberNew.getAmount() - borrowingLoan.getBidProReward()*borrowingLoan.getLoanTotal());//设置总金额
                  	financeTransactionService.addTransaction(financeTransaction);//调用添加记录明细方法
                  	//更新借款的会员资金信息
                  	financeMemberNew.setUsableMoney(financeMemberNew.getUsableMoney() - borrowingLoan.getBidProReward()*borrowingLoan.getLoanTotal());//设置会员资金可用金额
                  	financeMemberNew.setAmount(financeMemberNew.getAmount() -  borrowingLoan.getBidProReward()*borrowingLoan.getLoanTotal());//设置会员资金总金额
                  	financeMemberService.editMember(financeMemberNew);
          		}
          	}
          	
        	borrowingLoan.setLoanState("repaymenting");
        }
        if ("secondFailure".equals(borrowingLoanNew.getSecondAuditState())) {//复审不通过，借款状态改为流标
        	TenderNotesExample tenderNotesExample = new TenderNotesExample();;
            tenderNotesExample.createCriteria().andLoanIdEqualTo(borrowingLoanNew.getLoanId());//查询相对应的投标的记录
            List<TenderNotes> tenderNotess = tenderNotesMapper.selectByExample(tenderNotesExample);
            if(borrowingLoan.getSubTotal() == 0.0){//借款是以金额进行投资的
            	for(TenderNotes tenderNotes : tenderNotess){
                	//添加会员资金记录明细
                  	FinanceTransaction financeTransaction = new FinanceTransaction();
                	//添加会员"解冻投标金额"的资金记录明细
                  	FinanceMember financeMemberThaw = (FinanceMember) financeMemberService.getMemberByMemberId(tenderNotes.getMemberId());//获取会员资金记录信息
                  	financeTransaction.setFinanceMemberId(financeMemberThaw.getFinanceMemberId());//设置会员资金信息
                  	financeTransaction.setMemberId(tenderNotes.getMemberId());//设置会员id
                  	financeTransaction.setTransactionTarget(tenderNotes.getLoanMemberDisplay());//设置交易对象
                  	financeTransaction.setTransactionType("解冻投标金额");//设置交易类型
                  	financeTransaction.setRemark("借款["+borrowingLoan.getLoanTitle()+"]审核不通过,解冻投标金额["+tenderNotes.getTenderMoney()+"]元");//设置备注
                  	financeTransaction.setEarningMoney(tenderNotes.getTenderMoney());//设置收入金额
                  	financeTransaction.setExpendMoney(0f);//设置支出金额
                  	financeTransaction.setUsableMoney(financeMemberThaw.getUsableMoney()+tenderNotes.getTenderMoney());//设置可用金额
                  	financeTransaction.setFrozenMoney(financeMemberThaw.getFrozenMoney()-tenderNotes.getTenderMoney());//设置冻结金额
                  	financeTransaction.setCollectingMoney(financeMemberThaw.getCollectingMoney());//设置代收金额
                  	financeTransaction.setRefundMoney(financeMemberThaw.getRefundMoney());//设置待还金额
                  	financeTransaction.setAmount(financeMemberThaw.getAmount()+tenderNotes.getTenderMoney());//设置总金额
                  	financeTransactionService.addTransaction(financeTransaction);//调用添加记录明细方法
                  	//更新借款的会员资金信息
                  	financeMemberThaw.setFrozenMoney(financeMemberThaw.getFrozenMoney()-tenderNotes.getTenderMoney());//设置冻结金额
                  	financeMemberThaw.setUsableMoney(financeMemberThaw.getUsableMoney() + tenderNotes.getTenderMoney());//设置会员资金可用金额
                  	financeMemberThaw.setAmount(financeMemberThaw.getAmount() +  tenderNotes.getTenderMoney());//设置会员资金总金额
                  	financeMemberService.editMember(financeMemberThaw);
                	borrowingLoan.setLoanState("bids");
                }
            }else{//借款是认购份数进行投资的
            	for(TenderNotes tenderNotes : tenderNotess){
                	//添加会员资金记录明细
                  	FinanceTransaction financeTransaction = new FinanceTransaction();
                  	 //添加会员"解冻投标金额"的资金记录明细
                  	FinanceMember financeMemberThaw = (FinanceMember) financeMemberService.getMemberByMemberId(tenderNotes.getMemberId());//获取会员资金记录信息
                  	financeTransaction.setFinanceMemberId(financeMemberThaw.getFinanceMemberId());//设置会员资金信息
                  	financeTransaction.setMemberId(tenderNotes.getMemberId());//设置会员id
                  	financeTransaction.setTransactionTarget(tenderNotes.getLoanMemberDisplay());//设置交易对象
                  	financeTransaction.setTransactionType("解冻投标金额");//设置交易类型
                  	financeTransaction.setRemark("借款["+borrowingLoan.getLoanTitle()+"]审核不通过,解冻投标金额["+borrowingLoan.getLowestSub()*tenderNotes.getSubSum()+"]元");//设置备注
                  	financeTransaction.setEarningMoney(borrowingLoan.getLowestSub()*tenderNotes.getSubSum());//设置收入金额
                  	financeTransaction.setExpendMoney(0f);//设置支出金额
                  	financeTransaction.setUsableMoney(financeMemberThaw.getUsableMoney()+borrowingLoan.getLowestSub()*tenderNotes.getSubSum());//设置可用金额
                  	financeTransaction.setFrozenMoney(financeMemberThaw.getFrozenMoney()-tenderNotes.getTenderMoney());//设置冻结金额
                  	financeTransaction.setCollectingMoney(financeMemberThaw.getCollectingMoney());//设置代收金额
                  	financeTransaction.setRefundMoney(financeMemberThaw.getRefundMoney());//设置待还金额
                  	financeTransaction.setAmount(financeMemberThaw.getAmount()+borrowingLoan.getLowestSub()*tenderNotes.getSubSum());//设置总金额
                  	financeTransactionService.addTransaction(financeTransaction);//调用添加记录明细方法
                  	//更新借款的会员资金信息
                  	financeMemberThaw.setFrozenMoney(financeMemberThaw.getFrozenMoney()-borrowingLoan.getLowestSub()*tenderNotes.getSubSum());//设置冻结金额
                  	financeMemberThaw.setUsableMoney(financeMemberThaw.getUsableMoney() + borrowingLoan.getLowestSub()*tenderNotes.getSubSum());//设置会员资金可用金额
                  	financeMemberThaw.setAmount(financeMemberThaw.getAmount() +  borrowingLoan.getLowestSub()*tenderNotes.getSubSum());//设置会员资金总金额
                  	financeMemberService.editMember(financeMemberThaw);
                }
            }
            	borrowingLoan.setFailedReason("other");
            	borrowingLoan.setLoanState("bids");
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
    
    /**
     * @Title: getBorrowingLoanFirstAuditNum 
     * @Description: TODO(根据借款状态查找该借款的信息记录条数) 
     * @param  @param loanState
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getBorrowingLoanNumByLoanState(String loanState) {
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        borrowingLoanExample.createCriteria().andLoanStateEqualTo(loanState);
        int borrowloanNum = borrowingLoanMapper.countByExample(borrowingLoanExample); // 查询总页数
        return borrowloanNum;
    }
    
    /**
     * @Title: getBorrowingLoanNumByLoanStateAndMemberId 
     * @Description: TODO(根据借款状态和会员ID查找该借款的信息记录条数) 
     * @param  @param loanState
     * @param  @param MemberId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getBorrowingLoanNumByLoanStateAndMemberId(String loanState, String MemberId) {
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        borrowingLoanExample.createCriteria().andLoanStateEqualTo(loanState).andMemberIdEqualTo(MemberId);
        int borrowloanNum = borrowingLoanMapper.countByExample(borrowingLoanExample); // 查询总条数
        return borrowloanNum;
    }
    
    /**
     * @Title: getBorrowingLoanNumByMemberId 
     * @Description: TODO(查询该会员的借款记录条数) 
     * @param  @param MemberId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getBorrowingLoanNumByMemberId(String MemberId) {
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        borrowingLoanExample.createCriteria().andMemberIdEqualTo(MemberId);
        int borrowingLoanNum = borrowingLoanMapper.countByExample(borrowingLoanExample); // 查询总条数
        return borrowingLoanNum;
    }
}
