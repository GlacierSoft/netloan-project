/**
 * @Title: AuthorityController.java 
 * @Package com.glacier.netloan.web.controller.sysmgr 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-1-21 上午10:45:58 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-1-21
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.netloan.web.controller.sysmgr;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.netloan.service.sysmgr.AuthorityService;

/**
 * @ClassName: AuthorityController 
 * @Description: TODO(权限控制器，处理所有权限相关请求、权限资源获取) 
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-1-21 上午10:45:58
 */

@Controller
@RequestMapping(value = "/auth")
public class AuthorityController {
    
    @Autowired
    private AuthorityService authorityService;// 注入菜单业务Bean
    
    
    //根据角色Id获取面板操作权限
    @RequestMapping(value = "/getAuthsByRoleId.json")
    @ResponseBody
    public Object getAuthsByRoleId(@RequestParam String roleId) {
        return authorityService.getAuthsByRoleId(roleId);
    }

    /**
     * @Title: saveMenuActions
     * @Description: TODO(菜单操作关联)
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @RequestMapping(value = "/saveMenuActions", method = RequestMethod.POST)
    @ResponseBody
    public Object saveMenuActions(@RequestParam String roleId,@RequestParam Set<String> menuIds, @RequestParam Set<String> authActions) {
        return authorityService.saveRoleAuths(roleId, menuIds, authActions);
    }
}
