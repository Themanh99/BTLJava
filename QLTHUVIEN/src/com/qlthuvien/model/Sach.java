/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.model;

/**
 *
 * @author son30
 */
public class Sach {

    private String maSach;
    private String tenSach;
    private String maTacGia;
    private String maNxb;
    private float giaSach;
    private String theLoai;
    private boolean trangthai;
    private int soluong;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String maTacGia, String maNxb, float giaSach, String theLoai, boolean trangthai, int soluong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.maTacGia = maTacGia;
        this.maNxb = maNxb;
        this.giaSach = giaSach;
        this.theLoai = theLoai;
        this.trangthai = trangthai;
        this.soluong = soluong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

    public String getMaNxb() {
        return maNxb;
    }

    public void setMaNxb(String maNxb) {
        this.maNxb = maNxb;
    }

    public float getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(float giaSach) {
        this.giaSach = giaSach;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    

    
    
    

}
