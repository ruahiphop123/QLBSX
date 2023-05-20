/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jForm;

import java.awt.CardLayout;
import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form newmain
     */
//    int luuchon;
    
    public Main() {
        initComponents();
        container.setLayout(new CardLayout());
        container.add(new QuanLyXePanel());
        resetMau();
        chonQLXe();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quanlyxepn = new javax.swing.JPanel();
        sidepn1 = new javax.swing.JPanel();
        lbquanlyxe = new javax.swing.JLabel();
        quanlynvpn = new javax.swing.JPanel();
        sidepn2 = new javax.swing.JPanel();
        lbquanlynv = new javax.swing.JLabel();
        thongkepn = new javax.swing.JPanel();
        sidepn3 = new javax.swing.JPanel();
        lbthongke = new javax.swing.JLabel();
        trogiuppn = new javax.swing.JPanel();
        sidepn4 = new javax.swing.JPanel();
        lbtrogiup = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý bãi giữ xe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VEHICLE PARKING");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caravan logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MANAGER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        quanlyxepn.setBackground(new java.awt.Color(102, 102, 102));
        quanlyxepn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanlyxepnMouseClicked(evt);
            }
        });

        sidepn1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout sidepn1Layout = new javax.swing.GroupLayout(sidepn1);
        sidepn1.setLayout(sidepn1Layout);
        sidepn1Layout.setHorizontalGroup(
            sidepn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        sidepn1Layout.setVerticalGroup(
            sidepn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        lbquanlyxe.setBackground(new java.awt.Color(204, 204, 204));
        lbquanlyxe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbquanlyxe.setForeground(new java.awt.Color(230, 230, 230));
        lbquanlyxe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car.png"))); // NOI18N
        lbquanlyxe.setText("Quản lý xe");

        javax.swing.GroupLayout quanlyxepnLayout = new javax.swing.GroupLayout(quanlyxepn);
        quanlyxepn.setLayout(quanlyxepnLayout);
        quanlyxepnLayout.setHorizontalGroup(
            quanlyxepnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanlyxepnLayout.createSequentialGroup()
                .addComponent(sidepn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbquanlyxe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        quanlyxepnLayout.setVerticalGroup(
            quanlyxepnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quanlyxepnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(quanlyxepnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sidepn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbquanlyxe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        quanlynvpn.setBackground(new java.awt.Color(102, 102, 102));
        quanlynvpn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanlynvpnMouseClicked(evt);
            }
        });

        sidepn2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout sidepn2Layout = new javax.swing.GroupLayout(sidepn2);
        sidepn2.setLayout(sidepn2Layout);
        sidepn2Layout.setHorizontalGroup(
            sidepn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        sidepn2Layout.setVerticalGroup(
            sidepn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        lbquanlynv.setBackground(new java.awt.Color(204, 204, 204));
        lbquanlynv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbquanlynv.setForeground(new java.awt.Color(230, 230, 230));
        lbquanlynv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        lbquanlynv.setText("Quản lý nhân viên");

        javax.swing.GroupLayout quanlynvpnLayout = new javax.swing.GroupLayout(quanlynvpn);
        quanlynvpn.setLayout(quanlynvpnLayout);
        quanlynvpnLayout.setHorizontalGroup(
            quanlynvpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanlynvpnLayout.createSequentialGroup()
                .addComponent(sidepn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbquanlynv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        quanlynvpnLayout.setVerticalGroup(
            quanlynvpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quanlynvpnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(quanlynvpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sidepn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbquanlynv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        thongkepn.setBackground(new java.awt.Color(102, 102, 102));
        thongkepn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongkepnMouseClicked(evt);
            }
        });

        sidepn3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout sidepn3Layout = new javax.swing.GroupLayout(sidepn3);
        sidepn3.setLayout(sidepn3Layout);
        sidepn3Layout.setHorizontalGroup(
            sidepn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        sidepn3Layout.setVerticalGroup(
            sidepn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        lbthongke.setBackground(new java.awt.Color(204, 204, 204));
        lbthongke.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbthongke.setForeground(new java.awt.Color(230, 230, 230));
        lbthongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thongKe.png"))); // NOI18N
        lbthongke.setText("Thống kê");

        javax.swing.GroupLayout thongkepnLayout = new javax.swing.GroupLayout(thongkepn);
        thongkepn.setLayout(thongkepnLayout);
        thongkepnLayout.setHorizontalGroup(
            thongkepnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongkepnLayout.createSequentialGroup()
                .addComponent(sidepn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbthongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        thongkepnLayout.setVerticalGroup(
            thongkepnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thongkepnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(thongkepnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sidepn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbthongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        trogiuppn.setBackground(new java.awt.Color(102, 102, 102));
        trogiuppn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trogiuppnMouseClicked(evt);
            }
        });

        sidepn4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout sidepn4Layout = new javax.swing.GroupLayout(sidepn4);
        sidepn4.setLayout(sidepn4Layout);
        sidepn4Layout.setHorizontalGroup(
            sidepn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        sidepn4Layout.setVerticalGroup(
            sidepn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        lbtrogiup.setBackground(new java.awt.Color(204, 204, 204));
        lbtrogiup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbtrogiup.setForeground(new java.awt.Color(230, 230, 230));
        lbtrogiup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help.png"))); // NOI18N
        lbtrogiup.setText("Trợ giúp");

        javax.swing.GroupLayout trogiuppnLayout = new javax.swing.GroupLayout(trogiuppn);
        trogiuppn.setLayout(trogiuppnLayout);
        trogiuppnLayout.setHorizontalGroup(
            trogiuppnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trogiuppnLayout.createSequentialGroup()
                .addComponent(sidepn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbtrogiup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        trogiuppnLayout.setVerticalGroup(
            trogiuppnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trogiuppnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(trogiuppnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sidepn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbtrogiup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jButton1.setText("Đăng xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(quanlyxepn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(quanlynvpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(thongkepn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(trogiuppn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(quanlyxepn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(quanlynvpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(thongkepn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(trogiuppn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        container.setBackground(new java.awt.Color(204, 255, 204));
        container.setMaximumSize(null);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quanlyxepnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanlyxepnMouseClicked

        // update user
        
    }//GEN-LAST:event_quanlyxepnMouseClicked

    private void quanlynvpnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanlynvpnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_quanlynvpnMouseClicked

    private void thongkepnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongkepnMouseClicked
        // TODO add your handling code here:
        // update user
        
    }//GEN-LAST:event_thongkepnMouseClicked

    private void trogiuppnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trogiuppnMouseClicked
        // TODO add your handling code here:
        // update user
        

    }//GEN-LAST:event_trogiuppnMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new LogInFrame().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Main().setVisible(true);
//            }
//        });
//    }
//    
    public final void resetMau(){
        
        sidepn1.setBackground(new Color(102,102,102));
        sidepn2.setBackground(new Color(102,102,102));
        sidepn3.setBackground(new Color(102,102,102));
        sidepn4.setBackground(new Color(102,102,102));
        quanlyxepn.setBackground(new Color(102,102,102));
        quanlynvpn.setBackground(new Color(102,102,102));
        thongkepn.setBackground(new Color(102,102,102));
        trogiuppn.setBackground(new Color(102,102,102));
        
        lbquanlyxe.setForeground(new Color(230,230,230));
        lbquanlynv.setForeground(new Color(230,230,230));
        lbthongke.setForeground(new Color(230,230,230));
        lbtrogiup.setForeground(new Color(230,230,230));      
    }
    
    public final void chonQLXe(){
        sidepn1.setBackground(Color.white);
        quanlyxepn.setBackground(new Color(70,70,70));
        lbquanlyxe.setForeground(Color.white);
    }
    
    public final void chonQLNV(){
        sidepn2.setBackground(Color.white);
        quanlynvpn.setBackground(new Color(70,70,70));
        lbquanlynv.setForeground(Color.white);
    }
    
    public final void chonThongKe(){
        sidepn3.setBackground(Color.white);
        thongkepn.setBackground(new Color(70,70,70));
        lbthongke.setForeground(Color.white);
    }
    
    public final void chonTroGiup(){
        sidepn4.setBackground(Color.white);
        trogiuppn.setBackground(new Color(70,70,70));
        lbtrogiup.setForeground(Color.white);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbquanlynv;
    private javax.swing.JLabel lbquanlyxe;
    private javax.swing.JLabel lbthongke;
    private javax.swing.JLabel lbtrogiup;
    private javax.swing.JPanel quanlynvpn;
    private javax.swing.JPanel quanlyxepn;
    private javax.swing.JPanel sidepn1;
    private javax.swing.JPanel sidepn2;
    private javax.swing.JPanel sidepn3;
    private javax.swing.JPanel sidepn4;
    private javax.swing.JPanel thongkepn;
    private javax.swing.JPanel trogiuppn;
    // End of variables declaration//GEN-END:variables
}

