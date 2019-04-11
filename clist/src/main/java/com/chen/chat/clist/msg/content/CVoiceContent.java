package com.chen.chat.clist.msg.content;

/**
 * 语音消息
 */
public class CVoiceContent extends CFileContent{
    /**
     * 正在播放
     */
    public static final int STATE_PLAYING=0;
    /**
     * 还没有播放
     */
    public static final int STATE_NOT_PLAYED=1;
    /**
     * 已经播放过
     */
    public static final int STATE_HAS_PLAYED=2;
    /**
     * 语音的长度
     */
    private int voiceLength;
    /**
     * 当前的播放状态
     */
    private int playState;

    public static int getStatePlaying() {
        return STATE_PLAYING;
    }

    public static int getStateNotPlayed() {
        return STATE_NOT_PLAYED;
    }

    public static int getStateHasPlayed() {
        return STATE_HAS_PLAYED;
    }

    public int getVoiceLength() {
        return voiceLength;
    }

    public void setVoiceLength(int voiceLength) {
        this.voiceLength = voiceLength;
    }

    @Override
    public String getContentInfo() {
        return super.getContentInfo()+"_"+voiceLength;

    }
}
