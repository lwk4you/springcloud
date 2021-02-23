package com.lwk4you.springcloud.controller;

import com.lwk4you.springcloud.entities.OrderTbl;
import com.lwk4you.springcloud.entities.Payment;
import com.lwk4you.springcloud.feign.service.AccountService;
import com.lwk4you.springcloud.feign.service.PayService;
import com.lwk4you.springcloud.service.OrderService;
import com.lwk4you.springcloud.vo.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private PayService payService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private AccountService accountService;


//    @GetMapping("order/createOrder")
//    public String createOrder(){
//        String result=restTemplate.getForObject("http://cloud-payment-service"+"/pay/createPayment",String.class);
//        return result;
//
//    }

    @GetMapping("order/getOrder/{id}")
    public Payment getOrder(@PathVariable Integer id){
       return payService.getPayMent(id);
    }


    @PostMapping("order/createOrder")
    public CommonResult<OrderTbl> createOrder(@RequestBody OrderTbl orderTbl){

        orderService.save(orderTbl);
        accountService.decreaseMoney(orderTbl.getUserId(),orderTbl.getMoney());
        return new CommonResult<OrderTbl>("200","创建订单成功",orderTbl);
    }



}
