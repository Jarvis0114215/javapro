package com.Neuedu.test;

/**
 * Create by Jia on 2020/2/6/006 18:42
 */
//小时工资员工类
public class HourlyEmployee extends ColaEmployee{
    private int hour;//每月工作的小时数
    private int hoursalary;//每小时工资
    public HourlyEmployee(String name,int hour, int hoursalary,int month) {
        super(name,month);
        this.hour = hour;
        this.hoursalary = hoursalary;
    }

    @Override
    public double getSalary(int month) {
        if(hour<=160){
            return hour*hoursalary;
        }else{
            return 160*hoursalary+(hour-160)*(hoursalary+hoursalary/2);
        }
    }
}
