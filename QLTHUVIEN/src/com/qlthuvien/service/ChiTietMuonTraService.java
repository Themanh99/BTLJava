/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.ChiTietMuonTraDao;
import com.qlthuvien.model.ChiTietMuonTra;
import com.qlthuvien.model.GioHang;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author son30
 */
public class ChiTietMuonTraService {
    ChiTietMuonTraDao ctmtDao ;

    public ChiTietMuonTraService() {
        ctmtDao = new ChiTietMuonTraDao();
    }
    public int themChiTietMuonTra(String maPMUON, Hashtable<String, GioHang> dsGioHang){
        int slhang=0;
        ArrayList<ChiTietMuonTra> list = new ArrayList<ChiTietMuonTra>();
        Enumeration<String> enu = dsGioHang.keys();
        while(enu.hasMoreElements()){
            
            String key = enu.nextElement();
            String mas = dsGioHang.get(key).getMasach();
            var soluong = dsGioHang.get(key).getSoluong();
            float gia = dsGioHang.get(key).getGia();
            ChiTietMuonTra ct = new ChiTietMuonTra(maPMUON, mas, soluong, gia);
            list.add(ct);
        }
        slhang += ctmtDao.themChiTietMuonTra(maPMUON,list);
        return slhang;
    }
    public ArrayList<ChiTietMuonTra> layChiTietMuonTra(String maPMUON){
        return ctmtDao.layChiTietMuonTra(maPMUON);
    }
}
