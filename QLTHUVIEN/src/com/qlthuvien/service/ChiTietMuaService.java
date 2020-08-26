/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.ChiTietMuaDao;
import com.qlthuvien.model.ChiTietMua;
import com.qlthuvien.model.GioHang;
import java.util.Enumeration;
import java.util.Hashtable;


/**
 *
 * @author Administrator
 */
public class ChiTietMuaService {
    ChiTietMuaDao chiTietMuaDao;

    public ChiTietMuaService() {
        chiTietMuaDao = new ChiTietMuaDao();
    }
    
    public int themChiTietMua(Hashtable<String, GioHang> listGioHang,String maphieumua){
        int kq=0;
        Enumeration<String> enu = listGioHang.keys();
        
        while (enu.hasMoreElements()) {
            String key = enu.nextElement();
            GioHang gioHang = listGioHang.get(key);
            ChiTietMua ctm = new ChiTietMua();
            ctm.setMaPMua(maphieumua);
            ctm.setMaSach(key);
            ctm.setSoluong(gioHang.getSoluong());
            ctm.setGia(gioHang.getGia());
            if(chiTietMuaDao.themChiTietMua(ctm)==0){
                return 0;
            }            
            else{
                kq=1;
            }
        }
        return kq;
    }
    
    
    
}
