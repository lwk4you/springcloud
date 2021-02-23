package com.lwk4you.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwk4you.springcloud.entities.Payment;
import com.lwk4you.springcloud.mapper.PaymentMapper;
import com.lwk4you.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}
