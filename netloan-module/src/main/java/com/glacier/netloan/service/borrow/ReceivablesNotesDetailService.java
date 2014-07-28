package com.glacier.netloan.service.borrow;

import java.util.ArrayList;
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
import com.glacier.netloan.dao.borrow.TenderNotesMapper;
import com.glacier.netloan.dao.member.MemberStatisticsMapper;
import com.glacier.netloan.dto.query.borrow.ReceivablesNotesDetailQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterBasic;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.ReceivablesNotes;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetail;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetailExample;
import com.glacier.netloan.entity.borrow.ReceivablesNotesDetailExample.Criteria;
import com.glacier.netloan.entity.borrow.ReceivablesNotesExample;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.borrow.TenderNotesExample;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.service.basicdatas.ParameterBasicService;
import com.glacier.netloan.service.member.MemberService;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: ReceivablesNotesDetailService
 * @Description: TODO(收款记录明细业务层)
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-9上午10:00:43
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ReceivablesNotesDetailService {
    @Autowired
    private ReceivablesNotesDetailMapper receivablesNotesDetailMapper;

    @Autowired
    private BorrowingLoanMapper borrowingLoanMapper;

    @Autowired
    private TenderNotesMapper tenderNotesMapper;

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberStatisticsMapper memberStatisticsMapper;

    @Autowired
    private ParameterBasicService parameterBasicService;

    @Autowired
    private ReceivablesNotesMapper receivablesNotesMapper;
    
    @Autowired
    private RepaymentNotesDetailService repaymentNotesDetailService;

    /**
     * @Title: getReceivablesNotesDetail
     * @Description: TODO(根据收款记录明细Id获取收款记录明细信息)
     * @param @param receNotesDetailId
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object getReceivablesNotesDetail(String receNotesDetailId) {
        ReceivablesNotesDetail receivablesNotesDetail = receivablesNotesDetailMapper.selectByPrimaryKey(receNotesDetailId);
        return receivablesNotesDetail;
    }

    /**
     * @Title: listAsGridWebsite
     * @Description: TODO(前台收款记录明细列表)
     * @param @param jqPager
     * @param @param borrowingLoanQueryDTO
     * @param @param pagetype
     * @param @param p
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     * 
     */
    public Object listAsGridWebsite(JqPager jqPager, int p, String receNotesId, String memberId, String receDetailState) {

        JqGridReturn returnResult = new JqGridReturn();
        ReceivablesNotesDetailExample receivablesNotesDetailExample = new ReceivablesNotesDetailExample();
        Criteria criteria = receivablesNotesDetailExample.createCriteria();
        if (memberId != null) {
            criteria.andMemberIdEqualTo(memberId);// 查询相对应的还款人的收款记录明细,根据投标人的id
        }
        if (receNotesId != null) {
            criteria.andReceNotesIdEqualTo(receNotesId);// 查询相对应的还款人的收款记录的还款明细，根据收款记录id
        }
        if (receDetailState != null && !receDetailState.trim().equals("")) {
            criteria.andReceStateEqualTo(receDetailState);// 查询相对应的还款人的收款记录的还款明细,根据和收款记录明细状态
        }
        jqPager.setSort("numberPeriod");// 定义排序字段
        jqPager.setOrder("ASC");// 升序还是降序
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            receivablesNotesDetailExample.setOrderByClause(jqPager.getOrderBy("temp_receivables_notes_detail_"));
        }

        int startTemp = ((p - 1) * 10);// 根据前台返回的页数进行设置
        receivablesNotesDetailExample.setLimitStart(startTemp);
        receivablesNotesDetailExample.setLimitEnd(10);
        List<ReceivablesNotesDetail> receivablesNotesDetails = receivablesNotesDetailMapper.selectByExample(receivablesNotesDetailExample); // 查询所有借款列表

        int total = receivablesNotesDetailMapper.countByExample(receivablesNotesDetailExample); // 查询总页数
        returnResult.setRows(receivablesNotesDetails);// 设置查询数据
        returnResult.setTotal(total);// 设置总条数
        returnResult.setP(p);// 设置当前页
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: listAsGrid
     * @Description: TODO(获取所有收款记录明细信息)
     * @param @param pager
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsGrid(JqPager pager, ReceivablesNotesDetailQueryDTO receivablesNotesDetailQueryDTO) {

        JqGridReturn returnResult = new JqGridReturn();
        ReceivablesNotesDetailExample receivablesNotesDetailExample = new ReceivablesNotesDetailExample();

        Criteria queryCriteria = receivablesNotesDetailExample.createCriteria();
        receivablesNotesDetailQueryDTO.setQueryCondition(queryCriteria);

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
            receivablesNotesDetailExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
            receivablesNotesDetailExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
            receivablesNotesDetailExample.setOrderByClause(pager.getOrderBy("temp_receivables_notes_detail_"));
        }
        List<ReceivablesNotesDetail> receivablesNotesDetails = receivablesNotesDetailMapper.selectByExample(receivablesNotesDetailExample); // 查询所有收款记录明细列表
        int total = receivablesNotesDetailMapper.countByExample(receivablesNotesDetailExample); // 查询总页数
        returnResult.setRows(receivablesNotesDetails);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addReceivablesNotesDetail
     * @Description: TODO(新增收款记录明细)
     * @param @param receivablesNotesDetail
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ReceivablesNotesDetailList_add")
    public Object addReceivablesNotesDetail(ReceivablesNotesDetail receivablesNotesDetail, BorrowingLoan borrowingLoan, ReceivablesNotes receivablesNotes) {

        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();

        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        float currentReceMoeny = 0f;
        float everyMonthInterest = 0f;
        ParameterBasic parameterBasic = (ParameterBasic) parameterBasicService.getParameterBasicByTitle("利息管理费");
        List<String> memberIds = new ArrayList<String>();
        List<String> memberNames = new ArrayList<String>();
        BorrowingLoan borrowingLoanNew = (BorrowingLoan) borrowingLoanMapper.selectByPrimaryKey(borrowingLoan.getLoanId());// 查询借款信息
        TenderNotesExample tenderNotesExample = new TenderNotesExample();
        tenderNotesExample.createCriteria().andLoanIdEqualTo(borrowingLoanNew.getLoanId());// 查询相对应的投标的记录
        List<TenderNotes> tenderNotess = tenderNotesMapper.selectByExample(tenderNotesExample);
        for (TenderNotes tenderNotes : tenderNotess) {
            if (memberIds.contains(tenderNotes.getMemberId())) {// 将交易对方，通过for循环查询处理，如果包含相同的就不做任何操作，否则添加到list中

            } else {
                memberIds.add(tenderNotes.getMemberId());
                Member member = (Member) memberService.getMember(tenderNotes.getMemberId());
                memberNames.add(member.getMemberRealName());
            }
            // 更投标记录id查询，收款记录的id,然后再插入到收款记录明细中的setReceNotesId字段中
            ReceivablesNotesExample receivablesNotesExample = new ReceivablesNotesExample();
            receivablesNotesExample.createCriteria().andTenderNotesIdEqualTo(tenderNotes.getTenderNotesId());
            List<ReceivablesNotes> ReceivablesNotess = receivablesNotesMapper.selectByExample(receivablesNotesExample);
            ReceivablesNotes receivablesNotesNew = ReceivablesNotess.get(0);
            for (int i = 0; i < Integer.parseInt(borrowingLoanNew.getLoanDeadlinesId()); i++) {
                receivablesNotesDetail.setReceNotesId(receivablesNotesNew.getReceNotesId());
                receivablesNotesDetail.setNumberPeriod(i + 1);// 设置当前是第几期
                Calendar c = Calendar.getInstance();// 日历对象
                c.setTime(new Date());// 获取当前时间
                c.add(Calendar.MONTH, i + 1);// 在当前时间上加一个月
                receivablesNotesDetail.setShouldReceDate(c.getTime());// 设置应收款日期
                if (borrowingLoanNew.getSubTotal() == 0.0) {// 借款是以金额进行投资的
                    if (borrowingLoanNew.getRepaymentTypeDisplay().equals("等额本息")) {
                        currentReceMoeny = (float) ((tenderNotes.getTenderMoney() * (borrowingLoanNew.getLoanApr() / 12) * Math.pow(((1 + borrowingLoanNew.getLoanApr() / 12)),
                                Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()))) / (Math.pow(((1 + borrowingLoanNew.getLoanApr() / 12)),
                                Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId())) - 1));
                        float everyMonthPrincipal = (float) ((tenderNotes.getTenderMoney() * (borrowingLoanNew.getLoanApr() / 12) * Math.pow(((1 + borrowingLoanNew.getLoanApr() / 12)), i)) / (Math
                                .pow(((1 + borrowingLoanNew.getLoanApr() / 12)), Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId())) - 1));
                        everyMonthInterest = currentReceMoeny - everyMonthPrincipal;
                        receivablesNotesDetail.setCurrentReceMoeny(currentReceMoeny);// 设置当期应收本息
                        receivablesNotesDetail.setCurrentRecePrincipal(everyMonthPrincipal);// 设置当期应收本金
                        receivablesNotesDetail.setCurrentReceInterest(everyMonthInterest);// 设置当期应收利息
                        //float surplusPrincipal = tenderNotes.getTenderMoney() - everyPrincipal;
                        //receivablesNotesDetail.setSurplusPrincipal(surplusPrincipal);// 设置当期未收本金
                        receivablesNotesDetail.setSurplusPrincipal(everyMonthPrincipal);// 设置当期未收本金，这里等于应收本金
                        receivablesNotesDetail.setIncome(everyMonthInterest - everyMonthInterest * Float.valueOf(parameterBasic.getBasicValue()));// 设置当期收益
                        receivablesNotesDetail.setInterestManaFee(everyMonthInterest * Float.valueOf(parameterBasic.getBasicValue()));// 设置利息管理费
                        receivablesNotesDetail.setAmount(0f);// 设置总收款金额
                    } else if (borrowingLoanNew.getRepaymentTypeDisplay().equals("按月付息，到期还本")) {
                        everyMonthInterest = tenderNotes.getTenderMoney() * (borrowingLoanNew.getLoanApr() / 12);
                        receivablesNotesDetail.setIncome(everyMonthInterest - everyMonthInterest * Float.valueOf(parameterBasic.getBasicValue()));// 设置当期收益
                        receivablesNotesDetail.setInterestManaFee(everyMonthInterest * Float.valueOf(parameterBasic.getBasicValue()));// 设置利息管理费
                        if (Integer.parseInt(borrowingLoanNew.getLoanDeadlinesId()) == i + 1) {// 判断是否是最后一期
                            currentReceMoeny = everyMonthInterest + tenderNotes.getTenderMoney();
                            receivablesNotesDetail.setCurrentReceMoeny(currentReceMoeny);// 设置当期应收本息
                            receivablesNotesDetail.setCurrentReceInterest(everyMonthInterest);// 设置当期应收利息
                            receivablesNotesDetail.setCurrentRecePrincipal(tenderNotes.getTenderMoney());// 设置当期应收本金=投资记录的投资金额
                            receivablesNotesDetail.setSurplusPrincipal(tenderNotes.getTenderMoney());// 设置当期未收本金=投资记录的投资金额
                            receivablesNotesDetail.setAmount(0f);// 设置总收款金额
                        } else {
                            receivablesNotesDetail.setCurrentReceMoeny(everyMonthInterest);// 设置当期应收本息
                            receivablesNotesDetail.setCurrentReceInterest(everyMonthInterest);// 设置当期应收利息
                            receivablesNotesDetail.setCurrentRecePrincipal(0f);// 设置当期应收本金
                            receivablesNotesDetail.setSurplusPrincipal(0f);// 设置当期未收本金
                            receivablesNotesDetail.setAmount(0f);// 设置总收款金额
                        }
                    } else if (borrowingLoanNew.getRepaymentTypeDisplay().equals("一次性还款")) {
                        if (Integer.parseInt(borrowingLoanNew.getLoanDeadlinesId()) == i + 1) {// 判断是否是最后一期
                            everyMonthInterest = tenderNotes.getTenderMoney() * (borrowingLoanNew.getLoanApr() / 12);//每月利息
                            float interest = everyMonthInterest* Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId());//总利息
                            currentReceMoeny = interest + tenderNotes.getTenderMoney();//总本息=总利息+投资金额
                            receivablesNotesDetail.setCurrentReceMoeny(currentReceMoeny);// 设置当期应收本息
                            receivablesNotesDetail.setCurrentReceInterest(interest);// 设置当期应收利息
                            receivablesNotesDetail.setCurrentRecePrincipal(currentReceMoeny - interest);// 设置当期应收本金
                            receivablesNotesDetail.setSurplusPrincipal(currentReceMoeny - interest);// 设置当期未收本金
                            receivablesNotesDetail.setIncome(interest - interest * Float.valueOf(parameterBasic.getBasicValue()));// 设置当期收益
                            receivablesNotesDetail.setInterestManaFee(interest * Float.valueOf(parameterBasic.getBasicValue()));// 设置利息管理费
                            receivablesNotesDetail.setAmount(0f);// 设置总收款金额
                        }else {
                            continue;//跳出本次循环,“一次性还款”指最后一期才进行还款本息
                        }
                    }
                } else {// 借款是认购份数进行投资的
                    if (borrowingLoanNew.getRepaymentTypeDisplay().equals("等额本息")) {
                        currentReceMoeny = (float) ((tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub() * (borrowingLoanNew.getLoanApr() / 12) * Math.pow(
                                ((1 + borrowingLoanNew.getLoanApr() / 12)), Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId()))) / (Math.pow(((1 + borrowingLoanNew.getLoanApr() / 12)),
                                Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId())) - 1));
                        float everyMonthPrincipal = (float) ((tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub() * (borrowingLoanNew.getLoanApr() / 12) * Math.pow(
                                ((1 + borrowingLoanNew.getLoanApr() / 12)), i)) / (Math.pow(((1 + borrowingLoanNew.getLoanApr() / 12)), Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId())) - 1));
                        everyMonthInterest = currentReceMoeny - everyMonthPrincipal;
                        receivablesNotesDetail.setCurrentReceMoeny(currentReceMoeny);// 设置当期应收本息
                        receivablesNotesDetail.setCurrentRecePrincipal(everyMonthPrincipal);// 设置当期应收本金
                        receivablesNotesDetail.setCurrentReceInterest(everyMonthInterest);// 设置当期应收利息
                        //receivablesNotesDetail.setSurplusPrincipal(tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub()-everyPrincipal);//设置当期未收本金
                        receivablesNotesDetail.setSurplusPrincipal(everyMonthPrincipal);// 设置当期未收本金，这里等于应收本金
                        receivablesNotesDetail.setIncome(everyMonthInterest - everyMonthInterest * Float.valueOf(parameterBasic.getBasicValue()));// 设置当期收益
                        receivablesNotesDetail.setInterestManaFee(everyMonthInterest * Float.valueOf(parameterBasic.getBasicValue()));// 设置利息管理费
                        receivablesNotesDetail.setAmount(0f);// 设置总收款金额
                    } else if (borrowingLoanNew.getRepaymentTypeDisplay().equals("按月付息，到期还本")) {
                        everyMonthInterest = tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub() * (borrowingLoanNew.getLoanApr() / 12);
                        receivablesNotesDetail.setIncome(everyMonthInterest - everyMonthInterest * Float.valueOf(parameterBasic.getBasicValue()));// 设置当期收益
                        receivablesNotesDetail.setInterestManaFee(everyMonthInterest * Float.valueOf(parameterBasic.getBasicValue()));// 设置利息管理费
                        if (Integer.parseInt(borrowingLoanNew.getLoanDeadlinesId()) == i + 1) {// 判断是否是最后一期
                            currentReceMoeny = everyMonthInterest + tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub();
                            receivablesNotesDetail.setCurrentReceMoeny(currentReceMoeny);// 设置当期应收本息
                            receivablesNotesDetail.setCurrentReceInterest(everyMonthInterest);// 设置当期应收利息
                            receivablesNotesDetail.setCurrentRecePrincipal(tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub());// 设置当期应收本金=投资份数*认购份数金额
                            receivablesNotesDetail.setSurplusPrincipal(tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub());// 设置当期未收本金=投资份数*认购份数金额
                            receivablesNotesDetail.setAmount(0f);// 设置总收款金额
                        } else {
                            receivablesNotesDetail.setCurrentReceMoeny(everyMonthInterest);// 设置当期应收本息
                            receivablesNotesDetail.setCurrentReceInterest(everyMonthInterest);// 设置当期应收利息
                            receivablesNotesDetail.setCurrentRecePrincipal(0f);// 设置当期应收本金
                            receivablesNotesDetail.setSurplusPrincipal(0f);// 设置当期未收本金
                            receivablesNotesDetail.setAmount(0f);// 设置总收款金额
                        }
                    } else if (borrowingLoanNew.getRepaymentTypeDisplay().equals("一次性还款")) {
                        if (Integer.parseInt(borrowingLoanNew.getLoanDeadlinesId()) == i + 1) {// 判断是否是最后一期
                            everyMonthInterest = tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub() * (borrowingLoanNew.getLoanApr() / 12);//每月利息
                            float interest = everyMonthInterest* Float.parseFloat(borrowingLoanNew.getLoanDeadlinesId());//总利息
                            currentReceMoeny = interest + tenderNotes.getSubSum() * borrowingLoanNew.getLowestSub();//总本息=总利息+投资金额（份数*每份金额）
                            receivablesNotesDetail.setCurrentReceMoeny(currentReceMoeny);// 设置当期应收本息
                            receivablesNotesDetail.setCurrentReceInterest(interest);// 设置当期应收利息
                            receivablesNotesDetail.setCurrentRecePrincipal(currentReceMoeny - interest);// 设置当期应收本金
                            receivablesNotesDetail.setSurplusPrincipal(currentReceMoeny - interest);// 设置当期未收本金
                            receivablesNotesDetail.setIncome(interest - interest * Float.valueOf(parameterBasic.getBasicValue()));// 设置当期收益
                            receivablesNotesDetail.setInterestManaFee(interest * Float.valueOf(parameterBasic.getBasicValue()));// 设置利息管理费
                            receivablesNotesDetail.setAmount(0f);// 设置总收款金额
                        }else {
                            continue;//跳出本次循环,“一次性还款”指最后一期才进行还款本息
                        }
                    }
                }
                receivablesNotesDetail.setAlrReceMoney(0f);// 设置已收金额
                receivablesNotesDetail.setOverdueDays(0f);// 设置逾期天数
                receivablesNotesDetail.setIsOverdue("no");// 设置是否逾期
                receivablesNotesDetail.setOverdueInterest(0f);// 设置逾期利息为0
                receivablesNotesDetail.setReceState("notReceiving");// 设置收款状态为未收
                receivablesNotesDetail.setReceNotesDetailId(RandomGUID.getRandomGUID());// 设置收款记录明细id
                receivablesNotesDetail.setMemberId(tenderNotes.getMemberId());
                receivablesNotesDetail.setRemark("满标复审通过时，系统自动添加收款记录明细信息");
                receivablesNotesDetail.setCreater(pricipalUser.getUserId());
                receivablesNotesDetail.setCreateTime(repaymentNotesDetailService.addOneSecond(new Date(), i));//为了排序清晰，创建时间不能相同
                receivablesNotesDetail.setUpdater(pricipalUser.getUserId());
                receivablesNotesDetail.setUpdateTime(repaymentNotesDetailService.addOneSecond(new Date(), i));//更新时间等于创建时间
                count = receivablesNotesDetailMapper.insert(receivablesNotesDetail);

            }
        }
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setObj(memberNames);
            returnResult.setMsg(" 收款记录明细信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，收款记录明细信息保存失败");
        }
        return returnResult;
    }

    /**
     * @Title: editReceivablesNotesDetail
     * @Description: TODO(修改收款记录明细)
     * @param @param receivablesNotesDetail
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editReceivablesNotesDetail(ReceivablesNotesDetail receivablesNotesDetail) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        count = receivablesNotesDetailMapper.updateByPrimaryKeySelective(receivablesNotesDetail);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("收款记录明细信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，收款记录明细信息修改失败");
        }
        return returnResult;
    }

    /**
     * @Title: delReceivablesNotesDetail
     * @Description: TODO(删除收款记录明细)
     * @param @param receNotesDetailIds
     * @param @param annThemes
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ReceivablesNotesDetailList_del")
    public Object delReceivablesNotesDetail(List<String> receNotesDetailIds, List<String> receivablesNotesDetailTitle) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (receNotesDetailIds.size() > 0) {
            ReceivablesNotesDetailExample receivablesNotesDetailExample = new ReceivablesNotesDetailExample();
            count = receivablesNotesDetailMapper.deleteByExample(receivablesNotesDetailExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了收款记录明细信息");
            } else {
                returnResult.setMsg("发生未知错误，收款记录明细信息删除失败");
            }
        }
        return returnResult;
    }
}
