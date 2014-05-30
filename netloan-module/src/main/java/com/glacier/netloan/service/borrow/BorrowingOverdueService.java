package com.glacier.netloan.service.borrow;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.netloan.dao.borrow.BorrowingLoanMapper;
import com.glacier.netloan.dao.borrow.RepaymentNotesDetailMapper;
import com.glacier.netloan.dao.borrow.RepaymentNotesMapper;
import com.glacier.netloan.dao.borrow.TenderNotesMapper;
import com.glacier.netloan.entity.basicdatas.ParameterBasic;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.BorrowingLoanExample;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetail;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetailExample;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.borrow.TenderNotesExample;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.service.basicdatas.ParameterBasicService;
import com.glacier.netloan.service.finance.FinanceMemberService;
import com.glacier.netloan.service.finance.FinanceTransactionService;

@Service("borrowingOverdueService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class BorrowingOverdueService {
	
	@Autowired
    private BorrowingLoanMapper borrowingLoanMapper;
	
	@Autowired
	private TenderNotesMapper tenderNotesMapper;
	
	@Autowired
	private FinanceMemberService financeMemberService;
	
	@Autowired
	private FinanceTransactionService financeTransactionService;
	
	@Autowired
	private RepaymentNotesMapper repaymentNotesMapper;
	
	@Autowired
	private RepaymentNotesDetailMapper repaymentNotesDetailMapper;
	
	@Autowired
	private ParameterBasicService parameterBasicService;
	
	/**
	 * @Title: createFlowBid 
	 * @Description: TODO(这个是定时器的一个方法，判断借款的筹标期限是否过期，如果过期设置借款为流标，并解冻投标金额) 
	 * @param  设定文件
	 * @return void  返回类型
	 * @throws 
	 *
	 */
	//@PostConstruct
	@Transactional(readOnly = false)
	public void handleBorrowingOverdue(){
		RepaymentNotesDetailExample repaymentNotesDetailExample = new RepaymentNotesDetailExample();
		List<RepaymentNotesDetail>  repaymentNotesDetails = repaymentNotesDetailMapper.selectByExample(repaymentNotesDetailExample); // 查询所有借款列表
		//获取当前时间
		Date n = new Date();
	    long nowTime = n.getTime();
	    Calendar c = Calendar.getInstance();
	    ParameterBasic parameterBasic = (ParameterBasic) parameterBasicService.getParameterBasicByTitle("利息管理费");
		for(RepaymentNotesDetail repaymentNotesDetail : repaymentNotesDetails){
			RepaymentNotesDetail repaymentNotesDetailNew = new RepaymentNotesDetail();
	    	c.setTime(repaymentNotesDetail.getShouldPayDate());//获取当期应还时间,除以1000是为了转换成秒
		    long overDayReal = 0;//真正的逾期天数
	    	long cTime = c.getTimeInMillis();//获取当期应还时间的毫秒数
		    long overTime = (nowTime - cTime)/1000;//获取逾期时间
		    long overDay = overTime/(24*60*60);//计算逾期天数
		    long overHour = overTime%(24*60*60)/3600;//计算逾期小时数
			long overMinute = overTime%3600/60;//计算逾期分钟
		    long overSecond = overTime%60/60;//计算逾期秒数
		    if(overHour == 0 && overMinute == 0 && overSecond == 0){//判断如果逾期的小时，分钟，秒数都等于零时，
		    	overDayReal = overDay;
		    }else{
		    	overDayReal = overDay + 1;
		    }
		    if(nowTime > cTime){//如果当前时间大于当期应还时间
		    	repaymentNotesDetail.setIsOverdue("yes");//设置当期还款为逾期状态
		    	float overdueInterest = repaymentNotesDetail.getCurrentPayMoeny() * overDayReal;
		    	repaymentNotesDetail.setOverdueInterest(overdueInterest);//设置当期逾期罚息
		    }
		}
		
	}
}
