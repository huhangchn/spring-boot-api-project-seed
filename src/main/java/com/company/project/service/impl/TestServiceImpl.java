package com.company.project.service.impl;

import com.company.project.core.AbstractBaseService;
import com.company.project.entity.User;
import com.company.project.mapper.TestMapper;
import com.company.project.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends AbstractBaseService<User> implements TestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public String test() {
        return testMapper.test();
    }
}
