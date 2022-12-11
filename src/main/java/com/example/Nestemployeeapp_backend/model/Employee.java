package com.example.Nestemployeeapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int empCode;
    private String name;
    private String designation;
    private String email;
    private String phone;
    private String username;
    private String password;
    private String confirmPassword;

    public Employee() {
    }

    public Employee(int id, int empCode, String name, String designation, String email, String phone, String username, String password,String confirmPassword) {
        this.id = id;
        this.empCode = empCode;
        this.name = name;
        this.designation = designation;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.confirmPassword=confirmPassword;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

}
