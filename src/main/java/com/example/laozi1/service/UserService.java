package com.example.laozi1.service;

import com.example.laozi1.domain.User;

import java.util.List;

public interface UserService {
    String queryUserById();

    List<User> queryPersonList();
}
