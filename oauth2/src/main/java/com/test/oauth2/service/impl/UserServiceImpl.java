package com.test.oauth2.service.impl;

import com.test.oauth2.dao.UserMapper;
import com.test.oauth2.entity.User;
import com.test.oauth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author yang
 * @Date 2019/5/15
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String username) {
        return userMapper.findByUsername(username);
    }
}
