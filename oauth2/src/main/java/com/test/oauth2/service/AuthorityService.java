package com.test.oauth2.service;

import com.test.oauth2.entity.Authority;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author yang
 * @Date 2019/5/15
 */
public interface AuthorityService {
    List<Authority> findAuthortiesByUserId(@Param("userId")Integer userId);
}
