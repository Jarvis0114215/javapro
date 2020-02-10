package com.Neuedu.pr;

/**
 * Create by Jia on 2020/2/5/005 21:31
 */
//矩形类
public class Rectangle extends Shape{
    private double height;       //长度
    private double width;        //宽度
    public Rectangle(){

    }
    public Rectangle(double height,double width,String color){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPer() {
        return 2*(height+width);
    }

    @Override
    public void showAll() {
        System.out.println("矩形长度:"+height);
        System.out.println("矩形宽度:"+width);
        System.out.println("矩形面积:"+getArea());
        System.out.println("矩形周长:"+getPer());
        System.out.println("矩形颜色:"+getColor());
    }
    //设置长度 宽度 颜色
    public void set(int height,int width){
        this.height = height;
        this.width = width;
    }

}
