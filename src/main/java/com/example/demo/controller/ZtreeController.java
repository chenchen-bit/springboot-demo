package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * zTree树插件
 *
 * @author chenchen
 * @date 2020/05/15
 */
@Controller
@RequestMapping("/ztree_demo")
public class ZtreeController {

    @RequestMapping("")
    public String demo() {
        return "ztree";
    }

}
