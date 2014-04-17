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

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.basicdatas.ParameterQuestionMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.entity.basicdatas.ParameterQuestion;
import com.glacier.netloan.entity.basicdatas.ParameterQuestionExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: ParameterQuestionService 
 * @Description: TODO(会员密保的问题业务类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-4-15下午5:22:26
 */
@Service
@Transactional(readOnly= true ,propagation= Propagation.REQUIRED)
public class ParameterQuestionService {
	
	@Autowired
	private ParameterQuestionMapper parameterQuestionMapper;
	
	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getQuestion 
	 * @Description: TODO(根据会员密保问题id进行查询) 
	 * @param  @param questionId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	public Object getQuestion(String questionId){
		ParameterQuestion parameterQuestion = parameterQuestionMapper.selectByPrimaryKey(questionId);
        return parameterQuestion;
	}
	
	/**
     * 
     * @Title: listAsGrid
     * @Description: TODO(以表格结构展示密保问题信息列表)
     * @param @param menuId 动作对应的菜单Id
     * @param @param pager 分页参数
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        ParameterQuestionExample parameterQuestionExample = new ParameterQuestionExample();
        
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	parameterQuestionExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	parameterQuestionExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	parameterQuestionExample.setOrderByClause(pager.getOrderBy("temp_parameter_question_"));
        }
        List<ParameterQuestion>  parameterQuestions = parameterQuestionMapper.selectByExample(parameterQuestionExample); // 查询所有操作列表
        int total = parameterQuestionMapper.countByExample(parameterQuestionExample); // 查询总页数
        returnResult.setRows(parameterQuestions);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * 
     * @Title: addparameterQuestion 
     * @Description: TODO(新增会员密保问题) 
     * @param  @param parameterQuestion
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "QuestionList_add")
    public Object addParameterQuestion(ParameterQuestion parameterQuestion) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterQuestionExample parameterQuestionExample = new ParameterQuestionExample();
        int count = 0;
        // 防止密保问题信息名称重复
        parameterQuestionExample.createCriteria().andQuestionDesEqualTo(parameterQuestion.getQuestionDes());
        count = parameterQuestionMapper.countByExample(parameterQuestionExample);// 查找相同信用等级名称的会员数量
        if (count > 0) {
            returnResult.setMsg("密保问题名称重复");
            return returnResult;
        }
        parameterQuestion.setQuestionId(RandomGUID.getRandomGUID());
        parameterQuestion.setCreater(pricipalUser.getUserId());
        parameterQuestion.setCreateTime(new Date());
        parameterQuestion.setUpdater(pricipalUser.getUserId());
        parameterQuestion.setUpdateTime(new Date());
        count = parameterQuestionMapper.insert(parameterQuestion);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterQuestion.getQuestionDes() + "] 密保问题信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，密保问题信息保存失败");
        }
        return returnResult;
    }
    /**
     * 
     * @Title: editParameterQuestion 
     * @Description: TODO(修改密保问题信息) 
     * @param  @param parameterQuestion
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    @MethodLog(opera="QuestionList_edit")
    public Object editParameterQuestion(ParameterQuestion parameterQuestion) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterQuestionExample parameterQuestionExample = new ParameterQuestionExample();
        int count = 0;
        // 防止密保问题信息名称重复
        parameterQuestionExample.createCriteria().andQuestionIdNotEqualTo(parameterQuestion.getQuestionId()).andQuestionDesEqualTo(parameterQuestion.getQuestionDes());
        count = parameterQuestionMapper.countByExample(parameterQuestionExample);// 查找相同信用等级名称的会员数量
        if (count > 0) {
            returnResult.setMsg("密保问题信息名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        parameterQuestion.setUpdater(pricipalUser.getUserId());
        parameterQuestion.setUpdateTime(new Date());
        count = parameterQuestionMapper.updateByPrimaryKeySelective(parameterQuestion);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterQuestion.getQuestionDes() + "] 密保问题信息信息已变更");
        } else {
            returnResult.setMsg("发生未知错误，密保问题信息信息修改保存失败");
        }
        return returnResult;
    }
    /**
     * @Title: delAge 
     * @Description: TODO(删除密保问题信息) 
     * @param @param questionId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "QuestionList_del")
    public Object delQuestion(List<String> questionIds ,List<String> questionDess) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	int count = 0;
    	if(questionIds.size() >0){
    		ParameterQuestionExample parameterQuestionExample = new ParameterQuestionExample();
        	parameterQuestionExample.createCriteria().andQuestionIdIn(questionIds);
        	count = parameterQuestionMapper.deleteByExample(parameterQuestionExample);
    		if(count >0){
        		returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(questionDess, ",") + " ]操作");
        		returnResult.setSuccess(true);
        	}else{
        		returnResult.setMsg("发生未知错误，密保问题信息删除失败");
        	}
    	}
		return returnResult;
     }
    
   /* public Object listQuestions(){
    	ParameterQuestionExample parameterQuestionExample = new ParameterQuestionExample();
    	JqPager pager = new JqPager();
    	pager.setSort("creditNum");
    	pager.setOrder("DESC");
    	parameterQuestionExample.setOrderByClause(pager.getOrderBy("temp_parameter_credit_"));
    	List<ParameterQuestion>  parameterQuestions = parameterQuestionMapper.selectByExample(parameterQuestionExample); // 查询所有操作列表
        
        return parameterQuestions;
    }*/
}
