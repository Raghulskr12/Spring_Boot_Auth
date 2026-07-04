package com.example.auth.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class HelloController {

    @GetMapping("/user")
    public ResponseEntity<String> sayHelloUser() {
        return ResponseEntity.ok("Hello! Anyone with a valid login token can view this route.");
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')") // Restricts route execution to ADMIN users only
    public ResponseEntity<String> sayHelloAdmin() {
        return ResponseEntity.ok("Access Granted: Welcome back, Administrator.");
    }
}