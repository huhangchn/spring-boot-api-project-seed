package com.company.project.controller;

import com.company.project.core.Result;
import com.company.project.core.ResultUtil;
import com.company.project.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("hello")
    public Result hello(){
        String res = testService.test();
        return ResultUtil.success(res);
    }
}
