package com.chen.chat.clist.msg.content;

/**
 * 图片消息
 */
public class CImageContent extends CFileContent {
    /**
     * 宽度
     */
    private int width;
    /**
     * 高度
     */
    private int height;
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getContentInfo() {
        return getPath()+"_"+width+"*"+height;
    }
}
