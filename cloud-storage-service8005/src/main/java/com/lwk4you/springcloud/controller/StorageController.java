package com.lwk4you.springcloud.controller;

import com.lwk4you.springcloud.service.StorageService;
import com.lwk4you.springcloud.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;

    @PostMapping("storage/decrease")
    public CommonResult<Object> decrease( String commodityCode,
                                         Integer count){

        storageService.decrease(commodityCode,count);

        return  new CommonResult<>("200","仓库减少成功",null);

    }
}
