package com.example.spring_boot_advanced.service;

import com.example.springbootadvanced.model.User;
import com.example.springbootadvanced.repository.UserRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Cacheable("users")
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // other service methods
}
