/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.view;

import com.qlthuvien.model.Sach;
import com.qlthuvien.service.SachService;
import java.util.Hashtable;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.qlthuvien.model.GioHang;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Administrator
 */
public class QLBanSachJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QLBanSachJPanel
     */
    private DefaultTableModel defaultSachTable, defaultGioHangTable;
    private SachService sachService;
    private int index, count;
    private static Hashtable<String, GioHang> dsGioHang;

    public static Hashtable<String, GioHang> getGioHang() {
        return dsGioHang;
    }

    public QLBanSachJPanel() {

        initComponents();
        lammoi();

    }

    private void lammoi() {
        sachService = new SachService();
        dsGioHang = new Hashtable<String, GioHang>();
        index = -1;
        count = 0;
        HienThiSachTable();
        HienThiGioHangTable();
    }

    private void HienThiSachTable() {
        defaultSachTable = new DefaultTableModel();

        sachTable.setModel(defaultSachTable);

        defaultSachTable.addColumn("Mã sách");
        defaultSachTable.addColumn("Tên sách");
        defaultSachTable.addColumn("Tác giả");
        defaultSachTable.addColumn("Thể loại");
        defaultSachTable.addColumn("Nhà xuất bản");
        defaultSachTable.addColumn("Giá");
        defaultSachTable.addColumn("Số lượng");
        sachTable.setDefaultEditor(Object.class, null);
        Display(sachService.getSachBan());
    }

    private void HienThiGioHangTable() {
        defaultGioHangTable = new DefaultTableModel() {
            //chi cho phep sua cot so luong
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return columnIndex == 2;
            }
        };

        gioHangTable.setModel(defaultGioHangTable);

        defaultGioHangTable.addColumn("Mã sách");
        defaultGioHangTable.addColumn("Tên sách");
        defaultGioHangTable.addColumn("Số Lượng");
        defaultGioHangTable.addColumn("Giá");

    }

    //Hien thi len sachtable
    private void Display(List<Sach> list) {
        defaultSachTable.setRowCount(0);
        for (Sach sach : list) {
            if (sach.getSoluong() > 0) {
                defaultSachTable.addRow(new Object[]{sach.getMaSach(), sach.getTenSach(), sach.getTenTacGia(), sach.getTheLoai(), sach.getTenNxb(), sach.getGiaSach(), sach.getSoluong()});
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btTimMS = new javax.swing.JButton();
        txtTheLoai = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        gioHangTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNXB = new javax.swing.JTextField();
        btThemVaoGio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btBoRa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sachTable = new javax.swing.JTable();
        txtTacGia = new javax.swing.JTextField();
        btMua = new javax.swing.JButton();
        btReset = new javax.swing.JButton();

        jLabel5.setText("Thể loại");

        btTimMS.setText("Tìm");
        btTimMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimMSActionPerformed(evt);
            }
        });

        gioHangTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Số lượng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gioHangTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(gioHangTable);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Giỏ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Tên sách");
        jLabel2.setToolTipText("");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Tác giả");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Quản lý bán sách");

        btThemVaoGio.setText("Thêm vào giỏ");
        btThemVaoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemVaoGioActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Mã sách");
        jLabel1.setToolTipText("");

        jLabel6.setText("Nhà xuất bản");

        btBoRa.setText("Bỏ ra khỏi giỏ");
        btBoRa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBoRaActionPerformed(evt);
            }
        });

        sachTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Thể loại", "Nhà xuất bản", "Giá", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sachTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        sachTable.getTableHeader().setReorderingAllowed(false);
        sachTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sachTableChonSach(evt);
            }
        });
        jScrollPane1.setViewportView(sachTable);

        btMua.setText("Mua");
        btMua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMuaActionPerformed(evt);
            }
        });

        btReset.setText("Tạo mới");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btTimMS, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btBoRa)
                            .addComponent(btMua, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btThemVaoGio)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(333, 333, 333)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btBoRa)
                        .addGap(42, 42, 42)
                        .addComponent(btMua)
                        .addGap(42, 42, 42)
                        .addComponent(btReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(btTimMS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(btThemVaoGio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btThemVaoGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemVaoGioActionPerformed
        // TODO add your handling code here:
        if (index >= 0) {
            //Lay du lieu tu bang
            String masach = String.valueOf(sachTable.getValueAt(index, 0));
            String tensach = String.valueOf(sachTable.getValueAt(index, 1));
            String gia1 = String.valueOf(sachTable.getValueAt(index, 5));
            float gia = Float.parseFloat(gia1);

            //Them vao gio hang
            GioHang gh = new GioHang(masach, tensach, 1, gia);

            if (!dsGioHang.containsKey(masach)) {
                dsGioHang.put(masach, gh);
                count++;
                defaultGioHangTable.addRow(new Object[]{gh.getMasach(), gh.getTensach(), "1", gh.getGia()});
            }
        } else
            JOptionPane.showMessageDialog(null, "Chưa chọn sách", "Thông báo", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btThemVaoGioActionPerformed

    private void sachTableChonSach(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sachTableChonSach
        // TODO add your handling code here:
        index = sachTable.getSelectedRow();

    }//GEN-LAST:event_sachTableChonSach

    private void btMuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMuaActionPerformed
        if (count != 0) {
            dsGioHang.clear();
            //Luu lai danh sach san pham cung so luong 
            for (int i = 0; i < count; i++) {
                String masach = String.valueOf(gioHangTable.getValueAt(i, 0));
                String tensach = String.valueOf(gioHangTable.getValueAt(i, 1));
                int soluong = Integer.parseInt(String.valueOf(gioHangTable.getValueAt(i, 2)));
                float gia = Float.parseFloat(String.valueOf(gioHangTable.getValueAt(i, 3)));
                GioHang gh = new GioHang(masach, tensach, soluong, gia);
                dsGioHang.put(masach, gh);
            }

            //Kiem tra xem so luong mua co lon hon so luong con trong kho khong
            List<String> danhsachloi = Check(dsGioHang, sachService.getSachBan());
            if (danhsachloi.isEmpty()) {
                XacNhanMuaJFrame xn = new XacNhanMuaJFrame();
                xn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                xn.setVisible(true);              
            } else {
                String tb = "";
                int size = danhsachloi.size();
                for (int i = 0; i < size; i++) {
                    if (i == size - 1) {
                        tb += danhsachloi.get(i) + " : ";
                    } else {
                        tb += danhsachloi.get(i) + " , ";
                    }
                }
                tb = tb + " Khong du so luong ban";
                JOptionPane.showMessageDialog(null, tb, "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Chưa có gì trong giỏ hàng", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btMuaActionPerformed
    //Ham tra ve danh sach cac san pham khong du so luong
    private List<String> Check(Hashtable<String, GioHang> gh, List<Sach> sachban) {

        Enumeration<String> enu = gh.keys();
        List<String> danhsachloi = new ArrayList<String>();
        danhsachloi.clear();
        int size = sachban.size();

        Hashtable<String, Sach> tg = new Hashtable<String, Sach>();

        for (int i = 0; i < size; i++) {
            String ms = sachban.get(i).getMaSach();
            tg.put(ms, sachban.get(i));
        }

        while (enu.hasMoreElements()) {

            String key = enu.nextElement();

            GioHang value = gh.get(key);
            String ms = value.getMasach();
            int soban = value.getSoluong();
            int soco = tg.get(ms).getSoluong();
            if (soban > soco) {
                String tensach = tg.get(ms).getTenSach();
                danhsachloi.add(tensach);
            }

        }
        return danhsachloi;

    }


    private void btTimMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimMSActionPerformed
        // TODO add your handling code here:
        String masach = txtMaSach.getText();
        String tensach = txtTenSach.getText();
        String tentacgia = txtTacGia.getText();
        String theloai = txtTheLoai.getText();
        String tennxb = txtNXB.getText();
        Display(sachService.TimSachBan(masach, tensach, tentacgia, tennxb, theloai));
    }//GEN-LAST:event_btTimMSActionPerformed

    private void btBoRaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBoRaActionPerformed
        // TODO add your handling code here:
        int hang = gioHangTable.getSelectedRow();
        String ms = String.valueOf(gioHangTable.getValueAt(hang, 0));
        dsGioHang.remove(ms);
        count--;
        HienThiGioHang(dsGioHang);

    }//GEN-LAST:event_btBoRaActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        dsGioHang.clear();
        count = 0;
        defaultGioHangTable.setRowCount(0);
        HienThiGioHang(dsGioHang);
    }//GEN-LAST:event_btResetActionPerformed

    private void HienThiGioHang(Hashtable<String, GioHang> list) {
        defaultGioHangTable.setRowCount(0);
        Enumeration<String> enu = dsGioHang.keys();
        while (enu.hasMoreElements()) {
            String key = enu.nextElement();
            GioHang gh = dsGioHang.get(key);
            defaultGioHangTable.addRow(new Object[]{gh.getMasach(), gh.getTensach(), gh.getSoluong(), gh.getGia()});
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBoRa;
    private javax.swing.JButton btMua;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btThemVaoGio;
    private javax.swing.JButton btTimMS;
    private javax.swing.JTable gioHangTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable sachTable;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNXB;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTheLoai;
    // End of variables declaration//GEN-END:variables
}
