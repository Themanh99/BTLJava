/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import com.qlthuvien.model.SinhVien;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class SinhVienDao extends Dao {

    public SinhVienDao() {
    }

    public SinhVien getSinhVien(String masv) {
        conn = JDBCConnection.getJDBCConnection();
        SinhVien sv = new SinhVien();
       
        try {
            state = conn.createStatement();
            
            String sql = "select * from SINHVIEN where masv='" + masv + "'";
            System.out.println(sql);
            rs = state.executeQuery(sql);
            
            while (rs.next()) {
                String masinhvien= rs.getString("maSV");
                String tensv = rs.getString("tenSV");
                String email = rs.getString("emailSV");
                String sdt = rs.getString("sdtSV");            
                sv = new SinhVien(masinhvien, tensv, email, sdt);                                                            
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sv;

    }

    public static void main(String[] args) {
        SinhVienDao sv = new SinhVienDao();
        System.out.println(sv.getSinhVien("2017601707"));
    }
}
