/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author son30
 */
public class SinhVien {
    private String maSV;
    private String tenSV;
    private String emailSV;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String emailSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.emailSV = emailSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getEmailSV() {
        return emailSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setEmailSV(String emailSV) {
        this.emailSV = emailSV;
    }
    
    
}
