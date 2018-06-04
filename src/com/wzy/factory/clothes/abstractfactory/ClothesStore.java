package com.wzy.factory.clothes.abstractfactory;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 15:32
 */
public abstract class ClothesStore {
    public abstract Clothes createClothes(String type);
}
