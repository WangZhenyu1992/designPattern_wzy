package com.wzy.factory.clothes.abstractfactory;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 15:28
 */
public class SilkIngredientFactory implements IngredientFactory{

    @Override
    public Thread createThread() {
        return new NylonThread();
    }

    @Override
    public Cloth createCloth() {
        return new Silk();
    }
}
