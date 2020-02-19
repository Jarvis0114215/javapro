package com.Neuedu.util;

import com.Neuedu.pojo.Column;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by Jia on 2020/2/19/019 13:41
 */
public class JdbcUtil {
    private static final String URL = "jdbc:mysql://192.168.204.204:3306/db1?useUnicode=true&characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PASSWORD = "001017yxx";
    //加载驱动 只加载一次所以用static
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //创建连接
    static Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    // 封装通用的增删改
    public static int executeUpdate(String sql,Object... params){
        int result = 0;
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for(int i = 0; i < params.length; i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt);
        }
        return result;
    }

    // 封装通用的查询
    public static <T> List<T> executeQuery(String sql,Class<T> clz,Object... params){
        List<T> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for(int i = 0; i < params.length; i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            rs = pstmt.executeQuery();
            while(rs.next()){
                T t = clz.newInstance();
                Field[] fields = clz.getDeclaredFields();
                for(Field f : fields){
                    String column = f.getName();
                    //判断是否有注解 isAnnotationPresent(Column.class)返回boolean
                    if(f.isAnnotationPresent(Column.class)){
                        //如果有注解 获取注解
                        Column c = f.getAnnotation(Column.class);
                        column = c.value();
                    }
                    Object value = rs.getObject(column);
                    f.setAccessible(true);
                    f.set(t,value);
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return list;
    }



    //封装关闭方法
    static void close(Connection con,PreparedStatement pstmt){
        try {
            if(pstmt != null)
                pstmt.close();
            if(con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void close(Connection con, PreparedStatement pstmt, ResultSet rs){
        try {
            rs.close();
            close(con,pstmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
