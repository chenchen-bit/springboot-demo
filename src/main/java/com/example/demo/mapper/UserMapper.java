package com.example.demo.mapper;

import com.example.demo.domain.User;

/**
 * UserMapper
 *
 * @author chenchen
 * @date 2020/05/13
 */
public interface UserMapper {

    /**
     * 根据用户id查询用户
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
