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
    private float gianhap;

    public ChiTietPN() {
    }

    public ChiTietPN(String maPN, String maSach, int soluongnhap, float gianhap) {
        this.maPN = maPN;
        this.maSach = maSach;
        this.soluongnhap = soluongnhap;
        this.gianhap = gianhap;
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

    public float getGianhap() {
        return gianhap;
    }

    public void setGianhap(float gianhap) {
        this.gianhap = gianhap;
    }
    
    
}
