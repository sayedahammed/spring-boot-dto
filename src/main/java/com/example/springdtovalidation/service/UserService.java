package com.example.springdtovalidation.service;

import com.example.springdtovalidation.model.User;
import com.example.springdtovalidation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
