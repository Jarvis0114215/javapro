package com.neuedu.util;

import com.neuedu.pojo.Dept;

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

    // 封装通用的查询(自己写的)
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
        }finally {
            close(con,pstmt,rs);
        }
        return list;
    }
    // 封装通用查询第二种
    public static <T> List<T> executeQuery(String sql,RowMap<T> rowMap,Object... params){
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
            while (rs.next()){
                T t = rowMap.rowMapping(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt,rs);
        }
        return list;
    }
    // 封装通用查询
    /*public static <T> List<T> executeQuery(String sql,Class<T> clz,Object... params){
        // Student 继承 Object
        // List<Student> 没有继承关系 List<Object>
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
                // 创建一个T类型的对象
                // 该方法是通过反射 class对象 调用 无参构造来创建对象
                T t= clz.newInstance();
                // 通过 字段名 从 rs中 拿值  然后赋值给 对象的属性
                // 在不知道 该类有多少个属性的情况下 应该是 有多少个属性 就set多少个属性
                // 我们必须先获取有多少个属性
                Field[] fields = clz.getDeclaredFields();
                for(Field f : fields){
                    // 属性名 刚好和 数据库字段名一样了
                    // 我们就可以把属性名 当做数据库里的字段名 用 rs.getObject(属性名)
                    // deptno dname local
                    try {
                        // f.getName() 可能和 数据库中的字段名不同
                        // 那么我们就先看 该属性有没有 Column注解  如果有 我们用注解的值当做字段名
                        // 如果没有注解 我们再把 f.getName() 当做字段名
                        // 此刻就要先判断 该属性下 有没有 Column注解
                        String column=f.getName();
                        if(f.isAnnotationPresent(Column.class)){
                            // 如果有 我们就要获取到注解的值 来替换 column的值
                            // 获取注解
                            Column c = f.getAnnotation(Column.class);
                            // 用注解的value 替换 column
                            column = c.value();
                        }
                        Object value = rs.getObject(column);
                        // 拿出值之后 我们就可以为 属性赋值了
                        // 为属性赋值 属性对象是 Field 但是我们必须指明 我们要为哪个对象的属性赋值
                    *//*
                     我们用 field 调用set方法 可以进行赋值
                        第一个参数 传一个对象  表示为哪个对象的该属性赋值

                        第二个参数 传值 表示 赋什么样的值

                        注意 如果该属性是 private 那么在赋值之前必须先打开权限
                     *//*
                        f.setAccessible(true);
                        f.set(t, value);
                    }catch (Exception ex){}
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            close(con,pstmt,rs);
        }
        return list;
    }*/
    // 封装通用查询  List 的泛型是什么类型  我们就要放一个什么类型的对象
    /*public static <T> List<T> executeQuery(String sql,RowMap<T> rowMap, Object... params){
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
            while (rs.next()){
                // 不同的表 对 resultset的处理方式不同
                // 对象不同  并且属性值不同
                // 换句话说 也就是 不同的表 我们要创建不同的对象 拿着ResultSet赋不同的值
                // 再换句话说  我们要把对 resultset的处理方式(代码块)作为参数进行传递
                T t = rowMap.rowMapping(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt,rs);
        }
        return list;
    }*/

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
