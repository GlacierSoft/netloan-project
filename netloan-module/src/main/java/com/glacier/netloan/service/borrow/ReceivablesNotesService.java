package com.glacier.netloan.service.borrow;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.borrow.BorrowingLoanMapper;
import com.glacier.netloan.dao.borrow.ReceivablesNotesDetailMapper;
import com.glacier.netloan.dao.borrow.ReceivablesNotesMapper;
import com.glacier.netloan.dao.borrow.TenderNotesMapper;
import com.glacier.netloan.dto.query.borrow.ReceivablesNotesQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.ReceivablesNotes;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetail;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetailExample;
import com.glacier.netloan.entity.borrow.ReceivablesNotesExample;
import com.glacier.netloan.entity.borrow.ReceivablesNotesExample.Criteria;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.borrow.TenderNotesExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.service.basicdatas.ParameterCreditService;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: ReceivablesNotesService 
 * @Description: TODO(收款记录业务层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-8下午5:33:14
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class ReceivablesNotesService {
	@Autowired
	private ReceivablesNotesMapper receivablesNotesMapper;
	
	@Autowired
	private BorrowingLoanMapper borrowingLoanMapper;
	
	@Autowired
	private TenderNotesMapper tenderNotesMapper;
	
	@Autowired
	private ReceivablesNotesDetailMapper receivablesNotesDetailMapper;
	
	@Autowired
	private ParameterCreditService parameterCreditService;
	
	/**
	 * @Title: getReceivablesNotes 
	 * @Description: TODO(根据收款记录Id获取收款记录信息) 
	 * @param @param receNotesId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getReceivablesNotes(String receNotesId) {
    	ReceivablesNotes receivablesNotes = receivablesNotesMapper.selectByPrimaryKey(receNotesId);
        return receivablesNotes;
    }
    /**
     * @Title: listAsGridWebsite 
     * @Description: TODO(前台收款记录列表) 
     * @param  @param jqPager
     * @param  @param borrowingLoanQueryDTO
     * @param  @param pagetype
     * @param  @param p
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object listAsGridWebsite(ReceivablesNotesQueryDTO receivablesNotesQueryDTO,JqPager jqPager,int p,String memberId,List<String> loanStates,String loanDetailStates,String backAccountBorrow) {
        
        JqGridReturn returnResult = new JqGridReturn();
        JSONObject obj = new JSONObject();//定义json对象
        boolean flag = false;
        ReceivablesNotesExample receivablesNotesExample = new ReceivablesNotesExample();
        Criteria criteria = receivablesNotesExample.createCriteria();
        receivablesNotesQueryDTO.setQueryCondition(criteria);//前台条件查询
        if(memberId != null){
        	criteria.andMemberIdEqualTo(memberId);//查询相对应的投标的记录	
        }
        if(loanStates.size() > 0){
        	criteria.andLoanStateIn(loanStates);//根据借款状态查询相对应的投标的记录
        }
        if(loanDetailStates != null){//判断收款记录明细状态是否为空，
        	ReceivablesNotesDetailExample receivablesNotesDetailExample = new ReceivablesNotesDetailExample();
        	receivablesNotesDetailExample.createCriteria().andMemberIdEqualTo(memberId).andReceStateEqualTo(loanDetailStates);
        	List<ReceivablesNotesDetail> receivablesNotesDetails = receivablesNotesDetailMapper.selectByExample(receivablesNotesDetailExample);//查询属于该会员的已收款的收款记录明细列表
        	List<String> ReceivablesNotesIds = new ArrayList<String>();
        	for(ReceivablesNotesDetail receivablesNotesDetail : receivablesNotesDetails){
        		if(ReceivablesNotesIds.contains(receivablesNotesDetail.getReceNotesId())){//将收款记录明细，通过for循环查询处理，如果包含相同的就不做任何操作，否则添加到list中
             	}else{
             		ReceivablesNotesIds.add(receivablesNotesDetail.getReceNotesId());
             	}
        	}
        	//判断是否有已收款的收款记录明细，如果有，在receivablesNotesExample添加搜索条件，如果没有，将flag设置为true
        	if(ReceivablesNotesIds.size() > 0){
        		criteria.andReceNotesIdIn(ReceivablesNotesIds);//将查询收款记录明细状态为“已收款”的收款记录，查询处理
        	}else{
        		flag = true;
        	}
        }
        jqPager.setSort("createTime");// 定义排序字段
        jqPager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	receivablesNotesExample.setOrderByClause(jqPager.getOrderBy("temp_receivables_notes_"));
        }
        //如果backAccountBorrow不等于null,说明的通过回账查询按钮的，计算出待收金额
        if(backAccountBorrow != null){
        	 // 查询所有借款列表,还没进行分页的
            List<ReceivablesNotes>  receivablesNotessTotal = receivablesNotesMapper.selectByExample(receivablesNotesExample);
            Calendar c = Calendar.getInstance();//日历对象
    	    c.setTime(new Date());//获取当前时间
    	    float nextMonth = 0f;
    	    float nextThreeMonth = 0f;
    	    float nextYear = 0f;
    	    float nextAll = 0f;
    	    for(int i = 0;i <4;i++){//通过for循环，分别算出，未来一个月，三个月，一年和全部的待收本息
    	    	if(i==0){
    	    		c.add(Calendar.MONTH, 1);//在当前时间上加一个月	
    	    	}else if(i==1){
    	    		c.add(Calendar.MONTH, 3);//在当前时间上加三个月	
    	    	}else if(i==2){
    	    		c.add(Calendar.MONTH, 12);//在当前时间上加一年	
    	    	}
    	    	for(ReceivablesNotes receivablesNotes : receivablesNotessTotal){
    	        	ReceivablesNotesDetailExample receivablesNotesDetailExample = new ReceivablesNotesDetailExample();
    	        	if(i==3){//如果i==3,就查询全部待收本息，则不用在receivablesNotesDetailExample加上小于日期的条件查询
    	        		receivablesNotesDetailExample.createCriteria().andMemberIdEqualTo(memberId).andReceStateEqualTo("notReceiving")
    													.andReceNotesIdEqualTo(receivablesNotes.getReceNotesId());
    	        	}else{
    	        		receivablesNotesDetailExample.createCriteria().andMemberIdEqualTo(memberId).andReceStateEqualTo("notReceiving")
    	        										.andShouldPayDateLessThanOrEqualTo(c.getTime()).andReceNotesIdEqualTo(receivablesNotes.getReceNotesId());
    	        	}
    	        	//查询所有符合条件的收款记录明细，然后通过for循环,计算出本息
    	        	List<ReceivablesNotesDetail> receivablesNotesDetails = receivablesNotesDetailMapper.selectByExample(receivablesNotesDetailExample);//查询属于该会员的已收款的收款记录明细列表
    	        	for(ReceivablesNotesDetail receivablesNotesDetail : receivablesNotesDetails){
    	        		if(i==0){
    	        			nextMonth +=receivablesNotesDetail.getCurrentReceMoeny();//计算未来一个月待收本息	
    	    	    	}else if(i==1){
    	    	    		nextThreeMonth +=receivablesNotesDetail.getCurrentReceMoeny();//计算未来三个月待收本息	
    	    	    	}else if(i==2){
    	    	    		nextYear +=receivablesNotesDetail.getCurrentReceMoeny();//计算未来一年待收本息	
    	    	    	}else if(i==3){
    	    	    		nextAll +=receivablesNotesDetail.getCurrentReceMoeny();//计算未来全部待收本息	
    	    	    	}
    	        	}
    	        }
    	    }
    	    //将计算出来的数据放到json对象中
    		obj.put("nextMonth", nextMonth);
    		obj.put("nextThreeMonth", nextThreeMonth);
    		obj.put("nextYear", nextYear);
    		obj.put("nextAll", nextAll);
        }
        
        int startTemp = ((p-1)*10);//根据前台返回的页数进行设置
        receivablesNotesExample.setLimitStart(startTemp);
        receivablesNotesExample.setLimitEnd(10);
        
        List<ReceivablesNotes> allReceivablesNotess = new ArrayList<ReceivablesNotes>();//定义一个空的收款列表
        //如果flag为true,就什么都不操作，返回一个allReceivablesNotess空的list回去
        if(flag){
        	
        }else{
        	List<ReceivablesNotes>  receivablesNotess = receivablesNotesMapper.selectByExample(receivablesNotesExample); // 查询所有借款列表

            //查询基础信用积分的所有数据
            List<ParameterCredit> parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
            allReceivablesNotess = new ArrayList<ReceivablesNotes>();//定义一个空的收款列表
            //通过嵌套for循环，将会员的信用图标加到借款对象中去
            for(ReceivablesNotes receivablesNotes : receivablesNotess){
            	for(ParameterCredit parameterCredit : parameterCredits){
        			if(receivablesNotes.getCreditIntegral() >= parameterCredit.getCreditBeginIntegral() && receivablesNotes.getCreditIntegral() < parameterCredit.getCreditEndIntegral()){
        				receivablesNotes.setCreditPhoto(parameterCredit.getCreditPhoto());
            			break;
            		}	
            	}
            	allReceivablesNotess.add(receivablesNotes);
            }
        }
        
        int total = receivablesNotesMapper.countByExample(receivablesNotesExample); // 查询总页数
        returnResult.setRows(allReceivablesNotess);//设置查询数据
        returnResult.setTotal(total);//设置总条数
        returnResult.setP(p);//设置当前页
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("returnResult",returnResult);
        returnMap.put("obj",obj);
        return returnMap;// 返回ExtGrid表
    }
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有收款记录信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager,ReceivablesNotesQueryDTO receivablesNotesQueryDTO) {
        
        JqGridReturn returnResult = new JqGridReturn();
        ReceivablesNotesExample receivablesNotesExample = new ReceivablesNotesExample();
        
        Criteria queryCriteria = receivablesNotesExample.createCriteria();
        receivablesNotesQueryDTO.setQueryCondition(queryCriteria);

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	receivablesNotesExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	receivablesNotesExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	receivablesNotesExample.setOrderByClause(pager.getOrderBy("temp_receivables_notes_"));
        }
        List<ReceivablesNotes>  receivablesNotess = receivablesNotesMapper.selectByExample(receivablesNotesExample); // 查询所有收款记录列表
        int total = receivablesNotesMapper.countByExample(receivablesNotesExample); // 查询总页数
        returnResult.setRows(receivablesNotess);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addReceivablesNotes 
     * @Description: TODO(新增收款记录) 
     * @param @param receivablesNotes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ReceivablesNotesList_add")
    public Object addReceivablesNotes(ReceivablesNotes receivablesNotes,BorrowingLoan borrowingLoan) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        float shouldReceMoney = 0f;
        BorrowingLoan borrowingLoanNew = (BorrowingLoan)borrowingLoanMapper.selectByPrimaryKey(borrowingLoan.getLoanId());//重新获取该会员 借款的信息数据
        TenderNotesExample tenderNotesExample = new TenderNotesExample();;
        tenderNotesExample.createCriteria().andLoanIdEqualTo(borrowingLoanNew.getLoanId());//查询相对应的投标的记录
        List<TenderNotes> tenderNotess = tenderNotesMapper.selectByExample(tenderNotesExample);
        for(TenderNotes tenderNotes : tenderNotess){
        	receivablesNotes.setTenderNotesId(tenderNotes.getTenderNotesId());//设置投标id
        	receivablesNotes.setMemberId(tenderNotes.getMemberId());
        	if(borrowingLoanNew.getSubTotal() == 0.0){//借款是以金额进行投资的
        		if(borrowingLoanNew.getRepaymentTypeDisplay().equals("等额本息")){
        			//float everyMonthMoney = (tenderNotes.getTenderMoney() * (borrowingLoanNew.getLoanApr()/12) * (1 + borrowingLoanNew.getLoanApr()/12) * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()))/(1 + borrowingLoanNew.getLoanApr()/12) * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId())-1;
        			float everyMonthMoney = (float) ((tenderNotes.getTenderMoney() * (borrowingLoanNew.getLoanApr()/12) 
							* Math.pow(((1 + borrowingLoanNew.getLoanApr()/12)),Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId())))
							/ (Math.pow(((1 + borrowingLoanNew.getLoanApr()/12)),Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()))-1));
        			shouldReceMoney = everyMonthMoney * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId());
        		}else if(borrowingLoanNew.getRepaymentTypeDisplay().equals("按月付息，到期还本")){
        			float everyMonthInterest = tenderNotes.getTenderMoney() * (borrowingLoanNew.getLoanApr()/12);
        			shouldReceMoney = everyMonthInterest * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()) + tenderNotes.getTenderMoney();
        		}else if(borrowingLoanNew.getRepaymentTypeDisplay().equals("一次性还款")){
        			float everyMonthInterest = tenderNotes.getTenderMoney() * (borrowingLoanNew.getLoanApr()/12);
        			shouldReceMoney = everyMonthInterest * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()) + tenderNotes.getTenderMoney();
        		}
        		receivablesNotes.setReceivablesTotal(shouldReceMoney);//设置收款总金额
        		receivablesNotes.setShouldReceMoney(shouldReceMoney);//设置应收本息
        		receivablesNotes.setNotReceMoney(shouldReceMoney);//设置未收本息
        	}else{//借款是认购份数进行投资的
        		if(borrowingLoanNew.getRepaymentTypeDisplay().equals("等额本息")){
        			//float everyMonthMoney = (tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub() * (borrowingLoanNew.getLoanApr()/12) * (1 + borrowingLoanNew.getLoanApr()/12) * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()))/(1 + borrowingLoanNew.getLoanApr()/12) * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId())-1;
        			float everyMonthMoney = (float) ((tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub() * (borrowingLoanNew.getLoanApr()/12) 
							* Math.pow(((1 + borrowingLoanNew.getLoanApr()/12)),Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId())))
							/ (Math.pow(((1 + borrowingLoanNew.getLoanApr()/12)),Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()))-1));
        			shouldReceMoney = everyMonthMoney * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId());
        		}else if(borrowingLoanNew.getRepaymentTypeDisplay().equals("按月付息，到期还本")){
        			float everyMonthInterest = tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub() * (borrowingLoanNew.getLoanApr()/12);
        			shouldReceMoney = everyMonthInterest * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()) + tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub();
        		}else if(borrowingLoanNew.getRepaymentTypeDisplay().equals("一次性还款")){
        			float everyMonthInterest = tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub() * (borrowingLoanNew.getLoanApr()/12);
        			shouldReceMoney = everyMonthInterest * Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()) + tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub();
        		}
        		receivablesNotes.setReceivablesTotal(shouldReceMoney);//设置收款总金额
        		receivablesNotes.setShouldReceMoney(shouldReceMoney);//设置应收本息
        		receivablesNotes.setNotReceMoney(shouldReceMoney);//设置未收本息
        	}
        	receivablesNotes.setAlrOverdueInterest(0f);
        	receivablesNotes.setAlrReceMoney(0f);//设置已收本息
        	receivablesNotes.setReceState("receiving");//设置收款记录的状态为收款中，”未收“？
    		receivablesNotes.setReceNotesId(RandomGUID.getRandomGUID());
            receivablesNotes.setCreater(pricipalUser.getUserId());
            receivablesNotes.setCreateTime(new Date());
            receivablesNotes.setUpdater(pricipalUser.getUserId());
            receivablesNotes.setUpdateTime(new Date());
            count = receivablesNotesMapper.insert(receivablesNotes);
        }
        
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setObj(receivablesNotes);
            returnResult.setMsg(" 收款记录信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，收款记录信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editReceivablesNotes 
     * @Description: TODO(修改收款记录) 
     * @param @param receivablesNotes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editReceivablesNotes(ReceivablesNotes receivablesNotes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        count = receivablesNotesMapper.updateByPrimaryKeySelective(receivablesNotes);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("收款记录信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，收款记录信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delReceivablesNotes 
     * @Description: TODO(删除收款记录) 
     * @param @param receNotesIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ReceivablesNotesList_del")
    public Object delReceivablesNotes(List<String> receNotesIds, List<String> receivablesNotesTitle) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (receNotesIds.size() > 0) {
        	ReceivablesNotesExample receivablesNotesExample = new ReceivablesNotesExample();
        	receivablesNotesExample.createCriteria().andReceNotesIdIn(receNotesIds);
            count = receivablesNotesMapper.deleteByExample(receivablesNotesExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了收款记录信息");
            } else {
                returnResult.setMsg("发生未知错误，收款记录信息删除失败");
            }
        }
        return returnResult;
    }
}
