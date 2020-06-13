/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import com.qlthuvien.model.Sach;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class SachDao extends Dao {

    //Lay ra danh sach Sach
    public List<Sach> getSach() {
        conn = JDBCConnection.getJDBCConnection();
        try {

            state = conn.createStatement();
            String sql = "select * from SACH";
            rs = state.executeQuery(sql);
            List<Sach> list = new ArrayList<Sach>();
            while (rs.next()) {
                String maSach = rs.getString("maSach");
                String tenSach = rs.getString("tenSach");
                String tenTacGia = rs.getString("tenTacGia");
                String tenNxb = rs.getString("tenNXB");
                float giaSach = rs.getFloat("giaSach");
                String theLoai = rs.getString("theLoai");
                boolean trangthai = rs.getBoolean("trangthai");
                int soluong = rs.getInt("soluong");

                Sach sach = new Sach(maSach, tenSach, tenTacGia, tenNxb, giaSach, theLoai, trangthai, soluong);
                list.add(sach);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return null;

    }


    public List<Sach> TimSachBan(String masach, String tensach, String tentacgia, String tennxb, String theloai) {

        conn = JDBCConnection.getJDBCConnection();
        try {
            state = conn.createStatement();
            String sql = "select * from sach where trangthai='true' and maSach like '%" + masach + "%' and tenSach like '%" + tensach + "%' and tenTacGia like'%" + tentacgia + "%' and tenNXB like '%" + tennxb + "%' and theLoai like '%" + theloai + "%'";
            
            rs = state.executeQuery(sql);
            List<Sach> list = new ArrayList<Sach>();
            while (rs.next()) {
                String maSach = rs.getString("maSach");
                String tenSach = rs.getString("tenSach");
                String tenTacGia = rs.getString("tenTacGia");
                String tenNxb = rs.getString("tenNXB");
                float giaSach = rs.getFloat("giaSach");
                String theLoai = rs.getString("theLoai");
                boolean trangthai = rs.getBoolean("trangthai");
                int soluong = rs.getInt("soluong");

                Sach sach = new Sach(maSach, tenSach, tenTacGia, tenNxb, giaSach, theLoai, trangthai, soluong);
                list.add(sach);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return null;
    }

    public List<Sach> TimSachMuon(String masach, String tensach, String tentacgia, String tennxb, String theloai) {

        conn = JDBCConnection.getJDBCConnection();
        try {
            state = conn.createStatement();
            String sql = "select * from sach where trangthai='false' and maSach like '%" + masach + "%' and tenSach like '%" + tensach + "%' and tenTacGia like'%" + tentacgia + "%' and tenNXB like '%" + tennxb + "%' and theLoai like '%" + theloai + "%'";
            System.out.println(sql);
            rs = state.executeQuery(sql);
            List<Sach> list = new ArrayList<Sach>();
            while (rs.next()) {
                String maSach = rs.getString("maSach");
                String tenSach = rs.getString("tenSach");
                String tenTacGia = rs.getString("tenTacGia");
                String tenNxb = rs.getString("tenNXB");
                float giaSach = rs.getFloat("giaSach");
                String theLoai = rs.getString("theLoai");
                boolean trangthai = rs.getBoolean("trangthai");
                int soluong = rs.getInt("soluong");

                Sach sach = new Sach(maSach, tenSach, tenTacGia, tenNxb, giaSach, theLoai, trangthai, soluong);
                list.add(sach);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return null;
    }
    
    public List<Sach> TimSach(String masach, String tensach, String tentacgia, String tennxb, String theloai) {

        conn = JDBCConnection.getJDBCConnection();
        try {
            state = conn.createStatement();
            String sql = "select * from sach where maSach like '%" + masach + "%' and tenSach like '%" + tensach + "%' and tenTacGia like'%" + tentacgia + "%' and tenNXB like '%" + tennxb + "%' and theLoai like '%" + theloai + "%'";
            System.out.println(sql);
            rs = state.executeQuery(sql);
            List<Sach> list = new ArrayList<Sach>();
            while (rs.next()) {
                String maSach = rs.getString("maSach");
                String tenSach = rs.getString("tenSach");
                String tenTacGia = rs.getString("tenTacGia");
                String tenNxb = rs.getString("tenNXB");
                float giaSach = rs.getFloat("giaSach");
                String theLoai = rs.getString("theLoai");
                boolean trangthai = rs.getBoolean("trangthai");
                int soluong = rs.getInt("soluong");

                Sach sach = new Sach(maSach, tenSach, tenTacGia, tenNxb, giaSach, theLoai, trangthai, soluong);
                list.add(sach);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return null;
    }
    
    public String LayTenSachTheoMa(String mas){
        conn = JDBCConnection.getJDBCConnection();
        try {
            state = conn.createStatement();
            String sql = "select tenSach  from sach where maSach='"+mas+"'";
            String s="";
            rs = state.executeQuery(sql);
            while(rs.next()){
                s = rs.getString("tenSach");
            }
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return null;
    }
    public int UpdateSach(Sach sach){
       conn = JDBCConnection.getJDBCConnection();
       int n = 0;
        try {
            String sql = "update SACH set tenSach =?, tenTacGia=? , tenNXB=? , giaSach=? , theLoai=? , soluong=? where maSach=?";  
            pre = conn.prepareStatement(sql);
            pre.setString(1, sach.getTenSach());
            pre.setString(2, sach.getTenTacGia());
            pre.setString(3, sach.getTenNxb());
            pre.setFloat(4, sach.getGiaSach());
            pre.setString(5, sach.getTheLoai());
            pre.setInt(6, sach.getSoluong());
            pre.setString(7,sach.getMaSach());
            n = pre.executeUpdate(); 
            System.out.println("n = "+n);
        } catch (SQLException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        }     
        return n;
    }
    
    public void ThemSach(Sach sach){
        conn = JDBCConnection.getJDBCConnection();
        String sql="insert into SACH (maSach,tenSach,tenTacGia,tenNXB,giaSach ,theLoai,trangthai ,soluong) values(?,?,?,?,?,?,?,?)" ;
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1, sach.getMaSach());
            pre.setString(2, sach.getTenSach());
            pre.setString(3, sach.getTenTacGia());
            pre.setString(4, sach.getTenNxb());
            pre.setFloat(5, sach.getGiaSach());
            pre.setString(6, sach.getTheLoai());
            pre.setBoolean(7, sach.isTrangthai());
            pre.setInt(8, sach.getSoluong());
            
            pre.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }
                
    }
    
    public int getSoLuongSach(){
        conn = JDBCConnection.getJDBCConnection();
        int sl=0;
        try {
            state = conn.createStatement();
            String sql ="select count(maSach) as 'tongphieu' from SACH ";
            rs = state.executeQuery(sql);
            while(rs.next()){
                sl = rs.getInt("tongphieu");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }
        return sl;
            
    }
    

}
