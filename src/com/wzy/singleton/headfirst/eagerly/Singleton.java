package com.wzy.singleton.headfirst.eagerly;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-05 22:44
 */
public class Singleton {
    private static Singleton uniqueSingleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return uniqueSingleton;
    }

}
