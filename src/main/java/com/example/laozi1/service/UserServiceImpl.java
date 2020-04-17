package com.example.laozi1.service;

import com.example.laozi1.domain.User;
import com.example.laozi1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public String queryUserById() {

        return userMapper.queryUserById();
    }

    @Override
    public List<User> queryPersonList() {
        return userMapper.queryPersonList();
    }
}
