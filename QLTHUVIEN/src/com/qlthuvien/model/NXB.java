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
public class NXB {
    private String maNXB;
    private String tenNXB;
    private String sdtNXB;
    private String diaChiNXB;

    public NXB() {
    }

    public NXB(String maNXB, String tenNXB, String sdtNXB, String diaChiNXB) {
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
        this.sdtNXB = sdtNXB;
        this.diaChiNXB = diaChiNXB;
    }

    public String getMaNXB() {
        return maNXB;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public String getSdtNXB() {
        return sdtNXB;
    }

    public String getDiaChiNXB() {
        return diaChiNXB;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public void setSdtNXB(String sdtNXB) {
        this.sdtNXB = sdtNXB;
    }

    public void setDiaChiNXB(String diaChiNXB) {
        this.diaChiNXB = diaChiNXB;
    }
    
    
}
