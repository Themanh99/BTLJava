/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.PhieuMuonTraDao;
import com.qlthuvien.model.PhieuMuonTra;
import java.util.ArrayList;

/**
 *
 * @author son30
 */
public class PhieuMuonTraService {
    private PhieuMuonTraDao pmDao;

    public PhieuMuonTraService() {
        pmDao = new PhieuMuonTraDao();
    }
    
    public String taoMaPhieuMuonTra(){
        String ma = "PM";
        int sl = pmDao.LaySlPhieuMuon()+1;
        String soluong = String.valueOf(sl);
        for(int i=1; i<=4-soluong.length();i++){
            ma+="0";
        }
        ma+=soluong;
        return ma;
    }
    public int ThemPhieuMuonTra(String mapm, String masv,float tongtien){
        int sl = pmDao.ThemPhieuMuonTra(mapm,masv,tongtien);
        return sl;
    }
    public ArrayList<PhieuMuonTra> LayPhieuMuonTra(){
        return pmDao.LayPhieuMuonTra();
    }
    public ArrayList<PhieuMuonTra> TimPhieu(String maPMUON,String maSV){
        return pmDao.TimPhieu(maPMUON, maSV);
    }
//    public static void main(String[] args) {
//        PhieuMuonTraService a = new PhieuMuonTraService();
//        ArrayList<PhieuMuonTra> Tim = new ArrayList<PhieuMuonTra>();
//        Tim = a.TimPhieu("02", "2017601707");
//        for(PhieuMuonTra item : Tim){
//            System.out.println(item.getMaPMuon()+item.getMaSV()+item.getNgayMuon()+item.getTongtien());
//        }
//    }
}
