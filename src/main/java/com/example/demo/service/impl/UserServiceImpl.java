package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * springboot-demo
 *
 * @author chenchen
 * @date 2020/05/13
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 查询用户列表
     *
     * @return Page<User>
     */
    @Override
    public Page<User> selectUserList() {
        return userMapper.selectUserList();
    }

    /**
     * 根据id查询
     *
     * @param id id
     * @return User
     */
    @Override
    public User getUserById(Integer id) {
        List<User> users = userMapper.selectUserAndPost();

        return userMapper.getUserById(id);
    }

    /**
     * 根据用户名查询用户
     *
     * @param userName 用户名
     * @return User
     */
    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

    /**
     * 新增用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Autowired
    private UserMapper userMapper;

}
