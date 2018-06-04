package com.wzy.factory.clothes.abstractfactory;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 15:42
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ClothesStore store = new ShirtStore();
        Clothes clothes = store.createClothes("silk");
        System.out.println(clothes);

        store = new TrousersStore();
        clothes = store.createClothes("cotton");
        System.out.println(clothes);

        clothes = store.createClothes("silk");
        System.out.println(clothes);
    }
}
