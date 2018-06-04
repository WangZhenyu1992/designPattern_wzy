package com.wzy.factory.clothes.factorymethod;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 14:49
 */
public class ShirtFactory implements ClothesFactory {
    @Override
    public Clothes createClothes(String type) {
        Clothes clothes = null;
        if(type.equalsIgnoreCase("blouse")){
            clothes = new Blouse();
        }else if(type.equalsIgnoreCase("sweater")){
            clothes = new Sweater();
        }else{
            clothes = new FeatureClothes();
        }
        return clothes;
    }
}
