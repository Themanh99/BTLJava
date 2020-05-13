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
public class TaiKhoan {
    private String tk;
    private String mk;
    private boolean loaiTk;

    public TaiKhoan() {
    }

    public TaiKhoan(String tk, String mk, boolean loaiTk) {
        this.tk = tk;
        this.mk = mk;
        this.loaiTk = loaiTk;
    }

    public String getTk() {
        return tk;
    }

    public String getMk() {
        return mk;
    }

    public boolean getLoaiTk() {
        return loaiTk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public void setLoaiTk(boolean loaiTk) {
        this.loaiTk = loaiTk;
    }
    
}
