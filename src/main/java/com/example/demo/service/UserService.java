package com.example.demo.service;

import com.example.demo.domain.User;

/**
 * springboot-demo
 *
 * @author chenchen
 * @date 2020/05/13
 */
public interface UserService {

    /**
     * 根据id查询
     *
     * @param id id
     * @return User
     */
    User getUserById(Integer id);

    /**
     * 根据用户名查询用户
     *
     * @param userName 用户名
     * @return User
     */
    User getUserByUserName(String userName);

}
