package com.hwt;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableDubbo
public class Hello2Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Hello2Application.class).run(args);
    }
}
