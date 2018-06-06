package com.wzy.singleton.headfirst.lazy;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-05 22:47
 */
public class SingletonSafeQuickly {

    private volatile static SingletonSafeQuickly uniqueInstance;

    private SingletonSafeQuickly(){}

    public static SingletonSafeQuickly getInstance(){
        if(uniqueInstance == null){
            synchronized (SingletonSafeQuickly.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonSafeQuickly();
                }
            }
        }
        return uniqueInstance;
    }
}
