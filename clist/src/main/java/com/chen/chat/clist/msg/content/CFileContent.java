package com.chen.chat.clist.msg.content;

/**
 * 文件
 */
public class CFileContent implements CMessageContent
{
    /**
     * 文件的路径
     */
    private String path;
    /**
     * 文件的大小，可用于多线程下载等，如果没有这个字段，实现多线程下载时需要先获取这个字段
     */
    private long size;

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String getContentInfo() {
        return path;
    }
}
