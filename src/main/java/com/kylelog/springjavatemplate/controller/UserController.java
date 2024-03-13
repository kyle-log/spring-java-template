package com.kylelog.springjavatemplate.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/signup")
    public String signUp(String email, String password) {
        return "Hello, " + email + "!";
    }

    @PostMapping("/login")
    public String login(String email, String password) {
        return "Hello, " + email + "!";
    }
}
