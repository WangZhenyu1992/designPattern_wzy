package com.wzy.adapter.headfirst;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-06 11:07
 */
public class MallardDuck implements Duck {
    @Override
    public void quack(){
        System.out.println("Quack");
    }

    @Override
    public void fly(){
        System.out.println("I'm flying");
    }
}
