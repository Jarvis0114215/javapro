package com.Neuedu.Bean;

/**
 * Create by Jia on 2020/2/13/013 12:54
 */
public class MyThread1 extends Thread{
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
