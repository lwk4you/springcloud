package com.lwk4you.springcloud.feign.service;

import com.lwk4you.springcloud.vo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("cloud-account-service")
public interface AccountService {

    @PostMapping("account/decreaseMoney")
    public CommonResult<Object> decreaseMoney(@RequestParam("userId") String userId,
                                              @RequestParam("money") Integer money);

}
