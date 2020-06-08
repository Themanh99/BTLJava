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
    private float tongtien;

    public PhieuMua() {
    }

    public PhieuMua(String maPMua, String ngayMua, String maSV, float tongtien) {
        this.maPMua = maPMua;
        this.ngayMua = ngayMua;
        this.maSV = maSV;
        this.tongtien = tongtien;
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

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    
    
    
}
