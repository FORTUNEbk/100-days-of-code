package com.example.usercrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.usercrud.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
