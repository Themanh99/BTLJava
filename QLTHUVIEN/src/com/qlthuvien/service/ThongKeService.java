/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.service;

import com.qlthuvien.dao.ThongKeDao;
import java.util.ArrayList;

/**
 *
 * @author son30
 */
public class ThongKeService {
    ThongKeDao tkdao;

    public ThongKeService() {
        tkdao = new ThongKeDao();
    }
    public ArrayList<String> thongKe(String thang, String nam){
        return tkdao.thongKe(thang, nam);
    }
}
