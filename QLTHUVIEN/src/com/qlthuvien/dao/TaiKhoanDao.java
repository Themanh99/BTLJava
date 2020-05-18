/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;


import com.qlthuvien.view.XacNhanMuaJFrame;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TaiKhoanDao {
    public static boolean loaiTK;

    public TaiKhoanDao() {
    }
            
    public static boolean XacThucTaiKhoan(String tk,String mk){
       
        try {
            Statement statement = JDBCConnection.getJDBCConnection().createStatement();
            String sql = "select * from TAIKHOAN where tk='"+tk+"' and mk='"+mk+"'";        
            ResultSet rs = statement.executeQuery(sql);
           
            String pass="";
            while(rs.next()){
                pass = rs.getString("mk"); 
                System.out.println(pass);
                System.out.println(rs.getInt("loaitk"));
                if(rs.getInt("loaitk")==0){
                    loaiTK=false;
                }
                else loaiTK=true;
            }
                    
            return pass.equals(mk);
            
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return false;
    }
    
    public static void main(String[] args) {
        boolean kq = XacThucTaiKhoan("admin","admin");
        if(kq==true){
            System.out.println("Thanh cong");
        }
        else{
            System.out.println("That bai");
        }
    }
}
