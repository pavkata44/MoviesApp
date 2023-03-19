package com.example.movies.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class UserController {

private final UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers(){
        return userService.getAllUsers();

    }
    @PostMapping
    public void signUpUser(@RequestBody User user) throws IllegalAccessException {
        userService.addNewUser(user);
    }
}
