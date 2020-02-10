package com.Neuedu.s1;

/**
 * Created by Neuedu on 2020/2/4.
 */
public class MyTest2 {
    public static void main(String[] args) {
        /**
         *
         *    在堆区中定义了一个连续的内存空间来储存多个变量
         *
         *    定义方式
         *      1 数据类型[] 变量名 = new 数据类型[个数];
         *      2 数据类型[] 变量名 = {内容，内容};
         *
         *      读写
         *      变量[下标] 来获取或者设置值
         *      下标的范围 从 0~~数组的长度-1
         *      数组一旦定义长度 无法更改
         *
         * */
        /*int[] array = new int[5];
        array[0]=1;
        array[1]=4;
        array[2]=6;
        array[3]=8;
        array[4]=10;*/
       /* int[] array = {1,4,6,8,10,33};
        for(int i = 0;i<=array.length;i++){
            int a = array[i];
            System.out.println(a);
        }
        for(int a : array){
            System.out.println(a);
        }*/
        /*
        * 1 - 4 之间 拿出任意3个数  最多能组成多少个数字  并打印
        *
        * 1-100之间的偶数和
        *
        * 定义两个int变量 m和n  计算m的n次方
        *
        * 100~999之间的水仙花数  例如 153  1^3+5^3+3^3=153
        *
        * 两个正整数 计算最大公约数和最小公倍数
        *
        *
        *
        * */

        /**
         *
         * 1 - 4 之间 拿出任意3个数  最多能组成多少个数字  并打印
         * */
        int[] array = {1,2,3,4};
        int flag = 0;
        for(int i : array){
            // 先拿出百位的数赋值给i
            for(int j: array){
                // 再拿十位的数给j
                for(int k:array) {
                    // 最后拿个位数赋值给k
                    if(k!=j&&k!=i&&i!=j) {
                        flag++;
                        System.out.println(i * 100 + j * 10 + k);
                    }
                }
            }
        }
        System.out.println("1 - 4 之间 拿出任意3个数  最多能组成"+flag+"个数字");
        /**
         *  1-100之间的偶数和
         *
         * */
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);

        /**
         * 定义两个int变量 m和n  计算m的n次方
         *
         * */
        int m = 5;
        int n = 4;
        int s = 1;
        for(int i = 0;i<n;i++){
            s*=m;
        }
        System.out.println(s);
        /**
         * 100~999之间的水仙花数  例如 153  1^3+5^3+3^3=153
         *
         * */
        for(int i=100;i<=999;i++){
            //取百位
            int a=i/100;
            // 取十位
            int b=i/10%10;
            // 取个位
            int c = i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
        /**
         *两个正整数 计算最大公约数和最小公倍数
         *
         * 什么是最大公约数
         *    600        300
         *
         * */

        int x=10;
        int y=15;
        int max=1;
        int min=max(x,y);
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0){
                max=i;
            }
        }
        for(int i=min;i<=x*y;i++){
            if(i%x==0&&i%y==0){
                min=i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static int max(int a,int b){
        // 三目运算符
        //表达式?如果成立返回:如果不成立返回
        return (a>b)?a:b;
    }
}
