package com.wells.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wells.mall.model.dao")
public class WellsMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(WellsMallApplication.class, args);
    }

}
