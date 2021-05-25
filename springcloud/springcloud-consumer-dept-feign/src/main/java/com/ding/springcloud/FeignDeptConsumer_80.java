package com.ding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

// Ribbon和Eureka整个以后，客户端可以直接调用，不用关心ip地址和端口号
@SpringBootApplication
@EnableEurekaClient
// 在微服务启动的时候就能去加载我们定义的Ribbon类
@EnableFeignClients(basePackages = {"com.ding.springcloud"})
public class FeignDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class, args);
    }
}


