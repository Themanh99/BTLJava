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
    private Connection conn = null;
    private PreparedStatement pre = null;
    private Statement state =null;
    private ResultSet rs = null;
    public TaiKhoanDao() {
        
    }
            
    public boolean XacThucTaiKhoan(String tk,String mk){
        conn = JDBCConnection.getJDBCConnection();
        try {
            
            String sql = "select * from TAIKHOAN where tk=? and mk=?";   
            
            pre = conn.prepareStatement(sql);
            pre.setString(1, tk);
            pre.setString(2, mk);
            rs = pre.executeQuery();
           
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
        TaiKhoanDao tkd = new TaiKhoanDao();
        boolean kq = tkd.XacThucTaiKhoan("admin","admin");
        if(kq==true){
            System.out.println("Thanh cong");
        }
        else{
            System.out.println("That bai");
        }
    }
}
