package com.neuedu.test;

import com.neuedu.pojo.Dept;
import com.neuedu.util.JdbcUtil;
import com.neuedu.util.RowMap;
import com.neuedu.web.StudentWeb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Create by Jia on 2020/2/18/018 14:40
 */
public class MyTest2 {
    public static void main(String[] args) {
        StudentWeb studentWeb = new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();
       /* Class clz = Dept.class;
        List<Dept> list = JdbcUtil.executeQuery("select deptno,dname,loc from dept",Dept.class);*/

        /*Class clz = Student.class;
        List<Student> list = JdbcUtil.executeQuery("select id,name,age,gender from student",Student.class);
        System.out.println(list);*/

        /*Class clz = Dept.class;
        List<Dept> list = JdbcUtil.executeQuery("select deptno,dname,loc from dept", new RowMap<Dept>() {
            @Override
            public Dept rowMapping(ResultSet rs) {
                Dept dept = new Dept();
                try {
                    dept.setDeptno(rs.getInt("deptno"));
                    dept.setDname(rs.getString("dname"));
                    dept.setLoction(rs.getString("loc"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return dept;
            }
        });
        System.out.println(list);*/
    }
}
