package com.ding.springcloud.controller;

import com.ding.springcloud.pojo.Dept;
import com.ding.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    // 理解： 消费者，不应该有service层
    // RestTemplate

    @Autowired
    private RestTemplate restTemplate; // 提供多种便捷访问远程http服务的方法, 简单的restful服务模版

    @Autowired
    DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.queryAll();
    }
}
