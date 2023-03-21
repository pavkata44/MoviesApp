package com.example.movies.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public  void addNewUser(User user) throws IllegalAccessException {
      Optional<User>  userByUsername = userRepository.findUserByUsername(user.getUsername());
        if(userByUsername.isPresent()) {
            throw new IllegalAccessException("Username already exists");
        }
        userRepository.save(user);

    }

    public void signIn(User user){
        Optional<User> userByUsername = userRepository.findUserByUsername(user.getUsername());
        Optional<User> userByPassword = userRepository.findUserByPassword((user.getPassword()));
        if(userByUsername.isPresent() && userByPassword.isPresent()){

        }
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userRepository.findAll());

    }
}
