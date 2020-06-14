/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.PhieuNhapDao;
import com.qlthuvien.model.PhieuNhap;

/**
 *
 * @author Administrator
 */
public class PhieuNhapService {
    PhieuNhapDao  phieuNhapDao;

    public PhieuNhapService() {
        phieuNhapDao = new  PhieuNhapDao();
    }
    
    public String getMaPhieuNhap(){
        String maphieunhap="PN";
        int soluong = phieuNhapDao.getSoLuongPhieu()+1;
        String sl = String.valueOf(soluong);
        for(int i=0;i<(4-sl.length());i++){
            maphieunhap=maphieunhap+"0";
        }
        maphieunhap=maphieunhap+sl;
        return maphieunhap;
    }
    
    public void themPhieuNhap(PhieuNhap pn){
        phieuNhapDao.themPhieuNhap(pn);
    }
  
}
