package com.company.project.result;


/**
 * Created by 廖师兄
 * 2017-05-15 00:22
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result Result = new Result();
        Result.setData(object);
        Result.setCode(0);
        Result.setMsg("成功");
        return Result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result Result = new Result();
        Result.setCode(code);
        Result.setMsg(msg);
        return Result;
    }

    public static Result error(ResultEnum resultEnum) {
        Result Result = new Result();
        Result.setCode(resultEnum.getCode());
        Result.setMsg(resultEnum.getMessage());
        return Result;
    }
    public static Result error(ResultEnum resultEnum, Object ... params) {
        Result Result = new Result();
        Result.setCode(resultEnum.getCode());
        Result.setMsg(String.format(resultEnum.getMessage(), params));
        return Result;
    }
}
