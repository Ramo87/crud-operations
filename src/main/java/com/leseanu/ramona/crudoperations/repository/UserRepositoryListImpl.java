package com.leseanu.ramona.crudoperations.repository;

import com.leseanu.ramona.crudoperations.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class UserRepositoryListImpl implements UserRepository {

    private List<User> users = new ArrayList<>();

    @Override
    public User findByUsername(String username) {
        //TODO implement the findByUsername method.
        return null;
    }

    @Override
    public User createUser(User user) {
        this.users.add(user);
        log.debug("User added!: " + user);
        return user;
    }
}
