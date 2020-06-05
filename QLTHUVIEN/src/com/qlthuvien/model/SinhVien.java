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
public class SinhVien {
    private String maSV;
    private String tenSV;
    private String emailSV;
    private String dienthoaiSV;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String emailSV, String dienthoaiSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.emailSV = emailSV;
        this.dienthoaiSV = dienthoaiSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getEmailSV() {
        return emailSV;
    }

    public void setEmailSV(String emailSV) {
        this.emailSV = emailSV;
    }

    public String getDienthoaiSV() {
        return dienthoaiSV;
    }

    public void setDienthoaiSV(String dienthoaiSV) {
        this.dienthoaiSV = dienthoaiSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", emailSV=" + emailSV + ", dienthoaiSV=" + dienthoaiSV + '}';
    }

    
    
    
}
