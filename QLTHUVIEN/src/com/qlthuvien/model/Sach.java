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
    private String tenTacGia;
    private String tenNxb;
    private float giaSach;
    private String theLoai;
    private boolean trangthai;
    private int soluong;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tenTacGia, String tenNxb, float giaSach, String theLoai, boolean trangthai, int soluong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.tenNxb = tenNxb;
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

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenNxb() {
        return tenNxb;
    }

    public void setTenNxb(String tenNxb) {
        this.tenNxb = tenNxb;
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

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", tenTacGia=" + tenTacGia + ", tenNxb=" + tenNxb + ", giaSach=" + giaSach + ", theLoai=" + theLoai + ", trangthai=" + trangthai + ", soluong=" + soluong + '}';
    }

    


    
    
    

}
