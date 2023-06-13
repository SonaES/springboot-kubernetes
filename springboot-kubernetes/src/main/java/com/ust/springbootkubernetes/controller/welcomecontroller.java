package com.ust.springbootkubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class welcomecontroller {
    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome sona";
    }

}
