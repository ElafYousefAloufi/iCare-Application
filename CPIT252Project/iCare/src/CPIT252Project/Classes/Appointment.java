package CPIT252Project.Classes;
import DesignPattern.*;
import java.util.ArrayList;
public class Appointment implements Subject {
    private Patient Patient;
    private MedicalEmployee MedicalEmployee;
    private String appointmentDate;
    private int appointmentID;
    private boolean available=true;
    private ArrayList<Observer> list;
    private Boolean status;
    private String availablity;
    private String MedicalEmployee_SSN; 
    public String getMedicalEmployee_SSN() {
        return MedicalEmployee_SSN;
    }
    public Appointment(Patient Patient, MedicalEmployee MedicalEmployee, String appointmentDate) {
        this.Patient = Patient;
        this.MedicalEmployee = MedicalEmployee;
        this.appointmentDate = appointmentDate;
        this.appointmentID = generateID();
        list = new ArrayList<>();
    }
    public Appointment(MedicalEmployee MedicalEmployee, String appointmentDate) {
        this.MedicalEmployee = MedicalEmployee;
        this.appointmentDate = appointmentDate;
        this.appointmentID = generateID();
        list = new ArrayList<>();
    }
    public Appointment(String appointmentDate, int appointmentID,boolean available,String MedicalEmployee_SSN ) {
     this.appointmentDate=appointmentDate;
     this. appointmentID=appointmentID;
     this.available=available;
    this.MedicalEmployee_SSN=MedicalEmployee_SSN;
    }
    public Appointment(Boolean status, String date) {
        this.available = status;
        this.appointmentDate = date;
        list = new ArrayList<>();
    }
    public void setPatient(Patient Patient) {
        this.Patient = Patient;
    }
    public void setMedicalEmployee(MedicalEmployee MedicalEmployee) {
        this.MedicalEmployee = MedicalEmployee;
    }
    public void setAppointmentDate(String AppointmentDate) {
        this.appointmentDate = AppointmentDate;
    }
    public void setAppointmentID(int ID) {
        this.appointmentID = ID;
    }
    public void setAvailable(boolean Available) {
        this.available = Available;
    }
    public boolean getAvailable() {
        return available;
    }
    public int generateID() {
        return (int) (Math.random() * 100000);
    }
    public Patient getPatient() {
        return Patient;
    }
    public MedicalEmployee getMedicalEmployee() {
        return MedicalEmployee;
    }
    public String getAppointmentDate() {
        return appointmentDate;
    }
    public int getID() {
        return appointmentID;
    }

    @Override
    public void registers(Observer o) {
        list.add(o);
    }
    @Override
    public void unregisters(Observer o) {
        list.remove(o);
    }
    @Override
    public void notifyAllRegisters() {
        for (Observer o : list) {
            o.updates(availablity);
        }
    }
    public void setStatus(Boolean s) {
        availablity = s ? "New Appointments Available" : "Appointments Not Available";
        notifyAllRegisters();
    }
}
