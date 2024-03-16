package com.cocomo.repository;

import com.cocomo.model.User;

public interface UserRepository {

  User save(User user);

  User findByEmail(String email);
}
