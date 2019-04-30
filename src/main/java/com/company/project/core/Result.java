package com.company.project.core;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * 统一API响应结果封装
 */
@Data
public class Result<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
