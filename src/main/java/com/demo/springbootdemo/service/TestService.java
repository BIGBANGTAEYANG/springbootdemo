package com.demo.springbootdemo.service;


import com.demo.springbootdemo.beans.User;
import com.demo.springbootdemo.mappper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    UserMapper userMapper;

    public List<User> getUser(){
        return userMapper.queryAll();
    }

}
