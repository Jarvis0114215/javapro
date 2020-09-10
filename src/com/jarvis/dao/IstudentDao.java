package com.jarvis.dao;

import com.jarvis.pojo.Student;

import java.util.List;

/**
 * Create by Jia on 2020/2/18/018 15:46
 */
public interface IstudentDao {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int id);
    Student queryOne(int id);
}
