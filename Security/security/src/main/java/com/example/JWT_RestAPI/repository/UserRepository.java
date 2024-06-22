package com.example.JWT_RestAPI.repository;

import com.example.JWT_RestAPI.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
