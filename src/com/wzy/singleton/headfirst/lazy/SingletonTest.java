package com.wzy.singleton.headfirst.lazy;

import java.util.concurrent.CountDownLatch;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-05 14:53
 */
public class SingletonTest {
    public static void main(String[] args) {
        int count = 200;

        CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for(int i = 0; i < count; i ++){
            new Thread(() -> {
                Object obj = SingletonUnsafe.getInstance();
                //System.out.println(System.currentTimeMillis() + ":" + obj);
                latch.countDown();
            }).start();
        }
        long end = System.currentTimeMillis();

        try{
            latch.await();
            System.out.println("线程不安全耗时：" + (end - start) + "ms");
        }catch (Exception e){
            e.printStackTrace();
        }
        //-------------------------------------------------------
        CountDownLatch latch1 = new CountDownLatch(count);

        start = System.currentTimeMillis();
        for(int i = 0; i < count; i ++){
            new Thread(() -> {
                Object obj = SingletonSafe.getInstance();
                //System.out.println(System.currentTimeMillis() + ":" + obj);
                latch1.countDown();
            }).start();
        }
        end = System.currentTimeMillis();

        try{
            latch1.await();
            System.out.println("线程安全耗时：" + (end - start) + "ms");
        }catch (Exception e){
            e.printStackTrace();
        }
        //-------------------------------------------------------
        CountDownLatch latch2 = new CountDownLatch(count);

        start = System.currentTimeMillis();
        for(int i = 0; i < count; i ++){
            new Thread(() -> {
                Object obj = SingletonSafeQuickly.getInstance();
                System.out.println(System.currentTimeMillis() + ":" + obj);
                latch2.countDown();
            }).start();
        }
        end = System.currentTimeMillis();

        try{
            latch2.await();
            System.out.println("线程安全耗时：" + (end - start) + "ms");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
