/**
 * @Title: ResourcesController.java 
 * @Package com.glacier.netloan.web.controller.system 
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
package com.glacier.netloan.web.controller.system;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.entity.system.Action;
import com.glacier.netloan.entity.system.Menu;
import com.glacier.netloan.entity.system.Panel;
import com.glacier.netloan.service.system.ActionService;
import com.glacier.netloan.service.system.MenuService;
import com.glacier.netloan.service.system.PanelService;

/**
 * @ClassName: ResourcesController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-1-16 下午1:46:08
 */
@Controller
@RequestMapping(value = "/res")
public class ResourcesController extends AbstractController{

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
    
    // 进入菜单Form表单页面
    @RequestMapping(value = "/menu/intoForm.htm")
    private Object intoMenuFormPage() {
        ModelAndView mav = new ModelAndView("system_mgr/res_mgr/menu_form");
        mav.addObject("allMenuTreeNodeData", menuService.getAllTreeMenuNode(true,""));
        return mav;
    }
    
    // 进入操作Form表单页面
    @RequestMapping(value = "/action/intoForm.htm")
    private Object intoActionFormPage() {
        ModelAndView mav = new ModelAndView("system_mgr/res_mgr/action_form");
        mav.addObject("allMenuTreeNodeData", menuService.getAllTreeMenuNode(false,""));
        return mav;
    }

    // 查看详细页面
    @RequestMapping(value = "/menu/intoDetails.htm")
    private Object intoDetailsPage() {
        ModelAndView mav = new ModelAndView("system_mgr/res_mgr/menu_details");
        return mav;
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

    // 增加菜单
    @RequestMapping(value = "/menu/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addMenu(@Valid Menu menu, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return menuService.addMenu(menu);
    }
    
    // 增加面板
    @RequestMapping(value = "/panel/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addPanel(@Valid Panel panel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return panelService.addPanel(panel);
    }
    
    // 增加操作
    @RequestMapping(value = "/action/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addAction(@Valid Action action, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return actionService.addAction(action);
    }

    // 修改菜单
    @RequestMapping(value = "/menu/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editMenu(@Valid Menu menu, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return menuService.editMenu(menu);
    }
    
    // 修改面板
    @RequestMapping(value = "/panel/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editPanel(@Valid Panel panel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return panelService.editPanel(panel);
    }
    
    //修改操作
    @RequestMapping(value = "/action/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editAction(@Valid Action action, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return actionService.editAction(action);
    }
    
    //删除菜单
    @RequestMapping(value = "/menu/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delMenu(Menu menu) {
        return menuService.delMenu(menu);
    }
    
    
    //删除操作
    @RequestMapping(value = "/action/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delActions(@RequestParam List<String> actionIds,@RequestParam List<String> actionCnNames) {
        return actionService.delActions(actionIds,actionCnNames);
    }
    
    
    @RequestMapping(value = "/panel/getPanelsByMenuId.json", method = RequestMethod.POST)
    @ResponseBody
    public Object getPanelsByMenuId(String menuId) {
        return panelService.getPanelsByMenuId(menuId);
    }

}
