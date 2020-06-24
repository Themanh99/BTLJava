/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import com.qlthuvien.model.ChiTietMuonTra;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author son30
 */
public class ChiTietMuonTraDao extends Dao {

    public int themChiTietMuonTra(String maPMUON, ArrayList<ChiTietMuonTra> ctmt) {
        try {
            conn = JDBCConnection.getJDBCConnection();
            int sl = 0;
            String sql = "insert into CHITIETMUONTRA(maPMUON,maSach,soluong,gia) values (?,?,?,?)";
            pre = conn.prepareStatement(sql);
            for (ChiTietMuonTra item : ctmt) {
//                String mapm = "";
//                String mas = "";
//                int sl = 0;
//                float gia = 0;
                pre.setString(1,item.getMaPMuon());
                pre.setString(2,item.getMaSach());
                pre.setInt(3,item.getSoluong());
                pre.setFloat(4,item.getGia());

                sl+= pre.executeUpdate();
            }
            return sl;
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietMuonTra.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return -1;

    }
    public ArrayList<ChiTietMuonTra> layChiTietMuonTra(String maPMUON){
        ArrayList<ChiTietMuonTra> list = new ArrayList<ChiTietMuonTra>();
                try {
            conn = JDBCConnection.getJDBCConnection();
            String sql = "select * from CHITIETMUONTRA where maPMUON='"+maPMUON +"'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while(rs.next()){
                String maPMuon = rs.getString("maPMuon");
                String maSach = rs.getString("maSach");
                int soluong  = rs.getInt("soluong");
                String ngaytra = rs.getString("ngayTra");
                float gia = rs.getFloat("gia");
                ChiTietMuonTra ct = new ChiTietMuonTra(maPMuon, maSach, soluong, ngaytra, gia);
                list.add(ct);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietMuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return null;
    }
    public int TraSach(String maP, ArrayList<String> sach){
        try {
            conn = JDBCConnection.getJDBCConnection();
            String sql = "update CHITIETMUONTRA set ngayTra = getdate() where maPMUON =? and maSach=?";
            pre = conn.prepareStatement(sql);
            int sl = 0;
            for(String s : sach){
                pre.setString(1, maP);
                pre.setString(2, s);
                sl += pre.executeUpdate();
            }
            
            return sl;
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietMuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }
        return -1;
    }
//    public static void main(String[] args) {
//        ChiTietMuonTraDao c = new ChiTietMuonTraDao();
//        ArrayList<ChiTietMuonTra> list = c.layChiTietMuonTra("PM0007");
//        if(list==null)
//            System.out.println("no");
//        for(ChiTietMuonTra item : list){
//            System.out.println(item.getNgaytra());
//        }
//        
//    }
}
