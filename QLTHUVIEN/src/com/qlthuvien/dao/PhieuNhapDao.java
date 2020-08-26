/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import com.qlthuvien.model.PhieuNhap;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author son30
 */
public class PhieuNhapDao extends Dao{
    public int getSoLuongPhieu(){
        conn = JDBCConnection.getJDBCConnection();
        int sl=0;
        
        try {
            state = conn.createStatement();
            String sql ="select count(maPN) as 'tongphieu' from PHIEUNHAP ";
            rs = state.executeQuery(sql);
            while(rs.next()){
                sl = rs.getInt("tongphieu");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }
            
            
        
        return sl;
    }
    
    public int themPhieuNhap(PhieuNhap pn){
        conn = JDBCConnection.getJDBCConnection();
        int kq=0;
        String sql = "insert into PHIEUNHAP(maPN,maNCC,tongtien) values(?,?,?)";
        
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1,pn.getMaPN());
            pre.setString(2, pn.getMaNCC());
            pre.setFloat(3, pn.getTongtien());
            
            kq=pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PhieuNhapDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }
        return kq;
        
    }
    
}
