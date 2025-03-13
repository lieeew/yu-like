package com.yuyuan.thumb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author pine
 */
@SpringBootApplication
@MapperScan("com.yuyuan.thumb.mapper")
public class ThumbBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThumbBackendApplication.class, args);
    }

}
