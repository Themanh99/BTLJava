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
public class ChiTietMua {
    private String maPMua;
    private String maSach;
    private int soluong;

    public ChiTietMua() {
    }

    public ChiTietMua(String maPMua, String maSach, int soluong) {
        this.maPMua = maPMua;
        this.maSach = maSach;
        this.soluong = soluong;
    }

    public String getMaPMua() {
        return maPMua;
    }

    public void setMaPMua(String maPMua) {
        this.maPMua = maPMua;
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
