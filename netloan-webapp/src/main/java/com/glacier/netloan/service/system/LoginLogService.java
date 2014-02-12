package com.glacier.netloan.service.system;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.system.LoginLogMapper;
import com.glacier.netloan.entity.system.LoginLog;
import com.glacier.netloan.entity.system.LoginLogExample;
import com.glacier.netloan.util.MethodLog;

@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
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
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@MethodLog(opera = "查询登录日志列表")
	public Object listAsGrid(JqPager pager){
		
		JqGridReturn returnResult = new JqGridReturn();
		LoginLogExample loginLogExample = new LoginLogExample();
		
		if(null != pager.getPage() && null != pager.getRows()){// 设置排序信息
			loginLogExample.setLimitStart((pager.getPage()-1)*pager.getRows());
			loginLogExample.setLimitEnd(pager.getRows());
		}
		if(StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())){// 设置排序信息
			loginLogExample.setOrderByClause(pager.getOrderBy("temp_loginlog_"));
		}
		List<LoginLog> loginLogs = loginLogMapper.selectByExample(loginLogExample);// 查询所有登录日志列表
		int total = loginLogMapper.countByExample(loginLogExample);// 查询总页数
		returnResult.setRows(loginLogs);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}
	
	/**
	 * @Title: delLoginLog 
	 * @Description: TODO(删除登录日志) 
	 * @param  @param loginlogId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@MethodLog(opera="删除登录日志")
	public Object delLoginLog(String loginlogId){
		LoginLog loginLog = loginLogMapper.selectByPrimaryKey(loginlogId);
		int count = loginLogMapper.deleteByPrimaryKey(loginlogId);//根据登录日志Id，进行删除
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		if(count == 1){
			returnResult.setMsg("["+loginLog.getLoginUser()+"]"+"登录日志信息已删除");
			returnResult.setSuccess(true);
		}else{
			returnResult.setMsg("登录日志信息删除失败，请联系管理员!");
		}
		return returnResult;
	}
}
