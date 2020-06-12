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
public class NCC {
    private String maNCC;
    private String tenNCC;
    private String sdtNCC;
    private String diaChiNCC;

    public NCC() {
    }
    
    
    public NCC(String maNCC, String tenNCC, String sdtNCC, String diaChiNCC) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.sdtNCC = sdtNCC;
        this.diaChiNCC = diaChiNCC;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public String getSdtNCC() {
        return sdtNCC;
    }

    public String getDiaChiNCC() {
        return diaChiNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public void setSdtNCC(String sdtNCC) {
        this.sdtNCC = sdtNCC;
    }

    public void setDiaChiNCC(String diaChiNCC) {
        this.diaChiNCC = diaChiNCC;
    }

    
    
    
}
