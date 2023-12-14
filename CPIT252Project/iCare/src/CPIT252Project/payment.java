// Group Names:
// Shuruq Baabdullah 1906284 VBR
// Rahaf Dawoud 1911088 VBR
// Elaf Yousef Aloufi 1911265
// Manar Mutlaq Altaiary 1906775
package CPIT252Project;

import CPIT252Project.Classes.Patient;
import CPIT252Project.Classes.MedicalEmployee;
import CPIT252Project.Classes.Appointment;
import DesignPattern.AppointmentBuilder;
import DesignPattern.Database;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class payment extends javax.swing.JFrame {

    /**
     * Creates new form payment
     *
     * @param MedicalEmployee_SSN
     * @param patient
     * @param date
     * @param appointmentId
     */
    boolean isAppointmentNull= true;
    Appointment appointment;
    MedicalEmployee nurse;
    Patient patient;
    String date;

    public payment(String MedicalEmployee_SSN, Patient patient, String date, int appointmentId) {
        initComponents();
        this.patient = patient;
        this.date = date;
        jLabel1.setIcon(new ImageIcon("src\\image\\back.png"));
        jLabel2.setIcon(new ImageIcon("src\\image\\small logo.png"));
        jLabel3.setIcon(new ImageIcon("src\\image\\step3.png"));
        jLabel11.setIcon(new ImageIcon("src\\image\\line2.png"));
        jLabel12.setIcon(new ImageIcon("src\\image\\line2.png"));
        jLabel13.setIcon(new ImageIcon("src\\image\\line2.png"));
        //    jLabel14.setIcon(new ImageIcon("src\\image\\line2.png"));
        Database instance;
        String FirstName = null;
        String LastName = null;
        String Email = null;
        String password2 = null;
        String PhoneNumber = null;
        String SSN = null;
        String Gender = null;
        String City = null;
        String Age = null;

        try {
            instance = Database.getInastance();
            String sql = "SELECT * FROM Medical_Employee";
            ResultSet res2 = instance.executeQuery(sql);
            if (!res2.wasNull()) {
                while (res2.next()) {
                    SSN = res2.getString("SSN");
                    if (SSN.equalsIgnoreCase(MedicalEmployee_SSN)) {
                        Email = res2.getString("Email");
                        password2 = res2.getString("PassWord");
                        FirstName = res2.getString("FirstName");
                        
                        LastName = res2.getString("LastName");
                        PhoneNumber = res2.getString("PhoneNumber");
                        Gender = res2.getString("Gender");
                        City = res2.getString("City");
                        Age = res2.getString("Age");
                        nurse = new MedicalEmployee("New Nurse", "Nurse", FirstName, LastName, PhoneNumber, SSN, Gender, Email, City, Age, password2);
                        AppointmentBuilder AP= patient.makeAnAppointment(date, nurse);
                        AP.prepareAnAppointment();
                        AP.getAppointment().setAppointmentID(appointmentId);
                        AP.getAppointment().setAvailable(false);
                        appointment= AP.getAppointment();
                        isAppointmentNull=false;
                    }
                }
            }

            jLabel14.setText(FirstName + " " + LastName);
            jLabel13.setText(date);
            jLabel11.setText("100 SR");

        } catch (Exception x) {
           
            System.out.println(x.toString());
        }

    }

    public payment() {
        initComponents();
        jLabel1.setIcon(new ImageIcon("src\\image\\back.png"));
        jLabel2.setIcon(new ImageIcon("src\\image\\small logo.png"));
        jLabel3.setIcon(new ImageIcon("src\\image\\step3.png"));
        jLabel11.setIcon(new ImageIcon("src\\image\\line2.png"));
        jLabel12.setIcon(new ImageIcon("src\\image\\line2.png"));
        jLabel13.setIcon(new ImageIcon("src\\image\\line2.png"));
        jLabel14.setIcon(new ImageIcon("src\\image\\line2.png"));

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 110, 60));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 330, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(112, 112, 112));
        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 112, 112));
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(112, 112, 112));
        jLabel6.setText("Nurse / specialist");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 445, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(112, 112, 112));
        jLabel7.setText("Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(112, 112, 112));
        jLabel8.setText("Card number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(112, 112, 112));
        jLabel9.setText("Security code");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(112, 112, 112));
        jLabel10.setText("End date");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, -1, -1));

        jLabel11.setForeground(new java.awt.Color(153, 124, 168));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 210, 20));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 210, 20));

        jLabel13.setForeground(new java.awt.Color(153, 124, 168));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 210, 20));

        jLabel14.setForeground(new java.awt.Color(153, 124, 168));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 310, 20));

        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("                    /           ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 740, 170, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 170, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 170, -1));

        jButton1.setBackground(new java.awt.Color(153, 124, 168));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(245, 245, 245));
        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 820, 250, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Database instance;
            instance = Database.getInastance();
            if (isAppointmentNull) {
                System.out.println("null");
            } else {
                instance.InsertAppoentmentToDB(appointment);
                instance.deleteAppointmentfromDB(appointment.getID()+"");
                new thank_you(nurse, date,patient).setVisible(true);
                this.dispose();
            }

        } catch (Exception x) {
             JOptionPane.showMessageDialog(null, x.toString());
            
        }


    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
