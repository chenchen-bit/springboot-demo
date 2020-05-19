package com.example.demo.domain;

import lombok.Data;

/**
 * 文章
 *
 * @author chenchen
 * @date 2020/05/19
 */
@Data
public class Post {

    /**
     * id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

}
