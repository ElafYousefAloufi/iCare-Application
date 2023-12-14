package CPIT252Project.Classes;
import DesignPattern.AppointmentBuilder;
import DesignPattern.Observer;
import javax.swing.JOptionPane;
public class Patient extends User implements Observer {
    private AppointmentBuilder appointment;
    private String name;
    public AppointmentBuilder getAppointment() {
        return appointment;
    }
     public void setAppointment(AppointmentBuilder appointment) {
       this.appointment=appointment;
    }
     public AppointmentBuilder makeAnAppointment(String date,MedicalEmployee MedicalEmployee){
         appointment= new AppointmentBuilder(this,MedicalEmployee, date);
         return appointment;
     }
    public Patient(String name) {
        this.name = name;
    }
    public Patient(String firstName, String lastName, String phoneNumber, String SSN, String gender, String Email, String city, String birthDate, String password) {
        super(firstName, lastName, phoneNumber, SSN, gender, Email, city, birthDate, password);
    }
    @Override
    public void updates(String update) {
        JOptionPane.showMessageDialog(null, name + " has new notification: " + update);

    }

}
