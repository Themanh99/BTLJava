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
public class Sach {

    private String maSach;
    private String tenSach;
    private String maTacGia;
    private String maNxb;
    private float giaSach;
    private String theLoai;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String maTacGia, String maNxb, float giaSach, String theLoai) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.maTacGia = maTacGia;
        this.maNxb = maNxb;
        this.giaSach = giaSach;
        this.theLoai = theLoai;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public String getMaNxb() {
        return maNxb;
    }

    public float getGiaSach() {
        return giaSach;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

    public void setMaNxb(String maNxb) {
        this.maNxb = maNxb;
    }

    public void setGiaSach(float giaSach) {
        this.giaSach = giaSach;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    
    

}
