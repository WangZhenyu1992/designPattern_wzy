package com.wzy.singleton.headfirst.lazy;

/**
 * 懒汉式，线程加锁
 *
 * @author wangzhenyu
 * @since 2018-06-05 15:13
 */
public class SingletonSafe {
    private static SingletonSafe uniqueSingleton;
    private SingletonSafe(){}

    public static synchronized SingletonSafe getInstance(){
        if(uniqueSingleton == null){
            uniqueSingleton = new SingletonSafe();
        }
        return uniqueSingleton;
    }
}
