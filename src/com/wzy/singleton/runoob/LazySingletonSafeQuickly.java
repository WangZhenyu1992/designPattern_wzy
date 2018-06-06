package com.wzy.singleton.runoob;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-05 23:07
 */
public class LazySingletonSafeQuickly {

    private volatile static LazySingletonSafeQuickly instance;

    private LazySingletonSafeQuickly(){}

    public static LazySingletonSafeQuickly getInstance(){
        if(instance == null){
            synchronized (LazySingletonSafeQuickly.class){
                if(instance == null){
                    instance = new LazySingletonSafeQuickly();
                }
            }
        }
        return instance;
    }
}
