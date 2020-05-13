package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author chenchen
 * @date 2020/05/13
 */
@RestController
public class UserController {

    @GetMapping("/getUserById")
    public User getUserById(Integer userId) {
        return userMapper.getUserById(userId);
    }

    @Autowired
    private UserMapper userMapper;

}
