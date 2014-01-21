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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.netloan.service.sysmgr.MenuService;

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
    private MenuService menuService;// 注入菜单业务Bean
    
    
    //根据角色Id获取面板操作权限
    @RequestMapping(value = "/getPAAuthByCondition.json")
    @ResponseBody
    public Object getPAAuthByCondition(@RequestParam String roleId) {
        return menuService.getAuthsByRoleId(roleId);
    }

}
