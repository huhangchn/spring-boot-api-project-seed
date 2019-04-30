package com.company.project.service.impl;

import com.company.project.core.AbstractBaseService;
import com.company.project.entity.User;
import com.company.project.mapper.UserMapper;
import com.company.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractBaseService<User> implements UserService {

    @Autowired
    UserMapper testMapper;

    @Override
    public String test() {
        return testMapper.test();
    }
}
