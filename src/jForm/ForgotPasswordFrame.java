/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jForm;



/**
 *
 * @author ADMIN
 */
public class ForgotPasswordFrame extends javax.swing.JFrame {


    /**
     * Creates new form ForgotPasswordFrame
     */
    public ForgotPasswordFrame() {
        initComponents();
        
        txtmess.setText(" ");
        txttextso1.setEchoChar((char)0);
        txttextso2.setEchoChar((char)0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        txttextso1 = new customcp.PasswordFieldCustom();
        txttextso2 = new customcp.PasswordFieldCustom();
        btlogiin = new customcp.Buttonshine();
        btlsubmit = new customcp.Buttonshine();
        txtmess = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Forgot Password");

        txttextso1.setToolTipText("Nhập mã nhân viên");
        txttextso1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttextso1.setLabelText("Mã nhân viên");
        txttextso1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttextso1FocusGained(evt);
            }
        });

        txttextso2.setToolTipText("Nhập tên tài khoản");
        txttextso2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttextso2.setLabelText("Tên tài khoản");
        txttextso2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttextso2FocusGained(evt);
            }
        });
        txttextso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttextso2ActionPerformed(evt);
            }
        });

        btlogiin.setBackground(new java.awt.Color(51, 153, 255));
        btlogiin.setForeground(new java.awt.Color(255, 255, 255));
        btlogiin.setText("Back to Login");
        btlogiin.setEffectColor(new java.awt.Color(51, 209, 249));
        btlogiin.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        btlogiin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlogiinActionPerformed(evt);
            }
        });

        btlsubmit.setBackground(new java.awt.Color(51, 153, 255));
        btlsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btlsubmit.setText("Search");
        btlsubmit.setEffectColor(new java.awt.Color(51, 209, 249));
        btlsubmit.setFont(new java.awt.Font("STXinwei", 0, 18)); // NOI18N
        btlsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlsubmitActionPerformed(evt);
            }
        });

        txtmess.setForeground(new java.awt.Color(255, 255, 255));
        txtmess.setText("Không tồn tại !!!");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(txtmess, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txttextso1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttextso2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btlogiin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btlsubmit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txttextso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmess)
                .addGap(7, 7, 7)
                .addComponent(txttextso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btlsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btlogiin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btlogiinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlogiinActionPerformed
        // TODO add your handling code here:
        new LogInFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btlogiinActionPerformed

    private void txttextso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttextso2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttextso2ActionPerformed

    private void btlsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlsubmitActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_btlsubmitActionPerformed

    private void txttextso1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttextso1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txttextso1FocusGained

    private void txttextso2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttextso2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txttextso2FocusGained



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customcp.Buttonshine btlogiin;
    private customcp.Buttonshine btlsubmit;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel txtmess;
    private customcp.PasswordFieldCustom txttextso1;
    private customcp.PasswordFieldCustom txttextso2;
    // End of variables declaration//GEN-END:variables
}
