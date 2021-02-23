package com.lwk4you.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwk4you.springcloud.entities.StorageTbl;
import com.lwk4you.springcloud.mapper.StorageMapper;
import com.lwk4you.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, StorageTbl> implements StorageService {
    @Autowired
    private StorageMapper storageMapper;
    @Override
    public void decrease(String commodityCode, Integer count) {

        storageMapper.decrease(commodityCode,count);

    }
}
