package com.jarvis.MyTest;

/**
 * Create by Jia on 2020/2/6/006 11:42
 */
public class Rectangle extends Shape{
    private double width;
    private double height;
    //默认的构造方法(不写也会自动生成)
    public Rectangle(){}
    //为高度、宽度、颜色赋值的构造方法
    public Rectangle(double width,double height,String color){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPer() {
        return 2*(width+height);
    }

    @Override
    public void showAll() {
        System.out.println("矩形长度:"+height);
        System.out.println("矩形宽度:"+width);
        System.out.println("矩形面积:"+getArea());
        System.out.println("矩形周长:"+getPer());
        System.out.println("矩形颜色:"+getColor());
    }

}
