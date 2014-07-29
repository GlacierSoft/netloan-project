package com.glacier.netloan.service.account;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

import com.glacier.netloan.dao.account.AccountInvestMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.account.AccountInvestQueryDTO;

import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.entity.account.AccountInvestExample;
import com.glacier.netloan.entity.account.AccountInvestExample.Criteria;
import com.glacier.netloan.entity.member.MemberStatistics;

import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
import com.glacier.netloan.service.member.MemberStatisticsService;


@Service("accountInvestService")
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
public class AccountInvestService  {
    
	 @Autowired
	 private AccountInvestMapper accountInvestMapper;
	 
	
	 @Autowired
	 private MemberStatisticsService statisticsService; 
	 
	 @Autowired
	 private UserMapper userMapper;
	 
	 //用户条件查询
	 public Object getAccountInvestQuery(String str,Date StartTime,Date EndTime){
		 
		//会员统计信息获取
		@SuppressWarnings("unchecked")
		List<MemberStatistics> MemeberDataList=(List<MemberStatistics>) statisticsService.listMemberStatistics();   
		//System.out.println("会员统计信息数据:"+MemeberDataList.size());
		
		//投资变量数据定义
		float sum_uncollected=0;//投资成功待收金额
		float sum_reward=0;//投资奖励金额
		float sum_fine=0; //借款人逾期罚款金额
		float sum_borrow=0;//借款成功总额
		float sum_advfee=0;//借款管理费总额
		float sum_interest=0;//借款利息总额
		float sum_interestfee=0;//借款逾期罚息总额
	   
		  //变量累加
	    for(int j = 0; j < MemeberDataList.size(); j++) {
	      sum_uncollected+=MemeberDataList.get(j).getWaitIncomeTotal();
	      sum_reward+=MemeberDataList.get(j).getTenderAwards();
	      sum_fine+=MemeberDataList.get(j).getOverdueFineAmount();
	      sum_borrow+=MemeberDataList.get(j).getTotalBorrowings();
	      sum_advfee+=MemeberDataList.get(j).getLoanManagementAmount();
	      sum_interest=MemeberDataList.get(j).getLoanInterestAmount();
	      sum_interestfee+=MemeberDataList.get(j).getOverdueInterestAmount();
	        
	    }
		
		// 投资统计信息获取
		if ("investToday".equals(str)) {// 当日查询
			// 当前日历设置
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.HOUR_OF_DAY, 0);// 设置日历时
			calendar.set(Calendar.MINUTE, 0);// 设置日历分
			calendar.set(Calendar.SECOND, 0);// 设置日历秒
	      
			// 今日数据更新
			AccountInvestExample accountInvestExample = new AccountInvestExample();
			accountInvestExample.createCriteria().andCreateTimeGreaterThanOrEqualTo(calendar.getTime());
			List<AccountInvest> list = accountInvestMapper.selectByExample(accountInvestExample);
		
		  
			if (list != null && list.size() > 0) {

				AccountInvest accountInvestChange = new AccountInvest();

				float sum_uncollected_Finally = sum_uncollected- list.get(0).getSumUncollected();
				float sum_reward_Finally = sum_reward- list.get(0).getSumReward();
				float sum_borrow_Finally = sum_borrow- list.get(0).getSumBorrow();
				float sum_fine_finally = sum_fine - list.get(0).getSumFine();
				float sum_advfee_finally = sum_advfee- list.get(0).getSumAdvfee();
				float sum_interest_finally = sum_interest- list.get(0).getSumInterest();
				float sum_interestfee_finally = sum_interestfee- list.get(0).getSumInterestfee();

				// 暂存对象
				accountInvestChange.setSumUncollected(sum_uncollected_Finally);
				accountInvestChange.setSumReward(sum_reward_Finally);
				accountInvestChange.setSumBorrow(sum_borrow_Finally);
				accountInvestChange.setSumFine(sum_fine_finally);
				accountInvestChange.setSumAdvfee(sum_advfee_finally);
				accountInvestChange.setSumInterest(sum_interest_finally);
				accountInvestChange.setSumInterestfee(sum_interestfee_finally);

				// 返回结果集
				return accountInvestChange;
			}
		  }else if("investMonth".equals(str)){//当月查询
	        
			// 日历设置
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.DAY_OF_MONTH, 1);// 设置日
			cal.set(Calendar.HOUR_OF_DAY, 0);// 设置小时
			cal.set(Calendar.MINUTE, 0);// 设置分钟
			cal.set(Calendar.SECOND, 0);// 设置秒
			// System.out.println("当月的时间为:"+cal.getTime());

			// 当月第一条数据
			AccountInvestExample accountInvcestExample = new AccountInvestExample();
			accountInvcestExample.createCriteria()
					.andCreateTimeGreaterThanOrEqualTo(cal.getTime());
			List<AccountInvest> list_Month = accountInvestMapper
					.selectByExample(accountInvcestExample);
			// System.out.println("当月第一条数据为:"+list_Month.get(0).getInvestId());

			if (list_Month.size() > 0 && list_Month != null) {
				float sum_uncollected_Finally = sum_uncollected- list_Month.get(0).getSumUncollected();
				float sum_reward_Finally = sum_reward- list_Month.get(0).getSumReward();
				float sum_borrow_Finally = sum_borrow- list_Month.get(0).getSumBorrow();
				float sum_fine_finally = sum_fine- list_Month.get(0).getSumFine();
				float sum_advfee_finally = sum_advfee- list_Month.get(0).getSumAdvfee();
				float sum_interest_finally = sum_interest- list_Month.get(0).getSumInterest();
				float sum_interestfee_finally = sum_interestfee- list_Month.get(0).getSumInterestfee();

				AccountInvest accountInvestChange = new AccountInvest();

				// 暂存对象
				accountInvestChange.setSumUncollected(sum_uncollected_Finally);
				accountInvestChange.setSumReward(sum_reward_Finally);
				accountInvestChange.setSumBorrow(sum_borrow_Finally);
				accountInvestChange.setSumFine(sum_fine_finally);
				accountInvestChange.setSumAdvfee(sum_advfee_finally);
				accountInvestChange.setSumInterest(sum_interest_finally);
				accountInvestChange.setSumInterestfee(sum_interestfee_finally);

				// 返回结果集
				return accountInvestChange;
			}
			  
		} else if ("investYear".equals(str)) {// 当年时间查询

			// 日历设置
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.MONTH, 1);// 设置月
			cal.set(Calendar.DAY_OF_MONTH, 1);// 设置日
			cal.set(Calendar.HOUR_OF_DAY, 0);// 设置时
			cal.set(Calendar.SECOND, 0);// 设置秒
			cal.set(Calendar.MINUTE, 0);// 设置分

			// System.out.println("当月的时间为:"+cal.getTime());

			// 当年第一条数据
			AccountInvestExample accountInvcestExample = new AccountInvestExample();
			accountInvcestExample.createCriteria()
					.andCreateTimeGreaterThanOrEqualTo(cal.getTime());
			List<AccountInvest> list_Month = accountInvestMapper
					.selectByExample(accountInvcestExample);
			// System.out.println("当年第一条数据为:"+list_Month.get(0).getInvestId());

			if (list_Month.size() > 0 && list_Month != null) {
				float sum_uncollected_Finally = sum_uncollected- list_Month.get(0).getSumUncollected();
				float sum_reward_Finally = sum_reward- list_Month.get(0).getSumReward();
				float sum_borrow_Finally = sum_borrow- list_Month.get(0).getSumBorrow();
				float sum_fine_finally = sum_fine- list_Month.get(0).getSumFine();
				float sum_advfee_finally = sum_advfee- list_Month.get(0).getSumAdvfee();
				float sum_interest_finally = sum_interest- list_Month.get(0).getSumInterest();
				float sum_interestfee_finally = sum_interestfee- list_Month.get(0).getSumInterestfee();

				AccountInvest accountInvestChange = new AccountInvest();

				// 暂存对象
				accountInvestChange.setSumUncollected(sum_uncollected_Finally);
				accountInvestChange.setSumReward(sum_reward_Finally);
				accountInvestChange.setSumBorrow(sum_borrow_Finally);
				accountInvestChange.setSumFine(sum_fine_finally);
				accountInvestChange.setSumAdvfee(sum_advfee_finally);
				accountInvestChange.setSumInterest(sum_interest_finally);
				accountInvestChange.setSumInterestfee(sum_interestfee_finally);

				// 返回结果集
				return accountInvestChange;
		  }
		}else if("investOther".equals(str)){
    		
    		//System.out.println("开始时间:"+StartTime);
    		//System.out.println("结束时间:"+EndTime);
    		
    		Calendar calendar_Start=null;//定义开始日历
    		Calendar calendar_End=null;//定义结束日历
    		
    		if(StartTime!=null){
    	       //定义开始时间转化
    		  calendar_Start=Calendar.getInstance();
			  calendar_Start.setTime(StartTime);
			  calendar_Start.set(Calendar.HOUR_OF_DAY, 0);//设置日历时
			  calendar_Start.set(Calendar.MINUTE,0);//设置日历分
			  calendar_Start.set(Calendar.SECOND,0);//设置日历秒
    		 }
    		if(EndTime!=null){
    			//定义结束时间转化
    			calendar_End=Calendar.getInstance();
    			calendar_End.setTime(EndTime);
    			calendar_End.set(Calendar.HOUR_OF_DAY,23);
    			calendar_End.set(Calendar.MINUTE, 59);
    			calendar_End.set(Calendar.SECOND,59);
    		}
    		
    		if(calendar_Start!=null&&calendar_End!=null){
               AccountInvestExample accountInvestExample=new AccountInvestExample();
               accountInvestExample.createCriteria().andCreateTimeBetween(calendar_Start.getTime(), calendar_End.getTime());
               List<AccountInvest> list_other=accountInvestMapper.selectByExample(accountInvestExample);
    		   
               if(list_other.size()>0&&list_other!=null){
    			   
            	   float sum_uncollected_Finally=list_other.get(list_other.size()-1).getSumUncollected()-list_other.get(0).getSumUncollected();
    			   float sum_reward_Finally=list_other.get(list_other.size()-1).getSumReward()-list_other.get(0).getSumReward();
    			   float sum_borrow_Finally=list_other.get(list_other.size()-1).getSumBorrow()-list_other.get(0).getSumBorrow();
    			   float sum_fine_finally=list_other.get(list_other.size()-1).getSumFine()-list_other.get(0).getSumFine();
    			   float sum_advfee_finally=list_other.get(list_other.size()-1).getSumAdvfee()-list_other.get(0).getSumAdvfee();
    			   float sum_interest_finally=list_other.get(list_other.size()-1).getSumInterest()-list_other.get(0).getSumInterest();
    			   float sum_interestfee_finally=list_other.get(list_other.size()-1).getSumInterestfee()-list_other.get(0).getSumInterestfee();

    			   AccountInvest accountInvestChange=new AccountInvest();
 
    			   //暂存对象
    			   accountInvestChange.setSumUncollected(sum_uncollected_Finally);
    			   accountInvestChange.setSumReward(sum_reward_Finally);
    			   accountInvestChange.setSumBorrow(sum_borrow_Finally);
    			   accountInvestChange.setSumFine(sum_fine_finally);
    			   accountInvestChange.setSumAdvfee(sum_advfee_finally);
    			   accountInvestChange.setSumInterest(sum_interest_finally);
    			   accountInvestChange.setSumInterestfee(sum_interestfee_finally);
    			     
    			   //返回结果集
    			   return accountInvestChange; 
    		   }
            }
    		
			if (calendar_Start != null && calendar_End == null) {

				AccountInvestExample accountInvestExample = new AccountInvestExample();
				accountInvestExample.createCriteria()
						.andCreateTimeGreaterThanOrEqualTo(
								calendar_Start.getTime());
				List<AccountInvest> list_start = accountInvestMapper
						.selectByExample(accountInvestExample);

				if (list_start.size() > 0 && list_start != null) {

					float sum_uncollected_Finally = list_start.get(
							list_start.size() - 1).getSumUncollected()- list_start.get(0).getSumUncollected();
					float sum_reward_Finally = list_start.get(
							list_start.size() - 1).getSumReward()- list_start.get(0).getSumReward();
					float sum_borrow_Finally = list_start.get(
							list_start.size() - 1).getSumBorrow()- list_start.get(0).getSumBorrow();
					float sum_fine_finally = list_start.get(
							list_start.size() - 1).getSumFine()- list_start.get(0).getSumFine();
					float sum_advfee_finally = list_start.get(
							list_start.size() - 1).getSumAdvfee()- list_start.get(0).getSumAdvfee();
					float sum_interest_finally = list_start.get(
							list_start.size() - 1).getSumInterest()- list_start.get(0).getSumInterest();
					float sum_interestfee_finally = list_start.get(
							list_start.size() - 1).getSumInterestfee()- list_start.get(0).getSumInterestfee();

					AccountInvest accountInvestChange = new AccountInvest();

					// 暂存对象
					accountInvestChange.setSumUncollected(sum_uncollected_Finally);
					accountInvestChange.setSumReward(sum_reward_Finally);
					accountInvestChange.setSumBorrow(sum_borrow_Finally);
					accountInvestChange.setSumFine(sum_fine_finally);
					accountInvestChange.setSumAdvfee(sum_advfee_finally);
					accountInvestChange.setSumInterest(sum_interest_finally);
					accountInvestChange.setSumInterestfee(sum_interestfee_finally);

					// 返回结果集
					return accountInvestChange;
				}
			}

			if (calendar_End != null && calendar_Start == null) {

				AccountInvestExample accountInvestExample = new AccountInvestExample();
				accountInvestExample.createCriteria()
						.andCreateTimeLessThanOrEqualTo(calendar_End.getTime());
				List<AccountInvest> list_start = accountInvestMapper
						.selectByExample(accountInvestExample);
				if (list_start.size() > 0 && list_start != null) {

					float sum_uncollected_Finally = list_start.get(
							list_start.size() - 1).getSumUncollected()- list_start.get(0).getSumUncollected();
					float sum_reward_Finally = list_start.get(
							list_start.size() - 1).getSumReward()- list_start.get(0).getSumReward();
					float sum_borrow_Finally = list_start.get(
							list_start.size() - 1).getSumBorrow()- list_start.get(0).getSumBorrow();
					float sum_fine_finally = list_start.get(
							list_start.size() - 1).getSumFine()- list_start.get(0).getSumFine();
					float sum_advfee_finally = list_start.get(
							list_start.size() - 1).getSumAdvfee()- list_start.get(0).getSumAdvfee();
					float sum_interest_finally = list_start.get(
							list_start.size() - 1).getSumInterest()- list_start.get(0).getSumInterest();
					float sum_interestfee_finally = list_start.get(
							list_start.size() - 1).getSumInterestfee()- list_start.get(0).getSumInterestfee();

					AccountInvest accountInvestChange = new AccountInvest();

					// 暂存对象
					accountInvestChange.setSumUncollected(sum_uncollected_Finally);
					accountInvestChange.setSumReward(sum_reward_Finally);
					accountInvestChange.setSumBorrow(sum_borrow_Finally);
					accountInvestChange.setSumFine(sum_fine_finally);
					accountInvestChange.setSumAdvfee(sum_advfee_finally);
					accountInvestChange.setSumInterest(sum_interest_finally);
					accountInvestChange.setSumInterestfee(sum_interestfee_finally);

					// 返回结果集
					return accountInvestChange;
				}
			}
		}
		return null;
	}
	 
	 
	
	// 监听设置
	@Transactional(readOnly = false)
	public void handleAccountInvest() {

		// 获取当前用户
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo("admin");
		List<User> userList = userMapper.selectByExample(userExample);

		// 会员统计信息获取
		@SuppressWarnings("unchecked")
		List<MemberStatistics> list = (List<MemberStatistics>) statisticsService.listMemberStatistics();

		// 时间设置
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);// 设置日历时
		calendar.set(Calendar.MINUTE, 0);// 设置日历分
		calendar.set(Calendar.SECOND, 0);// 设置日历秒

		AccountInvestExample accountInvestExamole = new AccountInvestExample();
		accountInvestExamole.createCriteria().andCreateTimeGreaterThan(calendar.getTime());
		List<AccountInvest> accountInvestDataList = (List<AccountInvest>) accountInvestMapper.selectByExample(accountInvestExamole);

		if (accountInvestDataList.size() > 0 && accountInvestDataList != null) {
			System.out.println("当天已有数据");
		} else {
			// 投资变量数据定义
			float sum_uncollected = 0;// 投资成功待收金额
			float sum_reward = 0;// 投资奖励金额
			float sum_fine = 0; // 借款人逾期罚款金额
			float sum_borrow = 0;// 借款成功总额
			float sum_advfee = 0;// 借款管理费总额
			float sum_interest = 0;// 借款利息总额
			float sum_interestfee = 0;// 借款逾期罚息总额

			// System.out.println("我没问题呐(" + counter++ + ")");
			// System.out.println("我获取的超级管理员ID是:"+ userList.get(0).getUserId());

			// 构建投资对象
			AccountInvest accountInvest_add = new AccountInvest();

			// 变量累加
			for (int j = 0; j < list.size(); j++) {

				sum_uncollected += list.get(j).getWaitIncomeTotal();
				sum_reward += list.get(j).getTenderAwards();
				sum_fine += list.get(j).getOverdueFineAmount();
				sum_borrow += list.get(j).getTotalBorrowings();
				sum_advfee += list.get(j).getLoanManagementAmount();
				sum_interest = list.get(j).getLoanInterestAmount();
				sum_interestfee += list.get(j).getOverdueInterestAmount();

			}

			accountInvest_add.setInvestId(RandomGUID.getRandomGUID());
			accountInvest_add.setSumUncollected(sum_uncollected);
			accountInvest_add.setSumReward(sum_reward);
			accountInvest_add.setSumFine(sum_fine);
			accountInvest_add.setSumBorrow(sum_borrow);
			accountInvest_add.setSumAdvfee(sum_advfee);
			accountInvest_add.setSumInterest(sum_interest);
			accountInvest_add.setSumInterestfee(sum_interestfee);
			accountInvest_add.setCreater(userList.get(0).getUserId());
			accountInvest_add.setCreateTime(new Date());
			accountInvest_add.setUpdater(userList.get(0).getUserId());
			accountInvest_add.setUpdateTime(new Date());

			// 投资统计数据添加
			accountInvestMapper.insert(accountInvest_add);
		}
	}
	 
	 
	 
	// 会员投资信息统计
	public Object listAsGrid(JqPager jqPager_Final,AccountInvestQueryDTO accountInvestQueryDTO) {

		// 更新数据查询
		JqGridReturn returnResult = new JqGridReturn();
		AccountInvestExample accountInvestExample = new AccountInvestExample();

		// 追加查询条件
		Criteria queryCriteria = accountInvestExample.createCriteria();
		accountInvestQueryDTO.setQueryCondition(queryCriteria);

		if (null != jqPager_Final.getPage() && null != jqPager_Final.getRows()) {// 设置排序信息
			accountInvestExample.setLimitStart((jqPager_Final.getPage() - 1)* jqPager_Final.getRows());
			accountInvestExample.setLimitEnd(jqPager_Final.getRows());
		}
		if (StringUtils.isNotBlank(jqPager_Final.getSort())&& StringUtils.isNotBlank(jqPager_Final.getOrder())) {// 设置排序信息
			accountInvestExample.setOrderByClause(jqPager_Final.getOrderBy("temp_account_invest_"));
		}

		List<AccountInvest> accountInvest = accountInvestMapper.selectByExample(accountInvestExample); // 查询所有投资信息

		int total = accountInvestMapper.countByExample(accountInvestExample); // 查询总页数

		returnResult.setRows(accountInvest);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}
	
	
	//会员投资信息统计数据获取
	public Object FindAccountInvest(int year_number,int month_number){
		//设置发挥信息
		AccountInvestExample accountInvestExample = new AccountInvestExample();
		// 设置开始时间
		Calendar carendar_before = Calendar.getInstance();
		carendar_before.set(Calendar.YEAR, year_number);
		carendar_before.set(Calendar.MONTH, month_number - 1);
		carendar_before.set(Calendar.DATE, 1);
		carendar_before.set(Calendar.HOUR_OF_DAY, 0);
		carendar_before.set(Calendar.MINUTE, 0);
		carendar_before.set(Calendar.SECOND, 0);
		// 设置结束时间
		Calendar carendar_After = Calendar.getInstance();
		carendar_After.set(Calendar.YEAR, year_number);
		carendar_After.set(Calendar.MONTH, month_number - 1);
		carendar_After.set(Calendar.DATE, 31);
		carendar_After.set(Calendar.HOUR_OF_DAY, 23);
		carendar_After.set(Calendar.MINUTE, 59);
		carendar_After.set(Calendar.SECOND, 59);

		accountInvestExample.createCriteria().andCreateTimeBetween(carendar_before.getTime(), carendar_After.getTime());
		JqPager pager = new JqPager();
		pager.setSort("createTime");
		pager.setOrder("ASC");
		accountInvestExample.setOrderByClause(pager.getOrderBy("temp_account_invest_"));
		List<AccountInvest> accountInvest = accountInvestMapper.selectByExample(accountInvestExample);
		
		if(accountInvest.size()<=0){
			// 设置开始时间
			Calendar carendar_before_none = Calendar.getInstance();
			carendar_before_none.set(Calendar.DATE, 1);
			carendar_before_none.set(Calendar.HOUR_OF_DAY, 0);
			carendar_before_none.set(Calendar.MINUTE, 0);
			carendar_before_none.set(Calendar.SECOND, 0);
			// 设置结束时间
			Calendar carendar_After_none = Calendar.getInstance();
			carendar_After_none.set(Calendar.DATE, 31);
			carendar_After_none.set(Calendar.HOUR_OF_DAY, 23);
			carendar_After_none.set(Calendar.MINUTE, 59);
			carendar_After_none.set(Calendar.SECOND, 59);
			
			AccountInvestExample accountInvestExampleNone = new AccountInvestExample();
			accountInvestExampleNone.createCriteria().andCreateTimeBetween(carendar_before_none.getTime(), carendar_After_none.getTime());
			accountInvestExampleNone.setOrderByClause(pager.getOrderBy("temp_account_invest_"));
			List<AccountInvest> accountInvestNone = accountInvestMapper.selectByExample(accountInvestExampleNone);
		   
			return accountInvestNone;
		}
		
		return accountInvest;
	 }	
	 
	//用户条件判断
	public Object FindInvestListTest(int year_number,int month_number){
		//设置发挥信息
		AccountInvestExample accountInvestExample = new AccountInvestExample();
		// 设置开始时间
		Calendar carendar_before = Calendar.getInstance();
		carendar_before.set(Calendar.YEAR, year_number);
		carendar_before.set(Calendar.MONTH, month_number - 1);
		carendar_before.set(Calendar.DATE, 1);
		carendar_before.set(Calendar.HOUR_OF_DAY, 0);
		carendar_before.set(Calendar.MINUTE, 0);
		carendar_before.set(Calendar.SECOND, 0);
		// 设置结束时间
		Calendar carendar_After = Calendar.getInstance();
		carendar_After.set(Calendar.YEAR, year_number);
		carendar_After.set(Calendar.MONTH, month_number - 1);
		carendar_After.set(Calendar.DATE, 31);
		carendar_After.set(Calendar.HOUR_OF_DAY, 23);
		carendar_After.set(Calendar.MINUTE, 59);
		carendar_After.set(Calendar.SECOND, 59);

	   accountInvestExample.createCriteria().andCreateTimeBetween(carendar_before.getTime(), carendar_After.getTime());
	   int count=accountInvestMapper.countByExample(accountInvestExample);
	   return count;
	}
	
	
	// 投资信息详情
	public Object getAccountInvest(String investId) {
		AccountInvest accountInvest = accountInvestMapper.selectByPrimaryKey(investId);
		return accountInvest;
	}

	String[] excelHeader = { "投资统计ID", "投资成功待收金额", "投资奖励金额", "借款人逾期罚金金额","借款成功总额", "借款管理费总额", "借款利息总额", "借款逾期罚息总额" };
	int[] excelHeaderWidth = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };

	// 投资信息导出
	public HSSFWorkbook export(List<AccountInvest> list) {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("投资信息报表统计");
		HSSFRow row = sheet.createRow((int) 0);
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);

		for (int i = 0; i < excelHeader.length; i++) {
			HSSFCell cell = row.createCell(i);
			cell.setCellValue(excelHeader[i]);
			cell.setCellStyle(style);
			sheet.autoSizeColumn(i);
		}
		// 设置列宽度（像素）
		for (int i = 0; i < excelHeaderWidth.length; i++) {
			sheet.setColumnWidth(i, 32 * excelHeaderWidth[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			row = sheet.createRow(i + 1);
			AccountInvest accountInvest = list.get(i);
			row.createCell(0).setCellValue(accountInvest.getInvestId());
			row.createCell(1).setCellValue(accountInvest.getSumUncollected());
			row.createCell(2).setCellValue(accountInvest.getSumReward());
			row.createCell(3).setCellValue(accountInvest.getSumFine());
			row.createCell(4).setCellValue(accountInvest.getSumBorrow());
			row.createCell(5).setCellValue(accountInvest.getSumAdvfee());
			row.createCell(6).setCellValue(accountInvest.getSumInterest());
			row.createCell(7).setCellValue(accountInvest.getSumInterestfee());
		}
		return wb;
	}

} 
