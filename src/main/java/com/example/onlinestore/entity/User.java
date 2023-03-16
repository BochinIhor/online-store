package com.example.onlinestore.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users", schema = "store_schema")
@Getter
@Setter
public class User {
    @Id
    private String username;
    private String password;
    private String role;

    private String email;
    private String phoneNumber;
    private String firstname;
    private String lastname;

    @Override
    public String toString() {
        return "User{" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
