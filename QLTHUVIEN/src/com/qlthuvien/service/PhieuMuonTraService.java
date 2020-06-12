/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.PhieuMuonTraDao;
import com.qlthuvien.model.PhieuMuonTra;

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
        int sl = pmDao.getSlPhieuMuon()+1;
        String soluong = String.valueOf(sl);
        for(int i=1; i<=4-soluong.length();i++){
            ma+="0";
        }
        ma+=soluong;
        return ma;
    }
    public int insertPhieuMuonTra(String mapm, String masv,float tongtien){
        int sl = pmDao.themPhieuMuonTra(mapm,masv,tongtien);
        return sl;
    }
//    public static void main(String[] args) {
//        PhieuMuonTraService a = new PhieuMuonTraService();
//        System.out.println(a.getSlPhieuMuonTra());
//    }
}
