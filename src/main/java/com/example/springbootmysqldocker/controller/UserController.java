package com.example.springbootmysqldocker.controller;

import com.example.springbootmysqldocker.model.User;
import com.example.springbootmysqldocker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody User user) {
        System.out.println("user: " +user);
        User u = userService.save(user);
        System.out.println("user: " +u);
        return new ResponseEntity<User>(u,HttpStatus.OK);
    }
}
