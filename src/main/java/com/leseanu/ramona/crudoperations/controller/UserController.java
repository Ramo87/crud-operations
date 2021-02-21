package com.leseanu.ramona.crudoperations.controller;

import com.leseanu.ramona.crudoperations.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// The @RestController annotation creates the entry point in your application and an Object of type UserController in the application. In Spring those objects are called Beans.
// The @RequestMapping annotation creates the path under which all the other paths will be located
@RestController()
@RequestMapping("user")
public class UserController {

    // The @PostMapping creates a post rest point. Like the name says it only accepts post methods (maybe you should read about get and post methods)
    @PostMapping("/logIn")
    public String logIn(@RequestBody User user) {

        //TODO call the UserService logIn method with the user
        System.out.println(user);
        return "logged in";
    }
}
