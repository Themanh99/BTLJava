/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author son30
 */
public class ThongKeDao extends Dao {

    public ArrayList<String> thongKe(String thang, String nam) {

        ArrayList<String> list = new ArrayList<String>();
        //sl mua sach
        conn = JDBCConnection.getJDBCConnection();
        String sql;
        if (thang == "all") {
            int n = Integer.parseInt(nam);
            sql = "select * from fn_thongkenam(" + n + ")";
        } else {
            int n = Integer.parseInt(nam);
            int thg = Integer.parseInt(thang);
            sql = "select * from fn_thongke(" + thg + "," + n + ")";
        }
        try {
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while(rs.next()){
                String luotmuasach = rs.getString("luotmuasach"); 
                String slsachban = rs.getString("slsachban");
                String luotmuonsach = rs.getString("luotmuonsach");
                String slsachmuon = rs.getString("slsachmuon");
                String ttsachban = rs.getString("ttsachban");
                String ttsachmuon = rs.getString("ttsachmuon");
                list.add(luotmuasach);
                list.add(slsachban);
                list.add(luotmuonsach);
                list.add(slsachmuon);
                list.add(ttsachban);
                list.add(ttsachmuon);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CloseAll();
        }
        return null;
    }
//    public static void main(String[] args) {
//        ThongKeDao n = new ThongKeDao();
//        ArrayList<String> list = n.thongKe("6", "2016");
//        for(String i : list){
//            System.out.println(i);
//        }
//    }
}
