package com.example.laozi1.mapper;

import com.example.laozi1.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    String queryUserById();

    List<User> queryPersonList();
}
