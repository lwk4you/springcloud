package com.lwk4you.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwk4you.springcloud.entities.AccountTbl;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper extends BaseMapper<AccountTbl> {

    void decreaseMoney(@Param("userId") String userId, @Param("money") Integer money);
}
