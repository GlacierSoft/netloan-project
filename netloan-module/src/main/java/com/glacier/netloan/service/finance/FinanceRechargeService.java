package com.glacier.netloan.service.finance;

import java.text.SimpleDateFormat;
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
import com.glacier.netloan.dao.basicdatas.ParameterIntegralTypeMapper;
import com.glacier.netloan.dao.finance.FinanceMemberMapper;
import com.glacier.netloan.dao.finance.FinancePlatformMapper;
import com.glacier.netloan.dao.finance.FinancePlatformTransactionMapper;
import com.glacier.netloan.dao.finance.FinanceRechargeMapper;
import com.glacier.netloan.dao.finance.FinanceRechargeSetMapper;
import com.glacier.netloan.dao.finance.FinanceTransactionMapper;
import com.glacier.netloan.dao.member.MemberIntegralMapper;
import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dao.member.MemberMessageNoticeMapper;
import com.glacier.netloan.dao.member.MemberStatisticsMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.finance.FinRechargeQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterIntegralExample;
import com.glacier.netloan.entity.basicdatas.ParameterIntegralType;
import com.glacier.netloan.entity.basicdatas.ParameterIntegralTypeExample;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinancePlatform;
import com.glacier.netloan.entity.finance.FinancePlatformExample;
import com.glacier.netloan.entity.finance.FinancePlatformTransaction;
import com.glacier.netloan.entity.finance.FinanceRecharge;
import com.glacier.netloan.entity.finance.FinanceRechargeExample;
import com.glacier.netloan.entity.finance.FinanceRechargeSet;
import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.entity.finance.FinanceRechargeExample.Criteria;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberExample;
import com.glacier.netloan.entity.member.MemberIntegral;
import com.glacier.netloan.entity.member.MemberMessageNotice;
import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.entity.member.MemberStatisticsExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: FinanceRechargeService 
 * @Description: TODO(会员充值记录service层) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceRechargeService {
	
	@Autowired
	private FinanceRechargeMapper financeRechargeMapper;
	
	@Autowired
	private FinanceRechargeSetMapper financeRechargeSetMapper;

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private FinanceTransactionMapper financeTransactionMapper;
	
	@Autowired
	private FinanceMemberMapper financeMemberMapper;
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private FinancePlatformTransactionMapper  financePlatformTransactionMapper;
	
	@Autowired
	private FinancePlatformMapper financePlatformMapper;
	
	@Autowired
	private MemberStatisticsMapper memberStatisticsMapper;
	
	@Autowired
	private ParameterIntegralTypeMapper  parameterIntegralTypeMapper;
	
	@Autowired
	private MemberIntegralMapper memberIntegralMapper;
	 
	@Autowired
	private MemberMessageNoticeMapper memberMessageNoticeMapper;
	/**
	 * @Title: getRecharge 
	 * @Description: TODO(根据会员充值记录Id获取会员充值记录信息) 
	 * @param @param financeRechargeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getRecharge(String financeRechargeId) {
    	FinanceRecharge financeRecharge = financeRechargeMapper.selectByPrimaryKey(financeRechargeId);
        return financeRecharge;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员充值记录信息) 
     * @param @param pfinanceRecharger
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(FinRechargeQueryDTO rechargeQueryDTO,JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceRechargeExample financeRechargeExample = new FinanceRechargeExample();

        Criteria queryCriteria = financeRechargeExample.createCriteria();
        rechargeQueryDTO.setQueryConditions(queryCriteria);
        
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeRechargeExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeRechargeExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeRechargeExample.setOrderByClause(pager.getOrderBy("temp_finance_recharge_"));
        }
        List<FinanceRecharge>  financeRecharges = financeRechargeMapper.selectByExample(financeRechargeExample); // 查询所有会员充值记录列表
        int total = financeRechargeMapper.countByExample(financeRechargeExample); // 查询总页数
        returnResult.setRows(financeRecharges);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addRecharge 
     * @Description: TODO(新增会员充值记录) 
     * @param @param financeRecharge
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addRecharge(FinanceRecharge financeRecharge) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
  		Member pricipalMember = (Member) pricipalSubject.getPrincipal();
  		UserExample userExample = new UserExample();
  		userExample.createCriteria().andUsernameEqualTo("admin");
  		List<User> users = userMapper.selectByExample(userExample);
  		
        financeRecharge.setFinanceRechargeId(RandomGUID.getRandomGUID());
        // 赋值于充值记录的充值流水号
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        financeRecharge.setRechargeCode("充值"+ "_" + dateFormat.format(new Date()));
        financeRecharge.setAuditState("authstr"); 
        // 获取该充值设置的取费方式进行计算该充值的费率和手续费
        FinanceRechargeSet rechargeSet = new FinanceRechargeSet();
        rechargeSet = financeRechargeSetMapper.selectByPrimaryKey(financeRecharge.getFinanceRechargeSetId());
        String feeWay = rechargeSet.getFeeWay();
        if (null != feeWay && StringUtils.isNotBlank(feeWay)) {
        	 if ("directcost".equals(feeWay)) {//直接收费
        		 financeRecharge.setRechargeRate(rechargeSet.getValue());//费率或者取值即为充值设置的取值
        		 financeRecharge.setHandlingCharge(rechargeSet.getValue());//手续费即为充值设置的取值
             }else {//比例收费
            	 financeRecharge.setRechargeRate(rechargeSet.getRechargeRate());//费率或者取值即为充值设置的费率
            	 financeRecharge.setHandlingCharge(financeRecharge.getRechargeAmount()*rechargeSet.getRechargeRate());//手续费=总额*费率
             }
        }
        financeRecharge.setArriveMoney(financeRecharge.getRechargeAmount()-financeRecharge.getHandlingCharge());//到帐金额=总金额-手续费
        financeRecharge.setRemark("充值成功");
    	financeRecharge.setCreater(pricipalMember.getMemberId());
        financeRecharge.setCreateTime(new Date());
        financeRecharge.setUpdater(users.get(0).getUserId());
        financeRecharge.setUpdateTime(new Date());
        //进行充值设置类型判断，如果是线上充值，系统自动进行审核，如果是线下充值，则需要人工手动进行审核
        if (null != rechargeSet.getRechargeType() && StringUtils.isNotBlank(rechargeSet.getRechargeType())) {
            if ("onLine".equals(rechargeSet.getRechargeType())) {
                financeRecharge.setAuditState("pass");
                financeRecharge.setAuditRemark("充值成功,系统自动审核通过");
                financeRecharge.setAuditor(users.get(0).getUserId());
                financeRecharge.setAuditDate(new Date());
            }
        }
        int count = financeRechargeMapper.insert(financeRecharge);
        if (count == 1) {
        	//判断如果该充值记录通过审核，系统则会自动生成一条会员资金记录明细信息、平台资金记录明细信息，同时还会自动更新该会员的资金记录信息和平台的资金记录信息
        	if (null != financeRecharge.getAuditState() && StringUtils.isNotBlank(financeRecharge.getAuditState())) {
        		if ("pass".equals(financeRecharge.getAuditState())) {
        		   boolean boo =updatFinanceRecharge(financeRecharge,pricipalMember.getMemberId(),0);//其他的关联操作，抽出在另外一个方法
        		   if(boo){//判断关联操作是否一起成功
        			   returnResult.setSuccess(true);
                       returnResult.setMsg("[" + financeRecharge.getRechargeCode() + "] 会员充值记录信息已审核"); 
        		   }else{
                  	 returnResult.setMsg("发生未知错误，会员充值记录信息审核失败");
                   }
        		}
        	} 
         } else {
            returnResult.setMsg("发生未知错误，会员充值记录信息保存失败");
        }
        return returnResult;
    } 
    
    
    /**
     * @Title: auditRecharge 
     * @Description: TODO(审核会员充值记录) 
     * @param @param financeRecharge
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeList_audit")
    public Object auditRecharge(FinanceRecharge financeRecharge) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	
    	Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
  		User pricipalUser = (User) pricipalSubject.getPrincipal();
  		
  		
  		financeRecharge.setAuditDate(new Date());
  		financeRecharge.setAuditor(pricipalUser.getUserId());
  		financeRecharge.setUpdateTime(new Date());
  		financeRecharge.setUpdater(pricipalUser.getUserId());
  		int count = financeRechargeMapper.updateByPrimaryKeySelective(financeRecharge);
  		if (count == 1) {
  		    //判断如果该充值记录通过审核，系统则会自动生成一条会员资金记录明细信息、平台资金记录明细信息，同时还会自动更新该会员的资金记录信息和平台的资金记录信息
            if (null != financeRecharge.getAuditState() && StringUtils.isNotBlank(financeRecharge.getAuditState())) {
                if ("pass".equals(financeRecharge.getAuditState())) { 
                	 boolean boo=updatFinanceRecharge(financeRecharge,pricipalUser.getUserId(),1); //其他管理操作
                	 if(boo){
                	     returnResult.setSuccess(true);
                         returnResult.setMsg("[" + financeRecharge.getRechargeCode() + "] 会员充值记录信息已审核");
                     }else{
                    	 returnResult.setMsg("发生未知错误，会员充值记录信息审核失败");
                     }
                } 
            }
        } else {
            returnResult.setMsg("发生未知错误，会员充值记录信息审核失败");
        }
    	return returnResult;
    }
    

    
    //会员充值和审核，线上和线下充值,同时需要更新的数据：充值记录,会员资金记录,会员资金,平台资金记录,平台资金,会员统计
    public boolean updatFinanceRecharge(FinanceRecharge financeRecharge,String id,int i){
    	boolean info=true;//用于记录操作是否成功
    	UserExample userExample = new UserExample();
  		userExample.createCriteria().andUsernameEqualTo("admin");
  		List<User> users = userMapper.selectByExample(userExample); 
  		String usid="";
  		if(i == 0){     //系统自动审核的,取出admin的id
  			usid=users.get(0).getUserId();
  		}else{        //后台管理人员审核的,id
  			usid=id;
  		}  
	     //取出会员信息 
		 MemberExample  memberExample=new MemberExample();
		 memberExample.createCriteria().andMemberIdEqualTo(financeRecharge.getMemberId());
         List<Member> members = memberMapper.selectByExample(memberExample);
         Member member=members.get(0); 
	     FinanceTransaction financeTransaction = new FinanceTransaction();
		financeTransaction.setTransactionId(RandomGUID.getRandomGUID());
		//根据充值会员Id找到该会员的会员财务信息记录
		FinanceMember financeMember = new FinanceMember();
		financeMember = financeMemberMapper.selectByMemberId(member.getMemberId());
		financeTransaction.setFinanceMemberId(financeMember.getFinanceMemberId());
		financeTransaction.setMemberId(member.getMemberId());
		financeTransaction.setTransactionTarget("系统账号");
		financeTransaction.setTransactionType("充值");
		financeTransaction.setEarningMoney(financeRecharge.getArriveMoney());
		financeTransaction.setUsableMoney(financeMember.getUsableMoney()+financeRecharge.getArriveMoney());//记录的可用金额=原来可用金额+充值的收入金额
		financeTransaction.setExpendMoney(0f);//支出金额
		financeTransaction.setFrozenMoney(financeMember.getFrozenMoney());//冻结金额不变
		financeTransaction.setCollectingMoney(financeMember.getCollectingMoney());//代收金额不变
		financeTransaction.setRefundMoney(financeMember.getRefundMoney());//待还金额不变
		financeTransaction.setAmount(financeMember.getAmount()+financeRecharge.getArriveMoney());//总金额=原来总金额+收入金额
		financeTransaction.setRemark("充值自动生成资金明细信息。");
		financeTransaction.setCreateTime(new Date());
		financeTransaction.setCreater(users.get(0).getUserId());
		financeTransaction.setUpdateTime(new Date());
		financeTransaction.setUpdater(users.get(0).getUserId());
	    int   count = financeTransactionMapper.insert(financeTransaction);
	    if (count == 1) {
             //根据生成会员资金明显信息，自动更新会员资金信息
             financeMember.setAmount(financeMember.getAmount()+financeRecharge.getArriveMoney());//总金额
             financeMember.setUsableMoney(financeMember.getUsableMoney()+financeRecharge.getArriveMoney());//可用金额
             financeMember.setRechargeMonthTimes(financeMember.getRechargeMonthTimes()+1);//本月充值次数
             financeMember.setRechargeTimes(financeMember.getRechargeTimes()+1);//充值总次数
             financeMember.setRechargeMoney(financeMember.getRechargeMoney()+financeRecharge.getArriveMoney());//充值总金额
             financeMember.setUpdaterDisplay(users.get(0).getUserId());//更新人
             financeMember.setUpdateTime(new Date());//更新时间
             count = financeMemberMapper.updateByPrimaryKeySelective(financeMember);
         } else {
             info=false;
         }   
	    if(count == 1){
	    	//取出默认平台资金的账户总余额 
		    FinancePlatformExample  financePlatformExample=new FinancePlatformExample();
		    financePlatformExample.createCriteria().andPlatformTypeEqualTo("default");
		    List<FinancePlatform> financePlatforms = financePlatformMapper.selectByExample(financePlatformExample);
		    FinancePlatform financePlatDate=financePlatforms.get(0); 
			//新增资金平台记录
			FinancePlatformTransaction  financePlatformTransaction=new FinancePlatformTransaction();
		    financePlatformTransaction.setPlatformTransactionId(RandomGUID.getRandomGUID());  //id
		    financePlatformTransaction.setFinancePlatformId(financePlatDate.getFinancePlatformId());//资金平台id
		    financePlatformTransaction.setTransactionTarget(member.getMemberName());//交易对象
		    financePlatformTransaction.setTransactionType("充值");//交易类型
		    financePlatformTransaction.setEarningMoney(financeRecharge.getArriveMoney());//收入金额
		    financePlatformTransaction.setExpendMoney(0f);//支出金额
		    financePlatformTransaction.setAmount(financePlatDate.getPlatformMoney()+financeRecharge.getArriveMoney());//总金额=原来的金额+充值的金额
		    financePlatformTransaction.setCreater(usid);//创建人
		    financePlatformTransaction.setCreateTime(new Date());
		    financePlatformTransaction.setUpdater(usid);
		    financePlatformTransaction.setUpdateTime(new Date());
		    count=financePlatformTransactionMapper.insertSelective(financePlatformTransaction);//新增平台资金记录
		     if (count == 1) {
		    	 //更新资金平台的数据
		    	 financePlatDate.setPlatformMoney(financePlatDate.getPlatformMoney()+financeRecharge.getArriveMoney());//资金平台余额=原有金额+充值金额
		    	 financePlatDate.setUpdater(usid);//更新人
		    	 financePlatDate.setUpdateTime(new Date());//更新时间
		    	 financePlatformMapper.updateByPrimaryKeySelective(financePlatDate);//更新资金平台数据
		         MemberStatisticsExample  memberStatisticsExample=new MemberStatisticsExample();
			     memberStatisticsExample.createCriteria().andMemberIdEqualTo(financeRecharge.getMemberId());
	 		     List<MemberStatistics> memberStatistics = memberStatisticsMapper.selectByExample(memberStatisticsExample);
	 		     MemberStatistics memberStatistic=memberStatistics.get(0);
	 		     //更新会员统计信息 
			     memberStatistic.setUplineDeltaAwards(0f);//线下充值奖励
			     memberStatistic.setUpdateTime(new Date());//统计时间更新 
			     memberStatisticsMapper.updateByPrimaryKey(memberStatistic);
			    } else {
		    	 info=false;
            }    
		   
		     //取出充值奖励积分的对象
			 ParameterIntegralTypeExample  parameterIntegralTypeExample=new ParameterIntegralTypeExample();
			 parameterIntegralTypeExample.createCriteria().andIntegralTypeEqualTo("recharge");
			 parameterIntegralTypeExample.createCriteria().andChangeTypeEqualTo("increase");
 		     List<ParameterIntegralType> memberStatistics = parameterIntegralTypeMapper.selectByExample(parameterIntegralTypeExample);
 		     ParameterIntegralType parameterIntegralType=memberStatistics.get(0);
 		    //增加该会员的一条积分记录信息 
		     MemberIntegral memberIntegral=new MemberIntegral();
		     memberIntegral.setMemberIntegralId(RandomGUID.getRandomGUID());
		     memberIntegral.setMemberId(member.getMemberId());
		     memberIntegral.setChangeType(parameterIntegralType.getChangeType());//积分类型
		     memberIntegral.setChangeValue(parameterIntegralType.getChangeValue());//增加积分的值
		     memberIntegral.setType(parameterIntegralType.getIntegralType());//充值奖励积分
		     memberIntegral.setRemark(parameterIntegralType.getRemark());
		     memberIntegral.setCreater(usid);//创建人
		     memberIntegral.setCreateTime(new Date());
		     memberIntegral.setUpdater(usid);
		     memberIntegral.setUpdateTime(new Date());
		     count=memberIntegralMapper.insert(memberIntegral);//新增会员积分记录
		      //新增站内短信记录
		     MemberMessageNotice  memberMessageNotice=new MemberMessageNotice();
		     memberMessageNotice.setMessageNoticeId(RandomGUID.getRandomGUID());
		     memberMessageNotice.setSender(users.get(0).getUserId());//发现人，系统管理员
		     memberMessageNotice.setAddressee(member.getMemberId());//收信人
		     memberMessageNotice.setTitle("充值信息");//标题
		     memberMessageNotice.setContent("尊敬的会员："+member.getMemberName()+",您已成功充值￥"+financeRecharge.getArriveMoney()+"元。");//短信内容
		     memberMessageNotice.setSendtime(new Date());
		     memberMessageNotice.setLetterstatus("unread");//信件状态，默认为未读
		     memberMessageNotice.setLettertype("system");//信件类型，系统消息
		     memberMessageNotice.setRemark("会员充值");//备注
		     memberMessageNotice.setCreater(users.get(0).getUserId());//创建人，系统管理员
		     memberMessageNotice.setCreateTime(new Date());//创建时间
		     memberMessageNotice.setUpdater(users.get(0).getUserId());//更新人
		     memberMessageNotice.setUpdateTime(new Date());//更新时间
		     memberMessageNoticeMapper.insert(memberMessageNotice);//新增站内短信
		      //更新会员信息的积分字段
		     member.setIntegral(member.getIntegral()+parameterIntegralType.getChangeValue());//积分=原有的积分+增加的积分
		     member.setUpdater(users.get(0).getUserId());
		     member.setUpdateTime(new Date());
		     memberMapper.updateByPrimaryKey(member); //更改会员积分
	    } else{
	    	 info=false;
	    }
	         return  info;
    } 
    
    
     
    /**
     * @Title: delRecharge 
     * @Description: TODO(删除会员充值记录) 
     * @param @param financeRechargeId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeList_del")
    public Object delRecharge(List<String> financeRechargeIds, List<String> rechargeNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (financeRechargeIds.size() > 0) {
        	FinanceRechargeExample financeRechargeExample = new FinanceRechargeExample();
        	financeRechargeExample.createCriteria().andFinanceRechargeIdIn(financeRechargeIds);
            count = financeRechargeMapper.deleteByExample(financeRechargeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(rechargeNames, ",") + " ]会员充值记录记录");
            } else {
                returnResult.setMsg("发生未知错误，会员充值记录信息删除失败");
            }
        }
        return returnResult;
    }
    
    /**
     * @Title: getFinanceRechargeNumByAuditState 
     * @Description: TODO(根据会员充值记录的状态查询该状态的记录条数) 
     * @param  @param auditState
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getFinanceRechargeNumByAuditState(String auditState) {
        FinanceRechargeExample financeRechargeExample = new FinanceRechargeExample();
        financeRechargeExample.createCriteria().andAuditStateEqualTo(auditState);
        int financeRechargeNum = financeRechargeMapper.countByExample(financeRechargeExample);
        return financeRechargeNum;
    }
}