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
public class PhieuMuonTra {
    private String maPMuon;
    private String ngayMuon;
    private String maSV;
    private float tongtien;
    public PhieuMuonTra() {
    }

    public PhieuMuonTra(String maPMuon, String ngayMuon, String maSV, float tongtien) {
        this.maPMuon = maPMuon;
        this.ngayMuon = ngayMuon;
        this.maSV = maSV;
        this.tongtien = tongtien;
    }
    
    public String getMaPMuon() {
        return maPMuon;
    }

    public void setMaPMuon(String maPMuon) {
        this.maPMuon = maPMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
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

    public void setTongtien(float tongTien) {
        this.tongtien = tongTien;
    }
    
    
}
