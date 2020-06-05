/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.SinhVienDao;
import com.qlthuvien.model.SinhVien;

/**
 *
 * @author Administrator
 */
public class SinhVienService {
    SinhVienDao sinhVienDao;

    public SinhVienService() {
        sinhVienDao = new SinhVienDao();
    }
    
    public SinhVien getSinhVien(String masv){
        return sinhVienDao.getSinhVien(masv);
    }
    
    
}
