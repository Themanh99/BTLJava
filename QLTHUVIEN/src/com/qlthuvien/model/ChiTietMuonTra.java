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
public class ChiTietMuonTra {
    private String maPMuon;
    private String maSach;
    private int soluong;
    private String ngaytra;
    private float gia;

    public ChiTietMuonTra() {
    }

    public ChiTietMuonTra(String maPMuon, String maSach, int soluong, String ngaytra, float gia) {
        this.maPMuon = maPMuon;
        this.maSach = maSach;
        this.soluong = soluong;
        this.ngaytra = ngaytra;
        this.gia = gia;
    }

    public ChiTietMuonTra(String maPMuon, String maSach, int soluong, float gia) {
        this.maPMuon = maPMuon;
        this.maSach = maSach;
        this.soluong = soluong;
        this.gia = gia;
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

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    
    
    
}
