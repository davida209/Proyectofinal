package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class ModelUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String name;
    String phone;
    String email;
    String password;
    String status;
    String role;

    public ModelUser() {
    }

    public ModelUser(int id, String name, String phone, String email, String password, String status, String role) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.status = status;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
