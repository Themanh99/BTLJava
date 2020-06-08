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
    
    public List<Sach> getSachBan(){
        List<Sach> sach = getSach();
        List<Sach> sachBan = new ArrayList<Sach>();
        int size = sach.size();
        
        for(int i=0;i<size;i++){
            if(sach.get(i).isTrangthai()==true && sach.get(i).getSoluong() >0 ){
                sachBan.add(sach.get(i));
            }
        }
                
        
        return sachBan;
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
}
