package com.example.test2018131382;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.test2018131382.mapper")
public class Test2018131382Application {

    public static void main(String[] args) {
        SpringApplication.run(Test2018131382Application.class, args);
    }

}
