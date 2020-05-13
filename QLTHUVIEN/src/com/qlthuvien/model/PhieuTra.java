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
public class PhieuTra {
    private String  maPTra;
    private String  maPMuon;
    private String  maSV;
    private String  ngayTra;

    public PhieuTra() {
    }

    public PhieuTra(String maPTra, String maPMuon, String maSV, String ngayTra) {
        this.maPTra = maPTra;
        this.maPMuon = maPMuon;
        this.maSV = maSV;
        this.ngayTra = ngayTra;
    }

    public String getMaPTra() {
        return maPTra;
    }

    public void setMaPTra(String maPTra) {
        this.maPTra = maPTra;
    }

    public String getMaPMuon() {
        return maPMuon;
    }

    public void setMaPMuon(String maPMuon) {
        this.maPMuon = maPMuon;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }
    
    
    
    
}
