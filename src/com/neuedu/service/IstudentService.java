package com.neuedu.service;

import com.neuedu.pojo.Student;

import java.util.List;

/**
 * Create by Jia on 2020/2/18/018 14:52
 */
public interface IstudentService {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int id);
    Student queryOne(int id);
}
