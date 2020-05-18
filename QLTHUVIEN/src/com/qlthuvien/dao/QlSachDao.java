/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import com.qlthuvien.model.Sach;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author The Manh
 */

public class QlSachDao {
    Connection conn = null;
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;
    public List<Sach> getsach(){
        conn = JDBCConnection.getJDBCConnection();
        try {
            
            st = conn.createStatement();
            String sql = "select * from SACH";
            rs = st.executeQuery(sql);
            List<Sach> list = new ArrayList<Sach>();
            while(rs.next()){
                String maSach = rs.getString("masach");
                String tenSach = rs.getString("tensach");
                String tenTacGia= rs.getString("tenTacGia");
                String tenNxb= rs.getString("tenNXB");
                float giaSach= rs.getFloat("giaSach");
                String theLoai= rs.getString("theLoai");
                boolean trangthai= rs.getBoolean("trangthai");
                int soluong = rs.getInt("soluong");
                
                Sach sach = new Sach(maSach, tenSach, tenTacGia, tenNxb, giaSach, theLoai, trangthai,soluong);
                list.add(sach);
            }
            return list;
            }catch (SQLException ex) {
                Logger.getLogger(QlSachDao.class.getName()).log(Level.SEVERE,null,ex);
                
            } finally {
                if(rs !=null){
                 try {rs.close();}catch (SQLException e)  {} 
                }
                if(st !=null){
                 try {st.close();}catch (SQLException e)  {} 
                }
                if(conn !=null){
                 try {conn.close();}catch (SQLException e)  {} 
                }
            }
        return null;
        }
    }
