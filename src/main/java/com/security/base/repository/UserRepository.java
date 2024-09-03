package com.security.base.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.base.entity.User;

public interface UserRepository extends JpaRepository<User,UUID>{
    User findByUsername(String username);
}
