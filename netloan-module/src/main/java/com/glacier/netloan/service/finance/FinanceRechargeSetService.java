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
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.finance.FinanceRechargeMapper;
import com.glacier.netloan.dao.finance.FinanceRechargeSetMapper; 
import com.glacier.netloan.entity.finance.FinanceRechargeExample;
import com.glacier.netloan.entity.finance.FinanceRechargeSet;
import com.glacier.netloan.entity.finance.FinanceRechargeSetExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: FinanceRechargeSetService 
 * @Description: TODO(会员充值设置service层) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class FinanceRechargeSetService {
	
	@Autowired
	private FinanceRechargeSetMapper financeRechargeSetMapper;

	@Autowired
	private FinanceRechargeMapper  financeRechargeMapper;
	/**
	 * @Title: getRechargeSet 
	 * @Description: TODO(根据会员充值设置Id获取会员充值设置信息) 
	 * @param @param financeRechargeSetId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getRechargeSet(String financeRechargeSetId) {
    	FinanceRechargeSet financeRechargeSet = financeRechargeSetMapper.selectByPrimaryKey(financeRechargeSetId);
        return financeRechargeSet;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员充值设置信息) 
     * @param @param pfinanceRechargeSetr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        FinanceRechargeSetExample financeRechargeSetExample = new FinanceRechargeSetExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	financeRechargeSetExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	financeRechargeSetExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	financeRechargeSetExample.setOrderByClause(pager.getOrderBy("temp_finance_recharge_set_"));
        }
        List<FinanceRechargeSet>  financeRechargeSets = financeRechargeSetMapper.selectByExample(financeRechargeSetExample); // 查询所有会员充值设置列表
        int total = financeRechargeSetMapper.countByExample(financeRechargeSetExample); // 查询总页数
        returnResult.setRows(financeRechargeSets);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: listWebsite 
     * @Description: TODO(前台查找出“审核通过”的充值设置列表) 
     * @param  @param auditState
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object listWebsite() {
        JqGridReturn returnResult = new JqGridReturn();
        FinanceRechargeSetExample financeRechargeSetExample = new FinanceRechargeSetExample();
        financeRechargeSetExample.createCriteria().andAuditStateEqualTo("pass");
        List<FinanceRechargeSet>  financeRechargeSets = financeRechargeSetMapper.selectByExample(financeRechargeSetExample); // 查询所有会员充值设置列表
        int total = financeRechargeSetMapper.countByExample(financeRechargeSetExample); // 查询总页数
        returnResult.setRows(financeRechargeSets);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    /**
     * @Title: addRechargeSet 
     * @Description: TODO(新增会员充值设置) 
     * @param @param financeRechargeSet
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeSetList_add")
    public Object addRechargeSet(FinanceRechargeSet financeRechargeSet) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinanceRechargeSetExample financeRechargeSetExample = new FinanceRechargeSetExample();
        int count = 0;
        // 防止会员充值设置名称重复
        financeRechargeSetExample.createCriteria().andRechargeSetNameEqualTo(financeRechargeSet.getRechargeSetName()).andMemberTypeEqualTo(financeRechargeSet.getMemberType());
         count = financeRechargeSetMapper.countByExample(financeRechargeSetExample);// 查找相同名称的会员充值设置数量
        if (count > 0) {
            returnResult.setMsg("会员充值设置名称重复");
            return returnResult;
        }
        financeRechargeSet.setFinanceRechargeSetId(RandomGUID.getRandomGUID());
        financeRechargeSet.setCreater(pricipalUser.getUserId());
        financeRechargeSet.setAuditState("authstr");
        financeRechargeSet.setCreateTime(new Date());
        financeRechargeSet.setUpdater(pricipalUser.getUserId());
        financeRechargeSet.setUpdateTime(new Date());
        count = financeRechargeSetMapper.insert(financeRechargeSet);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeRechargeSet.getRechargeSetName() + "] 会员充值设置信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员充值设置信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editRechargeSet 
     * @Description: TODO(修改会员充值设置) 
     * @param @param financeRechargeSet
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeSetList_edit")
    public Object editRechargeSet(FinanceRechargeSet financeRechargeSet) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        FinanceRechargeSetExample financeRechargeSetExample = new FinanceRechargeSetExample();
        int count = 0;
        // 防止会员充值设置名称重复
        financeRechargeSetExample.createCriteria().andFinanceRechargeSetIdNotEqualTo(financeRechargeSet.getFinanceRechargeSetId())
        .andRechargeSetNameEqualTo(financeRechargeSet.getRechargeSetName()).andMemberTypeEqualTo(financeRechargeSet.getMemberType());
         count = financeRechargeSetMapper.countByExample(financeRechargeSetExample);// 查找相同名称的会员充值设置数量
        if (count > 0) {
            returnResult.setMsg("会员充值设置名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeRechargeSet.setUpdater(pricipalUser.getUserId());
        financeRechargeSet.setUpdateTime(new Date());
        count = financeRechargeSetMapper.updateByPrimaryKeySelective(financeRechargeSet);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeRechargeSet.getRechargeSetName() + "] 会员充值设置信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员充值设置信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: auditRechargeSet 
     * @Description: TODO(审核会员充值设置) 
     * @param @param financeRechargeSet
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeSetList_audit")
    public Object auditRechargeSet(FinanceRechargeSet financeRechargeSet) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        if(financeRechargeSet.getAuditState().equals("authstr")){
        	 returnResult.setMsg("无效的操作，请选择是否通过！！"); 
             return returnResult; 
        } 
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        financeRechargeSet.setAuditor(pricipalUser.getUserId());
        financeRechargeSet.setAuditDate(new Date());
        count = financeRechargeSetMapper.updateByPrimaryKeySelective(financeRechargeSet);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + financeRechargeSet.getRechargeSetName() + "] 会员充值设置信息记录审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，会员充值设置信息记录审核操作失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delRechargeSet 
     * @Description: TODO(删除会员充值设置) 
     * @param @param financeRechargeSetId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RechargeSetList_del")
    public Object delRechargeSet(List<String> financeRechargeSetIds, List<String> rechargeSetNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        // 定义删除成功数据行数量
        int rightNumber = 0;
        // 定义返回结果
        String result_str = ""; 
        // 定义是否显示提示
        boolean isFlag = true;
        //数据行长度判断
        if (financeRechargeSetIds.size() > 0) { 
           //匹配删除信息
           for (int i = 0; i < financeRechargeSetIds.size(); i++) {  
                 // 相关联充值记录
        		FinanceRechargeExample financeRechargeExample = new FinanceRechargeExample();
        		financeRechargeExample.createCriteria().andFinanceRechargeSetIdEqualTo(financeRechargeSetIds.get(i));
        		int count = financeRechargeMapper.countByExample(financeRechargeExample);
                // 判断是否关联
        		if (count <= 0) { 
        		      FinanceRechargeSetExample financeRechargeSetExample = new FinanceRechargeSetExample();
        		      financeRechargeSetExample.createCriteria().andFinanceRechargeSetIdEqualTo(financeRechargeSetIds.get(i));
        		      int number = financeRechargeSetMapper.deleteByExample(financeRechargeSetExample);
        	          rightNumber += number;// 删除成功数据行数量记录 
                 } else { 
                       if(isFlag){ 
        				if(count > 0){
        					result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与" + "【充值记录】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【充值记录】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
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
}