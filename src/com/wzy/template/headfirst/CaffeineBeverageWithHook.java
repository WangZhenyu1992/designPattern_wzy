package com.wzy.template.headfirst;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-06 16:10
 */
public abstract class CaffeineBeverageWithHook {

    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
