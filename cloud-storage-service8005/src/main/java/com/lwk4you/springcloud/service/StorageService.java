package com.lwk4you.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lwk4you.springcloud.entities.StorageTbl;

public interface StorageService extends IService<StorageTbl> {
    void decrease(String commodityCode, Integer count);
}
