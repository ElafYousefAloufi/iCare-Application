// Group Names:
// Shuruq Baabdullah 1906284 CAR
// Rahaf Dawoud 1911088 CAR
// Elaf Yousef Aloufi 1911265 CAR
// Manar Mutlaq Altaiary 1906775 CAR
// Wejdan Fawaz Aljabarti 1905144 EAR
package CPIT252Project;

import CPIT252Project.Classes.MedicalEmployee;
import CPIT252Project.Classes.Appointment;
import DesignPattern.AppointmentBuilder;
import DesignPattern.Database;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class newAppointments extends javax.swing.JFrame {

    MedicalEmployee nurse;

    public newAppointments() {
        initComponents();
        jLabel1.setIcon(new ImageIcon("src\\image\\background2.png"));
        jLabel2.setIcon(new ImageIcon("src\\image\\small logo.png"));
        jLabel7.setIcon(new ImageIcon("src\\image\\nurse_icon.png"));

    }

    public newAppointments(MedicalEmployee nurse) {
        initComponents();
        jLabel1.setIcon(new ImageIcon("src\\image\\background2.png"));
        jLabel2.setIcon(new ImageIcon("src\\image\\small logo.png"));
        jLabel7.setIcon(new ImageIcon("src\\image\\nurse_icon.png"));
        this.nurse = nurse;
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 124, 168));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(245, 245, 245));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, 250, 50));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 160, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 260, -1));

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 170, 160));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("The added appointment is: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Add new appointment:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 140, 90));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String DateChooser = jDateChooser1.getDate() + " ";
        jTextField3.setText(DateChooser.substring(0, 4) + " " + DateChooser.substring(4, 10) + " " + DateChooser.substring(30));
        AppointmentBuilder AppointmentBuilder= new AppointmentBuilder(nurse, jDateChooser1.getDate() + "");        
        Database instance;
        try {
            instance = Database.getInastance();
            //instance.DBCreation();
            instance.InsertAvailable_AppointmentToDB(AppointmentBuilder.prepareAnAvailableAppointment());
            this.dispose();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.toString());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        //  new nurses().setVisible(true);

    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
