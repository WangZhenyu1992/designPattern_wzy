package com.wzy.adapter.headfirst;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-06 11:09
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble(){
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly(){
        System.out.println("I'm flying a short distance");
    }

}
