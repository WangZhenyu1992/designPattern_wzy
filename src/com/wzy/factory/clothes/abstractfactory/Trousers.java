package com.wzy.factory.clothes.abstractfactory;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-04 15:39
 */
public class Trousers extends Clothes {

    IngredientFactory ingredientFactory;

    public Trousers(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public String toString() {
        Cloth cloth = ingredientFactory.createCloth();
        Thread thread = ingredientFactory.createThread();
        return cloth.toString() + thread.toString() + "裤子";
    }
}
