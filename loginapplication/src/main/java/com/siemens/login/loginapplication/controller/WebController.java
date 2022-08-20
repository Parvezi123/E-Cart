package com.siemens.login.loginapplication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }

    @GetMapping("/login")
    public String login()
    {
        return "mylogin";

    }



}
