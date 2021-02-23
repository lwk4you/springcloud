package com.lwk4you.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.lwk4you.springcloud.mapper")
@EnableDiscoveryClient
@EnableFeignClients(basePackages ="com.lwk4you.springcloud.feign.service")
public class CloudBusinessService8004 {

    public static void main(String[] args) {
        SpringApplication.run(CloudBusinessService8004.class,args);
    }

}
