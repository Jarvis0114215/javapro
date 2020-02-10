package com.Neuedu.s1;

/**
 * Create by Jia on 2020/2/5/005 18:43
 */
public class Animal {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void run(){
        System.out.println("动物会跑");
    }
}
