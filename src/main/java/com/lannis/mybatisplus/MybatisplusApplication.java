package com.lannis.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//Mapper扫描
@MapperScan(basePackages = {"com.lannis.mybatisplus.**.mapper*"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusApplication.class, args);
    }

}
