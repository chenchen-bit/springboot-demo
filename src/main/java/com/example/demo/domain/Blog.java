package com.example.demo.domain;

import lombok.Data;

/**
 * 用户博客
 *
 * @author chenchen
 * @date 2020/05/20
 */
@Data
public class Blog {

    /**
     * id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 博客名称
     */
    private String blogName;

}
