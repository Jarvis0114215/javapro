package com.neuedu.MyTest2;

/**
 * Create by Jia on 2020/2/13/013 19:29
 */
public class MyThread2 implements Runnable{
    Object obj = new Object();
    private int count = 80;
    @Override
    public void run() {
        while(count>0) {
            synchronized (obj){
                System.out.println(Thread.currentThread().getName() + "卖出了第" + count + "张票");
                count--;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void add(){
        while(true){
            System.out.println("add");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void del(){
        while(true){
            System.out.println("del");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
