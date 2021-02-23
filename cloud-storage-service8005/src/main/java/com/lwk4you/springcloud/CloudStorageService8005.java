package com.lwk4you.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.lwk4you.springcloud.mapper")
@EnableDiscoveryClient
public class CloudStorageService8005 {

    public static void main(String[] args) {
        SpringApplication.run(CloudStorageService8005.class,args);
    }

}
