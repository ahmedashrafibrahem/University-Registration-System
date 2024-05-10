/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.maingui;
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

public class CourseRegistrationStu extends javax.swing.JFrame {
    DefaultTableModel dtm;

   Connection con;
    public CourseRegistrationStu() {
        initComponents();
        dtm = new DefaultTableModel();
        
        dtm.addColumn("Student ID : ");
        dtm.addColumn("Course Code : ");

        try {
             con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/University", "root","root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
        
        fillTableMode();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dsp_lect = new rojerusan.RSButtonIconD();
        add_std = new rojerusan.RSButtonIconD();
        add_lect = new rojerusan.RSButtonIconD();
        main = new rojerusan.RSButtonIconD();
        reg_std = new rojerusan.RSButtonIconD();
        reg_lect = new rojerusan.RSButtonIconD();
        dsp_crs = new rojerusan.RSButtonIconD();
        dsp_std = new rojerusan.RSButtonIconD();
        add_crs = new rojerusan.RSButtonIconD();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        crs_code = new app.bolivia.swing.JCTextField();
        jLabel1 = new javax.swing.JLabel();
        std_id = new app.bolivia.swing.JCTextField();
        Register = new rojerusan.RSMaterialButtonCircle();
        jLabel4 = new javax.swing.JLabel();
        Remove = new rojerusan.RSMaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dsp_lect.setBackground(new java.awt.Color(255, 153, 102));
        dsp_lect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/computer.png"))); // NOI18N
        dsp_lect.setText("Display All Lecturers");
        dsp_lect.setAlignmentY(0.0F);
        dsp_lect.setColorHover(new java.awt.Color(153, 153, 255));
        dsp_lect.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        dsp_lect.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dsp_lect.setIconTextGap(15);
        dsp_lect.setMargin(new java.awt.Insets(2, 5, 2, 5));
        dsp_lect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsp_lectActionPerformed(evt);
            }
        });
        jPanel1.add(dsp_lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 358, 70));

        add_std.setBackground(new java.awt.Color(255, 153, 102));
        add_std.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/3534172.png"))); // NOI18N
        add_std.setText("Add Student");
        add_std.setColorHover(new java.awt.Color(153, 153, 255));
        add_std.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add_std.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_std.setMargin(new java.awt.Insets(2, 5, 2, 5));
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
        add_lect.setMargin(new java.awt.Insets(2, 5, 2, 5));
        add_lect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_lectActionPerformed(evt);
            }
        });
        jPanel1.add(add_lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, 358, 70));

        main.setBackground(new java.awt.Color(255, 153, 102));
        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/home.png"))); // NOI18N
        main.setText("Main Menu");
        main.setColorHover(new java.awt.Color(153, 153, 255));
        main.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        main.setMargin(new java.awt.Insets(2, 5, 2, 5));
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });
        jPanel1.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 650, 358, 70));

        reg_std.setBackground(new java.awt.Color(102, 102, 255));
        reg_std.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/edit.png"))); // NOI18N
        reg_std.setText("Register Course to Student");
        reg_std.setToolTipText("");
        reg_std.setAlignmentY(0.0F);
        reg_std.setColorHover(new java.awt.Color(102, 102, 255));
        reg_std.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        reg_std.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        reg_std.setIconTextGap(15);
        reg_std.setMargin(new java.awt.Insets(2, 5, 2, 5));
        reg_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_stdActionPerformed(evt);
            }
        });
        jPanel1.add(reg_std, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 358, 70));

        reg_lect.setBackground(new java.awt.Color(255, 153, 102));
        reg_lect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/edit.png"))); // NOI18N
        reg_lect.setText("Register Course to Lecturer");
        reg_lect.setAlignmentY(0.0F);
        reg_lect.setColorHover(new java.awt.Color(153, 153, 255));
        reg_lect.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        reg_lect.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        reg_lect.setIconTextGap(15);
        reg_lect.setMargin(new java.awt.Insets(2, 5, 2, 5));
        reg_lect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_lectActionPerformed(evt);
            }
        });
        jPanel1.add(reg_lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 358, 70));

        dsp_crs.setBackground(new java.awt.Color(255, 153, 102));
        dsp_crs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/computer.png"))); // NOI18N
        dsp_crs.setText("Display All Courses ");
        dsp_crs.setAlignmentY(0.0F);
        dsp_crs.setColorHover(new java.awt.Color(153, 153, 255));
        dsp_crs.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        dsp_crs.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dsp_crs.setIconTextGap(15);
        dsp_crs.setMargin(new java.awt.Insets(2, 5, 2, 5));
        dsp_crs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsp_crsActionPerformed(evt);
            }
        });
        jPanel1.add(dsp_crs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 358, 70));

        dsp_std.setBackground(new java.awt.Color(255, 153, 102));
        dsp_std.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/computer.png"))); // NOI18N
        dsp_std.setText("Display All Students");
        dsp_std.setAlignmentY(0.0F);
        dsp_std.setColorHover(new java.awt.Color(153, 153, 255));
        dsp_std.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        dsp_std.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dsp_std.setIconTextGap(15);
        dsp_std.setMargin(new java.awt.Insets(2, 5, 2, 5));
        dsp_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsp_stdActionPerformed(evt);
            }
        });
        jPanel1.add(dsp_std, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 358, 70));

        add_crs.setBackground(new java.awt.Color(255, 153, 102));
        add_crs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/online-course.png"))); // NOI18N
        add_crs.setText("Add Course");
        add_crs.setColorHover(new java.awt.Color(153, 153, 255));
        add_crs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add_crs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_crs.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        add_crs.setMargin(new java.awt.Insets(2, 5, 2, 5));
        add_crs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_crsActionPerformed(evt);
            }
        });
        jPanel1.add(add_crs, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 210, 358, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 990));

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("University Registration System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1470, 70));

        jPanel3.setBackground(new java.awt.Color(255, 153, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crs_code.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        crs_code.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        crs_code.setPlaceholder("Enter Course Code :");
        jPanel3.add(crs_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 350, 50));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course Code :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        std_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        std_id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        std_id.setPlaceholder("Enter Student ID :");
        jPanel3.add(std_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 350, 50));

        Register.setText("Register");
        Register.setToolTipText("");
        Register.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel3.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 260, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student ID :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        Remove.setBackground(new java.awt.Color(255, 51, 51));
        Remove.setText("Remove");
        Remove.setToolTipText("");
        Remove.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        jPanel3.add(Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 60, 260, -1));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student ID", "Course Code"
            }
        ));
        tbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl.setFuenteHead(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tbl.setPreferredSize(new java.awt.Dimension(360, 920));
        tbl.setRowHeight(35);
        jScrollPane1.setViewportView(tbl);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 200, 1480, 720));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 1470, 920));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // Retrieve the student ID and course code from the text fields

    
    // TODO add your handling code here:
        if (!std_id.getText().isEmpty() && !crs_code.getText().isEmpty()) {
        try {
            String studentID = std_id.getText();
            String courseCode = crs_code.getText();

            PreparedStatement stmt = con.prepareStatement("INSERT INTO Student_Course (student_id, course_code) VALUES (?, ?)");
            stmt.setString(1, studentID);
            stmt.setString(2, courseCode);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Added Successfully");

            // Add the new record directly to the table
            Object[] rowData = {studentID, courseCode};
            dtm.addRow(rowData); // Add the new row to the table model

            // Clear the text fields after adding the record
            std_id.setText("");
            crs_code.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
    }
    
    
    
    
    
    }//GEN-LAST:event_RegisterActionPerformed

    private void dsp_lectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsp_lectActionPerformed
        // TODO add your handling code here:
           this.dispose();
        new DisplayAllLecturers().setVisible(true);
    }//GEN-LAST:event_dsp_lectActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void add_lectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_lectActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddLecturer().setVisible(true);
    }//GEN-LAST:event_add_lectActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // TODO add your handling code here:
        try {
        int selectedRowIndex = tbl.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to remove");
            return;
        }

        String courseCode = tbl.getValueAt(selectedRowIndex, 1).toString();

        PreparedStatement stmt = con.prepareStatement("DELETE FROM Student_Course WHERE course_code = ?");
        stmt.setString(1, courseCode);

        int rowsDeleted = stmt.executeUpdate();
        if (rowsDeleted > 0) {
            dtm.removeRow(selectedRowIndex); // Remove the row from the table model
            JOptionPane.showMessageDialog(this, "Removed Successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No record found to remove");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Connection Failed");
    }
    }//GEN-LAST:event_RemoveActionPerformed

    private void add_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_stdActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddStudent().setVisible(true);
    }//GEN-LAST:event_add_stdActionPerformed

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Main().setVisible(true);
        
    }//GEN-LAST:event_mainActionPerformed

    private void reg_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_stdActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
        this.dispose();
        new DisplayAllStudents().setVisible(true);
    }//GEN-LAST:event_dsp_stdActionPerformed

    private void add_crsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_crsActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddCourse().setVisible(true);
    }//GEN-LAST:event_add_crsActionPerformed

 
    
    private void fillTableMode() {
    try {
        PreparedStatement stmt = con.prepareStatement("SELECT student_id, course_code FROM Student_Course");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            String student_id = rs.getString(1);
            String courseCode = rs.getString(2);
            Object[] rowData = {student_id, courseCode};
            dtm.addRow(rowData);
        }
        tbl.setModel(dtm);

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Connection Failed");
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
            java.util.logging.Logger.getLogger(CourseRegistrationStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseRegistrationStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseRegistrationStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseRegistrationStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseRegistrationStu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle Register;
    private rojerusan.RSMaterialButtonCircle Remove;
    private rojerusan.RSButtonIconD add_crs;
    private rojerusan.RSButtonIconD add_lect;
    private rojerusan.RSButtonIconD add_std;
    private app.bolivia.swing.JCTextField crs_code;
    private rojerusan.RSButtonIconD dsp_crs;
    private rojerusan.RSButtonIconD dsp_lect;
    private rojerusan.RSButtonIconD dsp_std;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSButtonIconD main;
    private rojerusan.RSButtonIconD reg_lect;
    private rojerusan.RSButtonIconD reg_std;
    private app.bolivia.swing.JCTextField std_id;
    private rojeru_san.complementos.RSTableMetro tbl;
    // End of variables declaration//GEN-END:variables
}
