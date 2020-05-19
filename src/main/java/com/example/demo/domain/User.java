package com.example.demo.domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 用户
 *
 * @author chenchen
 * @date 2020/05/13
 */
@Getter
@Setter
/*
  表示对类进行说明，用于参数用实体类接收
  value–表示对象名
  description–描述
 */
@ApiModel(value = "User", description = "用户表参数")
public class User {

    /**
     * id
     */
    /*
      value–字段说明
      name–重写属性名字
      dataType–重写属性类型
      required–是否必填
      example–举例说明
      hidden–隐藏
     */
    @ApiModelProperty(value = "id", required = true)
    private Integer id;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String passWord;

    /**
     * 文章列表
     */
    private List<Post> posts;

}
