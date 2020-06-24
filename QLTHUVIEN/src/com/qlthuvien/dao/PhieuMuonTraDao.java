/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import com.qlthuvien.model.PhieuMuonTra;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author son30
 */
public class PhieuMuonTraDao extends Dao {

    public int LaySlPhieuMuon() {
        try {
            conn = JDBCConnection.getJDBCConnection();
            int sl = 0;
            String sql = "select count(maPMUON) from PHIEUMUONTRA ";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            
//            Calendar calendar = Calendar.getInstance();
//            java.util.Date currentTime = calendar.getTime();
//            long time = currentTime.getTime();
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setTimestamp(2, new Timestamp(time));
            
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
    public int ThemPhieuMuonTra(String mapm, String masv, float tongtien){
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
    public ArrayList<PhieuMuonTra> LayPhieuMuonTra(){
        ArrayList<PhieuMuonTra> listPhieu = new ArrayList<PhieuMuonTra>();
        
        try {
            conn = JDBCConnection.getJDBCConnection();
            String sql = "select * from PHIEUMUONTRA";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while(rs.next()){
                String maPMUON  = rs.getString("maPMUON");
                String ngayMuon = rs.getString("ngayMuon");
                String maSV = rs.getString("maSV");
                float tongtien = rs.getFloat("tongtien");
                
                PhieuMuonTra pm = new PhieuMuonTra(maPMUON, ngayMuon, maSV, tongtien);
                listPhieu.add(pm);
            }
            return listPhieu;
        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return null;
    }
    public ArrayList<PhieuMuonTra> TimPhieu( String maPMUON , String maSV){
        try {
            ArrayList<PhieuMuonTra> listPhieu = new ArrayList<PhieuMuonTra>();
            conn = JDBCConnection.getJDBCConnection();
            String sql = "select * from PHIEUMUONTRA where maPMUON like '%"+maPMUON+"%' and maSV like '%"+maSV+"%'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while(rs.next()){
                PhieuMuonTra p = new PhieuMuonTra(
                        rs.getString("maPMUON"), 
                        rs.getString("ngayMuon"), 
                        rs.getString("maSV"), 
                        rs.getFloat("tongtien")
                );
                listPhieu.add(p);
            }
            return listPhieu;
        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            CloseAll();
        }
        return null;
    }
//    public static void main(String[] args) {
//        PhieuMuonTraDao pm = new PhieuMuonTraDao();
////        System.out.println(pm.LaySlPhieuMuon());
//        ArrayList<PhieuMuonTra> Tim = new ArrayList<PhieuMuonTra>();
//        Tim = pm.LayPhieuMuonTra();
//        for(PhieuMuonTra item : Tim){
//            System.out.println(item.getMaPMuon()+item.getMaSV()+item.getNgayMuon()+item.getTongtien());
//        }
//    }
}
