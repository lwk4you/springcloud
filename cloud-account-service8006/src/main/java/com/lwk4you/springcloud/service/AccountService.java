package com.lwk4you.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lwk4you.springcloud.entities.AccountTbl;

public interface AccountService extends IService<AccountTbl> {
    void decreaseMoney(String userId, Integer money);
}
