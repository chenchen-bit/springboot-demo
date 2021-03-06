package com.example.demo.service;

import com.example.demo.domain.User;
import com.github.pagehelper.Page;

/**
 * springboot-demo
 *
 * @author chenchen
 * @date 2020/05/13
 */
public interface UserService {

    /**
     * 查询用户列表
     *
     * @return Page<User>
     */
    Page<User> selectUserList();

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

    /**
     * 新增用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    int insertUser(User user);

}
