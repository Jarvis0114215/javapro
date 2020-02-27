package com.neuedu.FuXi;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by Jia on 2020/2/20/020 19:35
 */
public class FuXi0220 {
    public static void main(String[] args) {
        //小数计算用BigDecimal  float double 存数据
        /*BigDecimal a = new BigDecimal("0.2");
        BigDecimal b = new BigDecimal("0.54");
        System.out.println(a.add(b));*/

        //包装类比较 拆包比较   -128~127可以不拆
        /*Integer a1 = 127;  Integer b1 = 127;
        System.out.println(a1==b1);//输出true
        Integer a2 = 128;  Integer b2 = 128;
        System.out.println(a2==b2);//超过范围 没有拆包输出false
        System.out.println(a2.intValue()==b2.intValue());//输出true*/

        //冒泡排序和选择排序
        /*int[] array = {100,4,24,35,2,69,45,44,78,1};
        MaoPaoSort(array);
        XuanZeSort(array);*/

        /**
         * 多态   多态建立在继承的基础之上
         *  赋值多态
         *      父类引用指向子类对象 即子类的对象可以给父类的引用赋值
         *  传参多态
         *      当一个方法的参数类型定位为父类的时候  所有子类都可以传参
         * 接口 比抽象类 更抽象的一种特殊类
         *      接口在jdk1.8之前 只能有抽象方法  不能有非抽象方法而且不用写abstract
         *      接口中 没有属性和构造方法
         *  继承父类 extends 父类名
         *  实现(继承)接口  implements 接口名
         */

        /*引用  当变量存的是一个地址的时候  叫这个变量为引用  引用类型存的都是地址*/

        /**
         * 接口和抽象类abstract的区别
         * 1 单继承多实现
         *      一个类只能继承一个类却可以实现多个接口
         * 2 构造方法
         *      接口没有构造方法 抽象类有构造方法(意义就是子类用super调用父类的)
         *      接口和抽象类都不能被实例化 但是没说不能new new出来的叫匿名内部类
         * 3 成员变量
         *      抽象类有成员变量
         *      接口无成员变量 可以定义 定义后会被自动加上static final 修饰为静态只读(常量)
         * 4 抽象方法
         *      抽象类可以有抽象方法和非抽象方法
         *      jdk1.8之前接口中只能有抽象方法  1.8之后也可有非抽象方法(通过default关键字)
         *
         */
        Map m = new HashMap();
        m.put("001","张三");
        m.put("002","李四");
        m.put("002","王五");
        System.out.println(m.get("002"));




    }
    //冒泡排序
    public static void MaoPaoSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            int flag = 0;
            for(int j = 0; j < array.length-1; j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag++;
                }
            }
            if(flag == 0){
                break;
            }
        }
        for(int a : array){
            System.out.println(a);
        }
    }
    //选择排序
    public static void XuanZeSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        for(int a : array){
            System.out.println(a);
        }
    }

}
