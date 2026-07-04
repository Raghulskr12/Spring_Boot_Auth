package com.example.auth.service;

import com.example.auth.domain.dto.AuthRequest;
import com.example.auth.domain.dto.AuthResponse;
import com.example.auth.domain.dto.RegisterRequest;

public interface AuthService {
    void register(RegisterRequest request);
    AuthResponse authenticate(AuthRequest request);
}