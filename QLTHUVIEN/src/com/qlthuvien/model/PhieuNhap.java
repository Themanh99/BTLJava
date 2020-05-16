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

    public PhieuNhap() {
    }

    public PhieuNhap(String maPN, String ngaynhap, String maNCC) {
        this.maPN = maPN;
        this.ngaynhap = ngaynhap;
        this.maNCC = maNCC;
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
    

    

    
    
    
    
    
}
