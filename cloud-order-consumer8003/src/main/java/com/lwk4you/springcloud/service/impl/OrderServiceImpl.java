package com.lwk4you.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwk4you.springcloud.entities.OrderTbl;
import com.lwk4you.springcloud.mapper.OrderMapper;
import com.lwk4you.springcloud.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderTbl> implements OrderService {
}
