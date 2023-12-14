package CPIT252Project.Classes;
import java.util.ArrayList;
public class Admin extends User  {
    private String name;
    public static ArrayList<MedicalEmployee> MedicalEmployees = new ArrayList<MedicalEmployee>();
    public static ArrayList<Appointment> Appointments = new ArrayList<Appointment>();
    public static ArrayList<Patient> Patients = new ArrayList<Patient>();
    public Admin(String firstName, String lastName, String phoneNumber, String SSN, String gender, String Email, String city, String birthDate, String password) {
        super(firstName, lastName, phoneNumber, SSN, gender, Email, city, birthDate, password);
    }
    public Admin(String firstName) {
        name = firstName;
    }
    public static void addMedicalEmployee(MedicalEmployee MedicalEmployee) {
        MedicalEmployees.add(MedicalEmployee);
    }

    public static void addPatient(Patient Patient) {
        Patients.add(Patient);
    }

    public static void deletePatient(Patient Patient) {
        for (int i = 0; i < MedicalEmployees.size(); i++) {
            if (Patients.get(i).getID() == Patient.getID()) {
                Patients.remove(Patient);
            }
        }
    }

    public static void addApointment(Appointment Appointment) {
        Appointments.add(Appointment);
    }

    public static void deleteMedicalEmployee(MedicalEmployee MedicalEmployee) {
        for (int i = 0; i < MedicalEmployees.size(); i++) {
            if (MedicalEmployees.get(i).getID() == MedicalEmployee.getID()) {
                MedicalEmployees.remove(MedicalEmployee);
            }
        }
    }

    public static void deleteApointment(Appointment Apointment) {
        for (int i = 0; i < Appointments.size(); i++) {
            if (Appointments.get(i).getID() == Apointment.getID()) {
                Appointments.remove(Apointment);
            }
        }
    }

    public ArrayList<MedicalEmployee> getMedicalEmployees() {
        return MedicalEmployees;
    }

    public ArrayList<Appointment> getAppointments() {
        return Appointments;
    }

    public void setMedicalEmployees(ArrayList<MedicalEmployee> MedicalEmployees) {
        this.MedicalEmployees = MedicalEmployees;
    }

    public void setAppointments(ArrayList<Appointment> Appointments) {
        this.Appointments = Appointments;
    }

    public ArrayList<Patient> getPatients() {
        return Patients;
    }

    public void setPatients(ArrayList<Patient> Patients) {
        this.Patients = Patients;
    }

}
