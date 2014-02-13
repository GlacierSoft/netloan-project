/*
 * @(#)WebsiteNewsService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.website;

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
import com.glacier.netloan.dao.website.WebsiteNewsMapper;
import com.glacier.netloan.entity.website.WebsiteNews;
import com.glacier.netloan.entity.website.WebsiteNewsExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: WebsiteNewsService 
 * @Description: TODO(新闻业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class WebsiteNewsService {

	@Autowired
    private WebsiteNewsMapper newsMapper;

    public Object getNews(String webNewsId) {
        return newsMapper.selectByPrimaryKey(webNewsId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有新闻信息) 
     * @param @param pnewsr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "浏览新闻")
    public Object listAsGrid(JqPager pnewsr) {

        JqGridReturn returnResult = new JqGridReturn();
        WebsiteNewsExample websiteNewsExample = new WebsiteNewsExample();

        if (null != pnewsr.getPage() && null != pnewsr.getRows()) {// 设置排序信息
        	websiteNewsExample.setLimitStart((pnewsr.getPage() - 1) * pnewsr.getRows());
        	websiteNewsExample.setLimitEnd(pnewsr.getRows());
        }
        if (StringUtils.isNotBlank(pnewsr.getSort()) && StringUtils.isNotBlank(pnewsr.getOrder())) {// 设置排序信息
        	websiteNewsExample.setOrderByClause(pnewsr.getOrderBy("temp_website_news_"));
        }
        List<WebsiteNews>  websiteNewss = newsMapper.selectByExample(websiteNewsExample); // 查询所有新闻列表
        int total = newsMapper.countByExample(websiteNewsExample); // 查询总页数
        returnResult.setRows(websiteNewss);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addNews 
     * @Description: TODO(新增新闻) 
     * @param @param news
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "新增新闻")
    public Object addNews(WebsiteNews news) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteNewsExample newsExample = new WebsiteNewsExample();
        int count = 0;
        // 防止新闻名称重复
        newsExample.createCriteria().andWebNewsThemeEqualTo(news.getWebNewsTheme());
        count = newsMapper.countByExample(newsExample);// 查找相同中文名称的新闻数量
        if (count > 0) {
            returnResult.setMsg("新闻重复，请重新填写!");
            return returnResult;
        }
        news.setWebNewsId(RandomGUID.getRandomGUID());
        news.setCreater(pricipalUser.getUserId());
        news.setCreateTime(new Date());
        count = newsMapper.insert(news);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + news.getWebNewsTheme() + "] 新闻信息已保存");
        } else {
            returnResult.setMsg("新闻信息保存失败，请联系管理员!");
        }
        return returnResult;
    }
    
    /**
     * @Title: editNews 
     * @Description: TODO(修改新闻) 
     * @param @param news
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "修改新闻")
    public Object editNews(WebsiteNews news) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        WebsiteNewsExample newsExample = new WebsiteNewsExample();
        int count = 0;
        // 防止新闻名称重复
        newsExample.createCriteria().andWebNewsIdNotEqualTo(news.getWebNewsId()).andWebNewsThemeEqualTo(news.getWebNewsTheme());
        count = newsMapper.countByExample(newsExample);// 查找相同中文名称的新闻数量
        if (count > 0) {
            returnResult.setMsg("新闻名称重复，请重新填写!");
            return returnResult;
        }
        count = newsMapper.updateByPrimaryKeySelective(news);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + news.getWebNewsTheme() + "] 新闻信息已修改");
        } else {
            returnResult.setMsg("新闻信息修改失败，请联系管理员!");
        }
        return returnResult;
    }
    
    /**
     * @Title: delNews 
     * @Description: TODO(删除新闻) 
     * @param @param newsId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "删除新闻")
    public Object delNews(String webNewsId) {
    	WebsiteNews news= newsMapper.selectByPrimaryKey(webNewsId);
        int result = newsMapper.deleteByPrimaryKey(webNewsId);//根据新闻Id，进行删除新闻
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        if (result == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + news.getWebNewsTheme() + "] 新闻信息已删除");
        } else {
            returnResult.setMsg("新闻信息删除失败，请联系管理员!");
        }
		return returnResult;
     }
}