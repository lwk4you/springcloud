package com.lwk4you.springcloud.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@TableName("storage_tbl")
public class StorageTbl {
    @TableId(type= IdType.AUTO)
    private Integer id;

    private String commodityCode;

    private Integer count;
}
