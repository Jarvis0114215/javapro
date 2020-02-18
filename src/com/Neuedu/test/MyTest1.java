package com.Neuedu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Create by Jia on 2020/2/18/018 11:19
 */
public class MyTest1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.204.204:3306/db1?useUnicode=true&characterEncoding=utf8";
        String user = "root";
        String password = "001017yxx";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            pstmt = con.prepareStatement("drop database student");
            int i =pstmt.executeUpdate();
            System.out.println(i);
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
    }
}
