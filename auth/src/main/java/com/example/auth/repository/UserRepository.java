package com.example.auth.repository;

import com.example.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Used during authentication to find the user trying to log in
    Optional<User> findByUsername(String username);

    // Used during registration to check for duplicate accounts
    boolean existsByUsername(String username);

    // Used during registration to ensure email uniqueness
    boolean existsByEmail(String email);
}