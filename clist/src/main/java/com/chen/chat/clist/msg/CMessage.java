package com.chen.chat.clist.msg;

import com.chen.chat.clist.msg.content.CMessageContent;
import com.chen.chat.clist.user.CChater;

/**
 * 所有消息的基类
 */
public abstract class CMessage<T extends CMessageContent> {
    /**
     * 发送时间
     */
    private long sendedTime;
    /**
     * 接收到的时间
     */
    private long receivedTime;
    /**
     * 消息类型
     */
    private int type;
    /**
     * 消息内容
     */
    private T content;
    /**
     * 发送者
     */
    private CChater sender;
    /**
     * 接收者的ID
     */
    private long receiverId;

    public long getSendedTime() {
        return sendedTime;
    }

    public void setSendedTime(long sendedTime) {
        this.sendedTime = sendedTime;
    }

    public long getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(long receivedTime) {
        this.receivedTime = receivedTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public CChater getSender() {
        return sender;
    }

    public void setSender(CChater sender) {
        this.sender = sender;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(long receiverId) {
        this.receiverId = receiverId;
    }
}
