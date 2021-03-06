package com.glacier.netloan.service.finance;

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
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.finance.FinanceBankCardMapper;
import com.glacier.netloan.dao.finance.FinanceMemberMapper;
import com.glacier.netloan.dao.member.MemberMessageNoticeMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.finance.FinBankCardQueryDTO;
import com.glacier.netloan.entity.finance.FinanceBankCard;
import com.glacier.netloan.entity.finance.FinanceBankCardExample;
import com.glacier.netloan.entity.finance.FinanceMemberExample; 
import com.glacier.netloan.entity.member.MemberMessageNotice;
import com.glacier.netloan.entity.system.User; 
import com.glacier.netloan.entity.finance.FinanceBankCardExample.Criteria;
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
	
	@Autowired
	private MemberMessageNoticeMapper memberMessageNoticeMapper;
	
	@Autowired
	private FinanceMemberMapper financeMemberMapper;
	 
	@Autowired
	private UserMapper userMapper; 
	
	
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
        	FinanceBankCardExample financeBankCardExampleCardNum = new FinanceBankCardExample();
        	financeBankCardExampleCardNum.createCriteria().andCardNumberEqualTo(financeBankCard.getCardNumber()).andMemberIdEqualTo(financeBankCard.getMemberId());
            count = financeBankCardMapper.countByExample(financeBankCardExampleCardNum);// 查找相同名称的会员银行卡数量
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
     * @Title: getBankCardByMemberId 
     * @Description: TODO(根据会员Id查找出所属的银行卡信息) 
     * @param  @param MemberId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getBankCardByMemberId(String memberId) {
        FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();
        financeBankCardExample.createCriteria().andMemberIdEqualTo(memberId);
        List<FinanceBankCard> financeBankCards = financeBankCardMapper.selectByExample(financeBankCardExample);
        Map<String,String> map = new HashMap<String,String>();
        for (FinanceBankCard financeBankCard : financeBankCards) {
        	financeBankCard.setCardName(financeBankCard.getCardName()+" (**"+financeBankCard.getCardNumber().substring(15)+")");
        	 
            map.put(financeBankCard.getBankCardId(),financeBankCard.getCardName());
        }
        return map;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员银行卡信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(FinBankCardQueryDTO bankQuery,JqPager pager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();
        
        Criteria queryCriteria = financeBankCardExample.createCriteria();
        bankQuery.setQueryConditions(queryCriteria);

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
     * @Title: listAsGrid 
     * @Description: TODO(前台的会员银行卡list) 
     * @param  @param memberId
     * @param  @param pager
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object listAsGridWebsite(String memberId,JqPager pager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();;
        financeBankCardExample.createCriteria().andMemberIdEqualTo(memberId);
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeBankCardExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeBankCardExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeBankCardExample.setOrderByClause(pager.getOrderBy("temp_finance_bank_card_"));
        }
        List<FinanceBankCard>  financeBankCards = financeBankCardMapper.selectByExample(financeBankCardExample); // 查询会员银行卡列表
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
        // 定义删除成功数据行数量
		int rightNumber = 0;
		// 定义返回结果
		String result_str = ""; 
		// 定义是否显示提示
		boolean isFlag = true;
		//数据行长度判断
		if (bankCardIds.size() > 0) {
			//匹配删除信息
			for (int i = 0; i < bankCardIds.size(); i++) {  
                // 相关会员资金记录
				FinanceMemberExample financeMemberExample = new FinanceMemberExample();
				financeMemberExample.createCriteria().andBankCardIdEqualTo(bankCardIds.get(i));
				int count = financeMemberMapper.countByExample(financeMemberExample);
                // 判断是否关联
				if (count <= 0) { 
					FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();
					financeBankCardExample.createCriteria().andBankCardIdEqualTo(bankCardIds.get(i));
		            int number = financeBankCardMapper.deleteByExample(financeBankCardExample);
	                rightNumber += number;// 删除成功数据行数量记录 
                } else { 
                	if(isFlag){ 
						if(count > 0){
							result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与" + "【会员资金记录】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【会员资金记录】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
							isFlag = false;
						} 
                	}  
               }
			}
		// 删除成功数量大于0即为操作成功,且提示关联信息
		if(rightNumber>0){
			returnResult.setMsg("成功删除<font style='color:red;font-weight: bold;'>【"+ rightNumber +"】</font> 条数据," +result_str);
			returnResult.setSuccess(true);
		}else{
			returnResult.setMsg(result_str.trim());
			returnResult.setSuccess(false);
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
             // 相关会员资金记录
			FinanceMemberExample financeMemberExample = new FinanceMemberExample();
			financeMemberExample.createCriteria().andBankCardIdEqualTo(bankCardId);
			int count = financeMemberMapper.countByExample(financeMemberExample);
            // 判断是否关联
			if (count <= 0) {  
		        returnResult.setSuccess(true);
				FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();
	        	financeBankCardExample.createCriteria().andBankCardIdEqualTo(bankCardId);
	            count = financeBankCardMapper.deleteByExample(financeBankCardExample); 
	        	returnResult.setMsg("操作成功！"); 
			} else {   
				returnResult.setMsg("该银行卡与资金记录存在关联，请先清除该银行卡相关联的资金记录"); 
             } 
        return returnResult;
    }
    /**
     * @Title: auditApplyAmount 
     * @Description: TODO(银行卡后台审核) 
     * @param  @param bankCard
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "bankCardList_audit")
	public Object auditApplyAmount(FinanceBankCard bankCard) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	    FinanceBankCard card=financeBankCardMapper.selectByPrimaryKey(bankCard.getBankCardId()); 
        if(card.getStatus().equals("pass")||card.getStatus().equals("failure")){  
	         returnResult.setMsg("操作失败，该会员银行卡已进行过审核！"); 
			 return returnResult;
		 }else if(bankCard.getStatus().equals(card.getStatus())){
			 returnResult.setMsg("无效的操作！"); 
			 return returnResult;
		 } 
        String  mesginfo="";
        if(bankCard.getRemark()!=null){
        	mesginfo="。审核说明："+bankCard.getRemark();
        }
	    Subject pricipalSubject = SecurityUtils.getSubject();// 查找当前系统登录用户
	    User pricipalUser = (User) pricipalSubject.getPrincipal(); 
	    bankCard.setUpdater(pricipalUser.getUserId());// 更新人为当前系统登录用户
	    bankCard.setUpdateTime(new Date());// 更新时间为当前系统时间
	    bankCard.setAuditor(pricipalUser.getUserId());// 审核人为当前系统登录用户
	    bankCard.setAuditDate(new Date());// 审核时间为当前系统时间 
	    //创建信息通知对象
        MemberMessageNotice memberMessageNotice = new MemberMessageNotice();  
	    int count = 0;
	    count = financeBankCardMapper.updateByPrimaryKeySelective(bankCard);
	    if (count == 1) {    
	        returnResult.setSuccess(true);
	        returnResult.setMsg("会员银行卡审核操作成功！"); 
	       //变更中
	    	if(bankCard.getStatus().equals("changing")){
	    		 return returnResult;
	    	} 
  			if(bankCard.getStatus().equals("pass")){
  				memberMessageNotice.setTitle("会员银行卡审核通知");
  	  			memberMessageNotice.setContent("您的银行卡号为["+card.getCardNumber()+"]，审核状态:通过"+mesginfo);
  			}else if(bankCard.getStatus().equals("failure")){
  				memberMessageNotice.setTitle("会员银行卡审核通知");
  	  			memberMessageNotice.setContent("您的银行卡号为["+card.getCardNumber()+"]，审核状态:不通过"+mesginfo);
  			}
  			this.addMessageNotice(memberMessageNotice,card.getMemberId());
	    } else {
	        returnResult.setMsg("发生未知错误，会员银行卡审核失败");
	    }
	    return returnResult;
	}
	/**
   	 * @Title: addMessageNotice 
   	 * @Description: TODO(对审核认证后添加相对应的信息通知) 
   	 * @param  @param memberMessageNotice
   	 * @param  @return设定文件
   	 * @return int  返回类型
   	 * @throws 
   	 *
   	 */
   	public int addMessageNotice(MemberMessageNotice memberMessageNotice,String memberId){
   	    //获取当前登录用户
   		Subject pricipalSubject = SecurityUtils.getSubject(); 
        User pricipalUser = (User) pricipalSubject.getPrincipal();  
        //为信息通知对象设置值
   		memberMessageNotice.setMessageNoticeId(RandomGUID.getRandomGUID());
   		memberMessageNotice.setSender(pricipalUser.getUserId());
   		memberMessageNotice.setAddressee(memberId);
        memberMessageNotice.setSendtime(new Date());
        memberMessageNotice.setLetterstatus("unread");
        memberMessageNotice.setLettertype("system");
        memberMessageNotice.setCreater(pricipalUser.getUserId());
        memberMessageNotice.setCreateTime(new Date());
        memberMessageNotice.setUpdater(pricipalUser.getUserId());
        memberMessageNotice.setUpdateTime(new Date());
        int count = memberMessageNoticeMapper.insert(memberMessageNotice);
        return count;
   	}
   	
   	/**
   	 * @Title: getBankCardNumByBankCardAuths 
   	 * @Description: TODO(根据会员银行卡状态查找相对应的银行卡记录条数) 
   	 * @param  @param bankCardAuths
   	 * @param  @return
   	 * @throws 
   	 * 备注<p>已检查测试:Green<p>
   	 */
   	public Object getBankCardNumByBankCardAuths(String bankCardAuths) {
   	    FinanceBankCardExample financeBankCardExample = new FinanceBankCardExample();
   	    financeBankCardExample.createCriteria().andStatusEqualTo(bankCardAuths);
   	    int bankCardNum = financeBankCardMapper.countByExample(financeBankCardExample);
   	    return bankCardNum;
    }
}
