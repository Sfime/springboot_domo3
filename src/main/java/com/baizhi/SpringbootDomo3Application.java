package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class SpringbootDomo3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDomo3Application.class, args);
    }

}
