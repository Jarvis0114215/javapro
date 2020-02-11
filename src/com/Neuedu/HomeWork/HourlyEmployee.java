package com.Neuedu.HomeWork;

/**
 * Create by Jia on 2020/2/5/005 22:24
 */
//小时工资员工类
public class HourlyEmployee extends ColaEmployee {
    private int hourlysalary;//每小时工资
    private int hours;//每月工作的小时数

    public HourlyEmployee(String name,int hours,int hourlysalary,int month) {
        super(name, month);
        this.hourlysalary = hourlysalary;
        this.hours = hours;
    }

    @Override
    public double getSalary(int month) {
        if(hours<=160){
            return hours*hourlysalary;
        }else{
            return 160*hourlysalary+(hours-160)*(hourlysalary*1.5);
        }
    }
}
