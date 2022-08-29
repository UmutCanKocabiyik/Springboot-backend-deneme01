package com.example.springbootexamples01.repos;

import com.example.springbootexamples01.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {
}
