package com.wzy.singleton.runoob;

/**
 * 这种方式能达到双检锁方式一样的功效，但实现更简单。
 * 对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 * 这种方式利用了classloader机制来保证初始化instance时只有一个线程，它跟第三种方式不同的是：第三种方式只要Singleton类被装载了，那么instance就会被实例化
 * 没有达到lazy loading的效果，而这种方式是single类被装载了，instance不一定被初始化，因为SingletonHolder类没有被主动使用，只是通过显式调用getInstance
 * 方法时，才会显式装载SingletonHolder类，从而实例化instance。
 *
 * @author wangzhenyu
 * @since 2018-06-05 23:09
 */
public class RegistSingleton {

    private static class SingletonHolder{
        private static final RegistSingleton INSTANCE = new RegistSingleton();
    }

    private RegistSingleton(){}

    public static final RegistSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
