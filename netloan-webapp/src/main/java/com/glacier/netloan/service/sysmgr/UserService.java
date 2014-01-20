/**
 * @Title: UserService.java 
 * @Package com.glacier.netloan.service.sysmgr 
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
package com.glacier.netloan.service.sysmgr;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.netloan.entity.sysmgr.User;
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
        System.out.println(user);
    }
}
