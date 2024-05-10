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

/**
 *
 * @author Ahmed Ashraf
 */
public class AddCourse extends javax.swing.JFrame {
    DefaultTableModel dtm;

   Connection con;
    public AddCourse() {
        initComponents();
        dtm = new DefaultTableModel();
        
        dtm.addColumn("Course Name : ");
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
        main = new rojerusan.RSButtonIconD();
        add_lect = new rojerusan.RSButtonIconD();
        add_crs = new rojerusan.RSButtonIconD();
        reg_std = new rojerusan.RSButtonIconD();
        reg_lect = new rojerusan.RSButtonIconD();
        dsp_crs = new rojerusan.RSButtonIconD();
        dsp_std = new rojerusan.RSButtonIconD();
        add_std = new rojerusan.RSButtonIconD();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new rojeru_san.complementos.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        crs_code = new app.bolivia.swing.JCTextField();
        crs_name1 = new app.bolivia.swing.JCTextField();
        Remove = new rojerusan.RSMaterialButtonCircle();
        Add = new rojerusan.RSMaterialButtonCircle();
        Update1 = new rojerusan.RSMaterialButtonCircle();

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
        dsp_lect.setColorHover(new java.awt.Color(153, 153, 255));
        dsp_lect.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dsp_lect.setMargin(new java.awt.Insets(2, 5, 2, 5));
        dsp_lect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsp_lectActionPerformed(evt);
            }
        });
        jPanel1.add(dsp_lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 358, 70));

        main.setBackground(new java.awt.Color(255, 153, 102));
        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/home.png"))); // NOI18N
        main.setText("Main Menu");
        main.setColorHover(new java.awt.Color(153, 153, 255));
        main.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main.setMargin(new java.awt.Insets(2, 5, 2, 5));
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });
        jPanel1.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 358, 70));

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
        jPanel1.add(add_lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 358, 70));

        add_crs.setBackground(new java.awt.Color(102, 102, 255));
        add_crs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/online-course.png"))); // NOI18N
        add_crs.setText("Add Courses");
        add_crs.setColorHover(new java.awt.Color(102, 102, 255));
        add_crs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add_crs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_crs.setMargin(new java.awt.Insets(2, 5, 2, 5));
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
        reg_std.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
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
        reg_lect.setColorHover(new java.awt.Color(153, 153, 255));
        reg_lect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        dsp_crs.setColorHover(new java.awt.Color(153, 153, 255));
        dsp_crs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dsp_crs.setMargin(new java.awt.Insets(2, 5, 2, 5));
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
        dsp_std.setMargin(new java.awt.Insets(2, 5, 2, 5));
        dsp_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsp_stdActionPerformed(evt);
            }
        });
        jPanel1.add(dsp_std, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 358, 70));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 828));

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 153, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Univirsty Registration System");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 10, 40, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 70));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Course Name: ", "Course Code: "
            }
        ));
        tbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl.setFuenteHead(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tbl.setRowHeight(35);
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 380, 1480, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add Course From here :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 500, 180));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course Name : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 290, 90));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Course Code : ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 290, 180));

        crs_code.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        crs_code.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        crs_code.setPlaceholder("Enter Course Code : ");
        jPanel2.add(crs_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 350, 50));

        crs_name1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        crs_name1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        crs_name1.setPlaceholder("Enter Course Name : ");
        jPanel2.add(crs_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 350, 50));

        Remove.setBackground(new java.awt.Color(255, 51, 51));
        Remove.setText("Remove");
        Remove.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        jPanel2.add(Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 180, 260, -1));

        Add.setText("Add");
        Add.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel2.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 260, -1));

        Update1.setText("Update");
        Update1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update1ActionPerformed(evt);
            }
        });
        jPanel2.add(Update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 260, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1470, 828));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        crs_name1.setText(tbl.getValueAt(tbl.getSelectedRow(), 0).toString());
        crs_code.setText(tbl.getValueAt(tbl.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tblMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        if (!crs_name1.getText().isEmpty() && !crs_code.getText().isEmpty()) {
        try {
            String Course_name = crs_name1.getText();
            String Course_Code = crs_code.getText();

            PreparedStatement stmt = con.prepareStatement("INSERT INTO Courses(course_name, course_code) VALUES (?, ?)");
            stmt.setString(1, Course_name);
            stmt.setString(2, Course_Code);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Added Successfully");

            // Add the new record directly to the table
            Object[] rowData = {Course_name, Course_Code};
            dtm.addRow(rowData); // Add the new row to the table model

            // Clear the text fields after adding the record
            crs_name1.setText("");
            crs_code.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
    }
    }//GEN-LAST:event_AddActionPerformed

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
        // TODO add your handling code here:
        if (!crs_name1.getText().isEmpty() && !crs_code.getText().isEmpty()) {
        try {
            String newCourseName = crs_name1.getText();
            String newCourseCode = crs_code.getText();
            String oldCourseCode = tbl.getValueAt(tbl.getSelectedRow(), 1).toString();
            
            PreparedStatement stmt = con.prepareStatement("UPDATE courses SET course_name = ?, course_code = ? WHERE course_code = ?");
            stmt.setString(1, newCourseName);
            stmt.setString(2, newCourseCode);
            stmt.setString(3, oldCourseCode); // Use the old course code to identify the row to update
            
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Updated Successfully");
                // Update the table model with the new values
                tbl.setValueAt(newCourseName, tbl.getSelectedRow(), 0);
                tbl.setValueAt(newCourseCode, tbl.getSelectedRow(), 1);
            } else {
                JOptionPane.showMessageDialog(this, "No record found to update");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
    }
    }//GEN-LAST:event_Update1ActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // TODO add your handling code here:
        try {
        int selectedRowIndex = tbl.getSelectedRow();
        
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to remove");
            return;
        }
        
        String studentID = tbl.getValueAt(selectedRowIndex, 1).toString(); // Assuming student ID is in the second column
        
        PreparedStatement stmt = con.prepareStatement("DELETE FROM courses WHERE course_code = ?");
        stmt.setString(1, studentID);
        
        int rowsDeleted = stmt.executeUpdate();
        if (rowsDeleted > 0) {
            dtm.removeRow(selectedRowIndex); // Remove the row from the table model
            JOptionPane.showMessageDialog(this, "Removed Successfully");
        } else {
            JOptionPane.showMessageDialog(this, "No record found to remove");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Removal Failed: " + ex.getMessage());
    }
    }//GEN-LAST:event_RemoveActionPerformed

    private void add_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_stdActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddStudent().setVisible(true);
    }//GEN-LAST:event_add_stdActionPerformed

    private void add_lectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_lectActionPerformed
        // TODO add your handling code here:
          this.dispose();
        new AddLecturer().setVisible(true);
    }//GEN-LAST:event_add_lectActionPerformed

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

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_mainActionPerformed

    private void add_crsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_crsActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new AddCourse().setVisible(true);
    }//GEN-LAST:event_add_crsActionPerformed

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

    private void dsp_lectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsp_lectActionPerformed
        // TODO add your handling code here:
           this.dispose();
        new DisplayAllLecturers().setVisible(true);
    }//GEN-LAST:event_dsp_lectActionPerformed

   
    
    private void fillTableMode(){
        try {
            PreparedStatement stmt = con.prepareStatement("select course_name, course_code from courses");

            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                dtm.addRow(new Object[]{rs.getString(1),rs.getString(2)});
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
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle Add;
    private rojerusan.RSMaterialButtonCircle Remove;
    private rojerusan.RSMaterialButtonCircle Update1;
    private rojerusan.RSButtonIconD add_crs;
    private rojerusan.RSButtonIconD add_lect;
    private rojerusan.RSButtonIconD add_std;
    private app.bolivia.swing.JCTextField crs_code;
    private app.bolivia.swing.JCTextField crs_name1;
    private rojerusan.RSButtonIconD dsp_crs;
    private rojerusan.RSButtonIconD dsp_lect;
    private rojerusan.RSButtonIconD dsp_std;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSButtonIconD main;
    private rojerusan.RSButtonIconD reg_lect;
    private rojerusan.RSButtonIconD reg_std;
    private rojeru_san.complementos.RSTableMetro tbl;
    // End of variables declaration//GEN-END:variables
}
