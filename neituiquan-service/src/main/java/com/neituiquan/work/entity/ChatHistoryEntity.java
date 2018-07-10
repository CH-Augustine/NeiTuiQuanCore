package com.neituiquan.work.entity;

import java.io.Serializable;

/**
 * 历史聊天信息
 */
public class ChatHistoryEntity implements Serializable {

    private  String id;

    //发送者ID
    private  String fromId;

    //接受者ID
    private  String receiveId;

    //聊天组ID
    private  String groupId;


    private  String msgDetails;


    private  String createTime;

    //是否已读
    private  String isRead;

    //是否收到
    private  String isReceive;

    //是否是群消息
    private  String isGroup;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getMsgDetails() {
        return msgDetails;
    }

    public void setMsgDetails(String msgDetails) {
        this.msgDetails = msgDetails;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public String getIsReceive() {
        return isReceive;
    }

    public void setIsReceive(String isReceive) {
        this.isReceive = isReceive;
    }

    public String getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(String isGroup) {
        this.isGroup = isGroup;
    }
}
