package com.ding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// 启动类
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient // 服务发现
public class DeptConfigProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConfigProvider_8001.class, args);
    }

}
