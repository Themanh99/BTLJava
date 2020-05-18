/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.TaiKhoanDao;

/**
 *
 * @author Administrator
 */

public class TaiKhoanService {
    TaiKhoanDao taiKhoanDao;

    public TaiKhoanService() {
        taiKhoanDao = new TaiKhoanDao();
        
    }
    
    public boolean XacThucTaiKhoan(String tk,String mk){
        return TaiKhoanDao.XacThucTaiKhoan(tk,mk);
    }
    
    public boolean getLoaiTK(){
        return TaiKhoanDao.loaiTK;
    }
    
    
}
