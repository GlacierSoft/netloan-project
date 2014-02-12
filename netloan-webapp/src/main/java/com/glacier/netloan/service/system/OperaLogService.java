/**
 * @Title: OperaLogService.java 
 * @Package com.glacier.netloan.service.system 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-2-10 下午3:18:37 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-2-10
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
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
import com.glacier.netloan.dao.system.OperaLogMapper;
import com.glacier.netloan.entity.system.OperaLog;
import com.glacier.netloan.entity.system.OperaLogExample;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: OperaLogService
 * @Description: TODO(操作日志业务类)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-2-10 下午3:18:37
 */
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class OperaLogService {

    @Autowired
    private OperaLogMapper operaLogMapper;

    /**
     * 
     * @Title: listAsGrid
     * @Description: TODO(以表格结构展示操作日志列表)
     * @param @param pager
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@MethodLog(opera = "查询操作日志列表")
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        OperaLogExample OperaLogExample = new OperaLogExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
            OperaLogExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
            OperaLogExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
            OperaLogExample.setOrderByClause(pager.getOrderBy("temp_operalog_"));
        }
        List<OperaLog> OperaLogs = operaLogMapper.selectByExample(OperaLogExample); // 查询所有操作日志列表
        int total = operaLogMapper.countByExample(OperaLogExample); // 查询总页数
        returnResult.setRows(OperaLogs);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    /**
     * @Title: delOperaLog 
     * @Description: TODO(删除操作日志) 
     * @param  @param operalogId
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera="删除操作日志")
    public Object delOperaLog(String operalogId){
    	OperaLog operaLog = operaLogMapper.selectByPrimaryKey(operalogId);
    	int count = operaLogMapper.deleteByPrimaryKey(operalogId);//根据操作日志Id，进行删除
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	if(count == 1){
    		returnResult.setSuccess(true);
    		returnResult.setMsg("["+operaLog.getOperaMenu()+"]"+"操作日志信息已删除");
    	}else{
    		returnResult.setMsg("操作日志信息删除失败，请联系管理员!");
    	}
    	return returnResult;
    }
}
