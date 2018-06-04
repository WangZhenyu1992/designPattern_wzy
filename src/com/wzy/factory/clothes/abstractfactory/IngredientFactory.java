package com.wzy.factory.clothes.abstractfactory;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 15:24
 */
public interface IngredientFactory {
    Thread createThread();
    Cloth createCloth();
}
