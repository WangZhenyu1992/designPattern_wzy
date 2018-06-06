package com.wzy.singleton.headfirst;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-05 22:18
 */
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueChocolateBoiler;

    // 刚开始锅炉是空的
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    // 保证只有一个锅炉
    public static ChocolateBoiler getInstance(){
        if(uniqueChocolateBoiler == null){
            uniqueChocolateBoiler = new ChocolateBoiler();
        }
        return uniqueChocolateBoiler;
    }

    // 在锅炉内填入原料时，锅炉必须是空的
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    // 锅炉排出时，必须是满的而且是煮过的
    public void drain(){
        if(!isEmpty() && isBoiled()){
            // 排出煮沸的巧克力和牛奶
            empty = true;
        }
    }

    // 煮混合物时，过滤必须是满的，并且是没有煮过的
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            // 将炉内物煮沸
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
