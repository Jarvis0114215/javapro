package com.jarvis.MyTest;

/**
 * Create by Jia on 2020/2/6/006 18:39
 */
//员工类
public  abstract class ColaEmployee {
    private String name;
    private int month;
    public abstract double getSalary(int month);
    public ColaEmployee(String name,int month){
        this.month = month;
        this.name = name;
    }
}
