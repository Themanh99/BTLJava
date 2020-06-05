/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.TaiKhoanDao;
import com.qlthuvien.model.Sach;
import com.qlthuvien.model.TaiKhoan;
import java.util.ArrayList;
import java.util.List;

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
        return taiKhoanDao.XacThucTaiKhoan(tk,mk);
    }
    public List<TaiKhoan> getTaikhoan() {
        return taiKhoanDao.gettaikhoan();
    }
    public boolean getLoaiTK(){
        return TaiKhoanDao.loaiTK;
    }
    public List<TaiKhoan> TimTk(String tk,boolean loaitk) {
        return taiKhoanDao.TimTk(tk,loaitk);
    }

    
}
