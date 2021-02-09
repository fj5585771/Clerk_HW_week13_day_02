package com.codeclanstudent.clerk_hw.controllers;

import com.codeclanstudent.clerk_hw.models.File;
import com.codeclanstudent.clerk_hw.models.User;
import com.codeclanstudent.clerk_hw.repositories.FileRepository;
import com.codeclanstudent.clerk_hw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List <User> allFiles = userRepository.findAll();
        return new ResponseEntity<>(allFiles, HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable Long id){
        return new ResponseEntity<Optional<User>>(userRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity <User> createUser(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }
}
