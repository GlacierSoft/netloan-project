/**
 * @Title: UserService.java 
 * @Package com.glacier.netloan.service.system 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-1-8 下午2:51:30 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-1-8
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.netloan.service.system;

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
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
import com.glacier.netloan.util.MethodLog;
import com.glacier.security.util.Digests;
import com.glacier.security.util.Encodes;

/**
 * @ClassName: UserService 
 * @Description: TODO(用户业务实现) 
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-1-8 下午2:51:30
 */
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class UserService {
    
	@Autowired
	private UserMapper userMapper;
	
    /**
     * 加密方式
     */
    public static final String HASH_ALGORITHM = "SHA-1";

    /**
     * 计算次数
     */
    public static final int HASH_INTERATIONS = 1024;

    /**
     * 盐值长度
     */
    public static final int SALT_SIZE = 8;
    
    /**
     * 设定盐值和设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
     */
    private void entryptPassword(User user) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        user.setSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(user.getPassword().getBytes(), salt, HASH_INTERATIONS);
        user.setPassword(Encodes.encodeHex(hashPassword));
    }
    
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        UserService userService = new UserService();
        userService.entryptPassword(user);
    }
    
    /**
     * @Title: getUser 
     * @Description: TODO(通过主键userId查询用户) 
     * @param  @param userId
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    public Object getUser(String userId){
    	return userMapper.selectByPrimaryKey(userId);
    }
    /**
     * @Title: listAsGrid 
     * @Description: TODO(分页浏览用户列表) 
     * @param  @param pager
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    @Transactional(readOnly = false , propagation = Propagation.REQUIRED)
    @MethodLog(opera = "分页查询用户列表")
    public Object listAsGrid(JqPager pager){
    	JqGridReturn returnResulte = new JqGridReturn();
    	UserExample userExample = new UserExample();
    	if(null != pager.getPage() && null != pager.getRows()){// 设置排序信息
    		userExample.setLimitStart((pager.getPage()-1) * pager.getRows());
    		userExample.setLimitEnd(pager.getRows());
    	}
    	if(StringUtils.isNotBlank(pager.getOrder()) && StringUtils.isNotBlank(pager.getSort())){// 设置排序信息
    		userExample.setOrderByClause(pager.getOrderBy("temp_user_"));
    	}
    	List<User> users = userMapper.selectByExample(userExample);
    	int total = userMapper.countByExample(userExample);
    	returnResulte.setRows(users);
    	returnResulte.setTotal(total);
    	return returnResulte;
    }
    
    @Transactional(readOnly = false , propagation = Propagation.REQUIRED)
    @MethodLog(opera="增加用户")
    public Object addUser(User user){
    	Subject pricipalSubject = SecurityUtils.getSubject();
    	User pricipalUser = (User) pricipalSubject.getPrincipal();
    	
    	JqReturnJson returnResulte = new JqReturnJson();// 构建返回结果，默认结果为false
    	UserExample userExample = new UserExample();
    	int count = 0;
    	// 防止用户名称重复
    	userExample.createCriteria().andUsernameEqualTo(user.getUsername());
    	count = userMapper.countByExample(userExample);// 查找相同用户名称数量
    	if(count >0){
    		returnResulte.setMsg("用户名称重复，请重新填写!");
    		return returnResulte;
    	}
    	user.setUserId(RandomGUID.getRandomGUID());
    	user.setCreateTime(new Date());
    	user.setStatus("able");
    	user.setBuiltin("notBuiltin");
    	user.setCreater(pricipalUser.getUserId());
    	user.setLastLoginTime(new Date());
    	count = userMapper.insert(user);
		if(count == 1){
			returnResulte.setMsg("["+user.getUsername()+"]"+"用户信息已保存");
			returnResulte.setSuccess(true);
		}else{
			returnResulte.setMsg("用户信息保存失败，请联系管理员!");
		}
    	return returnResulte;
    }
    
    /**
     * @Title: editUser 
     * @Description: TODO(修改用户信息) 
     * @param  @param user
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    @Transactional(readOnly = false , propagation = Propagation.REQUIRED)
    @MethodLog(opera = "修改用户信息")
    public Object editUser(User user){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	UserExample userExample = new UserExample();
    	// 防止用户名称重复
    	userExample.createCriteria().andUsernameEqualTo(user.getUsername()).andUserIdNotEqualTo(user.getUserId());
    	int count = 0;
    	count = userMapper.countByExample(userExample);// 查找相同用户名称数量
    	if(count > 0){
    		returnResult.setMsg("用户名称重复，请重新填写!");
    		return returnResult;
    	}
    	count = userMapper.updateByPrimaryKeySelective(user);
    	if(count == 1){
    		returnResult.setMsg("["+user.getUsername()+"]"+"用户信息已修改");
    		returnResult.setSuccess(true);
    	}else{
    		returnResult.setMsg("用户信息修改失败，请联系管理员!");
    	}
    	return returnResult;
    }
    
    /**
     * @Title: delUser 
     * @Description: TODO(删除用户信息) 
     * @param  @param userId
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     */
    @Transactional(readOnly = false , propagation = Propagation.REQUIRED)
    @MethodLog(opera = "删除用户信息")
    public Object delUser(String userId){
    	User user = userMapper.selectByPrimaryKey(userId);
    	JqReturnJson returnResulte = new JqReturnJson();// 构建返回结果，默认结果为false
    	int count = userMapper.deleteByPrimaryKey(userId);//根据用户Id，进行删除用户
    	if(count == 1){
    		returnResulte.setMsg("["+user.getUsername()+"]"+"用户信息已删除");
    		returnResulte.setSuccess(true);
    	}else{
    		returnResulte.setMsg("用户信息删除失败，请联系管理员!");
    	}
    	return returnResulte;
    }
}
