package com.wzy.template.headfirst;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-06 15:07
 */
public abstract class CaffeineBeverage {
    // 用同一个方法处理茶和咖啡，将步骤2和4泛化
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 泛化的方法交给子类处理
    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
