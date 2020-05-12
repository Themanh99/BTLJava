/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class JDBCConnection {
    public static Connection getJDBCConnection(){
        try {
            
            String username= "sa";
            String password = "123";
            String url ="jdbc:sqlserver://localhost:1433;databaseNam=QLThuVien;username="+username+";password="+password; 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                return DriverManager.getConnection(url);
            } catch (SQLException ex) {
                Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    
    public static void main(String[] args) {
        Connection conn = JDBCConnection.getJDBCConnection();
        if(conn != null){
            System.out.println("Thanh cong");
        }
        else{
            System.out.println("That bai");
        }
    }
    
}
