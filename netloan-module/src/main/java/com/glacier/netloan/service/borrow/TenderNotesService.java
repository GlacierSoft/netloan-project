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

import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.borrow.TenderNotesMapper;
import com.glacier.netloan.dto.query.borrow.TenderNotesQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.borrow.TenderNotesExample;
import com.glacier.netloan.entity.borrow.TenderNotesExample.Criteria;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.basicdatas.ParameterCreditService;
import com.glacier.netloan.service.finance.FinanceMemberService;
import com.glacier.netloan.service.finance.FinanceTransactionService;
import com.glacier.netloan.service.member.MemberService;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: TenderNotesService 
 * @Description: TODO(投标记录业务层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-4下午4:56:25
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class TenderNotesService {
	@Autowired
	private TenderNotesMapper tenderNotesMapper;
	
	@Autowired
	private BorrowingLoanService borrowingLoanService;
	
	@Autowired
	private FinanceMemberService financeMemberService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private FinanceTransactionService financeTransactionService;
	
	@Autowired
	private ParameterCreditService parameterCreditService;
	
	
	/**
	 * @Title: getTenderNotes 
	 * @Description: TODO(根据投标记录Id获取投标记录信息) 
	 * @param @param tenderNotesId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getTenderNotes(String tenderNotesId) {
    	TenderNotes tenderNotes = tenderNotesMapper.selectByPrimaryKey(tenderNotesId);
        return tenderNotes;
    }
    /**
     * @Title: listAsGridWebsite 
     * @Description: TODO(前台投标记录列表) 
     * @param  @param jqPager
     * @param  @param borrowingLoanQueryDTO
     * @param  @param pagetype
     * @param  @param p
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object listAsGridWebsite(JqPager jqPager,int p,String loanId) {
        
        JqGridReturn returnResult = new JqGridReturn();
        TenderNotesExample tenderNotesExample = new TenderNotesExample();
        tenderNotesExample.createCriteria().andLoanIdEqualTo(loanId);//查询相对应的投标的记录
        
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	tenderNotesExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	tenderNotesExample.setLimitEnd(jqPager.getRows());
        }
        
        jqPager.setSort("createTime");// 定义排序字段
        jqPager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	tenderNotesExample.setOrderByClause(jqPager.getOrderBy("temp_tender_notes_"));
        }
        
        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
        tenderNotesExample.setLimitStart(startTemp);
        tenderNotesExample.setLimitEnd(5);
        List<TenderNotes>  tenderNotess = tenderNotesMapper.selectByExample(tenderNotesExample); // 查询所有借款列表

        int total = tenderNotesMapper.countByExample(tenderNotesExample); // 查询总页数
        returnResult.setRows(tenderNotess);//设置查询数据
        returnResult.setTotal(total);//设置总条数
        returnResult.setP(p);//设置当前页
        return returnResult;// 返回ExtGrid表
    }
    /**
     * @Title: listAsGridWebsite 
     * @Description: TODO(前台投标记录列表) 
     * @param  @param jqPager
     * @param  @param borrowingLoanQueryDTO
     * @param  @param pagetype
     * @param  @param p
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object listAsGridWebsite(TenderNotesQueryDTO tenderNotesQueryDTO,JqPager jqPager,int p,String loanId,String memberId,List<String> loanStates) {
        
        JqGridReturn returnResult = new JqGridReturn();
        TenderNotesExample tenderNotesExample = new TenderNotesExample();
        Criteria criteria = tenderNotesExample.createCriteria();
        tenderNotesQueryDTO.setQueryCondition(criteria);//前台条件查询
        if(loanId != null){
        	criteria.andLoanIdEqualTo(loanId);//查询相对应的投标的记录	
        }
        if(memberId != null){
        	criteria.andMemberIdEqualTo(memberId);//查询相对应的投标的记录	
        }
        if(loanStates.size() > 0){
        	criteria.andLoanStateIn(loanStates);//根据借款状态查询相对应的投标的记录
        }
        
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	tenderNotesExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	tenderNotesExample.setLimitEnd(jqPager.getRows());
        }
        
        jqPager.setSort("createTime");// 定义排序字段
        jqPager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	tenderNotesExample.setOrderByClause(jqPager.getOrderBy("temp_tender_notes_"));
        }
        
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        tenderNotesExample.setLimitStart(startTemp);
        tenderNotesExample.setLimitEnd(10);
        List<TenderNotes>  tenderNotess = tenderNotesMapper.selectByExample(tenderNotesExample); // 查询所有借款列表

        //查询基础信用积分的所有数据
        @SuppressWarnings("unchecked")
		List<ParameterCredit> parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
        List<TenderNotes> allTenderNotess = new ArrayList<TenderNotes>();//定义一个空的借款列表
        //通过嵌套for循环，将会员的信用图标加到借款对象中去
        for(TenderNotes tenderNotes : tenderNotess){
        	for(ParameterCredit parameterCredit : parameterCredits){
    			if(tenderNotes.getCreditIntegral() >= parameterCredit.getCreditBeginIntegral() && tenderNotes.getCreditIntegral() < parameterCredit.getCreditEndIntegral()){
    				tenderNotes.setCreditPhoto(parameterCredit.getCreditPhoto());
        			break;
        		}	
        	}
        	allTenderNotess.add(tenderNotes);
        }
        
        int total = tenderNotesMapper.countByExample(tenderNotesExample); // 查询总页数
        returnResult.setRows(allTenderNotess);//设置查询数据
        returnResult.setTotal(total);//设置总条数
        returnResult.setP(p);//设置当前页
        return returnResult;// 返回ExtGrid表
    }
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有投标记录信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager,TenderNotesQueryDTO tenderNotesQueryDTO) {
        
        JqGridReturn returnResult = new JqGridReturn();
        TenderNotesExample tenderNotesExample = new TenderNotesExample();;

        Criteria queryCriteria = tenderNotesExample.createCriteria();
        tenderNotesQueryDTO.setQueryCondition(queryCriteria);
          
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	tenderNotesExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	tenderNotesExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	tenderNotesExample.setOrderByClause(pager.getOrderBy("temp_tender_notes_"));
        }
        List<TenderNotes>  tenderNotess = tenderNotesMapper.selectByExample(tenderNotesExample); // 查询所有投标记录列表
        int total = tenderNotesMapper.countByExample(tenderNotesExample); // 查询总页数
        returnResult.setRows(tenderNotess);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addTenderNotes 
     * @Description: TODO(新增投标记录) 
     * @param @param tenderNotes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addTenderNotes(TenderNotes tenderNotes) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        tenderNotes.setTenderNotesId(RandomGUID.getRandomGUID());
        if ("".equals(tenderNotes.getSubSum()) || null == tenderNotes.getSubSum()) {//如果认购份数为空，则表示认购模式关闭，初始化认购份数为0
            tenderNotes.setSubSum((float) 0);
        }
        if ("".equals(tenderNotes.getTenderMoney()) || null == tenderNotes.getTenderMoney()) {//如果投资金额为空，则表示认购模式开启，初始化投资金额为0
            tenderNotes.setTenderMoney((float) 0);
        }
        tenderNotes.setCreater(pricipalMember.getMemberId());
        tenderNotes.setCreateTime(new Date());
        count = tenderNotesMapper.insert(tenderNotes);
        
        //添加会员投标的资金记录明细
      	FinanceTransaction financeTransaction = new FinanceTransaction();
		//获取会员资金记录信息
      	FinanceMember financeMember = (FinanceMember) financeMemberService.getMemberByMemberId(tenderNotes.getMemberId());
      	financeTransaction.setFinanceMemberId(financeMember.getFinanceMemberId());//设置会员资金信息
      	financeTransaction.setMemberId(tenderNotes.getMemberId());//设置会员id
      	BorrowingLoan borrowingLoan = (BorrowingLoan) borrowingLoanService.getBorrowingLoan(tenderNotes.getLoanId());
      	Member member = (Member) memberService.getMember(borrowingLoan.getMemberId());
      	financeTransaction.setTransactionTarget(member.getMemberName());//设置交易对象
      	financeTransaction.setTransactionType("冻结投标金额");//设置交易类型
    	financeTransaction.setEarningMoney(0f);//设置收入金额
      	if(tenderNotes.getTenderMoney() != 0f){//判断投标是按金额还是按认购份数
      		financeTransaction.setExpendMoney(0f);//设置支出金额
      		financeTransaction.setUsableMoney(financeMember.getUsableMoney() - tenderNotes.getTenderMoney());//设置可用金额
      		financeTransaction.setFrozenMoney(financeMember.getFrozenMoney() + tenderNotes.getTenderMoney());//设置冻结金额
      		financeTransaction.setAmount(financeMember.getAmount());//设置总金额
      		financeTransaction.setRemark("投标借款["+borrowingLoan.getLoanTitle()+"],冻结投标金额["+tenderNotes.getTenderMoney()+"]元");
      	}else{
      		financeTransaction.setExpendMoney(0f);//设置支出金额
      		financeTransaction.setUsableMoney(financeMember.getUsableMoney() - tenderNotes.getSubSum() * borrowingLoan.getLowestSub());//设置可用金额
      		financeTransaction.setFrozenMoney(financeMember.getFrozenMoney() + tenderNotes.getSubSum() * borrowingLoan.getLowestSub());//设置冻结金额
      		financeTransaction.setAmount(financeMember.getAmount());//设置总金额
      		financeTransaction.setRemark("投标借款["+borrowingLoan.getLoanTitle()+"],冻结投标金额["+tenderNotes.getSubSum() * borrowingLoan.getLowestSub()+"]元");
      	}
      	financeTransaction.setCollectingMoney(financeMember.getCollectingMoney());//设置代收金额
      	financeTransaction.setRefundMoney(financeMember.getRefundMoney());//设置待还金额
      	financeTransactionService.addTransactionWebsite(financeTransaction);//调用添加记录明细方法
      	
      	//更新投资的会员资金信息
      	if(tenderNotes.getTenderMoney() != 0f){//判断投标是按金额还是按认购份数
      		financeMember.setUsableMoney(financeMember.getUsableMoney() - tenderNotes.getTenderMoney());//设置会员资金可用金额
      		financeMember.setFrozenMoney(financeMember.getFrozenMoney() + tenderNotes.getTenderMoney());//设置会员资金冻结金额
          	financeMember.setAmount(financeMember.getAmount());//设置会员资金总金额
      	}else{
      		financeMember.setUsableMoney(financeMember.getUsableMoney() - tenderNotes.getSubSum() * borrowingLoan.getLowestSub());//设置会员资金可用金额
      		financeMember.setFrozenMoney(financeMember.getFrozenMoney() + tenderNotes.getSubSum() * borrowingLoan.getLowestSub());//设置会员资金冻结金额
          	financeMember.setAmount(financeMember.getAmount());//设置会员资金总金额
      	}
      	financeMemberService.editMemberWebsite(financeMember);
      	
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg(" 投标记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，投标记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editTenderNotes 
     * @Description: TODO(修改投标记录) 
     * @param @param tenderNotes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editTenderNotes(TenderNotes tenderNotes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        count = tenderNotesMapper.updateByPrimaryKeySelective(tenderNotes);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("投标记录信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，投标记录信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delTenderNotes 
     * @Description: TODO(删除投标记录) 
     * @param @param tenderNotesIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "TenderNotesList_del")
    public Object delTenderNotes(List<String> tenderNotesIds, List<String> tenderNotesTitle) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (tenderNotesIds.size() > 0) {
        	BorrowingLoan borrowingLoan = (BorrowingLoan) borrowingLoanService.getBorrowingLoan(tenderNotesMapper.selectByPrimaryKey(tenderNotesIds.get(0)).getLoanId());
        	for(String tenderNotesId : tenderNotesIds){
        		TenderNotes tenderNotes = tenderNotesMapper.selectByPrimaryKey(tenderNotesId);
        		if(borrowingLoan.getSubTotal() == 0.0){
        			float alrTenderPro = (borrowingLoan.getAlrBidMoney()-tenderNotes.getTenderMoney())/borrowingLoan.getLoanTotal();
        			borrowingLoan.setAlrTenderPro(alrTenderPro);//更新投标比例	
        			borrowingLoan.setAlrBidMoney(borrowingLoan.getAlrBidMoney()-tenderNotes.getTenderMoney());//更新已投标的金额
        		}else{
        			float alrSubSum = borrowingLoan.getAlrSubSum()-tenderNotes.getSubSum();//更新已投份数
        			borrowingLoan.setAlrSubSum(alrSubSum);//更新借款数据中的已认购份数
        			borrowingLoan.setAlrTenderPro(alrSubSum/borrowingLoan.getSubTotal());//更新投标比例
        		}
        			borrowingLoan.setTenderSum(borrowingLoan.getTenderSum()-1);//更新借款数据中的投标数量
        	}
        	borrowingLoanService.editBorrowingLoan(borrowingLoan);//删除投标记录，会相对应的更新借款数据
        	TenderNotesExample tenderNotesExample = new TenderNotesExample();
        	tenderNotesExample.createCriteria().andTenderNotesIdIn(tenderNotesIds);
            count = tenderNotesMapper.deleteByExample(tenderNotesExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了投标记录信息");
            } else {
                returnResult.setMsg("发生未知错误，投标记录信息删除失败");
            }
        }
        return returnResult;
    }
    
    /**
     * @Title: getTenderNotesNumByMemberId 
     * @Description: TODO(查询该会员的投资记录条数) 
     * @param  @param MemberId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getTenderNotesNumByMemberId(String MemberId) {
        TenderNotesExample tenderNotesExample = new TenderNotesExample();
        tenderNotesExample.createCriteria().andMemberIdEqualTo(MemberId);
        int tenderNotesNum = tenderNotesMapper.countByExample(tenderNotesExample);
        return tenderNotesNum;
    }
}
