/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.ChiTietNhapDao;
import com.qlthuvien.model.ChiTietPN;
import com.qlthuvien.model.GioHang;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Administrator
 */
public class ChiTietNhapService {
    ChiTietNhapDao chiTietNhapDao;

    public ChiTietNhapService() {
        chiTietNhapDao = new ChiTietNhapDao();
    }
    
    public int themChiTietNhap(Hashtable<String, GioHang> listGioHang,String maphieunhap){
        //System.out.println(maphieunhap);
        int kq=0;
        Enumeration<String> enu = listGioHang.keys();
        while (enu.hasMoreElements()) {
            String key = enu.nextElement();
            GioHang gioHang = listGioHang.get(key);
            ChiTietPN ctn = new ChiTietPN();
            ctn.setMaPN(maphieunhap);
            ctn.setMaSach(key);
            ctn.setSoluongnhap(gioHang.getSoluong());
            ctn.setGia(gioHang.getGia());
            if(chiTietNhapDao.themChiTietNhap(ctn)==0){
                return 0;
            }            
            else kq=1;
        }
        return kq;
    }
    
    
}
