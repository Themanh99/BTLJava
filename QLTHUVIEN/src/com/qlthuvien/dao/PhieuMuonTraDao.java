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
 * @author son30
 */
public class PhieuMuonTraDao extends Dao {

    public int getSlPhieuMuon() {
        try {
            conn = JDBCConnection.getJDBCConnection();
            int sl = 0;
            String sql = "select count(maPMUON) from PHIEUMUONTRA ";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                sl += rs.getInt(1);
            }
            return sl;
        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return -1;
    }
    public int themPhieuMuonTra(String mapm, String masv, float tongtien){
        try {
            conn = JDBCConnection.getJDBCConnection();
            String sql = "insert into PHIEUMUONTRA(maPMUON,maSV,tongtien) values ('"+mapm+"','"+masv+"',"+tongtien+")";
            state = conn.createStatement();
            int t = state.executeUpdate(sql);
            return t;
        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return -1;
    }
    
    public static void main(String[] args) {
        PhieuMuonTraDao pm = new PhieuMuonTraDao();
        System.out.println(pm.getSlPhieuMuon());
    }
}
