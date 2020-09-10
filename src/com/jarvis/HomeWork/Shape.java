package com.jarvis.HomeWork;

/**
 * Create by Jia on 2020/2/5/005 19:33
 */
//图形类
public abstract class Shape {
    private double area;       //面积
    private double per;        //周长
    private String color;   //颜色
    //默认的方法
    public Shape(){

    }
    //为颜色赋值的方法
    public Shape(String color){
        this.color = color;
    }
    //抽象方法计算面积
    public abstract double getArea();
    //抽象方法计算周长
    public abstract double getPer();
    //抽象方法输出所有信息
    public abstract void showAll();

    public String getColor() {
        return color;
    }
}
