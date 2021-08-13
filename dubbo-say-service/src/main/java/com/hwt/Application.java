package com.hwt;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@EnableNacosConfig
@NacosPropertySource(dataId = "example",autoRefreshed = true,type = ConfigType.YAML)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
