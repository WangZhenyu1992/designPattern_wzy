package com.wzy.factory.clothes.factorymethod;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 14:47
 */
public interface ClothesFactory {
    // 所有工厂都得实现该方法，根据类型制作需要的衣服
    Clothes createClothes(String type);
}
