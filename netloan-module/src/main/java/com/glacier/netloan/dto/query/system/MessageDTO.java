 
package com.glacier.netloan.dto.query.system;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.validator.constraints.Length;

import com.glacier.core.dto.AbstractDTO; 
import com.glacier.netloan.entity.system.Message;
import com.glacier.netloan.util.DateConverter;

 /**
  * 
  * @ClassName:  MessageDTO
  * @Description: TODO(Message模块数据传输对象)
  * @author songjundong
  * @email 985776597@QQ.com
  * @date 2014-9-3  下午3:33:34
  */

public class MessageDTO extends AbstractDTO {

    /**
     * 短消息ID
     */
    private String messageId;

    /**
     * 消息发送者
     */
    private String sender;

    /**
     * 消息发送者名字
     */
    private String senderName;

    /**
     * 发送时间
     */
    private String sendTime;

    /**
     * 发送者对消息的删除状态
     */
    private Boolean senderIsDel;

    /**
     * 消息内容
     */
    @Length(max = 255, message = "{MessageDTO.content.illegal}")
    private String content;

    /**
     * 消息读取状态
     */
    private Boolean readStatus;

    /**
     * 消息接收者
     */
    private String receivers;
  
    public static void entity2dto(Message entity, MessageDTO dto) {

        try { 
            // 通用的属性转换方法
            BeanUtils.copyProperties(dto, entity);

            // 以下是保护的属性转换方法
            if (entity.getMessageId() != null) {
                dto.setMessageId(entity.getMessageId());
            }
            // Date转换
            // 发送时间转换:commonTimeFormat2 yyyy-MM-dd HH:mm
            if (entity.getSendtime() != null) {
                dto.setSendTime(DateConverter.commonTimeFormat2.format(entity.getSendtime()));
            }
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * Convert data transfer object into domain entity object.
     */
    public static void dto2entity(MessageDTO dto, Message entity) {

        try {
            // 通用的属性转换方法
            BeanUtils.copyProperties(entity, dto);

            // 以下是保护的属性转换方法
            if (dto.getMessageId() != null) {
                entity.setMessageId(dto.getMessageId());
            }
            // Date转换
            // 发送时间转换:commonTimeFormat2 yyyy-MM-dd HH:mm
            if (dto.getSendTime() != null) {
                entity.setSendtime(DateConverter.commonTimeFormat2.parse(dto.getSendTime()));
            }
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public Boolean getSenderIsDel() {
        return senderIsDel;
    }

    public void setSenderIsDel(Boolean senderIsDel) {
        this.senderIsDel = senderIsDel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(Boolean readStatus) {
        this.readStatus = readStatus;
    } 

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceivers() {
        return receivers;
    }

    public void setReceivers(String receivers) {
        this.receivers = receivers;
    }
}
