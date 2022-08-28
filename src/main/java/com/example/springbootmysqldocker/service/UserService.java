package com.example.springbootmysqldocker.service;

import com.example.springbootmysqldocker.model.User;
import com.example.springbootmysqldocker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());
        user.setEmailAddress(user.getEmailAddress());
        return userRepository.save(user);
    }

}
