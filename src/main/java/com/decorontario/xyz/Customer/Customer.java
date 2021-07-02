package com.decorontario.xyz.Customer;
import java.time.LocalDate;
public class Customer {
    private Long id;
    private String name;
    private String email;
    private String address;
    private String gender;
    private LocalDate dob;
    public Customer() {
    }
    public Customer(String name, String email, String address, String gender, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
    }
    public Customer(Long id, String name, String email, String address, String gender, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Address='" + address + '\'' +
                ", Gender='" + gender + '\'' +
                ", Date of birth=" + dob +
                '}';
    }
}
