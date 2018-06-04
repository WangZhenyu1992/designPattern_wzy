package com.wzy.factory.clothes.simple;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 14:21
 */
public class SimpleClothesFactory {
    /**
     * 根据用户需要的类型，生产对应的衣服
     * @param type
     * @return
     */
    public Clothes createClothes(String type){
        Clothes clothes = null;
        if(type.equalsIgnoreCase("trousers")){
            clothes = new Trousers();
        }else if(type.equalsIgnoreCase("shirt")){
            clothes = new Shirt();
        }else{
            System.out.println("您输入的衣服类型太先进了，我们工厂暂时还无法生产");
            clothes = new FeatureClothes();
        }
        return clothes;
    }
}
