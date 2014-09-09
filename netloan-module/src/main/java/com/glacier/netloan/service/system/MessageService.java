/**
 * @Title: MessageService.java 
 * @Package com.glacier.netloan.service.system 
 * @author songjundong  
 * @email 985776597@QQ.com
 * @date 2014-8-28 下午3:18:37 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-8-28
				修改人：songjundong  
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：songjundong  
 * 
 */
package com.glacier.netloan.service.system;

import java.util.ArrayList;
import java.util.Date; 
import java.util.List; 

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.system.MessageMapper;
import com.glacier.netloan.dao.system.MessageReceiverMapper;
import com.glacier.netloan.dao.system.UserMapper; 
import com.glacier.netloan.dto.query.system.MessageDTO; 
import com.glacier.netloan.entity.system.Message;
import com.glacier.netloan.entity.system.MessageExample;
import com.glacier.netloan.entity.system.MessageReceiver;
import com.glacier.netloan.entity.system.MessageReceiverExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample; 
 
 /** 
  * @ClassName:  MessageService
  * @Description: TODO(我的消息service)
  * @author songjundong
  * @email 985776597@QQ.com
  * @date 2014-8-28  上午10:32:49
  */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MessageService  {
	
    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private MessageReceiverMapper messageReceiverMapper;

    @Autowired
    private UserMapper userMapper; 
     
    /*** 
     * @Title: selectMessagesByPrincipal  
     * @Description: TODO(根据用户帐号ID获取该用户发送或接收的短消息，以及接收短消息的读取状态)  
     * @param @param pager  分页信息
     * @param @param sendOrReceive  查询的是接收的还是发送的（状态）
     * @param @param readStatus  消息读取状态
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false)
    public Object selectMessagesByPrincipal(JqPager pager, String sendOrReceive,
            String readStatus) {  
    	JqGridReturn returnResult = new JqGridReturn();  
        User principalUser = (User) SecurityUtils.getSubject().getPrincipal();// 获取已认证对象
        MessageExample messageExample = new MessageExample();
        MessageReceiverExample messageReceiverExample = new MessageReceiverExample();
        int count=0; 
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	messageExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	messageExample.setLimitEnd(pager.getRows());
        }  
        List<MessageDTO> messageDTOs = new ArrayList<MessageDTO>();//数据传递对象
        List<MessageReceiver> messageReceivers = new ArrayList<MessageReceiver>();
        List<Message> messages = new ArrayList<Message>();// 根据需求查询到的短信息集合 
        if ("send".equals(sendOrReceive)) {// 短消息类型为"send"
        	// 查询登录用户未被删除的发送短消息
            messageExample.createCriteria().andSenderEqualTo(principalUser.getUserId()).andSenderisdelEqualTo(false); 
            messages = messageMapper.selectByExample(messageExample);
            if (messages.size() > 0) {      // 查询结果有记录
                for (Message message : messages) {
                    MessageReceiverExample messageReceiverExample2 = new MessageReceiverExample();
                    messageReceiverExample2.createCriteria().andMsgReceIdEqualTo(message.getMessageId());
                    List<MessageReceiver> msgReceivers = messageReceiverMapper.selectByExample(messageReceiverExample2);// 获取该短消息的发送记录
                    String receivers = "";// 定义一个字符串变量，用来保存该短消息的所有接收者姓名，以逗号隔开
                    for (int i = 0; i < msgReceivers.size(); i++) {
                        if (i == msgReceivers.size() - 1) {
                            receivers += userMapper.selectByPrimaryKey(msgReceivers.get(i).getRecipient())
                                    .getUserCnName();
                        } else {
                            receivers += (userMapper.selectByPrimaryKey(msgReceivers.get(i).getRecipient())
                                    .getUserCnName() + ",");
                        }
                    } 
                    MessageDTO messageDTO = new MessageDTO();
                    MessageDTO.entity2dto(message, messageDTO);// 数据传输对象转换
                    messageDTO.setSenderName(userMapper.selectByPrimaryKey(messageDTO.getSender()).getUsername());// 由该短消息中的消息发送者ID取得该用户的姓名
                    messageDTO.setReceivers(receivers);
                    messageDTOs.add(messageDTO);  
                } 
                count=messageMapper.countByExample(messageExample);  
            }
        } else if ("receive".equals(sendOrReceive)) {   
        	// 短消息类型为"receive"，接收的消息   
            if (readStatus.trim().equals("all") == false) {// 接收的短消息是否区分读取状态 
            	Boolean status=false;
            	if(readStatus.trim().equals("false")){
            		  status=false;
            	}else{
            		  status =true;
            	}
                messageReceiverExample.createCriteria().andReadStatusEqualTo(status)
                     .andRecipientEqualTo(principalUser.getUserId()).andRecipientDelEqualTo(false);// 获取接收到并且未删除的已读/未读短消息
                messageReceivers = messageReceiverMapper.selectByExample(messageReceiverExample);
             } else {// 获取的短消息不区分读取状态 
                messageReceiverExample.createCriteria().andRecipientEqualTo(principalUser.getUserId())
                         .andRecipientDelEqualTo(false);// 获取接收到并且未删除的短消息
                messageReceivers = messageReceiverMapper.selectByExample(messageReceiverExample);
             }   
             for (MessageReceiver messageReceiver : messageReceivers) {
                Message message = messageMapper.selectByPrimaryKey(messageReceiver.getMsgReceId());// 由接收记录查询相应的短消息记录
                MessageDTO messageDTO = new MessageDTO();
                MessageDTO.entity2dto(message, messageDTO);// 转换为数据传输对象
                messageDTO.setSenderName(userMapper.selectByPrimaryKey(messageDTO.getSender()).getUserCnName());// 根据短消息中的发送者ID，获取对应的姓名
                messageDTO.setReceivers(userMapper.selectByPrimaryKey(messageReceiver.getRecipient()).getUsername()); // 获取接收人的真是姓名
                messageDTO.setReadStatus(messageReceiver.getReadStatus());
                messageDTOs.add(messageDTO);
            }
            count=messageReceiverMapper.countByExample(messageReceiverExample);  
        }   
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	messageExample.setOrderByClause(pager.getOrderBy("temp_message_"));
        }
        //设置数据和数据的总记录数
        returnResult.setRows(messageDTOs);
        returnResult.setTotal(count);    
        return returnResult;// 返回GridReturn表
    }   
    
    /***
     * @Title: createMessageSelective
     * @Description: TODO(发送新的短消息)
     * @param @param newMessageDTO 新短消息对象
     * @param @param pricipalUserDTO 短消息发送人
     * @param @param recipientIds 一组接收者的ID
     * @return String 返回类型
     * @throws
     */ 
    @Transactional(readOnly = false)
    public Object createMessageSelective(Message newMessage,  String[] recipientIds) {
        User principalUser = (User) SecurityUtils.getSubject().getPrincipal();// 获取已认证对象
        JqReturnJson returnResult = new JqReturnJson(); 
        //内容为空  
        if(newMessage.getContent()==null){ 
        	returnResult.setMsg("消息内容不能为空！");
        	return 	returnResult;
        }else{
        	if(newMessage.getContent().trim()==""){
        		returnResult.setMsg("消息内容不能为空！");
            	return 	returnResult;
        	}
        }
    	if (recipientIds.length > 0) {
            Message message = new Message(); 
            String messageId = RandomGUID.getRandomGUID();// 生成新的GUID作为新短消息的主键
            message.setMessageId(messageId);
            message.setSender(principalUser.getUserId());
            message.setSenderisdel(false);
            message.setSendtime(new Date());// 初始化短消息
            message.setContent(newMessage.getContent());
            if (messageMapper.insert(message) == 1) {// 当向t_message表插入数据成功以再向t_message_receiver表中插入数据
                for (String recipient : recipientIds) {   
                    MessageReceiver messageReceiver = new MessageReceiver();
                    messageReceiver.setReadStatus(false);
                    messageReceiver.setRecipientDel(false);
                    messageReceiver.setMsgReceId(message.getMessageId());
                    messageReceiver.setRecipient(recipient);// 初始化消息接收对象
                    messageReceiverMapper.insertSelective(messageReceiver);// 想短消息接收表中插入记录
                }
                returnResult.setSuccess(true); 
                returnResult.setObj(message);
                returnResult.setMsg("消息发送成功");
            } else {
            	returnResult.setMsg("消息发送失败");
            }
        } else {
        	returnResult.setMsg("未选择消息接收人！");
        }
        return 	returnResult;
    }
    
    /***
     * @Title: getUser  
     * @Description: TODO(查看消息详细信息)  
     * @param @param userId
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false)
   public Object getMessage(String messageId,String sendOrReceive) {
	    User principalUser = (User) SecurityUtils.getSubject().getPrincipal();// 获取已认证对象
        JqReturnJson returnResult = new JqReturnJson(); 
        List<MessageReceiver> messageReceivers = new ArrayList<MessageReceiver>();
        if(messageId==null){
        	returnResult.setMsg("查看的信件不存在");
        }
        //查看的是已发送的消息，只需把该消息的接收人取出来即可
       if("send".equals(sendOrReceive)){ 
    	    	MessageReceiverExample messageReceiverExample=new MessageReceiverExample();
    	    	messageReceiverExample.createCriteria().andMsgReceIdEqualTo(messageId).andRecipientDelEqualTo(false);
    	    	messageReceivers=messageReceiverMapper.selectByExample(messageReceiverExample);
    	    	//把数据丢到集合里，返回前台js
    	    	returnResult.setSuccess(true); 
    	    	returnResult.setObj(messageReceivers); 
       }else{  
    	    Message message=messageMapper.selectByPrimaryKey(messageId);//找到该消息的发送记录
    	    //找出该信件，且未被删除
    	    MessageReceiverExample messageReceiverExample=new MessageReceiverExample();
	    	messageReceiverExample.createCriteria().andMsgReceIdEqualTo(messageId).andRecipientEqualTo(principalUser.getUserId()).andRecipientDelEqualTo(false);
	    	MessageReceiver messageReceiver=messageReceiverMapper.selectByExample(messageReceiverExample).get(0);
	    	if(messageReceiver.getReadStatus()==false){//是否已经读取，已读就不要更改信件状态 
	    		MessageReceiverExample messageReceiverExampleForUpdate = new MessageReceiverExample();
	            messageReceiverExampleForUpdate.createCriteria().andMsgReceIdEqualTo(messageReceiver.getMsgReceId())
	                        .andRecipientEqualTo(principalUser.getUserId());
	    		messageReceiver.setReadStatus(true);  
	    	    messageReceiverMapper.updateByExampleSelective(messageReceiver, messageReceiverExampleForUpdate);// 更新接收短消息的读取状态
	       }
    	  	//把数据丢到集合里，返回前台js
	    	returnResult.setSuccess(true);
	    	returnResult.setObj(message); 
       } 
       return  returnResult;
   } 
    
      /** 
       * @Title: deleteMessage  
       * @Description: TODO(删除短消息)  
       * @param @param messageIds
       * @param @param sendOrReceive
       * @param @return    设定文件  
       * @return Object    返回类型  
       * @throws
       */
    @Transactional(readOnly = false)
    public Object deleteMessage(List<String> messageIds, String sendOrReceive) { 
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
    	User principalUser = (User) SecurityUtils.getSubject().getPrincipal();// 获取已认证对象
        if (messageIds.size() > 0) {
            MessageExample messageExample = null;
            MessageReceiverExample messageReceiverExample = null;
            if ("send".equals(sendOrReceive)) {// 操作的消息为发送的消息
                messageExample = new MessageExample();
                messageExample.createCriteria().andMessageIdIn(messageIds).andSenderisdelEqualTo(false);// 获取选中需要删除的短消息记录
                List<Message> messages = messageMapper.selectByExample(messageExample); //获取需要删除的消息集合
                for (Message message : messages) {
                    boolean deleteAble = true;
                    messageReceiverExample = new MessageReceiverExample();
                    messageReceiverExample.createCriteria().andMsgReceIdEqualTo(message.getMessageId());
                     //找到该消息的所有接收记录
                    List<MessageReceiver> messageReceivers = messageReceiverMapper.selectByExample(messageReceiverExample);
                    for (MessageReceiver messageReceiver : messageReceivers) {
                        if (!messageReceiver.getRecipientDel()) {// 只要该消息对应的接收记录中有一条记录的删除状态为"未删除"，则该消息不进行删除
                            deleteAble = false;
                            break;
                        }
                    }
                    if (deleteAble == true) {// 可删除字段为true，则表示判断通过，进行删除短消息
                        MessageReceiverExample messageReceiverExampleForDel = new MessageReceiverExample();
                        messageReceiverExampleForDel.createCriteria().andMsgReceIdEqualTo(message.getMessageId());
                        messageReceiverMapper.deleteByExample(messageReceiverExampleForDel);// 将有关接收记录删除
                        messageMapper.deleteByPrimaryKey(message.getMessageId());// 删除短消息
                    } else {// 可删除字段为false，则表示判断未通过
                        message.setSenderisdel(true);
                        messageMapper.updateByPrimaryKey(message);// 进行更新短消息(发送者对该短消息的删除状态更改为true<已删除>)
                    }
                }
                returnResult.setSuccess(true);
                returnResult.setMsg("删除成功");
            } else if ("receive".equals(sendOrReceive)) {// 操作的短消息为接收消息
                messageReceiverExample = new MessageReceiverExample();
                messageReceiverExample.createCriteria().andMsgReceIdIn(messageIds)
                        .andRecipientEqualTo(principalUser.getUserId());
                List<MessageReceiver> messageReceivers = messageReceiverMapper.selectByExample(messageReceiverExample);// 查询在Id集合内的消息接收记录
                //应该只有唯一的一条记录
                for (MessageReceiver messageReceiver : messageReceivers) {
                    Message message = messageMapper.selectByPrimaryKey(messageReceiver.getMsgReceId());// 查询该记录对应的短消息发送记录
                    
                    MessageReceiverExample messageReceiverExampleForUpdateOrDelete = new MessageReceiverExample();
                    //查找属于我的接收的那条消息记录
                    messageReceiverExampleForUpdateOrDelete.createCriteria()
                            .andMsgReceIdEqualTo(messageReceiver.getMsgReceId())
                            .andRecipientEqualTo(principalUser.getUserId()); 
                    //查看除了我自己之外，是否还存在其它的接收者，且是未删除状态
                    MessageReceiverExample messageReceiverExampleForGetCount = new MessageReceiverExample();
                    messageReceiverExampleForGetCount.createCriteria()
                            .andMsgReceIdEqualTo(messageReceiver.getMsgReceId())
                            .andRecipientNotEqualTo(principalUser.getUserId());
                    List<MessageReceiver> reMessageReceivers = messageReceiverMapper
                            .selectByExample(messageReceiverExampleForGetCount); 
                    if (message.getSenderisdel() == true && reMessageReceivers.size() == 0) {// 该消息的发送者已删除该消息，并且不存在其他接收记录
                        messageReceiverMapper.deleteByExample(messageReceiverExampleForUpdateOrDelete);
                        messageMapper.deleteByPrimaryKey(messageReceiver.getMsgReceId());
                    } else if (message.getSenderisdel() == true && reMessageReceivers.size() != 0) {// 该消息的发送者已删除该消息，但是存在其他接收者的记录
                        boolean delAble = true;
                        for (MessageReceiver reMessageReceiver : reMessageReceivers) {
                            if (reMessageReceiver.getRecipientDel() == false) {// 其他接收记录中，接收人未将记录删除
                                delAble = false;
                                break;
                            }
                        }
                        if (delAble) {// 其他消息接收人都已将记录删除
                            MessageReceiverExample messageReceiverExampleForDelete = new MessageReceiverExample();
                            messageReceiverExampleForDelete.createCriteria().andMsgReceIdEqualTo(message.getMessageId());
                            messageReceiverMapper.deleteByExample(messageReceiverExampleForDelete);// 清除该短消息对应的所有接收消息
                            messageMapper.deleteByPrimaryKey(message.getMessageId());// 清除该短消息
                        } else {// 其他消息接收人未将记录删除
                            messageReceiver.setRecipientDel(true);
                            messageReceiverMapper.updateByExampleSelective(messageReceiver,
                                    messageReceiverExampleForUpdateOrDelete);// 将该接收消息设置为删除状态
                        }

                    } else {// 该消息的发送者未删除该消息
                        messageReceiver.setRecipientDel(true);
                        messageReceiverMapper.updateByExampleSelective(messageReceiver,
                                messageReceiverExampleForUpdateOrDelete);// 更新短消息为删除状态
                    }
                }
                returnResult.setSuccess(true);
                returnResult.setMsg("删除成功");
            } else {
            	 returnResult.setMsg("要删除的消息不存在！"); 
            }
        } else {
        	returnResult.setMsg("没有选择需要删除的短消息！");  
        }
        return returnResult;
        
    }
    
     /** 
      * @Title: selectUnreadMessage  
      * @Description: TODO(查询是否有未读短消息)  
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    public Object selectUnreadMessage() {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
    	User principalUser = (User) SecurityUtils.getSubject().getPrincipal();// 获取已认证对象
        MessageReceiverExample messageReceiverExample = new MessageReceiverExample() ;//定义查询规则
        messageReceiverExample.createCriteria().andRecipientEqualTo(principalUser.getUserId()).andReadStatusEqualTo(false).andRecipientDelEqualTo(false) ;
        int count = messageReceiverMapper.countByExample(messageReceiverExample) ;//获取符合要求的记录条数
        returnResult.setMsg(""+count+"");
        return returnResult ;
    }
    
      /*** 
       * @Title: selectUser  
       * @Description: TODO(查询我的联系人，除了自己本身)  
       * @param @return    设定文件  
       * @return List<User>    返回类型  
       * @throws
       */
     public List<User> selectUser(){
    	 User principalUser = (User) SecurityUtils.getSubject().getPrincipal();
    	 UserExample userExample = new UserExample(); 
    	 userExample.createCriteria().andUsernameNotEqualTo(principalUser.getUsername());
    	 return userMapper.selectByExample(userExample);
     }
}
