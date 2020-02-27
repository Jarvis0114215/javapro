package com.neuedu.MyTest;

/**
 * Create by Jia on 2020/2/5/005 19:44
 */
public abstract class Teacher {
    public Teacher() {
        super();
    }
    public Teacher(String name,int age){
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;

    public abstract void teach();

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
}
