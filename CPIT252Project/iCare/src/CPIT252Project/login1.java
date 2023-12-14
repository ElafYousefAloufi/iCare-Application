// Group Names:
// Shuruq Baabdullah 1906284 CAR
// Rahaf Dawoud 1911088 CAR
// Elaf Yousef Aloufi 1911265 CAR
// Manar Mutlaq Altaiary 1906775 CAR
// Wejdan Fawaz Aljabarti 1905144 EAR
package CPIT252Project;

import CPIT252Project.Classes.MedicalEmployee;
import CPIT252Project.Classes.Patient;
import DesignPattern.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class login1 extends javax.swing.JFrame implements Access {

    private boolean found = false;
    private boolean isPatient = false;
    private boolean isNurse = false;
    private String U;
    private String p2;
    private static Access access;
    Patient patient;
    MedicalEmployee Nurse;
    public String getU() {
        return U;
    }

    public String getP2() {
        return p2;
    }

    public login1() {

        initComponents();
        jLabel3.setIcon(new ImageIcon("src\\image\\big logo.png"));
        jLabel4.setIcon(new ImageIcon("src\\image\\background2.png"));
        this.p2 = P.getText();
        this.U = userName.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        P = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(414, 896));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(414, 896));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(112, 112, 112));
        jLabel1.setText("Email");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(112, 112, 112));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 190, 30));

        jButton1.setBackground(new java.awt.Color(153, 124, 168));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(245, 245, 245));
        jButton1.setText("Login\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 170, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 250, 170));
        jPanel1.add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 190, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 112, 112));
        jLabel5.setText("Forgotten your password?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 300, 50));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 414, 896));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        access(userName.getText(), P.getText());
        if (found && isPatient) {
           new home(patient).setVisible(true);
        } else if (found && isNurse) {
            new nurseProfile(Nurse).setVisible(true);
        } else if (found && !isNurse) {
            new physicalTherapy().setVisible(true);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField P;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables

    @Override
    public void access(String email, String password) {

        try {

            Database instance;
            MedicalEmployee Nurse = null;
            Patient patient = null;

            instance = Database.getInastance();
            ResultSet res = instance.executeQuery("SELECT * FROM Patient");
            if (!res.wasNull()) {
                while (res.next()) {
                    String Email = res.getString("Email");
                    String password2 = res.getString("PassWord");
                    String FirstName = res.getString("FirstName");
                    String LastName = res.getString("LastName");
                    String PhoneNumber = res.getString("PhoneNumber");
                    String SSN = res.getString("SSN");
                    String Gender = res.getString("Gender");
                    String City = res.getString("City");
                    String Age = res.getString("Age");
                    if (Email.equalsIgnoreCase(userName.getText())) {

                        if (password2.equalsIgnoreCase(P.getText())) {
                           this.patient= patient = new Patient(FirstName, LastName, PhoneNumber, SSN, Gender, Email, City, Age, password2);
                            isPatient = true;
                            found = true;
                            login1 userinfo = new login1();
                            access = new loginProxy();
                            access.access(userinfo.getU(), userinfo.getP2());
                            break;
                        } else {
                            error.setText("Email or Password is not correct!");
                        }
                    } else {
                        error.setText("Email or Password is not correct!");
                    }
                }

            }

            if (!isPatient) {
                ResultSet res2 = instance.executeQuery("SELECT * FROM Medical_Employee");
                if (!res2.wasNull()) {
                    while (res2.next()) {

                        String Email = res2.getString("Email");
                        String password2 = res2.getString("PassWord");
                        String UserType = res2.getString("User_Type");
                        String FirstName = res2.getString("FirstName");
                        String LastName = res2.getString("LastName");
                        String PhoneNumber = res2.getString("PhoneNumber");
                        String SSN = res2.getString("SSN");
                        String Gender = res2.getString("Gender");
                        String City = res2.getString("City");
                        String Age = res2.getString("Age");
                        if (Email.equalsIgnoreCase(userName.getText())) {

                            if (password2.equalsIgnoreCase(P.getText())) {
                                if (UserType.equalsIgnoreCase("Nurse")) {
                                   this.Nurse= Nurse = new MedicalEmployee("New Nurse", "Nusre", FirstName, LastName, PhoneNumber, SSN, Gender, Email, City, FirstName, password2);
                                    isNurse = true;
                                }
                                found = true;
                                login1 userinfo = new login1();
                                access = new loginProxy();
                                access.access(userinfo.getU(), userinfo.getP2());
                                break;
                            } else {
                                error.setText("Email or Password is not correct!");
                            }
                        } else {
                            error.setText("Email or Password is not correct!");
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (Exception x) {
            System.out.println(x.toString());
        }
    }

    @Override
    public void checkAccess() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
