package com.cmp.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Administrator on 2019/8/17.
 */
@SpringBootApplication
@MapperScan("com.cmp.server.dao")
public class CmpApiApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(CmpApiApplication.class, args);
    }
}
