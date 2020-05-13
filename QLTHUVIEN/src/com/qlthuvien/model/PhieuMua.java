/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.model;

/**
 *
 * @author Administrator
 */
public class PhieuMua {
    private String maPMua;
    private String ngayMua;
    private String maSV;

    public PhieuMua() {
    }

    public PhieuMua(String maPMua, String ngayMua, String maSV) {
        this.maPMua = maPMua;
        this.ngayMua = ngayMua;
        this.maSV = maSV;
    }

    public String getMaPMua() {
        return maPMua;
    }

    public void setMaPMua(String maPMua) {
        this.maPMua = maPMua;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    
    
}
