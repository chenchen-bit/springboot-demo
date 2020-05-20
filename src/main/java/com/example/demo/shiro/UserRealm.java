package com.example.demo.shiro;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * 自定义的Realm，处理登录、权限
 *
 * @author chenchen
 * @date 2020/05/12
 */
public class UserRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory.getLogger(UserRealm.class);

    /**
     * 授权
     *
     * @param principals principals
     * @return AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("Shiro->授权");

        Object username = SecurityUtils.getSubject().getPrincipal();

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //权限列表
        Set<String> perms = new HashSet<>();
        perms.add("user:show");
        perms.add("user:list");
        perms.add("user:admin");
        perms.add("user:get");

        //权限加入AuthorizationInfo认证对象
        info.setStringPermissions(perms);

        return info;
    }

    /**
     * 认证
     *
     * @param token token
     * @return AuthenticationInfo
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        logger.info("Shiro->认证");

        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        /*
          获取提交的用户名
         */
        //第一种方式
        String userName = upToken.getUsername();
        //第二种方式
//        String userName = (String) token.getPrincipal();

        /*
          获取提交的密码
         */
        String passWord = "";
        if (upToken.getPassword() != null) {
            passWord = new String(upToken.getPassword());
        }

        User user = userService.getUserByUserName(userName);
        if (null == user) {
            throw new UnknownAccountException();
        }
        if (!passWord.equals(user.getPassWord())) {
            throw new AuthenticationException();
        }

        return new SimpleAuthenticationInfo(user, passWord, getName());
    }

    @Autowired
    private UserService userService;

}