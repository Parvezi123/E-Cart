package com.siemens.login.loginapplication.repositories;

import com.siemens.login.loginapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
