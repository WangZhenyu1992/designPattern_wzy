package com.wzy.singleton.headfirst.lazy;

/**
 * 懒汉式，在需要的时候才新建，懒得弄啊
 *
 * @author wangzhenyu
 * @since 2018-06-05 14:48
 */
public class SingletonUnsafe {
    // 利用一个静态变量来记录Singleton类的唯一实例
    private static SingletonUnsafe uniqueInstance;
    // 把构造器声明为私有的，只有从该类内部才可以调用构造器
    private SingletonUnsafe(){}
    // 用getInstance()方法实例化对象，并返回这个实例
    public static SingletonUnsafe getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SingletonUnsafe();
        }
        return uniqueInstance;
    }
    // 这里有其他属性和方法
}
