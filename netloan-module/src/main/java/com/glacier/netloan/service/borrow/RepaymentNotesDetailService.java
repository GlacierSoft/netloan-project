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
import com.glacier.netloan.dao.borrow.ReceivablesNotesDetailMapper;
import com.glacier.netloan.dao.borrow.ReceivablesNotesMapper;
import com.glacier.netloan.dao.borrow.RepaymentNotesDetailMapper;
import com.glacier.netloan.dao.borrow.RepaymentNotesMapper;
import com.glacier.netloan.dao.borrow.TenderNotesMapper;
import com.glacier.netloan.dao.finance.FinanceMemberMapper;
import com.glacier.netloan.dao.finance.FinancePlatformMapper;
import com.glacier.netloan.dao.finance.FinancePlatformTransactionMapper;
import com.glacier.netloan.dao.finance.FinanceTransactionMapper;
import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dao.member.MemberStatisticsMapper;
import com.glacier.netloan.dao.member.MemberTokenMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.borrow.RepaymentNotesDetailQueryDTO;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.ReceivablesNotes;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetail;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetailExample;
import com.glacier.netloan.entity.borrow.ReceivablesNotesExample;
import com.glacier.netloan.entity.borrow.RepaymentNotes;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetail;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetailExample;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetailExample.Criteria;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.borrow.TenderNotesExample;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinancePlatform;
import com.glacier.netloan.entity.finance.FinancePlatformExample;
import com.glacier.netloan.entity.finance.FinancePlatformTransaction;
import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.entity.member.MemberToken;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
import com.glacier.netloan.util.MethodLog;
import com.glacier.security.util.Digests;
import com.glacier.security.util.Encodes;

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
	private TenderNotesMapper tenderNotesMapper;
	
	@Autowired
	private FinancePlatformMapper financePlatformMapper;
	
	@Autowired
	private FinancePlatformTransactionMapper financePlatformTransactionMapper;
	
	@Autowired
	private RepaymentNotesMapper repaymentNotesMapper;
	
	@Autowired
	private ReceivablesNotesMapper receivablesNotesMapper; 
	
	@Autowired
	private ReceivablesNotesDetailMapper receivablesNotesDetailMapper;
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
    private MemberTokenMapper memberTokenMapper;
	
	@Autowired
	private MemberStatisticsMapper memberStatisticsMapper; 
	
	@Autowired
	private FinanceMemberMapper financeMemberMapper;
	
	@Autowired
	private FinanceTransactionMapper financeTransactionMapper;
	
	@Autowired
	private UserMapper userMapper;
	
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
	 * @Title: getRepaymentNotesDetailStart 
	 * @Description: TODO(根据还款记录明细Id获取还款记录明细信息第一期) 
	 * @param @param repayNotesDetailId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getRepaymentNotesDetailStart(String repayNotesId) {
    	RepaymentNotesDetailExample repaymentNotesDetailExample = new RepaymentNotesDetailExample();
    	repaymentNotesDetailExample.createCriteria().andNumberPeriodEqualTo(1).andRepayNotesIdEqualTo(repayNotesId);
        return repaymentNotesDetailMapper.selectByExample(repaymentNotesDetailExample);
    }
    
    /**
	 * @Title: getRepaymentNotesDetailEnd 
	 * @Description: TODO(根据还款记录明细Id获取还款记录明细信息最后一期) 
	 * @param @param repayNotesDetailId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getRepaymentNotesDetailEnd(String repayNotesId,int numberPeriod) {
    	RepaymentNotesDetailExample repaymentNotesDetailExample = new RepaymentNotesDetailExample();
    	repaymentNotesDetailExample.createCriteria().andNumberPeriodEqualTo(numberPeriod).andRepayNotesIdEqualTo(repayNotesId);
        return repaymentNotesDetailMapper.selectByExample(repaymentNotesDetailExample);
    }
    
    /**
	 * @Title: getRepaymentNotesDetailList 
	 * @Description: TODO(根据还款记录明细Id获取所有关联此ID的还款记录明细信息) 
	 * @param @param repayNotesDetailId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getRepaymentNotesDetailList(String repayNotesId) {
    	RepaymentNotesDetailExample repaymentNotesDetailExample = new RepaymentNotesDetailExample();
    	repaymentNotesDetailExample.createCriteria().andRepayNotesIdEqualTo(repayNotesId);
        return repaymentNotesDetailMapper.selectByExample(repaymentNotesDetailExample);
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
        if(null != loanId && StringUtils.isNotBlank(loanId)){
            RepaymentNotes repaymentNotes = repaymentNotesMapper.selectByPrimaryLoanId(loanId);//根据借款Id查找出对应的还款信息记录
            if (repaymentNotes != null) {//如果借款记录存在了还款信息，系统就把还款明细信息查询出来
                if(null != repaymentNotes.getRepayNotesId() && StringUtils.isNotBlank(repaymentNotes.getRepayNotesId())){
                    repaymentNotesDetailExample.createCriteria().andRepayNotesIdEqualTo(repaymentNotes.getRepayNotesId());//根据还款信息记录Id查找出对应的还款记录明细
                }
            }else {
                return returnResult;// 返回ExtGrid表
            }
        }
        jqPager.setSort("numberPeriod");// 定义排序字段
        jqPager.setOrder("ASC");// 升序还是降序
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
    public Object addRepaymentNotesDetail(RepaymentNotesDetail repaymentNotesDetails,RepaymentNotes repaymentNotesNew) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        BorrowingLoan borrowingLoanNew = (BorrowingLoan) borrowingLoanMapper.selectByPrimaryKey(repaymentNotesNew.getLoanId());
        
        for(int i = 0;i < Integer.parseInt(borrowingLoanNew.getLoanDeadlinesId());i++){
        	RepaymentNotesDetail repaymentNotesDetail = new RepaymentNotesDetail();
        	repaymentNotesDetail.setNumberPeriod(i+1);//设置当前是第几期
        	Calendar c = Calendar.getInstance();//日历对象
 	        c.setTime(new Date());//获取当前时间
 	        c.add(Calendar.MONTH, i+1);//在当前时间上加一个月
        	repaymentNotesDetail.setShouldPayDate(c.getTime());//设置应还款日期
        	float shouldPayMoney=0f;//设置本息
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
    				shouldPayMoney = everyMonthInterest + borrowingLoanNew.getLoanTotal();
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
    				float everyMonthInterest = borrowingLoanNew.getLoanTotal() * (borrowingLoanNew.getLoanApr()/12);//每月利息
    				float interest = everyMonthInterest * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId());//总利息
        			shouldPayMoney = interest + borrowingLoanNew.getLoanTotal();//总本息=总利息+本金
    				repaymentNotesDetail.setCurrentPayMoeny(shouldPayMoney);//设置当期应还本息
    				repaymentNotesDetail.setCurrentPayPrincipal(borrowingLoanNew.getLoanTotal());//设置当期应还本金
        			repaymentNotesDetail.setCurrentPayInterest(interest);//设置当期应还利息
    			}else {
    			    continue;//跳出本次循环,“一次性还款”指最后一期才进行还款本息
    			}
    		}
    		//还款明细公共字段进行赋值
    		repaymentNotesDetail.setRepayNotesDetailId(RandomGUID.getRandomGUID());
    	 	repaymentNotesDetail.setMemberId(borrowingLoanNew.getMemberId()); 
        	repaymentNotesDetail.setRepayNotesId(repaymentNotesNew.getRepayNotesId());//设置交款标题
            repaymentNotesDetail.setActualPayMoney(0f);//实还本息
            repaymentNotesDetail.setAlsoNeedMoney(0f);//总还款金额
            repaymentNotesDetail.setOverdueDays("0");
            repaymentNotesDetail.setOverdueInterest(0f);
            repaymentNotesDetail.setOverdueManaFee(0f);
            repaymentNotesDetail.setOverdueUrgeFee(0f);
            repaymentNotesDetail.setIsAdvances("no");//设置是否网站代还
            repaymentNotesDetail.setIsOverdue("no");//设置是否逾期
            repaymentNotesDetail.setRepayState("notRepay");//设置还款记录明细表状态为“还款中”
            repaymentNotesDetail.setRemark("满标复审通过时，系统自动添加还款记录明细信息");
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
        Member m1 = memberMapper.selectByPrimaryKey(member.getMemberId());//通过memberid获取member
        MemberToken mt = memberTokenMapper.selectByPrimaryKey(member.getMemberId());//通过memberId获取memberToken
        //将前台传来的密码进行加密，
        byte[] salt = Encodes.decodeHex(mt.getTradersSalt());
        byte[] hashPassword = Digests.sha1(member.getTradersPassword().getBytes(), salt, HASH_INTERATIONS);
        String encodeHexPwd = Encodes.encodeHex(hashPassword);
        //将加密后的密码和存在数据库里的密码进行比较。
        if (!(m1.getTradersPassword()).equals(encodeHexPwd)) {
            returnResult.setMsg("交易密码错误，请重新输入");
            return returnResult;
        }
        // 防止验证码错误
        if (!captchaBoolean) {
            returnResult.setMsg("验证码错误，请重新输入");
            return returnResult;
        }
        int count = 0;
        // 查找出超级管理员的用户信息
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo("admin");
        List<User> users = userMapper.selectByExample(userExample);
        User pricipalUser = users.get(0);
        //更新还款记录明细表WT于2014-6-30增加
        RepaymentNotesDetail repaymentNotesDetail = repaymentNotesDetailMapper.selectByPrimaryKey(repayNotesDetailId);// 根据还款明细Id查找出对应的还款明细信息记录
        
        if(repaymentNotesDetail.getRepayState().equals("alreadRepay")){
        	  returnResult.setMsg("该期数已还完");
        	  return returnResult;
        }
        
        
        repaymentNotesDetail.setRepayState("alreadRepay");
        repaymentNotesDetail.setActualPayDate(new Date());//赋值实还时间current_pay_moeny
        repaymentNotesDetail.setActualPayMoney(repaymentNotesDetail.getCurrentPayMoeny());//实还本息等于本期应还本息
        //设置需还总额=应还本息+逾期罚息+逾期催收费+逾期管理费
        repaymentNotesDetail.setAlsoNeedMoney(repaymentNotesDetail.getCurrentPayMoeny()+repaymentNotesDetail.getOverdueInterest()+repaymentNotesDetail.getOverdueUrgeFee()+repaymentNotesDetail.getOverdueManaFee());
        repaymentNotesDetail.setRemark("借款人进行还款成功时，系统进行更新还款明细信息");
        repaymentNotesDetail.setUpdater(pricipalUser.getUserId());
        repaymentNotesDetail.setUpdateTime(new Date());
        //执行更新还款记录明细操作
        count = repaymentNotesDetailMapper.updateByPrimaryKeySelective(repaymentNotesDetail);//执行更新操作并返回值
        if(count==1){
        	//更新还款记录表
        	//根据还款明细中的还款记录ID取出还款记录信息WT于2014-6-30创建
        	RepaymentNotes repaymentNotesUpdate = repaymentNotesMapper.selectByPrimaryKey(repaymentNotesDetail.getRepayNotesId());
        	repaymentNotesUpdate.setRepaymentTotal(repaymentNotesUpdate.getRepaymentTotal()+repaymentNotesDetail.getAlsoNeedMoney());//设置还款总金额(原来还款总金额+现在归还总还款金额)
        	repaymentNotesUpdate.setAlrPayMoney(repaymentNotesUpdate.getAlrPayMoney()+repaymentNotesDetail.getCurrentPayMoeny());//设置已还本息(已归还的本息+现在归还的本息)
        	repaymentNotesUpdate.setAlrPayPrincipal(repaymentNotesUpdate.getAlrPayPrincipal()+repaymentNotesDetail.getCurrentPayPrincipal());//设置已还本金(已归还的本金+现在归还的本金)
        	repaymentNotesUpdate.setAlrPayInterest(repaymentNotesUpdate.getAlrPayInterest()+repaymentNotesDetail.getCurrentPayInterest());//设置已还利息(已归还的利息+现在归还的利息)
        	repaymentNotesUpdate.setNotPayMoney(repaymentNotesUpdate.getShouldPayMoney()-repaymentNotesUpdate.getAlrPayMoney());//设置未还本息(应还本息-已还的本息)
        	repaymentNotesUpdate.setNotPayPrincipal(repaymentNotesUpdate.getShouldPayPrincipal()-repaymentNotesUpdate.getAlrPayPrincipal());//设置未还本金(应还本金-已还本金)
        	repaymentNotesUpdate.setNotPayInterest(repaymentNotesUpdate.getShouldPayInterest()-repaymentNotesUpdate.getAlrPayInterest());//设置未还利息(应还利息-已还利息)
            repaymentNotesUpdate.setAlrOverdueInterest(repaymentNotesUpdate.getAlrOverdueInterest()+repaymentNotesDetail.getOverdueInterest());//设置已还逾期罚息
            repaymentNotesUpdate.setAlrOverdueUrge(repaymentNotesUpdate.getAlrOverdueUrge()+repaymentNotesDetail.getOverdueUrgeFee());//已还逾期催收费
            repaymentNotesUpdate.setAlrOverdueMana(repaymentNotesUpdate.getAlrOverdueMana()+repaymentNotesDetail.getOverdueManaFee());//已还逾期管理费
            repaymentNotesUpdate.setRemark("借款人进行还款成功时，系统进行更新还款信息");
        	repaymentNotesUpdate.setUpdater(pricipalUser.getUserId());
        	repaymentNotesUpdate.setUpdateTime(new Date());
        	//执行更新还款记录的操作--
        	repaymentNotesMapper.updateByPrimaryKeySelective(repaymentNotesUpdate);
        	//执行更新还款人用户的信用额度
        	Member MemberRepayment = memberMapper.selectByPrimaryKey(member.getMemberId());
        	MemberRepayment.setCreditamount(MemberRepayment.getCreditamount()+repaymentNotesDetail.getCurrentPayPrincipal());//设置信用额度(原本的信用额度+本期应还的本金)
        	MemberRepayment.setUpdater(pricipalUser.getUserId());
        	MemberRepayment.setUpdateTime(new Date());
        	memberMapper.updateByPrimaryKeySelective(MemberRepayment);//执行更新
        	//根据还款记录明细中的状态为"notRepay"和是还款记录的ID查询出符合条件的记录明细信息
	        RepaymentNotesDetailExample repaymentNotesDetailExample = new RepaymentNotesDetailExample();
	        repaymentNotesDetailExample.createCriteria().andRepayStateEqualTo("notRepay").andRepayNotesIdEqualTo(repaymentNotesUpdate.getRepayNotesId());
	        List<RepaymentNotesDetail> repaymentNotesDetails = repaymentNotesDetailMapper.selectByExample(repaymentNotesDetailExample);
	        //判断还款记录的还款状态少于或等于0
	        if(repaymentNotesDetails.size()<=0){
	        	//查找还款记录明细状态为未还的条数为0时，执行更新还款记录的状态为alreadRepay
	        	repaymentNotesUpdate.setRepayState("alreadRepay");
	        	repaymentNotesMapper.updateByPrimaryKeySelective(repaymentNotesUpdate);
	        	//然后根据还款记录中的借款ID取出借款的信息
	        	BorrowingLoan borrowingLoan = borrowingLoanMapper.selectByPrimaryKey(repaymentNotesUpdate.getLoanId());
	        	//修改借款的状态
	        	borrowingLoan.setLoanState("completed");
	        	//执行修改操作
	        	borrowingLoanMapper.updateByPrimaryKeySelective(borrowingLoan);
	        }
            // 还款明细信息修改成功后，更新该会员的会员资金信息
            FinanceMember financeMember = financeMemberMapper.selectByMemberId(member.getMemberId());// 根据会员Id查找出该会员的财务会员信息记录
            financeMember.setAmount(financeMember.getAmount() - repaymentNotesDetail.getAlsoNeedMoney());// 现在的会员帐号总余额=之前的会员帐号余额-需还总额
            financeMember.setUsableMoney(financeMember.getUsableMoney() - repaymentNotesDetail.getAlsoNeedMoney());// 现在的会员帐号可用余额=之前的会员帐号可用余额-需还总额
            financeMember.setRefundMoney(financeMember.getRefundMoney() - repaymentNotesDetail.getAlsoNeedMoney());// 现在的会员帐号待还金额=之前的会员帐号待还金额-需还总额
            count = financeMemberMapper.updateByPrimaryKeySelective(financeMember);
            // 系统成功自动更新该会员的财务信息后，再自动生成一条会员资金记录明细信息
            // 向会员资金记录明细进行赋值WT于2014-6-30增加并且检查
            FinanceTransaction financeTransaction = new FinanceTransaction();
            financeTransaction.setTransactionId(RandomGUID.getRandomGUID());
            financeTransaction.setFinanceMemberId(financeMember.getFinanceMemberId());//会员资金信息ID
            financeTransaction.setMemberId(member.getMemberId());//设置会员ID
            financeTransaction.setTransactionTarget("系统账号");
            financeTransaction.setTransactionType("借款人进行还款");
            financeTransaction.setEarningMoney((float) 0);//设置收入金额
            financeTransaction.setExpendMoney(repaymentNotesDetail.getAlsoNeedMoney());//设置支出金额
            financeTransaction.setUsableMoney(financeMember.getUsableMoney());//设置可用余额
            financeTransaction.setFrozenMoney(financeMember.getFrozenMoney());//设置冻结金额
            financeTransaction.setCollectingMoney(financeMember.getCollectingMoney());//设置代收金额
            financeTransaction.setRefundMoney(financeMember.getRefundMoney());//设置待还金额
            financeTransaction.setAmount(financeMember.getAmount());//设置总金额
            financeTransaction.setRemark("还款成功，系统自动生成的会员资金记录明细信息");
            financeTransaction.setCreater(pricipalUser.getUserId());
            financeTransaction.setCreateTime(new Date());
            financeTransaction.setUpdater(pricipalUser.getUserId());
            financeTransaction.setUpdateTime(new Date());
            count = financeTransactionMapper.insert(financeTransaction);
            
            //更新还款人的会员统计信息WT于2014-6-30创建
            MemberStatistics memberStatistics = memberStatisticsMapper.selectByMemberId(member.getMemberId());
            memberStatistics.setAlreadyTotal(memberStatistics.getAlreadyTotal()+repaymentNotesDetail.getCurrentPayMoeny());//设置已还总额(现在的已还总额+现在归还的总额)
            memberStatistics.setWaitAlsoTotal(memberStatistics.getWaitAlsoTotal()-repaymentNotesDetail.getCurrentPayMoeny());//设置待还总额(现在的待还总额-现在归还的总额)
            memberStatistics.setNormalRepayment(memberStatistics.getNormalRepayment()+1);//设置正常还款+1
            memberStatistics.setAlreadyPrincipal(memberStatistics.getAlreadyPrincipal()+repaymentNotesDetail.getCurrentPayPrincipal());//设置已还本金(现在的已还本金+现在归还本金)
            memberStatistics.setWaitAlsoPrincipal(memberStatistics.getWaitAlsoPrincipal()-repaymentNotesDetail.getCurrentPayPrincipal());//设置待还本金(现在的待还本金-现在归还本金)
            memberStatistics.setAlreadyInterest(memberStatistics.getAlreadyInterest()+repaymentNotesDetail.getCurrentPayInterest());//设置已还利息(现在的已还利息+现在归还利息)
            memberStatistics.setWaitAlsoInterest(memberStatistics.getWaitAlsoInterest()-repaymentNotesDetail.getCurrentPayInterest());//设置待还利息(现在的待还利息-现在归还利息)
            //执行更新操作--
            memberStatisticsMapper.updateByPrimaryKeySelective(memberStatistics);
            if (count == 1) {
            	//-----------------------投资人收款更新---------------------------
            	//第一步先取出默认的资金平台default
            	FinancePlatformExample financePlatformExample = new FinancePlatformExample();
            	financePlatformExample.createCriteria().andPlatformTypeEqualTo("default");
            	List<FinancePlatform> financePlatformList = financePlatformMapper.selectByExample(financePlatformExample);
            	FinancePlatform financePlatform = financePlatformList.get(0);
            	//给资金平台增加相应的资金余额--
            	financePlatform.setPlatformMoney(financePlatform.getPlatformMoney()+repaymentNotesDetail.getAlsoNeedMoney());//设置平台资金余额(还款人的还款总额+平台资金的余额)
            	financePlatform.setRemark("平台向借款人收款成功后，更新平台资金");//设置备注
                financePlatform.setCreater(pricipalUser.getUserId());
                financePlatform.setCreateTime(new Date());
                financePlatform.setUpdater(pricipalUser.getUserId());
                financePlatform.setUpdateTime(new Date());
            	financePlatformMapper.updateByPrimaryKeySelective(financePlatform);//执行更新资金平台的操作
            	
            	//第二步添加平台资金记录信息
            	FinancePlatformTransaction financePlatformTransaction = new FinancePlatformTransaction();//构建平台资金记录对象
            	financePlatformTransaction.setPlatformTransactionId(RandomGUID.getRandomGUID());//随即产生字符串ID
            	financePlatformTransaction.setFinancePlatformId(financePlatform.getFinancePlatformId());//平台资金ID
            	financePlatformTransaction.setTransactionTarget(m1.getMemberRealName());//设置对象人
            	financePlatformTransaction.setTransactionType("平台向借款人收款");//设置交易类型
            	financePlatformTransaction.setEarningMoney(repaymentNotesDetail.getAlsoNeedMoney());//设置收入金额
            	financePlatformTransaction.setExpendMoney(0f);//设置支出金额
            	financePlatformTransaction.setAmount(financePlatform.getPlatformMoney());//设置平台资金总金额
            	financePlatformTransaction.setRemark("平台向借款人收款成功，生成平台资金信息记录");//设置备注信息
            	financePlatformTransaction.setCreater(pricipalUser.getUserId());
            	financePlatformTransaction.setCreateTime(new Date());
            	financePlatformTransaction.setUpdater(pricipalUser.getUserId());
            	financePlatformTransaction.setUpdateTime(new Date());
            	//执行添加操作
            	financePlatformTransactionMapper.insert(financePlatformTransaction);
            	//------------------------投资人的操作部分----------------------------------
            	//第一步根据还款记录明细ID取出还款记录明细完整信息
            	RepaymentNotesDetail repaymentNotesDetailTemp = repaymentNotesDetailMapper.selectByPrimaryKey(repayNotesDetailId);
            	//第二步根据还款记录明细中的还款记录ID获取完整的还款记录信息
            	RepaymentNotes repaymentNotes = repaymentNotesMapper.selectByPrimaryKey(repaymentNotesDetailTemp.getRepayNotesId());
            	//第三步根据还款记录中的借款ID获取完整的借款信息
            	BorrowingLoan borrowingLoan = borrowingLoanMapper.selectByPrimaryKey(repaymentNotes.getLoanId());
            	//第四步根据借款ID取出跟借款ID有关联的投资记录List集合中
            	TenderNotesExample tenderNotesExample=new TenderNotesExample();
            	tenderNotesExample.createCriteria().andLoanIdEqualTo(borrowingLoan.getLoanId());
            	List<TenderNotes> tenderNotesList = tenderNotesMapper.selectByExample(tenderNotesExample);
            	//第五步循环TenderNotesList中每一条投资记录
            	for (TenderNotes tenderNotes : tenderNotesList) {
            		
            		//第六步根据投资记录ID取出跟该投资记录ID有关联的收款记录List集合信息
            		ReceivablesNotesExample ReceivablesNotesExample = new ReceivablesNotesExample();
                	ReceivablesNotesExample.createCriteria().andTenderNotesIdEqualTo(tenderNotes.getTenderNotesId());
                	List<ReceivablesNotes> receivablesNotesList=receivablesNotesMapper.selectByExample(ReceivablesNotesExample);
                	//第七步循环receivablesNotesList中每一条收款记录
                	for (ReceivablesNotes receivablesNotes : receivablesNotesList) {
                		//第八步根据收款记录ID取出跟该收款记录ID有关联的收款记录明细List集合信息
                		ReceivablesNotesDetailExample receivablesNotesDetailExample = new ReceivablesNotesDetailExample();
                		receivablesNotesDetailExample.createCriteria().andReceNotesIdEqualTo(receivablesNotes.getReceNotesId());
                		List<ReceivablesNotesDetail> receivablesNotesDetailList = receivablesNotesDetailMapper.selectByExample(receivablesNotesDetailExample);
                		for (ReceivablesNotesDetail receivablesNotesDetail : receivablesNotesDetailList) {
							//判断收款的期数跟还款的期数是否一样
                			if(receivablesNotesDetail.getNumberPeriod()==repaymentNotesDetailTemp.getNumberPeriod()){
                            	
                            	//更新投资会员统计信息
                            	MemberStatistics memberStatisticsTemp = memberStatisticsMapper.selectByMemberId(tenderNotes.getMemberId());
                            	memberStatisticsTemp.setAlreadyIncomeTotal(memberStatisticsTemp.getAlreadyIncomeTotal()+receivablesNotesDetail.getCurrentReceMoeny());//设置会员统计已收总额(原本的已收总额+还款人的还款总额)
                            	memberStatisticsTemp.setWaitIncomeTotal(memberStatisticsTemp.getWaitIncomeTotal()-receivablesNotesDetail.getCurrentReceMoeny());//设置会员统计待收总额(原来的待收总额-还款的总额)
                            	memberStatisticsTemp.setAlreadyIncomePrincipal(memberStatisticsTemp.getAlreadyIncomePrincipal()+receivablesNotesDetail.getCurrentRecePrincipal());//设置已收本金(原本的已收本金+还款人的还款本金)
                            	memberStatisticsTemp.setWaitIncomePrincipal(memberStatisticsTemp.getWaitIncomePrincipal()-receivablesNotesDetail.getCurrentRecePrincipal());//设置待收本金(原本的待收本金-还款人的还款本金)
                            	memberStatisticsTemp.setAlreadyIncomeInterest(memberStatisticsTemp.getAlreadyIncomeInterest()+receivablesNotesDetail.getCurrentReceInterest());//设置已收本息(原本的已收利息+还款人的还款利息)
                            	memberStatisticsTemp.setWaitIncomeInterest(memberStatisticsTemp.getWaitIncomeInterest()-receivablesNotesDetail.getCurrentReceInterest());//设置待收本息(原本的待收利息-还款人的还款利息)
                            	//执行会员统计更新
                            	memberStatisticsMapper.updateByPrimaryKeySelective(memberStatisticsTemp);
                            	
                            	//更改收款明细记录表的收款状态
                            	receivablesNotesDetail.setReceState("alreadReceivables");
                            	receivablesNotesDetail.setActualReceDate(new Date());
                            	receivablesNotesDetail.setSurplusPrincipal(0f);//设置未收本金为0
                            	receivablesNotesDetail.setAmount(receivablesNotesDetail.getCurrentRecePrincipal() + receivablesNotesDetail.getIncome());//设置收款总金额=应收本金+收益
                            	receivablesNotesDetail.setRemark("借款人进行还款成功时，系统自动进行更新收款明细信息");
                            	receivablesNotesDetail.setUpdater(pricipalUser.getUserId());
                            	receivablesNotesDetail.setUpdateTime(new Date());
                            	//执行更新收款明细记录
                            	receivablesNotesDetailMapper.updateByPrimaryKeySelective(receivablesNotesDetail);
                            	
                            	//更新收款记录中的收款总金额、已收本金、已收利息、已收本息、未收利息、已收本息、未收本息、已收逾期罚息、利息管理费、收益
                            	ReceivablesNotes receivablesNotesTemp = receivablesNotesMapper.selectByPrimaryKey(receivablesNotesDetail.getReceNotesId());
                            	receivablesNotesTemp.setReceivablesTotal(receivablesNotesTemp.getReceivablesTotal()+receivablesNotesDetail.getAmount());//设置收款总金额(原来的收款总金额+收款明细的总金额)
                            	receivablesNotesTemp.setAlrRecePrincipal(receivablesNotesTemp.getAlrRecePrincipal()+receivablesNotesDetail.getCurrentRecePrincipal());//设置已收本金(原本的已收还本金+收款明细的本金)
                            	receivablesNotesTemp.setNotRecePrincipal(receivablesNotesTemp.getNotRecePrincipal()-receivablesNotesDetail.getCurrentRecePrincipal());//设置未收本金(原本的未还本金-收款明细的本金)
                            	receivablesNotesTemp.setAlrReceInterest(receivablesNotesTemp.getAlrReceInterest()+receivablesNotesDetail.getCurrentReceInterest());//设置已收利息(原本的已收还利息+收款明细的利息)
                            	receivablesNotesTemp.setNotReceInterest(receivablesNotesTemp.getNotReceInterest()-receivablesNotesDetail.getCurrentReceInterest());//设置未收利息(原本的未还利息-收款明细的利息)
                            	receivablesNotesTemp.setAlrReceMoney(receivablesNotesTemp.getAlrReceMoney()+receivablesNotesDetail.getCurrentReceMoeny());//设置已收本息(原本的已收还本息+收款明细的本息)
                            	receivablesNotesTemp.setNotReceMoney(receivablesNotesTemp.getNotReceMoney()-receivablesNotesDetail.getCurrentReceMoeny());//设置未收本息(原本的未收还本息-收款明细的本息)
                            	receivablesNotesTemp.setAlrOverdueInterest(receivablesNotesTemp.getAlrOverdueInterest()+receivablesNotesDetail.getOverdueInterest());//已收逾期罚息(原来的已逾期罚息+收款明细的逾期罚息)
                            	receivablesNotesTemp.setInterestManaFee(receivablesNotesTemp.getInterestManaFee()+receivablesNotesDetail.getInterestManaFee());//利息管理费(原来的利息管理费+收款明细的利息管理费)
                            	receivablesNotesTemp.setIncome(receivablesNotesTemp.getIncome()+receivablesNotesDetail.getIncome());//收益(原来的收益+收款明细的收益)
                            	receivablesNotesTemp.setRemark("借款人进行还款成功时，系统自动进行更新收款信息");
                            	receivablesNotesTemp.setUpdater(pricipalUser.getUserId());
                            	receivablesNotesTemp.setUpdateTime(new Date());
                            	//执行更新收款记录操作
                            	receivablesNotesMapper.updateByPrimaryKeySelective(receivablesNotesTemp);
                            	
                            	//增加一条投标人的收款平台资金记录信息
                                FinancePlatformTransaction financePlatformTransactions=new FinancePlatformTransaction();//构建平台资金记录对象
                                financePlatformTransactions.setPlatformTransactionId(RandomGUID.getRandomGUID());//随即产生字符串ID
                                financePlatformTransactions.setFinancePlatformId(financePlatform.getFinancePlatformId());//平台资金ID
                                financePlatformTransactions.setTransactionTarget(tenderNotes.getMemberDisplay());//设置对象人
                                financePlatformTransactions.setTransactionType("平台向投资人还款");//设置交易类型
                                financePlatformTransactions.setEarningMoney(0f);//设置收入金额
                                financePlatformTransactions.setExpendMoney(receivablesNotesDetail.getAmount());//设置支出金额
                                financePlatformTransactions.setAmount(financePlatform.getPlatformMoney()-financePlatformTransactions.getExpendMoney());//设置平台资金总金额=原来资金-支出金额
                                financePlatformTransactions.setRemark("平台向投资人还款成功，生成平台资金记录明细信息");//设置备注
                                financePlatformTransactions.setCreater(pricipalUser.getUserId());
                                financePlatformTransactions.setCreateTime(new Date());
                                financePlatformTransactions.setUpdater(pricipalUser.getUserId());
                                financePlatformTransactions.setUpdateTime(new Date());
                                //执行添加操作
                                financePlatformTransactionMapper.insert(financePlatformTransactions);
                                
                                //平台向投资人还款成功后，更新平台资金
                                financePlatform.setPlatformMoney(financePlatformTransactions.getAmount());//更新平台资金
                                financePlatform.setRemark("平台向投资人还款成功后，更新平台资金");//设置备注
                                financePlatform.setCreater(pricipalUser.getUserId());
                                financePlatform.setCreateTime(new Date());
                                financePlatform.setUpdater(pricipalUser.getUserId());
                                financePlatform.setUpdateTime(new Date());
                                financePlatformMapper.updateByPrimaryKeySelective(financePlatform);//执行更新资金平台的操作
                                
                            	//对投标人的会员资金进行更新
                                FinanceMember financeMembers = financeMemberMapper.selectByMemberId(tenderNotes.getMemberId());// 根据投标人Id查找出该会员的财务会员信息记录
                                financeMembers.setUsableMoney(financeMembers.getUsableMoney()+receivablesNotesDetail.getAmount());//设置可用余额(原本的可用余额+收款记录明细本息)
                                financeMembers.setCollectingMoney(financeMembers.getCollectingMoney()-receivablesNotesDetail.getCurrentReceMoeny());//设置待收金额(原本的待收金额-收款记录明细本息)
                                financeMembers.setAmount(financeMembers.getAmount()+receivablesNotesDetail.getAmount());//设置总金额(原本的总金额+收款记录明细本息)
                                financeMembers.setUpdater(pricipalUser.getUserId());
                                financeMembers.setUpdateTime(new Date());
                                //执行更新会员资金操作
                                financeMemberMapper.updateByPrimaryKeySelective(financeMembers);
                                
                                //增加一条会员资金记录信息
                                FinanceTransaction financeTransactionTemp = new FinanceTransaction();
                                financeTransactionTemp.setTransactionId(RandomGUID.getRandomGUID());
                                financeTransactionTemp.setFinanceMemberId(financeMembers.getFinanceMemberId());//设置会员资金ID
                                financeTransactionTemp.setMemberId(financeMembers.getMemberId());//设置会员ID
                                financeTransactionTemp.setTransactionTarget("系统帐号");//设置交易对象
                                financeTransactionTemp.setTransactionType("投资人进行收款");//设置交易类型
                                financeTransactionTemp.setEarningMoney(receivablesNotesDetail.getAmount());//设置收入金额(还款记录明细中的总还款金额)
                                financeTransactionTemp.setExpendMoney(0f);//设置支出金额
                                financeTransactionTemp.setUsableMoney(financeMembers.getUsableMoney());//设置可用金额=原会员的可用金额
                                financeTransactionTemp.setFrozenMoney(financeMembers.getFrozenMoney());//设置冻结金额
                                financeTransactionTemp.setCollectingMoney(financeMembers.getCollectingMoney());//设置待收金额
                                financeTransactionTemp.setRefundMoney(financeMembers.getRefundMoney());//设置待还金额
                                financeTransactionTemp.setAmount(financeMembers.getAmount());//设置总金额
                                financeTransactionTemp.setRemark("会员进行投资收款成功，生成会员资金记录明细信息");//设置备注
                                financeTransactionTemp.setCreater(pricipalUser.getUserId());
                                financeTransactionTemp.setCreateTime(new Date());
                                financeTransactionTemp.setUpdater(pricipalUser.getUserId());
                                financeTransactionTemp.setUpdateTime(new Date());
                                //执行添加会员资金记录信息
                                financeTransactionMapper.insert(financeTransactionTemp);
                                
                            	//判断是否收款款记录明细表的收款状态有多少条
                            	ReceivablesNotesDetailExample receivablesNotesDetailsExample = new ReceivablesNotesDetailExample();
                            	receivablesNotesDetailsExample.createCriteria().andReceStateEqualTo("notReceiving").andReceNotesIdEqualTo(receivablesNotes.getReceNotesId());
                    	        List<ReceivablesNotesDetail> receivablesNotesDetailsList = receivablesNotesDetailMapper.selectByExample(receivablesNotesDetailsExample);
                    	        if(receivablesNotesDetailsList.size()<=0){
                    	        	//查找收款记录明细状态为未还的条数为0时，执行更新收款记录的状态为Receivables
                    	        	ReceivablesNotes receivablesNotess = receivablesNotesMapper.selectByPrimaryKey(receivablesNotes.getReceNotesId());
                    	        	receivablesNotess.setReceState("Receivables");
                    	        	receivablesNotesMapper.updateByPrimaryKeySelective(receivablesNotess);
                    	        }
                			}
						}
					}
					
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
