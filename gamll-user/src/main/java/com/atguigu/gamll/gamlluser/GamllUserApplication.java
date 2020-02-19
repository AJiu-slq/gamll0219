package com.atguigu.gamll.gamlluser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gamll.gamlluser.mapper.UserMapper")
public class GamllUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamllUserApplication.class, args);
    }

}
