package com.test.oauth2.service;

import com.test.oauth2.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author yang
 * @Date 2019/5/15
 */

public interface UserService {
    User findByName(@Param("username")String username);
}
