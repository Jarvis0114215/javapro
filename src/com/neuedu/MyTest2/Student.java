package com.neuedu.MyTest2;

import java.io.Serializable;

/**
 * Create by Jia on 2020/2/12/012 22:16
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -1529975472479161951L;
    private String name;
    private String Grade;
    private int age;
    private int Id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Grade='" + Grade + '\'' +
                ", age=" + age +
                ", Id=" + Id +
                '}';
    }
}
