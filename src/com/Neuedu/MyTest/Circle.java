package com.Neuedu.MyTest;

/**
 * Create by Jia on 2020/2/6/006 11:53
 */
//圆类
public class Circle extends Shape{
    private double radius;  //半径
    //默认的构造方法(不写也会自动生成)
    public Circle(){}
    //为半径、颜色赋值的的构造方法
    public Circle(double radius,String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPer() {
        return 2*3.14*radius;
    }

    @Override
    public void showAll() {
        System.out.println("圆半径:"+radius);
        System.out.println("圆面积:"+getArea());
        System.out.println("圆周长:"+getPer());
        System.out.println("圆颜色:"+getColor());
    }
}
