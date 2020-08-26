/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import com.qlthuvien.model.ChiTietMua;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ChiTietMuaDao extends Dao{
    public int themChiTietMua(ChiTietMua chiTietMua){
        int kq=0;
        conn = JDBCConnection.getJDBCConnection();
        String sql = "insert into CHITIETMUA values(?,?,?,?)";
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1, chiTietMua.getMaPMua());
            pre.setString(2, chiTietMua.getMaSach());
            pre.setInt(3, chiTietMua.getSoluong());
            pre.setFloat(4, chiTietMua.getGia());
            
            kq = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietMuaDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }
        return kq;
        
    }
    
    
}
