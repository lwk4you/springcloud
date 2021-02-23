package com.lwk4you.springcloud.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CommonResult<T> {

    private String code;

    private String msg;

    private T data;

    public CommonResult(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public CommonResult() {

    }
}
