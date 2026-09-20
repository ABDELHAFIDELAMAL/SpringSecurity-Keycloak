package com.example.securitykeycloak.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class TestController {

    @GetMapping(path = "/hello/user")
    public String sayHelloUser(){
        return "<h1> Hello USER </h1>";
    }

    @GetMapping(path = "/hello/admin")
    public String sayHelloAdmin(){
        return "<h1> Hello ADMIN </h1>";
    }
}
