package com.siemens.login.loginapplication.service;

import com.siemens.login.loginapplication.entity.User;
import com.siemens.login.loginapplication.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public void saveUser(User user) {

        userRepo.save(user);

    }
}
