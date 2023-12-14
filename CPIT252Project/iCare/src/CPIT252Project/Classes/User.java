package CPIT252Project.Classes;
import DesignPattern.*;
import java.util.ArrayList;
public class User implements Subject {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String SSN;
    private int ID;
    private String gender;
    private String Email;
    private String city;
    private String age;
    private String password;
    private String status;
    private ArrayList<Observer> users;
    public String getStatus() {
        return status;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBirthDate(String age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSSN() {
        return SSN;
    }

    public int getID() {
        return ID;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return Email;
    }

    public String getCity() {
        return city;
    }

    public String getBirthDate() {
        return age;
    }

    public String getPassword() {
        return password;
    }
    public User(String firstName, String lastName, String phoneNumber, String SSN, String gender, String Email, String city, String birthDate, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.SSN = SSN;
        this.ID = generateID();
        this.gender = gender;
        this.Email = Email;
        this.city = city;
        this.age = birthDate;
        this.password = password;
        this.users = new ArrayList<>();
    }

    public User() {

    }
    @Override
    public String toString() {
        return "The User Information is: \n" + "firstName: " + firstName + ", lastName: " + lastName + ", phoneNumber: " + phoneNumber + ", SSN: " + SSN + ", ID: " + ID + ", gender: " + gender + ", Email: " + Email + ", city: " + city + ", Age: " + age + ", password: " + password;
    }

    public int generateID() {
        return (int) (Math.random() * 100000);
    }

    @Override
    public void registers(Observer o) {
        users.add(o);
    }

    @Override
    public void unregisters(Observer o) {
        users.remove(o);
    }

    @Override
    public void notifyAllRegisters() {
        for (Observer o : users) {
            o.updates(status);
        }
    }

    public void setStatus(Boolean s) {
        status = this.firstName + (s ? "Available" : "Not Available");
        notifyAllRegisters();
    }

}
