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
public class ChiTietPN {
    private String maPN;
    private String maSach;
    private int soluongnhap;
    private float gia;

    public ChiTietPN() {
    }

    public ChiTietPN(String maPN, String maSach, int soluongnhap, float gia) {
        this.maPN = maPN;
        this.maSach = maSach;
        this.soluongnhap = soluongnhap;
        this.gia = gia;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public int getSoluongnhap() {
        return soluongnhap;
    }

    public void setSoluongnhap(int soluongnhap) {
        this.soluongnhap = soluongnhap;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    
    
    
}
