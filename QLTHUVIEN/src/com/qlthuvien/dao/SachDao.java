/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import com.qlthuvien.model.Sach;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class SachDao {
    //Lay ra danh sach Sach
    Connection conn = null;
    PreparedStatement ps = null;
    Statement state =null;
    ResultSet rs = null;
    public List<Sach> getSach(){
        conn = JDBCConnection.getJDBCConnection();
        try {
            
            state = conn.createStatement();
            String sql = "select * from SACH";
            rs = state.executeQuery(sql);
            List<Sach> list = new ArrayList<Sach>();
            while(rs.next()){
                 String maSach = rs.getString("maSach");
                 String tenSach = rs.getString("tenSach");
                 String tenTacGia= rs.getString("tenTacGia");
                 String tenNxb= rs.getString("tenNXB");
                 float giaSach= rs.getFloat("giaSach");
                 String theLoai= rs.getString("theLoai");
                 boolean trangthai= rs.getBoolean("trangthai");
                 int soluong = rs.getInt("soluong") ;
                 
                 Sach sach = new Sach(maSach, tenSach, tenTacGia, tenNxb, giaSach, theLoai, trangthai, soluong);
                 list.add(sach);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                if (rs != null) {
                    try {
                       rs.close();
                    } catch (SQLException e) { /* ignored */}
                }
                if (state != null) {
                    try {
                        state.close();
                    } catch (SQLException e) { /* ignored */}
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) { /* ignored */}
                }
         }
         return null;
       
        
    }
    
    /*public static void main(String[] args) {
        SachDao test = new SachDao();
        List<Sach> abc = test.TimSachBan("00", "", "", "", "");
        for(Sach sach :abc ){
            System.out.println(sach);
        }
    }*/
    
    
    
    
    //Tim sach
    public List<Sach> TimSach(String masach,String tensach,String tentacgia,String tennxb,String theloai){
        
        conn = JDBCConnection.getJDBCConnection();
        try {
            state = conn.createStatement();
            String sql="select * from sach where trangthai='true' and maSach like '%"+masach+"%' and tenSach like '%"+tensach+"%' and tenTacGia like'%"+tentacgia+"%' and tenNXB like '%"+tennxb+"%' and theLoai like '%"+theloai+"%'";      
            System.out.println(sql);
            rs=state.executeQuery(sql);
            List<Sach> list = new ArrayList<Sach>();
            while(rs.next()){
                 String maSach = rs.getString("maSach");
                 String tenSach = rs.getString("tenSach");
                 String tenTacGia= rs.getString("tenTacGia");
                 String tenNxb= rs.getString("tenNXB");
                 float giaSach= rs.getFloat("giaSach");
                 String theLoai= rs.getString("theLoai");
                 boolean trangthai= rs.getBoolean("trangthai");
                 int soluong = rs.getInt("soluong") ;
                 
                 Sach sach = new Sach(maSach, tenSach, tenTacGia, tenNxb, giaSach, theLoai, trangthai, soluong);
                 list.add(sach);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                if (rs != null) {
                    try {
                       rs.close();
                    } catch (SQLException e) { /* ignored */}
                }
                if (state != null) {
                    try {
                        state.close();
                    } catch (SQLException e) { /* ignored */}
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) { /* ignored */}
                }
         }
        return null;
    }
    
    
   
    
}
