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
public class ChiTietMuon {
    private String maPMuon;
    private String maSach;
    private int soluong;

    public ChiTietMuon() {
    }

    public ChiTietMuon(String maPMuon, String maSach, int soluong) {
        this.maPMuon = maPMuon;
        this.maSach = maSach;
        this.soluong = soluong;
    }

    public String getMaPMuon() {
        return maPMuon;
    }

    public void setMaPMuon(String maPMuon) {
        this.maPMuon = maPMuon;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
}
