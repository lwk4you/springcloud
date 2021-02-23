package com.lwk4you.springcloud.controller;

import com.lwk4you.springcloud.service.BusinessService;
import com.lwk4you.springcloud.vo.CommonResult;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    @GetMapping("business/createOrder")
    @GlobalTransactional(rollbackFor = Exception.class)
    public CommonResult<String> createOrder(@RequestParam("money") Integer money ,
                                            @RequestParam("count") Integer count,
                                            @RequestParam("commodityCode") String commodityCode){

     businessService.createOrder(money,count,commodityCode);

     return new CommonResult<String>("200","下单成功",commodityCode);
    }

}
