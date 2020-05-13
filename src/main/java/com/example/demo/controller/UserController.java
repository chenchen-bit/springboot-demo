package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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

    @RequiresPermissions("user:get")
    @GetMapping("/getUserById")
    public User getUserById(Integer userId) {
        return userService.getUserById(userId);
    }

    @Autowired
    private UserService userService;

}
