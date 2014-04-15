package com.glacier.netloan.service.finance;

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
import com.glacier.netloan.dao.finance.FinanceBankCardMapper;
import com.glacier.netloan.entity.finance.FinanceBankCard;
import com.glacier.netloan.entity.finance.FinanceBankCardExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: FinanceBankCardService 
 * @Description: TODO(银行卡service层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-4-4下午2:39:55
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceBankCardService {
	@Autowired
	private FinanceBankCardMapper financeBankCardMapper;
	
	/**
	 * @Title: addFinanceBankCardWebsit 
	 * @Description: TODO(前台增加会员银行卡) 
	 * @param  @param financeBankCard
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
    @Transactional(readOnly = false)
    public Object addFinanceBankCardWebsit(FinanceBankCard financeBankCard) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();
        int count = 0;
        int bankCount = 0;
        financeBankCardExample.createCriteria().andMemberIdEqualTo(financeBankCard.getMemberId());
        bankCount = financeBankCardMapper.selectByExample(financeBankCardExample).size();
        if(bankCount < 2){
        	// 防止会员银行卡名称重复
            financeBankCardExample.createCriteria().andCardNumberEqualTo(financeBankCard.getCardNumber());
            count = financeBankCardMapper.countByExample(financeBankCardExample);// 查找相同名称的会员银行卡数量
            if (count > 0) {
                returnResult.setMsg("会员银行卡号不能重复");
                return returnResult;
            }
            financeBankCard.setBankCardId(RandomGUID.getRandomGUID());
            financeBankCard.setStatus("authstr");
            financeBankCard.setCreater(financeBankCard.getMemberId());
            financeBankCard.setCreateTime(new Date());
            financeBankCard.setUpdater(financeBankCard.getMemberId());
            financeBankCard.setUpdateTime(new Date());
            count = financeBankCardMapper.insert(financeBankCard);
            if (count == 1) {
                returnResult.setSuccess(true);
                returnResult.setMsg("[" + financeBankCard.getCardName() + "] 会员银行卡信息已保存");
            } else {
                returnResult.setMsg("发生未知错误，会员银行卡信息保存失败");
            }
        }else{
        	returnResult.setMsg("会员绑定银行卡不能超过两张，请申请变更已绑定的银行卡");
        }
        
        return returnResult;
    }
	
	/**
	 * @Title: getFinanceBankCard 
	 * @Description: TODO(根据会员银行卡Id获取会员银行卡信息) 
	 * @param @param bankCardId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getFinanceBankCard(String bankCardId) {
    	FinanceBankCard financeBankCard = financeBankCardMapper.selectByPrimaryKey(bankCardId);
        return financeBankCard;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员银行卡信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();;

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeBankCardExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeBankCardExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeBankCardExample.setOrderByClause(pager.getOrderBy("temp_finance_bank_card_"));
        }
        List<FinanceBankCard>  financeBankCards = financeBankCardMapper.selectByExample(financeBankCardExample); // 查询所有会员银行卡列表
        int total = financeBankCardMapper.countByExample(financeBankCardExample); // 查询总页数
        returnResult.setRows(financeBankCards);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addFinanceBankCard 
     * @Description: TODO(新增会员银行卡) 
     * @param @param financeBankCard
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "bankCardList_add")
    public Object addFinanceBankCard(FinanceBankCard financeBankCard) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();
        int count = 0;
        // 防止会员银行卡名称重复
        financeBankCardExample.createCriteria().andCardNumberEqualTo(financeBankCard.getCardNumber());
        count = financeBankCardMapper.countByExample(financeBankCardExample);// 查找相同名称的会员银行卡数量
        if (count > 0) {
            returnResult.setMsg("会员银行卡号不能重复");
            return returnResult;
        }
        financeBankCard.setBankCardId(RandomGUID.getRandomGUID());
        financeBankCard.setStatus("authstr");
        financeBankCard.setCreater(pricipalUser.getUserId());
        financeBankCard.setCreateTime(new Date());
        financeBankCard.setUpdater(pricipalUser.getUserId());
        financeBankCard.setUpdateTime(new Date());
        count = financeBankCardMapper.insert(financeBankCard);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeBankCard.getCardName() + "] 会员银行卡信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员银行卡信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editFinanceBankCard 
     * @Description: TODO(修改会员银行卡) 
     * @param @param financeBankCard
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "bankCardList_edit")
    public Object editFinanceBankCard(FinanceBankCard financeBankCard) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();
        int count = 0;
        // 防止会员银行卡名称重复
        financeBankCardExample.createCriteria().andBankCardIdNotEqualTo(financeBankCard.getBankCardId()).andCardNumberEqualTo(financeBankCard.getCardName());
        count = financeBankCardMapper.countByExample(financeBankCardExample);// 查找相同名称的会员银行卡数量
        if (count > 0) {
            returnResult.setMsg("会员银行卡号重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeBankCard.setUpdater(pricipalUser.getUserId());
        financeBankCard.setUpdateTime(new Date());
        count = financeBankCardMapper.updateByPrimaryKeySelective(financeBankCard);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeBankCard.getCardName() + "] 会员银行卡信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员银行卡信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delFinanceBankCard 
     * @Description: TODO(删除会员银行卡) 
     * @param @param bankCardIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "bankCardList_del")
    public Object delFinanceBankCard(List<String> bankCardIds, List<String> cardNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (bankCardIds.size() > 0) {
        	FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();
        	financeBankCardExample.createCriteria().andBankCardIdIn(bankCardIds);
            count = financeBankCardMapper.deleteByExample(financeBankCardExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(cardNames, ",") + " ]操作");
            } else {
                returnResult.setMsg("发生未知错误，会员银行卡信息删除失败");
            }
        }
        return returnResult;
    }
    /**
     * @Title: delFinanceBankCardWebsit 
     * @Description: TODO(前台删除会员银行卡) 
     * @param  @param bankCardId
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    public Object delFinanceBankCardWebsit(String bankCardId) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        	FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();
        	financeBankCardExample.createCriteria().andBankCardIdEqualTo(bankCardId);
            count = financeBankCardMapper.deleteByExample(financeBankCardExample);
            if (count == 1) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了会员银行卡");
            } else {
                returnResult.setMsg("发生未知错误，会员银行卡信息删除失败");
            }
        return returnResult;
    }
    @Transactional(readOnly = false)
    @MethodLog(opera = "bankCardList_audit")
	public Object auditApplyAmount(FinanceBankCard bankCard) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	    
	    Subject pricipalSubject = SecurityUtils.getSubject();// 查找当前系统登录用户
	    User pricipalUser = (User) pricipalSubject.getPrincipal();
	    bankCard.setUpdater(pricipalUser.getUserId());// 更新人为当前系统登录用户
	    bankCard.setUpdateTime(new Date());// 更新时间为当前系统时间
	    bankCard.setAuditor(pricipalUser.getUserId());// 审核人为当前系统登录用户
	    bankCard.setAuditDate(new Date());// 审核时间为当前系统时间
	    
	    
	    int count = 0;
	    count = financeBankCardMapper.updateByPrimaryKeySelective(bankCard);
	    if (count == 1) {
	        returnResult.setSuccess(true);
	        returnResult.setMsg("会员银行卡审核成功");
	    } else {
	        returnResult.setMsg("发生未知错误，会员银行卡审核失败");
	    }
	    return returnResult;
	}

}
