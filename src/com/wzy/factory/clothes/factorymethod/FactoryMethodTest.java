package com.wzy.factory.clothes.factorymethod;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 15:01
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ClothesFactory factory = new TrousersFactory();
        Clothes jeans = factory.createClothes("jeans");
        System.out.println(jeans);

        factory = new ShirtFactory();
        Clothes blouse = factory.createClothes("blouse");
        System.out.println(blouse);
    }
}
