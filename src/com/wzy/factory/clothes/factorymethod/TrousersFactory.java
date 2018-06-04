package com.wzy.factory.clothes.factorymethod;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 14:58
 */
public class TrousersFactory implements ClothesFactory {
    @Override
    public Clothes createClothes(String type) {
        Clothes clothes = null;
        if(type.equalsIgnoreCase("jeans")){
            clothes = new Jeans();
        }else if(type.equalsIgnoreCase("skirt")){
            clothes = new Skirt();
        }else{
            clothes = new FeatureClothes();
        }
        return clothes;
    }
}
