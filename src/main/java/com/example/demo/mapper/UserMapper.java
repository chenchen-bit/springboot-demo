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
     * @param userId userId
     * @return User
     */
    User getUserById(Integer userId);

}
