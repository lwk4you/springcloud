package com.lwk4you.springcloud.feign.service;

import com.lwk4you.springcloud.vo.CommonResult;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("cloud-storage-service")
public interface StorageService {

    @PostMapping("storage/decrease")
    public CommonResult<Object> decrease(@RequestParam("commodityCode") String commodityCode,
                                         @RequestParam("count") Integer count);
}
