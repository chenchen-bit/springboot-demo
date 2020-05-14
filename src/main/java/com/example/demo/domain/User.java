package com.example.demo.domain;


import lombok.Getter;
import lombok.Setter;

/**
 * 用户
 *
 * @author chenchen
 * @date 2020/05/13
 */
@Getter
@Setter
public class User {

    /**
     * id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String passWord;

}
