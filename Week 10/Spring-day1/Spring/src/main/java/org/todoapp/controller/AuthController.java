package org.todoapp.controller;

import org.todoapp.model.User;
import org.todoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/auth")
public class AuthController{

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        if (userService.findByUsername(user.getUsername()) != null){
            return ResponseEntity.badRequest().body(null); //return 400 if user already exists
        }
        User newUser = userService.saveUser(user); // Save new user
        return ResponseEntity.ok(newUser); // Return 200 OK
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User loginDetails, HttpSession session){
        User user = userService.findByUsername(loginDetails.getUsername());
        if (user != null && user.getPassword().equals(loginDetails.getPassword()) && "user".equals(user.getRole())){
            session.setAttribute("user", user); // Save user in session
            return ResponseEntity.ok("Login successful");
        }
        return ResponseEntity.badRequest().body("Invalid credentials or role");
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logoutUser(HttpSession session){
        session.invalidate(); // Invalidate session
        return ResponseEntity.ok("Logout successful");
    }
}