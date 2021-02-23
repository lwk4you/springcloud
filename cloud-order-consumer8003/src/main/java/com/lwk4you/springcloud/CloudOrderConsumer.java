package com.lwk4you.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages ="com.lwk4you.springcloud.feign.service")
@MapperScan(basePackages = "com.lwk4you.springcloud.mapper")
public class CloudOrderConsumer {
    public static void main(String[] args) {
        SpringApplication.run(CloudOrderConsumer.class,args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
