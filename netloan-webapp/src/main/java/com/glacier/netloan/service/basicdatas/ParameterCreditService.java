package com.glacier.netloan.service.basicdatas;

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
import com.glacier.netloan.dao.basicdatas.ParameterCreditMapper;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.basicdatas.ParameterCreditExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * 
 * @ClassName: ParameterCreditService 
 * @Description: TODO(会员信用等级业务类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-1-22上午9:12:04
 */
@Service
@Transactional(readOnly= true ,propagation= Propagation.REQUIRED)
public class ParameterCreditService {
	
	@Autowired
	private ParameterCreditMapper parameterCreditMapper;
	
	public Object getCredit(String creditId){
		return parameterCreditMapper.selectByPrimaryKey(creditId);
	}
	
	/**
     * 
     * @Title: listAsGrid
     * @Description: TODO(以表格结构展示会员信用等级列表)
     * @param @param menuId 动作对应的菜单Id
     * @param @param pager 分页参数
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "浏览会员信用等级信息")
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        ParameterCreditExample parameterCreditExample = new ParameterCreditExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	parameterCreditExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	parameterCreditExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	parameterCreditExample.setOrderByClause(pager.getOrderBy("temp_parameter_credit_"));
        }
        List<ParameterCredit>  parameterCredits = parameterCreditMapper.selectByExample(parameterCreditExample); // 查询所有操作列表
        int total = parameterCreditMapper.countByExample(parameterCreditExample); // 查询总页数
        returnResult.setRows(parameterCredits);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * 
     * @Title: addparameterCredit 
     * @Description: TODO(新增会员信用级别) 
     * @param  @param parameterCredit
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "新增会员信用级别")
    public Object addParameterCredit(ParameterCredit parameterCredit) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterCreditExample parameterCreditExample = new ParameterCreditExample();
        int count = 0;
        // 防止会员信用级别名称重复
        parameterCreditExample.createCriteria().andCreditNameEqualTo(parameterCredit.getCreditName());
        count = parameterCreditMapper.countByExample(parameterCreditExample);// 查找相同信用等级名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员信用等级名称重复，请重新填写!");
            return returnResult;
        }
        parameterCredit.setCreditId(RandomGUID.getRandomGUID());
        parameterCredit.setCreater(pricipalUser.getUserId());
        parameterCredit.setCreateTime(new Date());
        count = parameterCreditMapper.insert(parameterCredit);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterCredit.getCreditName() + "] 会员信用等级信息已保存");
        } else {
            returnResult.setMsg("会员信用等级信息保存失败，请联系管理员!");
        }
        return returnResult;
    }
    /**
     * 
     * @Title: editParameterCredit 
     * @Description: TODO(修改会员信用等级) 
     * @param  @param parameterCredit
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera="修改操作")
    public Object editParameterCredit(ParameterCredit parameterCredit) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterCreditExample parameterCreditExample = new ParameterCreditExample();
        int count = 0;
        // 防止会员信用级别名称重复
        parameterCreditExample.createCriteria().andCreditIdNotEqualTo(parameterCredit.getCreditId()).andCreditNameEqualTo(parameterCredit.getCreditName());
        count = parameterCreditMapper.countByExample(parameterCreditExample);// 查找相同信用等级名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员信用等级名称重复，请重新填写!");
            return returnResult;
        }
        count = parameterCreditMapper.updateByPrimaryKeySelective(parameterCredit);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterCredit.getCreditName() + "] 会员信用等级信息已修改保存");
        } else {
            returnResult.setMsg("会员信用等级信息修改保存失败，请联系管理员!");
        }
        return returnResult;
    }
    /**
     * @Title: delAge 
     * @Description: TODO(删除会员信用级别) 
     * @param @param creditId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "删除会员信用等级")
    public Object delCredit(String creditId) {
    	ParameterCredit credit= parameterCreditMapper.selectByPrimaryKey(creditId);
        int result = parameterCreditMapper.deleteByPrimaryKey(creditId);//根据会员年龄别称Id，进行删除会员年龄别称
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        if (result == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + credit.getCreditName() + "] 会员年龄别称信息已删除");
        } else {
            returnResult.setMsg("会员年龄别称信息删除失败，请联系管理员!");
        }
		return returnResult;
     }
}
