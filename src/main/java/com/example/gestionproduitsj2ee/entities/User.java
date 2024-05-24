package com.example.gestionproduitsj2ee.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true)
    private String email;

    private String username,password;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "photo", nullable = true)
    private String profilePicture;

    public User(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "role='" + role + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }

}
