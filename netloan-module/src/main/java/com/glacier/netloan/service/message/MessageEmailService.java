/*
 * @(#)WebsiteAdvertisementService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.message;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dao.email.MessageEmailMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.entity.email.MessageEmail;
import com.glacier.netloan.entity.email.MessageEmailExample;
import com.glacier.netloan.entity.website.WebsiteAdvertisement;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: WebsiteAdvertisementService 
 * @Description: TODO(广告业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MessageEmailService {

	@Autowired
    private MessageEmailMapper messageEmailMapper;

	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getAdvertisement 
	 * @Description: TODO(根据广告Id获取广告信息) 
	 * @param @param webAdvId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    @Transactional(readOnly = false)
    public Object getAdvertisement(String webAdvId) {
    	MessageEmail messageEmail = messageEmailMapper.selectByPrimaryKey(webAdvId);
    	return messageEmail;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有广告信息) 
     * @param @param padvertisementr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager padvertisementr) {
        JqGridReturn returnResult = new JqGridReturn();
        MessageEmailExample messageEmailExample = new MessageEmailExample();
        if (null != padvertisementr.getPage() && null != padvertisementr.getRows()) {// 设置排序信息
        	messageEmailExample.setLimitStart((padvertisementr.getPage() - 1) * padvertisementr.getRows());
        	messageEmailExample.setLimitEnd(padvertisementr.getRows());
        }
        if (StringUtils.isNotBlank(padvertisementr.getSort()) && StringUtils.isNotBlank(padvertisementr.getOrder())) {// 设置排序信息
        	messageEmailExample.setOrderByClause(padvertisementr.getOrderBy("temp_website_advertisement_"));
        }
        List<MessageEmail>  websiteAdvertisements = messageEmailMapper.selectByExample(messageEmailExample); // 查询所有广告列表
        int total = messageEmailMapper.countByExample(messageEmailExample); // 查询总页数
        returnResult.setRows(websiteAdvertisements);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addAdvertisement 
     * @Description: TODO(新增广告) 
     * @param @param advertisement
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "AdvertisementList_add")
    public Object addAdvertisement(WebsiteAdvertisement advertisement) {
        
        return null;
    }
    
    
}
