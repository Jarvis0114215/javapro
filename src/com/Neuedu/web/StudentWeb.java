package com.Neuedu.web;

import com.Neuedu.pojo.Student;
import com.Neuedu.service.IstudentService;
import com.Neuedu.service.StudentService;

import java.util.List;
import java.util.Scanner;

/**
 * Create by Jia on 2020/2/18/018 14:40
 */
public class StudentWeb {
    IstudentService studentService = new StudentService();
    public void showmain(){
        System.out.println("---------------------------");
        System.out.println("1-----------------------查询");
        System.out.println("2-----------------------添加");
        System.out.println("3-----------------------修改");
        System.out.println("4-----------------------删除");
        System.out.println("其他--------------------退出");
        System.out.println("---------------------------");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==1){
            query();
        }else if(i==2){
            add(scanner);
        }else if(i==3){
            update(scanner);
        }else if(i==4){
            del(scanner);
        }else{
            System.exit(0);
        }
    }
    public void query(){
       List<Student> list = studentService.query();
       for(Student student : list){
           System.out.println(student);
       }
    }
    private void add(Scanner scanner){
        System.out.println("请输入要添加的id");
        int id = scanner.nextInt();
        System.out.println("请输入要添加的名字");
        String name = scanner.next();
        System.out.println("请输入要添加的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入性别 1-男 0-女");
        int gender = scanner.nextInt();
        Student student = new Student(id,name,age,gender);
        // 调用服务层 添加该数据
        studentService.add(student);
        // 显示列表
        query();
    }
    private void update(Scanner scanner){
        System.out.println("请输入要修改的id");
        int id = scanner.nextInt();
        System.out.println("请输入要修改的名字");
        String name = scanner.next();
        System.out.println("请输入要修改的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入要修改性别 1-男 0-女");
        int gender = scanner.nextInt();
        Student student = new Student(id,name,age,gender);
        // 调用服务层 修改方法
        studentService.update(student);
        // 显示列表
        query();
    }
    private void del(Scanner scanner){
        System.out.println("请输入要删除的id");
        int id = scanner.nextInt();
        // 调用服务层删除方法
        studentService.del(id);
        // 显示列表
        query();
    }
}