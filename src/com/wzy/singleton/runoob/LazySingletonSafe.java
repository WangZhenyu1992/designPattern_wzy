package com.wzy.singleton.runoob;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-05 23:05
 */
public class LazySingletonSafe {

    private static LazySingletonSafe instance;

    private LazySingletonSafe(){}

    public static synchronized LazySingletonSafe getInstance(){
        if(instance == null){
            instance = new LazySingletonSafe();
        }
        return instance;
    }
}
