package com.vitaminncpp.chess.controllers;

import com.vitaminncpp.chess.model.User;
import com.vitaminncpp.chess.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class Test {
    private UserRepository repository;

    public Test(UserRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/test")
    public @ResponseBody String test() {
        return "<h1>this is test message</h1>";
    }

    @PostMapping("/api/user")
    public @ResponseBody User register(@RequestBody User user) {
        System.out.println(user);
        this.repository.save(user);
        return user;
    }

}
