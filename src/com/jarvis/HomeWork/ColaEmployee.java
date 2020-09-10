package com.jarvis.HomeWork;

/**
 * Create by Jia on 2020/2/5/005 22:18
 */
//员工类
public abstract class ColaEmployee {
    private String name;
    private int month;
    public ColaEmployee(String name,int month){
        this.month = month;
        this.name = name;
    }
    public abstract double getSalary(int month);

}
