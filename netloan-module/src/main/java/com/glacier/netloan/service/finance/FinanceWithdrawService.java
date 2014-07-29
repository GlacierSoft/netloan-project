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
import com.glacier.netloan.dao.finance.FinanceBankCardMapper;
import com.glacier.netloan.dao.finance.FinanceMemberMapper;
import com.glacier.netloan.dao.finance.FinancePlatformMapper;
import com.glacier.netloan.dao.finance.FinancePlatformTransactionMapper;
import com.glacier.netloan.dao.finance.FinanceTransactionMapper;
import com.glacier.netloan.dao.finance.FinanceWithdrawMapper;
import com.glacier.netloan.dao.finance.FinanceWithdrawSetMapper;
import com.glacier.netloan.dao.member.MemberIntegralMapper;
import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dao.member.MemberMessageNoticeMapper;
import com.glacier.netloan.dao.member.MemberStatisticsMapper;
import com.glacier.netloan.dao.member.MemberTokenMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.finance.FinWithdrawQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterIntegralType;
import com.glacier.netloan.entity.basicdatas.ParameterIntegralTypeExample;
import com.glacier.netloan.entity.finance.FinanceBankCard;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinancePlatform;
import com.glacier.netloan.entity.finance.FinancePlatformExample;
import com.glacier.netloan.entity.finance.FinancePlatformTransaction;
import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.entity.finance.FinanceWithdraw;
import com.glacier.netloan.entity.finance.FinanceWithdrawExample;
import com.glacier.netloan.entity.finance.FinanceWithdrawExample.Criteria;
import com.glacier.netloan.entity.finance.FinanceWithdrawSet;
import com.glacier.netloan.entity.finance.FinanceWithdrawSetExample;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberIntegral;
import com.glacier.netloan.entity.member.MemberMessageNotice;
import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.entity.member.MemberStatisticsExample;
import com.glacier.netloan.entity.member.MemberToken;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
import com.glacier.netloan.util.MethodLog;
import com.glacier.security.util.Digests;
import com.glacier.security.util.Encodes;

/**
 * @ClassName: FinanceWithdrawService 
 * @Description: TODO(会员提现记录service层) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceWithdrawService {
	
	@Autowired
	private FinanceWithdrawMapper financeWithdrawMapper;

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private FinanceMemberMapper financeMemberMapper;
	
	@Autowired
	private FinanceTransactionMapper financeTransactionMapper;
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private FinanceBankCardMapper financeBankCardMapper;
	
	@Autowired
	private FinancePlatformMapper financePlatformMapper; 
	
	@Autowired
	private FinancePlatformTransactionMapper financePlatformTransactionMapper;
	
	@Autowired
	private MemberStatisticsMapper  memberStatisticsMapper;
	
	@Autowired
	private ParameterIntegralTypeMapper parameterIntegralTypeMapper;
	
	@Autowired
    private MemberIntegralMapper memberIntegralMapper;
	
	@Autowired
	private MemberMessageNoticeMapper  memberMessageNoticeMapper;
	
	@Autowired
	private FinanceWithdrawSetMapper  financeWithdrawSetMapper;
	
	@Autowired
	private MemberTokenMapper memberTokenMapper;
	
	/**
	 * @Title: getWithdraw 
	 * @Description: TODO(根据会员提现记录Id获取会员提现记录信息) 
	 * @param @param financeWithdrawId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getWithdraw(String financeWithdrawId) {
    	FinanceWithdraw financeWithdraw = financeWithdrawMapper.selectByPrimaryKey(financeWithdrawId);
        return financeWithdraw;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员提现记录信息) 
     * @param @param pfinanceWithdrawr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(FinWithdrawQueryDTO withdrawQueryDTO,JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceWithdrawExample financeWithdrawExample = new FinanceWithdrawExample();

        Criteria queryCriteria = financeWithdrawExample.createCriteria();
        withdrawQueryDTO.setQueryConditions(queryCriteria);
        
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeWithdrawExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeWithdrawExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeWithdrawExample.setOrderByClause(pager.getOrderBy("temp_finance_withdraw_"));
        }
        List<FinanceWithdraw>  financeWithdraws = financeWithdrawMapper.selectByExample(financeWithdrawExample); // 查询所有会员提现记录列表
        int total = financeWithdrawMapper.countByExample(financeWithdrawExample); // 查询总页数
        returnResult.setRows(financeWithdraws);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    public Object listAsWebsite(JqPager pager, String memberId, int p) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceWithdrawExample financeWithdrawExample = new FinanceWithdrawExample();

        if(StringUtils.isNotBlank(memberId) && null != memberId){
        	financeWithdrawExample.createCriteria().andMemberIdEqualTo(memberId);
        }
        
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeWithdrawExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeWithdrawExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeWithdrawExample.setOrderByClause(pager.getOrderBy("temp_finance_withdraw_"));
        }
        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
        financeWithdrawExample.setLimitStart(startTemp);
        financeWithdrawExample.setLimitEnd(5);
        List<FinanceWithdraw>  financeWithdraws = financeWithdrawMapper.selectByExample(financeWithdrawExample); // 查询所有会员提现记录列表
        int total = financeWithdrawMapper.countByExample(financeWithdrawExample); // 查询总页数
        returnResult.setRows(financeWithdraws);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addWithdraw 
     * @Description: TODO(新增会员提现记录) 
     * @param @param financeWithdraw
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */

	 /**
    * 加密方式
    */
   public static final String HASH_ALGORITHM = "SHA-1";

   /**
    * 计算次数
    */
   public static final int HASH_INTERATIONS = 1024;

   /**
    * 盐值长度
    */
   public static final int SALT_SIZE = 8;
    @Transactional(readOnly = false)
    public Object addWithdraw(FinanceWithdraw financeWithdraw, Member member, String bankCardId) {
    	
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	// 验证会员真正的交易密码是否等于输入的交易密码 
    	MemberToken mt = memberTokenMapper.selectByPrimaryKey(member.getMemberId());//通过memberId获取memberToken
        //将前台传来的密码进行加密，
    	byte[] salt = Encodes.decodeHex(mt.getTradersSalt());
    	byte[] hashPassword = Digests.sha1(member.getTradersPassword().getBytes(), salt, HASH_INTERATIONS);
    	String encodeHexPwd = Encodes.encodeHex(hashPassword);
       //将加密后的密码和存在数据库里的密码进行比较。
        if (!(mt.getTratersPassword()).equals(encodeHexPwd)) {
        	 returnResult.setMsg("交易密码错误，请重新输入");
             return returnResult;
        }
         
    	Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
  		Member pricipalMember = (Member) pricipalSubject.getPrincipal();
  		//获取超级管理员用户
  		UserExample userExample = new UserExample();
  		userExample.createCriteria().andUsernameEqualTo("admin");
  		List<User> users = userMapper.selectByExample(userExample);
  		//根据会员银行卡Id查找该银行卡信息
  		if (null == bankCardId && StringUtils.isBlank(bankCardId)) {
  		    returnResult.setMsg("提现银行卡为空，请先进行绑定银行卡操作");
  		    return returnResult;
  		}
  		FinanceBankCard financeBankCard = new FinanceBankCard();
  		financeBankCard = financeBankCardMapper.selectByPrimaryKey(bankCardId);
        int count = 0;
        //根据提现会员Id找到该会员的会员财务信息记录
        FinanceMember financeMember = new FinanceMember();
        financeMember = financeMemberMapper.selectByMemberId(member.getMemberId()); 
      
         //提现总金额不能小于100或者大于可用金额 
        if(financeWithdraw.getWithdrawAmount()<100||financeWithdraw.getWithdrawAmount()>financeMember.getUsableMoney()){
        	 returnResult.setMsg("提现金额不能低于￥100，且不能大于可用余额");
   		     return returnResult;
        } 
        
        FinanceWithdrawSetExample financeWithdrawSetExample =new FinanceWithdrawSetExample(); 
        List<FinanceWithdrawSet> financeWithdrawSet=financeWithdrawSetMapper.selectByExample(financeWithdrawSetExample);
       float amount=financeWithdraw.getWithdrawAmount();//提现金额
        for (FinanceWithdrawSet finance : financeWithdrawSet) {
		     //判断本次提现的金额是按什么提现类型进行收费
        	if(amount>=finance.getWithdrawSetMinimum()&&amount<=finance.getWithdrawSetMaximum()){
        	   if("directcost".equals(finance.getFeeWay())){ //直接收费
        	       financeWithdraw.setArriveMoney(amount-finance.getWithdrawRate());//到账金额=提现金额-手续费
        		   financeWithdraw.setHandlingCharge(finance.getWithdrawRate());//手续费
        		   financeWithdraw.setWithdrawRate(0f);//提现利率
        	   }else{ //比例收费
        		   financeWithdraw.setArriveMoney(amount-(amount*finance.getWithdrawRate()));//到账金额=提现金额-（提现*比率）
        		   financeWithdraw.setHandlingCharge(amount*finance.getWithdrawRate());//手续费
        		   financeWithdraw.setWithdrawRate(finance.getWithdrawRate());//提现利率
                }
			}
		}
        
        financeWithdraw.setFinanceWithdrawId(RandomGUID.getRandomGUID());
        // 赋值于提现记录的提现流水号
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        financeWithdraw.setWithdrawCode("withdraw"+ "_" + dateFormat.format(new Date()));
        financeWithdraw.setAuditState("authstr");
        financeWithdraw.setOpeningBank(financeBankCard.getOpeningBank());//提现银行
        financeWithdraw.setSubbranch(financeBankCard.getSubbranch());//提现支行
        financeWithdraw.setCardName(financeBankCard.getCardName());//提现银行卡姓名
        financeWithdraw.setCardNumber(financeBankCard.getCardNumber());//提现银行卡号
        financeWithdraw.setCreater(pricipalMember.getMemberId());
        financeWithdraw.setCreateTime(new Date());
        financeWithdraw.setUpdater(users.get(0).getUserId());
        financeWithdraw.setUpdateTime(new Date());
        count = financeWithdrawMapper.insert(financeWithdraw);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeWithdraw.getWithdrawCode() + "] 会员提现信息提交成功，等待审核中");
        } else {
            returnResult.setMsg("发生未知错误，会员提现记录信息保存失败");
        }
        return returnResult;
    } 
    
    /**
     * @Title: auditWithdraw 
     * @Description: TODO(审核会员提现记录信息) 
     * @param @param financeWithdraw
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WithdrawList_audit")
    public Object auditWithdraw(FinanceWithdraw finance) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        //取出本条提现记录的所有信息
        FinanceWithdraw financeWithdraw=financeWithdrawMapper.selectByPrimaryKey(finance.getFinanceWithdrawId()); 
        if(financeWithdraw.getAuditState().equals("pass")||financeWithdraw.getAuditState().equals("failure")){
        	returnResult.setMsg("该提现记录已进行过审核操作！");
        	return returnResult;
        }
        if(finance.getAuditState().equals("authstr")){
        	returnResult.setMsg("无效的操作");
        	return returnResult;
        }
        
        //取出会员信息
        Member member= memberMapper.selectByPrimaryKey(financeWithdraw.getMemberId());
         
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeWithdraw.setAuditor(pricipalUser.getUserId());
        financeWithdraw.setAuditState(finance.getAuditState());//提现记录状态
        financeWithdraw.setAuditDate(new Date()); 
        financeWithdraw.setUpdater(pricipalUser.getUserId());
        financeWithdraw.setUpdateTime(new Date());
        count = financeWithdrawMapper.updateByPrimaryKeySelective(financeWithdraw);
        if (count == 1) {
            //判断如果该提现记录通过审核，系统则会自动生成一条会员资金记录明细信息、平台资金记录明细信息，同时还会自动更新该会员的资金记录信息和平台的资金记录信息
            if (null != financeWithdraw.getAuditState() && StringUtils.isNotBlank(financeWithdraw.getAuditState())) {
                if ("pass".equals(financeWithdraw.getAuditState())) {
                    FinanceTransaction financeTransaction = new FinanceTransaction();
                    financeTransaction.setTransactionId(RandomGUID.getRandomGUID()); 
                    //根据提现会员Id找到该会员的会员财务信息记录
                    FinanceMember financeMember = new FinanceMember();
                    financeMember = financeMemberMapper.selectByMemberId(financeWithdraw.getMemberId()); 
                    financeTransaction.setFinanceMemberId(financeMember.getFinanceMemberId());
                    financeTransaction.setMemberId(financeWithdraw.getMemberId());
                    financeTransaction.setTransactionTarget("系统账号");
                    financeTransaction.setTransactionType("提现");
                    financeTransaction.setEarningMoney(0f);//收入金额
                    financeTransaction.setExpendMoney(financeWithdraw.getWithdrawAmount());//支出金额等于提现总额
                    financeTransaction.setUsableMoney(financeMember.getUsableMoney()-financeWithdraw.getWithdrawAmount());//记录的可用金额=原来可用金额-提现的总金额
                    financeTransaction.setFrozenMoney(financeMember.getFrozenMoney());//冻结金额不变
                    financeTransaction.setCollectingMoney(financeMember.getCollectingMoney());//代收金额不变
                    financeTransaction.setRefundMoney(financeMember.getRefundMoney());//待还金额不变
                    financeTransaction.setAmount(financeMember.getAmount()-financeWithdraw.getWithdrawAmount());//总金额=原来总金额-提现总金额
                    financeTransaction.setRemark("提现通过审核自动生成资金明细信息。");
                    financeTransaction.setCreateTime(new Date());
                    financeTransaction.setCreater(pricipalUser.getUserId());
                    financeTransaction.setUpdateTime(new Date());
                    financeTransaction.setUpdater(pricipalUser.getUserId());
                    count = financeTransactionMapper.insert(financeTransaction);
                    if (count == 1) {
                        //根据生成会员资金明显信息，自动更新会员资金信息
                        financeMember.setAmount(financeMember.getAmount()-financeWithdraw.getWithdrawAmount());//总金额
                        financeMember.setUsableMoney(financeMember.getUsableMoney()-financeWithdraw.getWithdrawAmount());//可用金额
                        financeMember.setWithdrawMonthTimes(financeMember.getWithdrawMonthTimes()+1);//本月提现次数
                        financeMember.setWithdrawTimes(financeMember.getWithdrawTimes()+1);//提现总次数
                        financeMember.setWithdrawMoney(financeMember.getWithdrawMoney()+financeWithdraw.getWithdrawAmount());//提现总金额
                        financeMember.setUpdater(pricipalUser.getUserId());//更新人
                        financeMember.setUpdateTime(new Date());//更新时间
                        count = financeMemberMapper.updateByPrimaryKeySelective(financeMember);
                        if (count == 1) {
                             	//取出默认平台资金的账户总余额 
                    		    FinancePlatformExample  financePlatformExample=new FinancePlatformExample();
                    		    financePlatformExample.createCriteria().andPlatformTypeEqualTo("default");
                    		    List<FinancePlatform> financePlatforms = financePlatformMapper.selectByExample(financePlatformExample);
                    		    FinancePlatform financePlatDate=financePlatforms.get(0); 
                    			//新增资金平台记录
                    			FinancePlatformTransaction  financePlatformTransaction=new FinancePlatformTransaction();
                    		    financePlatformTransaction.setPlatformTransactionId(RandomGUID.getRandomGUID());  //id
                    		    financePlatformTransaction.setFinancePlatformId(financePlatDate.getFinancePlatformId());//资金平台id
                    		    financePlatformTransaction.setTransactionTarget(member.getMemberRealName());//交易对象
                    		    financePlatformTransaction.setTransactionType("提现");//交易类型
                    		    financePlatformTransaction.setEarningMoney(0f);//收入金额
                    		    financePlatformTransaction.setExpendMoney(financeWithdraw.getWithdrawAmount());//支出金额=提现总金额
                    		    financePlatformTransaction.setAmount(financePlatDate.getPlatformMoney()-financeWithdraw.getWithdrawAmount());//总金额=原来的金额-提现的金额
                    		    financePlatformTransaction.setCreater(pricipalUser.getUserId());//创建人
                    		    financePlatformTransaction.setRemark("会员提现");
                    		    financePlatformTransaction.setCreateTime(new Date());
                    		    financePlatformTransaction.setUpdater(pricipalUser.getUserId());
                    		    financePlatformTransaction.setUpdateTime(new Date());
                    		    count=financePlatformTransactionMapper.insertSelective(financePlatformTransaction);//新增平台资金记录
                    		    //新增资金平台记录,手续费记录
                    			FinancePlatformTransaction  financePlatformTransactions=new FinancePlatformTransaction();
                    		    financePlatformTransactions.setPlatformTransactionId(RandomGUID.getRandomGUID());  //id
                    		    financePlatformTransactions.setFinancePlatformId(financePlatDate.getFinancePlatformId());//资金平台id
                    		    financePlatformTransactions.setTransactionTarget(member.getMemberRealName());//交易对象
                    		    financePlatformTransactions.setTransactionType("提现手续费");//交易类型
                    		    financePlatformTransactions.setEarningMoney(financeWithdraw.getHandlingCharge());//收入金额=提现的手续费
                    		    financePlatformTransactions.setExpendMoney(0f);//支出金额=提现总金额
                    		    financePlatformTransactions.setAmount(financePlatDate.getPlatformMoney()-financeWithdraw.getWithdrawAmount()+financeWithdraw.getHandlingCharge());//总金额=原来的金额-提现的金额+提现的手续费
                    		    financePlatformTransactions.setCreater(pricipalUser.getUserId());//创建人
                    		    financePlatformTransactions.setRemark("会员提现所产生的手续费");
                    		    financePlatformTransactions.setCreateTime(new Date());
                    		    financePlatformTransactions.setUpdater(pricipalUser.getUserId());
                    		    financePlatformTransactions.setUpdateTime(new Date());
                    		    count=financePlatformTransactionMapper.insertSelective(financePlatformTransactions);//新增平台资金记录
                    		    //更新资金平台的数据
                    		    financePlatDate.setPlatformMoney(financePlatDate.getPlatformMoney()-financeWithdraw.getWithdrawAmount()+financeWithdraw.getHandlingCharge());//资金平台余额=原有金额-提现金额+手续费
                    		    financePlatDate.setUpdater(pricipalUser.getUserId());//更新人
                    		    financePlatDate.setUpdateTime(new Date());//更新时间
                    		    financePlatformMapper.updateByPrimaryKeySelective(financePlatDate);//更新资金平台数据
                    		    MemberStatisticsExample  memberStatisticsExample=new MemberStatisticsExample();
                    		    memberStatisticsExample.createCriteria().andMemberIdEqualTo(member.getMemberId());
                    	 		List<MemberStatistics> memberStatistics = memberStatisticsMapper.selectByExample(memberStatisticsExample);
                    	 	    MemberStatistics memberStatistic=memberStatistics.get(0);
                    	 		//更新会员统计信息 
                    			memberStatistic.setUplineDeltaAwards(0f);//线下充值奖励
                    			memberStatistic.setUpdater(pricipalUser.getUserId());//更新人
                    			memberStatistic.setUpdateTime(new Date());//统计时间更新 
                    			memberStatisticsMapper.updateByPrimaryKey(memberStatistic); 
                           }    
                    		   
                    		     //取出提现奖励积分的对象
                    			 ParameterIntegralTypeExample  parameterIntegralTypeExample=new ParameterIntegralTypeExample();
                    			 parameterIntegralTypeExample.createCriteria().andIntegralTypeEqualTo("withdraw");
                    			 parameterIntegralTypeExample.createCriteria().andChangeTypeEqualTo("increase");
                     		     List<ParameterIntegralType> memberStatistics = parameterIntegralTypeMapper.selectByExample(parameterIntegralTypeExample);
                     		     ParameterIntegralType parameterIntegralType=memberStatistics.get(0);
                     		    //增加该会员的一条积分记录信息 
                    		     MemberIntegral memberIntegral=new MemberIntegral();
                    		     memberIntegral.setMemberIntegralId(RandomGUID.getRandomGUID());
                    		     memberIntegral.setMemberId(member.getMemberId());
                    		     memberIntegral.setChangeType(parameterIntegralType.getChangeType());//积分类型
                    		     memberIntegral.setChangeValue(parameterIntegralType.getChangeValue());//增加积分的值
                    		     memberIntegral.setType(parameterIntegralType.getIntegralType());//提现奖励积分
                    		     memberIntegral.setRemark(parameterIntegralType.getRemark());
                    		     memberIntegral.setCreater(pricipalUser.getUserId());//创建人
                    		     memberIntegral.setCreateTime(new Date());
                    		     memberIntegral.setUpdater(pricipalUser.getUserId());
                    		     memberIntegral.setUpdateTime(new Date());
                    		     count=memberIntegralMapper.insert(memberIntegral);//新增会员积分记录
                    		      //新增站内短信记录
                    		     MemberMessageNotice  memberMessageNotice=new MemberMessageNotice();
                    		     memberMessageNotice.setMessageNoticeId(RandomGUID.getRandomGUID());
                    		     memberMessageNotice.setSender(pricipalUser.getUserId());//发信人，系统管理员
                    		     memberMessageNotice.setAddressee(member.getMemberId());//收信人
                    		     memberMessageNotice.setTitle("提现信息");//标题
                    		     memberMessageNotice.setContent("尊敬的会员："+member.getMemberName()+",您已成功提现￥"+financeWithdraw.getWithdrawAmount()+"元。除去手续费￥"+financeWithdraw.getHandlingCharge()+"元,实际提现为：￥"+(financeWithdraw.getWithdrawAmount()-financeWithdraw.getHandlingCharge()));//短信内容
                    		     memberMessageNotice.setSendtime(new Date());
                    		     memberMessageNotice.setLetterstatus("unread");//信件状态，默认为未读
                    		     memberMessageNotice.setLettertype("system");//信件类型，系统消息
                    		     memberMessageNotice.setRemark("会员提现");//备注
                    		     memberMessageNotice.setCreater(pricipalUser.getUserId());//创建人，系统管理员
                    		     memberMessageNotice.setCreateTime(new Date());//创建时间
                    		     memberMessageNotice.setUpdater(pricipalUser.getUserId());//更新人
                    		     memberMessageNotice.setUpdateTime(new Date());//更新时间
                    		     memberMessageNoticeMapper.insert(memberMessageNotice);//新增站内短信
                    		      //更新会员信息的积分字段
                    		     member.setIntegral(member.getIntegral()+parameterIntegralType.getChangeValue());//积分=原有的积分+增加的积分
                    		     member.setUpdater(pricipalUser.getUserId());
                    		     member.setUpdateTime(new Date());
                    		     memberMapper.updateByPrimaryKey(member); //更改会员积分
                    	   
                    } else {
                        returnResult.setMsg("发生未知错误，会员提现记录信息保存失败");
                    }
                } 
            }
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeWithdraw.getWithdrawCode() + "] 会员提现记录操作成功！");
        } else {
            returnResult.setMsg("发生未知错误，会员提现记录信息审核失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delWithdraw 
     * @Description: TODO(删除会员提现记录) 
     * @param @param financeWithdrawId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "WithdrawList_del")
    public Object delWithdraw(List<String> financeWithdrawIds, List<String> withdrawCodes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (financeWithdrawIds.size() > 0) {
        	FinanceWithdrawExample financeWithdrawExample = new FinanceWithdrawExample();
        	financeWithdrawExample.createCriteria().andFinanceWithdrawIdIn(financeWithdrawIds);
            count = financeWithdrawMapper.deleteByExample(financeWithdrawExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(withdrawCodes, ",") + " ]会员提现记录记录");
            } else {
                returnResult.setMsg("发生未知错误，会员提现记录信息删除失败");
            }
        }
        return returnResult;
    }
    
    /**
     * @Title: getFinanceWithdrawNumByAuditState 
     * @Description: TODO(根据会员提现记录状态查找出该提现记录的条数) 
     * @param  @param AuditState
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getFinanceWithdrawNumByAuditState(String AuditState) {
        FinanceWithdrawExample financeWithdrawExample = new FinanceWithdrawExample();
        financeWithdrawExample.createCriteria().andAuditStateEqualTo(AuditState);
        int financeWithdrawNum = financeWithdrawMapper.countByExample(financeWithdrawExample);
        return financeWithdrawNum;
    }
}