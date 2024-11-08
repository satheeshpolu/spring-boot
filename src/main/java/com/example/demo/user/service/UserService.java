package com.example.demo.user.service;

import org.springframework.stereotype.Service;

import com.example.demo.user.model.User;

import java.util.List;

@Service
public class UserService {
    public List<User> getUsers() {
        return List.of(new User("User 1", 12), new User("User 2", 13));
    }
}
