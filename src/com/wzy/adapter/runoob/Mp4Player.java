package com.wzy.adapter.runoob;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-06 14:00
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
