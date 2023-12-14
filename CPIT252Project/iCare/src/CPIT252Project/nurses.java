// Group Names:
// Shuruq Baabdullah 1906284 VBR
// Rahaf Dawoud 1911088 VBR
// Elaf Yousef Aloufi 1911265
// Manar Mutlaq Elaf Yousef Aloufi 1906775
package CPIT252Project;

import CPIT252Project.Classes.Patient;
import CPIT252Project.Classes.Appointment;
import DesignPattern.AppointmentBuilder;
import DesignPattern.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.*;

public class nurses extends javax.swing.JFrame {
    Appointment appointment;
    Patient p;
    String MedicalEmployee_SSN;
    String appointmentDate;
    int appointmentID;
    boolean available;
    String appointments;
    String state;
    ArrayList<Appointment> idOfAppointment = new ArrayList<Appointment>();
    
    Database instance;

    public nurses() {
        initComponents();
        jLabel4.setIcon(new ImageIcon("src\\image\\background.png"));
        jLabel1.setIcon(new ImageIcon("src\\image\\back.png"));
        jLabel3.setIcon(new ImageIcon("src\\image\\nurse1.png"));

        try {
            instance = Database.getInastance();
            ResultSet res2 = instance.executeQuery("SELECT * FROM Available_Appointment");
            if (!res2.wasNull()) {
                while (res2.next()) {
                    appointmentID = res2.getInt("appointmentID");
                    appointmentDate = res2.getString("appointmentDate");

                    available = res2.getBoolean("available");
                    MedicalEmployee_SSN = res2.getString("MedicalEmployee_SSN");
                    if (available == true) {
                        state = "Available";
                    } else {
                        state = "Not Available";
                    }
                    appointments = appointmentID + " " + appointmentDate + " " + state + " " + MedicalEmployee_SSN;
                    
                    jButton1.setText("Book");
//                    jTextPane1.setText(jTextPane1.getText()
//                            + appointmentID + " " + appointmentDate + " " + available + " " + MedicalEmployee_SSN);
                }
            }

        } catch (SQLException ex) {

        }

    }

    

    public nurses(Patient patient) {
        initComponents();
        jLabel4.setIcon(new ImageIcon("src\\image\\background.png"));
        jLabel1.setIcon(new ImageIcon("src\\image\\back.png"));
        jLabel3.setIcon(new ImageIcon("src\\image\\nurse1.png"));
        // jLabel5.setIcon(new ImageIcon("src\\image\\nurse2.png"));
        //jLabel6.setIcon(new ImageIcon("src\\image\\nurse3.png"));
        this.p = patient;
        
        try {
            instance = Database.getInastance();
            ResultSet res2 = instance.executeQuery("SELECT * FROM Available_Appointment");
            if (!res2.wasNull()) {
                
                while (res2.next()) {
                    available = res2.getBoolean("available");
                    if (available) {
                        appointmentID = res2.getInt("appointmentID");
                        
                    appointmentDate = res2.getString("appointmentDate");
                   
                    MedicalEmployee_SSN = res2.getString("MedicalEmployee_SSN");
                    jTextPane1.setText(jTextPane1.getText()
                            + appointmentID + " " + appointmentDate + " " + available + " " + MedicalEmployee_SSN+"\n");
                idOfAppointment.add(new Appointment(appointmentDate, appointmentID, available, MedicalEmployee_SSN));
                       
                    }
                   
                    
                }
            }
            
          
          
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        IDAP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 100));

        jButton1.setBackground(new java.awt.Color(153, 124, 168));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 100, -1));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 250, 50));

        jScrollPane1.setViewportView(jTextPane1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 270, 280));
        jPanel2.add(IDAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 130, -1));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 320, 30));

        jLabel7.setText("Enter appintment ID");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 390, 580));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(112, 112, 112));
        jLabel2.setText("Nurses");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 414, 896));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new home(p).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int idFromUser = Integer.parseInt(IDAP.getText());
        for (int i = 0; i < idOfAppointment.size(); i++) {
            if (idOfAppointment.get(i).getID()==idFromUser ) {
                new payment(idOfAppointment.get(i).getMedicalEmployee_SSN(), p, idOfAppointment.get(i).getAppointmentDate(), idOfAppointment.get(i).getID()).setVisible(true);
        this.dispose();
            }else{
                jLabel6.setText("Sorry the id that you entered is not in the system");
            }
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDAP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
