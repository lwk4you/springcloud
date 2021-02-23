package com.lwk4you.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.lwk4you.springcloud.mapper")
@EnableDiscoveryClient
public class CloudAccountService8006 {

    public static void main(String[] args) {
        SpringApplication.run(CloudAccountService8006.class,args);
    }

}
