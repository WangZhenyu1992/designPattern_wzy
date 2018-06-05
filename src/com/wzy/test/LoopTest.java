package com.wzy.test;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-05 16:37
 */
public class LoopTest {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++){
            for(int j = 0; j < 10; j ++){
                if(i == 5){
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
