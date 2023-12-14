package DesignPattern;
import CPIT252Project.Classes.*;
public class AppointmentBuilder {
    private Appointment Appointment;
    private MedicalEmployee MedicalEmployee;
    private String date;
    private Patient patient;
    public AppointmentBuilder(MedicalEmployee MedicalEmployee, String date) {
        this.MedicalEmployee = MedicalEmployee;
        this.date = date;
    }
    public AppointmentBuilder(Patient patient, MedicalEmployee MedicalEmployee, String date) {
        this.MedicalEmployee = MedicalEmployee;
        this.date = date;
        this.patient = patient;
    }
    public Appointment prepareAnAvailableAppointment() {
        this.Appointment = new Appointment(MedicalEmployee, date);
        Appointment.setAvailable(true);
        return Appointment;
    }
    public Appointment prepareAnAppointment() {
        this.Appointment = new Appointment(patient, MedicalEmployee, date);
        return Appointment;
    }
    public Appointment getAppointment() {
        return Appointment;
    }public void setAppointment(Appointment Appointment) {
        this.Appointment=Appointment;
    }
}
