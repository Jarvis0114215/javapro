package com.jarvis.MyTest2;

/**
 * Create by Jia on 2020/2/13/013 12:54
 */
public class MyThread1 extends Thread{
    private int count = 40;
    @Override
    public void run() {
        while(count>0){
            System.out.println(Thread.currentThread().getName()+"卖出了第"+count+"张票");
            count--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
