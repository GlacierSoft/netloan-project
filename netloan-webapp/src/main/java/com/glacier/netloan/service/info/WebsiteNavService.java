package com.glacier.netloan.service.info;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.jqueryui.util.Tree;
import com.glacier.netloan.dao.info.WebsiteNavMapper;
import com.glacier.netloan.entity.info.WebsiteNav;
import com.glacier.netloan.entity.info.WebsiteNavExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: WebsiteNavService 
 * @Description: TODO(网站导航业务类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-10下午5:09:28
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class WebsiteNavService {
	
	@Autowired
	private WebsiteNavMapper websiteNavMapper;
	
	public Object getNav(String webNavId) {
	    return websiteNavMapper.selectByPrimaryKey(webNavId);
	}
	
	   /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有导航信息) 
     * @param @param pnavr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "浏览导航信息")
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        WebsiteNavExample websiteNavExample = new WebsiteNavExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	websiteNavExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	websiteNavExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	websiteNavExample.setOrderByClause(pager.getOrderBy("temp_website_nav_"));
        }
        List<WebsiteNav> websiteNavs = websiteNavMapper.selectByExample(websiteNavExample); // 查询所有导航列表
        int total = websiteNavMapper.countByExample(websiteNavExample); // 查询总页数
        returnResult.setRows(websiteNavs);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    public Object listAsTree() {
        List<WebsiteNav> navList = websiteNavMapper.selectByExample(new WebsiteNavExample());
        return navList;
    }
    
    /**
     * @Title: addNav 
     * @Description: TODO(新增导航) 
     * @param @param nav
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "新增导航")
    public Object addNav(WebsiteNav nav) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteNavExample websiteNavExample = new WebsiteNavExample();
        int count = 0;
        // 防止导航名称重复
        websiteNavExample.createCriteria().andWebNavNameEqualTo(nav.getWebNavName());
        count = websiteNavMapper.countByExample(websiteNavExample);// 查找相同名称的导航数量
        if (count > 0) {
            returnResult.setMsg("导航名称重复，请重新填写!");
            return returnResult;
        }
        nav.setWebNavId(RandomGUID.getRandomGUID());
        nav.setCreater(pricipalUser.getUserId());
        nav.setCreateTime(new Date());
        count = websiteNavMapper.insert(nav);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + nav.getWebNavName() + "] 导航信息已保存");
        } else {
            returnResult.setMsg("导航信息保存失败，请联系管理员!");
        }
        return returnResult;
    }
    /**
     * 
     * @Title: getAllTreeNavNode
     * @Description: TODO(获取全部的导航数据组装成EasyUI树节点JSON)
     * @param @param virtualRoot 是否构建虚拟ROOT -> 系统导航作为导航
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    public String getAllTreeNavNode(boolean virtualRoot, String roleId) {

        List<Tree> items = new ArrayList<Tree>();
        if (virtualRoot) {
            Tree navItem = new Tree();// 增加总的树节点作为导航信息导航
            navItem.setId("ROOT");
            navItem.setText("导航信息");
            items.add(navItem);
        }
        WebsiteNavExample websiteNavExample = new WebsiteNavExample();
        websiteNavExample.setOrderByClause("temp_website_nav.web_nav_num asc");
        List<WebsiteNav> navList = websiteNavMapper.selectByExample(websiteNavExample);
        if (null != navList && navList.size() > 0) {
            for (WebsiteNav nav : navList) {
                Tree item = new Tree();// 将查询到的导航记录某些属性值设置在ComboTreeItem中，用于页面的ComboTree的数据绑定
                item.setId(nav.getWebNavId());
                item.setText(nav.getWebNavName());
                if (StringUtils.isNotBlank(nav.getWebNavPid())) {
                    item.setPid(nav.getWebNavPid());
                } else if (virtualRoot) {
                    item.setPid("ROOT");// 如果父节点为空说明上一级为总节点
                }

                items.add(item);
            }
        }
        return JackJson.fromObjectToJson(items);
    }
    
    /**
     * @Title: editNav 
     * @Description: TODO(修改导航) 
     * @param @param nav
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "修改导航")
    public Object editNav(WebsiteNav nav) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteNavExample websiteNavExample = new WebsiteNavExample();
        int count = 0;
        // 防止导航名称重复
        websiteNavExample.createCriteria().andWebNavIdNotEqualTo(nav.getWebNavId()).andWebNavNameEqualTo(nav.getWebNavName());
        count = websiteNavMapper.countByExample(websiteNavExample);// 查找相同中文名称的导航数量
        if (count > 0) {
            returnResult.setMsg("导航名称重复，请重新填写!");
            return returnResult;
        }
        count = websiteNavMapper.updateByPrimaryKeySelective(nav);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + nav.getWebNavName() + "] 导航信息已修改");
        } else {
            returnResult.setMsg("导航信息修改失败，请联系管理员!");
        }
        return returnResult;
    }
    
    /**
     * @Title: delNav 
     * @Description: TODO(删除导航) 
     * @param @param navId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "删除导航")
    public Object delNav(String navId) {
    	WebsiteNav nav= websiteNavMapper.selectByPrimaryKey(navId);
        int result = websiteNavMapper.deleteByPrimaryKey(navId);//根据导航Id，进行删除导航
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        if (result == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + nav.getWebNavName() + "] 导航信息已删除");
        } else {
            returnResult.setMsg("导航信息删除失败，请联系管理员!");
        }
		return returnResult;
     }
}
