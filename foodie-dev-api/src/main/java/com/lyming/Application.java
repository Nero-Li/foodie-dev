package com.lyming;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description : 启动类
 * @Author : Lyming
 * @Date: 2020-09-10 14:57
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lyming.mapper")
@ComponentScan(basePackages = {"com.lyming", "org.n3r.idworker"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
