package com.leseanu.ramona.crudoperations.service;

import com.leseanu.ramona.crudoperations.model.User;
import org.springframework.stereotype.Service;

public interface UserService {
    String logInUser(User user);
}
