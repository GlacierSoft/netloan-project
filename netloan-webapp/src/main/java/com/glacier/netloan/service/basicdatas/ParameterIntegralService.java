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
import com.glacier.netloan.dao.basicdatas.ParameterIntegralMapper;
import com.glacier.netloan.entity.basicdatas.ParameterIntegral;
import com.glacier.netloan.entity.basicdatas.ParameterIntegralExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;


/**
 * 
 * @ClassName: ParameterIntegralService 
 * @Description: TODO(会员积分级别业务类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-1-22下午3:45:13
 */
@Service
@Transactional(readOnly= true ,propagation= Propagation.REQUIRED)
public class ParameterIntegralService {
	
	@Autowired
	private ParameterIntegralMapper parameterIntegralMapper;
			
	public Object getIntegral(String IntegralId){
		return parameterIntegralMapper.selectByPrimaryKey(IntegralId);
	}
	
	/**
     * 
     * @Title: listAsGrid
     * @Description: TODO(以表格结构展示会员积分级别列表)
     * @param @param menuId 动作对应的菜单Id
     * @param @param pager 分页参数
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        ParameterIntegralExample parameterIntegralExample = new ParameterIntegralExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	parameterIntegralExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	parameterIntegralExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	parameterIntegralExample.setOrderByClause(pager.getOrderBy("temp_parameter_integral_"));
        }
        List<ParameterIntegral>  parameterIntegrals = parameterIntegralMapper.selectByExample(parameterIntegralExample); // 查询所有操作列表
        int total = parameterIntegralMapper.countByExample(parameterIntegralExample); // 查询总页数
        returnResult.setRows(parameterIntegrals);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * 
     * @Title: addparameterIntegral 
     * @Description: TODO(新增会员积分级别) 
     * @param  @param parameterIntegral
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "IntegralList_add")
    public Object addParameterIntegral(ParameterIntegral parameterIntegral) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterIntegralExample parameterIntegralExample = new ParameterIntegralExample();
        int count = 0;
        // 防止会员积分级别名称重复
        parameterIntegralExample.createCriteria().andIntegralNameEqualTo(parameterIntegral.getIntegralName());
        count = parameterIntegralMapper.countByExample(parameterIntegralExample);// 查找相同积分级别名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员积分级别名称重复");
            return returnResult;
        }
        parameterIntegral.setIntegralId(RandomGUID.getRandomGUID());
        parameterIntegral.setCreater(pricipalUser.getUserId());
        parameterIntegral.setCreateTime(new Date());
        count = parameterIntegralMapper.insert(parameterIntegral);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterIntegral.getIntegralName() + "] 会员积分级别信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员积分级别信息保存失败");
        }
        return returnResult;
    }
    /**
     * 
     * @Title: editParameterIntegral 
     * @Description: TODO(修改会员积分级别) 
     * @param  @param parameterIntegral
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    @MethodLog(opera="IntegralList_edit")
    public Object editParameterIntegral(ParameterIntegral parameterIntegral) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterIntegralExample parameterIntegralExample = new ParameterIntegralExample();
        int count = 0;
        // 防止会员积分级别名称重复
        parameterIntegralExample.createCriteria().andIntegralIdNotEqualTo(parameterIntegral.getIntegralId()).andIntegralNameEqualTo(parameterIntegral.getIntegralName());
        count = parameterIntegralMapper.countByExample(parameterIntegralExample);// 查找相同积分级别名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员积分级别名称重复，请重新填写!");
            return returnResult;
        }                               
        count = parameterIntegralMapper.updateByPrimaryKeySelective(parameterIntegral);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterIntegral.getIntegralName() + "] 会员积分级别信息已修改保存");
        } else {
            returnResult.setMsg("会员积分级别信息修改保存失败，请联系管理员!");
        }
        return returnResult;
    }
    /**
     * @Title: delAge 
     * @Description: TODO(删除会员积分级别) 
     * @param @param IntegralId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "IntegralList_del")
    public Object delIntegral(String IntegralId) {
    	ParameterIntegral Integral= parameterIntegralMapper.selectByPrimaryKey(IntegralId);
        int result = parameterIntegralMapper.deleteByPrimaryKey(IntegralId);//根据会员年龄别称Id，进行删除会员年龄别称
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        if (result == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + Integral.getIntegralName() + "] 会员年龄别称信息已删除");
        } else {
            returnResult.setMsg("会员年龄别称信息删除失败，请联系管理员!");
        }
		return returnResult;
     }
}
