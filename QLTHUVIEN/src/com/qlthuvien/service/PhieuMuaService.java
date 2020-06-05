/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.PhieuMuaDao;

/**
 *
 * @author Administrator
 */
public class PhieuMuaService {
    PhieuMuaDao  phieuMuaDao;

    public PhieuMuaService() {
        phieuMuaDao = new  PhieuMuaDao();
    }
    
    public String getMaPhieuMua(){
        String maphieumua="PM";
        int soluong = phieuMuaDao.getSoLuongPhieu()+1;
        String sl = String.valueOf(soluong);
        for(int i=0;i<(4-sl.length());i++){
            maphieumua=maphieumua+"0";
        }
        maphieumua=maphieumua+sl;
        return maphieumua;
    }
    
    public static void main(String[] args) {
        PhieuMuaService test = new PhieuMuaService();
        System.out.println(test.getMaPhieuMua());
    }
    
}
