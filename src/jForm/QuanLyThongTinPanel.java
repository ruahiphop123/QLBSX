/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jForm;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ADMIN
 */
public class QuanLyThongTinPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyThongTinPanel
     */
    

    
    
    public QuanLyThongTinPanel() {
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        giolitinh = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttentk = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        radiobtnam = new javax.swing.JRadioButton();
        radiobtkhac = new javax.swing.JRadioButton();
        radiobtnu = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtquequan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtsodt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtpass = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtmadd = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btreset = new customcp.Buttonshine();
        btreset1 = new customcp.Buttonshine();
        btmatkhau = new customcp.Buttonshine();
        btchangeimg = new customcp.Buttonshine();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtmatkhaucu = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtmatkhaumoi = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtxacnhanmatkhau = new javax.swing.JTextField();
        buttonshine1 = new customcp.Buttonshine();
        pnnhacnho = new javax.swing.JPanel();
        imgkhoc = new javax.swing.JLabel();
        txtnhacnho = new javax.swing.JLabel();
        imageAvatar = new customcp.ImageAvatar();
        pndangthuhien = new javax.swing.JPanel();
        progressBarCustom = new customcp.ProgressBarCustom();
        lbdangthuchien = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jDialog1.setMinimumSize(new java.awt.Dimension(344, 150));
        jDialog1.setModal(true);
        jDialog1.setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton7.setBackground(new java.awt.Color(102, 102, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jButton7.setText("Trờ về");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Tính năng này hiện chưa được hỗ trợ !!!");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Vô cùng xin lỗi bạn :((((((");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(153, 153, 255));
        setMinimumSize(new java.awt.Dimension(947, 680));
        setPreferredSize(new java.awt.Dimension(947, 680));

        jPanel1.setBackground(new java.awt.Color(241, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Quản lý thông tin", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Mã nhân viên :");

        txtmanv.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtmanv.setText("NV00001");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Họ và tên :");

        txthoten.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Tên tài khoản :");

        txttentk.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txttentk.setText("xxxxxxxxxx");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Giới tính :");

        giolitinh.add(radiobtnam);
        radiobtnam.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        radiobtnam.setText("Nam");

        giolitinh.add(radiobtkhac);
        radiobtkhac.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        radiobtkhac.setText("Khác");

        giolitinh.add(radiobtnu);
        radiobtnu.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        radiobtnu.setText("Nữ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Quê quán :");

        txtquequan.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Số điện thoại :");

        txtsodt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("Mật khẩu :");

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtpass.setText("*********");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("Mã định danh :");

        txtmadd.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radiobtnam)
                        .addGap(39, 39, 39)
                        .addComponent(radiobtnu)
                        .addGap(51, 51, 51)
                        .addComponent(radiobtkhac))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txthoten)
                        .addComponent(txtmanv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txttentk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtsodt)
                        .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtmadd, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtquequan, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmanv))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttentk))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtpass))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(radiobtnam)
                    .addComponent(radiobtnu)
                    .addComponent(radiobtkhac))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtquequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtsodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtmadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 40, 0));

        btreset.setBackground(new java.awt.Color(51, 253, 15));
        btreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btreset.setText("Đặt lại dữ liệu");
        btreset.setEffectColor(new java.awt.Color(240, 240, 240));
        btreset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetActionPerformed(evt);
            }
        });
        jPanel2.add(btreset);

        btreset1.setBackground(new java.awt.Color(51, 253, 15));
        btreset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btreset1.setText("Cập nhật dữ liệu");
        btreset1.setEffectColor(new java.awt.Color(240, 240, 240));
        btreset1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btreset1ActionPerformed(evt);
            }
        });
        jPanel2.add(btreset1);

        btmatkhau.setBackground(new java.awt.Color(51, 253, 15));
        btmatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bthienmk.png"))); // NOI18N
        btmatkhau.setText("Hiện mật khẩu");
        btmatkhau.setEffectColor(new java.awt.Color(240, 240, 240));
        btmatkhau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btmatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmatkhauActionPerformed(evt);
            }
        });
        jPanel2.add(btmatkhau);

        btchangeimg.setBackground(new java.awt.Color(51, 253, 15));
        btchangeimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/changeimg.png"))); // NOI18N
        btchangeimg.setText("Đổi ảnh đại diện");
        btchangeimg.setEffectColor(new java.awt.Color(240, 240, 240));
        btchangeimg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btchangeimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchangeimgActionPerformed(evt);
            }
        });
        jPanel2.add(btchangeimg);

        jPanel3.setBackground(new java.awt.Color(241, 240, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Đổi mật khẩu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setText("Mật khẩu cũ :");

        txtmatkhaucu.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setText("Mật khẩu mới :");

        txtmatkhaumoi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel16.setText("Xác nhận mật khẩu :");

        txtxacnhanmatkhau.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        buttonshine1.setBackground(new java.awt.Color(51, 253, 15));
        buttonshine1.setText("Xác nhận đổi");
        buttonshine1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        buttonshine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonshine1ActionPerformed(evt);
            }
        });

        pnnhacnho.setBackground(new java.awt.Color(241, 240, 240));

        imgkhoc.setBackground(new java.awt.Color(240, 241, 240));
        imgkhoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgkhoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/khoctiengmangimg.png"))); // NOI18N

        txtnhacnho.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtnhacnho.setForeground(new java.awt.Color(51, 102, 255));
        txtnhacnho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnhacnho.setText("Sai mật khẩu cũ !!!");

        javax.swing.GroupLayout pnnhacnhoLayout = new javax.swing.GroupLayout(pnnhacnho);
        pnnhacnho.setLayout(pnnhacnhoLayout);
        pnnhacnhoLayout.setHorizontalGroup(
            pnnhacnhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtnhacnho, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
            .addComponent(imgkhoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnnhacnhoLayout.setVerticalGroup(
            pnnhacnhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnnhacnhoLayout.createSequentialGroup()
                .addComponent(txtnhacnho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgkhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmatkhaumoi, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmatkhaucu, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtxacnhanmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(buttonshine1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnnhacnho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtmatkhaucu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtmatkhaumoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtxacnhanmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonshine1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnnhacnho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        imageAvatar.setForeground(new java.awt.Color(51, 255, 66));
        imageAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quanlyuser.png"))); // NOI18N

        pndangthuhien.setBackground(new java.awt.Color(153, 153, 255));
        pndangthuhien.setMaximumSize(new java.awt.Dimension(100, 46));
        pndangthuhien.setMinimumSize(new java.awt.Dimension(100, 46));

        progressBarCustom.setForeground(new java.awt.Color(51, 253, 15));
        progressBarCustom.setColorString(new java.awt.Color(0, 0, 0));
        progressBarCustom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbdangthuchien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbdangthuchien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbdangthuchien.setText("Đang thực hiện");

        javax.swing.GroupLayout pndangthuhienLayout = new javax.swing.GroupLayout(pndangthuhien);
        pndangthuhien.setLayout(pndangthuhienLayout);
        pndangthuhienLayout.setHorizontalGroup(
            pndangthuhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressBarCustom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbdangthuchien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pndangthuhienLayout.setVerticalGroup(
            pndangthuhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pndangthuhienLayout.createSequentialGroup()
                .addComponent(lbdangthuchien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(progressBarCustom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("jLabel1");

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pndangthuhien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imageAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(imageAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(pndangthuhien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btresetActionPerformed

    private void btmatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmatkhauActionPerformed
        // TODO add your handling code here:
        
        

    }//GEN-LAST:event_btmatkhauActionPerformed

    private void btchangeimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchangeimgActionPerformed
        // TODO add your handling code here:
//        jDialog1.setLocationRelativeTo(null);
//        jDialog1.setVisible(true);
        
        
    }//GEN-LAST:event_btchangeimgActionPerformed

    private void btreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btreset1ActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_btreset1ActionPerformed

    private void buttonshine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonshine1ActionPerformed
//         TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_buttonshine1ActionPerformed

    
    
    public final void runProgressBar() throws InterruptedException
    {
        Thread progress = new Thread(new Runnable(){
            @Override
            public void run() {
                lbdangthuchien.setText("Đang thực hiện");
                progressBarCustom.setVisible(true);
                int pgrbar = 0;
                while (pgrbar<100)
                {
                    int ramdom =(int)(10*Math.random()+1);
                    pgrbar+=ramdom;
                    if(pgrbar>100)
                    {
                        pgrbar=100;
                    }
                    progressBarCustom.setValue(pgrbar);
                    try {
                        Thread.sleep(70);
                    } catch (InterruptedException ex) {
                        System.out.println("Chay progress sai");;
                    }
                }
                
                lbdangthuchien.setText(" ");
                progressBarCustom.setVisible(false);
            }
        });
        progress.start();
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customcp.Buttonshine btchangeimg;
    private customcp.Buttonshine btmatkhau;
    private customcp.Buttonshine btreset;
    private customcp.Buttonshine btreset1;
    private customcp.Buttonshine buttonshine1;
    private javax.swing.ButtonGroup giolitinh;
    private customcp.ImageAvatar imageAvatar;
    private javax.swing.JLabel imgkhoc;
    private javax.swing.JButton jButton7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbdangthuchien;
    private javax.swing.JPanel pndangthuhien;
    private javax.swing.JPanel pnnhacnho;
    private customcp.ProgressBarCustom progressBarCustom;
    private javax.swing.JRadioButton radiobtkhac;
    private javax.swing.JRadioButton radiobtnam;
    private javax.swing.JRadioButton radiobtnu;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmadd;
    private javax.swing.JLabel txtmanv;
    private javax.swing.JTextField txtmatkhaucu;
    private javax.swing.JTextField txtmatkhaumoi;
    private javax.swing.JLabel txtnhacnho;
    private javax.swing.JLabel txtpass;
    private javax.swing.JTextField txtquequan;
    private javax.swing.JTextField txtsodt;
    private javax.swing.JLabel txttentk;
    private javax.swing.JTextField txtxacnhanmatkhau;
    // End of variables declaration//GEN-END:variables
}
