/*
 * @(#)ParameterAreaService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.basicdatas;

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
import com.glacier.netloan.dao.basicdatas.ParameterAreaMapper;
import com.glacier.netloan.entity.basicdatas.ParameterArea;
import com.glacier.netloan.entity.basicdatas.ParameterAreaExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: ParameterAreaService 
 * @Description: TODO(地区业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterAreaService {

	@Autowired
    private ParameterAreaMapper areaMapper;
	
    public Object getArea(String areaId) {
        return areaMapper.selectByPrimaryKey(areaId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有地区信息) 
     * @param @param parear
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "浏览地区")
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        ParameterAreaExample parameterAreaExample = new ParameterAreaExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	parameterAreaExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	parameterAreaExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	parameterAreaExample.setOrderByClause(pager.getOrderBy("temp_parameter_area_"));
        }
        List<ParameterArea>  parameterAreas = areaMapper.selectByExample(parameterAreaExample); // 查询所有地区列表
        int total = areaMapper.countByExample(parameterAreaExample); // 查询总页数
        returnResult.setRows(parameterAreas);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    public Object listAsTree() {
        List<ParameterArea> areaList = areaMapper.selectByExample(new ParameterAreaExample());
        return areaList;
    }

    
    /**
     * @Title: addArea 
     * @Description: TODO(新增地区) 
     * @param @param area
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "新增地区")
    public Object addArea(ParameterArea area) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterAreaExample areaExample = new ParameterAreaExample();
        int count = 0;
        // 防止地区名称重复
        areaExample.createCriteria().andAreaNameEqualTo(area.getAreaName());
        count = areaMapper.countByExample(areaExample);// 查找相同中文名称的地区数量
        if (count > 0) {
            returnResult.setMsg("地区重复，请重新填写!");
            return returnResult;
        }
        area.setAreaId(RandomGUID.getRandomGUID());
        if (area.getAreaPid().equals("ROOT") || area.getAreaPid().equals("")) {// 如果父级地区的Id为"ROOT"或为空，则将父级地区的值设置为null保存到数据库
        	area.setAreaPid(null);
        }
        area.setCreater(pricipalUser.getUserId());
        area.setCreateTime(new Date());
        count = areaMapper.insert(area);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + area.getAreaName() + "] 地区信息已保存");
        } else {
            returnResult.setMsg("地区信息保存失败，请联系管理员!");
        }
        return returnResult;
    }
    
    /**
     * 
     * @Title: getAllTreeAreaNode
     * @Description: TODO(获取全部的地区数据组装成EasyUI树节点JSON)
     * @param @param virtualRoot 是否构建虚拟ROOT -> 系统地区作为导航
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    public String getAllTreeAreaNode(boolean virtualRoot) {

        List<Tree> items = new ArrayList<Tree>();
        if (virtualRoot) {
            Tree areaItem = new Tree();// 增加总的树节点作为地区导航
            areaItem.setId("ROOT");
            areaItem.setText("地区");
            items.add(areaItem);
        }
        ParameterAreaExample areaExample = new ParameterAreaExample();
        areaExample.setOrderByClause("temp_parameter_area.area_num asc");
        List<ParameterArea> areaList = areaMapper.selectByExample(areaExample);
        if (null != areaList && areaList.size() > 0) {
            for (ParameterArea area : areaList) {
                Tree item = new Tree();// 将查询到的地区记录某些属性值设置在ComboTreeItem中，用于页面的ComboTree的数据绑定
                item.setId(area.getAreaId());
                item.setText(area.getAreaName());
                if (StringUtils.isNotBlank(area.getAreaPid())) {
                    item.setPid(area.getAreaPid());
                } else if (virtualRoot) {
                    item.setPid("ROOT");// 如果父节点为空说明上一级为总节点
                }
                items.add(item);
            }
        }
        return JackJson.fromObjectToJson(items);
    }
    
    /**
     * @Title: editArea 
     * @Description: TODO(修改地区) 
     * @param @param area
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "修改地区")
    public Object editArea(ParameterArea area) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterAreaExample areaExample = new ParameterAreaExample();
        int count = 0;
        // 防止地区名称重复
        areaExample.createCriteria().andAreaIdNotEqualTo(area.getAreaId()).andAreaNameEqualTo(area.getAreaName());
        count = areaMapper.countByExample(areaExample);// 查找相同中文名称的地区数量
        if (count > 0) {
            returnResult.setMsg("地区名称重复，请重新填写!");
            return returnResult;
        }
//        List<String> retrunAreaList = new ArrayList<String>();// 修改上级所属地区时，禁止选择地区本身及子级地区作为地区的父级地区
//        retrunAreaList = getAreaChild(area.getAreaId(), retrunAreaList);// 查找地区本身及子级地区
//        retrunAreaList.add(area.getAreaId());
//        if (retrunAreaList.contains(area.getAreaId())) {// 如果用户是选择地区本身及子级地区作为地区的父级地区，则返回错误提示信息
//            return "禁止选择地区本身及子级地区作为父级地区";
//        }
        if (area.getAreaPid().equals("ROOT") || area.getAreaPid().equals("")) {// 如果父级地区的Id为"ROOT"或为空，则将父级地区的值设置为null保存到数据库
        	area.setAreaPid(null);
        }
        ParameterArea oldArea = areaMapper.selectByPrimaryKey(area.getAreaId()) ;
        area.setCreater(oldArea.getCreater());
        area.setCreateTime(oldArea.getCreateTime());
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        area.setUpdater(pricipalUser.getUserId());
        area.setUpdateTime(new Date());
        count = areaMapper.updateByPrimaryKey(area);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + area.getAreaName() + "] 地区信息已修改");
        } else {
            returnResult.setMsg("地区信息修改失败，请联系管理员!");
        }
        return returnResult;
    }
    
    /**
     * @Title: getAreaChild
     * @Description: TODO(递归获取地区和地区子节点)
     * @param @param areaId 要获取的当前地区
     * @param @param retrunAreaList 返回的所有地区信息
     * @param @return 设定文件
     * @return List<String> 返回类型
     * @throws
     */
/*    private List<String> getAreaChild(String areaId, List<String> retrunAreaList) {
    	ParameterAreaExample areaExample = new ParameterAreaExample();
    	areaExample.createCriteria().andAreaIdEqualTo(areaId);// 查询子地区
        List<ParameterArea> areaList = areaMapper.selectByExample(areaExample);
        if (areaList.size() > 0) {// 如果存在子地区则遍历
            for (ParameterArea area : areaList) {
                this.getAreaChild(area.getAreaId(), retrunAreaList);// 递归查询是否存在子地区
            }
        }
        retrunAreaList.add(areaId);
        return retrunAreaList;
    }*/
    
    /**
     * @Title: delArea 
     * @Description: TODO(删除地区) 
     * @param @param areaId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "删除地区")
    public Object delArea(String areaId) {
    	ParameterArea area= areaMapper.selectByPrimaryKey(areaId);
        int result = areaMapper.deleteByPrimaryKey(areaId);//根据地区Id，进行删除地区
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        if (result == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + area.getAreaName() + "] 地区信息已删除");
        } else {
            returnResult.setMsg("地区信息删除失败，请联系管理员!");
        }
		return returnResult;
     }
}
