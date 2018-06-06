package com.wzy.singleton.runoob;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-05 23:06
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }
}
