package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试类
 *
 * @author chenchen
 * @date 2020/05/13
 */
@SpringBootTest
class SpringbootDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 测试数据库连接
     *
     * @throws SQLException error
     */
    @Test
    void testMySQL() throws SQLException {
        //根据配置的数据库信息获取连接，执行语句
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");
        //打印结果
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String userName = resultSet.getString(2);
            String passWord = resultSet.getString(3);
            System.out.println("id->:" + id + " name->:" + userName + " password->:" + passWord);
        }
    }

    @Test
    void testUserMapper() {
        User user = userMapper.getUserById(1);
        System.out.println("User-> " + user.getId() + " " + user.getUserName() + " " + user.getPassWord());
    }

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserMapper userMapper;

}
