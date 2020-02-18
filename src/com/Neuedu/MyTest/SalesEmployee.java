package com.Neuedu.MyTest;

/**
 * Create by Jia on 2020/2/6/006 18:42
 */
//月销售额和提成工资类
public class SalesEmployee extends ColaEmployee{
    private int sale;//销售额
    private double ticheng;//提成
    public SalesEmployee(String name,int sale,double ticheng,int month) {
        super(name, month);
        this.sale =sale;
        this.ticheng = ticheng;
    }

    @Override
    public double getSalary(int month) {
        return sale*ticheng;
    }
}
