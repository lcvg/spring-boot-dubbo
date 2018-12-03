package com.hcy.springbootdubboprovider2;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringbootDubboProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboProvider2Application.class, args);
    }
}
