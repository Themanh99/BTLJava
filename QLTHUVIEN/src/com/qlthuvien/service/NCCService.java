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
    public List<NCC> getNCC(){
        List<NCC> list = new ArrayList<NCC>();
        list = nccDao.getNCC();
        return list;
    }
}
