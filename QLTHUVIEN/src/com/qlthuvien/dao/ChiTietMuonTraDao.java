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

    public int insertChiTietPMT(ArrayList<ChiTietMuonTra> ctmt) {
        try {
            conn = JDBCConnection.getJDBCConnection();
            int sl = 0;
            String sql = "insert into CHITIETMUONTRA(maPMUON,maSach,soluong,gia) values ('?','?',?,?)";
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
            Logger.getLogger(PhieuMuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return -1;

    }
}
