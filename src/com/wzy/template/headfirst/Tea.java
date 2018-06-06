package com.wzy.template.headfirst;

/**
 * 煮茶
 *
 * @author wangzhenyu
 * @since 2018-06-06 14:57
 */
public class Tea extends CaffeineBeverage {
//    void prepareRecipe(){
//        boilWater();
//        steepTeaBag();
//        pourInCup();
//        addLemon();
//    }
//
//    public void boilWater(){
//        System.out.println("Boiling water");
//    }
//
//    public void steepTeaBag(){
//        System.out.println("Steeping the tea");
//    }
//
//    public void addLemon(){
//        System.out.println("Adding Lemon");
//    }
//
//    public void pourInCup(){
//        System.out.println("Pouring into cup");
//    }

    @Override
    void brew(){
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
