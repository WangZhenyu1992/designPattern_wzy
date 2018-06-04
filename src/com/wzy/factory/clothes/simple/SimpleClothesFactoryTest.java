package com.wzy.factory.clothes.simple;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 14:24
 */
public class SimpleClothesFactoryTest {
    public static void main(String[] args) {
        // 生产衣服的工厂
        SimpleClothesFactory clothesFactory = new SimpleClothesFactory();
        // 生产一条裤子
        Clothes trousers = clothesFactory.createClothes("trousers");
        System.out.println(trousers);
        // 生产一件衬衫
        Clothes shirt = clothesFactory.createClothes("shirt");
        System.out.println(shirt);
        // 生产一件宇航服
        Clothes spacesuit = clothesFactory.createClothes("spacesuit");
        System.out.println(spacesuit);
    }
}
