package com.pia.grupbes.pia_grupbes_backend.controller;


import com.pia.grupbes.pia_grupbes_backend.entity.User;
import com.pia.grupbes.pia_grupbes_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value ="/saveUser")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/getUsers")
    public User getUsers(@RequestParam String id) {
        return userService.getUserById(id);
    }
}
