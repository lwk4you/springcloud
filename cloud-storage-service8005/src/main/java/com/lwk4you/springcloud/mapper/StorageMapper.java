package com.lwk4you.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwk4you.springcloud.entities.StorageTbl;
import org.apache.ibatis.annotations.Param;

public interface StorageMapper extends BaseMapper<StorageTbl> {
    void decrease(@Param("commodityCode") String commodityCode, @Param("count") Integer count);
}
