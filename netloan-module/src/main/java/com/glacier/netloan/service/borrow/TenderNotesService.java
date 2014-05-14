package com.glacier.netloan.service.borrow;

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
import com.glacier.netloan.dao.borrow.TenderNotesMapper;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.borrow.TenderNotesExample;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.finance.FinanceTransaction;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.finance.FinanceMemberService;
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
     * @Title: listAsGrid 
     * @Description: TODO(获取所有投标记录信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        TenderNotesExample tenderNotesExample = new TenderNotesExample();;

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
        tenderNotes.setCreater(pricipalMember.getMemberId());
        tenderNotes.setCreateTime(new Date());
        count = tenderNotesMapper.insert(tenderNotes);
        
        //添加会员投标的资金记录明细
      	FinanceTransaction financeTransaction = new FinanceTransaction();
		//获取会员资金记录信息
      	FinanceMember financeMember = (FinanceMember) financeMemberService.getMemberByMemberId(tenderNotes.getMemberId());
      	financeTransaction.setFinanceMemberId(financeMember.getFinanceMemberId());//设置会员资金信息
      	financeTransaction.setMemberId(tenderNotes.getMemberId());//设置会员id
      	//List<String> memberNames = (List<String>) returnResultreceivablesNotesDetail.getObj();
      	//financeTransaction.setTransactionTarget(CollectionsUtil.convertToString(memberNames, ","));//设置交易对象
      	financeTransaction.setTransactionType("投标");//设置交易类型
      	financeTransaction.setEarningMoney(0f);//设置收入金额
      	financeTransaction.setExpendMoney(0f);//设置支出金额
      	//financeTransaction.setUsableMoney(borrowingLoan.getLoanTotal() - borrowingLoan.getLoanTotal() * borrowingLoan.getLoanManagementFees());//设置可用金额
      	//financeTransaction.setUsableMoney(borrowingLoan.getLoanTotal() + financeMember.getUsableMoney());//设置可用金额
      	financeTransaction.setFrozenMoney(financeMember.getFrozenMoney());//设置冻结金额
      	financeTransaction.setCollectingMoney(financeMember.getCollectingMoney());//设置代收金额
      	financeTransaction.setRefundMoney(financeMember.getRefundMoney());//设置待还金额
      	//financeTransaction.setAmount(borrowingLoan.getLoanTotal()+financeMember.getAmount());//设置总金额
      	//financeTransactionService.addTransaction(financeTransaction);//调用添加记录明细方法
		BorrowingLoan borrowingLoan = (BorrowingLoan) borrowingLoanService.getBorrowingLoan(tenderNotes.getLoanId());//获取所投标的借款数据
		borrowingLoanService.editBorrowingLoan(borrowingLoan,tenderNotes);//更新借款中相对应的数据
        
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
}
