/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import com.qlthuvien.model.PhieuMua;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class PhieuMuaDao extends Dao{
    public int getSoLuongPhieu(){
        conn = JDBCConnection.getJDBCConnection();
        int sl=0;
        try {
            state = conn.createStatement();
            String sql ="select count(maPMUA) as 'tongphieu' from PHIEUMUA ";
            rs = state.executeQuery(sql);
            while(rs.next()){
                sl = rs.getInt("tongphieu");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            CloseAll();
        }
        return sl;
    }
    
    public void themPhieuMua(PhieuMua pm){
        conn = JDBCConnection.getJDBCConnection();
        String sql = "insert into PHIEUMUA(maPMUA,maSV,tongtien) values(?,?,?)";
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1,pm.getMaPMua());
            pre.setString(2, pm.getMaSV());
            pre.setFloat(3, pm.getTongtien());
            int kq = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuaDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }
        
    }
    
}
