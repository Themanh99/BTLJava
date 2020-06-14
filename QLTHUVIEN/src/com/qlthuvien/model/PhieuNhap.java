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
public class PhieuNhap {
    private String maPN;
    private String ngaynhap;
    private String maNCC;
    private float tongtien;

    public PhieuNhap() {
    }

    public PhieuNhap(String maPN, String ngaynhap, String maNCC, float tongtien) {
        this.maPN = maPN;
        this.ngaynhap = ngaynhap;
        this.maNCC = maNCC;
        this.tongtien = tongtien;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    

    
    

    

    
    
    
    
    
}
