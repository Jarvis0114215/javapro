package com.jarvis.MyTest;

/**
 * Create by Jia on 2020/2/7/007 15:43
 */
public class MyTest9 {
    public static int[] a = {1,2,3,4,5};
    public static void main(String[] args) {
        /*a = new int[]{1,4,3,2,5};
        String a = "abc";
        String b = "abc";
        System.out.println(a==b);*/
       /* char[] a = new char[]{'a','b','c'};
        char[] b = new char[]{'a','b','c'};*/
        /*String a = new String("abc");
        String b = new String("abc");
        System.out.println(a==b);
        System.out.println(a.equals(b));*/
        /*StringBuffer buffer = new StringBuffer("a");
        buffer.append("b");
        buffer.append("c");
        buffer.append("111");
        buffer.append(222);
        System.out.println(buffer.toString());*/
        /*StringBuilder builder = new StringBuilder("a");
        builder.append("b");
        builder.append("c");
        builder.append("111");
        builder.append(222);
        System.out.println(builder.toString());*/
        String a = "hello";
        String b = "he"+new String("llo");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);
        System.out.println(a.equals(b));

    }
}
