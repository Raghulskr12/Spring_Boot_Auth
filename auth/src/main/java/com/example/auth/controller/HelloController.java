package com.example.auth.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index()
    {
        return "Hello World";
    }
    @GetMapping("/sessionID")
    public String sessionID(HttpServletRequest request)
        {
        return "sessionID" + request.getSession().getId();
        }
}
