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
public class TacGia {
    private String maTacGia;
    private String tenTacGia;
    private String namSinhTacGia;

    public TacGia() {
    }

    public TacGia(String maTacGia, String tenTacGia, String namSinhTacGia) {
        this.maTacGia = maTacGia;
        this.tenTacGia = tenTacGia;
        this.namSinhTacGia = namSinhTacGia;
    }

    public String getMaTacGia() {
        return maTacGia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public String getNamSinhTacGia() {
        return namSinhTacGia;
    }

    public void setMaTacGia(String maTacGia) {
        this.maTacGia = maTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setNamSinhTacGia(String namSinhTacGia) {
        this.namSinhTacGia = namSinhTacGia;
    }
    
    
}
