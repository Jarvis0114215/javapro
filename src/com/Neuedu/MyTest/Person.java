package com.Neuedu.MyTest;

/**
 * Create by Jia on 2020/2/5/005 18:41
 */
public class Person extends Animal{
    private int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public void run() {
        System.out.println("人也会跑");
    }
}
