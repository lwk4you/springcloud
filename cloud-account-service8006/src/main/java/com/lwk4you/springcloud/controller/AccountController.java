package com.lwk4you.springcloud.controller;

import com.lwk4you.springcloud.service.AccountService;
import com.lwk4you.springcloud.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("account/decreaseMoney")
    public CommonResult<Object> decreaseMoney(String userId,Integer money){
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountService.decreaseMoney(userId,money);
        return new CommonResult<>("200","账户余额减少成功",null);
    }


}
