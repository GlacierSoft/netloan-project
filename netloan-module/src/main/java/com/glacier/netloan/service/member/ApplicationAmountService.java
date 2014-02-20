package com.glacier.netloan.service.member;

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
import com.glacier.netloan.dao.member.ApplicationAmountMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.entity.member.ApplicationAmount;
import com.glacier.netloan.entity.member.ApplicationAmountExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: ApplicationAmountService 
 * @Description: TODO(申请额度业务表) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-19下午5:22:35
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ApplicationAmountService {

	@Autowired
	private ApplicationAmountMapper applicationAmountMapper;
	
	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getApplicationAmount 
	 * @Description: TODO(根据申请额度Id获取申请额度信息) 
	 * @param @param appAmountId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getApplicationAmount(String appAmountId) {
    	ApplicationAmount applicationAmount = applicationAmountMapper.selectByPrimaryKey(appAmountId);
    	if (null != applicationAmount.getCreater()) {// 根据创建人的所属Id查找到创建人的名字
            User userTemp = userMapper.selectByPrimaryKey(applicationAmount.getCreater());
            if (StringUtils.isNotBlank(userTemp.getUserCnName())) {
            	applicationAmount.setCreater(userTemp.getUserCnName());
            }
        }
    	if (null != applicationAmount.getUpdater()) {// 根据更新人的所属Id查找到更新人的名字
            User userTemp = userMapper.selectByPrimaryKey(applicationAmount.getUpdater());
            if (StringUtils.isNotBlank(userTemp.getUserCnName())) {
            	applicationAmount.setUpdater(userTemp.getUserCnName());
            }
        }
        return applicationAmount;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有申请额度信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        ApplicationAmountExample applicationAmountExample = new ApplicationAmountExample();;

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	applicationAmountExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	applicationAmountExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	applicationAmountExample.setOrderByClause(pager.getOrderBy("temp_application_amount_"));
        }
        List<ApplicationAmount>  applicationAmounts = applicationAmountMapper.selectByExample(applicationAmountExample); // 查询所有申请额度列表
        for (ApplicationAmount helpTemp : applicationAmounts) {
        	if (null != helpTemp.getCreater()) {// 根据创建人的所属Id查找到创建人的名字
                User userTemp = userMapper.selectByPrimaryKey(helpTemp.getCreater());
                if (StringUtils.isNotBlank(userTemp.getUserCnName())) {
                	helpTemp.setCreater(userTemp.getUserCnName());
                }
            }
        	if (null != helpTemp.getUpdater()) {// 根据更新人的所属Id查找到更新人的名字
                User userTemp = userMapper.selectByPrimaryKey(helpTemp.getUpdater());
                if (StringUtils.isNotBlank(userTemp.getUserCnName())) {
                	helpTemp.setUpdater(userTemp.getUserCnName());
                }
            }
        }
        int total = applicationAmountMapper.countByExample(applicationAmountExample); // 查询总页数
        returnResult.setRows(applicationAmounts);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addApplicationAmount 
     * @Description: TODO(新增申请额度) 
     * @param @param applicationAmount
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AmountList_add")
    public Object addApplicationAmount(ApplicationAmount applicationAmount) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
     //   ApplicationAmountExample applicationAmountExample = new ApplicationAmountExample();
        int count = 0;
        applicationAmount.setAppAmountId(RandomGUID.getRandomGUID());
        applicationAmount.setCreater(pricipalUser.getUserId());
        applicationAmount.setCreateTime(new Date());
        applicationAmount.setUpdater(pricipalUser.getUserId());
        applicationAmount.setUpdateTime(new Date());
        count = applicationAmountMapper.insert(applicationAmount);
        if (count == 1) {
            returnResult.setSuccess(true);
           // returnResult.setMsg("[" + applicationAmount.getWebHelpTheme() + "] 申请额度信息已保存");
            returnResult.setMsg("申请额度信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，申请额度信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editApplicationAmount 
     * @Description: TODO(修改申请额度) 
     * @param @param applicationAmount
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AmountList_edit")
    public Object editApplicationAmount(ApplicationAmount applicationAmount) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    //    ApplicationAmountExample applicationAmountExample = new ApplicationAmountExample();
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        applicationAmount.setUpdater(pricipalUser.getUserId());
        applicationAmount.setUpdateTime(new Date());
        count = applicationAmountMapper.updateByPrimaryKeySelective(applicationAmount);
        if (count == 1) {
            returnResult.setSuccess(true);
     //       returnResult.setMsg("[" + applicationAmount.getWebHelpTheme() + "] 申请额度信息已修改");
            returnResult.setMsg("申请额度信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，申请额度信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delApplicationAmount 
     * @Description: TODO(删除申请额度) 
     * @param @param appAmountIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AmountList_del")
    public Object delApplicationAmount(List<String> appAmountIds, List<String> memberIds) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (appAmountIds.size() > 0) {
        	ApplicationAmountExample applicationAmountExample = new ApplicationAmountExample();
        	applicationAmountExample.createCriteria().andAppAmountIdIn(appAmountIds);
            count = applicationAmountMapper.deleteByExample(applicationAmountExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(memberIds, ",") + " ]操作");
            } else {
                returnResult.setMsg("发生未知错误，申请额度信息删除失败");
            }
        }
        return returnResult;
    }
}
