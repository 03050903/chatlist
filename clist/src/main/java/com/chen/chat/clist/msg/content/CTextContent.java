package com.chen.chat.clist.msg.content;

/**
 * 文本消息
 */
public class CTextContent implements CMessageContent {
    /**
     * 文本内容
     */
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getContentInfo() {
        return text;
    }
}
