package CPIT252Project.Classes;
import DesignPattern.*;
public class MedicalEmployee extends User {
    private String status;
    private String Type;
    public MedicalEmployee(String status, String Type, String firstName, String lastName, String phoneNumber, String SSN, String gender, String Email, String city, String birthDate, String password) {
        super(firstName, lastName, phoneNumber, SSN, gender, Email, city, birthDate, password);
        this.status = status;
        this.Type = Type;
    }
    public MedicalEmployee() {
    }
    public void setType(String type) {
        this.Type = type;
    }
    public String getType() {
        return Type;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}
