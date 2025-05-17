package com.udemy.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeEntity {


    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
