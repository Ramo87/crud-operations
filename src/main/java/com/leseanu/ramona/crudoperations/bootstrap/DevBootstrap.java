package com.leseanu.ramona.crudoperations.bootstrap;

import com.leseanu.ramona.crudoperations.model.User;
import com.leseanu.ramona.crudoperations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final UserRepository userRepository;

    @Autowired
    public DevBootstrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        init();
    }

    private void init() {
        User user = new User();
        user.setUsername("ramona");
        user.setPassword("ramona");

        this.userRepository.createUser(user);
    }
}
