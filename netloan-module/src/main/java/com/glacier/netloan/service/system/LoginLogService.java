package com.glacier.netloan.service.system;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.system.LoginLogMapper;
import com.glacier.netloan.dto.query.system.LoginlogQueryDTO;
import com.glacier.netloan.entity.system.LoginLog;
import com.glacier.netloan.entity.system.LoginLogExample;
import com.glacier.netloan.entity.system.LoginLogExample.Criteria;
import com.glacier.netloan.util.MethodLog;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class LoginLogService {
	
	@Autowired
	private LoginLogMapper loginLogMapper;
	
	/**
	 * @Title: listAsGrid 
	 * @Description: TODO(以表格结构展示登录日志列表) 
	 * @param  @param pager
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 */
	public Object listAsGrid(LoginlogQueryDTO loginlogQueryDTO,JqPager pager){
		JqGridReturn returnResult = new JqGridReturn();
		LoginLogExample loginLogExample = new LoginLogExample();
		Criteria queryCriteria = loginLogExample.createCriteria();
		loginlogQueryDTO.setQueryCondition(queryCriteria);
		if(null != pager.getPage() && null != pager.getRows()){// 设置排序信息
			loginLogExample.setLimitStart((pager.getPage()-1)*pager.getRows());
			loginLogExample.setLimitEnd(pager.getRows());
		}
		if(StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())){// 设置排序信息
			loginLogExample.setOrderByClause(pager.getOrderBy("temp_loginlog_"));
		}
		// 高级检索
		List<LoginLog> loginLogs = loginLogMapper.selectByExample(loginLogExample);// 查询所有登录日志列表
		int total = loginLogMapper.countByExample(loginLogExample);// 查询总页数
		returnResult.setRows(loginLogs);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}
	
	/**
	 * @Title: getLoginLog 
	 * @Description: TODO(根据d登录日志的id进行查询) 
	 * @param  @param creditId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	public Object getLoginLog(String loginlogId){
		LoginLog loginLog = loginLogMapper.selectByPrimaryKey(loginlogId);
        return loginLog;
	}
	
	/**
	 * @Title: delLoginLog 
	 * @Description: TODO(删除登录日志) 
	 * @param  @param loginlogId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera="LoginlogList_del")
	public Object delLoginLog(List<String> loginlogIds , List<String> loginUsers){
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if(loginlogIds.size() > 0){
			LoginLogExample loginLogExample = new LoginLogExample();
			loginLogExample.createCriteria().andLoginlogIdIn(loginlogIds);
			count = loginLogMapper.deleteByExample(loginLogExample);
			if(count >0){
				returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(loginUsers, ",") + " ]操作");
				returnResult.setSuccess(true);
			}else{
				returnResult.setMsg("发生未知错误，登录日志信息删除失败");
			}
		}
		return returnResult;
	}
}
