
package com.ahmed.maingui;
import com.ahmed.login_reg.login;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;



public class Main extends javax.swing.JFrame {

    DefaultTableModel dtm;

   Connection con;

    
    public Main() {
       initComponents();
    
    // Initialize dtm
    dtm = new DefaultTableModel();
    
    try {
         con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/University", "root","root");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Connection Failed");
    }
    
    updateLabels();
    fillTableModel_tbl_lect();
    fillTableModel_tbl_std();
    fillTableModel_tbl_crs(); // Call fillTableModel_tbl_crs() here   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        main = new rojerusan.RSButtonIconD();
        add_std = new rojerusan.RSButtonIconD();
        add_lect = new rojerusan.RSButtonIconD();
        add_crs = new rojerusan.RSButtonIconD();
        reg_std = new rojerusan.RSButtonIconD();
        reg_lect = new rojerusan.RSButtonIconD();
        dsp_crs = new rojerusan.RSButtonIconD();
        dsp_std = new rojerusan.RSButtonIconD();
        dsp_lect = new rojerusan.RSButtonIconD();
        main1 = new rojerusan.RSButtonIconD();
        about = new rojerusan.RSButtonIconD();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Lecturer_num = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Lecturer_num3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Lecturer_num5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Lecturer_num6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lecturer_num7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_crs = new rojeru_san.complementos.RSTableMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_lect = new rojeru_san.complementos.RSTableMetro();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_std = new rojeru_san.complementos.RSTableMetro();
        Lecturer_num2 = new javax.swing.JLabel();
        Lecturer_num4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setBackground(new java.awt.Color(102, 102, 255));
        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/home.png"))); // NOI18N
        main.setText("Main Menu");
        main.setColorHover(new java.awt.Color(102, 102, 255));
        main.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });
        jPanel1.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 358, 70));

        add_std.setBackground(new java.awt.Color(255, 153, 102));
        add_std.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/3534172.png"))); // NOI18N
        add_std.setText("Add Student");
        add_std.setColorHover(new java.awt.Color(153, 153, 255));
        add_std.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add_std.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_stdActionPerformed(evt);
            }
        });
        jPanel1.add(add_std, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 358, 70));

        add_lect.setBackground(new java.awt.Color(255, 153, 102));
        add_lect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/presentation.png"))); // NOI18N
        add_lect.setText("Add Lecturer");
        add_lect.setColorHover(new java.awt.Color(153, 153, 255));
        add_lect.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add_lect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_lect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_lectActionPerformed(evt);
            }
        });
        jPanel1.add(add_lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 358, 70));

        add_crs.setBackground(new java.awt.Color(255, 153, 102));
        add_crs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/online-course.png"))); // NOI18N
        add_crs.setText("Add Course");
        add_crs.setColorHover(new java.awt.Color(153, 153, 255));
        add_crs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add_crs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_crs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_crsActionPerformed(evt);
            }
        });
        jPanel1.add(add_crs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 358, 70));

        reg_std.setBackground(new java.awt.Color(255, 153, 102));
        reg_std.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/edit.png"))); // NOI18N
        reg_std.setText("Register Course to Student");
        reg_std.setColorHover(new java.awt.Color(153, 153, 255));
        reg_std.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reg_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_stdActionPerformed(evt);
            }
        });
        jPanel1.add(reg_std, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 358, 70));

        reg_lect.setBackground(new java.awt.Color(255, 153, 102));
        reg_lect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/edit.png"))); // NOI18N
        reg_lect.setText("Register Course to Lecturer");
        reg_lect.setColorHover(new java.awt.Color(153, 153, 255));
        reg_lect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reg_lect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_lectActionPerformed(evt);
            }
        });
        jPanel1.add(reg_lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 358, 70));

        dsp_crs.setBackground(new java.awt.Color(255, 153, 102));
        dsp_crs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/computer.png"))); // NOI18N
        dsp_crs.setText("Display All Courses ");
        dsp_crs.setColorHover(new java.awt.Color(153, 153, 255));
        dsp_crs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dsp_crs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsp_crsActionPerformed(evt);
            }
        });
        jPanel1.add(dsp_crs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 358, 70));

        dsp_std.setBackground(new java.awt.Color(255, 153, 102));
        dsp_std.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/computer.png"))); // NOI18N
        dsp_std.setText("Display All Students ");
        dsp_std.setColorHover(new java.awt.Color(153, 153, 255));
        dsp_std.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dsp_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsp_stdActionPerformed(evt);
            }
        });
        jPanel1.add(dsp_std, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 358, 70));

        dsp_lect.setBackground(new java.awt.Color(255, 153, 102));
        dsp_lect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/computer.png"))); // NOI18N
        dsp_lect.setText("Display All Lecturers ");
        dsp_lect.setColorHover(new java.awt.Color(153, 153, 255));
        dsp_lect.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dsp_lect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsp_lectActionPerformed(evt);
            }
        });
        jPanel1.add(dsp_lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 358, 70));

        main1.setBackground(new java.awt.Color(255, 51, 51));
        main1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/shutdown.png"))); // NOI18N
        main1.setText("Logout");
        main1.setColorHover(new java.awt.Color(102, 102, 255));
        main1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        main1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main1ActionPerformed(evt);
            }
        });
        jPanel1.add(main1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 358, 70));

        about.setBackground(new java.awt.Color(255, 153, 102));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/about.png"))); // NOI18N
        about.setText("About ");
        about.setColorHover(new java.awt.Color(153, 153, 255));
        about.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        about.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jPanel1.add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 358, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 828));

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 196, 112)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lecturer_num.setFont(new java.awt.Font("Segoe UI Black", 1, 70)); // NOI18N
        Lecturer_num.setText("numlect");
        Lecturer_num.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Lecturer_numAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(Lecturer_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 260, 140));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 440, 160));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 196, 112)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lecturer_num3.setFont(new java.awt.Font("Segoe UI Black", 1, 70)); // NOI18N
        Lecturer_num3.setText("numst");
        Lecturer_num3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Lecturer_num3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Lecturer_num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 170, 140));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 440, 160));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(255, 196, 112)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lecturer_num5.setFont(new java.awt.Font("Segoe UI Black", 1, 70)); // NOI18N
        Lecturer_num5.setText("numcrs");
        Lecturer_num5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Lecturer_num5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel5.add(Lecturer_num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 170, 140));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 440, 160));

        jPanel6.setBackground(new java.awt.Color(255, 153, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("University Registration System");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        Lecturer_num6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 35)); // NOI18N
        Lecturer_num6.setForeground(new java.awt.Color(255, 255, 255));
        Lecturer_num6.setText("X");
        Lecturer_num6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Lecturer_num6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Lecturer_num6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lecturer_num6MouseClicked(evt);
            }
        });
        jPanel6.add(Lecturer_num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, -20, 160, 90));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 70));

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Univirsty Registration System");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        Lecturer_num7.setFont(new java.awt.Font("Segoe UI Black", 1, 50)); // NOI18N
        Lecturer_num7.setForeground(new java.awt.Color(255, 255, 255));
        Lecturer_num7.setText("Lecturers");
        Lecturer_num7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Lecturer_num7AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(Lecturer_num7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 260, 140));

        tbl_crs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Course Name", "Course Code"
            }
        ));
        tbl_crs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_crs.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_crs.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_crs.setFuenteHead(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tbl_crs.setRowHeight(35);
        jScrollPane1.setViewportView(tbl_crs);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, 490));

        tbl_lect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Lecturer Name", "Lecturer ID", "Course"
            }
        ));
        tbl_lect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_lect.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_lect.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_lect.setRowHeight(35);
        jScrollPane2.setViewportView(tbl_lect);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 340, 490, 490));

        tbl_std.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student Name", "Student ID", "Course"
            }
        ));
        tbl_std.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_std.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_std.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl_std.setRowHeight(35);
        jScrollPane3.setViewportView(tbl_std);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 440, 490));

        Lecturer_num2.setFont(new java.awt.Font("Segoe UI Black", 1, 50)); // NOI18N
        Lecturer_num2.setForeground(new java.awt.Color(255, 255, 255));
        Lecturer_num2.setText("Students");
        Lecturer_num2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Lecturer_num2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(Lecturer_num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 260, 140));

        Lecturer_num4.setFont(new java.awt.Font("Segoe UI Black", 1, 50)); // NOI18N
        Lecturer_num4.setForeground(new java.awt.Color(255, 255, 255));
        Lecturer_num4.setText("Courses");
        Lecturer_num4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Lecturer_num4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(Lecturer_num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, 260, 140));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1470, 828));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Lecturer_numAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Lecturer_numAncestorAdded
        //college.displayAllStudents();
    }//GEN-LAST:event_Lecturer_numAncestorAdded

    private void Lecturer_num2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Lecturer_num2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Lecturer_num2AncestorAdded

    private void Lecturer_num3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Lecturer_num3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Lecturer_num3AncestorAdded

    private void Lecturer_num4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Lecturer_num4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Lecturer_num4AncestorAdded

    private void Lecturer_num5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Lecturer_num5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Lecturer_num5AncestorAdded

    private void Lecturer_num6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Lecturer_num6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Lecturer_num6AncestorAdded

    private void Lecturer_num7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Lecturer_num7AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Lecturer_num7AncestorAdded

    private void Lecturer_num6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lecturer_num6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Lecturer_num6MouseClicked

    private void add_lectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_lectActionPerformed
        // TODO add your handling code here:
          this.dispose();
        new AddLecturer().setVisible(true);
    }//GEN-LAST:event_add_lectActionPerformed

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        // TODO add your handling code here:this.dispose();
        new Main().setVisible(true);
        
    }//GEN-LAST:event_mainActionPerformed

    private void add_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_stdActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddStudent().setVisible(true);
    }//GEN-LAST:event_add_stdActionPerformed

    private void add_crsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_crsActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new AddCourse().setVisible(true);
    }//GEN-LAST:event_add_crsActionPerformed

    private void reg_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_stdActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CourseRegistrationStu().setVisible(true);
    }//GEN-LAST:event_reg_stdActionPerformed

    private void reg_lectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_lectActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CourseRegistrationLect().setVisible(true);
    }//GEN-LAST:event_reg_lectActionPerformed

    private void dsp_crsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsp_crsActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new DisplayAllCourses().setVisible(true);
    }//GEN-LAST:event_dsp_crsActionPerformed

    private void dsp_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsp_stdActionPerformed
this.dispose();
        new DisplayAllStudents().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_dsp_stdActionPerformed

    private void dsp_lectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsp_lectActionPerformed
        // TODO add your handling code here:
           this.dispose();
        new DisplayAllLecturers().setVisible(true);
    }//GEN-LAST:event_dsp_lectActionPerformed

    private void main1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main1ActionPerformed
        // TODO add your handling code here:
             this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_main1ActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new AboutMe().setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed


    private void updateLabels() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/University", "root","root")) {
        // Query to get the counts
        String lecturerQuery = "SELECT COUNT(*) FROM lecturer";
        String courseQuery = "SELECT COUNT(*) FROM courses";
        String studentQuery = "SELECT COUNT(*) FROM student";
        
        // Execute queries
        try (PreparedStatement lecturerStatement = connection.prepareStatement(lecturerQuery);
             PreparedStatement courseStatement = connection.prepareStatement(courseQuery);
             PreparedStatement studentStatement = connection.prepareStatement(studentQuery)) {
            
            // Retrieve counts
            int lecturerCount;
            int courseCount;
            int studentCount;

            try (ResultSet lecturerResult = lecturerStatement.executeQuery()) {
                lecturerResult.next();
                lecturerCount = lecturerResult.getInt(1);
            }

            try (ResultSet courseResult = courseStatement.executeQuery()) {
                courseResult.next();
                courseCount = courseResult.getInt(1);
            }

            try (ResultSet studentResult = studentStatement.executeQuery()) {
                studentResult.next();
                studentCount = studentResult.getInt(1);
            }
            
            // Update JLabels with the retrieved counts
            Lecturer_num.setText(String.valueOf(lecturerCount));
            Lecturer_num3.setText(String.valueOf(studentCount));
            Lecturer_num5.setText(String.valueOf(courseCount));
        }
    } catch (SQLException ex) {
        // Handle SQL exceptions
        ex.printStackTrace();
    }
    }
    
    
    private void fillTableModel_tbl_crs() {
    try {
        DefaultTableModel model = (DefaultTableModel) tbl_crs.getModel(); // Initialize the table model
        
        PreparedStatement stmt = con.prepareStatement("SELECT course_name, course_code FROM courses");
        ResultSet rs = stmt.executeQuery();
        
        // Clear existing rows from the table model
        model.setRowCount(0);
        
        // Iterate through the result set and add data to the table model
        while(rs.next()) {
            model.addRow(new Object[]{rs.getString(1), rs.getString(2)});
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Connection Failed");
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    private void fillTableModel_tbl_std() {
    try {
        // Clear existing data from the table model
        DefaultTableModel model = (DefaultTableModel) tbl_std.getModel();
        model.setRowCount(0);
        
        // Query to retrieve student name, ID, and course
        String query = "SELECT student.student_name, student.student_ID, student_course.course_code FROM student " +
                       "LEFT JOIN student_course ON student.student_ID = student_course.student_ID";
        
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            
            // Iterate through the result set and add data to the table model
            while (resultSet.next()) {
                String studentName = resultSet.getString("student_name");
                String studentID = resultSet.getString("student_ID");
                String courseCode = resultSet.getString("course_code");
                
                // Add data to the table model
                model.addRow(new Object[]{studentName, studentID, courseCode});
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        // Handle any SQL exceptions here
    }
}
    
    
    
    
    
    
    
    private void fillTableModel_tbl_lect() {
    try {
        // Clear existing data from the table model
        DefaultTableModel model = (DefaultTableModel) tbl_lect.getModel();
        model.setRowCount(0);
        
        // Query to retrieve lecturer name, ID, and course
//        "SELECT student.student_name, student.student_ID, student_course.course_code FROM student " +
//                       "LEFT JOIN student_course ON student.student_ID = student_course.student_ID";
        
        String query = "SELECT Lecturer.lecturer_name, lecturer_course.lecturer_ID, lecturer_course.course_code FROM lecturer_course JOIN Lecturer ON lecturer_course.lecturer_ID = Lecturer.lecturer_ID ";
        
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            
            // Iterate through the result set and add data to the table model
            while (resultSet.next()) {
                String lecturerName = resultSet.getString("lecturer_name");
                String lecturerID = resultSet.getString("lecturer_ID");
                String courseCode = resultSet.getString("course_code");
                
                // Add data to the table model
                model.addRow(new Object[]{lecturerName, lecturerID, courseCode});
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        // Handle any SQL exceptions here
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lecturer_num;
    private javax.swing.JLabel Lecturer_num2;
    private javax.swing.JLabel Lecturer_num3;
    private javax.swing.JLabel Lecturer_num4;
    private javax.swing.JLabel Lecturer_num5;
    private javax.swing.JLabel Lecturer_num6;
    private javax.swing.JLabel Lecturer_num7;
    private rojerusan.RSButtonIconD about;
    private rojerusan.RSButtonIconD add_crs;
    private rojerusan.RSButtonIconD add_lect;
    private rojerusan.RSButtonIconD add_std;
    private rojerusan.RSButtonIconD dsp_crs;
    private rojerusan.RSButtonIconD dsp_lect;
    private rojerusan.RSButtonIconD dsp_std;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private rojerusan.RSButtonIconD main;
    private rojerusan.RSButtonIconD main1;
    private rojerusan.RSButtonIconD reg_lect;
    private rojerusan.RSButtonIconD reg_std;
    private rojeru_san.complementos.RSTableMetro tbl_crs;
    private rojeru_san.complementos.RSTableMetro tbl_lect;
    private rojeru_san.complementos.RSTableMetro tbl_std;
    // End of variables declaration//GEN-END:variables
}
