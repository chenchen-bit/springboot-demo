package com.example.demo.api.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Swagger注解使用
 *
 * @author chenchen
 * @date 2020/05/18
 */
@RestController
@RequestMapping("/api/index")
/*
  表示Swagger资源
  tags–表示说明
  value–也是说明，可以使用tags替代
 */
@Api(value = "Index接口", tags = {"Index接口"})
public class IndexController {

    @GetMapping("")
    /*
      表示http方法
      value用于方法描述
      notes用于提示内容
      tags可以重新分组（视情况而用）
     */
    @ApiOperation(value = "index方法", notes = "注意问题点")
    /*
      @ApiParam()表示对参数的添加元数据
      name–参数名
      value–参数说明
      required–是否必填
     */
    /*
      @ApiImplicitParams() 用于方法，包含多个 @ApiImplicitParam
      name–参数ming
      value–参数说明
      dataType–数据类型
      paramType–参数类型
      example–举例说明
     */
    @ApiImplicitParam(name = "name", value = "名称")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "字段名:邮箱"),
            @ApiImplicitParam(name = "real_name", value = "字段名:真实姓名"),
            @ApiImplicitParam(name = "company", value = "字段名:企业"),
            @ApiImplicitParam(name = "industry", value = "字段名:行业(值为一二级行业Id，以英文逗号间隔)"),
            @ApiImplicitParam(name = "position", value = "字段名:地址(值为省市区id,以英文逗号间隔)"),
    })
    public User index(@RequestBody @ApiParam(name = "用户") User user) {
        return userService.getUserById(1);
    }

    @Autowired
    private UserService userService;

}
