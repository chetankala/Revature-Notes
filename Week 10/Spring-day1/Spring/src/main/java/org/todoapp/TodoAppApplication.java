package org.todoapp;

// Import necessary Spring Boot classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation to mark this class as the entry point for Spring Boot
@SpringBootApplication(scanBasePackages = {"org.todoapp"})
public class TodoAppApplication {

    // Main method to run the Spring Boot application
    public static void main(String[] args){
        SpringApplication.run(TodoAppApplication.class, args); // Bootstraps the application
    }
}
