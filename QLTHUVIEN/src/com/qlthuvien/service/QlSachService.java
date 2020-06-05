/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.QlSachDao;
import com.qlthuvien.model.Sach;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author The Manh
 */
public class QlSachService {
    QlSachDao qlsachDao;
    
    public QlSachService(){
        qlsachDao = new QlSachDao();
    }
    
    public List<Sach> getSach() {
        return qlsachDao.getsach();
    }
    public List<Sach> TimSach(String thuoctinh,String value){
        return qlsachDao.TimSach(thuoctinh, value);
    }

    }
 
    

