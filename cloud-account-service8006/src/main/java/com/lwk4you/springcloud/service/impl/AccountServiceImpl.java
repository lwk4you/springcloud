package com.lwk4you.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwk4you.springcloud.entities.AccountTbl;
import com.lwk4you.springcloud.mapper.AccountMapper;
import com.lwk4you.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountTbl> implements AccountService{
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public void decreaseMoney(String userId, Integer money) {
        accountMapper.decreaseMoney(userId,money);
    }
}
