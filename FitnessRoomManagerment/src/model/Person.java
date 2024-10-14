
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public abstract class Person {
    private String name,cmnd,phone,email;
    private LocalDate dob;
    private boolean gender;
    
    public Person(){}

    public Person(String name, String cmnd, String phone, String email, LocalDate dob, boolean gender) {
        this.name = name;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-20s|%-10s|%-15s|%-15s|%-15s|%-25s", getName(),isGender()?"Male":"Female",df.format(dob),getCmnd(),getPhone(),getEmail());
    }
    
    
}
