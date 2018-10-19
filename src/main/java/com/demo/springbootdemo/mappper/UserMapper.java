package com.demo.springbootdemo.mappper;

import com.demo.springbootdemo.beans.User;

import java.util.List;

public interface UserMapper {
    List<User> queryAll();
}
