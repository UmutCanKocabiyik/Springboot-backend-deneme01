package com.example.springbootexamples01.api;

import com.example.springbootexamples01.entity.User;
import com.example.springbootexamples01.repos.UserRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostConstruct
    public void init(){
        User user = new User();
        user.setFirstName("Umi");
        user.setLastName("Kocabik");
        userRepo.save(user);
    }

    private UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping
    public ResponseEntity<User> newUser(@RequestBody User user) {
        return ResponseEntity.ok(userRepo.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userRepo.findAll());
    }
}
