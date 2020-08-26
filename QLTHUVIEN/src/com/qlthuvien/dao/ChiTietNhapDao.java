/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;


import com.qlthuvien.model.ChiTietPN;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ChiTietNhapDao extends Dao{
    public int themChiTietNhap(ChiTietPN chiTietNhap){
        conn = JDBCConnection.getJDBCConnection();
        int kq=0;
        String sql = "insert into CHITIETPN(maPN,maSach,soluongnhap,gia) values(?,?,?,?)";
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1, chiTietNhap.getMaPN());
            pre.setString(2, chiTietNhap.getMaSach());
            pre.setInt(3, chiTietNhap.getSoluongnhap());
            pre.setFloat(4, chiTietNhap.getGia());
            
            kq=pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietMuaDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }
        return kq;
        
    }
    
//    public static void main(String[] args) {
//        ChiTietNhapDao test = new ChiTietNhapDao();
//        test.themChiTietNhap(new ChiTietPN("PN0007", "MS0002", 5, 2000));
//    }
}
