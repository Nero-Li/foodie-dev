package com.lyming.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Collections;

/**
 * @Description :
 * @Author : Lyming
 * @Date: 2020-09-11 18:14
 */
@Configuration
public class CorsConfig {
    public CorsConfig() {
    }

    @Bean
    public CorsFilter corsFilter() {
        //1.添加跨域信息
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("http://localhost:8080");
        //2.设置是否发送cookie信息
        config.setAllowCredentials(true);
        //3.设置允许请求的方式(POST,GET...)
        config.addAllowedMethod("*");
        //4.设置允许请求的Header
        config.addAllowedHeader("*");
        //5.为url添加映射路径
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**",config);
        //6.返回重新定义好的corsSource
        return new CorsFilter(corsSource);

    }
}
