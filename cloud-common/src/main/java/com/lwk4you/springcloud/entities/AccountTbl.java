package com.lwk4you.springcloud.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@TableName("account_tbl")
public class AccountTbl {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String userId;

    private Integer money;
}
