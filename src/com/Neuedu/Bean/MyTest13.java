package com.Neuedu.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by Jia on 2020/2/13/013 12:53
 */
public class MyTest13 {
    public static int a = 0;
    public static List list = new ArrayList();
    public static void main(String[] args) {
        /*MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread1 t2 = new MyThread1();
        t2.start();*/

        /*MyThread2 t2 = new MyThread2();
        Thread t = new Thread(t2);
        t.start();*/

        /*System.out.println(method(10,2,(a,b)->{
            return a + b;
        }));*/
        //lambda表达式实现Runnable接口
        /*Thread t1 = new Thread(()->{
            for(int i = 0; i <= 100; i++){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程输出"+i);
            }
        });
        t1.start();*/
        for(int i = 0; i < 5000; i++){
            Thread t = new Thread(()->{
                /*a++;*/
                list.add(1);
            });
            t.start();
        }
        System.out.println(list.size());
    }
    public static int method(int a, int b,MyInterface myInterface){
        return myInterface.method(a,b);
    }
}