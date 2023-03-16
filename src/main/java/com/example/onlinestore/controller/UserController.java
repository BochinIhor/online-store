package com.example.onlinestore.controller;

import com.example.onlinestore.entity.User;
import com.example.onlinestore.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/store/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRolesAndUser() {
        userService.initRolesAndUser();
    }

    @GetMapping
    public ResponseEntity<List<User>> get() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> post(@RequestBody User user) {
        User newUser = userService.save(user);
        return new ResponseEntity<User>(newUser, HttpStatus.OK);
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> get(@PathVariable("username") String username) {
        User user = userService.findById(username);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PutMapping("/{username}")
    public ResponseEntity<User> put(@PathVariable("username") String username, @RequestBody User user) {
        userService.update(username, user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<String> delete(@PathVariable("username") String username) {
        userService.deleteUser(username);
        return new ResponseEntity<String>("User was deleted.", HttpStatus.OK);
    }
}
