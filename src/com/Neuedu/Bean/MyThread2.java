package com.Neuedu.Bean;

/**
 * Create by Jia on 2020/2/13/013 19:29
 */
public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程输出---"+i);
        }
    }
}
