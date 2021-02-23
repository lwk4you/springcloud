package com.lwk4you.springcloud.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@TableName("payment")
public class Payment {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String paymentNo;

    private Date time;

}
