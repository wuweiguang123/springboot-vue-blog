package com.xgsxd.blog.bean;

import java.util.Date;

public class Message {
    private Integer messageId;

    private String messageName;

    private String messageEmail;

    private Date messageTime;

    private String messageMark;

    private String messageContent;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName == null ? null : messageName.trim();
    }

    public String getMessageEmail() {
        return messageEmail;
    }

    public void setMessageEmail(String messageEmail) {
        this.messageEmail = messageEmail == null ? null : messageEmail.trim();
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessageMark() {
        return messageMark;
    }

    public void setMessageMark(String messageMark) {
        this.messageMark = messageMark == null ? null : messageMark.trim();
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }
}