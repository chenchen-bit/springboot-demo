package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
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
     * @throws SQLException SQLException
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

    /**
     * 测试添加用户
     */
    @Test
    void save() {
        for (int i = 1; i < 100; i++) {
            User user = new User();
            user.setUserName("user" + i);
            user.setPassWord("123456");
            int rows = userService.insertUser(user);
            System.out.println("save user -> " + rows);
        }
    }

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;

}
