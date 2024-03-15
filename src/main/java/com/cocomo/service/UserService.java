package com.cocomo.service;

public interface UserService {

    void signUp(String email, String password);
    void login(String email, String password);
}
