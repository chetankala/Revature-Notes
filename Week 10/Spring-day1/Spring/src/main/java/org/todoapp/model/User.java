package org.todoapp.model;

// Import JPA annotation
import jakarta.persistence.*;

import javax.annotation.processing.Generated;

// Annotation to mark this class as a JPA entity (table)
@Entity
@Table(name="users") // rename to avoid keyword conflict with user namespace in SQL
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID values
    private Long id;

    private String username;
    private String password;
    private String role; // Role can be "user" or "admin" etc.

    // Default constructor for JPA
    public User() {}

    // Constructor with fields
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and setters for all fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
