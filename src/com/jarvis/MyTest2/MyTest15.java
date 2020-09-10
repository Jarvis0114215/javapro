package com.jarvis.MyTest2;

/**
 * Create by Jia on 2020/2/13/013 15:02
 */
public class MyTest15 {
    public static int a = 0;
    public static void main(String[] args) {
        /*Thread t1 = new MyThread1();
        Thread t2 = new MyThread1();
        t1.start();
        t2.start();*/
        /*Runnable myThread2 = new MyThread2();
        Thread t1 = new Thread(myThread2);
        Thread t2 = new Thread(myThread2);
        t1.start();
        t2.start();*/
        /*MyThread2 myThread2 = new MyThread2();
        Thread t1 = new Thread(()->{
            myThread2.add();
        });
        Thread t2 = new Thread(()->{
            myThread2.del();
        });
        t1.start();
        t2.start();*/
        /*for(int i = 0; i < 5000; i++){
            Thread t = new Thread(()->{
                a++;
            });
            t.start();
        }
        System.out.println(a);*/
    }
}
