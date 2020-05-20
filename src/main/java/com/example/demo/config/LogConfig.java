package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * LogConfig 日志
 *
 * @author chenchen
 * @date 2020/05/20
 */
@Configuration
public class LogConfig {

    private static final Logger logger = LoggerFactory.getLogger(LogConfig.class);

    @Bean
    public void logMethod() {
        logger.info("------------logger print------------");
    }

}
