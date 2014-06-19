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
import com.glacier.netloan.dao.borrow.LoanReviewMapper;
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.dto.query.borrow.LoanReviewNotesQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.BorrowingLoanExample;
import com.glacier.netloan.entity.borrow.LoanReview;
import com.glacier.netloan.entity.borrow.LoanReviewExample; 
import com.glacier.netloan.entity.borrow.LoanReviewExample.Criteria;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: LoanReviewService 
 * @Description: TODO(借款留言业务层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-4下午4:56:25
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class LoanReviewService {
	@Autowired
	private LoanReviewMapper loanReviewMapper;
	
	/**
	 * @Title: getLoanReview 
	 * @Description: TODO(根据借款留言Id获取借款留言信息) 
	 * @param @param loanReviewId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getLoanReview(String loanReviewId) {
    	LoanReview loanReview = loanReviewMapper.selectByPrimaryKey(loanReviewId);
        return loanReview;
    }
    /**
     * @Title: listAsGridWebsite 
     * @Description: TODO(前台借款留言列表) 
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
        LoanReviewExample loanReviewExample = new LoanReviewExample();;
        loanReviewExample.createCriteria().andLoanIdEqualTo(loanId);//查询相对应的借款的留言
        
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	loanReviewExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	loanReviewExample.setLimitEnd(jqPager.getRows());
        }
        
        jqPager.setSort("createTime");// 定义排序字段
        jqPager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	loanReviewExample.setOrderByClause(jqPager.getOrderBy("temp_loan_review_"));
        }
        
        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
        loanReviewExample.setLimitStart(startTemp);
        loanReviewExample.setLimitEnd(5);
        List<LoanReview>  loanReviews = loanReviewMapper.selectByExample(loanReviewExample); // 查询所有借款列表

        int total = loanReviewMapper.countByExample(loanReviewExample); // 查询总页数
        returnResult.setRows(loanReviews);//设置查询数据
        returnResult.setTotal(total);//设置总条数
        returnResult.setP(p);//设置当前页
        return returnResult;// 返回ExtGrid表
    }
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有借款留言信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager,LoanReviewNotesQueryDTO loanReviewNotesQueryDTO) {
        
        JqGridReturn returnResult = new JqGridReturn();
        LoanReviewExample loanReviewExample = new LoanReviewExample();
      
        Criteria queryCriteria = loanReviewExample.createCriteria();
        loanReviewNotesQueryDTO.setQueryCondition(queryCriteria);

        
        
        
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	loanReviewExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	loanReviewExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	loanReviewExample.setOrderByClause(pager.getOrderBy("temp_loan_review_"));
        }
        List<LoanReview>  loanReviews = loanReviewMapper.selectByExample(loanReviewExample); // 查询所有借款留言列表
        int total = loanReviewMapper.countByExample(loanReviewExample); // 查询总页数
        returnResult.setRows(loanReviews);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addLoanReview 
     * @Description: TODO(新增借款留言) 
     * @param @param loanReview
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addLoanReview(LoanReview loanReview) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        loanReview.setLoanReviewId(RandomGUID.getRandomGUID());
        loanReview.setCreater(pricipalMember.getMemberId());
        loanReview.setCreateTime(new Date());
        count = loanReviewMapper.insert(loanReview);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg(" 借款留言信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，借款留言信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editLoanReview 
     * @Description: TODO(修改借款留言) 
     * @param @param loanReview
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editLoanReview(LoanReview loanReview) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        count = loanReviewMapper.updateByPrimaryKeySelective(loanReview);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("借款留言信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，借款留言信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delLoanReview 
     * @Description: TODO(删除借款留言) 
     * @param @param loanReviewIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ReviewList_del")
    public Object delLoanReview(List<String> loanReviewIds, List<String> loanReviewTitle) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (loanReviewIds.size() > 0) {
        	LoanReviewExample loanReviewExample = new LoanReviewExample();
        	loanReviewExample.createCriteria().andLoanReviewIdIn(loanReviewIds);
            count = loanReviewMapper.deleteByExample(loanReviewExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了借款留言信息");
            } else {
                returnResult.setMsg("发生未知错误，借款留言信息删除失败");
            }
        }
        return returnResult;
    }
}
