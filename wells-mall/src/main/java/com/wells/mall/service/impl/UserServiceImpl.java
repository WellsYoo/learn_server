package com.wells.mall.service.impl;

import com.wells.mall.model.dao.UserMapper;
import com.wells.mall.model.pojo.User;
import com.wells.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {
     @Autowired
    UserMapper userMapper;

    @Override
    public User getUser() {
        return userMapper.selectByPrimaryKey(1);
    }
}
