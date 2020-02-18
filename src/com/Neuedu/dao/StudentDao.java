package com.Neuedu.dao;

import com.Neuedu.pojo.Student;

import java.sql.*;
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
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            pstmt = con.prepareStatement("select id,name,age,gender from student");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setGender(rs.getInt("gender"));
                list.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(rs != null)
                    rs.close();
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public int add(Student student) {
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 创建连接
            con = DriverManager.getConnection(url,user,password);
            // 创建命令行 写sql语句
            pstmt = con.prepareStatement("insert into student(id,name,age,gender) values(?,?,?,?)");
            // 设置 问好的值
            pstmt.setInt(1,student.getId());
            pstmt.setString(2,student.getName());
            pstmt.setInt(3,student.getAge());
            pstmt.setInt(4,student.getGender());
            // 执行sql语句
            // 如果是查询  调用 executeQuery方法 返回一个 ResultSet 结果集
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int update(Student student) {
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 创建连接
            con = DriverManager.getConnection(url,user,password);
            // 创建命令行 写sql语句
            pstmt = con.prepareStatement("update student set name=?,age=?,gender=? where id=?");
            // 设置 问好的值
            pstmt.setString(1,student.getName());
            pstmt.setInt(2,student.getAge());
            pstmt.setInt(3,student.getGender());
            pstmt.setInt(4,student.getId());
            // 执行sql语句
            // 如果是查询  调用 executeQuery方法 返回一个 ResultSet 结果集
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int del(int id) {
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 创建连接
            con = DriverManager.getConnection(url,user,password);
            // 创建命令行 写sql语句
            pstmt = con.prepareStatement("delete from student where id=?");
            // 设置 问好的值
            pstmt.setInt(1,id);
            // 执行sql语句
            // 如果是查询  调用 executeQuery方法 返回一个 ResultSet 结果集
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
