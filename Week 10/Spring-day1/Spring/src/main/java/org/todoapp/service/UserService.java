package org.todoapp.service;

import org.todoapp.model.User;
import org.todoapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Fetch all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Find a user by ID
    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    // Save a new or updated user
    public User saveUser(User user){
        // Implement password hashing using bcrypt
        return userRepository.save(user);
    }

    // Find a user by username
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    // Delete a user by ID
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
