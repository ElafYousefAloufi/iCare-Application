// Group Names:
// Shuruq Baabdullah 1906284 VBR
// Rahaf Dawoud 1911088 VBR
// Elaf Yousef Aloufi 1911265
// Manar Mutlaq Altaiary 1906775
package CPIT252Project;

import CPIT252Project.Classes.MedicalEmployee;
import CPIT252Project.Classes.Patient;

import DesignPattern.*;
import java.sql.SQLException;
import javax.swing.*;

public class signin2 extends javax.swing.JFrame {

    public signin2() {
        initComponents();
        jLabel2.setIcon(new ImageIcon("src\\image\\small logo.png"));
        jLabel4.setIcon(new ImageIcon("src\\image\\background2.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        email2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        birthdate = new javax.swing.JTextField();
        SSN = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PN = new javax.swing.JTextField();
        LN = new javax.swing.JTextField();
        FN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        city1 = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        fnameLabel1 = new javax.swing.JLabel();
        ssnLabel = new javax.swing.JLabel();
        pnLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        UserType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        email2.setBackground(new java.awt.Color(255, 255, 255));
        email2.setMinimumSize(new java.awt.Dimension(414, 896));
        email2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(153, 124, 168));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(245, 245, 245));
        jButton2.setText("Sign in");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton2KeyTyped(evt);
            }
        });
        email2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, 190, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(112, 112, 112));
        jLabel20.setText("Password");
        email2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(112, 112, 112));
        jLabel19.setText("Age");
        email2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        birthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdateActionPerformed(evt);
            }
        });
        birthdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                birthdateKeyPressed(evt);
            }
        });
        email2.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 140, -1));

        SSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSNActionPerformed(evt);
            }
        });
        SSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SSNKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SSNKeyTyped(evt);
            }
        });
        email2.add(SSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 140, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(112, 112, 112));
        jLabel18.setText("City");
        email2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(112, 112, 112));
        jLabel17.setText("Email");
        email2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
        });
        email2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 140, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(112, 112, 112));
        jLabel16.setText("Gender");
        email2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(112, 112, 112));
        jLabel21.setText("User Type");
        email2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, -1, -1));

        PN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNActionPerformed(evt);
            }
        });
        PN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PNKeyPressed(evt);
            }
        });
        email2.add(PN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 140, -1));

        LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNActionPerformed(evt);
            }
        });
        email2.add(LN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 140, -1));

        FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNActionPerformed(evt);
            }
        });
        email2.add(FN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 140, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(112, 112, 112));
        jLabel11.setText("First Name");
        email2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(112, 112, 112));
        jLabel12.setText("Last name");
        email2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(112, 112, 112));
        jLabel13.setText("Phone Number");
        email2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(112, 112, 112));
        jLabel14.setText("SSN");
        email2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));
        email2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 140, 90));
        email2.add(city1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 140, -1));

        ageLabel.setForeground(new java.awt.Color(255, 51, 51));
        email2.add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 200, 20));
        email2.add(fnameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 140, 30));

        ssnLabel.setForeground(new java.awt.Color(255, 0, 0));
        email2.add(ssnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 200, 30));

        pnLabel.setForeground(new java.awt.Color(255, 51, 0));
        email2.add(pnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 200, 30));

        genderLabel.setForeground(new java.awt.Color(255, 51, 51));
        email2.add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 200, 30));

        gender.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gender.setForeground(new java.awt.Color(112, 112, 112));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        gender.setBorder(null);
        gender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        email2.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 140, -1));

        UserType.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        UserType.setForeground(new java.awt.Color(112, 112, 112));
        UserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Nurse", "Specialist" }));
        UserType.setBorder(null);
        email2.add(UserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 140, -1));
        email2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 150, -1));

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        email2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 200, 20));

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        email2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 140, -1));
        email2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 414, 896));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNActionPerformed

    private void LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNActionPerformed

    private void PNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PNKeyPressed
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            pnLabel.setText("* Please enter only digits");
        }
        if (this.PN.getText().length() != 9) {
            pnLabel.setText("* please enter 10 digits");
        } else {
            pnLabel.setText("");
        }
    }//GEN-LAST:event_PNKeyPressed

    private void PNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNActionPerformed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        char c = evt.getKeyChar();
        if (!this.email.getText().contains("@")) {
            jLabel3.setText("* please enter correct email ");
        } else {
            jLabel3.setText("");
        }
    }//GEN-LAST:event_emailKeyPressed

    private void SSNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SSNKeyTyped

    }//GEN-LAST:event_SSNKeyTyped

    private void SSNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SSNKeyPressed
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            ssnLabel.setText("* please enter only digits");
        } else if (this.SSN.getText().length() != 9) {
            ssnLabel.setText("* please enter 10 digits");
        } else {
            ssnLabel.setText("");
        }
    }//GEN-LAST:event_SSNKeyPressed

    private void SSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSNActionPerformed

    private void birthdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_birthdateKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            ageLabel.setText("* Please enter a number");
        } else {
            ageLabel.setText("");
        }
    }//GEN-LAST:event_birthdateKeyPressed

    private void jButton2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyTyped

    }//GEN-LAST:event_jButton2KeyTyped

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed

    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Database instance;
        try {
            instance = Database.getInastance();
            //   instance.DBCreation();         
            boolean found = false;

            if (!found) {

                if (this.UserType.getSelectedItem().equals("Patient") || this.UserType.toString().equalsIgnoreCase("P")) {
                    Patient p1;
                    p1 = new Patient(this.FN.getText(), this.LN.getText(), this.PN.getText(), this.SSN.getText(), (String) this.gender.getSelectedItem(), this.email.getText(), this.city1.getText(), this.birthdate.getText(), this.Password.getText());
                    instance.InsertPatientToDB(p1);
                } else if (this.UserType.getSelectedItem().equals("Nurse") || this.UserType.toString().equalsIgnoreCase("n")) {
                    MedicalEmployee nurse;
                    nurse = new MedicalEmployee("Available", "Nurse", this.FN.getText(), this.LN.getText(), this.PN.getText(), this.SSN.getText(), (String) this.gender.getSelectedItem(), this.email.getText(), this.city1.getText(), this.birthdate.getText(), this.Password.getText());
                    instance.InsertMedicalEmployeeToDB(nurse);
                } else if (this.UserType.getSelectedItem().equals("Specialist") || this.UserType.toString().equalsIgnoreCase("s")) {
                    MedicalEmployee specialist;
                    specialist = new MedicalEmployee("Available", "Specialist", this.FN.getText(), this.LN.getText(), this.PN.getText(), this.SSN.getText(), (String) this.gender.getSelectedItem(), this.email.getText(), this.city1.getText(), this.birthdate.getText(), this.Password.getText());
                    instance.InsertMedicalEmployeeToDB(specialist);
                }
                this.dispose();
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    private void birthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdateActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FN;
    private javax.swing.JTextField LN;
    private javax.swing.JTextField PN;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField SSN;
    private javax.swing.JComboBox<String> UserType;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField birthdate;
    private javax.swing.JTextField city1;
    private javax.swing.JTextField email;
    private javax.swing.JPanel email2;
    private javax.swing.JLabel fnameLabel1;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel pnLabel;
    private javax.swing.JLabel ssnLabel;
    // End of variables declaration//GEN-END:variables
}
