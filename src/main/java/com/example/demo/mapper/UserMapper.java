package com.example.demo.mapper;

import com.example.demo.domain.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * UserMapper
 *
 * @author chenchen
 * @date 2020/05/13
 */
public interface UserMapper {

    /**
     * 查询用户列表
     *
     * @return Page<User>
     */
    Page<User> selectUserList();

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

    /**
     * 新增用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    int insertUser(User user);

    /**
     * 练习一些SQL
     *
     * @param id id
     * @return 结果
     */
    Map selectLearn(Integer id);

    /**
     * 注解查询
     *
     * @param id id
     * @return 结果
     */
    @Select("select * from user where id = #{id}")
    User selectUser(@Param("id") Integer id);

    /**
     * 查询用户和文章
     *
     * @return 结果
     */
    List<User> selectUserAndPost();

}
