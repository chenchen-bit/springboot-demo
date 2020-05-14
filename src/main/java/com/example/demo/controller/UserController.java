package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController
 *
 * @author chenchen
 * @date 2020/05/13
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 用户列表
     *
     * @param model model
     * @return user/list
     */
    @RequestMapping("/list")
    public String list(Model model) {
        /*
          开始分页：
          pageNum：页码
          pageSize：每页显示数量
         */
        PageHelper.startPage(2, 10);
        Page<User> userList = userService.selectUserList();

        model.addAttribute("userList", userList.getResult());
        return "user/list";
    }

    /**
     * getUserById
     *
     * @param id id
     * @return User
     */
    @RequiresPermissions("user:get")
    @GetMapping("/getUserById")
    @ResponseBody
    public User getUserById(Integer id) {
        return userService.getUserById(id);
    }

    public String save(User user) {
        int rows = userService.insertUser(user);
        return rows + "";
    }

    @Autowired
    private UserService userService;

}
