/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import com.qlthuvien.model.Sach;
import com.qlthuvien.model.TaiKhoan;
import com.qlthuvien.view.XacNhanMuaJFrame;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class TaiKhoanDao extends Dao{

    public static boolean loaiTK;
    public static String tklogin="", mklogin="";
    public static boolean loaitklogin;
    public static ArrayList<TaiKhoan> list1 = new ArrayList<TaiKhoan>();
    
    public TaiKhoanDao() {
        loaiTK = false;
    }
    
    public String getTK(){
        return tklogin;
    }

    public boolean XacThucTaiKhoan(String tk, String mk) {
        conn = JDBCConnection.getJDBCConnection();
        try {

            String sql = "select * from TAIKHOAN where tk=? and mk=?";

            pre = conn.prepareStatement(sql);
            pre.setString(1, tk);
            pre.setString(2, mk);
            rs = pre.executeQuery();
  
            String pass = "";
            while (rs.next()) {
                pass = rs.getString("mk");
                tklogin = rs.getString("tk");
                mklogin = rs.getString("mk");
                if (rs.getInt("loaitk") == 0) {
                    loaiTK = false;
                    loaitklogin = false;
                } else {
                    loaiTK = true;
                    loaitklogin = true;
                }
            }

            return pass.equals(mk);

        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }

        return false;
    }



    public List<TaiKhoan> gettaikhoan() {
        conn = JDBCConnection.getJDBCConnection();

        try {
            state = conn.createStatement();
            String sql = "select * from TAIKHOAN";
            rs = state.executeQuery(sql);
            List<TaiKhoan> list = new ArrayList<TaiKhoan>();
            while (rs.next()) {
                String Tk = rs.getString("tk");
                String Mk = rs.getString("mk");
                boolean Loaitk = rs.getBoolean("loaitk");

                TaiKhoan taikhoan = new TaiKhoan(Tk, Mk, Loaitk);
                list.add(taikhoan);
                list1.add(taikhoan);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }

        return null;
    }

    public List<TaiKhoan> TimTk(String tk) {

        conn = JDBCConnection.getJDBCConnection();
        
        try {
            state = conn.createStatement();
             String sql = "select * from taikhoan where tk like '%" + tk + "%'";
            System.out.println(sql);
            rs = state.executeQuery(sql);
            List<TaiKhoan> list = new ArrayList<TaiKhoan>();
            while (rs.next()) {
                String Tk = rs.getString("tk");
                String Mk = rs.getString("mk");
                boolean loaiTK = rs.getBoolean("loaiTk");
                TaiKhoan taikhoan = new TaiKhoan(Tk, Mk, loaiTK);
                list.add(taikhoan);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }
           
        
        return null;
    }
    public int ResetPass(String tk){
       conn = JDBCConnection.getJDBCConnection();
       int n = 0;
       try{
           String sql = "update TAIKHOAN set mk='1' where tk=?";  
            pre = conn.prepareStatement(sql);
            pre.setString(1, tk);
            n = pre.executeUpdate(); 
           //System.out.println("n ="+n);
       }catch(SQLException ex){
           Logger.getLogger(TaiKhoanDao.class.getName()).log(Level.SEVERE, null, ex);
       }
       return n;
    }
    public int themTaiKhoan(TaiKhoan taikhoan) {
        conn = JDBCConnection.getJDBCConnection();
        int n = 0;
        String sql = "Insert into TAIKHOAN(tk,mk,loaitk) "
                + " values('" + taikhoan.getTk()+ "','" + taikhoan.getMk()+ "'," + (taikhoan.getLoaiTk()? 1:0)+")";
        try {
            Statement state = conn.createStatement();
            n = state.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
   public int DeleteTaiKhoan(String tk){
       conn = JDBCConnection.getJDBCConnection();
       int n = 0;
        try {
            String sql = "Delete from TAIKHOAN  where tk =?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, tk);
            n = pre.executeUpdate();                     
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDao.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return n;
    }
   public int SuaMK(String tk, String mk) {
       int n = 0;
       conn = JDBCConnection.getJDBCConnection();
       try{
        String sql = "UPDATE TAIKHOAN SET mk=? where tk=? ";
        pre = conn.prepareStatement(sql);
        pre.setString(1, mk);
        pre.setString(2, tk);
        n = pre.executeUpdate();
       }catch(SQLException ex){
           Logger.getLogger(TaiKhoanDao.class.getName()).log(Level.SEVERE, null, ex);
       }
       return n;
    }
   
}
