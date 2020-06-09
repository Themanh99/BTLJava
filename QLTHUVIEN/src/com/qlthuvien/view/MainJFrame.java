/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlthuvien.view;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    JPanel qlBanSachJPanel = new QLBanSachJPanel();
    JPanel qlSachJPanel = new QLSachJPanel();
    JPanel qlNhapSachJPanel = new QLNhapSachJPanel();
    JPanel qlMuonTraSachJPanel = new QLMuonSachJPanel();
    JPanel qlTraSachJPanel = new QLTraSachJPanel();
    JPanel qlTaiKhoanJPanel = new QLTaiKhoanJPanel();
    JPanel qlDocGiaJPanel = new QLDocGiaJPanel();
    
    public MainJFrame() {
        initComponents();
    }
    
    
    private void AnPanel(){
        this.qlBanSachJPanel.setVisible(false);
        this.qlDocGiaJPanel.setVisible(false);
        this.qlMuonTraSachJPanel.setVisible(false);
        this.qlTraSachJPanel.setVisible(false);
        this.qlNhapSachJPanel.setVisible(false);
        this.qlSachJPanel.setVisible(false);
        this.qlTaiKhoanJPanel.setVisible(false);
    }
    
    private void XoaMauButton(){
        btQLMuonTraSach.setBackground(Color.white);
  
        btQLTraSach.setBackground(Color.white);
  
        btQLBanSach.setBackground(Color.white);
      
        btQLSach.setBackground(Color.white);
      
        btQLNhapSach.setBackground(Color.white);
        
        btQLDocGia.setBackground(Color.white);
       
        btQLTaiKhoan.setBackground(Color.white);
       
    }
    private void HienThiPanel(JPanel panel){
        AnPanel();
        panel.setSize(1050,620);
	panel.setLocation(260, 60);
	this.getContentPane().add(panel);
        panel.setVisible(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btQLMuonTraSach = new javax.swing.JButton();
        btQLBanSach = new javax.swing.JButton();
        btQLSach = new javax.swing.JButton();
        btQLNhapSach = new javax.swing.JButton();
        btQLDocGia = new javax.swing.JButton();
        btQLTaiKhoan = new javax.swing.JButton();
        btQLTraSach = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btQLMuonTraSach.setText("Quản lý mượn sách");
        btQLMuonTraSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btQLMuonTraSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQLMuonTraSachActionPerformed(evt);
            }
        });

        btQLBanSach.setText("Quản lý bán sách");
        btQLBanSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btQLBanSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQLBanSachActionPerformed(evt);
            }
        });

        btQLSach.setText("Quản lý sách");
        btQLSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btQLSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQLSachActionPerformed(evt);
            }
        });

        btQLNhapSach.setText("Quản lý nhập sách");
        btQLNhapSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btQLNhapSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQLNhapSachActionPerformed(evt);
            }
        });

        btQLDocGia.setText("Quản lý độc giả");
        btQLDocGia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btQLDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQLDocGiaActionPerformed(evt);
            }
        });

        btQLTaiKhoan.setText("Quản lý tài khoản");
        btQLTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btQLTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQLTaiKhoanActionPerformed(evt);
            }
        });

        btQLTraSach.setText("Quản lý trả sách");
        btQLTraSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btQLTraSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQLTraSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btQLMuonTraSach, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQLBanSach, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQLSach, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQLNhapSach, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQLDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQLTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btQLTraSach))
                .addGap(14, 14, 14))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btQLMuonTraSach, btQLTraSach});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(btQLMuonTraSach, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQLTraSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQLBanSach, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQLSach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQLNhapSach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQLDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQLTaiKhoan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btQLBanSach, btQLDocGia, btQLMuonTraSach, btQLNhapSach, btQLSach, btQLTaiKhoan, btQLTraSach});

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý thư viện");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Đăng xuất");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 456, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 719, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btQLBanSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQLBanSachActionPerformed
        // TODO add your handling code here:
        
        XoaMauButton();
        btQLBanSach.setBackground(Color.CYAN);
        HienThiPanel(qlBanSachJPanel);
     
    }//GEN-LAST:event_btQLBanSachActionPerformed

    private void btQLMuonTraSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQLMuonTraSachActionPerformed
        // TODO add your handling code here:
        
        XoaMauButton();
        btQLMuonTraSach.setBackground(Color.CYAN);
        HienThiPanel(qlMuonTraSachJPanel);
    }//GEN-LAST:event_btQLMuonTraSachActionPerformed

    private void btQLSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQLSachActionPerformed
        // TODO add your handling code here:
        
        XoaMauButton();
        btQLSach.setBackground(Color.CYAN);
        HienThiPanel(qlSachJPanel);
    }//GEN-LAST:event_btQLSachActionPerformed

    private void btQLNhapSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQLNhapSachActionPerformed
        // TODO add your handling code here:
        
        XoaMauButton();
        btQLNhapSach.setBackground(Color.CYAN);
        HienThiPanel(qlNhapSachJPanel);
    }//GEN-LAST:event_btQLNhapSachActionPerformed

    private void btQLDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQLDocGiaActionPerformed
        // TODO add your handling code here:
        
        XoaMauButton();
        btQLDocGia.setBackground(Color.CYAN);
        HienThiPanel(qlDocGiaJPanel);
    }//GEN-LAST:event_btQLDocGiaActionPerformed

    private void btQLTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQLTaiKhoanActionPerformed
        // TODO add your handling code here:
        
        XoaMauButton();
        btQLTaiKhoan.setBackground(Color.CYAN);
        HienThiPanel(qlTaiKhoanJPanel);
    }//GEN-LAST:event_btQLTaiKhoanActionPerformed

    private void btQLTraSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQLTraSachActionPerformed
        // TODO add your handling code here:
        
        XoaMauButton();
        btQLTraSach.setBackground(Color.CYAN);
        HienThiPanel(qlTraSachJPanel);
    }//GEN-LAST:event_btQLTraSachActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btQLBanSach;
    private javax.swing.JButton btQLDocGia;
    private javax.swing.JButton btQLMuonTraSach;
    private javax.swing.JButton btQLNhapSach;
    private javax.swing.JButton btQLSach;
    private javax.swing.JButton btQLTaiKhoan;
    private javax.swing.JButton btQLTraSach;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
