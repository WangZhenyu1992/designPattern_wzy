package com.wzy.factory.clothes.abstractfactory;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 15:33
 */
public class ShirtStore extends ClothesStore {
    @Override
    public Clothes createClothes(String type) {
        Clothes clothes = null;
        IngredientFactory ingredientFactory = null;
        if(type.equalsIgnoreCase("silk")){
            ingredientFactory = new SilkIngredientFactory();
            clothes = new Shirt(ingredientFactory);
        }else if(type.equalsIgnoreCase("cotton")){
            ingredientFactory = new CottonIngredientFactory();
            clothes = new Shirt(ingredientFactory);
        }else {
            clothes = null;
        }
        return clothes;
    }
}
