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
public class SachBan extends Sach{
    private int soLuong;

    public SachBan() {
    }

    public SachBan(String maSach, String tenSach, String maTacGia, String maNxb, float giaSach, String theLoai) {
        super(maSach, tenSach, maTacGia, maNxb, giaSach, theLoai);
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
