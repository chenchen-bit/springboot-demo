package com.example.demo.test;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * LearnBeetl Beetl模板学习
 *
 * @author chenchen
 * @date 2020/05/21
 */
public class LearnBeetl {

    private static final Logger logger = LoggerFactory.getLogger(LearnBeetl.class);

    public static void main(String[] args) throws IOException {
        //初始化代码
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        //获取模板
        Template t = gt.getTemplate("hello,${name}");
        t.binding("name", "beetl");
        //渲染结果
        String str = t.render();
        logger.info(str);
    }

}
