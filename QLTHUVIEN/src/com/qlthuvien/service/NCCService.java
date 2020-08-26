/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.NCCDao;
import com.qlthuvien.model.NCC;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author son30
 */
public class NCCService {
    NCCDao nccDao;

    public NCCService(NCCDao nccDao) {
        this.nccDao = nccDao;
    }

    public NCCService() {
        nccDao = new NCCDao();
    }
    
    public List<NCC> getNCC(){
        return nccDao.getNCC();
    }
    
    public List<NCC> TimNCC(NCC ncc){
        return nccDao.TimNCC(ncc);
    }
    
    public String getMaNCC(){
        String mapNCC="NCC";
        int soluong = nccDao.getSoLuongNCC()+1;
        String sl = String.valueOf(soluong);
        for(int i=0;i<(3-sl.length());i++){
            mapNCC=mapNCC+"0";
        }
        mapNCC=mapNCC+sl;
        return mapNCC;
    }
    
    
    public int themNCC(NCC ncc){
        return nccDao.ThemNCC(ncc);
    }
    
    public void CapNhatNCC(NCC ncc){
        nccDao.CapNhatNCC(ncc);
    }
}
