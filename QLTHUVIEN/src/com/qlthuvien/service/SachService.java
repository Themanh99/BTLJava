/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.SachDao;
import com.qlthuvien.model.Sach;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class SachService {
    SachDao sachDao;

    public SachService() {
        sachDao = new SachDao();
    }
    
    public List<Sach> getSach(){
        return sachDao.getSach();
    }
    public List<Integer> getNam(){
        return sachDao.getNam();
    }
    public List<Sach> getSachBan(){
        return sachDao.TimSachBan("","","","","");
         
    }
    public List<Sach> getSachMuon(){
        List<Sach> sach = this.getSach();
        List<Sach> sachmuon = new ArrayList<>();
        
        
        for(Sach item : sach){
            if(item.isTrangthai()==false){
                sachmuon.add(item);
            }
        }
            
        return sachmuon;
        
    }
    

    
    public List<Sach> TimSachBan(String masach,String tensach,String tentacgia,String tennxb,String theloai){
        return sachDao.TimSachBan( masach, tensach, tentacgia, tennxb, theloai);
    }
    
    public List<Sach> TimSachMuon(String masach,String tensach,String tentacgia,String tennxb,String theloai){
        return sachDao.TimSachMuon( masach, tensach, tentacgia, tennxb, theloai);
    }
    
    public List<Sach> TimSach(String masach,String tensach,String tentacgia,String tennxb,String theloai){        
        return sachDao.TimSach( masach, tensach, tentacgia, tennxb, theloai);
        
        
    }
    public String LayTenSachTheoMa(String mas){
        return sachDao.LayTenSachTheoMa(mas);
    }
 
    public int UpdateSach(Sach sach){
        return sachDao.UpdateSach(sach);
    }
    
    public void ThemSach(Sach sach){
        sachDao.ThemSach(sach);
    }
    
    public String getMaSach(){
        String masach="MS";
        int soluong = sachDao.getSoLuongSach()+1;
        String sl = String.valueOf(soluong);
        for(int i=0;i<(4-sl.length());i++){
            masach=masach+"0";
        }
        masach=masach+sl;
        return masach;
    }
    
//    public static void main(String[] args) {
//        SachService test = new SachService();
//        System.out.println(test.getMaSach());
//    }
}
