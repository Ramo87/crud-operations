package com.leseanu.ramona.crudoperations.service;

import com.leseanu.ramona.crudoperations.model.User;
import com.leseanu.ramona.crudoperations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String logInUser(User user) {
        //TODO check if the user exists and verify the password
        //TODO generate and return the token - it should be a unique String. Think on where to save it
        return "";
    }
}
