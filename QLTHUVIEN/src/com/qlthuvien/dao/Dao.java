/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class Dao {
    protected Connection conn = null;
    protected PreparedStatement pre = null;
    protected Statement state =null;
    protected ResultSet rs = null;
    
    public void CloseAll(){
        if (rs != null) {
                    try {
                       rs.close();
                    } catch (SQLException e) { /* ignored */}
                }
                if (state != null) {
                    try {
                        state.close();
                    } catch (SQLException e) { /* ignored */}
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) { /* ignored */}
                }
    }
}
