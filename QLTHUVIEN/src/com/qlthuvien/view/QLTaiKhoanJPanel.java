/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.view;

import static com.qlthuvien.dao.TaiKhoanDao.list1;
import com.qlthuvien.model.Sach;
import com.qlthuvien.model.TaiKhoan;
import com.qlthuvien.service.SachService;
import com.qlthuvien.service.TaiKhoanService;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class QLTaiKhoanJPanel extends javax.swing.JPanel {

    DefaultTableModel defaultTaiKhoanTable;
    TaiKhoanService taikhoanService;
    int index = -1, count = 0;

    public QLTaiKhoanJPanel() {
        initComponents();
        taikhoanService = new TaiKhoanService();
        HienThiTaiKhoanTable();
        btXoatk.setBackground(Color.red);
    }

    private void ClearText1() {
        txtTk.setText(null);
        radioadmin.isSelected();
        passTk.setText(null);
    }

    private void DisplayTaiKhoan(List<TaiKhoan> list) {
        defaultTaiKhoanTable.setRowCount(0);
        for (TaiKhoan taikhoan : list) {
            defaultTaiKhoanTable.addRow(new Object[]{taikhoan.getTk(), taikhoan.getMk(), (taikhoan.getLoaiTk() ? "Admin" : "User")});
        }
    }

    public void HienThiTaiKhoanTable() {
        defaultTaiKhoanTable = new DefaultTableModel();

        taikhoanTable.setModel(defaultTaiKhoanTable);

        defaultTaiKhoanTable.addColumn("Tên Tài Khoản");
        defaultTaiKhoanTable.addColumn("Mật Khẩu");
        defaultTaiKhoanTable.addColumn("Loại Tài Khoản");
        taikhoanTable.setDefaultEditor(Object.class, null);
        DisplayTaiKhoan(taikhoanService.getTaikhoan());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtTimtk = new javax.swing.JTextField();
        btTimkiem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTk = new javax.swing.JTextField();
        passTk = new javax.swing.JPasswordField();
        btLammoitk = new javax.swing.JButton();
        btThemtk = new javax.swing.JButton();
        btXoatext = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taikhoanTable = new javax.swing.JTable();
        btXoatk = new javax.swing.JButton();
        btreset = new javax.swing.JButton();
        radioadmin = new javax.swing.JRadioButton();
        radiouser = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Danh Sách Tài Khoản");

        btTimkiem.setText("Tìm Kiếm");
        btTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimtk, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btTimkiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimtk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTimkiem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Tên Tài Khoản :");

        jLabel3.setText("Mật Khẩu :");

        jLabel4.setText("Loại Tài Khoản :");

        btLammoitk.setText("Làm Mới");
        btLammoitk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLammoitkActionPerformed(evt);
            }
        });

        btThemtk.setText("Thêm");
        btThemtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemtkActionPerformed(evt);
            }
        });

        btXoatext.setText("Xóa Text");
        btXoatext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoatextActionPerformed(evt);
            }
        });

        taikhoanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên Tài Khoản", "Mật Khẩu", "Loại Tài Khoản"
            }
        ));
        taikhoanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taikhoanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(taikhoanTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        btXoatk.setText("Xóa");
        btXoatk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoatkActionPerformed(evt);
            }
        });

        btreset.setText("Reset");
        btreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioadmin);
        radioadmin.setText("Admin");

        buttonGroup1.add(radiouser);
        radiouser.setText("User");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTk)
                            .addComponent(passTk, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btreset)
                        .addGap(99, 99, 99)
                        .addComponent(btLammoitk, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btThemtk, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radioadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radiouser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btXoatk, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btXoatext, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passTk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btreset))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioadmin)
                            .addComponent(radiouser)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLammoitk, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btThemtk, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btXoatk, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btXoatext, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Bảng Tài Khoản");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void taikhoanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taikhoanTableMouseClicked
        int index = taikhoanTable.getSelectedRow();

        txtTk.setText(String.valueOf(taikhoanTable.getValueAt(index, 0)));
        passTk.setText(String.valueOf(taikhoanTable.getValueAt(index, 1)));
        String loaitk = String.valueOf(taikhoanTable.getValueAt(index, 2)); 
        if ("Admin".equals(loaitk)) {
            radioadmin.setSelected(true);

        } else {
            radiouser.setSelected(true);
        }

    }//GEN-LAST:event_taikhoanTableMouseClicked

    private void btLammoitkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLammoitkActionPerformed
        defaultTaiKhoanTable.setRowCount(0);
        DisplayTaiKhoan(taikhoanService.getTaikhoan());
    }//GEN-LAST:event_btLammoitkActionPerformed

    private void btTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimkiemActionPerformed
        String tk = txtTimtk.getText();
        DisplayTaiKhoan(taikhoanService.TimTk(tk));
    }//GEN-LAST:event_btTimkiemActionPerformed

    private void btXoatkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoatkActionPerformed
        int kq = JOptionPane.showConfirmDialog(QLTaiKhoanJPanel.this, "Ban co chac xoa tai khoan nay ?");
        if (kq == JOptionPane.YES_OPTION) {
            String tk = txtTk.getText();
            taikhoanService.deleteTaikhoan(tk);
            DisplayTaiKhoan(taikhoanService.getTaikhoan());
            ClearText1();
        }
    }//GEN-LAST:event_btXoatkActionPerformed

    private void btXoatextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoatextActionPerformed
        ClearText1();
    }//GEN-LAST:event_btXoatextActionPerformed

    private void btresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresetActionPerformed
        
        String tk = txtTk.getText();
        if (taikhoanService.resetPass(tk) > 0) {
            JOptionPane.showMessageDialog(null,
                    "Reset thành công! Mật khẩu mặc định là : 1", "Thông Báo",
                    JOptionPane.INFORMATION_MESSAGE);
            DisplayTaiKhoan(taikhoanService.getTaikhoan());
            ClearText1();
        } else {
            JOptionPane.showMessageDialog(null,
                    "Reset không thành công!", "Thông Báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btresetActionPerformed

    private void btThemtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemtkActionPerformed
        String tk = txtTk.getText();
        String mk = String.valueOf(passTk.getPassword());
        boolean s;
        if (radioadmin.isSelected()) {
            s = true;
        } else {
            s = false;
        }
        if ("".equals(tk)) {
            JOptionPane.showMessageDialog(null,
                    "Không được để trống tài khoản!", "Thông Báo",
                    JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(mk)) {
            JOptionPane.showMessageDialog(null,
                    "Không được để trống mật khẩu!", "Thông Báo",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            //String check = txtTk.getText();
            int n = 0;
            for (TaiKhoan taikhoanlist : list1) {
                if (tk.trim().equals(taikhoanlist.getTk().trim())) {
                    n++;
                    break;
                }
            }
            if (n != 0) {
                JOptionPane.showMessageDialog(null,
                        "Tên tài khoản đã tồn tại!", "Thông Báo",
                        JOptionPane.ERROR_MESSAGE);
            } else {

                TaiKhoan taikhoan = new TaiKhoan(tk, mk, s);
                if (taikhoanService.themTaikhoan(taikhoan) > 0) {
                    JOptionPane.showMessageDialog(null,
                            "Thêm thành công!", "Thông Báo",
                            JOptionPane.INFORMATION_MESSAGE);
                    DisplayTaiKhoan(taikhoanService.getTaikhoan());
                    ClearText1();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Thêm Thât Bại", "Thông Báo",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btThemtkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLammoitk;
    private javax.swing.JButton btThemtk;
    private javax.swing.JButton btTimkiem;
    private javax.swing.JButton btXoatext;
    private javax.swing.JButton btXoatk;
    private javax.swing.JButton btreset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField passTk;
    private javax.swing.JRadioButton radioadmin;
    private javax.swing.JRadioButton radiouser;
    private javax.swing.JTable taikhoanTable;
    private javax.swing.JTextField txtTimtk;
    private javax.swing.JTextField txtTk;
    // End of variables declaration//GEN-END:variables
}
