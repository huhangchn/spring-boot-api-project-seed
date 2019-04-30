package com.company.project.core;

import com.company.project.result.ResultEnum;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
    private int code;
    private String message;

    public BusinessException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
