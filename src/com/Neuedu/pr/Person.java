package com.Neuedu.pr;

/**
 * @auther Jia
 * @date 2020/2/4/004 10:29
 */
public class Person extends Animal{
    private char sex;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public void run() {
        System.out.println("人");
    }
}
