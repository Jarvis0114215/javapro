package com.Neuedu.s1;

/**
 * Create by Jia on 2020/2/6/006 11:34
 */
//图形类
public abstract class Shape {
    private double area;    //面积
    private double per;     //周长
    private String color;   //颜色
    //默认方法(不写也会生成)
    public Shape(){}
    //为颜色赋值的方法
    public Shape(String color){
        this.color = color;
    }
    //3个抽象方法
    //getArea计算面积、getPer计算周长、showAll输出所有信息
    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();

    public String getColor() {
        return color;
    }
}
