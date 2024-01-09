package com.example.ejemindata2.controller;

import com.example.ejemindata2.entity.UserEntity;
import com.example.ejemindata2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/hello")
    public String hello(){
        return "hola mundo";
    }

    @GetMapping("/allUser")
    public List<UserEntity> getAllUser(){
        return userService.findAll();
    }

    @PostMapping("/saveUser")
    public String postUser(@RequestBody UserEntity user){
        return userService.created(user);
    }

    @GetMapping("/user/{id}")
    public Optional<UserEntity> findById(@PathVariable Long id){
        return userService.findById(id);
    }




}
