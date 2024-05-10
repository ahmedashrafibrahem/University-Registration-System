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
public class AddLecturer extends javax.swing.JFrame {
    DefaultTableModel dtm;

   Connection con;
    public AddLecturer() {
        
        initComponents();
        dtm = new DefaultTableModel();
        
        dtm.addColumn("Lecturer Name : ");
        dtm.addColumn("Lecturer ID : ");

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

        jLabel1 = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lec_name = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lec_id = new app.bolivia.swing.JCTextField();
        lectu_name = new app.bolivia.swing.JCTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new rojeru_san.complementos.RSTableMetro();
        Add = new rojerusan.RSMaterialButtonCircle();
        REMOVE = new rojerusan.RSMaterialButtonCircle();
        UPDATE1 = new rojerusan.RSMaterialButtonCircle();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setBackground(new java.awt.Color(255, 153, 102));
        main.setForeground(new java.awt.Color(0, 112, 192));
        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/home.png"))); // NOI18N
        main.setText("Main Menu");
        main.setToolTipText("");
        main.setColorHover(new java.awt.Color(153, 153, 255));
        main.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });
        jPanel1.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 358, 70));

        add_std.setBackground(new java.awt.Color(255, 153, 102));
        add_std.setForeground(new java.awt.Color(0, 112, 192));
        add_std.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/3534172.png"))); // NOI18N
        add_std.setText("Add Student");
        add_std.setToolTipText("");
        add_std.setColorHover(new java.awt.Color(153, 153, 255));
        add_std.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        add_std.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_stdActionPerformed(evt);
            }
        });
        jPanel1.add(add_std, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 358, 70));

        add_lect.setBackground(new java.awt.Color(102, 102, 255));
        add_lect.setForeground(new java.awt.Color(0, 112, 192));
        add_lect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/presentation.png"))); // NOI18N
        add_lect.setText("Add Lecturer");
        add_lect.setToolTipText("");
        add_lect.setColorHover(new java.awt.Color(102, 102, 255));
        add_lect.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        add_lect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_lect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_lectActionPerformed(evt);
            }
        });
        jPanel1.add(add_lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 358, 70));

        add_crs.setBackground(new java.awt.Color(255, 153, 102));
        add_crs.setForeground(new java.awt.Color(0, 112, 192));
        add_crs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/online-course.png"))); // NOI18N
        add_crs.setText("Add Course");
        add_crs.setToolTipText("");
        add_crs.setColorHover(new java.awt.Color(153, 153, 255));
        add_crs.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        add_crs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_crs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_crsActionPerformed(evt);
            }
        });
        jPanel1.add(add_crs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 358, 70));

        reg_std.setBackground(new java.awt.Color(255, 153, 102));
        reg_std.setForeground(new java.awt.Color(0, 112, 192));
        reg_std.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/edit.png"))); // NOI18N
        reg_std.setText("Register Course to Student");
        reg_std.setToolTipText("");
        reg_std.setColorHover(new java.awt.Color(153, 153, 255));
        reg_std.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        reg_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_stdActionPerformed(evt);
            }
        });
        jPanel1.add(reg_std, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 358, 70));

        reg_lect.setBackground(new java.awt.Color(255, 153, 102));
        reg_lect.setForeground(new java.awt.Color(0, 112, 192));
        reg_lect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/edit.png"))); // NOI18N
        reg_lect.setText("Register Course to Lecturer");
        reg_lect.setToolTipText("");
        reg_lect.setColorHover(new java.awt.Color(153, 153, 255));
        reg_lect.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        reg_lect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_lectActionPerformed(evt);
            }
        });
        jPanel1.add(reg_lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 358, 70));

        dsp_crs.setBackground(new java.awt.Color(255, 153, 102));
        dsp_crs.setForeground(new java.awt.Color(0, 112, 192));
        dsp_crs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/computer.png"))); // NOI18N
        dsp_crs.setText("Display All Courses ");
        dsp_crs.setToolTipText("");
        dsp_crs.setColorHover(new java.awt.Color(153, 153, 255));
        dsp_crs.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        dsp_crs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsp_crsActionPerformed(evt);
            }
        });
        jPanel1.add(dsp_crs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 358, 70));

        dsp_std.setBackground(new java.awt.Color(255, 153, 102));
        dsp_std.setForeground(new java.awt.Color(0, 112, 192));
        dsp_std.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/computer.png"))); // NOI18N
        dsp_std.setText("Display All Students ");
        dsp_std.setToolTipText("");
        dsp_std.setColorHover(new java.awt.Color(153, 153, 255));
        dsp_std.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        dsp_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsp_stdActionPerformed(evt);
            }
        });
        jPanel1.add(dsp_std, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 358, 70));

        dsp_lect.setBackground(new java.awt.Color(255, 153, 102));
        dsp_lect.setForeground(new java.awt.Color(0, 112, 192));
        dsp_lect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ahmed/maingui/icons/computer.png"))); // NOI18N
        dsp_lect.setText("Display All Lecturers ");
        dsp_lect.setToolTipText("");
        dsp_lect.setColorHover(new java.awt.Color(153, 153, 255));
        dsp_lect.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        dsp_lect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsp_lectActionPerformed(evt);
            }
        });
        jPanel1.add(dsp_lect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 358, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 828));

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("University Registration System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 1470, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 153, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lecturer ID      :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 280, 100));

        lec_name.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lec_name.setForeground(new java.awt.Color(255, 255, 255));
        lec_name.setText("Add Lecturer From here :");
        jPanel4.add(lec_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -40, 530, 174));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lecturer Name :");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 290, 110));

        lec_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        lec_id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lec_id.setPlaceholder("Enter Lecturer ID :");
        jPanel4.add(lec_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 350, 50));

        lectu_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        lectu_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lectu_name.setPlaceholder("Enter Lecturer Name :");
        jPanel4.add(lectu_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 350, 50));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lecturer Name", "Lecturer ID"
            }
        ));
        tbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbl.setFuenteHead(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        tbl.setRowHeight(35);
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1470, 470));

        Add.setText("Add");
        Add.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel4.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 260, -1));

        REMOVE.setBackground(new java.awt.Color(255, 51, 51));
        REMOVE.setText("REMOVE");
        REMOVE.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        REMOVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REMOVEActionPerformed(evt);
            }
        });
        jPanel4.add(REMOVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 110, 260, -1));

        UPDATE1.setText("UPDATE");
        UPDATE1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        UPDATE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATE1ActionPerformed(evt);
            }
        });
        jPanel4.add(UPDATE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 260, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 1470, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
    if (!lectu_name.getText().isEmpty() && !lec_id.getText().isEmpty()) {
        try {
            String Lecturer_name = lectu_name.getText();
            String Lecturer_ID = lec_id.getText();

            PreparedStatement stmt = con.prepareStatement("INSERT INTO Lecturer(lecturer_name, lecturer_id) VALUES (?, ?)");
            stmt.setString(1, Lecturer_name);
            stmt.setString(2, Lecturer_ID);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Added Successfully");

            // Add the new record directly to the table
            Object[] rowData = {Lecturer_name, Lecturer_ID};
            dtm.addRow(rowData); // Add the new row to the table model

            // Clear the text fields after adding the record
            lectu_name.setText("");
            lec_id.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
    }
    }//GEN-LAST:event_AddActionPerformed

    private void UPDATE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATE1ActionPerformed
        // TODO add your handling code here:
        if (!lectu_name.getText().isEmpty() && !lec_id.getText().isEmpty()) {
        try {
            String Lecturer_name = lectu_name.getText();
            String Lecturer_ID = lec_id.getText();

            PreparedStatement stmt = con.prepareStatement("UPDATE Lecturer SET lecturer_name = ?, lecturer_id = ? WHERE lecturer_id = ?");
            stmt.setString(1, Lecturer_name);
            stmt.setString(2, Lecturer_ID);
            stmt.setString(3, Lecturer_ID); // Use the old ID to identify the row to update

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Updated Successfully");
                // Update the table model with the new values
                tbl.setValueAt(Lecturer_name, tbl.getSelectedRow(), 0);
                tbl.setValueAt(Lecturer_ID, tbl.getSelectedRow(), 1);
            } else {
                JOptionPane.showMessageDialog(this, "No record found to update");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
    }
    }//GEN-LAST:event_UPDATE1ActionPerformed

    private void REMOVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REMOVEActionPerformed
        // TODO add your handling code here:
        try {
        int selectedRowIndex = tbl.getSelectedRow();
        
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to remove");
            return;
        }
        
        String studentID = tbl.getValueAt(selectedRowIndex, 1).toString(); // Assuming student ID is in the second column
        
        PreparedStatement stmt = con.prepareStatement("DELETE FROM lecturer WHERE lecturer_ID = ?");
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
    }//GEN-LAST:event_REMOVEActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        lectu_name.setText(tbl.getValueAt(tbl.getSelectedRow(), 0).toString());
        lec_id.setText(tbl.getValueAt(tbl.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tblMouseClicked

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_mainActionPerformed

    private void add_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_stdActionPerformed
        // TODO add your handling code here
        this.dispose();
        new AddStudent().setVisible(true);
    }//GEN-LAST:event_add_stdActionPerformed

    private void add_lectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_lectActionPerformed
        // TODO add your handling code here:
          this.dispose();
        new AddLecturer().setVisible(true);
    }//GEN-LAST:event_add_lectActionPerformed

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
        // TODO add your handling code here:
        this.dispose();
        new DisplayAllStudents().setVisible(true);
    }//GEN-LAST:event_dsp_stdActionPerformed

    private void dsp_lectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsp_lectActionPerformed
        // TODO add your handling code here:
           this.dispose();
        new DisplayAllLecturers().setVisible(true);
    }//GEN-LAST:event_dsp_lectActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    private void fillTableMode(){
        try {
            PreparedStatement stmt = con.prepareStatement("select lecturer_name, lecturer_id from lecturer");

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
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle Add;
    private rojerusan.RSMaterialButtonCircle REMOVE;
    private rojerusan.RSMaterialButtonCircle UPDATE1;
    private rojerusan.RSButtonIconD add_crs;
    private rojerusan.RSButtonIconD add_lect;
    private rojerusan.RSButtonIconD add_std;
    private rojerusan.RSButtonIconD dsp_crs;
    private rojerusan.RSButtonIconD dsp_lect;
    private rojerusan.RSButtonIconD dsp_std;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private app.bolivia.swing.JCTextField lec_id;
    private javax.swing.JLabel lec_name;
    private app.bolivia.swing.JCTextField lectu_name;
    private rojerusan.RSButtonIconD main;
    private rojerusan.RSButtonIconD reg_lect;
    private rojerusan.RSButtonIconD reg_std;
    private rojeru_san.complementos.RSTableMetro tbl;
    // End of variables declaration//GEN-END:variables
}
