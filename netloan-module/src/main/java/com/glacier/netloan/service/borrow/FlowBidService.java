package com.glacier.netloan.service.borrow;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.netloan.dao.borrow.BorrowingLoanMapper;
import com.glacier.netloan.dao.borrow.TenderNotesMapper;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.BorrowingLoanExample;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.borrow.TenderNotesExample;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.service.finance.FinanceMemberService;
import com.glacier.netloan.service.finance.FinanceTransactionService;

@Service("flowBidService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class FlowBidService {
	
	@Autowired
    private BorrowingLoanMapper borrowingLoanMapper;
	
	@Autowired
	private TenderNotesMapper tenderNotesMapper;
	
	@Autowired
	private FinanceMemberService financeMemberService;
	
	@Autowired
	private FinanceTransactionService financeTransactionService;
	
	/**
	 * @Title: createFlowBid 
	 * @Description: TODO(这个是定时器的一个方法，判断借款的筹标期限是否过期，如果过期设置借款为流标，并解冻投标金额) 
	 * @param  设定文件
	 * @return void  返回类型
	 * @throws 
	 *
	 */
	@Transactional(readOnly = false)
	public void createFlowBid(){
		
		BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
		borrowingLoanExample.createCriteria().andLoanStateEqualTo("tendering");
		
		List<BorrowingLoan>  borrowingLoans = borrowingLoanMapper.selectByExample(borrowingLoanExample); // 查询所有借款列表
		for(BorrowingLoan borrowingLoan : borrowingLoans){
			Calendar c = Calendar.getInstance();
	    	c.setTime(borrowingLoan.getFirstAuditDate());//获取初审通过时间
		    c.add(Calendar.DAY_OF_MONTH, Integer.valueOf(borrowingLoan.getWaitBidDeadlines()));//在初审通过时间，加上筹标期限
		    Date n = new Date();
		    long nowTime = n.getTime();
		    long cTime = c.getTimeInMillis();
		    if(nowTime > cTime){//如果现在时间大于筹标期限，则将冻结的投标金额进行解冻
	        	TenderNotesExample tenderNotesExample = new TenderNotesExample();;
	            tenderNotesExample.createCriteria().andLoanIdEqualTo(borrowingLoan.getLoanId());//查询相对应的投标的记录
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
	                  	financeTransaction.setRemark("借款["+borrowingLoan.getLoanTitle()+"]变为流标,解冻投标金额["+tenderNotes.getTenderMoney()+"]元");//设置备注
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
	                  	financeTransaction.setRemark("借款["+borrowingLoan.getLoanTitle()+"]变为流标,解冻投标金额["+borrowingLoan.getLowestSub()*tenderNotes.getSubSum()+"]元");//设置备注
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
	            borrowingLoan.setRemark("已过筹标期限，此借款变成流标。");
	            borrowingLoanMapper.updateByPrimaryKeySelective(borrowingLoan);//修改借款状态等
		    }
		}
		
		
	}
}
