package com.company.project.controller;

import com.company.project.result.Result;
import com.company.project.result.ResultUtil;
import com.company.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService testService;

    @GetMapping("hello")
    public Result hello(){
        String res = testService.test();
        return ResultUtil.success(res);
    }
}
