package com.lwk4you.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lwk4you.springcloud.entities.AccountTbl;
import com.lwk4you.springcloud.service.AccountService;
import com.lwk4you.springcloud.vo.CommonResult;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("account/decreaseMoney")
    @SentinelResource(value = "account/decreaseMoney",blockHandler = "fall_back")
    public CommonResult<Object> decreaseMoney(String userId,Integer money){

        log.info("调用账户余额减少接口");
        accountService.decreaseMoney(userId,money);
        log.info("调用账户余额减少接口暂停end");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new CommonResult<>("200","账户余额减少成功",null);
    }


    public CommonResult<Object> fall_back(String userId, Integer money, BlockException e) throws BlockException {
        log.info("调用账户余额服务降级"+"\t"+e.getStackTrace());
        accountService.save(new AccountTbl(null,"lwk3",111111));
        throw e;
        //return new CommonResult<>("300","服务降级成功",null);

    }




    }
