package com.Neuedu.HomeWork;

/**
 * Create by Jia on 2020/2/5/005 22:23
 */
//固定工资员工类
public class SalariedEmployee extends ColaEmployee {
    private int salay;//固定工资
    public SalariedEmployee(String name,int salay,int month) {
        super(name, month);
        this.salay = salay;
    }


    @Override
    public double getSalary(int month) {
        return salay;
    }
}
