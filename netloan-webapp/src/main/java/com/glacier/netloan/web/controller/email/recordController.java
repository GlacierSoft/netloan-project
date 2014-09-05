/*
 * @(#)MessageRecordController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.email;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.email.MessageRecordQueryDTO;
import com.glacier.netloan.service.email.MessageRecordService;

/** 
 * @ClassName: MessageRecordController 
 * @Description: TODO(活动邮件记录的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/record")
public class recordController extends AbstractController{

	@Autowired
	private MessageRecordService messageRecordService; 
	
    // 进入活动邮件记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPemail() {
        ModelAndView mav = new ModelAndView("message_mgr/record_mgr/record");
        return mav;
    }
    
    // 获取表格结构的所有活动邮件记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listRecordAsGridByMenuId(MessageRecordQueryDTO messageRecordQueryDTO,JqPager precordr) {
        return messageRecordService.listAsGrid(messageRecordQueryDTO,precordr);
    }
    
    // 进入活动邮件记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoRecordDetailPage(String recordId) {
        ModelAndView mav = new ModelAndView("message_mgr/record_mgr/record_detail");
        if(StringUtils.isNotBlank(recordId)){
            mav.addObject("recordData", messageRecordService.getRecord(recordId));
        }
        return mav;
    }
}
