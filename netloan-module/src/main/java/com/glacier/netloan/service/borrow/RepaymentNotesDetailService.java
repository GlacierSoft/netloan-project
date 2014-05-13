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
import com.glacier.netloan.dao.borrow.RepaymentNotesDetailMapper;
import com.glacier.netloan.dto.query.borrow.RepaymentNotesDetailQueryDTO;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.RepaymentNotes;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetail;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetailExample;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetailExample.Criteria;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

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
        if(memberId != null){
        	repaymentNotesDetailExample.createCriteria().andMemberIdEqualTo(memberId);//查询相对应的还款人的还款记录明细
        }
        if(repayNotesId != null){
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
    public Object addRepaymentNotesDetail(RepaymentNotesDetail repaymentNotesDetail,RepaymentNotes repaymentNotesNew) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        BorrowingLoan borrowingLoanNew = (BorrowingLoan) borrowingLoanMapper.selectByPrimaryKey(repaymentNotesNew.getLoanId());
        
        for(int i = 0;i < Integer.parseInt(borrowingLoanNew.getLoanDeadlinesId());i++){
        	repaymentNotesDetail.setNumberPeriod((float) (i+1));//设置当前是第几期
        	Calendar c = Calendar.getInstance();//日历对象
 	        c.setTime(new Date());//获取当前时间
 	        c.add(Calendar.MONTH, i+1);//在当前时间上加一个月
        	repaymentNotesDetail.setShouldPayDate(c.getTime());//设置应还款日期
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
    				float shouldPayMoney = everyMonthInterest + borrowingLoanNew.getLoanTotal();
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
    				float everyMonthInterest = borrowingLoanNew.getLoanTotal() * (borrowingLoanNew.getLoanApr()/12);
        			float shouldPayMoney = everyMonthInterest * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()) + borrowingLoanNew.getLoanTotal();
    				repaymentNotesDetail.setCurrentPayMoeny(shouldPayMoney);//设置当期应还本息
    				repaymentNotesDetail.setCurrentPayPrincipal(borrowingLoanNew.getLoanTotal());//设置当期应还本金
        			repaymentNotesDetail.setCurrentPayInterest(everyMonthInterest);//设置当期应还利息
    			}else{
    				repaymentNotesDetail.setCurrentPayMoeny(0f);//设置当期应还本息
    				repaymentNotesDetail.setCurrentPayPrincipal(0f);//设置当期应还本金
        			repaymentNotesDetail.setCurrentPayInterest(0f);//设置当期应还利息
    			}
    		}
    		repaymentNotesDetail.setRepayNotesDetailId(RandomGUID.getRandomGUID());
    		repaymentNotesDetail.setMemberId(borrowingLoanNew.getMemberId());
            repaymentNotesDetail.setActualPayMoney(0f);
            repaymentNotesDetail.setAlsoNeedMoney(0f);
            repaymentNotesDetail.setOverdueDays("0");
            repaymentNotesDetail.setOverdueInterest(0f);
            repaymentNotesDetail.setOverdueManaFee(0f);
            repaymentNotesDetail.setOverdueUrgeFee(0f);
            repaymentNotesDetail.setIsAdvances("no");//设置是否网站代还
            repaymentNotesDetail.setIsOverdue("no");//设置是否逾期
            repaymentNotesDetail.setRepayState("notRepay");//设置还款记录明细表状态为“还款中”
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
