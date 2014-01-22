/**
 * @Title: ResourcesController.java 
 * @Package com.glacier.netloan.web.controller.sysmgr 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-1-16 下午1:46:08 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-1-16
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.service.sysmgr.ActionService;
import com.glacier.netloan.service.sysmgr.MenuService;
import com.glacier.netloan.service.sysmgr.PanelService;

/**
 * @ClassName: ResourcesController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-1-16 下午1:46:08
 */
@Controller
@RequestMapping(value = "/res")
public class ResourcesController {

    @Autowired
    private MenuService menuService;// 注入菜单业务Bean
    
    @Autowired
    private PanelService panelService;// 注入面板业务Bean

    @Autowired
    private ActionService actionService;// 注入操作业务Bean
    
    //进入资源展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPage(String menuId) {
        ModelAndView mav = new ModelAndView("system_mgr/res_mgr/res");
        return mav;
    }

    // 获取当前用户授权菜单树
    @RequestMapping(value = "/menu/getPrincipalUserMenu.json", method = RequestMethod.POST)
    @ResponseBody
    private Object getPrincipalUserMenu() {
        return menuService.getPrincipalUserMenu();
    }
    
 // 获取菜单下的树结构的所有菜单数据
    @RequestMapping(value = "/menu/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listMenuAsTreeByMenuId() {
        return menuService.listAsTree();
    }
    
    // 获取菜单下的表格结构的所有面板数据
    @RequestMapping(value = "/panel/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listPanelAsGridByMenuId(String menuId,JqPager pager) {
        return panelService.listAsGrid(menuId,pager);
    }

    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/action/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByCondition(String menuId,String panelId,JqPager pager) {
        return actionService.listAsGrid(menuId,panelId,pager);
    }

}
