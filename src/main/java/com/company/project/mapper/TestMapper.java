package com.company.project.mapper;

import com.company.project.core.BaseMapper;
import com.company.project.entity.User;
import org.apache.ibatis.annotations.Select;

public interface TestMapper extends BaseMapper<User> {

    @Select("select now()")
    String test();
}
