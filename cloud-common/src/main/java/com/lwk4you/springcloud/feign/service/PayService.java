package com.lwk4you.springcloud.feign.service;

import com.lwk4you.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("cloud-payment-service")
@RequestMapping("pay")
public interface PayService {

    @GetMapping("getPayment/{id}")
    public Payment getPayMent(@PathVariable("id") Integer id);

}
