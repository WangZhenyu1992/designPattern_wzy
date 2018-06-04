package com.wzy.factory.clothes.abstractfactory;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 15:26
 */
public class CottonIngredientFactory implements IngredientFactory {

    @Override
    public Thread createThread() {
        return new CottonThread();
    }

    @Override
    public Cloth createCloth() {
        return new Cotton();
    }
}
