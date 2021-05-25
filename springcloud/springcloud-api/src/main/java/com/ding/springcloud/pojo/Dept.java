package com.ding.springcloud.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true) // 链式写法
public class Dept implements Serializable { //Dept 实体类， orm 对象关系映射

    private Long deptno; // 主键
    private String dname;
    private String db_source; // 这个数据存在哪个数据库 - 微服务，一个服务对应一个数据库，同一个信息可能存在不同的数据库

    public Dept(String dname) {
        this.dname = dname;
    }
/*
        链式写法：
        Dept dept = new Dept();
        dept.setDeptNo(11).setDname("ssss").setDb_source("001");
     */
}
