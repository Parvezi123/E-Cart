package com.siemens.login.loginapplication.controller;

import com.siemens.login.loginapplication.entity.User;
import com.siemens.login.loginapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/register")
    public String register() {

        return "register";
    }

    @PostMapping("/saveuser")
    public String saveUser(@RequestParam("username") String username,@RequestParam("password") String password,
                           @RequestParam("email") String email,@RequestParam("mobile")String mobile) {

        userService.saveUser(new User(null,username,password,email,mobile));

        return "saveuser";

    }
    /*@PostMapping("/saveuser")
    public String saveUser(@RequestBody User user) {

        userService.saveUser(user);

        return "saveuser";

    }*/



}
