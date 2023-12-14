// Group Names:
// Shuruq Baabdullah 1906284 CAR
// Rahaf Dawoud 1911088 CAR
// Elaf Yousef Aloufi 1911265 CAR
// Manar Mutlaq Altaiary 1906775 CAR
// Wejdan Fawaz Aljabarti 1905144 EAR
package CPIT252Project;

import CPIT252Project.Classes.Appointment;
import CPIT252Project.Classes.Patient;
import CPIT252Project.Classes.User;
import DesignPattern.Database;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {
   private  Patient patient;

    public home() {
        initComponents();
        jLabel7.setIcon(new ImageIcon("src\\image\\small logo.png"));
        jLabel3.setIcon(new ImageIcon("src\\image\\nurse_icon.png"));
        jLabel4.setIcon(new ImageIcon("src\\image\\doctor_icon.png"));
        jLabel10.setIcon(new ImageIcon("src\\image\\background2.png"));
        

    }

    public home(User patient) {
        initComponents();
        jLabel7.setIcon(new ImageIcon("src\\image\\small logo.png"));
        jLabel3.setIcon(new ImageIcon("src\\image\\nurse_icon.png"));
        jLabel4.setIcon(new ImageIcon("src\\image\\doctor_icon.png"));
        this.patient = (Patient) patient;
        jLabel9.setText(jLabel9.getText() + "  " + patient.getFirstName());
         jButton2.setIcon(new ImageIcon("src\\image\\notification.png"));
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        BMI = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 112, 112));
        jLabel5.setText("Nurses ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(112, 112, 112));
        jLabel6.setText("Specialist ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Welcom ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 820, 70, 60));

        BMI.setBackground(new java.awt.Color(255, 255, 255));
        BMI.setText("Calculate my BMI");
        BMI.setBorder(null);
        BMI.setBorderPainted(false);
        BMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMIActionPerformed(evt);
            }
        });
        jPanel2.add(BMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 830, 160, 60));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 760, 230, 40));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 300, 30));

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 170, 160));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 170, 160));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(112, 112, 112));
        jLabel1.setText("healthcare helper");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -20, 158, 110));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(112, 112, 112));
        jLabel8.setText("Find your favorite");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 350, 50));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 414, 896));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 414, 896));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        // TODO add your handling code here:
        new nurses(patient).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new nurses(patient).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Database instance;
        try {
            instance = Database.getInastance();
            Appointment a = null;
            ResultSet res1 = instance.executeQuery("SELECT * FROM Available_Appointment");
            ResultSet res = instance.executeQuery("SELECT * FROM Patient");

            if (!res1.wasNull()) {
                while (res1.next()) {

                    String appointmentDate = res1.getString("appointmentDate");
                    boolean available = res1.getBoolean("available");
                    a = new Appointment(available, appointmentDate);

                }
            }
            if (!res.wasNull()) {
                while (res.next()) {
                    String FirstName = res.getString("FirstName");
                    Patient p = new Patient(FirstName);
                    if (!FirstName.equalsIgnoreCase(p.getFirstName())) {
                        a.registers(p);
                    }

                }
                a.setStatus(true);

            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMIActionPerformed
        // TODO add your handling code here:
        new calculation(patient).setVisible(true);
    }//GEN-LAST:event_BMIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BMI;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
