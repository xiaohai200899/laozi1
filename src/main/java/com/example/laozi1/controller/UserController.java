package com.example.laozi1.controller;

import com.example.laozi1.domain.User;
import com.example.laozi1.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserService userService;
    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    @RequestMapping(value = "/ceshi")
    public String queryUserById() {
        ///0000000000
        //aa23232
        //1111111111
        String a = userService.queryUserById();
       // logger.debug(a);
        return a;
    }
    @RequestMapping(value = "/queryAll")
    public List<User> queryAll() {
        List<User> list = userService.queryPersonList();


        String str = "";
        for (User personInfo : list) {
            str = str + ("personInfo.getId() = " + personInfo.getId() + ",personInfo.getName() = " + personInfo.getName());
        }
        System.out.println(str);
        return list;
    }


}
