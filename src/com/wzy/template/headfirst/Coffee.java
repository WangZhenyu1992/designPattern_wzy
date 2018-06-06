package com.wzy.template.headfirst;

/**
 * 咖啡，用来煮咖啡
 *
 * @author wangzhenyu
 * @since 2018-06-06 14:52
 */
public class Coffee extends CaffeineBeverage {
    // 咖啡冲泡法，直接取自训练手册
//    void prepareRecipe(){
//        boilWater();
//        brewCoffeeGrinds();
//        pourInCup();
//        addSugarAndMild();
//    }

//    public void boilWater(){
//        System.out.println("Boiling water");
//    }
//
//    public void brewCoffeeGrinds(){
//        System.out.println("Dripping Coffee through filter");
//    }
//
//    public void pourInCup(){
//        System.out.println("Pouring into cup");
//    }
//
//    public void addSugarAndMild(){
//        System.out.println("Adding Sugar and Milk");
//    }

    @Override
    public void brew(){
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
