package com.example.demo.exception;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author chenchen
 * @date 2020/05/12
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleDefaultException(Exception e) {
        e.printStackTrace();
        return "->执行全局异常捕获...这是全局异常返回消息";
    }

    /**
     * 权限校验失败
     * 在ShiroConfig中配置的权限校验失败无法跳转，使用全局异常处理来跳转
     *
     * @param e e
     * @return 结果
     */
    @ExceptionHandler(AuthorizationException.class)
    public String handleAuthorizationException(AuthorizationException e) {
        System.out.println("GlobalExceptionHandler 没有权限->" + e.getMessage());
        return "你没有权限<_>";
    }

}