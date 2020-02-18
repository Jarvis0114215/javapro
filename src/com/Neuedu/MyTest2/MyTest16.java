package com.Neuedu.MyTest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Create by Jia on 2020/2/13/013 15:45
 */

/**
 *输出斐波那契数列  以 1 1 开头 后面每一位都是前两位之和
 * 1 1 2 3 5 8 13
 *
 * 一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后 反弹多高
 *
 * 一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少
 *
 * n个人围坐在一个圈子里 从1开始报数 报到3的时候 离开  然后重新 从1开始 最后剩下的是第几个人
 */

public class MyTest16 {
    public static void main(String[] args) {

        /*ShuLie();
        LuoTi();
        PingFangShu();*/
        BaoShu(100);


    }
    //输出斐波那契数列  以 1 1 开头 后面每一位都是前两位之和  1 1 2 3 5 8 13
    public static void ShuLie(){
        int[] array = new int[200];
        array[0]=1;
        array[1]=1;
        System.out.println("请输入您想查看几位斐波那契数列:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i <n; i++){
            array[i+2]=array[i] + array[i+1];
        }
        for(int i = 0; i <n; i++){
            System.out.println(array[i]);
        }
    }
    //一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后 反弹多高
    public static void LuoTi(){
        double h = 100;
        int cs = 10;
        for(int i = 1; i <= 10; i++){
            h = h/2;
        }
        System.out.println(h);
    }
    //一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少
    public static void PingFangShu(){
        for(int i=0; i<=100000; i++){
            if((Math.sqrt(i + 100)%1==0)&&(Math.sqrt(i + 168)%1==0))
                System.out.println(i);
        }
    }
    //n个人围坐在一个圈子里 从1开始报数 报到3的时候 离开  然后重新 从1开始 最后剩下的是第几个人
    public static void BaoShu(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        int m = 1;
        if(m != 3){
            int first = list.remove(0);
            list.add(first);
            m++;
        }else{
           list.remove(2);
        }
        System.out.println(list);
    }
}
