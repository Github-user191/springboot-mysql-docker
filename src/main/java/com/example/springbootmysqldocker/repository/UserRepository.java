package com.example.springbootmysqldocker.repository;

import com.example.springbootmysqldocker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
