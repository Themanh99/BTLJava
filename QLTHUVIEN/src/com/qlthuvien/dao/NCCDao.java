/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import com.qlthuvien.model.NCC;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author son30
 */
public class NCCDao extends Dao{
    public List<NCC> getNCC(){
        List<NCC> list = new ArrayList<NCC>();
        String sql = "select * from NCC";
        conn = JDBCConnection.getJDBCConnection();
        try {
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while(rs.next()){
                String maNCC = rs.getString("maNCC");
                String tenNCC = rs.getString("tenNCC");
                String sdtNCC = rs.getString("sdtNCC");
                String diaChiNCC = rs.getString("diachiNCC");
                NCC ncc = new NCC(maNCC, tenNCC, sdtNCC, diaChiNCC);
                list.add(ncc);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(NCCDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            CloseAll();
        }
        return null;
    }
    
    public List<NCC> TimNCC(NCC ncc){
        List<NCC> list = new ArrayList<NCC>();
        conn = JDBCConnection.getJDBCConnection();
        String sql = "select * from NCC where maNCC like '%"+ncc.getMaNCC()+"%' and tenNCC like '%"+ncc.getTenNCC()+"%'and sdtNCC like '%"+ncc.getSdtNCC()+"%' and diachiNCC like '%"+ncc.getDiaChiNCC()+"%'";
        try {
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            
            while(rs.next()){
                String mancc = rs.getString("maNCC");
                String tencc = rs.getString("tenNCC");
                String sdt = rs.getString("sdtNCC");
                String dc = rs.getString("diachiNCC");
                
                NCC item = new NCC(mancc,tencc,sdt,dc);
                list.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NCCDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            CloseAll();
        }
        return list;
    }
    
    
}
