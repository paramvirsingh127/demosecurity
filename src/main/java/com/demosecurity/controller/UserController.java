package com.demosecurity.controller;

import com.demosecurity.model.User;
import com.demosecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public User create(@RequestBody User user){
        return this.service.addnewuser(user);
    }
    @GetMapping
    public List<User> get(){
        return this.service.getall();
    }
    @GetMapping("/{username}")
    public User singleuser(@PathVariable String username){
        return this.service.getsingleuser(username);
    }
}
