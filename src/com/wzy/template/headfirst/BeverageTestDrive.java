package com.wzy.template.headfirst;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-06 15:15
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
//        Tea myTea = new Tea();
//        myTea.prepareRecipe();
//
//        Coffee myCoffee = new Coffee();
//        myCoffee.prepareRecipe();

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        coffeeWithHook.prepareRecipe();
    }
}
