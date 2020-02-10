package com.Neuedu.pr;

public class MyTest1 {
    public static void main(String[] args) {
        /*int a = 1;
        int b = 3;
        System.out.println("First_Class.main");
        System.out.println(a+b);*/

        /*Dog d1 = new Dog();
        d1.setAge(59);
        d1.setSex('公');
        System.out.println(d1.getAge());
        System.out.println(d1.getSex());*/

        /*判断闰年 四年一闰 百年不闰 四百年一闰
        int year;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你要判断的年份：");
        year = in.nextInt();
        if((year%4 == 0 && year%100 != 0)||(year%400 == 0)){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }*/

        /*1~100累加
        int sum = 0;
        for(int i=1;i<=100;i++){
            sum +=i;
        }
        System.out.println(sum);*/

        /*1~100质数和*/
        /*int sum = 0;
        for (int m = 2; m <= 100; m++) {
            int flag = 0;
            for (int n = 2; n < m; n++) {
                if (m % n == 0) {
                    flag++;
                }
            }
            if (flag == 0) {
                sum += m;
            }
        }
        System.out.print(sum);*/

        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);



    }
}

