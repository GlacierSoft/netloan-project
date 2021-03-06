package com.glacier.netloan.service.borrow; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.netloan.dao.basicdatas.ParameterBasicMapper;
import com.glacier.netloan.dao.borrow.BorrowingLoanMapper;
import com.glacier.netloan.dao.borrow.ReceivablesNotesDetailMapper;
import com.glacier.netloan.dao.borrow.ReceivablesNotesMapper;
import com.glacier.netloan.dao.borrow.RepaymentNotesDetailMapper;
import com.glacier.netloan.dao.borrow.RepaymentNotesMapper;
import com.glacier.netloan.dao.borrow.TenderNotesMapper;
import com.glacier.netloan.dao.member.MemberStatisticsMapper;

@Service("borrowingOverdueService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class BorrowingOverdueService {
	
	@Autowired
    private BorrowingLoanMapper borrowingLoanMapper;
	
	@Autowired
	private TenderNotesMapper tenderNotesMapper;
	
	@Autowired
	private RepaymentNotesMapper repaymentNotesMapper;
	
	@Autowired
	private RepaymentNotesDetailMapper repaymentNotesDetailMapper;

	@Autowired
	private MemberStatisticsMapper memberStatisticsMapper; 
	
	@Autowired
	private ParameterBasicMapper parameterBasicMapper;
	
	@Autowired
	private ReceivablesNotesDetailMapper receivablesNotesDetailMapper;
	
	@Autowired
	private ReceivablesNotesMapper receivablesNotesMapper;
	
	/**
	 * @Title: createFlowBid 
	 * @Description: TODO(这个是定时器的一个方法，判断还款明细记录和收款明细记录是否逾期，如果过期增加逾期罚款金额和利息还有逾期天数) 
	 * @param  设定文件
	 * @return void  返回类型
	 * @throws 
	 *
	 */
	/*@Transactional(readOnly = false)
	public void handleBorrowingOverdue(){
		RepaymentNotesDetailExample repaymentNotesDetailExample = new RepaymentNotesDetailExample();
		repaymentNotesDetailExample.createCriteria().andRepayStateEqualTo("notRepay");
		List<RepaymentNotesDetail>  repaymentNotesDetails = repaymentNotesDetailMapper.selectByExample(repaymentNotesDetailExample); // 查询所有状态为"未还"的还款明细列表
		ReceivablesNotesDetailExample receivablesNotesDetailExample = new ReceivablesNotesDetailExample();
		receivablesNotesDetailExample.createCriteria().andReceStateEqualTo("notReceiving");
		List<ReceivablesNotesDetail>  receivablesNotesDetails = receivablesNotesDetailMapper.selectByExample(receivablesNotesDetailExample); // 查询所有状态为"未收"的收款明细列表
		
		//获取当前时间
		Date n = new Date();
	    long nowTime = n.getTime();
	    Calendar c = Calendar.getInstance();
	    ParameterBasicExample parameterBasicExample = new ParameterBasicExample();
    	parameterBasicExample.createCriteria().andBasicTitleEqualTo("罚息利率1至30天");
        List<ParameterBasic>  basicTitles1 = parameterBasicMapper.selectByExample(parameterBasicExample); // 查询所有基础参数列表
	    ParameterBasic parameterBasic1 = basicTitles1.get(0);
	    parameterBasicExample.clear();
	    
	    parameterBasicExample.createCriteria().andBasicTitleEqualTo("罚息利率30天以上");
        List<ParameterBasic>  basicTitles2 = parameterBasicMapper.selectByExample(parameterBasicExample); // 查询所有基础参数列表
	    ParameterBasic parameterBasic2 = basicTitles2.get(0);
	    parameterBasicExample.clear();
	    
	    parameterBasicExample.createCriteria().andBasicTitleEqualTo("逾期管理费1至30天");
        List<ParameterBasic>  basicTitles3 = parameterBasicMapper.selectByExample(parameterBasicExample); // 查询所有基础参数列表
	    ParameterBasic parameterBasic3 = basicTitles3.get(0);
	    parameterBasicExample.clear();
	    
	    parameterBasicExample.createCriteria().andBasicTitleEqualTo("逾期管理费30天以上");
        List<ParameterBasic>  basicTitles4 = parameterBasicMapper.selectByExample(parameterBasicExample); // 查询所有基础参数列表
	    ParameterBasic parameterBasic4 = basicTitles4.get(0);
	    parameterBasicExample.clear();
	    
	    parameterBasicExample.createCriteria().andBasicTitleEqualTo("利息管理费");
        List<ParameterBasic>  basicTitles5 = parameterBasicMapper.selectByExample(parameterBasicExample); // 查询所有基础参数列表
        ParameterBasic parameterBasic5 = basicTitles5.get(0);
        
	    //ParameterBasic parameterBasic2 = (ParameterBasic) parameterBasicService.getParameterBasicByTitle("罚息利率30天以上");
	    //ParameterBasic parameterBasic3 = (ParameterBasic) parameterBasicService.getParameterBasicByTitle("逾期管理费1至30天");
	    //ParameterBasic parameterBasic4 = (ParameterBasic) parameterBasicService.getParameterBasicByTitle("逾期管理费30天以上");
		for(RepaymentNotesDetail repaymentNotesDetail : repaymentNotesDetails){//改变还款记录和还款记录明细
	    	c.setTime(repaymentNotesDetail.getShouldPayDate());//获取当期应还时间
		    long overDayReal = 0;//真正的逾期天数
	    	long cTime = c.getTimeInMillis();//获取当期应还时间的毫秒数
		    long overTime = (nowTime - cTime)/1000;//获取逾期时间,除以1000是为了转换成秒
		    long overDay = overTime/(24*60*60);//计算逾期天数
		    long overHour = overTime%(24*60*60)/3600;//计算逾期小时数
			long overMinute = overTime%3600/60;//计算逾期分钟
		    long overSecond = overTime%60/60;//计算逾期秒数
		    int count=0;
		    if(overHour == 0 && overMinute == 0 && overSecond == 0){//判断如果逾期的小时，分钟，秒数都等于零时，
		    	overDayReal = overDay;
		    }else{
		    	overDayReal = overDay + 1;
		    }
		    if(overDayReal > 0){//判断是否逾期
		    	float overdueInterest = 0f;//计算当期逾期罚息
		    	float overdueManaFee = 0f;//计算当期的逾期管理费
		    	if(overDayReal < 30){
		    		overdueInterest = repaymentNotesDetail.getCurrentPayMoeny() * overDayReal * Float.parseFloat(parameterBasic1.getBasicValue());//计算当期逾期罚息
		    		overdueManaFee = repaymentNotesDetail.getCurrentPayMoeny() * overDayReal * Float.parseFloat(parameterBasic3.getBasicValue());//计算当期的逾期管理费
		    	}else if(overDayReal > 30){
		    		overdueInterest = (repaymentNotesDetail.getCurrentPayMoeny() * 30 * Float.parseFloat(parameterBasic1.getBasicValue()))
		    							+ (repaymentNotesDetail.getCurrentPayMoeny() * overDayReal * Float.parseFloat(parameterBasic2.getBasicValue()));//计算当期逾期罚息
		    		overdueManaFee = (repaymentNotesDetail.getCurrentPayMoeny() * 30 * Float.parseFloat(parameterBasic3.getBasicValue()))
							+ (repaymentNotesDetail.getCurrentPayMoeny() * overDayReal * Float.parseFloat(parameterBasic4.getBasicValue()));//计算当期的逾期管理费
		    	}
		    	float currOverDueMoney = (overdueInterest - repaymentNotesDetail.getOverdueInterest())
		    							+(overdueManaFee - repaymentNotesDetail.getOverdueManaFee());//当期新增的罚款
		    	repaymentNotesDetail.setIsOverdue("yes");//设置当期还款为逾期状态
		    	repaymentNotesDetail.setOverdueDays(overDayReal+"");//设置逾期天数
		    	repaymentNotesDetail.setOverdueManaFee(overdueManaFee);//设置当期逾期管理费
		    	repaymentNotesDetail.setOverdueInterest(overdueInterest);//设置当期逾期罚息
		    	repaymentNotesDetail.setUpdateTime(new Date());
		    	count = repaymentNotesDetailMapper.updateByPrimaryKeySelective(repaymentNotesDetail);//更新还款记录明细
		    	RepaymentNotes repaymentNotes = repaymentNotesMapper.selectByPrimaryKey(repaymentNotesDetail.getRepayNotesId());//获取还款记录信息
//		    	repaymentNotes.setRepaymentTotal(repaymentNotes.getRepaymentTotal() + currOverDueMoney);//设置还款记录的还款总金额
//		    	repaymentNotes.setUpdateTime(new Date());
//		    	count=repaymentNotesMapper.updateByPrimaryKeySelective(repaymentNotes);//更新还款记录 
		    	 
		    	if(count==1){
		    		//更新会员统计中逾期还款次数+1，逾期罚款金额和逾期罚款利息
			    	//第一步根据还款记录中的借款ID取出完整的借款信息
			    	BorrowingLoan borrowingLoan = borrowingLoanMapper.selectByPrimaryKey(repaymentNotes.getLoanId());
			    	//第二步根据借款信息中的借款人查询出会员统计信息
			    	MemberStatistics memberStatisticsRepay = memberStatisticsMapper.selectByMemberId(borrowingLoan.getMemberId());
			    	memberStatisticsRepay.setLateRepayment(memberStatisticsRepay.getLateRepayment()+1);//逾期罚款次数+1
			    	memberStatisticsRepay.setOverdueFineAmount(memberStatisticsRepay.getOverdueFineAmount()+currOverDueMoney);//设置逾期罚款金额
			    	memberStatisticsRepay.setOverdueInterestAmount(memberStatisticsRepay.getOverdueInterestAmount()+overdueInterest);//设置逾期利息总额
			    	memberStatisticsRepay.setUpdateTime(new Date());
			    	//执行更新会员统计信息
			    	memberStatisticsMapper.updateByPrimaryKeySelective(memberStatisticsRepay);
		    		//待做逾期罚款记录操作
		    	}
		    }
		}
		
		for(ReceivablesNotesDetail receivablesNotesDetail : receivablesNotesDetails){//更新修改收款记录和收款记录明细
	    	c.setTime(receivablesNotesDetail.getShouldReceDate());//获取当期应收时间
		    long overDayReal = 0;//真正的逾期天数
	    	long cTime = c.getTimeInMillis();//获取当期应收时间的毫秒数
		    long overTime = (nowTime - cTime)/1000;//获取逾期时间,除以1000是为了转换成秒
		    long overDay = overTime/(24*60*60);//计算逾期天数
		    long overHour = overTime%(24*60*60)/3600;//计算逾期小时数
			long overMinute = overTime%3600/60;//计算逾期分钟
		    long overSecond = overTime%60/60;//计算逾期秒数
		    if(overHour == 0 && overMinute == 0 && overSecond == 0){//判断如果逾期的小时，分钟，秒数都等于零时，
		    	overDayReal = overDay;
		    }else{
		    	overDayReal = overDay + 1;
		    }
		    if(overDayReal > 0){//判断是否逾期
		    	float overdueInterest = 0f;//计算当期逾期罚息
		    	if(overDayReal < 30){
		    		overdueInterest = receivablesNotesDetail.getCurrentReceMoeny() * overDayReal * Float.parseFloat(parameterBasic1.getBasicValue());//计算当期逾期罚息
		    	}else if(overDayReal > 30){
		    		overdueInterest = (receivablesNotesDetail.getCurrentReceMoeny() * 30 * Float.parseFloat(parameterBasic1.getBasicValue()))
		    							+ (receivablesNotesDetail.getCurrentReceMoeny() * overDayReal * Float.parseFloat(parameterBasic2.getBasicValue()));//计算当期逾期罚息
		    	}
		    	//float currOverDueMoney = overdueInterest - receivablesNotesDetail.getOverdueInterest();//当期新增的罚款
		    	receivablesNotesDetail.setIsOverdue("yes");//设置当期收款为逾期状态
		    	receivablesNotesDetail.setOverdueDays((float) overDayReal);//设置逾期天数
		    	receivablesNotesDetail.setOverdueInterest(overdueInterest);//设置当期逾期罚息
		    	float Interest = receivablesNotesDetail.getCurrentReceInterest() + receivablesNotesDetail.getOverdueInterest();//利息总费=应收利息+逾期罚息
		    	receivablesNotesDetail.setInterestManaFee(Interest * Float.valueOf(parameterBasic5.getBasicValue()));//设置利息管理费=利息总费*利息管理费费率
		    	receivablesNotesDetail.setIncome(Interest - receivablesNotesDetail.getInterestManaFee());//设置收益=利息总费-利息管理费
		    	receivablesNotesDetail.setUpdateTime(new Date());
		    	int count = receivablesNotesDetailMapper.updateByPrimaryKeySelective(receivablesNotesDetail);//更新收款记录明细
		    	if (count == 1) {
                    //ReceivablesNotes receivablesNotes = receivablesNotesMapper.selectByPrimaryKey(receivablesNotesDetail.getReceNotesId());//获取收款记录信息
                    //receivablesNotes.setReceivablesTotal(receivablesNotes.getReceivablesTotal() + currOverDueMoney);//设置收款记录的收款总金额
                    //receivablesNotes.setUpdateTime(new Date());
                    //receivablesNotesMapper.updateByPrimaryKeySelective(receivablesNotes);//更新还款记录
		    	}
		    }
		}
		
	}*/
}
