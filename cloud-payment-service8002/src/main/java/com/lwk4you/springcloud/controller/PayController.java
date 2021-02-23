package com.lwk4you.springcloud.controller;

import cn.hutool.core.util.RandomUtil;
import com.lwk4you.springcloud.entities.Payment;
import com.lwk4you.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
public class PayController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/pay/getPayment/{id}")
    public Payment getPayment(@PathVariable("id") Integer id){
        return paymentService.getById(id);
    }

    @GetMapping("/pay/createPayment")
    public String getPayment(){
        Payment payment=new Payment();
        String UUID=RandomUtil.randomUUID();
        payment.setPaymentNo(UUID);
        payment.setTime(new Date());
        paymentService.save(payment);

        log.info("新增支付成功");
        return "支付成功"+"\t"+"支付流水号为"+UUID;
    }
}
