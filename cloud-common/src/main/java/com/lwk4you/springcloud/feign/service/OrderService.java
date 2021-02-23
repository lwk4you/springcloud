package com.lwk4you.springcloud.feign.service;

import com.lwk4you.springcloud.entities.OrderTbl;
import com.lwk4you.springcloud.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("cloud-order-consumer")
public interface OrderService {
    @PostMapping("order/createOrder")
    public CommonResult<OrderTbl> createOrder(@RequestBody OrderTbl orderTbl);
}
