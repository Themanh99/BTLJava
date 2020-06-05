/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

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
    public static void main(String[] args) {
        PhieuMuaDao pm = new PhieuMuaDao();
        System.out.println(pm.getSoLuongPhieu());
    }
}
