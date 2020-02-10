package com.Neuedu.s1;

/**
 * Create by Jia on 2020/2/6/006 18:41
 */
//固定工资员工类
public class SalariedEmployee extends ColaEmployee{
    private int salar;//固定工资
    public SalariedEmployee(String name,int salar,int month){
        super(name,month);
        this.salar = salar;
    }
    @Override
    public double getSalary(int month) {
        return salar;
    }
}
