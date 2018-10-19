package com.demo.springbootdemo.controller;


import com.demo.springbootdemo.beans.User;
import com.demo.springbootdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestCotroller {

    @Autowired
    TestService testService;

    @RequestMapping("/user")
    public List<User> user(){
        return testService.getUser();
    }
}
