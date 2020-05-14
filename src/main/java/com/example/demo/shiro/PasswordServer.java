package com.example.demo.shiro;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * PasswordServer Shiro密码加密
 *
 * @author chenchen
 * @date 2020/05/14
 */
public class PasswordServer {

    /**
     * Shiro密码加密
     *
     * @param userName 用户名
     * @param passWord 密码
     * @param salt     盐
     * @return String
     */
    public String encryptPassword(String userName, String passWord, String salt) {
        return new Md5Hash(userName + passWord + salt).toHex();
    }

    public static void main(String[] args) {
        String admin = new PasswordServer().encryptPassword("admin", "123456", "111111");
        String chen = new PasswordServer().encryptPassword("chen", "123456", "111111");
        System.out.println(admin);
        System.out.println(chen);
    }
}
