package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * springboot-demo
 *
 * @author chenchen
 * @date 2020/05/13
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 根据id查询
     *
     * @param id id
     * @return User
     */
    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

    @Autowired
    private UserMapper userMapper;

}
