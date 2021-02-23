package com.lwk4you.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.lwk4you.springcloud.mapper")
@EnableDiscoveryClient
public class CloudPaymentService8001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentService8001.class,args);
    }



}
