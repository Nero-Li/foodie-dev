package com.lyming.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Description : 测试启动
 * @Author : Lyming
 * @Date: 2020-09-10 14:58
 */
@RestController
@ApiIgnore
public class HelloController {

    @GetMapping("/hello")
    public Object hello(){
        return "Hello World";
    }
}
