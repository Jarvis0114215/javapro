package com.Neuedu.s1;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by Jia on 2020/2/6/006 21:06
 */
public class MyTest8 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();

        //写入(尾部插入)
        Date startarray = new Date();   //开始的时候获取一下当前时间
        for(int i=0;i<100000;i++){
            arrayList.add(i);
        }
        Date endarray = new Date();     //结束的时候获取一下当前时间
        //结束时的时间-开始时的时间=添加用时  getTime()单位是毫秒
        System.out.println("ArrayList尾部添加用时"+(endarray.getTime()-startarray.getTime()));

        //写入(尾部插入)
        Date startLinkedList = new Date();   //开始的时候获取一下当前时间
        for(int i=0;i<100000;i++){
            linkedList.add(i);
        }
        Date endLinkedList = new Date();     //结束的时候获取一下当前时间
        System.out.println("LinkedList尾部添加用时"+(endLinkedList.getTime()-startLinkedList.getTime()));

        /*//写入(中间插入)
        Date startarray = new Date();   //开始的时候获取一下当前时间
        for(int i=0;i<100000;i++){
            arrayList.add(0,i);
        }
        Date endarray = new Date();     //结束的时候获取一下当前时间
        //结束时的时间-开始时的时间=添加用时  getTime()单位是毫秒
        System.out.println("ArrayList中间插入添加用时"+(endarray.getTime()-startarray.getTime()));

        //写入(中间插入)
        Date startLinkedList = new Date();   //开始的时候获取一下当前时间
        for(int i=0;i<100000;i++){
            linkedList.add(0,i);
        }
        Date endLinkedList = new Date();     //结束的时候获取一下当前时间
        System.out.println("LinkedList中间插入添加用时"+(endLinkedList.getTime()-startLinkedList.getTime()));*/

        /*//读取array
        Date startreadarray = new Date();
        for(int i=0;i<arrayList.size();i++){
            Object obj = arrayList.get(i);
        }
        Date endreadarray = new Date();
        System.out.println("ArrayList读取用时"+(endreadarray.getTime()-startreadarray.getTime()));
        //读取linked
        Date startreadlinked = new Date();
        for(int i=0;i<linkedList.size();i++){
            Object obj = linkedList.get(i);
        }
        Date endreadLinked= new Date();
        System.out.println("LinkedList读取用时"+(endreadLinked.getTime()-startreadlinked.getTime()));*/

    }
}
