package com.jarvis.service;

import com.jarvis.dao.IstudentDao;
import com.jarvis.dao.StudentDao;
import com.jarvis.pojo.Student;

import java.util.List;

/**
 * Create by Jia on 2020/2/18/018 15:45
 */
public class StudentService implements IstudentService{
    IstudentDao studentDao = new StudentDao();
    @Override
    public List<Student> query() {
        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int del(int id) {
        return studentDao.del(id);
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
