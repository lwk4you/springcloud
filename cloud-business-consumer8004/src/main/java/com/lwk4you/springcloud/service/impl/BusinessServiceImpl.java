package com.lwk4you.springcloud.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.lwk4you.springcloud.entities.OrderTbl;
import com.lwk4you.springcloud.entities.StorageTbl;
import com.lwk4you.springcloud.feign.service.OrderService;
import com.lwk4you.springcloud.feign.service.StorageService;
import com.lwk4you.springcloud.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private OrderService orderService;

    @Autowired
    private StorageService storageService;

    @Override
    public String createOrder(Integer money, Integer count,String commodityCode) {

       final OrderTbl orderTbl = new OrderTbl();
       orderTbl.setUserId("lwk");
       orderTbl.setCommodityCode(commodityCode);
       orderTbl.setMoney(money);
        orderService.createOrder(orderTbl);

        storageService.decrease(commodityCode,count);

        return commodityCode;

    }
}
