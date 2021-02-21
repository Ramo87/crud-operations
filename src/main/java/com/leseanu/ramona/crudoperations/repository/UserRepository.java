package com.leseanu.ramona.crudoperations.repository;

import com.leseanu.ramona.crudoperations.model.User;

public interface UserRepository {
    User findByUsername(String username);
    User createUser(User user);
}
