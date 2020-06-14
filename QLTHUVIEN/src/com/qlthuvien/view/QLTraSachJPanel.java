/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.view;

import com.qlthuvien.model.ChiTietMuonTra;
import com.qlthuvien.model.PhieuMuonTra;
import com.qlthuvien.model.SinhVien;
import com.qlthuvien.service.ChiTietMuonTraService;
import com.qlthuvien.service.PhieuMuonTraService;
import com.qlthuvien.service.SachService;
import com.qlthuvien.service.SinhVienService;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class QLTraSachJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QLTraSachJPanel
     */
    private DefaultTableModel PhieuTableModel, SachDaTraTableModel, SachChuaTraJTableModel;
//    private ArrayList<PhieuMuonTra> list;
    private PhieuMuonTraService pmtService;
    private ChiTietMuonTraService ctmtService;
    private SinhVienService svService;
    private SachService sService;
    private String maPhieu;
    private float tongtien = 0;
    ArrayList<ChiTietMuonTra> listchuatra;
    ArrayList<ChiTietMuonTra> listdatra;

    public QLTraSachJPanel() {
        initComponents();

        pmtService = new PhieuMuonTraService();
        ctmtService = new ChiTietMuonTraService();
        svService = new SinhVienService();
        sService = new SachService();

        listchuatra = new ArrayList<ChiTietMuonTra>();
        listdatra = new ArrayList<ChiTietMuonTra>();

        khoiTaoTable();
        hienThiPhieuTable(pmtService.LayPhieuMuonTra());
    }

    public void khoiTaoTable() {
//

        PhieuTableModel = new DefaultTableModel();
        PhieuJTable.setModel(PhieuTableModel);

        PhieuTableModel.addColumn("Mã phiếu mượn");
        PhieuTableModel.addColumn("Mã sinh viên");
        PhieuTableModel.addColumn("Tên sinh viên");
        PhieuTableModel.addColumn("Ngày mượn");
        PhieuTableModel.addColumn("Tổng tiền");
        PhieuJTable.setDefaultEditor(Object.class, null);
//
        SachChuaTraJTableModel = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return getValueAt(0, columnIndex).getClass();
            }//chi cho phep sua cot so luong

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return columnIndex == 4;
            }

        };

        SachChuaTraJTable.setModel(SachChuaTraJTableModel);
        SachChuaTraJTableModel.addColumn("Mã sách");
        SachChuaTraJTableModel.addColumn("Tên sách");
        SachChuaTraJTableModel.addColumn("Giá");
        SachChuaTraJTableModel.addColumn("Số lượng");
        SachChuaTraJTableModel.addColumn("Chọn sách trả");

//
        SachDaTraJTable.setDefaultEditor(Object.class, null);
        SachDaTraTableModel = new DefaultTableModel();
        SachDaTraJTable.setModel(SachDaTraTableModel);
        SachDaTraTableModel.addColumn("Mã sách");
        SachDaTraTableModel.addColumn("Tên sách");
        SachDaTraTableModel.addColumn("Giá");
        SachDaTraTableModel.addColumn("Số lượng");
        SachDaTraTableModel.addColumn("Ngày trả");

    }

    public void hienThiPhieuTable(ArrayList<PhieuMuonTra> list) {
        PhieuTableModel.setRowCount(0);
        for (PhieuMuonTra pm : list) {
            SinhVien sv = svService.getSinhVien(pm.getMaSV());
            PhieuTableModel.addRow(new Object[]{
                pm.getMaPMuon(),
                pm.getMaSV(),
                sv.getTenSV(),
                pm.getNgayMuon(),
                pm.getTongtien()
            });
        }
    }

    public void hienThiSachChuaTraJTable(ArrayList<ChiTietMuonTra> list) {
        SachChuaTraJTableModel.setRowCount(0);
        for (ChiTietMuonTra ct : list) {
            String tenSach = sService.LayTenSachTheoMa(ct.getMaSach());
            SachChuaTraJTableModel.addRow(new Object[]{
                ct.getMaSach(),
                tenSach,
                ct.getGia(),
                ct.getSoluong(),
                false
            });
        }
//        SachChuaTraJTable.setModel(SachChuaTraJTableModel);
//        SachChuaTraJTableModel.addColumn("Mã sách");
//        SachChuaTraJTableModel.addColumn("Tên sách");
//        SachChuaTraJTableModel.addColumn("Giá");
//        SachChuaTraJTableModel.addColumn("Số lượng");
//        SachChuaTraJTableModel.addColumn("Chọn sách trả");  
    }

    public void hienThiSachDaTraJTable(ArrayList<ChiTietMuonTra> list) {
        SachDaTraTableModel.setRowCount(0);
        for (ChiTietMuonTra ct : list) {
            String tenSach = sService.LayTenSachTheoMa(ct.getMaSach());
            SachDaTraTableModel.addRow(new Object[]{
                ct.getMaSach(),
                tenSach,
                ct.getGia(),
                ct.getSoluong(),
                ct.getNgaytra()
            });
        }
    }
//

    public ArrayList<String> laySach() {
        ArrayList<String> sach = new ArrayList<String>();
        for (int i = 0; i < SachChuaTraJTableModel.getRowCount(); i++) {
            if ((boolean) SachChuaTraJTable.getValueAt(i, 4) == true) {
                String maS;
                maS = String.valueOf(SachChuaTraJTableModel.getValueAt(i, 0));
                sach.add(maS);
                tongtien += Float.parseFloat(String.valueOf(SachChuaTraJTableModel.getValueAt(i, 2)))
                        * Integer.parseInt(String.valueOf(SachChuaTraJTableModel.getValueAt(i, 3)));
            }
        }
        return sach;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        PhieuJTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaPM = new javax.swing.JTextField();
        txtMaSV = new javax.swing.JTextField();
        btTim = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        SachChuaTraJTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        SachDaTraJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btTra = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Quản lý trả sách");

        PhieuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu mượn", "Mã sinh viên", "Tên sinh viên", "Ngày mượn", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PhieuJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhieuJTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(PhieuJTable);

        jLabel6.setText("Mã phiếu mượn");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Tìm Kiếm");

        btTim.setText("Tìm");
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });

        jLabel7.setText("Mã sinh viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMaSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(txtMaPM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(btTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(114, 114, 114)))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMaPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(61, 61, 61)))
        );

        SachChuaTraJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Giá", "Số lượng", "Chọn sách trả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(SachChuaTraJTable);
        if (SachChuaTraJTable.getColumnModel().getColumnCount() > 0) {
            SachChuaTraJTable.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        jTabbedPane1.addTab("Sách Chưa Trả", jScrollPane5);

        SachDaTraJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Giá", "Số lượng", "Ngày trả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(SachDaTraJTable);

        jTabbedPane1.addTab("Sách Đã Trả", jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Chi Tiết Sách Trong Phiếu Mượn");

        btTra.setText("Trả Sách");
        btTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(430, 430, 430))))
            .addGroup(layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btTra)
                .addGap(479, 479, 479))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addComponent(btTra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(264, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
        // TODO add your handling code here:
        ArrayList<PhieuMuonTra> listPhieu = new ArrayList<PhieuMuonTra>();
        listPhieu = pmtService.TimPhieu(txtMaPM.getText(), txtMaSV.getText());
        hienThiPhieuTable(listPhieu);
        listchuatra.clear();
        listdatra.clear();
        hienThiSachChuaTraJTable(listchuatra);
        hienThiSachDaTraJTable(listdatra);
        
    }//GEN-LAST:event_btTimActionPerformed

    private void PhieuJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhieuJTableMouseClicked
        // TODO add your handling code here:

        listchuatra.clear();
        listdatra.clear();
        int i = PhieuJTable.getSelectedRow();
        maPhieu = String.valueOf(PhieuJTable.getValueAt(i, 0));
        listchuatra = ctmtService.laySachChuaTra(maPhieu);
        listdatra = ctmtService.laySachDaTra(maPhieu);
        hienThiSachChuaTraJTable(listchuatra);
        hienThiSachDaTraJTable(listdatra);


    }//GEN-LAST:event_PhieuJTableMouseClicked

    private void btTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraActionPerformed
        // TODO add your handling code here:
        tongtien = 0;
        ArrayList<String> sach = new ArrayList<String>();
        sach = laySach();
        String tr = "";
        for (String s : sach) {

            String tenSach = sService.LayTenSachTheoMa(s);
            tr += "+ " + tenSach + "\n";
        }
        if (tr != "") {
            int reply = JOptionPane.showConfirmDialog(null, "Trả sách với phiếu có mã: " + maPhieu + "\n" + tr + "\n  Tổng tiền: " + tongtien, "Xác nhận trả", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                ctmtService.TraSach(maPhieu, sach);

                listchuatra.clear();
                listdatra.clear();
                int i = PhieuJTable.getSelectedRow();
                maPhieu = String.valueOf(PhieuJTable.getValueAt(i, 0));
                listchuatra = ctmtService.laySachChuaTra(maPhieu);
                listdatra = ctmtService.laySachDaTra(maPhieu);
                hienThiSachChuaTraJTable(listchuatra);
                hienThiSachDaTraJTable(listdatra);
            }
        } else
           JOptionPane.showMessageDialog(null,"Chưa chọn sách");
    }//GEN-LAST:event_btTraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PhieuJTable;
    private javax.swing.JTable SachChuaTraJTable;
    private javax.swing.JTable SachDaTraJTable;
    private javax.swing.JButton btTim;
    private javax.swing.JButton btTra;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtMaPM;
    private javax.swing.JTextField txtMaSV;
    // End of variables declaration//GEN-END:variables
}
