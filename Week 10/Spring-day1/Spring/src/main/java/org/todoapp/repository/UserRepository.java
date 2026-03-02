package org.todoapp.repository;

import org.todoapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom method to find a user by username
    User findByUsername(String username);

    // @Query for custom methods that cannot be derived automatically
}

