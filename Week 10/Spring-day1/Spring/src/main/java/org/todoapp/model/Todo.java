package org.todoapp.model;

// Import JPA annotations
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

// Annotation to mark this class as a JPA entity (table)
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID values
    private Long id;

    private String description;
    private boolean completed;
    private Long userId; // Link the todo to a specific user

    // Default constructor for JPA
    public Todo() {}

    // Constructor with fields
    public Todo(String description, boolean completed, Long userId){
        this.description = description;
        this.completed = completed;
        this.userId = userId;
    }

    // Getters and Setters for all fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
