package com.wzy.adapter.runoob;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-06 13:58
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 什么也不做
    }
}
