package com.Neuedu.test;


/**
 * Create by Jia on 2020/2/5/005 13:15
 */
/*
设计Shape表示图形类，
        有面积属性area、周长属性per，颜色属性color，
        有两个构造方法（一个是默认的、一个是为颜色赋值的），
        还有3个抽象方法，分别是：getArea计算面积、getPer计算周长、showAll输出所有信息
        设计2个子类：
        Rectangle表示矩形类，增加2个属性，width表示长度、height表示宽度，重写getPer、getArea和showAll三个方法，另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）
        Circle表示圆类，增加1个属性，radius表示半径，重写getPer、getArea和showAll三个方法，另外又增加两个构造方法（为半径、颜色赋值的）
        编写测试类，在main方法中，分别使用父类引用指向子类对象，声明创建一个矩形和圆的对象，并调用2个子类的showAll方法。


        创建一个抽象员工类ColaEmployee，包含如下属性和方法 属性：员工的姓名(字符串类型)；员工的生日月份(整型) 抽象方法：getSalary(int month)。
        创建ColaEmployee的三个子类SalariedEmployee (拿固定工资的员工)、HourlyEmployee（拿小时工资的员工）、SalesEmployee（按月销售额和提成率拿工资的员工），
        并在各类中分别覆盖父类的抽象方法getSalary()，
        其中每个类中的方法实现说明如下：
        SalariedEmployee类：拿固定工资的员工。参数：固定工资
        HourlyEmployee：按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。参数：每小时的工资（整型），每月工作的小时数(整型)。
        SalesEmployee：按月销售额和提成率拿工资的员工，参数：月销售额(整型)，提成率(浮点型)

        创建一个测试类，
        包含两个方法，
        分别为： payWage(ColaEmployee emp,int month):计算不同类型员工某个月工资。
        主方法main(String[] args)：在主方法中分别创建一个拿固定工资的员工、拿小时工资的员工、按月销售额和提成率拿工资员工的对象，并把这三个对象放入一个ColaEmployee类型数组中，然后遍历数组，分别计算这个数组中每个员工某个月的工资。
*/



public class Test {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("张三",6000,2);
        System.out.println(salariedEmployee.getSalary(2));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("李四",180,30,4);
        System.out.println(hourlyEmployee.getSalary(4));
        SalesEmployee salesEmployee = new SalesEmployee("王五",300000,0.05,5);
        System.out.println(salesEmployee.getSalary(5));
    }

}
