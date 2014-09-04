/*
 * @(#)MessageRecordService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.email;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dao.email.MessageRecordMapper;
import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dto.query.email.MessageRecordQueryDTO;
import com.glacier.netloan.entity.email.MessageRecord;
import com.glacier.netloan.entity.email.MessageRecordExample;
import com.glacier.netloan.entity.email.MessageRecordExample.Criteria;
import com.glacier.netloan.service.member.MemberService;

/** 
 * @ClassName: MessageRecordService 
 * @Description: TODO(活动邮件记录业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MessageRecordService {

	@Autowired
    private MemberService memberService;
	
	@Autowired
    private MemberMapper memberMapper;
	
	@Autowired
	private MessageRecordMapper messageRecordMapper;
	
	/**
	 * @Title: getRecord 
	 * @Description: TODO(根据活动邮件Id获取活动邮件记录) 
	 * @param @param recordId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    @Transactional(readOnly = false)
    public Object getRecordList(String emailId) {
    	MessageRecordExample messageRecordExample = new MessageRecordExample();
    	messageRecordExample.createCriteria().andEmailIdEqualTo(emailId);
    	List<MessageRecord> messageRecordList = messageRecordMapper.selectByExample(messageRecordExample);
    	return messageRecordList;
    }
	
	/**
	 * @Title: getRecord 
	 * @Description: TODO(根据活动邮件记录Id获取活动邮件) 
	 * @param @param recordId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    @Transactional(readOnly = false)
    public Object getRecord(String recordId) {
    	MessageRecord messageRecord = messageRecordMapper.selectByPrimaryKey(recordId);
    	return messageRecord;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有活动邮件记录信息) 
     * @param @param precordr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(MessageRecordQueryDTO messageRecordQueryDTO,JqPager precordr) {
        JqGridReturn returnResult = new JqGridReturn();
        MessageRecordExample messageRecordExample = new MessageRecordExample();
        
        Criteria queryCriteria = messageRecordExample.createCriteria();
        messageRecordQueryDTO.setQueryConditions(queryCriteria);
        
        if (null != precordr.getPage() && null != precordr.getRows()) {// 设置排序信息
        	messageRecordExample.setLimitStart((precordr.getPage() - 1) * precordr.getRows());
        	messageRecordExample.setLimitEnd(precordr.getRows());
        }
        if (StringUtils.isNotBlank(precordr.getSort()) && StringUtils.isNotBlank(precordr.getOrder())) {// 设置排序信息
        	messageRecordExample.setOrderByClause(precordr.getOrderBy("temp_message_record_"));
        }
        List<MessageRecord>  MessageRecords = messageRecordMapper.selectByExample(messageRecordExample); // 查询所有广告列表
        int total = messageRecordMapper.countByExample(messageRecordExample); // 查询总页数
        returnResult.setRows(MessageRecords);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    
}
