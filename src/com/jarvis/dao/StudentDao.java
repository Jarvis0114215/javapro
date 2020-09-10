package com.jarvis.dao;

import com.jarvis.pojo.Student;
import com.jarvis.util.JdbcUtil;

import java.util.ArrayList;
import java.util.List;


/**
 * Create by Jia on 2020/2/18/018 15:47
 */
public class StudentDao implements IstudentDao{
    List<Student> list = new ArrayList<>();
    String url = "jdbc:mysql://192.168.204.204:3306/db1?useUnicode=true&characterEncoding=utf8";
    String user = "root";
    String password = "001017yxx";

    @Override
    public List<Student> query() {
        return JdbcUtil.executeQuery("select id,name,age,gender from student",Student.class);
    }

    @Override
    public int add(Student student) {
        return JdbcUtil.executeUpdate("insert into student(id,name,age,gender) values(?,?,?,?)",student.getId(),student.getName(),student.getAge(),student.getGender());
    }

    @Override
    public int update(Student student) {
        return JdbcUtil.executeUpdate("update student set name=?,age=?,gender=? where id=?",student.getName(),student.getAge(),student.getGender(),student.getId());
    }

    @Override
    public int del(int id) {
        return JdbcUtil.executeUpdate("delete from student where id=?",id);

    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
