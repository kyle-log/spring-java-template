package com.kylelog.springjavatemplate.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @PostMapping("/signup")
    public String signUp(String email, String password) {
        return "Hello, " + email + "!";
    }

    @PostMapping("/login")
    public String login(String email, String password, HttpServletRequest request) {
        request.setAttribute("email", email);
        return "Hello, " + email + "!";
    }
}
