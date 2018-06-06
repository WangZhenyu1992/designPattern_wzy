package com.wzy.singleton.runoob;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-05 23:03
 */
public class LazySingletonUnsafe {

    private static LazySingletonUnsafe instance;

    private LazySingletonUnsafe(){}

    public static LazySingletonUnsafe getInstance(){
        if(instance == null){
            instance = new LazySingletonUnsafe();
        }
        return instance;
    }
}
